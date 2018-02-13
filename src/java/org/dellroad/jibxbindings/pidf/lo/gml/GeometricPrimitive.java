
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;

/**
 * GML geometric primitives.
 */
public abstract class GeometricPrimitive extends Geometry {

    private static final long serialVersionUID = -8649316792669442067L;

    protected GeometricPrimitive() {
    }

    protected GeometricPrimitive(String gid, URI srsName, int srsDimension) {
        super(gid, srsName, srsDimension);
    }

// Cloneable

    @Override
    public GeometricPrimitive clone() {
        return (GeometricPrimitive)super.clone();
    }
}

