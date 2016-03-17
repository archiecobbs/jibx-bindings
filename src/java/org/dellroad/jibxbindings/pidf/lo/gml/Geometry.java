
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Superclass for GML geometry objects.
 */
public abstract class Geometry extends GMLObject {

    private String gid;
    private URI srsName;
    private int srsDimension;
    private List<String> axisLabels = new ArrayList<String>();
    private List<String> uomLabels = new ArrayList<String>();

    protected Geometry() {
    }

    protected Geometry(String gid, URI srsName, int srsDimension) {
        this.setGid(gid);
        this.setSrsName(srsName);
        this.setSrsDimension(srsDimension);
    }

    /**
     * The {@code gid} attribute.
     */
    public String getGid() {
        return this.gid;
    }
    public void setGid(String gid) {
        this.gid = gid;
    }

    /**
     * The {@code srsName} attribute.
     */
    public URI getSrsName() {
        return this.srsName;
    }
    public void setSrsName(URI srsName) {
        this.srsName = srsName;
    }

    /**
     * The {@code srsDimension} attribute.
     */
    public int getSrsDimension() {
        return this.srsDimension;
    }
    public void setSrsDimension(int srsDimension) {
        this.srsDimension = srsDimension;
    }

    /**
     * The {@code axisLabels} attribute.
     */
    public List<String> getAxisLabels() {
        return this.axisLabels;
    }
    public void setAxisLabels(List<String> axisLabels) {
        this.axisLabels = axisLabels;
    }

    /**
     * The {@code uomLabels} attribute.
     */
    public List<String> getUomLabels() {
        return this.uomLabels;
    }
    public void setUomLabels(List<String> uomLabels) {
        this.uomLabels = uomLabels;
    }

// Cloneable

    @Override
    public Geometry clone() {
        final Geometry clone = (Geometry)super.clone();
        clone.axisLabels = this.axisLabels != null ? new ArrayList<>(this.axisLabels) : null;
        clone.uomLabels = this.uomLabels != null ? new ArrayList<>(this.uomLabels) : null;
        return clone;
    }
}

