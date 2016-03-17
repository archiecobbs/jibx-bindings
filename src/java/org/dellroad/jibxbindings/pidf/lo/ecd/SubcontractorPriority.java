
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.ecd;

/**
 * {@code <SubcontractorPriority>} element values.
 */
public enum SubcontractorPriority {
    SUB("sub"),
    MAIN("main");

    private final String xmlValue;

    private SubcontractorPriority(String xmlValue) {
        this.xmlValue = xmlValue;
    }

    public final String getXMLValue() {
        return this.xmlValue;
    }
}

