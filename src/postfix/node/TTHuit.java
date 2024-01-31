/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class TTHuit extends Token
{
    public TTHuit()
    {
        super.setText("_");
    }

    public TTHuit(int line, int pos)
    {
        super.setText("_");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTHuit(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTHuit(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTHuit text.");
    }
}