
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.twiml;

import java.net.URI;

import org.dellroad.jibxbindings.twilio.Method;

/**
 * TwiML <code>&lt;Sms&gt;</code> verb.
 */
public class Sms implements Verb {

    private String to;
    private String from;
    private URI action;
    private Method method = Method.POST;
    private URI statusCallback;
    private String text;

    public String getTo() {
        return this.to;
    }
    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return this.from;
    }
    public void setFrom(String from) {
        this.from = from;
    }

    public URI getAction() {
        return this.action;
    }
    public void setAction(URI action) {
        this.action = action;
    }

    public Method getMethod() {
        return this.method;
    }
    public void setMethod(Method method) {
        this.method = method;
    }

    public URI getStatusCallback() {
        return this.statusCallback;
    }
    public void setStatusCallback(URI statusCallback) {
        this.statusCallback = statusCallback;
    }

    public String getText() {
        return this.text;
    }
    public void setText(String text) {
        this.text = text;
    }
}

