package c3a;
import ts.*;
import sa.*;


public class Sa2c3a extends SaDepthFirstVisitor <C3aOperand> {
    private C3a c3a;
    int indentation;
    public C3a getC3a(){return this.c3a;}

    public Sa2c3a(SaNode root, Ts tableGlobale){
        c3a = new C3a();
        C3aTemp result = c3a.newTemp();
        C3aFunction fct = new C3aFunction(tableGlobale.getFct("main"));
        c3a.ajouteInst(new C3aInstCall(fct, result, ""));
        System.out.println(new C3aInstCall(fct, result, ""));
        c3a.ajouteInst(new C3aInstStop(result, ""));
        System.out.println(new C3aInstStop(result, ""));
        indentation = 0;
    }

    public void defaultIn(SaNode node)
    {
        for(int i = 0; i < indentation; i++){System.out.print(" ");}
        indentation++;
        System.out.println("<" + node.getClass().getSimpleName() + ">");
    }

    public void defaultOut(SaNode node)
    {
        indentation--;
        for(int i = 0; i < indentation; i++){System.out.print(" ");}
        System.out.println("</" + node.getClass().getSimpleName() + ">");
    }


    // EXP -> op2 EXP EXP
    /*public C3aOperand visit(SaExpAdd node) throws Exception
    {
	defaultIn(node);
	C3aOperand op1 = node.getOp1().accept(this);
	C3aOperand op2 = node.getOp2().accept(this);
	C3aOperand result = c3a.newTemp();

	c3a.ajouteInst(new C3aInstAdd(op1, op2, result, ""));
	defaultOut(node);
	return result;
    }
    @Override
    public C3aOperand visit(SaExpSub node) throws Exception {
        defaultIn(node);
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aOperand result = c3a.newTemp();
        c3a.ajouteInst(new C3aInstSub(op1, op2, result, ""));
        defaultOut(node);
        return result;
    }
    @Override
    public C3aOperand visit(SaExpMult node) throws Exception {
        defaultIn(node);
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aOperand result = c3a.newTemp();
        c3a.ajouteInst(new C3aInstMult(op1, op2, result, ""));
        defaultOut(node);
        return result;
    }

    // Méthode pour le traitement des noeuds SaExpDiv
    @Override
    public C3aOperand visit(SaExpDiv node) throws Exception {
        defaultIn(node);
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aOperand result = c3a.newTemp();
        c3a.ajouteInst(new C3aInstDiv(op1, op2, result, ""));
        defaultOut(node);
        return result;
    }

    @Override
    public C3aOperand visit(SaExpEqual node) throws Exception {
        defaultIn(node);
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aOperand result = c3a.newTemp();
        c3a.ajouteInst(new C3aInstJumpIfEqual(op1, op2, result, ""));
        defaultOut(node);
        return result;
    }

    // Méthode pour le traitement des noeuds SaExpLower
    @Override
    public C3aOperand visit(SaExpInf node) throws Exception {
        defaultIn(node);
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aOperand result = c3a.newTemp();
        c3a.ajouteInst(new C3aInstJumpIfLess(op1, op2, result, ""));
        defaultOut(node);
        return result;
    }
    // Méthode pour le traitement des noeuds SaExpOr
    @Override
    public C3aOperand visit(SaExpOr node) throws Exception {
        defaultIn(node);
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aOperand result = c3a.newTemp();
        C3aLabel label = c3a.newAutoLabel();
        C3aLabel endLabel = c3a.newAutoLabel();

        // Si op1 est vrai, saute à la fin (op1 est vrai ou op2 est vrai)
        c3a.ajouteInst(new C3aInstJumpIfNotEqual(op1, c3a.False, label, ""));
        // Si op2 est vrai, saute à la fin (op1 est faux ou op2 est vrai)
        c3a.ajouteInst(new C3aInstJumpIfNotEqual(op2, c3a.False, label, ""));
        // Si ni op1 ni op2 ne sont vrais, le résultat est faux
        c3a.ajouteInst(new C3aInstAffect(c3a.False, result, ""));
        // Saute à la fin
        c3a.ajouteInst(new C3aInstJump(endLabel, ""));
        // Étiquette pour les cas où op1 ou op2 sont vrais
        c3a.addLabelToNextInst(label);
        // Le résultat est vrai
        c3a.ajouteInst(new C3aInstAffect(c3a.True, result, ""));
        // Étiquette de fin
        c3a.addLabelToNextInst(endLabel);

        defaultOut(node);
        return result;
    }

    // Méthode pour le traitement des noeuds SaExpAnd
    @Override
    public C3aOperand visit(SaExpAnd node) throws Exception {
        defaultIn(node);
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aOperand result = c3a.newTemp();
        C3aLabel label = c3a.newAutoLabel();
        C3aLabel endLabel = c3a.newAutoLabel();

        // Si op1 est faux, saute à la fin (op1 est faux et op2 est faux)
        c3a.ajouteInst(new C3aInstJumpIfEqual(op1, c3a.False, label, ""));
        // Si op2 est faux, saute à la fin (op1 est vrai et op2 est faux)
        c3a.ajouteInst(new C3aInstJumpIfEqual(op2, c3a.False, label, ""));
        // Si ni op1 ni op2 ne sont faux, le résultat est vrai
        c3a.ajouteInst(new C3aInstAffect(c3a.True, result, ""));
        // Saute à la fin
        c3a.ajouteInst(new C3aInstJump(endLabel, ""));
        // Étiquette pour les cas où op1 et op2 sont faux
        c3a.addLabelToNextInst(label);
        // Le résultat est faux
        c3a.ajouteInst(new C3aInstAffect(c3a.False, result, ""));
        // Étiquette de fin
        c3a.addLabelToNextInst(endLabel);

        defaultOut(node);
        return result;
    }

    /// Méthode pour le traitement des noeuds SaExpNot
    @Override
    public C3aOperand visit(SaExpNot node) throws Exception {
        defaultIn(node);
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand result = c3a.newTemp();

        // Créer une étiquette pour la prochaine instruction
        C3aLabel nextLabel = c3a.newAutoLabel();

        // Si op1 est égal à False, alors le résultat est True ; sinon, le résultat est False
        c3a.ajouteInst(new C3aInstJumpIfEqual(op1, c3a.False, nextLabel, ""));
        c3a.ajouteInst(new C3aInstAffect(c3a.False, result, ""));
        C3aLabel endLabel = c3a.newAutoLabel();
        c3a.ajouteInst(new C3aInstJump(endLabel, ""));
        c3a.addLabelToNextInst(nextLabel);
        c3a.ajouteInst(new C3aInstAffect(c3a.True, result, ""));
        c3a.addLabelToNextInst(endLabel);

        defaultOut(node);
        return result;
    }*/

