
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.net.URI;

/**
 * Represents a <code>&lt;RestException&gt;</code>.
 */
public class RestException implements TwilioResponseContent {

    private int status;
    private String message;
    private int code;
    private URI moreInfo;

    public RestException() {
    }

    public RestException(int status, String message, int code, URI moreInfo) {
        this.status = status;
        this.message = message;
        this.code = code;
        this.moreInfo = moreInfo;
    }

    public int getStatus() {
        return this.status;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public URI getMoreInfo() {
        return this.moreInfo;
    }
    public void setMoreInfo(URI moreInfo) {
        this.moreInfo = moreInfo;
    }
}

