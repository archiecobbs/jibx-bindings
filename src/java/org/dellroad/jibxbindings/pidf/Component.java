
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf;

import org.dellroad.jibxbindings.pidf.lo.GeoPriv;

/**
 * Implemented by types that can immediately nest inside a {@code <presence>} element.
 */
public interface Component extends Cloneable {

    /**
     * Apply visitor pattern.
     */
    void visit(ComponentSwitch componentSwitch);

    /**
     * Get the nested {@link GeoPriv}, if any.
     */
    GeoPriv getGeoPriv();

    /**
     * Clone this instance.
     */
    Component clone();
}

