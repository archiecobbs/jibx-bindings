
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;

/**
 * GML arc band.
 */
public class ArcBand extends Surface {

    private static final long serialVersionUID = -4933947741608138063L;

    private double[] center;
    private Measure innerRadius;
    private Measure outerRadius;
    private Measure startAngle;
    private Measure openingAngle;

    public ArcBand() {
    }

    public ArcBand(String gid, URI srsName, int srsDimension,
      double[] center, Measure innerRadius, Measure outerRadius, Measure startAngle, Measure openingAngle) {
        super(gid, srsName, srsDimension);
        this.setCenter(center);
        this.setInnerRadius(innerRadius);
        this.setOuterRadius(outerRadius);
        this.setStartAngle(startAngle);
        this.setOpeningAngle(openingAngle);
    }

    /**
     * The center of the arc band.
     */
    public double[] getCenter() {
        return this.center;
    }
    public void setCenter(double[] center) {
        this.center = center;
    }

    /**
     * The {@code <gs:innerRadius>}.
     */
    public Measure getInnerRadius() {
        return this.innerRadius;
    }
    public void setInnerRadius(Measure innerRadius) {
        this.innerRadius = innerRadius;
    }

    /**
     * The {@code <gs:outerRadius>}.
     */
    public Measure getOuterRadius() {
        return this.outerRadius;
    }
    public void setOuterRadius(Measure outerRadius) {
        this.outerRadius = outerRadius;
    }

    /**
     * The {@code <gs:startAngle>}.
     */
    public Measure getStartAngle() {
        return this.startAngle;
    }
    public void setStartAngle(Measure startAngle) {
        this.startAngle = startAngle;
    }

    /**
     * The {@code <gs:openingAngle>}.
     */
    public Measure getOpeningAngle() {
        return this.openingAngle;
    }
    public void setOpeningAngle(Measure openingAngle) {
        this.openingAngle = openingAngle;
    }

    @Override
    public void visit(GMLObjectSwitch gmlObjectSwitch) {
        gmlObjectSwitch.caseArcBand(this);
    }

// Cloneable

    @Override
    public ArcBand clone() {
        final ArcBand clone = (ArcBand)super.clone();
        clone.center = this.center != null ? this.center.clone() : null;
        clone.innerRadius = this.innerRadius != null ? this.innerRadius.clone() : null;
        clone.outerRadius = this.outerRadius != null ? this.outerRadius.clone() : null;
        clone.startAngle = this.startAngle != null ? this.startAngle.clone() : null;
        clone.openingAngle = this.openingAngle != null ? this.openingAngle.clone() : null;
        return clone;
    }
}

