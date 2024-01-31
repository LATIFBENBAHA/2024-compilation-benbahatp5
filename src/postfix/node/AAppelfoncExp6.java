/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AAppelfoncExp6 extends PExp6
{
    private PAppelfonc _appelfonc_;

    public AAppelfoncExp6()
    {
        // Constructor
    }

    public AAppelfoncExp6(
        @SuppressWarnings("hiding") PAppelfonc _appelfonc_)
    {
        // Constructor
        setAppelfonc(_appelfonc_);

    }

    @Override
    public Object clone()
    {
        return new AAppelfoncExp6(
            cloneNode(this._appelfonc_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAppelfoncExp6(this);
    }

    public PAppelfonc getAppelfonc()
    {
        return this._appelfonc_;
    }

    public void setAppelfonc(PAppelfonc node)
    {
        if(this._appelfonc_ != null)
        {
            this._appelfonc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._appelfonc_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._appelfonc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._appelfonc_ == child)
        {
            this._appelfonc_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._appelfonc_ == oldChild)
        {
            setAppelfonc((PAppelfonc) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}