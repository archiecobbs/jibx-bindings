
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.twiml;

import java.net.URI;

/**
 * TwiML <code>&lt;Number&gt;</code> noun.
 */
public class Number {

    private String sendDigits;
    private URI url;
    private String number;

    public Number() {
    }

    public Number(String number) {
        this.setNumber(number);
    }

    public String getSendDigits() {
        return this.sendDigits;
    }
    public void setSendDigits(String sendDigits) {
        this.sendDigits = sendDigits;
    }

    public URI getURL() {
        return this.url;
    }
    public void setURL(URI url) {
        this.url = url;
    }

    public String getNumber() {
        return this.number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
}

