
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf;

import java.net.URI;
import java.util.Date;

import org.dellroad.jibxbindings.pidf.lo.GeoPriv;

/**
 * The {@code <dm:device>} element as defined in RFC 4479.
 *
 * @see <a href="http://tools.ietf.org/html/rfc4479">RFC 4479</a>
 */
public class Device implements Component {

    private String id;
    private GeoPriv geoPriv;
    private URI deviceID;
    private LangContent note;
    private Date timestamp;

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public GeoPriv getGeoPriv() {
        return this.geoPriv;
    }
    public void setGeoPriv(GeoPriv geoPriv) {
        this.geoPriv = geoPriv;
    }

    public URI getDeviceID() {
        return this.deviceID;
    }
    public void setDeviceID(URI deviceID) {
        this.deviceID = deviceID;
    }

    public LangContent getNote() {
        return this.note;
    }
    public void setNote(LangContent note) {
        this.note = note;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public void visit(ComponentSwitch componentSwitch) {
        componentSwitch.caseDevice(this);
    }

// Cloneable

    @Override
    public Device clone() {
        final Device clone;
        try {
            clone = (Device)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        clone.geoPriv = this.geoPriv != null ? this.geoPriv.clone() : null;
        clone.note = this.note != null ? this.note.clone() : null;
        return clone;
    }
}

