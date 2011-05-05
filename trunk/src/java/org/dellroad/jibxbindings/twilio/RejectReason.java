
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.twilio;

/**
 * Specifies the reason for a <code>&lt;Reject&gt;</code>.
 */
public enum RejectReason implements TwilioEnum {
    REJECTED("rejected"),
    BUSY("busy");

    private final String xmlName;

    private RejectReason(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String getXMLName() {
        return this.xmlName;
    }
}

