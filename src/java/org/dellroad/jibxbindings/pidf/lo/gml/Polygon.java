
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;

/**
 * GML polygon.
 */
public class Polygon extends Surface {

    private LinearRing exterior;

    public Polygon() {
    }

    public Polygon(String gid, URI srsName, int srsDimension, LinearRing exterior) {
        super(gid, srsName, srsDimension);
        this.setExterior(exterior);
    }

    /**
     * The polygon's {@code <gml:exterior>}.
     */
    public LinearRing getExterior() {
        return this.exterior;
    }
    public void setExterior(LinearRing exterior) {
        this.exterior = exterior;
    }

    @Override
    public void visit(GMLObjectSwitch gmlObjectSwitch) {
        gmlObjectSwitch.casePolygon(this);
    }

// Cloneable

    @Override
    public Polygon clone() {
        final Polygon clone = (Polygon)super.clone();
        clone.exterior = this.exterior != null ? this.exterior.clone() : null;
        return clone;
    }
}

