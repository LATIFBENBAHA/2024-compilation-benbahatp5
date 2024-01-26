/* This file was generated by SableCC (http://www.sablecc.org/). */

package nasmParser.node;

import nasmParser.analysis.*;

@SuppressWarnings("nls")
public final class AComplexFilename extends PFilename
{
    private PLabel _prefix_;
    private TDot _dot_;
    private PLabel _suffix_;

    public AComplexFilename()
    {
        // Constructor
    }

    public AComplexFilename(
        @SuppressWarnings("hiding") PLabel _prefix_,
        @SuppressWarnings("hiding") TDot _dot_,
        @SuppressWarnings("hiding") PLabel _suffix_)
    {
        // Constructor
        setPrefix(_prefix_);

        setDot(_dot_);

        setSuffix(_suffix_);

    }

    @Override
    public Object clone()
    {
        return new AComplexFilename(
            cloneNode(this._prefix_),
            cloneNode(this._dot_),
            cloneNode(this._suffix_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComplexFilename(this);
    }

    public PLabel getPrefix()
    {
        return this._prefix_;
    }

    public void setPrefix(PLabel node)
    {
        if(this._prefix_ != null)
        {
            this._prefix_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._prefix_ = node;
    }

    public TDot getDot()
    {
        return this._dot_;
    }

    public void setDot(TDot node)
    {
        if(this._dot_ != null)
        {
            this._dot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dot_ = node;
    }

    public PLabel getSuffix()
    {
        return this._suffix_;
    }

    public void setSuffix(PLabel node)
    {
        if(this._suffix_ != null)
        {
            this._suffix_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._suffix_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._prefix_)
            + toString(this._dot_)
            + toString(this._suffix_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._prefix_ == child)
        {
            this._prefix_ = null;
            return;
        }

        if(this._dot_ == child)
        {
            this._dot_ = null;
            return;
        }

        if(this._suffix_ == child)
        {
            this._suffix_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._prefix_ == oldChild)
        {
            setPrefix((PLabel) newChild);
            return;
        }

        if(this._dot_ == oldChild)
        {
            setDot((TDot) newChild);
            return;
        }

        if(this._suffix_ == oldChild)
        {
            setSuffix((PLabel) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}