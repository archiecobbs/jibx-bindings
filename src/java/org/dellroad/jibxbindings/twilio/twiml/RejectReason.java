
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.twiml;

import org.dellroad.jibxbindings.ParseUtil;
import org.jibx.runtime.JiBXParseException;

/**
 * Specifies the reason for a <code>&lt;Reject&gt;</code>.
 */
public enum RejectReason {
    REJECTED("rejected"),
    BUSY("busy");

    private final String xmlName;

    private RejectReason(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String toString() {
        return this.xmlName;
    }

    public static RejectReason deserializeXML(String string) throws JiBXParseException {
        return ParseUtil.deserializeEnumOrNull(string, RejectReason.class);
    }
}

