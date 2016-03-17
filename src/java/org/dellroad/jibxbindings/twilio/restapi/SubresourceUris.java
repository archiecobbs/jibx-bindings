
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.net.URI;

/**
 * Represents an <code>&lt;SubresourceUris&gt;</code> element.
 * Some of these properties are only approppriate for certain containing elements.
 */
public class SubresourceUris {

    private URI availablePhoneNumbers;
    private URI calls;
    private URI conferences;
    private URI incomingPhoneNumbers;
    private URI notifications;
    private URI outgoingCallerIds;
    private URI recordings;
    private URI sandbox;
    private URI smsMessages;
    private URI messages;
    private URI media;
    private URI transcriptions;
    private URI participants;

    public URI getAvailablePhoneNumbers() {
        return this.availablePhoneNumbers;
    }
    public void setAvailablePhoneNumbers(URI availablePhoneNumbers) {
        this.availablePhoneNumbers = availablePhoneNumbers;
    }

    public URI getCalls() {
        return this.calls;
    }
    public void setCalls(URI calls) {
        this.calls = calls;
    }

    public URI getConferences() {
        return this.conferences;
    }
    public void setConferences(URI conferences) {
        this.conferences = conferences;
    }

    public URI getIncomingPhoneNumbers() {
        return this.incomingPhoneNumbers;
    }
    public void setIncomingPhoneNumbers(URI incomingPhoneNumbers) {
        this.incomingPhoneNumbers = incomingPhoneNumbers;
    }

    public URI getNotifications() {
        return this.notifications;
    }
    public void setNotifications(URI notifications) {
        this.notifications = notifications;
    }

    public URI getOutgoingCallerIds() {
        return this.outgoingCallerIds;
    }
    public void setOutgoingCallerIds(URI outgoingCallerIds) {
        this.outgoingCallerIds = outgoingCallerIds;
    }

    public URI getRecordings() {
        return this.recordings;
    }
    public void setRecordings(URI recordings) {
        this.recordings = recordings;
    }

    public URI getSandbox() {
        return this.sandbox;
    }
    public void setSandbox(URI sandbox) {
        this.sandbox = sandbox;
    }

    public URI getSMSMessages() {
        return this.smsMessages;
    }
    public void setSMSMessages(URI smsMessages) {
        this.smsMessages = smsMessages;
    }

    public URI getMessages() {
        return this.messages;
    }
    public void setMessages(URI messages) {
        this.messages = messages;
    }

    public URI getMedia() {
        return this.media;
    }
    public void setMedia(URI media) {
        this.media = media;
    }

    public URI getTranscriptions() {
        return this.transcriptions;
    }
    public void setTranscriptions(URI transcriptions) {
        this.transcriptions = transcriptions;
    }

    public URI getParticipants() {
        return this.participants;
    }
    public void setParticipants(URI participants) {
        this.participants = participants;
    }
}

