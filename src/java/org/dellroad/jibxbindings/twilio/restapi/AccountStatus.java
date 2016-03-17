
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

/**
 * Account status.
 */
public enum AccountStatus {
    ACTIVE("active"),
    SUSPENDED("suspended"),
    CLOSED("closed");

    private final String xmlName;

    private AccountStatus(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String toString() {
        return this.xmlName;
    }
}

