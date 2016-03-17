
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

/**
 * Represents a <code>&lt;Recording&gt;</code>.
 */
public class Recording extends SidAccountResource implements TwilioResponseContent {

    private String callSid;
    private int duration;
    private APIVersion apiVersion;

    public String getCallSid() {
        return this.callSid;
    }
    public void setCallSid(String callSid) {
        this.callSid = callSid;
    }

    public int getDuration() {
        return this.duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public APIVersion getAPIVersion() {
        return this.apiVersion;
    }
    public void setAPIVersion(APIVersion apiVersion) {
        this.apiVersion = apiVersion;
    }
}

