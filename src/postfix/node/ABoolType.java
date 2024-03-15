/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class ABoolType extends PType
{
    private TBool _bool_;

    public ABoolType()
    {
        // Constructor
    }

    public ABoolType(
        @SuppressWarnings("hiding") TBool _bool_)
    {
        // Constructor
        setBool(_bool_);

    }

    @Override
    public Object clone()
    {
        return new ABoolType(
            cloneNode(this._bool_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABoolType(this);
    }

    public TBool getBool()
    {
        return this._bool_;
    }

    public void setBool(TBool node)
    {
        if(this._bool_ != null)
        {
            this._bool_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bool_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._bool_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._bool_ == child)
        {
            this._bool_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._bool_ == oldChild)
        {
            setBool((TBool) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
