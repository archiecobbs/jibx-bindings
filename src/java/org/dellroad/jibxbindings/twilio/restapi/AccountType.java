
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

/**
 * Account type.
 */
public enum AccountType {
    TRIAL("Trial"),
    FULL("Full");

    private final String xmlName;

    private AccountType(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String toString() {
        return this.xmlName;
    }
}

