
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

/**
 * API versions. Enum values are ordered from oldest to most recent.
 */
public enum APIVersion {
    V_2008_08_01("2008-08-01"),
    V_2010_04_01("2010-04-01");

    /**
     * The API version that this library version adheres to (always the last and most recent enum value).
     */
    public static final APIVersion CURRENT = APIVersion.values()[APIVersion.values().length - 1];

    private final String xmlName;

    private APIVersion(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String toString() {
        return this.xmlName;
    }
}

