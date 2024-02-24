package ts;
import sa.*;
import util.Error;

public class Sa2ts extends SaDepthFirstVisitor <Void> {
    enum Context {
	LOCAL,
	GLOBAL,
	PARAM
    }
    
    private Ts tableGlobale;
    private Ts tableLocaleCourante;
    private Context context;
    
    public Ts getTableGlobale(){return this.tableGlobale;}

    public Sa2ts()
    {
	tableGlobale = new Ts();
	tableLocaleCourante = null;
	context = Context.GLOBAL;
    }

    public void defaultIn(SaNode node)
    {
	//	System.out.println("<" + node.getClass().getSimpleName() + ">");
    }

    public void defaultOut(SaNode node)
    {
	//	System.out.println("</" + node.getClass().getSimpleName() + ">");
    }
    @Override
    public Void visit(SaDecVar node) throws Exception {
        defaultIn(node);
        // Global
        if(context==Context.GLOBAL) {
            if (tableGlobale.getVar(node.getNom()) != null)
                throw new ErrorException(Error.TS, "Variable global existe déja");
            else {
                tableGlobale.addVar(node.getNom(), node.getType());
                node.setTsItem(tableGlobale.getVar(node.getNom()));
            }
        }

        // parameter
        if(context==Context.PARAM){
            if(null!=tableLocaleCourante.variables.get(node.getNom())){
                throw new ErrorException(Error.TS,"parametre a le même nom q'une variable existe déja") ;
            }
            else {
                tableLocaleCourante.addParam(node.getNom(), node.getType());
                node.setTsItem(tableLocaleCourante.getVar(node.getNom()));
            }
        }
        // variable local
        if (context==Context.LOCAL) {
            if (tableLocaleCourante.variables.get(node.getNom()) != null)
                throw new ErrorException(Error.TS, "variable local existe déja");
            tableLocaleCourante.addVar(node.getNom(), node.getType());
            node.setTsItem(tableLocaleCourante.getVar(node.getNom()));
        }
        defaultOut(node);
        return null;
    }

    @Override
    public Void visit(SaDecFonc node) throws Exception {
        //defaultIn(node);
        defaultIn(node);
        //context=Context.GLOBAL;
        context = Context.GLOBAL;

        //if(node.getNom().equals("main") && node.getParametres()!=null && node.getParametres().length()!=0)
        //throw new ErrorException(Error.TS, "la fonction main ne peut pas contenur d'arguments");
        if (node.getNom().equals("main") && node.getParametres() != null ){
            throw new ErrorException(Error.TS, "main can't have parametres");
        }

        //if (tableGlobale.getFct(node.getNom()) != null)
        //    throw new ErrorException(Error.TS, "fonction déja déclarée");
        if (tableGlobale.getFct(node.getNom()) != null){
            throw new ErrorException(Error.TS, "function already defined");
        }

        //tableLocaleCourante= new Ts();
        tableLocaleCourante = new Ts();

        //if(node.getParametres()==null) {
        //   tableGlobale.addFct(node.getNom(), node.getTypeRetour(), 0,tableLocaleCourante, node);
        //}
        if (node.getParametres() == null){
            tableGlobale.addFct(node.getNom(),node.getTypeRetour(),0,tableLocaleCourante,node);
        }
        //else
        //{
        //   tableGlobale.addFct(node.getNom(), node.getTypeRetour(), node.getParametres().length(), tableLocaleCourante, node);
        //}
        else {
            tableGlobale.addFct(node.getNom(),node.getTypeRetour(),node.getParametres().length(),tableLocaleCourante,node);
        }
        node.tsItem=tableGlobale.getFct(node.getNom());
        //test error 1


        //if(node.getVariable() != null) {
        //  context=Context.LOCAL;

        //node.getVariable().accept(this);
        // }
        if (node.getVariable() != null){
            context=Context.LOCAL;
            node.getVariable().accept(this);
        }

        //if(node.getParametres() != null) {
        //  context=Context.PARAM;
        //  node.getParametres().accept(this);
        //}
        if (node.getParametres() != null){
            context=Context.PARAM;
            node.getParametres().accept(this);
        }
        //if(node.getCorps()!=null) {
        //    context=Context.LOCAL;
        //    node.getCorps().accept(this);
        //}
        if (node.getCorps() != null){
            context=Context.LOCAL;
            node.getCorps().accept(this);
        }
        //System.out.println();
        //context=Context.GLOBAL;
        //System.out.println("tableGlobale0000000000000000000000000000000000000000000000000000000000000000000000");
        //defaultOut(node);
        defaultOut(node);
        //return null;*/

        return null;

    }
    @Override
    public Void visit(SaDecTab node) throws Exception {
        defaultIn(node);

        if (tableGlobale.getVar(node.getNom()) != null) {
            throw new ErrorException(Error.TS, "Array already defined in global scope");
        }
        if (tableGlobale.getVar(node.getNom()).getTaille() == 0){
            throw new ErrorException(Error.TS,"array size must be more than 0");
        }
        if (tableGlobale.getVar(node.getNom()).getType() == null){
            throw new ErrorException(Error.TS,"array must have type");
        }
        tableGlobale.addTab(node.getNom(),node.getType(),node.getTaille());
        //node.tsItem=tableGlobale.getVar(node.getNom());

        /*else if (context == Context.LOCAL) {
            if (tableLocaleCourante.getVar(node.getNom()) != null) {
                throw new ErrorException(Error.TS, "Array already defined in local scope");
            }if (tableGlobale.getVar(node.getNom()).getTaille() == 0){
                throw new ErrorException(Error.TS,"array size must be more than 0");
            }
            if (tableGlobale.getVar(node.getNom()).getType() == null){
                throw new ErrorException(Error.TS,"array must have type");
            }
            tableLocaleCourante.addTab(node.getNom(),node.getType(),node.getTaille());
            //node.tsItem=tableLocaleCourante.getVar(node.getNom());
        }*/
        defaultOut(node);
        return null;
    }

