
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio;

import org.dellroad.jibxbindings.ParseUtil;
import org.jibx.runtime.JiBXParseException;

/**
 * Specifies which HTTP method to use.
 */
public enum Method {
    GET,
    POST;

    /**
     * Deserialize normally but allow empty string to mean null.
     */
    public static Method deserialize(String string) throws JiBXParseException {
        return ParseUtil.deserializeEnumOrNull(string, Method.class);
    }
}

