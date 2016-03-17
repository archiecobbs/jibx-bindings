
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

/**
 * Represents a <code>&lt;Message&gt;</code>.
 */
public class Message extends SMSMessage {

    private int numSegments;
    private int numMedia;

    public int getNumSegments() {
        return this.numSegments;
    }
    public void setNumSegments(int numSegments) {
        this.numSegments = numSegments;
    }

    public int getNumMedia() {
        return this.numMedia;
    }
    public void setNumMedia(int numMedia) {
        this.numMedia = numMedia;
    }
}

