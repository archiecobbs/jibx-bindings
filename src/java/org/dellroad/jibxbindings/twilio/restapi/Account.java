
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

/**
 * Represents an <code>&lt;Account&gt;</code>.
 */
public class Account extends Resource implements TwilioResponseContent {

    private String sid;
    private String friendlyName;
    private AccountStatus status;
    private AccountType type;
    private String authToken;

    public String getSid() {
        return this.sid;
    }
    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getFriendlyName() {
        return this.friendlyName;
    }
    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public AccountStatus getStatus() {
        return this.status;
    }
    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public AccountType getType() {
        return this.type;
    }
    public void setType(AccountType type) {
        this.type = type;
    }

    public String getAuthToken() {
        return this.authToken;
    }
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}

