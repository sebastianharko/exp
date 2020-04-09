package com.menos.framework;

public class Entity<S, E, C, R> {

    private String entityId;

    private EventHandler<E, S> eventHandler;

    private CommandHandler<S, C, E, R> commandHandler;

    public Entity(String entityId, EventHandler<E, S> eventHandler, CommandHandler<S, C, E, R> commandHandler) {
        this.entityId = entityId;
        this.eventHandler = eventHandler;
        this.commandHandler = commandHandler;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public EventHandler<E, S> getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler<E, S> eventHandler) {
        this.eventHandler = eventHandler;
    }

    public CommandHandler<S, C, E, R> getCommandHandler() {
        return commandHandler;
    }

    public void setCommandHandler(CommandHandler<S, C, E, R> commandHandler) {
        this.commandHandler = commandHandler;
    }
}
