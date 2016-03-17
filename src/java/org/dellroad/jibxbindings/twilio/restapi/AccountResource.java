
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

/**
 * Abstract superclass for XML represenations of REST resources associated with a specific account.
 */
public abstract class AccountResource extends Resource {

    private String accountSid;

    /**
     * Get the unique ID of the account associated with this resource.
     */
    public String getAccountSid() {
        return this.accountSid;
    }
    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }
}

