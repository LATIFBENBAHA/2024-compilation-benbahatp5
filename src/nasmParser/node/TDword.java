/* This file was generated by SableCC (http://www.sablecc.org/). */

package nasmParser.node;

import nasmParser.analysis.*;

@SuppressWarnings("nls")
public final class TDword extends Token
{
    public TDword()
    {
        super.setText("dword");
    }

    public TDword(int line, int pos)
    {
        super.setText("dword");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDword(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDword text.");
    }
}
