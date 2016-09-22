
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.held;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The {@code <held:locationType>} XML element.
 */
public class LocationType implements Cloneable, Serializable {

    /**
     * Value for the {@link #types} field meaning any type of response is acceptable.
     */
    public static final String ANY = "any";

    /**
     * Value for the {@link #types} field meaning civic address.
     */
    public static final String CIVIC = "civic";

    /**
     * Value for the {@link #types} field meaning geodetic region.
     */
    public static final String GEODETIC = "geodetic";

    /**
     * Value for the {@link #types} field meaning a dereferencable URI to the actual location.
     */
    public static final String LOCATION_URI = "locationURI";

    private static final long serialVersionUID = 9040970010481886353L;

    private boolean exact;
    private List<String> types = new ArrayList<String>();

    public boolean isExact() {
        return this.exact;
    }
    public void setExact(boolean exact) {
        this.exact = exact;
    }

    public List<String> getTypes() {
        return this.types;
    }
    public void setTypes(List<String> types) {
        this.types = types;
    }

// Cloneable

    @Override
    public LocationType clone() {
        final LocationType clone;
        try {
            clone = (LocationType)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        clone.types = this.types != null ? new ArrayList<>(this.types) : null;
        return clone;
    }
}

