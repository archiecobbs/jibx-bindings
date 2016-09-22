
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;

/**
 * GML {@code <point>} objects.
 */
public class Point extends GeometricPrimitive {

    private static final long serialVersionUID = -8421037127328679413L;

    private double[] pos;

    public Point() {
    }

    public Point(String gid, URI srsName, int srsDimension, double[] pos) {
        super(gid, srsName, srsDimension);
        this.setPos(pos);
    }

    /**
     * The {@code pos} element.
     */
    public double[] getPos() {
        return this.pos;
    }
    public void setPos(double[] pos) {
        this.pos = pos;
    }

    @Override
    public void visit(GMLObjectSwitch gmlObjectSwitch) {
        gmlObjectSwitch.casePoint(this);
    }

// Cloneable

    @Override
    public Point clone() {
        final Point clone = (Point)super.clone();
        clone.pos = this.pos != null ? this.pos.clone() : null;
        return clone;
    }
}

