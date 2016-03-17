
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf;

import org.dellroad.jibxbindings.pidf.lo.GeoPriv;

/**
 * PIDF {@code <status>} element.
 */
public class Status implements Cloneable {

    private Basic basic;
    private GeoPriv geoPriv;

    public Basic getBasic() {
        return this.basic;
    }
    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public GeoPriv getGeoPriv() {
        return this.geoPriv;
    }
    public void setGeoPriv(GeoPriv geoPriv) {
        this.geoPriv = geoPriv;
    }

// Cloneable

    @Override
    public Status clone() {
        final Status clone;
        try {
            clone = (Status)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        clone.geoPriv = this.geoPriv != null ? this.geoPriv.clone() : null;
        return clone;
    }
}

