/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class TRetour extends Token
{
    public TRetour()
    {
        super.setText("retour");
    }

    public TRetour(int line, int pos)
    {
        super.setText("retour");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRetour(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRetour(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRetour text.");
    }
}