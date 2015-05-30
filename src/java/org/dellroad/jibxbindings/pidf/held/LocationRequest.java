
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.held;

/**
 * The {@code <held:locationRequest>} XML element.
 */
public class LocationRequest implements Cloneable {

    /**
     * Possible value for {@link #getResponseTime}.
     */
    public static final String EMERGENCY_DISPATCH = "emergencyDispatch";

    /**
     * Possible value for {@link #getResponseTime}.
     */
    public static final String EMERGENCY_ROUTING = "emergencyRouting";

    private String responseTime;
    private LocationType locationType;

    public String getResponseTime() {
        return this.responseTime;
    }
    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    /**
     * Parse the response time as a seconds value.
     *
     * @throws NumberFormatException if response time is not parseable, e.g., equal to {@link #EMERGENCY_DISPATCH}
     */
    public int getReponseTimeInSeconds() {
        return Integer.parseInt(this.responseTime, 10);
    }

    public LocationType getLocationType() {
        return this.locationType;
    }
    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
    }

// Cloneable

    @Override
    public LocationRequest clone() {
        final LocationRequest clone;
        try {
            clone = (LocationRequest)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        clone.locationType = this.locationType != null ? this.locationType.clone() : null;
        return clone;
    }
}

