/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AEpsilonfiveListedecvar extends PListedecvar
{
    private TEpsilon _epsilon_;

    public AEpsilonfiveListedecvar()
    {
        // Constructor
    }

    public AEpsilonfiveListedecvar(
        @SuppressWarnings("hiding") TEpsilon _epsilon_)
    {
        // Constructor
        setEpsilon(_epsilon_);

    }

    @Override
    public Object clone()
    {
        return new AEpsilonfiveListedecvar(
            cloneNode(this._epsilon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEpsilonfiveListedecvar(this);
    }

    public TEpsilon getEpsilon()
    {
        return this._epsilon_;
    }

    public void setEpsilon(TEpsilon node)
    {
        if(this._epsilon_ != null)
        {
            this._epsilon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._epsilon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._epsilon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._epsilon_ == child)
        {
            this._epsilon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._epsilon_ == oldChild)
        {
            setEpsilon((TEpsilon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
