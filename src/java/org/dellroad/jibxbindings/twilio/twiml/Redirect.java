
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.twiml;

import java.net.URI;

import org.dellroad.jibxbindings.twilio.Method;

/**
 * TwiML <code>&lt;Redirect&gt;</code> verb.
 */
public class Redirect implements Verb {

    private Method method = Method.POST;
    private URI target;

    public Redirect() {
    }

    public Redirect(URI target) {
        this.setTarget(target);
    }

    public Method getMethod() {
        return this.method;
    }
    public void setMethod(Method method) {
        this.method = method;
    }

    public URI getTarget() {
        return this.target;
    }
    public void setTarget(URI target) {
        this.target = target;
    }
}

