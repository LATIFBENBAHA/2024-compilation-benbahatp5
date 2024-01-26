/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.analysis;

import java.util.*;
import postfix.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
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
        node.getPProgramme().apply(this);
        node.getEOF().apply(this);
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
        if(node.getListedecvar() != null)
        {
            node.getListedecvar().apply(this);
        }
        if(node.getListedecfonc() != null)
        {
            node.getListedecfonc().apply(this);
        }
        outAProgrammeProgramme(node);
    }

    public void inAOuS(AOuS node)
    {
        defaultIn(node);
    }

    public void outAOuS(AOuS node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuS(AOuS node)
    {
        inAOuS(node);
        if(node.getS() != null)
        {
            node.getS().apply(this);
        }
        if(node.getOu() != null)
        {
            node.getOu().apply(this);
        }
        if(node.getO() != null)
        {
            node.getO().apply(this);
        }
        outAOuS(node);
    }

    public void inAOS(AOS node)
    {
        defaultIn(node);
    }

    public void outAOS(AOS node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOS(AOS node)
    {
        inAOS(node);
        if(node.getO() != null)
        {
            node.getO().apply(this);
        }
        outAOS(node);
    }

    public void inAEtO(AEtO node)
    {
        defaultIn(node);
    }

    public void outAEtO(AEtO node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEtO(AEtO node)
    {
        inAEtO(node);
        if(node.getO() != null)
        {
            node.getO().apply(this);
        }
        if(node.getEt() != null)
        {
            node.getEt().apply(this);
        }
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        outAEtO(node);
    }

    public void inAEO(AEO node)
    {
        defaultIn(node);
    }

    public void outAEO(AEO node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEO(AEO node)
    {
        inAEO(node);
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        outAEO(node);
    }

    public void inAEqualE(AEqualE node)
    {
        defaultIn(node);
    }

    public void outAEqualE(AEqualE node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqualE(AEqualE node)
    {
        inAEqualE(node);
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        if(node.getEqual() != null)
        {
            node.getEqual().apply(this);
        }
        if(node.getP() != null)
        {
            node.getP().apply(this);
        }
        outAEqualE(node);
    }

    public void inALessE(ALessE node)
    {
        defaultIn(node);
    }

    public void outALessE(ALessE node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALessE(ALessE node)
    {
        inALessE(node);
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        if(node.getLess() != null)
        {
            node.getLess().apply(this);
        }
        if(node.getP() != null)
        {
            node.getP().apply(this);
        }
        outALessE(node);
    }

    public void inAPE(APE node)
    {
        defaultIn(node);
    }

    public void outAPE(APE node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPE(APE node)
    {
        inAPE(node);
        if(node.getP() != null)
        {
            node.getP().apply(this);
        }
        outAPE(node);
    }

    public void inAPlusP(APlusP node)
    {
        defaultIn(node);
    }

    public void outAPlusP(APlusP node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusP(APlusP node)
    {
        inAPlusP(node);
        if(node.getP() != null)
        {
            node.getP().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getM() != null)
        {
            node.getM().apply(this);
        }
        outAPlusP(node);
    }

    public void inAMinusP(AMinusP node)
    {
        defaultIn(node);
    }

    public void outAMinusP(AMinusP node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusP(AMinusP node)
    {
        inAMinusP(node);
        if(node.getP() != null)
        {
            node.getP().apply(this);
        }
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getM() != null)
        {
            node.getM().apply(this);
        }
        outAMinusP(node);
    }

    public void inAMP(AMP node)
    {
        defaultIn(node);
    }

    public void outAMP(AMP node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMP(AMP node)
    {
        inAMP(node);
        if(node.getM() != null)
        {
            node.getM().apply(this);
        }
        outAMP(node);
    }

    public void inAMiltM(AMiltM node)
    {
        defaultIn(node);
    }

    public void outAMiltM(AMiltM node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMiltM(AMiltM node)
    {
        inAMiltM(node);
        if(node.getM() != null)
        {
            node.getM().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getN() != null)
        {
            node.getN().apply(this);
        }
        outAMiltM(node);
    }

    public void inADivM(ADivM node)
    {
        defaultIn(node);
    }

    public void outADivM(ADivM node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivM(ADivM node)
    {
        inADivM(node);
        if(node.getM() != null)
        {
            node.getM().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getN() != null)
        {
            node.getN().apply(this);
        }
        outADivM(node);
    }

    public void inANM(ANM node)
    {
        defaultIn(node);
    }

    public void outANM(ANM node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANM(ANM node)
    {
        inANM(node);
        if(node.getN() != null)
        {
            node.getN().apply(this);
        }
        outANM(node);
    }

    public void inANonN(ANonN node)
    {
        defaultIn(node);
    }

    public void outANonN(ANonN node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANonN(ANonN node)
    {
        inANonN(node);
        if(node.getNon() != null)
        {
            node.getNon().apply(this);
        }
        if(node.getN() != null)
        {
            node.getN().apply(this);
        }
        outANonN(node);
    }

    public void inAFN(AFN node)
    {
        defaultIn(node);
    }

    public void outAFN(AFN node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFN(AFN node)
    {
        inAFN(node);
        if(node.getF() != null)
        {
            node.getF().apply(this);
        }
        outAFN(node);
    }

    public void inAParenteseF(AParenteseF node)
    {
        defaultIn(node);
    }

    public void outAParenteseF(AParenteseF node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParenteseF(AParenteseF node)
    {
        inAParenteseF(node);
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getS() != null)
        {
            node.getS().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAParenteseF(node);
    }

    public void inANumberF(ANumberF node)
    {
        defaultIn(node);
    }

    public void outANumberF(ANumberF node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumberF(ANumberF node)
    {
        inANumberF(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumberF(node);
    }

    public void inAVraiF(AVraiF node)
    {
        defaultIn(node);
    }

    public void outAVraiF(AVraiF node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVraiF(AVraiF node)
    {
        inAVraiF(node);
        if(node.getVrai() != null)
        {
            node.getVrai().apply(this);
        }
        outAVraiF(node);
    }

    public void inAFauxF(AFauxF node)
    {
        defaultIn(node);
    }

    public void outAFauxF(AFauxF node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFauxF(AFauxF node)
    {
        inAFauxF(node);
        if(node.getFaux() != null)
        {
            node.getFaux().apply(this);
        }
        outAFauxF(node);
    }

    public void inAVariableF(AVariableF node)
    {
        defaultIn(node);
    }

    public void outAVariableF(AVariableF node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariableF(AVariableF node)
    {
        inAVariableF(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVariableF(node);
    }

    public void inAAppelfoncF(AAppelfoncF node)
    {
        defaultIn(node);
    }

    public void outAAppelfoncF(AAppelfoncF node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAppelfoncF(AAppelfoncF node)
    {
        inAAppelfoncF(node);
        if(node.getAppelfonc() != null)
        {
            node.getAppelfonc().apply(this);
        }
        outAAppelfoncF(node);
    }

    public void inALireF(ALireF node)
    {
        defaultIn(node);
    }

    public void outALireF(ALireF node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALireF(ALireF node)
    {
        inALireF(node);
        if(node.getLire() != null)
        {
            node.getLire().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outALireF(node);
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
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getListeexp() != null)
        {
            node.getListeexp().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAAppelfonctionAppelfonc(node);
    }

    public void inAAfectInstr(AAfectInstr node)
    {
        defaultIn(node);
    }

    public void outAAfectInstr(AAfectInstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAfectInstr(AAfectInstr node)
    {
        inAAfectInstr(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getEqual() != null)
        {
            node.getEqual().apply(this);
        }
        if(node.getS() != null)
        {
            node.getS().apply(this);
        }
        if(node.getPointVirgule() != null)
        {
            node.getPointVirgule().apply(this);
        }
        outAAfectInstr(node);
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
        if(node.getTantque() != null)
        {
            node.getTantque().apply(this);
        }
        if(node.getS() != null)
        {
            node.getS().apply(this);
        }
        if(node.getFaire() != null)
        {
            node.getFaire().apply(this);
        }
        if(node.getInstrbloc() != null)
        {
            node.getInstrbloc().apply(this);
        }
        outATantqueInstr(node);
    }

    public void inAFoncInstr(AFoncInstr node)
    {
        defaultIn(node);
    }

    public void outAFoncInstr(AFoncInstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFoncInstr(AFoncInstr node)
    {
        inAFoncInstr(node);
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getListeexp() != null)
        {
            node.getListeexp().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getPointVirgule() != null)
        {
            node.getPointVirgule().apply(this);
        }
        outAFoncInstr(node);
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
        if(node.getSi() != null)
        {
            node.getSi().apply(this);
        }
        if(node.getS() != null)
        {
            node.getS().apply(this);
        }
        if(node.getAlors() != null)
        {
            node.getAlors().apply(this);
        }
        if(node.getInstrbloc() != null)
        {
            node.getInstrbloc().apply(this);
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
        if(node.getSi() != null)
        {
            node.getSi().apply(this);
        }
        if(node.getS() != null)
        {
            node.getS().apply(this);
        }
        if(node.getAlors() != null)
        {
            node.getAlors().apply(this);
        }
        if(node.getThenbranch() != null)
        {
            node.getThenbranch().apply(this);
        }
        if(node.getSinon() != null)
        {
            node.getSinon().apply(this);
        }
        if(node.getElsebranch() != null)
        {
            node.getElsebranch().apply(this);
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
        if(node.getRetour() != null)
        {
            node.getRetour().apply(this);
        }
        if(node.getS() != null)
        {
            node.getS().apply(this);
        }
        if(node.getPointVirgule() != null)
        {
            node.getPointVirgule().apply(this);
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
        if(node.getEcrire() != null)
        {
            node.getEcrire().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getS() != null)
        {
            node.getS().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getPointVirgule() != null)
        {
            node.getPointVirgule().apply(this);
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
        if(node.getLAccolade() != null)
        {
            node.getLAccolade().apply(this);
        }
        if(node.getListeinstr() != null)
        {
            node.getListeinstr().apply(this);
        }
        if(node.getRAccolade() != null)
        {
            node.getRAccolade().apply(this);
        }
        outAListedinstrInstrbloc(node);
    }

    public void inAThenbranchThenbranch(AThenbranchThenbranch node)
    {
        defaultIn(node);
    }

    public void outAThenbranchThenbranch(AThenbranchThenbranch node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAThenbranchThenbranch(AThenbranchThenbranch node)
    {
        inAThenbranchThenbranch(node);
        if(node.getInstrbloc() != null)
        {
            node.getInstrbloc().apply(this);
        }
        outAThenbranchThenbranch(node);
    }

    public void inAElsebranchElsebranch(AElsebranchElsebranch node)
    {
        defaultIn(node);
    }

    public void outAElsebranchElsebranch(AElsebranchElsebranch node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElsebranchElsebranch(AElsebranchElsebranch node)
    {
        inAElsebranchElsebranch(node);
        if(node.getInstrbloc() != null)
        {
            node.getInstrbloc().apply(this);
        }
        outAElsebranchElsebranch(node);
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
        if(node.getInstr() != null)
        {
            node.getInstr().apply(this);
        }
        if(node.getListeinstr() != null)
        {
            node.getListeinstr().apply(this);
        }
        outAListdeinstrListeinstr(node);
    }

    public void inAListeinstr(AListeinstr node)
    {
        defaultIn(node);
    }

    public void outAListeinstr(AListeinstr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListeinstr(AListeinstr node)
    {
        inAListeinstr(node);
        outAListeinstr(node);
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
        if(node.getS() != null)
        {
            node.getS().apply(this);
        }
        if(node.getListeexpbis() != null)
        {
            node.getListeexpbis().apply(this);
        }
        outAListedeexpressionListeexp(node);
    }

    public void inAListeexp(AListeexp node)
    {
        defaultIn(node);
    }

    public void outAListeexp(AListeexp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListeexp(AListeexp node)
    {
        inAListeexp(node);
        outAListeexp(node);
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
        if(node.getVirgule() != null)
        {
            node.getVirgule().apply(this);
        }
        if(node.getS() != null)
        {
            node.getS().apply(this);
        }
        if(node.getListeexpbis() != null)
        {
            node.getListeexpbis().apply(this);
        }
        outARestelistedeexpressionListeexpbis(node);
    }

    public void inAListeexpbis(AListeexpbis node)
    {
        defaultIn(node);
    }

    public void outAListeexpbis(AListeexpbis node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListeexpbis(AListeexpbis node)
    {
        inAListeexpbis(node);
        outAListeexpbis(node);
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
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
        }
        if(node.getBrackopen() != null)
        {
            node.getBrackopen().apply(this);
        }
        if(node.getS() != null)
        {
            node.getS().apply(this);
        }
        if(node.getBrackclose() != null)
        {
            node.getBrackclose().apply(this);
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
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
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
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
        }
        if(node.getBrackopen() != null)
        {
            node.getBrackopen().apply(this);
        }
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        if(node.getBrackclose() != null)
        {
            node.getBrackclose().apply(this);
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

    public void inAVraiBool(AVraiBool node)
    {
        defaultIn(node);
    }

    public void outAVraiBool(AVraiBool node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVraiBool(AVraiBool node)
    {
        inAVraiBool(node);
        if(node.getVrai() != null)
        {
            node.getVrai().apply(this);
        }
        outAVraiBool(node);
    }

    public void inAFauxBool(AFauxBool node)
    {
        defaultIn(node);
    }

    public void outAFauxBool(AFauxBool node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFauxBool(AFauxBool node)
    {
        inAFauxBool(node);
        if(node.getFaux() != null)
        {
            node.getFaux().apply(this);
        }
        outAFauxBool(node);
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
        if(node.getOpttype() != null)
        {
            node.getOpttype().apply(this);
        }
        if(node.getIdentif() != null)
        {
            node.getIdentif().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getParametre() != null)
        {
            node.getParametre().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getListedecvar() != null)
        {
            node.getListedecvar().apply(this);
        }
        if(node.getInstrbloc() != null)
        {
            node.getInstrbloc().apply(this);
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

    public void inAOpttype(AOpttype node)
    {
        defaultIn(node);
    }

    public void outAOpttype(AOpttype node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOpttype(AOpttype node)
    {
        inAOpttype(node);
        outAOpttype(node);
    }

    public void inAParametreParametre(AParametreParametre node)
    {
        defaultIn(node);
    }

    public void outAParametreParametre(AParametreParametre node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParametreParametre(AParametreParametre node)
    {
        inAParametreParametre(node);
        if(node.getListedecvar() != null)
        {
            node.getListedecvar().apply(this);
        }
        outAParametreParametre(node);
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
        if(node.getDecvar() != null)
        {
            node.getDecvar().apply(this);
        }
        if(node.getListedecvarbis() != null)
        {
            node.getListedecvarbis().apply(this);
        }
        outAListedecvarListedecvar(node);
    }

    public void inAListedecvar(AListedecvar node)
    {
        defaultIn(node);
    }

    public void outAListedecvar(AListedecvar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListedecvar(AListedecvar node)
    {
        inAListedecvar(node);
        outAListedecvar(node);
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
        if(node.getVirgule() != null)
        {
            node.getVirgule().apply(this);
        }
        if(node.getDecvar() != null)
        {
            node.getDecvar().apply(this);
        }
        if(node.getListedecvarbis() != null)
        {
            node.getListedecvarbis().apply(this);
        }
        outAApreslistedecvarListedecvarbis(node);
    }

    public void inAListedecvarbis(AListedecvarbis node)
    {
        defaultIn(node);
    }

    public void outAListedecvarbis(AListedecvarbis node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListedecvarbis(AListedecvarbis node)
    {
        inAListedecvarbis(node);
        outAListedecvarbis(node);
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
        if(node.getDecfonc() != null)
        {
            node.getDecfonc().apply(this);
        }
        if(node.getListedecfonc() != null)
        {
            node.getListedecfonc().apply(this);
        }
        outAListedecfoncListedecfonc(node);
    }

    public void inAListedecfonc(AListedecfonc node)
    {
        defaultIn(node);
    }

    public void outAListedecfonc(AListedecfonc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListedecfonc(AListedecfonc node)
    {
        inAListedecfonc(node);
        outAListedecfonc(node);
    }
}
