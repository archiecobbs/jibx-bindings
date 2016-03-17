
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

/**
 * {@code IfMachine} paramter for outgoing dialing.
 */
public enum IfMachine {
    CONTINUE("Continue"),
    HANGUP("Hangup");

    private final String xmlName;

    private IfMachine(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String toString() {
        return this.xmlName;
    }
}

