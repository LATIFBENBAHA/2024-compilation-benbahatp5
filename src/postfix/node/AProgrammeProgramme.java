/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AProgrammeProgramme extends PProgramme
{
    private PListedecvar _listedecvar_;
    private PListedecfonc _listedecfonc_;

    public AProgrammeProgramme()
    {
        // Constructor
    }

    public AProgrammeProgramme(
        @SuppressWarnings("hiding") PListedecvar _listedecvar_,
        @SuppressWarnings("hiding") PListedecfonc _listedecfonc_)
    {
        // Constructor
        setListedecvar(_listedecvar_);

        setListedecfonc(_listedecfonc_);

    }

    @Override
    public Object clone()
    {
        return new AProgrammeProgramme(
            cloneNode(this._listedecvar_),
            cloneNode(this._listedecfonc_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProgrammeProgramme(this);
    }

    public PListedecvar getListedecvar()
    {
        return this._listedecvar_;
    }

    public void setListedecvar(PListedecvar node)
    {
        if(this._listedecvar_ != null)
        {
            this._listedecvar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listedecvar_ = node;
    }

    public PListedecfonc getListedecfonc()
    {
        return this._listedecfonc_;
    }

    public void setListedecfonc(PListedecfonc node)
    {
        if(this._listedecfonc_ != null)
        {
            this._listedecfonc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listedecfonc_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._listedecvar_)
            + toString(this._listedecfonc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._listedecvar_ == child)
        {
            this._listedecvar_ = null;
            return;
        }

        if(this._listedecfonc_ == child)
        {
            this._listedecfonc_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._listedecvar_ == oldChild)
        {
            setListedecvar((PListedecvar) newChild);
            return;
        }

        if(this._listedecfonc_ == oldChild)
        {
            setListedecfonc((PListedecfonc) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}