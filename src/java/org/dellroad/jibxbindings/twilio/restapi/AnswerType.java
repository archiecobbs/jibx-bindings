
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import org.dellroad.jibxbindings.ParseUtil;
import org.jibx.runtime.JiBXParseException;

/**
 * Type of thing that answered a call.
 */
public enum AnswerType {
    HUMAN("human"),
    MACHINE("machine");

    private final String xmlName;

    private AnswerType(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String toString() {
        return this.xmlName;
    }

    public static AnswerType deserializeXML(String string) throws JiBXParseException {
        return ParseUtil.deserializeEnumOrNull(string, AnswerType.class);
    }
}

