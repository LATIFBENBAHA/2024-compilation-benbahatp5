/* This file was generated by SableCC (http://www.sablecc.org/). */

package c3aParser.node;

import c3aParser.analysis.*;

@SuppressWarnings("nls")
public final class AAddInst extends PInst
{
    private PAdd _add_;

    public AAddInst()
    {
        // Constructor
    }

    public AAddInst(
        @SuppressWarnings("hiding") PAdd _add_)
    {
        // Constructor
        setAdd(_add_);

    }

    @Override
    public Object clone()
    {
        return new AAddInst(
            cloneNode(this._add_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAddInst(this);
    }

    public PAdd getAdd()
    {
        return this._add_;
    }

    public void setAdd(PAdd node)
    {
        if(this._add_ != null)
        {
            this._add_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._add_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._add_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._add_ == child)
        {
            this._add_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._add_ == oldChild)
        {
            setAdd((PAdd) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
