
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.twiml;

import org.dellroad.jibxbindings.ParseUtil;
import org.jibx.runtime.JiBXParseException;

/**
 * Call statuses.
 */
public enum CallStatus {
    QUEUED("queued", false),
    RINGING("ringing", false),
    IN_PROGRESS("in-progress", false),
    COMPLETED("completed", true),
    FAILED("failed", true),
    BUSY("busy", true),
    NO_ANSWER("no-answer", true),
    CANCELED("canceled", true);

    private final String xmlName;
    private final boolean terminal;

    private CallStatus(String xmlName, boolean terminal) {
        this.xmlName = xmlName;
        this.terminal = terminal;
    }

    /**
     * Determine whether this represents a terminal state, i.e., the call is hung up.
     */
    public boolean isTerminal() {
        return this.terminal;
    }

    @Override
    public String toString() {
        return this.xmlName;
    }

    public static CallStatus deserializeXML(String string) throws JiBXParseException {
        return ParseUtil.deserializeEnumOrNull(string, CallStatus.class);
    }
}

