package com.menos.framework;

public interface EventHandler<E, S> {

    public S applyEvent(E event);

}
