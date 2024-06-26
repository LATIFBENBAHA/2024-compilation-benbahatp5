/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.analysis;

import java.util.*;
import postfix.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPProgramme().apply(this);
        outStart(node);
    }

    public void inAProgrammeProgramme(AProgrammeProgramme node)
    {
        defaultIn(node);
    }

    public void outAProgrammeProgramme(AProgrammeProgramme node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgrammeProgramme(AProgrammeProgramme node)
    {
        inAProgrammeProgramme(node);
        if(node.getListedecfonc() != null)
        {
            node.getListedecfonc().apply(this);
        }
        if(node.getListedecvar() != null)
        {
            node.getListedecvar().apply(this);
        }
        outAProgrammeProgramme(node);
    }

    public void inAOuExp(AOuExp node)
    {
        defaultIn(node);
    }

    public void outAOuExp(AOuExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuExp(AOuExp node)
    {
        inAOuExp(node);
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        if(node.getOu() != null)
        {
            node.getOu().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAOuExp(node);
    }

    public void inAExp1Exp(AExp1Exp node)
    {
        defaultIn(node);
    }

    public void outAExp1Exp(AExp1Exp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp1Exp(AExp1Exp node)
    {
        inAExp1Exp(node);
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outAExp1Exp(node);
    }

    public void inAEtExp1(AEtExp1 node)
    {
        defaultIn(node);
    }

    public void outAEtExp1(AEtExp1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEtExp1(AEtExp1 node)
    {
        inAEtExp1(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getEt() != null)
        {
            node.getEt().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outAEtExp1(node);
    }

    public void inAExp2Exp1(AExp2Exp1 node)
    {
        defaultIn(node);
    }

    public void outAExp2Exp1(AExp2Exp1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp2Exp1(AExp2Exp1 node)
    {
        inAExp2Exp1(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        outAExp2Exp1(node);
    }

    public void inAEqualExp2(AEqualExp2 node)
    {
        defaultIn(node);
    }

    public void outAEqualExp2(AEqualExp2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqualExp2(AEqualExp2 node)
    {
        inAEqualExp2(node);
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
        }
        if(node.getEqual() != null)
        {
            node.getEqual().apply(this);
        }
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        outAEqualExp2(node);
    }

    public void inAInfExp2(AInfExp2 node)
    {
        defaultIn(node);
    }

    public void outAInfExp2(AInfExp2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInfExp2(AInfExp2 node)
    {
        inAInfExp2(node);
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
        }
        if(node.getLess() != null)
        {
            node.getLess().apply(this);
        }
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        outAInfExp2(node);
    }

    public void inAExp3Exp2(AExp3Exp2 node)
    {
        defaultIn(node);
    }

    public void outAExp3Exp2(AExp3Exp2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp3Exp2(AExp3Exp2 node)
    {
        inAExp3Exp2(node);
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
        }
        outAExp3Exp2(node);
    }

    public void inAPlusExp3(APlusExp3 node)
    {
        defaultIn(node);
    }

    public void outAPlusExp3(APlusExp3 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusExp3(APlusExp3 node)
    {
        inAPlusExp3(node);
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
        }
        outAPlusExp3(node);
    }

    public void inASubExp3(ASubExp3 node)
    {
        defaultIn(node);
    }

    public void outASubExp3(ASubExp3 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubExp3(ASubExp3 node)
    {
        inASubExp3(node);
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
        }
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
        }
        outASubExp3(node);
    }

    public void inAExp4Exp3(AExp4Exp3 node)
    {
        defaultIn(node);
    }

    public void outAExp4Exp3(AExp4Exp3 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp4Exp3(AExp4Exp3 node)
    {
        inAExp4Exp3(node);
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
        }
        outAExp4Exp3(node);
    }

    public void inAMultExp4(AMultExp4 node)
    {
        defaultIn(node);
    }

    public void outAMultExp4(AMultExp4 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultExp4(AMultExp4 node)
    {
        inAMultExp4(node);
        if(node.getExp5() != null)
        {
            node.getExp5().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
        }
        outAMultExp4(node);
    }

    public void inADivExp4(ADivExp4 node)
    {
        defaultIn(node);
    }

    public void outADivExp4(ADivExp4 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivExp4(ADivExp4 node)
    {
        inADivExp4(node);
        if(node.getExp5() != null)
        {
            node.getExp5().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
        }
        outADivExp4(node);
    }

    public void inAExp5Exp4(AExp5Exp4 node)
    {
        defaultIn(node);
    }

    public void outAExp5Exp4(AExp5Exp4 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp5Exp4(AExp5Exp4 node)
    {
        inAExp5Exp4(node);
        if(node.getExp5() != null)
        {
            node.getExp5().apply(this);
        }
        outAExp5Exp4(node);
    }

    public void inANonExp5(ANonExp5 node)
    {
        defaultIn(node);
    }

    public void outANonExp5(ANonExp5 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANonExp5(ANonExp5 node)
    {
        inANonExp5(node);
        if(node.getExp5() != null)
        {
            node.getExp5().apply(this);
        }
        if(node.getNon() != null)
        {
            node.getNon().apply(this);
        }
        outANonExp5(node);
    }

    public void inAExp6Exp5(AExp6Exp5 node)
    {
        defaultIn(node);
    }

    public void outAExp6Exp5(AExp6Exp5 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp6Exp5(AExp6Exp5 node)
    {
        inAExp6Exp5(node);
        if(node.getExp6() != null)
        {
            node.getExp6().apply(this);
        }
        outAExp6Exp5(node);
    }

    public void inAParenteseExp6(AParenteseExp6 node)
    {
        defaultIn(node);
    }

    public void outAParenteseExp6(AParenteseExp6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParenteseExp6(AParenteseExp6 node)
    {
        inAParenteseExp6(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outAParenteseExp6(node);
    }

    public void inANumberExp6(ANumberExp6 node)
    {
        defaultIn(node);
    }

    public void outANumberExp6(ANumberExp6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumberExp6(ANumberExp6 node)
    {
        inANumberExp6(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumberExp6(node);
    }

    public void inAVraiExp6(AVraiExp6 node)
    {
        defaultIn(node);
    }

    public void outAVraiExp6(AVraiExp6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVraiExp6(AVraiExp6 node)
    {
        inAVraiExp6(node);
        if(node.getVrai() != null)
        {
            node.getVrai().apply(this);
        }
        outAVraiExp6(node);
    }

    public void inAFauxExp6(AFauxExp6 node)
    {
        defaultIn(node);
    }

    public void outAFauxExp6(AFauxExp6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFauxExp6(AFauxExp6 node)
    {
        inAFauxExp6(node);
        if(node.getFaux() != null)
        {
            node.getFaux().apply(this);
        }
        outAFauxExp6(node);
    }

    public void inAVariableExp6(AVariableExp6 node)
    {
        defaultIn(node);
    }

    public void outAVariableExp6(AVariableExp6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariableExp6(AVariableExp6 node)
    {
        inAVariableExp6(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVariableExp6(node);
    }

    public void inAAppelfoncExp6(AAppelfoncExp6 node)
    {
        defaultIn(node);
    }

    public void outAAppelfoncExp6(AAppelfoncExp6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAppelfoncExp6(AAppelfoncExp6 node)
    {
        inAAppelfoncExp6(node);
        if(node.getAppelfonc() != null)
        {
            node.getAppelfonc().apply(this);
        }
        outAAppelfoncExp6(node);
    }

    public void inALireExp6(ALireExp6 node)
    {
        defaultIn(node);
    }

    public void outALireExp6(ALireExp6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALireExp6(ALireExp6 node)
    {
        inALireExp6(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getLire() != null)
        {
            node.getLire().apply(this);
        }
        outALireExp6(node);
    }

    public void inAAppelfonctionAppelfonc(AAppelfonctionAppelfonc node)
    {
        defaultIn(node);
    }

    public void outAAppelfonctionAppelfonc(AAppelfonctionAppelfonc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAppelfonctionAppelfonc(AAppelfonctionAppelfonc node)
    {
        inAAppelfonctionAppelfonc(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getListeexp() != null)
        {
            node.getListeexp().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
        }
        outAAppelfonctionAppelfonc(node);
    }

    public void inAAfectationInstr(AAfectationInstr node)
    {
        defaultIn(node);
    }

    public void outAAfectationInstr(AAfectationInstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAfectationInstr(AAfectationInstr node)
    {
        inAAfectationInstr(node);
        if(node.getPointVirgule() != null)
        {
            node.getPointVirgule().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getEqual() != null)
        {
            node.getEqual().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAAfectationInstr(node);
    }

    public void inATantqueInstr(ATantqueInstr node)
    {
        defaultIn(node);
    }

    public void outATantqueInstr(ATantqueInstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATantqueInstr(ATantqueInstr node)
    {
        inATantqueInstr(node);
        if(node.getInstrbloc() != null)
        {
            node.getInstrbloc().apply(this);
        }
        if(node.getFaire() != null)
        {
            node.getFaire().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getTantque() != null)
        {
            node.getTantque().apply(this);
        }
        outATantqueInstr(node);
    }

    public void inAFonctionInstr(AFonctionInstr node)
    {
        defaultIn(node);
    }

    public void outAFonctionInstr(AFonctionInstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFonctionInstr(AFonctionInstr node)
    {
        inAFonctionInstr(node);
        if(node.getPointVirgule() != null)
        {
            node.getPointVirgule().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getListeexp() != null)
        {
            node.getListeexp().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
        }
        outAFonctionInstr(node);
    }

    public void inASiInstr(ASiInstr node)
    {
        defaultIn(node);
    }

    public void outASiInstr(ASiInstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASiInstr(ASiInstr node)
    {
        inASiInstr(node);
        if(node.getInstrbloc() != null)
        {
            node.getInstrbloc().apply(this);
        }
        if(node.getAlors() != null)
        {
            node.getAlors().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getSi() != null)
        {
            node.getSi().apply(this);
        }
        outASiInstr(node);
    }

    public void inASinonInstr(ASinonInstr node)
    {
        defaultIn(node);
    }

    public void outASinonInstr(ASinonInstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASinonInstr(ASinonInstr node)
    {
        inASinonInstr(node);
        if(node.getElsebranch() != null)
        {
            node.getElsebranch().apply(this);
        }
        if(node.getSinon() != null)
        {
            node.getSinon().apply(this);
        }
        if(node.getThenbranch() != null)
        {
            node.getThenbranch().apply(this);
        }
        if(node.getAlors() != null)
        {
            node.getAlors().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getSi() != null)
        {
            node.getSi().apply(this);
        }
        outASinonInstr(node);
    }

    public void inARetourInstr(ARetourInstr node)
    {
        defaultIn(node);
    }

    public void outARetourInstr(ARetourInstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARetourInstr(ARetourInstr node)
    {
        inARetourInstr(node);
        if(node.getPointVirgule() != null)
        {
            node.getPointVirgule().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getRetour() != null)
        {
            node.getRetour().apply(this);
        }
        outARetourInstr(node);
    }

    public void inAEcrireInstr(AEcrireInstr node)
    {
        defaultIn(node);
    }

    public void outAEcrireInstr(AEcrireInstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEcrireInstr(AEcrireInstr node)
    {
        inAEcrireInstr(node);
        if(node.getPointVirgule() != null)
        {
            node.getPointVirgule().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getEcrire() != null)
        {
            node.getEcrire().apply(this);
        }
        outAEcrireInstr(node);
    }

    public void inAListedinstrInstrbloc(AListedinstrInstrbloc node)
    {
        defaultIn(node);
    }

    public void outAListedinstrInstrbloc(AListedinstrInstrbloc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListedinstrInstrbloc(AListedinstrInstrbloc node)
    {
        inAListedinstrInstrbloc(node);
        if(node.getRAccolade() != null)
        {
            node.getRAccolade().apply(this);
        }
        if(node.getListeinstr() != null)
        {
            node.getListeinstr().apply(this);
        }
        if(node.getLAccolade() != null)
        {
            node.getLAccolade().apply(this);
        }
        outAListedinstrInstrbloc(node);
    }

    public void inAListdeinstrListeinstr(AListdeinstrListeinstr node)
    {
        defaultIn(node);
    }

    public void outAListdeinstrListeinstr(AListdeinstrListeinstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListdeinstrListeinstr(AListdeinstrListeinstr node)
    {
        inAListdeinstrListeinstr(node);
        if(node.getListeinstr() != null)
        {
            node.getListeinstr().apply(this);
        }
        if(node.getInstr() != null)
        {
            node.getInstr().apply(this);
        }
        outAListdeinstrListeinstr(node);
    }

    public void inAEpsilonListeinstr(AEpsilonListeinstr node)
    {
        defaultIn(node);
    }

    public void outAEpsilonListeinstr(AEpsilonListeinstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEpsilonListeinstr(AEpsilonListeinstr node)
    {
        inAEpsilonListeinstr(node);
        outAEpsilonListeinstr(node);
    }

    public void inAListedeexpressionListeexp(AListedeexpressionListeexp node)
    {
        defaultIn(node);
    }

    public void outAListedeexpressionListeexp(AListedeexpressionListeexp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListedeexpressionListeexp(AListedeexpressionListeexp node)
    {
        inAListedeexpressionListeexp(node);
        if(node.getListeexpbis() != null)
        {
            node.getListeexpbis().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAListedeexpressionListeexp(node);
    }

    public void inAEpsilonListeexp(AEpsilonListeexp node)
    {
        defaultIn(node);
    }

    public void outAEpsilonListeexp(AEpsilonListeexp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEpsilonListeexp(AEpsilonListeexp node)
    {
        inAEpsilonListeexp(node);
        outAEpsilonListeexp(node);
    }

    public void inARestelistedeexpressionListeexpbis(ARestelistedeexpressionListeexpbis node)
    {
        defaultIn(node);
    }

    public void outARestelistedeexpressionListeexpbis(ARestelistedeexpressionListeexpbis node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARestelistedeexpressionListeexpbis(ARestelistedeexpressionListeexpbis node)
    {
        inARestelistedeexpressionListeexpbis(node);
        if(node.getListeexpbis() != null)
        {
            node.getListeexpbis().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getVirgule() != null)
        {
            node.getVirgule().apply(this);
        }
        outARestelistedeexpressionListeexpbis(node);
    }

    public void inAEpsilonListeexpbis(AEpsilonListeexpbis node)
    {
        defaultIn(node);
    }

    public void outAEpsilonListeexpbis(AEpsilonListeexpbis node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEpsilonListeexpbis(AEpsilonListeexpbis node)
    {
        inAEpsilonListeexpbis(node);
        outAEpsilonListeexpbis(node);
    }

    public void inAIdentifVar(AIdentifVar node)
    {
        defaultIn(node);
    }

    public void outAIdentifVar(AIdentifVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifVar(AIdentifVar node)
    {
        inAIdentifVar(node);
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
        }
        outAIdentifVar(node);
    }

    public void inAVarindexeeVar(AVarindexeeVar node)
    {
        defaultIn(node);
    }

    public void outAVarindexeeVar(AVarindexeeVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarindexeeVar(AVarindexeeVar node)
    {
        inAVarindexeeVar(node);
        if(node.getBrackclose() != null)
        {
            node.getBrackclose().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getBrackopen() != null)
        {
            node.getBrackopen().apply(this);
        }
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
        }
        outAVarindexeeVar(node);
    }

    public void inADeclarationvarDecvar(ADeclarationvarDecvar node)
    {
        defaultIn(node);
    }

    public void outADeclarationvarDecvar(ADeclarationvarDecvar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclarationvarDecvar(ADeclarationvarDecvar node)
    {
        inADeclarationvarDecvar(node);
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outADeclarationvarDecvar(node);
    }

    public void inADeclarationvarindexeeDecvar(ADeclarationvarindexeeDecvar node)
    {
        defaultIn(node);
    }

    public void outADeclarationvarindexeeDecvar(ADeclarationvarindexeeDecvar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclarationvarindexeeDecvar(ADeclarationvarindexeeDecvar node)
    {
        inADeclarationvarindexeeDecvar(node);
        if(node.getBrackclose() != null)
        {
            node.getBrackclose().apply(this);
        }
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        if(node.getBrackopen() != null)
        {
            node.getBrackopen().apply(this);
        }
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outADeclarationvarindexeeDecvar(node);
    }

    public void inAEntierType(AEntierType node)
    {
        defaultIn(node);
    }

    public void outAEntierType(AEntierType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEntierType(AEntierType node)
    {
        inAEntierType(node);
        if(node.getEntier() != null)
        {
            node.getEntier().apply(this);
        }
        outAEntierType(node);
    }

    public void inABoolType(ABoolType node)
    {
        defaultIn(node);
    }

    public void outABoolType(ABoolType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABoolType(ABoolType node)
    {
        inABoolType(node);
        if(node.getBool() != null)
        {
            node.getBool().apply(this);
        }
        outABoolType(node);
    }

    public void inADeclarationfonctionDecfonc(ADeclarationfonctionDecfonc node)
    {
        defaultIn(node);
    }

    public void outADeclarationfonctionDecfonc(ADeclarationfonctionDecfonc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclarationfonctionDecfonc(ADeclarationfonctionDecfonc node)
    {
        inADeclarationfonctionDecfonc(node);
        if(node.getInstrbloc() != null)
        {
            node.getInstrbloc().apply(this);
        }
        if(node.getVariablefonc() != null)
        {
            node.getVariablefonc().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getParametre() != null)
        {
            node.getParametre().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
        }
        if(node.getOpttype() != null)
        {
            node.getOpttype().apply(this);
        }
        outADeclarationfonctionDecfonc(node);
    }

    public void inATypeOpttype(ATypeOpttype node)
    {
        defaultIn(node);
    }

    public void outATypeOpttype(ATypeOpttype node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATypeOpttype(ATypeOpttype node)
    {
        inATypeOpttype(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outATypeOpttype(node);
    }

    public void inAEpsilonOpttype(AEpsilonOpttype node)
    {
        defaultIn(node);
    }

    public void outAEpsilonOpttype(AEpsilonOpttype node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEpsilonOpttype(AEpsilonOpttype node)
    {
        inAEpsilonOpttype(node);
        outAEpsilonOpttype(node);
    }

    public void inAListedecvarListedecvar(AListedecvarListedecvar node)
    {
        defaultIn(node);
    }

    public void outAListedecvarListedecvar(AListedecvarListedecvar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListedecvarListedecvar(AListedecvarListedecvar node)
    {
        inAListedecvarListedecvar(node);
        if(node.getListedecvarbis() != null)
        {
            node.getListedecvarbis().apply(this);
        }
        if(node.getDecvar() != null)
        {
            node.getDecvar().apply(this);
        }
        outAListedecvarListedecvar(node);
    }

    public void inAEpsilonListedecvar(AEpsilonListedecvar node)
    {
        defaultIn(node);
    }

    public void outAEpsilonListedecvar(AEpsilonListedecvar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEpsilonListedecvar(AEpsilonListedecvar node)
    {
        inAEpsilonListedecvar(node);
        outAEpsilonListedecvar(node);
    }

    public void inAApreslistedecvarListedecvarbis(AApreslistedecvarListedecvarbis node)
    {
        defaultIn(node);
    }

    public void outAApreslistedecvarListedecvarbis(AApreslistedecvarListedecvarbis node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAApreslistedecvarListedecvarbis(AApreslistedecvarListedecvarbis node)
    {
        inAApreslistedecvarListedecvarbis(node);
        if(node.getListedecvarbis() != null)
        {
            node.getListedecvarbis().apply(this);
        }
        if(node.getDecvar() != null)
        {
            node.getDecvar().apply(this);
        }
        if(node.getVirgule() != null)
        {
            node.getVirgule().apply(this);
        }
        outAApreslistedecvarListedecvarbis(node);
    }

    public void inAEpsilonListedecvarbis(AEpsilonListedecvarbis node)
    {
        defaultIn(node);
    }

    public void outAEpsilonListedecvarbis(AEpsilonListedecvarbis node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEpsilonListedecvarbis(AEpsilonListedecvarbis node)
    {
        inAEpsilonListedecvarbis(node);
        outAEpsilonListedecvarbis(node);
    }

    public void inAListedecfoncListedecfonc(AListedecfoncListedecfonc node)
    {
        defaultIn(node);
    }

    public void outAListedecfoncListedecfonc(AListedecfoncListedecfonc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListedecfoncListedecfonc(AListedecfoncListedecfonc node)
    {
        inAListedecfoncListedecfonc(node);
        if(node.getListedecfonc() != null)
        {
            node.getListedecfonc().apply(this);
        }
        if(node.getDecfonc() != null)
        {
            node.getDecfonc().apply(this);
        }
        outAListedecfoncListedecfonc(node);
    }

    public void inAEpsilonListedecfonc(AEpsilonListedecfonc node)
    {
        defaultIn(node);
    }

    public void outAEpsilonListedecfonc(AEpsilonListedecfonc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEpsilonListedecfonc(AEpsilonListedecfonc node)
    {
        inAEpsilonListedecfonc(node);
        outAEpsilonListedecfonc(node);
    }
}
