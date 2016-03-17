
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.twiml;

/**
 * Specifies voice used in {@link Say} elements.
 */
public enum Voice {
    MAN,
    WOMAN,
    ALICE;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}

