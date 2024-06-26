/* This file was generated by SableCC (http://www.sablecc.org/). */

package nasmParser.node;

import nasmParser.analysis.*;

@SuppressWarnings("nls")
public final class TEbp extends Token
{
    public TEbp()
    {
        super.setText("ebp");
    }

    public TEbp(int line, int pos)
    {
        super.setText("ebp");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEbp(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEbp(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEbp text.");
    }
}
