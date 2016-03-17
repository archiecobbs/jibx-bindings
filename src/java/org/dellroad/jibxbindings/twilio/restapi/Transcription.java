
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

/**
 * Represents a <code>&lt;Transcription&gt;</code>.
 */
public class Transcription extends SidAccountResource implements TwilioResponseContent {

    private TranscriptionStatus status;
    private TranscriptionType type;
    private String recordingSid;
    private int duration;
    private String transcriptionText;
    private double price;
    private String priceUnit;
    private APIVersion apiVersion;

    public TranscriptionStatus getStatus() {
        return this.status;
    }
    public void setStatus(TranscriptionStatus status) {
        this.status = status;
    }

    public TranscriptionType getType() {
        return this.type;
    }
    public void setType(TranscriptionType type) {
        this.type = type;
    }

    public String getRecordingSid() {
        return this.recordingSid;
    }
    public void setRecordingSid(String recordingSid) {
        this.recordingSid = recordingSid;
    }

    public int getDuration() {
        return this.duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTranscriptionText() {
        return this.transcriptionText;
    }
    public void setTranscriptionText(String transcriptionText) {
        this.transcriptionText = transcriptionText;
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

    public APIVersion getAPIVersion() {
        return this.apiVersion;
    }
    public void setAPIVersion(APIVersion apiVersion) {
        this.apiVersion = apiVersion;
    }
}

