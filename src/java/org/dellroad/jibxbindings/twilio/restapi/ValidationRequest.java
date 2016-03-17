
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

/**
 * Represents a <code>&lt;ValidationRequest&gt;</code>.
 */
public class ValidationRequest implements TwilioResponseContent {

    private String accountSid;
    private String phoneNumber;
    private String friendlyName;
    private String validationCode;

    public String getAccountSid() {
        return this.accountSid;
    }
    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFriendlyName() {
        return this.friendlyName;
    }
    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getValidationCode() {
        return this.validationCode;
    }
    public void setValidationCode(String validationCode) {
        this.validationCode = validationCode;
    }
}

