
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

/**
 * GML prism.
 */
public class Prism extends Solid {

    private Surface base;
    private Measure height;

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
}

