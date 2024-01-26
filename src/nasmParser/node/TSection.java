/* This file was generated by SableCC (http://www.sablecc.org/). */

package nasmParser.node;

import nasmParser.analysis.*;

@SuppressWarnings("nls")
public final class TSection extends Token
{
    public TSection()
    {
        super.setText("section");
    }

    public TSection(int line, int pos)
    {
        super.setText("section");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSection(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSection(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSection text.");
    }
}