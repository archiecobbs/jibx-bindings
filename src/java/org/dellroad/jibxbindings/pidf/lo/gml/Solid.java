
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;

/**
 * GML solids.
 */
public abstract class Solid extends GeometricPrimitive {

    protected Solid() {
    }

    protected Solid(String gid, URI srsName, int srsDimension) {
        super(gid, srsName, srsDimension);
    }

// Cloneable

    @Override
    public Solid clone() {
        return (Solid)super.clone();
    }
}

