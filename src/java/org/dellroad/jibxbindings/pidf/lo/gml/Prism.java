
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;

/**
 * GML prism.
 */
public class Prism extends Solid {

    private Surface base;
    private Measure height;

    public Prism() {
    }

    public Prism(String gid, URI srsName, int srsDimension, Surface base, Measure height) {
        super(gid, srsName, srsDimension);
        this.setBase(base);
        this.setHeight(height);
    }

    /**
     * The prism's {@code <gs:base>}.
     */
    public Surface getBase() {
        return this.base;
    }
    public void setBase(Surface base) {
        this.base = base;
    }

    /**
     * The prism's {@code <gs:height>}.
     */
    public Measure getHeight() {
        return this.height;
    }
    public void setHeight(Measure height) {
        this.height = height;
    }

    @Override
    public void visit(GMLObjectSwitch gmlObjectSwitch) {
        gmlObjectSwitch.casePrism(this);
    }

// Cloneable

    @Override
    public Prism clone() {
        final Prism clone = (Prism)super.clone();
        clone.base = this.base != null ? this.base.clone() : null;
        clone.height = this.height != null ? this.height.clone() : null;
        return clone;
    }
}

