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
	c3a.ajouteInst(new C3aInstStop(result, ""));
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
    public C3aOperand visit(SaExpAdd node) throws Exception
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
    }
}