    // Méthode pour le traitement des noeuds SaExpLire
    @Override
    public C3aOperand visit(SaExpLire node) throws Exception {
        defaultIn(node);
        C3aOperand result = c3a.newTemp();
        c3a.ajouteInst(new C3aInstRead(result, ""));
        defaultOut(node);
        return result;
    }
/*
    // Méthode pour le traitement des noeuds SaExpEntier
    @Override
    public C3aOperand visit(SaExpInt node) throws Exception {
        defaultIn(node);
        C3aConstant result = new C3aConstant(node.getVal());
        defaultOut(node);
        return result;
    }*/
    // Méthode pour le traitement des noeuds SaExpAppel
    @Override
    public C3aOperand visit(SaAppel node) throws Exception {
        defaultIn(node);
        System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        SaLExp argsList = node.getArguments();

        if (argsList != null) {
            SaLExp argslist = node.getArguments();
            for (int i = 0; i < node.getArguments().length(); i++) {
                C3aOperand param = argslist.getTete().accept(this);
                c3a.ajouteInst(new C3aInstParam(param,""));
                if (argslist.getQueue() == null) {
                    break;
                }
                argslist = argslist.getQueue();
            }
        }
        C3aFunction function = new C3aFunction(node.tsItem);
        C3aTemp result = c3a.newTemp();
        c3a.ajouteInst(new C3aInstCall(function, result, ""));
        defaultOut(node);
        return result;
    }


