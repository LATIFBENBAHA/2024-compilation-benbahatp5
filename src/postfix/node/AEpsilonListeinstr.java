/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AEpsilonListeinstr extends PListeinstr
{

    public AEpsilonListeinstr()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new AEpsilonListeinstr();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEpsilonListeinstr(this);
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
