
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

/**
 * Represents an <code>&lt;Participant&gt;</code>.
 */
public class Participant extends AccountResource implements TwilioResponseContent {

    private String callSid;
    private String conferenceSid;
    private boolean muted;
    private boolean startConferenceOnEnter;
    private boolean endConferenceOnExit;

    public String getCallSid() {
        return this.callSid;
    }
    public void setCallSid(String callSid) {
        this.callSid = callSid;
    }

    public String getConferenceSid() {
        return this.conferenceSid;
    }
    public void setConferenceSid(String conferenceSid) {
        this.conferenceSid = conferenceSid;
    }

    public boolean isMuted() {
        return this.muted;
    }
    public void setMuted(boolean muted) {
        this.muted = muted;
    }

    public boolean isStartConferenceOnEnter() {
        return this.startConferenceOnEnter;
    }
    public void setStartConferenceOnEnter(boolean startConferenceOnEnter) {
        this.startConferenceOnEnter = startConferenceOnEnter;
    }

    public boolean isEndConferenceOnExit() {
        return this.endConferenceOnExit;
    }
    public void setEndConferenceOnExit(boolean endConferenceOnExit) {
        this.endConferenceOnExit = endConferenceOnExit;
    }
}