    // Méthode pour le traitement des noeuds SaVarIndicee
    /*@Override
    public C3aOperand visit(SaVarIndicee node) throws Exception {
        defaultIn(node);
        C3aOperand indice = node.getIndice().accept(this);
        C3aVar var = (C3aVar) node.tsItem;
        C3aTemp result = c3a.newTemp();
        c3a.ajouteInst(new C3aInstAffect(var, indice, result, ""));
        defaultOut(node);
        return result;
    }*/

    // Méthode pour le traitement des noeuds SaExpVar
    /*@Override
    public C3aOperand visit(SaExpVar node) throws Exception {
        defaultIn(node);
        C3aOperand result = node.getVar().accept(this);
        defaultOut(node);
        return result;
    }*/
    @Override
    public C3aOperand visit(SaProg node) throws Exception{
        defaultIn(node);
        defaultOut(node);
        return super.visit(node);
    }
    @Override
    public C3aOperand visit(SaExpAdd node) throws Exception {
        defaultIn(node);
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aOperand result = c3a.newTemp();
        c3a.ajouteInst(new C3aInstAdd(op1, op2, result, ""));
        defaultOut(node);
        return result;
    }

    @Override
    public C3aOperand visit(SaExpSub node) throws Exception {
        defaultIn(node);
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aOperand result = c3a.newTemp();
        c3a.ajouteInst(new C3aInstSub(op1, op2, result, ""));
        defaultOut(node);
        return result;
    }
    @Override
    public C3aOperand visit(SaExpMult node) throws Exception {
        defaultIn(node);
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aOperand result = c3a.newTemp();
        c3a.ajouteInst(new C3aInstMult(op1, op2, result, ""));
        defaultOut(node);
        return result;
    }

    @Override
    public C3aOperand visit(SaExpDiv node) throws Exception {
        defaultIn(node);
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aOperand result = c3a.newTemp();
        c3a.ajouteInst(new C3aInstDiv(op1, op2, result, ""));
        defaultOut(node);
        return result;
    }

    @Override
    public C3aOperand visit(SaExpEqual node) throws Exception {
        defaultIn(node);
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aLabel label = c3a.newAutoLabel();
        C3aOperand result = c3a.newTemp();
        c3a.ajouteInst(new C3aInstAffect(new C3aConstant(1), result, ""));
        c3a.ajouteInst(new C3aInstJumpIfEqual(op1, op2, label, ""));
        c3a.ajouteInst(new C3aInstAffect(new C3aConstant(0), result, ""));
        c3a.addLabelToNextInst(label);
        defaultOut(node);
        return result;
    }

    @Override
    public C3aOperand visit(SaExpInf node) throws Exception {
        defaultIn(node);
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aLabel label = c3a.newAutoLabel();
        C3aOperand result = c3a.newTemp();
        c3a.ajouteInst(new C3aInstAffect(new C3aConstant(1), result, ""));
        c3a.ajouteInst(new C3aInstJumpIfLess(op1, op2, label, ""));
        c3a.ajouteInst(new C3aInstAffect(new C3aConstant(0), result, ""));
        c3a.addLabelToNextInst(label);
        defaultOut(node);
        return result;
    }

