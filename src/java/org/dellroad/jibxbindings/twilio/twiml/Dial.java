
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.twiml;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.dellroad.jibxbindings.twilio.Method;

/**
 * TwiML <code>&lt;Dial&gt;</code> verb.
 */
public class Dial implements Verb {

    public static final int DEFAULT_TIMEOUT = 30;
    public static final int DEFAULT_TIME_LIMIT = 4 * 60 * 60;

    private URI action;
    private Method method = Method.POST;
    private int timeout = DEFAULT_TIMEOUT;
    private boolean hangupOnStar;
    private int timeLimit = DEFAULT_TIME_LIMIT;
    private String callerId;
    private List<Number> numbers = new ArrayList<Number>();
    private Conference conference;

    public Dial() {
    }

    public Dial(Number number) {
        this.numbers.add(number);
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

    public int getTimeout() {
        return this.timeout;
    }
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public boolean isHangupOnStar() {
        return this.hangupOnStar;
    }
    public void setHangupOnStar(boolean hangupOnStar) {
        this.hangupOnStar = hangupOnStar;
    }

    public int getTimeLimit() {
        return this.timeLimit;
    }
    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getCallerId() {
        return this.callerId;
    }
    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    public List<Number> getNumbers() {
        return this.numbers;
    }
    public void setNumbers(List<Number> numbers) {
        this.numbers = numbers;
    }

    public Conference getConference() {
        return this.conference;
    }
    public void setConference(Conference conference) {
        this.conference = conference;
    }
}

