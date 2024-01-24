/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AEntierType extends PType
{
    private TEntier _entier_;

    public AEntierType()
    {
        // Constructor
    }

    public AEntierType(
        @SuppressWarnings("hiding") TEntier _entier_)
    {
        // Constructor
        setEntier(_entier_);

    }

    @Override
    public Object clone()
    {
        return new AEntierType(
            cloneNode(this._entier_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEntierType(this);
    }

    public TEntier getEntier()
    {
        return this._entier_;
    }

    public void setEntier(TEntier node)
    {
        if(this._entier_ != null)
        {
            this._entier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._entier_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._entier_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._entier_ == child)
        {
            this._entier_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._entier_ == oldChild)
        {
            setEntier((TEntier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
