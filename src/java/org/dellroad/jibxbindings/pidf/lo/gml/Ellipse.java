
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;

/**
 * GML ellipse.
 */
public class Ellipse extends Surface {

    private double[] center;
    private Measure semiMajorAxis;
    private Measure semiMinorAxis;
    private Measure orientation;

    public Ellipse() {
    }

    public Ellipse(String gid, URI srsName, int srsDimension,
      double[] center, Measure semiMajorAxis, Measure semiMinorAxis, Measure orientation) {
        super(gid, srsName, srsDimension);
        this.setCenter(center);
        this.setSemiMajorAxis(semiMajorAxis);
        this.setSemiMinorAxis(semiMinorAxis);
        this.setOrientation(orientation);
    }

    /**
     * The center of the ellipse.
     */
    public double[] getCenter() {
        return this.center;
    }
    public void setCenter(double[] center) {
        this.center = center;
    }

    /**
     * The ellipse's {@code <gs:semiMajorAxis>}.
     */
    public Measure getSemiMajorAxis() {
        return this.semiMajorAxis;
    }
    public void setSemiMajorAxis(Measure semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    /**
     * The ellipse's {@code <gs:semiMinorAxis>}.
     */
    public Measure getSemiMinorAxis() {
        return this.semiMinorAxis;
    }
    public void setSemiMinorAxis(Measure semiMinorAxis) {
        this.semiMinorAxis = semiMinorAxis;
    }

    /**
     * The ellipse's {@code <gs:orientation>}.
     */
    public Measure getOrientation() {
        return this.orientation;
    }
    public void setOrientation(Measure orientation) {
        this.orientation = orientation;
    }

    @Override
    public void visit(GMLObjectSwitch gmlObjectSwitch) {
        gmlObjectSwitch.caseEllipse(this);
    }

// Cloneable

    @Override
    public Ellipse clone() {
        final Ellipse clone = (Ellipse)super.clone();
        clone.center = this.center != null ? this.center.clone() : null;
        clone.semiMajorAxis = this.semiMajorAxis != null ? this.semiMajorAxis.clone() : null;
        clone.semiMinorAxis = this.semiMinorAxis != null ? this.semiMinorAxis.clone() : null;
        clone.orientation = this.orientation != null ? this.orientation.clone() : null;
        return clone;
    }
}

