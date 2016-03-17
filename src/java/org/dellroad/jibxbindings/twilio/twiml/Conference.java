
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.twiml;

import org.dellroad.jibxbindings.twilio.Method;

/**
 * TwiML <code>&lt;Conference&gt;</code> noun.
 */
public class Conference {

    public static final int MAXIMUM_MAX_PARTICIPANTS = 40;
    public static final int DEFAULT_MAX_PARTICIPANTS = MAXIMUM_MAX_PARTICIPANTS;

    private boolean muted;
    private boolean beep = true;
    private boolean startConferenceOnEnter = true;
    private boolean endConferenceOnExit;
    private String waitUrl;
    private Method waitMethod = Method.POST;
    private int maxParticipants = DEFAULT_MAX_PARTICIPANTS;
    private String room;

    public boolean isMuted() {
        return this.muted;
    }
    public void setMuted(boolean muted) {
        this.muted = muted;
    }

    public boolean isBeep() {
        return this.beep;
    }
    public void setBeep(boolean beep) {
        this.beep = beep;
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

    public String getWaitUrl() {
        return this.waitUrl;
    }
    public void setWaitUrl(String waitUrl) {
        this.waitUrl = waitUrl;
    }

    public Method getWaitMethod() {
        return this.waitMethod;
    }
    public void setWaitMethod(Method waitMethod) {
        this.waitMethod = waitMethod;
    }

    public int getMaxParticipants() {
        return this.maxParticipants;
    }
    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public String getRoom() {
        return this.room;
    }
    public void setRoom(String room) {
        this.room = room;
    }
}

