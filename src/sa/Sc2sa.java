package sa;
import postfix.analysis.*;
import postfix.node.*;
import postfix.analysis.DepthFirstAdapter;
import util.Type;

public class Sc2sa extends DepthFirstAdapter
{
    private SaNode returnValue;
    private Type returnType;
    private SaProg saRoot = null;

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
	//System.out.println("<" + node.getClass().getSimpleName() + ">");
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
	//System.out.println("</" + node.getClass().getSimpleName() + ">");
    }
    
    public SaProg getRoot()
    {
	return this.saRoot;
    }


    // exp3 = {plus} exp3 plus exp4 
    /*    @Override
    public void caseAPlusExp3(APlusExp3 node)
    {
	SaExp op1 = null;
	SaExp op2 = null;
        inAPlusExp3(node);
	node.getExp3().apply(this);
	op1 = (SaExp) this.returnValue;
	node.getExp4().apply(this);
	op2 = (SaExp) this.returnValue;
	this.returnValue = new SaExpAdd(op1, op2);
        outAPlusExp3(node);
	}*/

    // exp = {ou} exp ou exp1
    @Override
    public void caseAOuExp(AOuExp node) {
        SaExp op1 = null;
        SaExp op2 = null;
        inAOuExp(node);
        node.getExp().apply(this);
        op1 = (SaExp) this.returnValue;
        node.getExp1().apply(this);
        op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpOr(op1, op2); // Assuming SaExpOr represents logical OR
        outAOuExp(node);
    }

    // exp1 = {et} exp1 et exp2
    @Override
    public void caseAEtExp1(AEtExp1 node) {
        SaExp op1 = null;
        SaExp op2 = null;
        inAEtExp1(node);
        node.getExp1().apply(this);
        op1 = (SaExp) this.returnValue;
        node.getExp2().apply(this);
        op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpAnd(op1, op2); // Assuming SaExpAnd represents logical AND
        outAEtExp1(node);
    }

    // exp2 = {equal} exp2 equal exp3
    @Override
    public void caseAEqualExp2(AEqualExp2 node) {
        SaExp op1 = null;
        SaExp op2 = null;
        inAEqualExp2(node);
        node.getExp2().apply(this);
        op1 = (SaExp) this.returnValue;
        node.getExp3().apply(this);
        op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpEqual(op1, op2); // Assuming SaExpEqual represents equality
        outAEqualExp2(node);
    }

    // exp2 = {less} exp2 less exp3
    @Override
    public void caseAInfExp2(AInfExp2 node) {
        SaExp op1 = null;
        SaExp op2 = null;
        inAInfExp2(node);
        node.getExp2().apply(this);
        op1 = (SaExp) this.returnValue;
        node.getExp3().apply(this);
        op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpInf(op1, op2); // Assuming SaExpLess represents less than
        outAInfExp2(node);
    }

    // exp2 = {exp3} exp3
    @Override
    public void caseAExp3Exp2(AExp3Exp2 node) {
        node.getExp3().apply(this);
        // Assuming no modification is needed here as exp2 is a pass-through to exp3
        outAExp3Exp2(node);
    }

    // exp3 = {plus} exp3 plus exp4
    @Override
    public void caseAPlusExp3(APlusExp3 node) {
        SaExp op1 = null;
        SaExp op2 = null;
        inAPlusExp3(node);
        node.getExp3().apply(this);
        op1 = (SaExp) this.returnValue;
        node.getExp4().apply(this);
        op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpAdd(op1, op2); // Assuming SaExpAdd represents addition
        outAPlusExp3(node);
    }

    // exp3 = {minus} exp3 minus exp4
    @Override
    public void caseASubExp3(ASubExp3 node) {
        SaExp op1 = null;
        SaExp op2 = null;
        inASubExp3(node);
        node.getExp3().apply(this);
        op1 = (SaExp) this.returnValue;
        node.getExp4().apply(this);
        op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpSub(op1, op2); // Assuming SaExpSub represents subtraction
        outASubExp3(node);
    }

    // exp3 = {exp4} exp4
    @Override
    public void caseAExp4Exp3(AExp4Exp3 node) {
        node.getExp4().apply(this);
        // Assuming no modification is needed here as exp3 is a pass-through to exp4
        outAExp4Exp3(node);
    }

    // exp4 = {mult} exp4 mult exp5
    @Override
    public void caseAMultExp4(AMultExp4 node) {
        SaExp op1 = null;
        SaExp op2 = null;
        inAMultExp4(node);
        node.getExp4().apply(this);
        op1 = (SaExp) this.returnValue;
        node.getExp5().apply(this);
        op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpMult(op1, op2); // Assuming SaExpMult represents multiplication
        outAMultExp4(node);
    }

    // exp4 = {div} exp4 div exp5
    @Override
    public void caseADivExp4(ADivExp4 node) {
        SaExp op1 = null;
        SaExp op2 = null;
        inADivExp4(node);
        node.getExp4().apply(this);
        op1 = (SaExp) this.returnValue;
        node.getExp5().apply(this);
        op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpDiv(op1, op2); // Assuming SaExpDiv represents division
        outADivExp4(node);
    }

    // exp4 = {exp5} exp5
    @Override
    public void caseAExp5Exp4(AExp5Exp4 node) {
        node.getExp5().apply(this);
        // Assuming no modification is needed here as exp4 is a pass-through to exp5
        outAExp5Exp4(node);
    }

    // exp5 = {non} non exp5
    @Override
    public void caseANonExp5(ANonExp5 node) {
        SaExp op = null;
        inANonExp5(node);
        node.getExp5().apply(this);
        op = (SaExp) this.returnValue;
        this.returnValue = new SaExpNot(op); // Assuming SaExpNot represents logical NOT
        outANonExp5(node);
    }

    // exp5 = {exp6} exp6
    @Override
    public void caseAExp6Exp5(AExp6Exp5 node) {
        node.getExp6().apply(this);
        // Assuming no modification is needed here as exp5 is a pass-through to exp6
        outAExp6Exp5(node);
    }

    // instr = {afectation} var equal exp point_virgule
    @Override
    public void caseAAfectationInstr(AAfectationInstr node) {
        SaVar var = null;
        SaExp exp = null;
        inAAfectationInstr(node);
        node.getVar().apply(this);
        var = (SaVar) this.returnValue;
        node.getExp().apply(this);
        exp = (SaExp) this.returnValue;
        this.returnValue = new SaInstAffect(var, exp);
        outAAfectationInstr(node);
    }


}

