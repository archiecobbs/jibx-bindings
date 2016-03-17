
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

/**
 * Represents an <code>&lt;AvailablePhoneNumber&gt;</code>.
 */
public class AvailablePhoneNumber {

    private String friendlyName;
    private String phoneNumber;
    private String lata;
    private String rateCenter;
    private double latitude;
    private double longitude;
    private String region;
    private String postalCode;
    private String isoCountry;

    public String getFriendlyName() {
        return this.friendlyName;
    }
    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLATA() {
        return this.lata;
    }
    public void setLATA(String lata) {
        this.lata = lata;
    }

    public String getRateCenter() {
        return this.rateCenter;
    }
    public void setRateCenter(String rateCenter) {
        this.rateCenter = rateCenter;
    }

    public double getLatitude() {
        return this.latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getRegion() {
        return this.region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return this.postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getISOCountry() {
        return this.isoCountry;
    }
    public void setISOCountry(String isoCountry) {
        this.isoCountry = isoCountry;
    }
}