    @Override
    public Void visit(SaAppel node) throws Exception {
        defaultIn(node);
        TsItemFct itemFct = tableGlobale.getFct(node.getNom());
        System.out.println(tableGlobale.fonctions);
        if (itemFct == null) {
            throw new ErrorException(Error.TS, "Function " + node.getNom() + " not defined");
        }
        System.out.println(tableGlobale.fonctions);
        if (node.getArguments() == null){
            if (itemFct.getNbArgs() != 0) throw new ErrorException(Error.TS, "Function" + node.getNom() + "need arguments");
            System.out.println(tableGlobale.fonctions);
        }
        System.out.println(node.getArguments()+"test ");
        /*if (node.getArguments() != null){
            System.out.println(node.getArguments()+"test ");
            if (itemFct.getNbArgs() == 0) throw new ErrorException(Error.TS, "Function" + node.getNom() + "does not need arguments");
            if (itemFct.getNbArgs() != node.getArguments().length()) {
                throw new ErrorException(Error.TS, "Function " + node.getNom() + " called with wrong number of arguments");
            }
        }*/
        node.getArguments().accept(this);
        //node.getArguments().getQueue().accept(this);
        defaultOut(node);
        //System.out.println(tableGlobale.fonctions);
        return null;
    }

    @Override
    public Void visit(SaVarSimple node) throws Exception {
        defaultIn(node);
        TsItemVar tsItemVar =  tableGlobale.getVar(node.getNom());
        if (context == Context.GLOBAL){
            if (tsItemVar == null){
                throw new ErrorException(Error.TS, "Variable " + node.getNom() + " not defined");
            }else {
                if (tsItemVar.getTaille() != 1){
                    throw new ErrorException(Error.TS,"the variables"+node.getNom()+" cannot be indexed");
                }
            }
        }
        if (context == Context.LOCAL){
            if (tableLocaleCourante.getVar(node.getNom()) == null){
                if (tsItemVar == null){
                    throw new ErrorException(Error.TS, "Variable " + node.getNom() + " not defined");
                }else {
                    if (tsItemVar.getTaille() != 1){
                        throw new ErrorException(Error.TS,"the variables"+node.getNom()+" cannot be indexed");
                    }
                }
            }else {
                if (tableLocaleCourante.getVar(node.getNom()).getTaille() != 1){
                    throw new ErrorException(Error.TS,"the variables"+node.getNom()+" cannot be indexed");
                }
            }
        }

        //node.tsItem = (TsItemVarSimple) tableLocaleCourante.getVar(node.getNom());
        /*if (context == Context.LOCAL){
            if (tableLocaleCourante.getVar(node.getNom()) == null && tableGlobale.getVar(node.getNom()) == null){
                throw new ErrorException(Error.TS, "Variable " + node.getNom() + " not defined");
            }else{
                if (tableGlobale.getVar(node.getNom()).getTaille() >1){
                    throw new ErrorException(Error.TS,"the variables"+node.getNom()+" cannot be indexed");
                }
                if (tableLocaleCourante.getVar(node.getNom()).getTaille() >1){
                    throw new ErrorException(Error.TS,"the variables"+node.getNom()+" cannot be indexed");
                }
            }
        }*/

        //node.tsItem = (TsItemVarSimple) tableGlobale.getVar(node.getNom());
        //node.tsItem = (TsItemVarSimple) tableLocaleCourante.getVar(node.getNom());

        return null;
    }

    @Override
    public Void visit(SaVarIndicee node) throws Exception {
        defaultIn(node);
        TsItemVar itemVar = tableLocaleCourante.getVar(node.getNom());
        if (itemVar == null) {
            throw new ErrorException(Error.TS, "Array " + node.getNom() + " not defined");
        }
        node.getIndice().accept(this);
        defaultOut(node);
        return null;
    }

}
