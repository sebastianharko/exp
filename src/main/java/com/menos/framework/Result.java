package com.menos.framework;

import java.util.List;
import java.util.Objects;

public final class Result<E, R> {

    private List<E> events;
    private R response;

    public Result(List<E> events, R response) {
        this.events = events;
        this.response = response;
    }

    public List<E> getEvents() {
        return events;
    }

    public R getResponse() {
        return response;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result<?, ?> result = (Result<?, ?>) o;
        return events.equals(result.events) &&
                response.equals(result.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(events, response);
    }

    @Override
    public String toString() {
        return "Result{" +
                "events=" + events +
                ", response=" + response +
                '}';
    }

    public void setEvents(List<E> events) {
        this.events = events;
    }

    public void setResponse(R response) {
        this.response = response;
    }
}
