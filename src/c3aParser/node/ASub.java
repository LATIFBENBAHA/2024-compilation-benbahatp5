/* This file was generated by SableCC (http://www.sablecc.org/). */

package c3aParser.node;

import c3aParser.analysis.*;

@SuppressWarnings("nls")
public final class ASub extends PSub
{
    private PEtiqop _etiqop_;
    private PTv _result_;
    private TAff _aff_;
    private PCtv _op1_;
    private TMoins _moins_;
    private PCtv _op2_;

    public ASub()
    {
        // Constructor
    }

    public ASub(
        @SuppressWarnings("hiding") PEtiqop _etiqop_,
        @SuppressWarnings("hiding") PTv _result_,
        @SuppressWarnings("hiding") TAff _aff_,
        @SuppressWarnings("hiding") PCtv _op1_,
        @SuppressWarnings("hiding") TMoins _moins_,
        @SuppressWarnings("hiding") PCtv _op2_)
    {
        // Constructor
        setEtiqop(_etiqop_);

        setResult(_result_);

        setAff(_aff_);

        setOp1(_op1_);

        setMoins(_moins_);

        setOp2(_op2_);

    }

    @Override
    public Object clone()
    {
        return new ASub(
            cloneNode(this._etiqop_),
            cloneNode(this._result_),
            cloneNode(this._aff_),
            cloneNode(this._op1_),
            cloneNode(this._moins_),
            cloneNode(this._op2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASub(this);
    }

    public PEtiqop getEtiqop()
    {
        return this._etiqop_;
    }

    public void setEtiqop(PEtiqop node)
    {
        if(this._etiqop_ != null)
        {
            this._etiqop_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._etiqop_ = node;
    }

    public PTv getResult()
    {
        return this._result_;
    }

    public void setResult(PTv node)
    {
        if(this._result_ != null)
        {
            this._result_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._result_ = node;
    }

    public TAff getAff()
    {
        return this._aff_;
    }

    public void setAff(TAff node)
    {
        if(this._aff_ != null)
        {
            this._aff_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aff_ = node;
    }

    public PCtv getOp1()
    {
        return this._op1_;
    }

    public void setOp1(PCtv node)
    {
        if(this._op1_ != null)
        {
            this._op1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._op1_ = node;
    }

    public TMoins getMoins()
    {
        return this._moins_;
    }

    public void setMoins(TMoins node)
    {
        if(this._moins_ != null)
        {
            this._moins_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._moins_ = node;
    }

    public PCtv getOp2()
    {
        return this._op2_;
    }

    public void setOp2(PCtv node)
    {
        if(this._op2_ != null)
        {
            this._op2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._op2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._etiqop_)
            + toString(this._result_)
            + toString(this._aff_)
            + toString(this._op1_)
            + toString(this._moins_)
            + toString(this._op2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._etiqop_ == child)
        {
            this._etiqop_ = null;
            return;
        }

        if(this._result_ == child)
        {
            this._result_ = null;
            return;
        }

        if(this._aff_ == child)
        {
            this._aff_ = null;
            return;
        }

        if(this._op1_ == child)
        {
            this._op1_ = null;
            return;
        }

        if(this._moins_ == child)
        {
            this._moins_ = null;
            return;
        }

        if(this._op2_ == child)
        {
            this._op2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._etiqop_ == oldChild)
        {
            setEtiqop((PEtiqop) newChild);
            return;
        }

        if(this._result_ == oldChild)
        {
            setResult((PTv) newChild);
            return;
        }

        if(this._aff_ == oldChild)
        {
            setAff((TAff) newChild);
            return;
        }

        if(this._op1_ == oldChild)
        {
            setOp1((PCtv) newChild);
            return;
        }

        if(this._moins_ == oldChild)
        {
            setMoins((TMoins) newChild);
            return;
        }

        if(this._op2_ == oldChild)
        {
            setOp2((PCtv) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
