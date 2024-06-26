/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AExp5Exp4 extends PExp4
{
    private PExp5 _exp5_;

    public AExp5Exp4()
    {
        // Constructor
    }

    public AExp5Exp4(
        @SuppressWarnings("hiding") PExp5 _exp5_)
    {
        // Constructor
        setExp5(_exp5_);

    }

    @Override
    public Object clone()
    {
        return new AExp5Exp4(
            cloneNode(this._exp5_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExp5Exp4(this);
    }

    public PExp5 getExp5()
    {
        return this._exp5_;
    }

    public void setExp5(PExp5 node)
    {
        if(this._exp5_ != null)
        {
            this._exp5_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp5_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp5_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp5_ == child)
        {
            this._exp5_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp5_ == oldChild)
        {
            setExp5((PExp5) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
