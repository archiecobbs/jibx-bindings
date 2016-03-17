
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import org.dellroad.jibxbindings.ParseUtil;
import org.jibx.runtime.JiBXParseException;

/**
 * Transcription types. These are not documented so I'm just guessing.
 */
public enum TranscriptionType {
    FAST("fast"),
    MEDIUM("medium"),
    SLOW("slow");

    private final String xmlName;

    private TranscriptionType(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String toString() {
        return this.xmlName;
    }

    public static TranscriptionType deserializeXML(String string) throws JiBXParseException {
        return ParseUtil.deserializeEnumOrNull(string, TranscriptionType.class);
    }
}

