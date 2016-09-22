
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo;

import java.io.Serializable;

import org.dellroad.jibxbindings.pidf.LangContent;

/**
 * The {@code <gp:geopriv>} element as defined in RFC 4119.
 */
public class GeoPriv implements Cloneable, Serializable {

    private static final long serialVersionUID = -8421701457531625791L;

    private LocationInfo locationInfo;
    private UsageRules usageRules;
    private LangContent method;
    private ProvidedBy providedBy;

    public LocationInfo getLocationInfo() {
        return this.locationInfo;
    }
    public void setLocationInfo(LocationInfo locationInfo) {
        this.locationInfo = locationInfo;
    }

    public UsageRules getUsageRules() {
        return this.usageRules;
    }
    public void setUsageRules(UsageRules usageRules) {
        this.usageRules = usageRules;
    }

    public LangContent getMethod() {
        return this.method;
    }
    public void setMethod(LangContent method) {
        this.method = method;
    }

    public ProvidedBy getProvidedBy() {
        return this.providedBy;
    }
    public void setProvidedBy(ProvidedBy providedBy) {
        this.providedBy = providedBy;
    }

// Cloneable

    @Override
    public GeoPriv clone() {
        final GeoPriv clone;
        try {
            clone = (GeoPriv)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        clone.locationInfo = this.locationInfo != null ? this.locationInfo.clone() : null;
        clone.usageRules = this.usageRules != null ? this.usageRules.clone() : null;
        clone.method = this.method != null ? this.method.clone() : null;
        clone.providedBy = this.providedBy != null ? this.providedBy.clone() : null;
        return clone;
    }
}

