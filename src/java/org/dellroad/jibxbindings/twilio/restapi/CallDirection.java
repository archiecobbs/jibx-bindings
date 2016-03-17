
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import org.dellroad.jibxbindings.ParseUtil;
import org.jibx.runtime.JiBXParseException;

/**
 * Call directionality.
 */
public enum CallDirection {

    /**
     * Inbound call.
     */
    INBOUND("inbound", false),

    /**
     * Outbound, initiated via the REST API.
     */
    OUTBOUND_API("outbound-api", true),

    /**
     * Outbound, initiated by a TwiML <code>&lt;Dial&gt;</code> verb.
     */
    OUTBOUND_DIAL("outbound-dial", true);

    private final String xmlName;
    private final boolean outbound;

    private CallDirection(String xmlName, boolean outbound) {
        this.xmlName = xmlName;
        this.outbound = outbound;
    }

    /**
     * Is the call inbound or outbound?
     *
     * @return false for {@link #INBOUND}, true for all other values
     */
    public boolean isOutbound() {
        return this.outbound;
    }

    @Override
    public String toString() {
        return this.xmlName;
    }

    public static CallDirection deserializeXML(String string) throws JiBXParseException {
        return ParseUtil.deserializeEnumOrNull(string, CallDirection.class);
    }
}

