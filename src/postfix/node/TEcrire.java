/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class TEcrire extends Token
{
    public TEcrire()
    {
        super.setText("ecrire");
    }

    public TEcrire(int line, int pos)
    {
        super.setText("ecrire");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEcrire(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEcrire(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEcrire text.");
    }
}