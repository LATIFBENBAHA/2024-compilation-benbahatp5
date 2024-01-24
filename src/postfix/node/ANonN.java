/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class ANonN extends PN
{
    private TNon _non_;
    private PF _f_;

    public ANonN()
    {
        // Constructor
    }

    public ANonN(
        @SuppressWarnings("hiding") TNon _non_,
        @SuppressWarnings("hiding") PF _f_)
    {
        // Constructor
        setNon(_non_);

        setF(_f_);

    }

    @Override
    public Object clone()
    {
        return new ANonN(
            cloneNode(this._non_),
            cloneNode(this._f_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANonN(this);
    }

    public TNon getNon()
    {
        return this._non_;
    }

    public void setNon(TNon node)
    {
        if(this._non_ != null)
        {
            this._non_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._non_ = node;
    }

    public PF getF()
    {
        return this._f_;
    }

    public void setF(PF node)
    {
        if(this._f_ != null)
        {
            this._f_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._f_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._non_)
            + toString(this._f_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._non_ == child)
        {
            this._non_ = null;
            return;
        }

        if(this._f_ == child)
        {
            this._f_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._non_ == oldChild)
        {
            setNon((TNon) newChild);
            return;
        }

        if(this._f_ == oldChild)
        {
            setF((PF) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
