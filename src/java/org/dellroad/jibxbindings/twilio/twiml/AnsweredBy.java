
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.twiml;

/**
 * Specifies if an answering machine was detected or not.
 */
public enum AnsweredBy {
    HUMAN("human"),
    MACHINE("machine");

    private final String xmlName;

    private AnsweredBy(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String toString() {
        return this.xmlName;
    }
}

