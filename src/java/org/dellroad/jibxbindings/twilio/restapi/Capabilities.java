
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

/**
 * Represents a <code>&lt;Capabilities&gt;</code> element inside an <code>&lt;IncomingPhoneNumber&gt;</code>.
 */
public class Capabilities {

    private boolean voice;
    private boolean sms;

    public boolean isVoice() {
        return this.voice;
    }
    public void setVoice(boolean voice) {
        this.voice = voice;
    }

    public boolean isSMS() {
        return this.sms;
    }
    public void setSMS(boolean sms) {
        this.sms = sms;
    }
}

