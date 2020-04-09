package com.menos.framework;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public final class EventEnvelope {

    private String entityId;

    private int seqNum;

    private String eventType;

    private Optional<Long> unixTime = Optional.empty();

    private byte[] payload;

    private Set<String> tags;

    public EventEnvelope(String entityId, int seqNum, String eventType, Optional<Long> unixTime, byte[] payload, Set<String> tags) {
        this.entityId = entityId;
        this.seqNum = seqNum;
        this.eventType = eventType;
        this.unixTime = unixTime;
        this.payload = payload;
        this.tags = tags;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public int getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(int seqNum) {
        this.seqNum = seqNum;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Optional<Long> getUnixTime() {
        return unixTime;
    }

    public void setUnixTime(Optional<Long> unixTime) {
        this.unixTime = unixTime;
    }

    public byte[] getPayload() {
        return payload;
    }

    public void setPayload(byte[] payload) {
        this.payload = payload;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventEnvelope that = (EventEnvelope) o;
        return seqNum == that.seqNum &&
                entityId.equals(that.entityId) &&
                eventType.equals(that.eventType) &&
                unixTime.equals(that.unixTime) &&
                Arrays.equals(payload, that.payload) &&
                tags.equals(that.tags);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(entityId, seqNum, eventType, unixTime, tags);
        result = 31 * result + Arrays.hashCode(payload);
        return result;
    }

    @Override
    public String toString() {
        return "EventEnvelope{" +
                "entityId='" + entityId + '\'' +
                ", seqNum=" + seqNum +
                ", eventType='" + eventType + '\'' +
                ", unixTime=" + unixTime +
                ", payload=" + Arrays.toString(payload) +
                ", tag=" + tags +
                '}';
    }
}
