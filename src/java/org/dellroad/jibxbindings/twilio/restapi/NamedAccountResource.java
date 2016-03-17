
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

/**
 * Represents an {@link SidAccountResource} that has a friendly name.
 */
public abstract class NamedAccountResource extends SidAccountResource {

    private String friendlyName;

    public String getFriendlyName() {
        return this.friendlyName;
    }
    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }
}