    @Override
    public C3aOperand visit(SaExpOr node) throws Exception {
        defaultIn(node);
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aOperand result = c3a.newTemp();
        C3aLabel label = c3a.newAutoLabel();
        C3aLabel endLabel = c3a.newAutoLabel();
        c3a.ajouteInst(new C3aInstJumpIfNotEqual(op1, c3a.False, endLabel, ""));
        c3a.ajouteInst(new C3aInstJumpIfNotEqual(op2, c3a.False, endLabel, ""));
        c3a.ajouteInst(new C3aInstAffect(c3a.False, result, ""));
        c3a.ajouteInst(new C3aInstJump(label, ""));
        c3a.addLabelToNextInst(endLabel);
        c3a.ajouteInst(new C3aInstAffect(c3a.True, result, ""));
        c3a.addLabelToNextInst(label);
        defaultOut(node);
        return result;
    }

    @Override
    public C3aOperand visit(SaExpAnd node) throws Exception {
        defaultIn(node);
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aOperand result = c3a.newTemp();
        C3aLabel label = c3a.newAutoLabel();
        C3aLabel endLabel = c3a.newAutoLabel();
        c3a.ajouteInst(new C3aInstJumpIfEqual(op1, c3a.False, endLabel, ""));
        c3a.ajouteInst(new C3aInstJumpIfEqual(op2, c3a.False, endLabel, ""));
        c3a.ajouteInst(new C3aInstAffect(c3a.True, result, ""));
        c3a.ajouteInst(new C3aInstJump(label, ""));
        c3a.addLabelToNextInst(endLabel);
        c3a.ajouteInst(new C3aInstAffect(c3a.False, result, ""));
        c3a.addLabelToNextInst(label);
        defaultOut(node);
        return result;
    }

    @Override
    public C3aOperand visit(SaExpNot node) throws Exception {
        defaultIn(node);
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand result = c3a.newTemp();
        C3aLabel nextLabel = c3a.newAutoLabel();
        c3a.ajouteInst(new C3aInstAffect(c3a.True, result, ""));
        c3a.ajouteInst(new C3aInstJumpIfEqual(op1, c3a.False, nextLabel, ""));
        c3a.ajouteInst(new C3aInstAffect(c3a.False, result, ""));
        c3a.addLabelToNextInst(nextLabel);
        defaultOut(node);
        return result;
    }

    // Méthode pour le traitement des noeuds SaExpEntier
    @Override
    public C3aOperand visit(SaExpInt node) throws Exception {
        defaultIn(node);
        C3aConstant result = new C3aConstant(node.getVal());
        defaultOut(node);
        return result;
    }

    @Override
    public C3aOperand visit(SaExpVar node) throws Exception {
        defaultIn(node);
        C3aOperand result = node.getVar().accept(this);
        defaultOut(node);
        return result;
    }
    @Override
    public C3aOperand visit(SaExpVrai node) throws Exception {
        defaultIn(node);
        C3aOperand result = new C3aConstant(1);
        defaultOut(node);
        return result;
    }

    @Override
    public C3aOperand visit(SaExpFaux node) throws Exception {
        defaultIn(node);
        C3aOperand result = new C3aConstant(0);
        defaultOut(node);
        return result;
    }

    @Override
    public C3aOperand visit(SaExpAppel node) throws Exception {
        defaultIn(node);
        C3aOperand result = node.getVal().accept(this);
        defaultOut(node);
        return result;
    }

    @Override
    public C3aOperand visit(SaInstEcriture node) throws Exception {
        defaultIn(node);
        C3aOperand op1 = node.getArg().accept(this);
        c3a.ajouteInst(new C3aInstWrite(op1, ""));
        defaultOut(node);
        return op1;
    }

    @Override
    public C3aOperand visit(SaInstTantQue node) throws Exception {
        defaultIn(node);
        C3aLabel testLabel = c3a.newAutoLabel();
        C3aLabel endLabel = c3a.newAutoLabel();
        c3a.addLabelToNextInst(testLabel);
        C3aOperand test = node.getTest().accept(this);
        c3a.ajouteInst(new C3aInstJumpIfEqual(test, c3a.False, endLabel, ""));
        node.getFaire().accept(this);
        c3a.ajouteInst(new C3aInstJump(testLabel, ""));
        c3a.addLabelToNextInst(endLabel);
        defaultOut(node);
        return test;
    }
    @Override
    public C3aOperand visit(SaLInst node) throws Exception {
        defaultIn(node);
        defaultOut(node);
        return super.visit(node);
    }
    @Override
    public C3aOperand visit(SaInstBloc node) throws Exception {
        defaultIn(node);
        defaultOut(node);
        return super.visit(node);
    }

