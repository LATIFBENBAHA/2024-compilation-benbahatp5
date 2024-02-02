package sa;
import postfix.analysis.*;
import postfix.node.*;
import postfix.analysis.DepthFirstAdapter;
import ts.TsItemVar;
import util.Type;

public class Sc2sa extends DepthFirstAdapter
{
    private SaNode returnValue;
    private Type returnType;
    private SaProg saRoot = null;

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
	    System.out.println("<" + node.getClass().getSimpleName() + ">");
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
	    System.out.println("</" + node.getClass().getSimpleName() + ">");
    }
    
    public SaProg getRoot()
    {
	return this.saRoot;
    }
    //programme = {programme} listedecvar listedecfonc ;

    @Override
    public void caseAProgrammeProgramme(AProgrammeProgramme node) {
        inAProgrammeProgramme(node);
        node.getListedecvar().apply(this);
        SaLDecVar variables = (SaLDecVar) this.returnValue;
        node.getListedecfonc().apply(this);
        SaLDecFonc fonctions = (SaLDecFonc) this.returnValue;
        this.returnValue= new SaProg(variables,fonctions);
        outAProgrammeProgramme(node);
    }

    // exp = {ou} exp ou exp1
    @Override
    public void caseAOuExp(AOuExp node) {
        inAOuExp(node);
        node.getExp().apply(this);
        SaExp op1 = (SaExp) this.returnValue;
        node.getExp1().apply(this);
        SaExp op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpOr(op1, op2); // Assuming SaExpOr represents logical OR
        outAOuExp(node);
    }
    @Override
    public void caseAExp1Exp(AExp1Exp node) {
        inAExp1Exp(node);
        node.getExp1().apply(this);
        outAExp1Exp(node);
    }
    // exp1 = {et} exp1 et exp2
    @Override
    public void caseAEtExp1(AEtExp1 node) {
        inAEtExp1(node);
        node.getExp1().apply(this);
        SaExp op1 = (SaExp) this.returnValue;
        node.getExp2().apply(this);
        SaExp op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpAnd(op1, op2); // Assuming SaExpAnd represents logical AND
        outAEtExp1(node);
    }
    @Override
    public void caseAExp2Exp1(AExp2Exp1 node) {
        inAExp2Exp1(node);
        node.getExp2().apply(this);
        outAExp2Exp1(node);
    }

    // exp2 = {equal} exp2 equal exp3
    @Override
    public void caseAEqualExp2(AEqualExp2 node) {
        inAEqualExp2(node);
        node.getExp2().apply(this);
        SaExp op1 = (SaExp) this.returnValue;
        node.getExp3().apply(this);
        SaExp op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpEqual(op1, op2); // Assuming SaExpEqual represents equality
        outAEqualExp2(node);
    }

    // exp2 = {inf} exp2 less exp3
    @Override
    public void caseAInfExp2(AInfExp2 node) {
        inAInfExp2(node);
        node.getExp2().apply(this);
        SaExp op1 = (SaExp) this.returnValue;
        node.getExp3().apply(this);
        SaExp op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpInf(op1, op2); // Assuming SaExpLess represents less than
        outAInfExp2(node);
    }

    // exp2 = {exp3} exp3
    @Override
    public void caseAExp3Exp2(AExp3Exp2 node) {
        inAExp3Exp2(node);
        node.getExp3().apply(this);
        outAExp3Exp2(node);
    }

    // exp3 = {plus} exp3 plus exp4
    @Override
    public void caseAPlusExp3(APlusExp3 node) {
        inAPlusExp3(node);
        node.getExp3().apply(this);
        SaExp op1 = (SaExp) this.returnValue;
        node.getExp4().apply(this);
        SaExp op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpAdd(op1, op2); // Assuming SaExpAdd represents addition
        outAPlusExp3(node);
    }

    // exp3 = {sub} exp3 minus exp4
    @Override
    public void caseASubExp3(ASubExp3 node) {
        inASubExp3(node);
        node.getExp3().apply(this);
        SaExp op1 = (SaExp) this.returnValue;
        node.getExp4().apply(this);
        SaExp op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpSub(op1, op2); // Assuming SaExpSub represents subtraction
        outASubExp3(node);
    }

    // exp3 = {exp4} exp4
    @Override
    public void caseAExp4Exp3(AExp4Exp3 node) {
        inAExp4Exp3(node);
        node.getExp4().apply(this);
        outAExp4Exp3(node);
    }

    // exp4 = {mult} exp4 mult exp5
    @Override
    public void caseAMultExp4(AMultExp4 node) {
        inAMultExp4(node);
        node.getExp4().apply(this);
        SaExp op1 = (SaExp) this.returnValue;
        node.getExp5().apply(this);
        SaExp op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpMult(op1, op2); // Assuming SaExpMult represents multiplication
        outAMultExp4(node);
    }

    // exp4 = {div} exp4 div exp5
    @Override
    public void caseADivExp4(ADivExp4 node) {
        inADivExp4(node);
        node.getExp4().apply(this);
        SaExp op1 = (SaExp) this.returnValue;
        node.getExp5().apply(this);
        SaExp op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpDiv(op1, op2); // Assuming SaExpDiv represents division
        outADivExp4(node);
    }

    // exp4 = {exp5} exp5
    @Override
    public void caseAExp5Exp4(AExp5Exp4 node) {
        inAExp5Exp4(node);
        node.getExp5().apply(this);
        outAExp5Exp4(node);

    }

    // exp5 = {non} non exp5
    @Override
    public void caseANonExp5(ANonExp5 node) {
        inANonExp5(node);
        node.getExp5().apply(this);
        SaExp op = (SaExp) this.returnValue;
        this.returnValue = new SaExpNot(op); // Assuming SaExpNot represents logical NOT
        outANonExp5(node);
    }

    // exp5 = {exp6} exp6
    @Override
    public void caseAExp6Exp5(AExp6Exp5 node) {
        inAExp6Exp5(node);
        node.getExp6().apply(this);
        outAExp6Exp5(node);

    }
    //{parentese} l_par exp r_par
    @Override
    public void caseAParenteseExp6(AParenteseExp6 node) {
        inAParenteseExp6(node);
        node.getExp().apply(this);
        outAParenteseExp6(node);
    }
    //{number} number
    @Override
    public void caseANumberExp6(ANumberExp6 node) {
        inANumberExp6(node);
        this.returnValue = new SaExpInt(Integer.parseInt(node.getNumber().getText()));
        outANumberExp6(node);
        // Crée un nœud SaExpInt avec la valeur du nombre
    }
    //{vrai} vrai
    @Override
    public void caseAVraiExp6(AVraiExp6 node) {
        inAVraiExp6(node);
        node.getVrai().apply(this);
        outAVraiExp6(node);
    }
    //{faux} faux
    @Override
    public void caseAFauxExp6(AFauxExp6 node) {

        inAFauxExp6(node);
        node.getFaux().apply(this);
        outAFauxExp6(node);
    }
    //{variable} var
    @Override
    public void caseAVariableExp6(AVariableExp6 node) {
        inAVariableExp6(node);
        node.getVar().apply(this);
        outAVariableExp6(node);
    }
    //{appelfonc} appelfonc
    @Override
    public void caseAAppelfoncExp6(AAppelfoncExp6 node) {
        inAAppelfoncExp6(node);
        node.getAppelfonc().apply(this);
        outAAppelfoncExp6(node);
    }
    //{lire} lire l_par r_par
    @Override
    public void caseALireExp6(ALireExp6 node) {
        inALireExp6(node);
        node.getLire().apply(this);
        outALireExp6(node);
    }
    //appelfonc = {appelfonction} identif l_par listeexp r_par ;
    @Override
    public void caseAAppelfonctionAppelfonc(AAppelfonctionAppelfonc node) {
        inAAppelfonctionAppelfonc(node);
        node.getIdentif().apply(this);
        String functionName = new String(String.valueOf(this.returnValue));
        node.getListeexp().apply(this);
        SaLExp arguments = (SaLExp) this.returnValue;
        this.returnValue = new SaAppel(functionName, arguments);
        outAAppelfonctionAppelfonc(node);
    }
    //instr = {afectation} var equal exp point_virgule |
    @Override
    public void caseAAfectationInstr(AAfectationInstr node) {
        inAAfectationInstr(node);
        node.getVar().apply(this);
        SaVar variable = (SaVar) this.returnValue;
        node.getExp().apply(this);
        SaExp expression = (SaExp) this.returnValue;
        this.returnValue = new SaInstAffect(variable, expression);
        outAAfectationInstr(node);
    }
    //    {tantque} tantque exp faire instrbloc |
    @Override
    public void caseATantqueInstr(ATantqueInstr node) {
        inATantqueInstr(node);
        node.getExp().apply(this);
        SaExp condition = (SaExp) this.returnValue;
        node.getInstrbloc().apply(this);
        SaInstBloc bloc = (SaInstBloc) this.returnValue;
        this.returnValue = new SaInstTantQue(condition, bloc);
        outATantqueInstr(node);
    }
    //    {fonction} identif l_par listeexp r_par point_virgule|
    @Override
    public void caseAFonctionInstr(AFonctionInstr node) {
        inAFonctionInstr(node);
        node.getIdentif().apply(this);
        String functionName = new String(String.valueOf(this.returnValue));
        node.getListeexp().apply(this);
        SaLExp arguments = (SaLExp) this.returnValue;
        this.returnValue = new SaAppel(functionName,arguments);
        outAFonctionInstr(node);
    }
    //    {si} si exp alors instrbloc |
    @Override
    public void caseASiInstr(ASiInstr node) {
        inASiInstr(node);
        node.getExp().apply(this);
        SaExp condition = (SaExp) this.returnValue;
        node.getInstrbloc().apply(this);
        SaInstBloc thenBranch = (SaInstBloc) this.returnValue;
        this.returnValue = new SaInstSi(condition, thenBranch,null);
        outASiInstr(node);
        // Assurez-vous d'adapter le constructeur SaInstSi en fonction de votre AST
    }
    //    {sinon} si exp alors thenbranch sinon elsebranch |
    @Override
    public void caseASinonInstr(ASinonInstr node) {
        inASinonInstr(node);
        node.getExp().apply(this);
        SaExp condition = (SaExp) this.returnValue;
        node.getThenbranch().apply(this);
        SaInstBloc thenBranch = (SaInstBloc) this.returnValue;
        node.getElsebranch().apply(this);
        SaInstBloc elseBranch = (SaInstBloc) this.returnValue;
        this.returnValue = new SaInstSi(condition, thenBranch, elseBranch);
        outASinonInstr(node);
    }
    //    {retour} retour exp point_virgule |
    @Override
    public void caseARetourInstr(ARetourInstr node) {
        inARetourInstr(node);
        node.getExp().apply(this);
        SaExp expression = (SaExp) this.returnValue;
        this.returnValue = new SaInstRetour(expression);
        outARetourInstr(node);
    }
    //    {ecrire} ecrire l_par exp r_par point_virgule;
    @Override
    public void caseAEcrireInstr(AEcrireInstr node) {
        inAEcrireInstr(node);
        node.getExp().apply(this);
        SaExp expression = (SaExp) this.returnValue;
        this.returnValue = new SaInstEcriture(expression);
        outAEcrireInstr(node);
    }
    //instrbloc ={listedinstr} l_accolade listeinstr r_accolade ;
    @Override
    public void caseAListedinstrInstrbloc(AListedinstrInstrbloc node) {
        inAListedinstrInstrbloc(node);
        node.getListeinstr().apply(this);
        SaLInst listeInstr = (SaLInst) this.returnValue;
        this.returnValue = new SaInstBloc(listeInstr);
        outAListedinstrInstrbloc(node);
    }
    //thenbranch = {thenbranch} instrbloc;
    @Override
    public void caseAThenbranchThenbranch(AThenbranchThenbranch node) {
        inAThenbranchThenbranch(node);
        node.getInstrbloc().apply(this);
        outAThenbranchThenbranch(node);
    }
    //elsebranch = {elsebranch} instrbloc;
    @Override
    public void caseAElsebranchElsebranch(AElsebranchElsebranch node) {

        inAElsebranchElsebranch(node);
        node.getInstrbloc().apply(this);
        outAElsebranchElsebranch(node);
    }
    //listeinstr = {listdeinstr} instr listeinstr
    @Override
    public void caseAListdeinstrListeinstr(AListdeinstrListeinstr node) {
        inAListdeinstrListeinstr(node);
        node.getInstr().apply(this);
        SaInst tete = (SaInst) this.returnValue;
        node.getListeinstr().apply(this);
        SaLInst queue = (SaLInst) this.returnValue;
        this.returnValue = new SaLInst(tete,queue);
        outAListdeinstrListeinstr(node);

    }
    //listeinstr = {epsilon};
    @Override
    public void caseAEpsilonListeinstr(AEpsilonListeinstr node) {
        inAEpsilonListeinstr(node);
        this.returnValue = new SaLInst(null,null);
        outAEpsilonListeinstr(node);
    }
    //listeexp = {listedeexpression} exp listeexpbis |
    @Override
    public void caseAListedeexpressionListeexp(AListedeexpressionListeexp node) {
        inAListedeexpressionListeexp(node);
        node.getExp().apply(this);
        SaExp tete = (SaExp) this.returnValue;
        node.getListeexpbis().apply(this);
        SaLExp queue = (SaLExp) this.returnValue;
        this.returnValue = new SaLExp(tete,queue);
        outAListedeexpressionListeexp(node);
    }
    //listexp = {epsilon};
    @Override
    public void caseAEpsilonListeexp(AEpsilonListeexp node) {
        inAEpsilonListeexp(node);
        this.returnValue= new SaLExp(null,null);
        outAEpsilonListeexp(node);
    }
    //listeexpbis = {restelistedeexpression} virgule exp listeexpbis |
    @Override
    public void caseARestelistedeexpressionListeexpbis(ARestelistedeexpressionListeexpbis node) {
        inARestelistedeexpressionListeexpbis(node);
        node.getExp().apply(this);
        SaExp expression = (SaExp) this.returnValue;
        node.getListeexpbis().apply(this);
        SaLExp listeExp = (SaLExp) this.returnValue;
        this.returnValue = new SaLExp(expression, listeExp);
        outARestelistedeexpressionListeexpbis(node);
    }
    //listeexpbis = {epsilon};
    @Override
    public void caseAEpsilonListeexpbis(AEpsilonListeexpbis node) {
        inAEpsilonListeexpbis(node);
        this.returnValue = new SaLExp(null,null);
        outAEpsilonListeexpbis(node);
        // Si la liste est vide, retournez une liste vide
    }
    //var = {identif } identif |
    @Override
    public void caseAIdentifVar(AIdentifVar node) {
        inAIdentifVar(node);
        node.getIdentif().apply(this);
        String variableName = new String(String.valueOf(this.returnValue));
        this.returnValue = new SaVarSimple(variableName);
        outAIdentifVar(node);
    }
    //var= {varindexee} identif brackopen exp brackclose ;
    @Override
    public void caseAVarindexeeVar(AVarindexeeVar node) {
        inAVarindexeeVar(node);
        node.getIdentif().apply(this);
        String variableName = new String(String.valueOf(this.returnValue));
        node.getExp().apply(this);
        SaExp index = (SaExp) this.returnValue;
        this.returnValue = new SaVarIndicee(variableName, index);
        outAVarindexeeVar(node);
    }
    //type = {entier} entier
    @Override
    public void caseAEntierType(AEntierType node) {
        inAEntierType(node);
        node.getEntier().apply(this);
        outAEntierType(node);
    }
    //type = {bool} bool ;
    @Override
    public void caseABoolType(ABoolType node) {
        inABoolType(node);
        node.getBool().apply(this);
        outABoolType(node);
    }
    //bool = {vrai} vrai |
    @Override
    public void caseAVraiBool(AVraiBool node) {
        inAVraiBool(node);
        node.getVrai().apply(this);
        outAVraiBool(node);
    }
    //bool = {faux} faux ;
    @Override
    public void caseAFauxBool(AFauxBool node) {
        inAFauxBool(node);
        node.getFaux().apply(this);
        outAFauxBool(node);
    }
    //decvar = {declarationvar} type identif |
    @Override
    public void caseADeclarationvarDecvar(ADeclarationvarDecvar node) {
        inADeclarationvarDecvar(node);
        node.getType().apply(this);
        Type type = this.returnType;
        node.getIdentif().apply(this);
        String variableName = new String(String.valueOf(this.returnValue));
        System.out.println(variableName);
        this.returnValue = new SaDecVarSimple(variableName, type);
        outADeclarationvarDecvar(node);
    }
    //decvar = {declarationvarindexee} type identif brackopen number brackclose ;
    @Override
    public void caseADeclarationvarindexeeDecvar(ADeclarationvarindexeeDecvar node) {
        inADeclarationvarindexeeDecvar(node);
        node.getType().apply(this);
        Type type = this.returnType;
        node.getIdentif().apply(this);
        String variableName = new String(String.valueOf(this.returnValue));
        node.getNumber().apply(this);
        int taille = Integer.parseInt(new String(String.valueOf(this.returnValue)));
        this.returnValue = new SaDecTab(variableName, type, taille);
        outADeclarationvarindexeeDecvar(node);
    }
    //decfonc = {declarationfonction} opttype identif l_par parametre r_par listedecvar instrbloc  ;
    @Override
    public void caseADeclarationfonctionDecfonc(ADeclarationfonctionDecfonc node) {
        inADeclarationfonctionDecfonc(node);
        node.getOpttype().apply(this);
        Type returnType = this.returnType;
        node.getIdentif().apply(this);
        String functionName = new String(String.valueOf(this.returnValue));
        node.getParametre().apply(this);
        SaLDecVar listeParametres = (SaLDecVar) this.returnValue;
        node.getParametre().apply(this);
        SaLDecVar listeVariables = (SaLDecVar) this.returnValue;
        node.getInstrbloc().apply(this);
        SaInstBloc bloc = (SaInstBloc) this.returnValue;
        this.returnValue = new SaDecFonc(functionName,returnType,listeParametres,listeVariables,bloc);
        outADeclarationfonctionDecfonc(node);
    }
    //opttype = {type} type |
    @Override
    public void caseATypeOpttype(ATypeOpttype node) {
        inATypeOpttype(node);
        node.getType().apply(this);
        outATypeOpttype(node);
    }
    //optype = {epsilon};
    @Override
    public void caseAEpsilonOpttype(AEpsilonOpttype node) {
        inAEpsilonOpttype(node);
        this.returnType = null;
        outAEpsilonOpttype(node);
    }
    //parametre={parametre} listedecvar ;

    @Override
    public void caseAParametreParametre(AParametreParametre node) {
        inAParametreParametre(node);
        node.getListedecvar().apply(this);
        outAParametreParametre(node);
    }

    //variablefonc={variablefonc} listedecvar ;

    @Override
    public void caseAVariablefoncVariablefonc(AVariablefoncVariablefonc node) {
        inAVariablefoncVariablefonc(node);
        node.getListedecvar().apply(this);
        outAVariablefoncVariablefonc(node);
    }

    //listedecvar = {listedecvar} decvar listedecvarbis |

    @Override
    public void caseAListedecvarListedecvar(AListedecvarListedecvar node) {
        inAListedecvarListedecvar(node);
        node.getDecvar().apply(this);
        SaDecVar tete = (SaDecVar) this.returnValue;
        node.getListedecvarbis().apply(this);
        SaLDecVar queue = (SaLDecVar) this.returnValue;
        this.returnValue = new SaLDecVar(tete,queue);
        outAListedecvarListedecvar(node);
    }
    //listedecvar = {epsilon};

    @Override
    public void caseAEpsilonListedecvar(AEpsilonListedecvar node) {
        inAEpsilonListedecvar(node);
        this.returnValue = new SaLDecVar(null,null);
        outAEpsilonListedecvar(node);
    }
    //listedecvarbis = {apreslistedecvar} virgule decvar listedecvarbis |

    @Override
    public void caseAApreslistedecvarListedecvarbis(AApreslistedecvarListedecvarbis node) {
        inAApreslistedecvarListedecvarbis(node);
        node.getDecvar().apply(this);
        SaDecVar tete = (SaDecVar) this.returnValue;
        node.getListedecvarbis().apply(this);
        SaLDecVar queue = (SaLDecVar) this.returnValue;
        this.returnValue= new SaLDecVar(tete,queue);
        outAApreslistedecvarListedecvarbis(node);
    }
    //listedecvarbis = {epsilon};

    @Override
    public void caseAEpsilonListedecvarbis(AEpsilonListedecvarbis node) {
        inAEpsilonListedecvarbis(node);
        this.returnValue= new SaLDecVar(null,null);
        outAEpsilonListedecvarbis(node);
    }
    //listedecfonc = {listedecfonc} decfonc listedecfonc |

    @Override
    public void caseAListedecfoncListedecfonc(AListedecfoncListedecfonc node) {
        inAListedecfoncListedecfonc(node);
        node.getDecfonc().apply(this);
        SaDecFonc tete = (SaDecFonc) this.returnValue;
        node.getListedecfonc().apply(this);
        SaLDecFonc queue = (SaLDecFonc) this.returnValue;
        this.returnValue = new SaLDecFonc(tete,queue);
        outAListedecfoncListedecfonc(node);

    }
    // listedecfonc = {epsilon};

    @Override
    public void caseAEpsilonListedecfonc(AEpsilonListedecfonc node) {
        inAEpsilonListedecfonc(node);
        this.returnValue=new SaLDecFonc(null,null);
        outAEpsilonListedecfonc(node);
    }

}

