
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.twiml;

/**
 * TwiML <code>&lt;Pause&gt;</code> verb.
 */
public class Pause implements GatherVerb {

    public static final int DEFAULT_LENGTH = 1;

    private int length = DEFAULT_LENGTH;

    public int getLength() {
        return this.length;
    }
    public void setLength(int length) {
        this.length = length;
    }
}

