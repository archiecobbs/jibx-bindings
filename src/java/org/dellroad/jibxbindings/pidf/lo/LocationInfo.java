
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo;

import java.io.Serializable;

import org.dellroad.jibxbindings.pidf.lo.gml.GMLObject;

/**
 * The {@code <gp:location-info>} element as defined in RFC 4119.
 */
public class LocationInfo implements Cloneable, Serializable {

    private static final long serialVersionUID = -7692978481044809061L;

    private CivicAddress civicAddress;
    private GMLObject gmlObject;
    private Confidence confidence;

    public CivicAddress getCivicAddress() {
        return this.civicAddress;
    }
    public void setCivicAddress(CivicAddress civicAddress) {
        this.civicAddress = civicAddress;
    }

    public GMLObject getGMLObject() {
        return this.gmlObject;
    }
    public void setGMLObject(GMLObject gmlObject) {
        this.gmlObject = gmlObject;
    }

    public Confidence getConfidence() {
        return this.confidence;
    }
    public void setConfidence(Confidence confidence) {
        this.confidence = confidence;
    }

// Cloneable

    @Override
    public LocationInfo clone() {
        final LocationInfo clone;
        try {
            clone = (LocationInfo)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        clone.civicAddress = this.civicAddress != null ? this.civicAddress.clone() : null;
        clone.gmlObject = this.gmlObject != null ? this.gmlObject.clone() : null;
        clone.confidence = this.confidence != null ? this.confidence.clone() : null;
        return clone;
    }
}

