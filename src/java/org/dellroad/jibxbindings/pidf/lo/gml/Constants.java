
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Some GML constants.
 */
public final class Constants {

    /**
     * Coordinate Reference System: WGS-84 and EPSG-4326.
     */
    public static final URI URN_OCG_DEF_CRS_EPSG_4326;

    /**
     * Coordinate Reference System: EPSG-4979.
     */
    public static final URI URN_OCG_DEF_CRS_EPSG_4979;

    /**
     * Unit of Measurement: distance in meters.
     */
    public static final URI URN_OCG_DEF_UOM_EPSG_9001;

    /**
     * Unit of Measurement: angle in radians.
     */
    public static final URI URN_OCG_DEF_UOM_EPSG_9101;

    /**
     * Unit of Measurement: angle in degrees.
     */
    public static final URI URN_OCG_DEF_UOM_EPSG_9102;

    static {
        try {
            URN_OCG_DEF_CRS_EPSG_4326 = new URI("urn:ogc:def:crs:EPSG::4326");
            URN_OCG_DEF_CRS_EPSG_4979 = new URI("urn:ogc:def:crs:EPSG::4979");
            URN_OCG_DEF_UOM_EPSG_9001 = new URI("urn:ogc:def:uom:EPSG::9001");
            URN_OCG_DEF_UOM_EPSG_9101 = new URI("urn:ogc:def:uom:EPSG::9101");
            URN_OCG_DEF_UOM_EPSG_9102 = new URI("urn:ogc:def:uom:EPSG::9102");
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    private Constants() {
    }
}

