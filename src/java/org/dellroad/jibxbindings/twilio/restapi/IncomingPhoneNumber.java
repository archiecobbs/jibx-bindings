
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.net.URI;

import org.dellroad.jibxbindings.twilio.Method;

/**
 * Represents an <code>&lt;IncomingPhoneNumber&gt;</code>.
 */
public class IncomingPhoneNumber extends NumberedAccountResource implements TwilioResponseContent {

    private APIVersion apiVersion;
    private URI voiceURL;
    private Method voiceMethod;
    private URI voiceFallbackURL;
    private Method voiceFallbackMethod;
    private URI statusCallback;
    private Method statusCallbackMethod;
    private URI smsURL;
    private Method smsMethod;
    private URI smsFallbackURL;
    private Method smsFallbackMethod;
    private Capabilities capabilities;
    private boolean voiceCallerIdLookup;

    /**
     * Calls to this phone number will start a new TwiML session with this API version.
     */
    public APIVersion getAPIVersion() {
        return this.apiVersion;
    }
    public void setAPIVersion(APIVersion apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * The URL that Twilio should request when somebody dials the phone number.
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
     * A URL that Twilio will request if an error occurs requesting or executing the TwiML
     * defined by the {@link #getVoiceURL voice URL}.
     */
    public URI getVoiceFallbackURL() {
        return this.voiceFallbackURL;
    }
    public void setVoiceFallbackURL(URI voiceFallbackURL) {
        this.voiceFallbackURL = voiceFallbackURL;
    }

    /**
     * The HTTP method to use when requesting the {@link #getVoiceFallbackURL voice fallback URL}.
     */
    public Method getVoiceFallbackMethod() {
        return this.voiceFallbackMethod;
    }
    public void setVoiceFallbackMethod(Method voiceFallbackMethod) {
        this.voiceFallbackMethod = voiceFallbackMethod;
    }

    /**
     * The URL that Twilio will request to pass status parameters (such as call ended) to your application.
     */
    public URI getStatusCallback() {
        return this.statusCallback;
    }
    public void setStatusCallback(URI statusCallback) {
        this.statusCallback = statusCallback;
    }

    /**
     * The HTTP method to use when requesting the {@link #getStatusCallback status callback URL}.
     */
    public Method getStatusCallbackMethod() {
        return this.statusCallbackMethod;
    }
    public void setStatusCallbackMethod(Method statusCallbackMethod) {
        this.statusCallbackMethod = statusCallbackMethod;
    }

    /**
     * The URL that Twilio should request when somebody sends an SMS to the new phone number.
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

    /**
     * A URL that Twilio will request if an error occurs requesting or executing the TwiML
     * defined by the {@link #getSMSURL SMS URL}.
     */
    public URI getSMSFallbackURL() {
        return this.smsFallbackURL;
    }
    public void setSMSFallbackURL(URI smsFallbackURL) {
        this.smsFallbackURL = smsFallbackURL;
    }

    /**
     * The HTTP method to use when requesting the {@link #getSMSFallbackURL SMS fallback URL}.
     */
    public Method getSMSFallbackMethod() {
        return this.smsFallbackMethod;
    }
    public void setSMSFallbackMethod(Method smsFallbackMethod) {
        this.smsFallbackMethod = smsFallbackMethod;
    }

    public Capabilities getCapabilities() {
        return this.capabilities;
    }
    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Do a lookup of a caller's name from the CNAM database and post it to your app?
     */
    public boolean isVoiceCallerIdLookup() {
        return this.voiceCallerIdLookup;
    }
    public void setVoiceCallerIdLookup(boolean voiceCallerIdLookup) {
        this.voiceCallerIdLookup = voiceCallerIdLookup;
    }
}

