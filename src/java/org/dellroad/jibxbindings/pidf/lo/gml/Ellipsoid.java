
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;

/**
 * GML ellipsoid.
 */
public class Ellipsoid extends Solid {

    private static final long serialVersionUID = 6729942009048799027L;

    private double[] center;
    private Measure semiMajorAxis;
    private Measure semiMinorAxis;
    private Measure verticalAxis;
    private Measure orientation;

    public Ellipsoid() {
    }

    public Ellipsoid(String gid, URI srsName, int srsDimension,
      double[] center, Measure semiMajorAxis, Measure semiMinorAxis, Measure verticalAxis, Measure orientation) {
        super(gid, srsName, srsDimension);
        this.setCenter(center);
        this.setSemiMajorAxis(semiMajorAxis);
        this.setSemiMinorAxis(semiMinorAxis);
        this.setVerticalAxis(verticalAxis);
        this.setOrientation(orientation);
    }

    /**
     * The center of the ellipsoid.
     */
    public double[] getCenter() {
        return this.center;
    }
    public void setCenter(double[] center) {
        this.center = center;
    }

    /**
     * The ellipsoid's {@code <gs:semiMajorAxis>}.
     */
    public Measure getSemiMajorAxis() {
        return this.semiMajorAxis;
    }
    public void setSemiMajorAxis(Measure semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    /**
     * The ellipsoid's {@code <gs:semiMinorAxis>}.
     */
    public Measure getSemiMinorAxis() {
        return this.semiMinorAxis;
    }
    public void setSemiMinorAxis(Measure semiMinorAxis) {
        this.semiMinorAxis = semiMinorAxis;
    }

    /**
     * The ellipsoid's {@code <gs:verticalAxis>}.
     */
    public Measure getVerticalAxis() {
        return this.verticalAxis;
    }
    public void setVerticalAxis(Measure verticalAxis) {
        this.verticalAxis = verticalAxis;
    }

    /**
     * The ellipsoid's {@code <gs:orientation>}.
     */
    public Measure getOrientation() {
        return this.orientation;
    }
    public void setOrientation(Measure orientation) {
        this.orientation = orientation;
    }

    @Override
    public void visit(GMLObjectSwitch gmlObjectSwitch) {
        gmlObjectSwitch.caseEllipsoid(this);
    }

// Cloneable

    @Override
    public Ellipsoid clone() {
        final Ellipsoid clone = (Ellipsoid)super.clone();
        clone.center = this.center != null ? this.center.clone() : null;
        clone.semiMajorAxis = this.semiMajorAxis != null ? this.semiMajorAxis.clone() : null;
        clone.semiMinorAxis = this.semiMinorAxis != null ? this.semiMinorAxis.clone() : null;
        clone.verticalAxis = this.verticalAxis != null ? this.verticalAxis.clone() : null;
        clone.orientation = this.orientation != null ? this.orientation.clone() : null;
        return clone;
    }
}

