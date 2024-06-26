/* This file was generated by SableCC (http://www.sablecc.org/). */

package saParser.node;

import saParser.analysis.*;

@SuppressWarnings("nls")
public final class TSaexpequal extends Token
{
    public TSaexpequal()
    {
        super.setText("SaExpEqual");
    }

    public TSaexpequal(int line, int pos)
    {
        super.setText("SaExpEqual");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSaexpequal(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSaexpequal(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSaexpequal text.");
    }
}
