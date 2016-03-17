
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.net.URI;

import org.dellroad.jibxbindings.twilio.Method;

/**
 * Represents a <code>&lt;TwilioSandbox&gt;</code> element.
 */
public class TwilioSandbox extends AccountResource implements TwilioResponseContent {

    private String pin;
    private String phoneNumber;
    private URI voiceURL;
    private Method voiceMethod;
    private URI smsURL;
    private Method smsMethod;
    private APIVersion apiVersion;

    /**
     * An 8 digit number that gives access to this sandbox.
     */
    public String getPin() {
        return this.pin;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * The phone number of the sandbox.
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * The URL Twilio will request when the sandbox number is called.
     */
    public URI getVoiceURL() {
        return this.voiceURL;
    }
    public void setVoiceURL(URI voiceURL) {
        this.voiceURL = voiceURL;
    }

    /**
     * The HTTP method to use when requesting the {@link #getVoiceURL voice URL}.
     */
    public Method getVoiceMethod() {
        return this.voiceMethod;
    }
    public void setVoiceMethod(Method voiceMethod) {
        this.voiceMethod = voiceMethod;
    }

    /**
     * The URL Twilio will request when receiving an incoming SMS message to the sandbox number.
     */
    public URI getSMSURL() {
        return this.smsURL;
    }
    public void setSMSURL(URI smsURL) {
        this.smsURL = smsURL;
    }

    /**
     * The HTTP method to use when requesting the {@link #getSMSURL SMS URL}.
     */
    public Method getSMSMethod() {
        return this.smsMethod;
    }
    public void setSMSMethod(Method smsMethod) {
        this.smsMethod = smsMethod;
    }

    public APIVersion getAPIVersion() {
        return this.apiVersion;
    }
    public void setAPIVersion(APIVersion apiVersion) {
        this.apiVersion = apiVersion;
    }
}

