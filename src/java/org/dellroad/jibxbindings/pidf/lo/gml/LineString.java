
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;

/**
 * GML LineStrings.
 *
 * This class assumes the nested element is {@code gml:posList}.
 * The {@code <gml:pos>} and {@code <gml:pointProperty>} options are not supported.
 */
public class LineString extends Curve {

    private double[] posList;

    public LineString() {
    }

    public LineString(String gid, URI srsName, int srsDimension, double[] posList) {
        super(gid, srsName, srsDimension);
        this.setPosList(posList);
    }

    /**
     * The {@code posList} element.
     */
    public double[] getPosList() {
        return this.posList;
    }
    public void setPosList(double[] posList) {
        this.posList = posList;
    }

    @Override
    public void visit(GMLObjectSwitch gmlObjectSwitch) {
        gmlObjectSwitch.caseLineString(this);
    }

// Cloneable

    @Override
    public LineString clone() {
        final LineString clone = (LineString)super.clone();
        clone.posList = this.posList != null ? this.posList.clone() : null;
        return clone;
    }
}

