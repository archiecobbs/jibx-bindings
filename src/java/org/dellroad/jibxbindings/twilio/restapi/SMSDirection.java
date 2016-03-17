
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import org.dellroad.jibxbindings.ParseUtil;
import org.jibx.runtime.JiBXParseException;

/**
 * SMS directionality.
 */
public enum SMSDirection {

    /**
     * Inbound SMS.
     */
    INBOUND("inbound", false),

    /**
     * Outbound, initiated via the REST API.
     */
    OUTBOUND_API("outbound-api", true),

    /**
     * Outbound, initiated during a call.
     */
    OUTBOUND_CALL("outbound-call", true),

    /**
     * Outbound, initiated in response to an incoming SMS.
     */
    OUTBOUND_REPLY("outbound-reply", true);

    private final String xmlName;
    private final boolean outbound;

    private SMSDirection(String xmlName, boolean outbound) {
        this.xmlName = xmlName;
        this.outbound = outbound;
    }

    /**
     * Is the SMS inbound or outbound?
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

    public static SMSDirection deserializeXML(String string) throws JiBXParseException {
        return ParseUtil.deserializeEnumOrNull(string, SMSDirection.class);
    }
}

