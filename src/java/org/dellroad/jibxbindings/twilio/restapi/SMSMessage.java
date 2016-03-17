
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.util.Date;

/**
 * Represents a <code>&lt;SMSMessage&gt;</code>.
 */
public class SMSMessage extends SidAccountResource implements TwilioResponseContent {

    private Date dateSent;
    private String to;
    private String from;
    private String body;
    private SMSStatus status;
    private SMSDirection direction;
    private double price;
    private String priceUnit;
    private int errorCode;
    private String errorMessage;
    private APIVersion apiVersion;

    public Date getDateSent() {
        return this.dateSent;
    }
    public void setDateSent(Date dateSent) {
        this.dateSent = dateSent;
    }

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

    public String getBody() {
        return this.body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public SMSStatus getStatus() {
        return this.status;
    }
    public void setStatus(SMSStatus status) {
        this.status = status;
    }

    public SMSDirection getDirection() {
        return this.direction;
    }
    public void setDirection(SMSDirection direction) {
        this.direction = direction;
    }

    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getPriceUnit() {
        return this.priceUnit;
    }
    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * The version of the Twilio API used to process the SMS message.
     */
    public APIVersion getAPIVersion() {
        return this.apiVersion;
    }
    public void setAPIVersion(APIVersion apiVersion) {
        this.apiVersion = apiVersion;
    }
}