    @Override
    public C3aOperand visit(SaInstAffect node) throws Exception {
        defaultIn(node);
        C3aOperand var = node.getLhs().accept(this);
        C3aOperand exp = node.getRhs().accept(this);
        c3a.ajouteInst(new C3aInstAffect(exp, var, ""));
        defaultOut(node);
        return var;
    }

    @Override
    public C3aOperand visit(SaInstSi node) throws Exception {
        defaultIn(node);
        C3aLabel elseLabel = c3a.newAutoLabel();
        C3aLabel endLabel = c3a.newAutoLabel();
        C3aOperand condition = node.getTest().accept(this);
        C3aOperand result = null;
        if (node.getAlors() != null) {
            if (node.getSinon() == null) {

                c3a.ajouteInst(new C3aInstJumpIfEqual(condition, new C3aConstant(0),endLabel,""));
                result = node.getAlors().accept(this);
                c3a.addLabelToNextInst(endLabel);
            }
            else {
                c3a.ajouteInst(new C3aInstJumpIfEqual(condition, new C3aConstant(0),elseLabel,""));
                node.getAlors().accept(this);
                c3a.ajouteInst(new C3aInstJump(endLabel,""));
                c3a.addLabelToNextInst(elseLabel);
                result = node.getSinon().accept(this);
                c3a.addLabelToNextInst(endLabel);

            }
        }
        defaultOut(node);
        return result;
    }

    @Override
    public C3aOperand visit(SaInstRetour node) throws Exception {
        defaultIn(node);
        C3aOperand returnValue = node.getVal().accept(this);
        c3a.ajouteInst(new C3aInstReturn(returnValue, ""));
        c3a.ajouteInst(new C3aInstFEnd(""));
        defaultOut(node);
        return returnValue;
    }
    @Override
    public C3aOperand visit(SaDecFonc node) throws Exception {
        defaultIn(node);
        // Crée une nouvelle fonction C3a pour la fonction déclarée
        //C3aFunction function = new C3aFunction(node.tsItem);
        // Ajoute une instruction de début de fonction à C3a
        c3a.ajouteInst(new C3aInstFBegin(node.tsItem, "entree fonction"));
        // Visite les instructions du corps de la fonction
        C3aOperand result = node.getCorps().accept(this);
        // Ajoute une instruction de fin de fonction à C3a
        c3a.ajouteInst(new C3aInstFEnd(""));
        defaultOut(node);
        return result;
    }

    @Override
    public C3aOperand visit(SaLDecFonc node) throws Exception {
        defaultIn(node);
        defaultOut(node);
        return super.visit(node);
    }
    @Override
    public C3aOperand visit(SaDecVar node) throws Exception {
        defaultIn(node);
        defaultOut(node);
        return super.visit(node);
    }
    @Override
    public C3aOperand visit(SaLDecVar node) throws Exception {
        defaultIn(node);
        defaultOut(node);
        return super.visit(node);
    }

    @Override
    public C3aOperand visit(SaVarSimple node) throws Exception {
        defaultIn(node);
        // Récupérer l'élément dans la table des symboles
        TsItemVar tsItemVar = node.tsItem;
        C3aOperand result = new C3aVar(tsItemVar, null);
        defaultOut(node);
        return result;
    }
    @Override
    public C3aOperand visit(SaDecTab node) throws Exception {
        defaultIn(node);
        defaultOut(node);
        return super.visit(node);
    }
    @Override
    public C3aOperand visit(SaExp node) throws Exception {
        defaultIn(node);
        defaultOut(node);
        return super.visit(node);
    }

}

