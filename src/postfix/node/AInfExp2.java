/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AInfExp2 extends PExp2
{
    private PExp2 _exp2_;
    private TLess _less_;
    private PExp3 _exp3_;

    public AInfExp2()
    {
        // Constructor
    }

    public AInfExp2(
        @SuppressWarnings("hiding") PExp2 _exp2_,
        @SuppressWarnings("hiding") TLess _less_,
        @SuppressWarnings("hiding") PExp3 _exp3_)
    {
        // Constructor
        setExp2(_exp2_);

        setLess(_less_);

        setExp3(_exp3_);

    }

    @Override
    public Object clone()
    {
        return new AInfExp2(
            cloneNode(this._exp2_),
            cloneNode(this._less_),
            cloneNode(this._exp3_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInfExp2(this);
    }

    public PExp2 getExp2()
    {
        return this._exp2_;
    }

    public void setExp2(PExp2 node)
    {
        if(this._exp2_ != null)
        {
            this._exp2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp2_ = node;
    }

    public TLess getLess()
    {
        return this._less_;
    }

    public void setLess(TLess node)
    {
        if(this._less_ != null)
        {
            this._less_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._less_ = node;
    }

    public PExp3 getExp3()
    {
        return this._exp3_;
    }

    public void setExp3(PExp3 node)
    {
        if(this._exp3_ != null)
        {
            this._exp3_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp3_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp2_)
            + toString(this._less_)
            + toString(this._exp3_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp2_ == child)
        {
            this._exp2_ = null;
            return;
        }

        if(this._less_ == child)
        {
            this._less_ = null;
            return;
        }

        if(this._exp3_ == child)
        {
            this._exp3_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp2_ == oldChild)
        {
            setExp2((PExp2) newChild);
            return;
        }

        if(this._less_ == oldChild)
        {
            setLess((TLess) newChild);
            return;
        }

        if(this._exp3_ == oldChild)
        {
            setExp3((PExp3) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
