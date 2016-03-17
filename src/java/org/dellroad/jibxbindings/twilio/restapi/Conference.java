
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

/**
 * Represents a <code>&lt;Conference&gt;</code>.
 */
public class Conference extends NamedAccountResource implements TwilioResponseContent {

    private ConferenceStatus status;
    private APIVersion apiVersion;

    public ConferenceStatus getStatus() {
        return this.status;
    }
    public void setStatus(ConferenceStatus status) {
        this.status = status;
    }

    public APIVersion getAPIVersion() {
        return this.apiVersion;
    }
    public void setAPIVersion(APIVersion apiVersion) {
        this.apiVersion = apiVersion;
    }
}

