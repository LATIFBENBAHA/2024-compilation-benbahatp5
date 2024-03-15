/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AListdeinstrListeinstr extends PListeinstr
{
    private PInstr _instr_;
    private PListeinstr _listeinstr_;

    public AListdeinstrListeinstr()
    {
        // Constructor
    }

    public AListdeinstrListeinstr(
        @SuppressWarnings("hiding") PInstr _instr_,
        @SuppressWarnings("hiding") PListeinstr _listeinstr_)
    {
        // Constructor
        setInstr(_instr_);

        setListeinstr(_listeinstr_);

    }

    @Override
    public Object clone()
    {
        return new AListdeinstrListeinstr(
            cloneNode(this._instr_),
            cloneNode(this._listeinstr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListdeinstrListeinstr(this);
    }

    public PInstr getInstr()
    {
        return this._instr_;
    }

    public void setInstr(PInstr node)
    {
        if(this._instr_ != null)
        {
            this._instr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._instr_ = node;
    }

    public PListeinstr getListeinstr()
    {
        return this._listeinstr_;
    }

    public void setListeinstr(PListeinstr node)
    {
        if(this._listeinstr_ != null)
        {
            this._listeinstr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listeinstr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._instr_)
            + toString(this._listeinstr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._instr_ == child)
        {
            this._instr_ = null;
            return;
        }

        if(this._listeinstr_ == child)
        {
            this._listeinstr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._instr_ == oldChild)
        {
            setInstr((PInstr) newChild);
            return;
        }

        if(this._listeinstr_ == oldChild)
        {
            setListeinstr((PListeinstr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
