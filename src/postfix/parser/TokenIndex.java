/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.parser;

import postfix.node.*;
import postfix.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTLAccolade(@SuppressWarnings("unused") TLAccolade node)
    {
        this.index = 0;
    }

    @Override
    public void caseTRAccolade(@SuppressWarnings("unused") TRAccolade node)
    {
        this.index = 1;
    }

    @Override
    public void caseTLPar(@SuppressWarnings("unused") TLPar node)
    {
        this.index = 2;
    }

    @Override
    public void caseTRPar(@SuppressWarnings("unused") TRPar node)
    {
        this.index = 3;
    }

    @Override
    public void caseTNon(@SuppressWarnings("unused") TNon node)
    {
        this.index = 4;
    }

    @Override
    public void caseTMult(@SuppressWarnings("unused") TMult node)
    {
        this.index = 5;
    }

    @Override
    public void caseTDiv(@SuppressWarnings("unused") TDiv node)
    {
        this.index = 6;
    }

    @Override
    public void caseTPlus(@SuppressWarnings("unused") TPlus node)
    {
        this.index = 7;
    }

    @Override
    public void caseTMinus(@SuppressWarnings("unused") TMinus node)
    {
        this.index = 8;
    }

    @Override
    public void caseTVrai(@SuppressWarnings("unused") TVrai node)
    {
        this.index = 9;
    }

    @Override
    public void caseTFaux(@SuppressWarnings("unused") TFaux node)
    {
        this.index = 10;
    }

    @Override
    public void caseTEqual(@SuppressWarnings("unused") TEqual node)
    {
        this.index = 11;
    }

    @Override
    public void caseTLess(@SuppressWarnings("unused") TLess node)
    {
        this.index = 12;
    }

    @Override
    public void caseTEt(@SuppressWarnings("unused") TEt node)
    {
        this.index = 13;
    }

    @Override
    public void caseTOu(@SuppressWarnings("unused") TOu node)
    {
        this.index = 14;
    }

    @Override
    public void caseTMod(@SuppressWarnings("unused") TMod node)
    {
        this.index = 15;
    }

    @Override
    public void caseTTHuit(@SuppressWarnings("unused") TTHuit node)
    {
        this.index = 16;
    }

    @Override
    public void caseTSautDeLigne(@SuppressWarnings("unused") TSautDeLigne node)
    {
        this.index = 17;
    }

    @Override
    public void caseTPointVirgule(@SuppressWarnings("unused") TPointVirgule node)
    {
        this.index = 18;
    }

    @Override
    public void caseTBrackopen(@SuppressWarnings("unused") TBrackopen node)
    {
        this.index = 19;
    }

    @Override
    public void caseTBrackclose(@SuppressWarnings("unused") TBrackclose node)
    {
        this.index = 20;
    }

    @Override
    public void caseTSemicol(@SuppressWarnings("unused") TSemicol node)
    {
        this.index = 21;
    }

    @Override
    public void caseTVirgule(@SuppressWarnings("unused") TVirgule node)
    {
        this.index = 22;
    }

    @Override
    public void caseTRetour(@SuppressWarnings("unused") TRetour node)
    {
        this.index = 23;
    }

    @Override
    public void caseTLire(@SuppressWarnings("unused") TLire node)
    {
        this.index = 24;
    }

    @Override
    public void caseTEcrire(@SuppressWarnings("unused") TEcrire node)
    {
        this.index = 25;
    }

    @Override
    public void caseTSi(@SuppressWarnings("unused") TSi node)
    {
        this.index = 26;
    }

    @Override
    public void caseTSinon(@SuppressWarnings("unused") TSinon node)
    {
        this.index = 27;
    }

    @Override
    public void caseTAlors(@SuppressWarnings("unused") TAlors node)
    {
        this.index = 28;
    }

    @Override
    public void caseTTantque(@SuppressWarnings("unused") TTantque node)
    {
        this.index = 29;
    }

    @Override
    public void caseTFaire(@SuppressWarnings("unused") TFaire node)
    {
        this.index = 30;
    }

    @Override
    public void caseTNumber(@SuppressWarnings("unused") TNumber node)
    {
        this.index = 31;
    }

    @Override
    public void caseTEntier(@SuppressWarnings("unused") TEntier node)
    {
        this.index = 32;
    }

    @Override
    public void caseTBool(@SuppressWarnings("unused") TBool node)
    {
        this.index = 33;
    }

    @Override
    public void caseTIdentif(@SuppressWarnings("unused") TIdentif node)
    {
        this.index = 34;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 35;
    }
}
