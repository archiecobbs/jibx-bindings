
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.twiml;

import java.net.URI;

import org.dellroad.jibxbindings.twilio.Method;

/**
 * TwiML <code>&lt;Record&gt;</code> verb.
 */
public class Record implements Verb {

    public static final int DEFAULT_TIMEOUT = 5;
    public static final int DEFAULT_MAX_LENGTH = 60 * 60;
    public static final String DEFAULT_FINISH_ON_KEY = "1234567890*#";

    private URI action;
    private Method method = Method.POST;
    private int timeout = DEFAULT_TIMEOUT;
    private String finishOnKey = DEFAULT_FINISH_ON_KEY;
    private int maxLength = DEFAULT_MAX_LENGTH;
    private boolean transcribe;
    private URI transcribeCallback;
    private boolean playBeep = true;

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

    public int getMaxLength() {
        return this.maxLength;
    }
    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public boolean isTranscribe() {
        return this.transcribe;
    }
    public void setTranscribe(boolean transcribe) {
        this.transcribe = transcribe;
    }

    public URI getTranscribeCallback() {
        return this.transcribeCallback;
    }
    public void setTranscribeCallback(URI transcribeCallback) {
        this.transcribeCallback = transcribeCallback;
    }

    public boolean isPlayBeep() {
        return this.playBeep;
    }
    public void setPlayBeep(boolean playBeep) {
        this.playBeep = playBeep;
    }
}

