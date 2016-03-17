
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

/**
 * Abstract superclass for XML represenations of REST resources associated with a specific account
 * and which are uniquely identified via a <code>&lt;Sid&gt;</code> element.
 */
public abstract class SidAccountResource extends AccountResource {

    private String sid;

    /**
     * Get the unique string that identifies this resource.
     */
    public String getSid() {
        return this.sid;
    }
    public void setSid(String sid) {
        this.sid = sid;
    }
}

