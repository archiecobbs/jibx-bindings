
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import org.dellroad.jibxbindings.ParseUtil;
import org.jibx.runtime.JiBXParseException;

/**
 * SMS statuses.
 */
public enum SMSStatus {
    QUEUED("queued"),
    SENDING("sending"),
    SENT("sent"),
    RECEIVING("receiving"),
    RECEIVED("received"),
    FAILED("failed"),
    DELIVERED("delivered"),
    UNDELIVERED("undelivered");

    private final String xmlName;

    private SMSStatus(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String toString() {
        return this.xmlName;
    }

    public static SMSStatus deserializeXML(String string) throws JiBXParseException {
        return ParseUtil.deserializeEnumOrNull(string, SMSStatus.class);
    }
}

