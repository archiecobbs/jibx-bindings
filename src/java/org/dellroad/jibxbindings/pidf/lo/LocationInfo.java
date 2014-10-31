
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo;

import org.dellroad.jibxbindings.pidf.lo.gml.GMLObject;

/**
 * The {@code <gp:location-info>} element as defined in RFC 4119.
 */
public class LocationInfo {

    private CivicAddress civicAddress;
    private GMLObject gmlObject;
    private float confidence = Float.NaN;

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

    public float getConfidence() {
        return this.confidence;
    }
    public void setConfidence(float confidence) {
        this.confidence = confidence;
    }

    // JiBX

    public boolean isConfidencePresent() {
        return !Float.isNaN(this.confidence);
    }
}

