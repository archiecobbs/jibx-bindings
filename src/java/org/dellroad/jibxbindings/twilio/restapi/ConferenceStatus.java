
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import org.dellroad.jibxbindings.ParseUtil;
import org.jibx.runtime.JiBXParseException;

/**
 * Conference statuses.
 */
public enum ConferenceStatus {
    INIT("init"),
    IN_PROGRESS("in-progress"),
    COMPLETED("completed");

    private final String xmlName;

    private ConferenceStatus(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String toString() {
        return this.xmlName;
    }

    public static ConferenceStatus deserializeXML(String string) throws JiBXParseException {
        return ParseUtil.deserializeEnumOrNull(string, ConferenceStatus.class);
    }
}

