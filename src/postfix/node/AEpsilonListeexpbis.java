/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AEpsilonListeexpbis extends PListeexpbis
{

    public AEpsilonListeexpbis()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new AEpsilonListeexpbis();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEpsilonListeexpbis(this);
    }

    @Override
    public String toString()
    {
        return "";
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        throw new RuntimeException("Not a child.");
    }
}