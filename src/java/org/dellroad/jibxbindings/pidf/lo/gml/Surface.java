
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;

/**
 * GML surfaces.
 */
public abstract class Surface extends GeometricPrimitive {

    private static final long serialVersionUID = 578636500157778282L;

    protected Surface() {
    }

    protected Surface(String gid, URI srsName, int srsDimension) {
        super(gid, srsName, srsDimension);
    }

// Cloneable

    @Override
    public Surface clone() {
        return (Surface)super.clone();
    }
}

