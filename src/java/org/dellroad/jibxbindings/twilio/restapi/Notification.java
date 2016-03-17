
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.net.URI;
import java.util.Date;

import org.dellroad.jibxbindings.twilio.Method;

/**
 * Represents a <code>&lt;Notification&gt;</code>.
 */
public class Notification extends SidAccountResource implements TwilioResponseContent {

    public static final int LOG_ERROR = 0;
    public static final int LOG_WARNING = 1;

    private String callSid;
    private APIVersion apiVersion;
    private int log;
    private int errorCode;
    private URI moreInfo;
    private String messageText;
    private Date messageDate;
    private URI requestURL;
    private Method requestMethod;
    private String requestVariables;
    private String responseHeaders;
    private String responseBody;

    public String getCallSid() {
        return this.callSid;
    }
    public void setCallSid(String callSid) {
        this.callSid = callSid;
    }

    public APIVersion getAPIVersion() {
        return this.apiVersion;
    }
    public void setAPIVersion(APIVersion apiVersion) {
        this.apiVersion = apiVersion;
    }

    public int getLog() {
        return this.log;
    }
    public void setLog(int log) {
        this.log = log;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public URI getMoreInfo() {
        return this.moreInfo;
    }
    public void setMoreInfo(URI moreInfo) {
        this.moreInfo = moreInfo;
    }

    public String getMessageText() {
        return this.messageText;
    }
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Date getMessageDate() {
        return this.messageDate;
    }
    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    public URI getRequestURL() {
        return this.requestURL;
    }
    public void setRequestURL(URI requestURL) {
        this.requestURL = requestURL;
    }

    public Method getRequestMethod() {
        return this.requestMethod;
    }
    public void setRequestMethod(Method requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestVariables() {
        return this.requestVariables;
    }
    public void setRequestVariables(String requestVariables) {
        this.requestVariables = requestVariables;
    }

    public String getResponseHeaders() {
        return this.responseHeaders;
    }
    public void setResponseHeaders(String responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    public String getResponseBody() {
        return this.responseBody;
    }
    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }
}

