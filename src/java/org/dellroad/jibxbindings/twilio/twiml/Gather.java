
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.twiml;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.dellroad.jibxbindings.twilio.Method;

/**
 * TwiML <code>&lt;Gather&gt;</code> verb.
 */
public class Gather implements Verb {

    public static final int DEFAULT_TIMEOUT = 5;
    public static final String DEFAULT_FINISH_ON_KEY = "#";

    private URI action;
    private Method method = Method.POST;
    private int timeout = DEFAULT_TIMEOUT;
    private String finishOnKey = DEFAULT_FINISH_ON_KEY;
    private int numDigits = Integer.MAX_VALUE;;
    private List<GatherVerb> verbs = new ArrayList<GatherVerb>();

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

    public int getTimeout() {
        return this.timeout;
    }
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getFinishOnKey() {
        return this.finishOnKey;
    }
    public void setFinishOnKey(String finishOnKey) {
        this.finishOnKey = finishOnKey;
    }

    public int getNumDigits() {
        return this.numDigits;
    }
    public void setNumDigits(int numDigits) {
        this.numDigits = numDigits;
    }

    public List<GatherVerb> getVerbs() {
        return this.verbs;
    }
    public void setVerbs(List<GatherVerb> verbs) {
        this.verbs = verbs;
    }
}

