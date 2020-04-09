package com.menos.framework;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;

public class MenosEventJournal implements EventJournal {

    @Override
    public Future<Integer> saveEnvelopes(List<EventEnvelope> eventEnvelopes) {
        return null;
    }

    @Override
    public Future<List<EventEnvelope>> getByEntityId(String entityId) {
        return null;
    }

    @Override
    public Future<List<EventEnvelope>> getByTag(Set<String> tags) {
        return null;
    }
}
