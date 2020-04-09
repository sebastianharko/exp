package com.menos.framework;

public interface CommandHandler<S, C, E, R> {

    public Result<E, R> handleCommand(S state, C command);

}
