package fMS.aspects;

import fMS.aspects.Visitor;

@SuppressWarnings("all")
public interface Visitable {
  public abstract void accept(final Visitor v);
}
