
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

/**
 * Superclass for GML objects.
 */
public abstract class GMLObject implements Cloneable {

    private String gmlId;

    protected GMLObject() {
    }

    protected GMLObject(String gmlId) {
        this.setGMLId(gmlId);
    }

    /**
     * The id from the {@code gml:id} attribute.
     */
    public String getGMLId() {
        return this.gmlId;
    }
    public void setGMLId(String gmlId) {
        this.gmlId = gmlId;
    }

    /**
     * Apply {@link GMLObjectSwitch} visitor pattern.
     */
    public abstract void visit(GMLObjectSwitch gmlObjectSwitch);

// Cloneable

    @Override
    public GMLObject clone() {
        try {
            return (GMLObject)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

