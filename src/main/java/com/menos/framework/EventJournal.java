package com.menos.framework;

import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;

public interface EventJournal {

    public Future<Integer> saveEnvelopes(List<EventEnvelope> eventEnvelopes);

    public Future<List<EventEnvelope>> getByEntityId(String entityId);

    public Future<List<EventEnvelope>> getByTag(Set<String> tags);

}
