/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class APlusP extends PP
{
    private PP _p_;
    private TPlus _plus_;
    private PM _m_;

    public APlusP()
    {
        // Constructor
    }

    public APlusP(
        @SuppressWarnings("hiding") PP _p_,
        @SuppressWarnings("hiding") TPlus _plus_,
        @SuppressWarnings("hiding") PM _m_)
    {
        // Constructor
        setP(_p_);

        setPlus(_plus_);

        setM(_m_);

    }

    @Override
    public Object clone()
    {
        return new APlusP(
            cloneNode(this._p_),
            cloneNode(this._plus_),
            cloneNode(this._m_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPlusP(this);
    }

    public PP getP()
    {
        return this._p_;
    }

    public void setP(PP node)
    {
        if(this._p_ != null)
        {
            this._p_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._p_ = node;
    }

    public TPlus getPlus()
    {
        return this._plus_;
    }

    public void setPlus(TPlus node)
    {
        if(this._plus_ != null)
        {
            this._plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._plus_ = node;
    }

    public PM getM()
    {
        return this._m_;
    }

    public void setM(PM node)
    {
        if(this._m_ != null)
        {
            this._m_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._m_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._p_)
            + toString(this._plus_)
            + toString(this._m_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._p_ == child)
        {
            this._p_ = null;
            return;
        }

        if(this._plus_ == child)
        {
            this._plus_ = null;
            return;
        }

        if(this._m_ == child)
        {
            this._m_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._p_ == oldChild)
        {
            setP((PP) newChild);
            return;
        }

        if(this._plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
            return;
        }

        if(this._m_ == oldChild)
        {
            setM((PM) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
