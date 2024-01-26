/* This file was generated by SableCC (http://www.sablecc.org/). */

package saParser.node;

import saParser.analysis.*;

@SuppressWarnings("nls")
public final class ATantqueInst extends PInst
{
    private TPo _po_;
    private TSainsttantque _sainsttantque_;
    private PExp _exp_;
    private PInst _inst_;
    private TPf _pf_;

    public ATantqueInst()
    {
        // Constructor
    }

    public ATantqueInst(
        @SuppressWarnings("hiding") TPo _po_,
        @SuppressWarnings("hiding") TSainsttantque _sainsttantque_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") PInst _inst_,
        @SuppressWarnings("hiding") TPf _pf_)
    {
        // Constructor
        setPo(_po_);

        setSainsttantque(_sainsttantque_);

        setExp(_exp_);

        setInst(_inst_);

        setPf(_pf_);

    }

    @Override
    public Object clone()
    {
        return new ATantqueInst(
            cloneNode(this._po_),
            cloneNode(this._sainsttantque_),
            cloneNode(this._exp_),
            cloneNode(this._inst_),
            cloneNode(this._pf_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATantqueInst(this);
    }

    public TPo getPo()
    {
        return this._po_;
    }

    public void setPo(TPo node)
    {
        if(this._po_ != null)
        {
            this._po_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._po_ = node;
    }

    public TSainsttantque getSainsttantque()
    {
        return this._sainsttantque_;
    }

    public void setSainsttantque(TSainsttantque node)
    {
        if(this._sainsttantque_ != null)
        {
            this._sainsttantque_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sainsttantque_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public PInst getInst()
    {
        return this._inst_;
    }

    public void setInst(PInst node)
    {
        if(this._inst_ != null)
        {
            this._inst_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inst_ = node;
    }

    public TPf getPf()
    {
        return this._pf_;
    }

    public void setPf(TPf node)
    {
        if(this._pf_ != null)
        {
            this._pf_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pf_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._po_)
            + toString(this._sainsttantque_)
            + toString(this._exp_)
            + toString(this._inst_)
            + toString(this._pf_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._po_ == child)
        {
            this._po_ = null;
            return;
        }

        if(this._sainsttantque_ == child)
        {
            this._sainsttantque_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._inst_ == child)
        {
            this._inst_ = null;
            return;
        }

        if(this._pf_ == child)
        {
            this._pf_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._po_ == oldChild)
        {
            setPo((TPo) newChild);
            return;
        }

        if(this._sainsttantque_ == oldChild)
        {
            setSainsttantque((TSainsttantque) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._inst_ == oldChild)
        {
            setInst((PInst) newChild);
            return;
        }

        if(this._pf_ == oldChild)
        {
            setPf((TPf) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}