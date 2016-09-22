
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;

/**
 * GML circle.
 */
public class Circle extends Surface {

    private static final long serialVersionUID = -6609085723256871714L;

    private double[] center;
    private Measure radius;

    public Circle() {
    }

    public Circle(String gid, URI srsName, int srsDimension, double[] center, Measure radius) {
        super(gid, srsName, srsDimension);
        this.setCenter(center);
        this.setRadius(radius);
    }

    /**
     * The center of the circle.
     */
    public double[] getCenter() {
        return this.center;
    }
    public void setCenter(double[] center) {
        this.center = center;
    }

    /**
     * The circle's {@code <gs:radius>}.
     */
    public Measure getRadius() {
        return this.radius;
    }
    public void setRadius(Measure radius) {
        this.radius = radius;
    }

    @Override
    public void visit(GMLObjectSwitch gmlObjectSwitch) {
        gmlObjectSwitch.caseCircle(this);
    }

// Cloneable

    @Override
    public Circle clone() {
        final Circle clone = (Circle)super.clone();
        clone.center = this.center != null ? this.center.clone() : null;
        clone.radius = this.radius != null ? this.radius.clone() : null;
        return clone;
    }
}

