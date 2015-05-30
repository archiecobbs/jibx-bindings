
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf;

/**
 * PIDF {@code <basic>} element values.
 */
public enum Basic {
    OPEN("open"),
    CLOSED("closed");

    private final String xmlValue;

    private Basic(String xmlValue) {
        this.xmlValue = xmlValue;
    }

    public final String getXMLValue() {
        return this.xmlValue;
    }
}

