/* This file was generated by SableCC (http://www.sablecc.org/). */

package nasmParser.node;

import nasmParser.analysis.*;

@SuppressWarnings("nls")
public final class TReservequadword extends Token
{
    public TReservequadword()
    {
        super.setText("resq");
    }

    public TReservequadword(int line, int pos)
    {
        super.setText("resq");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TReservequadword(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTReservequadword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TReservequadword text.");
    }
}
