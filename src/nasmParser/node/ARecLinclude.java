/* This file was generated by SableCC (http://www.sablecc.org/). */

package nasmParser.node;

import nasmParser.analysis.*;

@SuppressWarnings("nls")
public final class ARecLinclude extends PLinclude
{
    private PInclude _include_;
    private PLinclude _linclude_;

    public ARecLinclude()
    {
        // Constructor
    }

    public ARecLinclude(
        @SuppressWarnings("hiding") PInclude _include_,
        @SuppressWarnings("hiding") PLinclude _linclude_)
    {
        // Constructor
        setInclude(_include_);

        setLinclude(_linclude_);

    }

    @Override
    public Object clone()
    {
        return new ARecLinclude(
            cloneNode(this._include_),
            cloneNode(this._linclude_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARecLinclude(this);
    }

    public PInclude getInclude()
    {
        return this._include_;
    }

    public void setInclude(PInclude node)
    {
        if(this._include_ != null)
        {
            this._include_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._include_ = node;
    }

    public PLinclude getLinclude()
    {
        return this._linclude_;
    }

    public void setLinclude(PLinclude node)
    {
        if(this._linclude_ != null)
        {
            this._linclude_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._linclude_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._include_)
            + toString(this._linclude_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._include_ == child)
        {
            this._include_ = null;
            return;
        }

        if(this._linclude_ == child)
        {
            this._linclude_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._include_ == oldChild)
        {
            setInclude((PInclude) newChild);
            return;
        }

        if(this._linclude_ == oldChild)
        {
            setLinclude((PLinclude) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
