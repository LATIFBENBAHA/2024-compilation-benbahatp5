/* This file was generated by SableCC (http://www.sablecc.org/). */

package nasmParser.node;

import nasmParser.analysis.*;

@SuppressWarnings("nls")
public final class AIdivInst extends PInst
{
    private POplabel _oplabel_;
    private TIdiv _idiv_;
    private PAr _ar_;

    public AIdivInst()
    {
        // Constructor
    }

    public AIdivInst(
        @SuppressWarnings("hiding") POplabel _oplabel_,
        @SuppressWarnings("hiding") TIdiv _idiv_,
        @SuppressWarnings("hiding") PAr _ar_)
    {
        // Constructor
        setOplabel(_oplabel_);

        setIdiv(_idiv_);

        setAr(_ar_);

    }

    @Override
    public Object clone()
    {
        return new AIdivInst(
            cloneNode(this._oplabel_),
            cloneNode(this._idiv_),
            cloneNode(this._ar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdivInst(this);
    }

    public POplabel getOplabel()
    {
        return this._oplabel_;
    }

    public void setOplabel(POplabel node)
    {
        if(this._oplabel_ != null)
        {
            this._oplabel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._oplabel_ = node;
    }

    public TIdiv getIdiv()
    {
        return this._idiv_;
    }

    public void setIdiv(TIdiv node)
    {
        if(this._idiv_ != null)
        {
            this._idiv_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._idiv_ = node;
    }

    public PAr getAr()
    {
        return this._ar_;
    }

    public void setAr(PAr node)
    {
        if(this._ar_ != null)
        {
            this._ar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._oplabel_)
            + toString(this._idiv_)
            + toString(this._ar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._oplabel_ == child)
        {
            this._oplabel_ = null;
            return;
        }

        if(this._idiv_ == child)
        {
            this._idiv_ = null;
            return;
        }

        if(this._ar_ == child)
        {
            this._ar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._oplabel_ == oldChild)
        {
            setOplabel((POplabel) newChild);
            return;
        }

        if(this._idiv_ == oldChild)
        {
            setIdiv((TIdiv) newChild);
            return;
        }

        if(this._ar_ == oldChild)
        {
            setAr((PAr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}