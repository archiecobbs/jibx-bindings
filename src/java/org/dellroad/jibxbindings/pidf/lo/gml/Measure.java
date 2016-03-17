
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;

/**
 * GML measure objects.
 */
public class Measure implements Cloneable {

    private URI uom;
    private double value;

    public Measure() {
    }

    public Measure(URI uom, double value) {
        this.setUOM(uom);
        this.setValue(value);
    }

    /**
     * The measure's Unit of Measurement (UOM).
     *
     * @see Constants
     */
    public URI getUOM() {
        return this.uom;
    }
    public void setUOM(URI uom) {
        this.uom = uom;
    }

    /**
     * The measure's value.
     */
    public double getValue() {
        return this.value;
    }
    public void setValue(double value) {
        this.value = value;
    }

// Cloneable

    @Override
    public Measure clone() {
        try {
            return (Measure)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

