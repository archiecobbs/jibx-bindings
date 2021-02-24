
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.dellroad.jibxbindings.pidf.lo.ecd.EmergencyCallDataReference;
import org.dellroad.jibxbindings.pidf.lo.ecd.EmergencyCallDataValue;

/**
 * The {@code <gp:provided-by>} element as defined in RFC 4119.
 */
public class ProvidedBy implements Cloneable, Serializable {

    private static final long serialVersionUID = -8388732473675175733L;

    private List<EmergencyCallDataReference> references = new ArrayList<>();
    private List<EmergencyCallDataValue> values = new ArrayList<>();
    private String dataProviderID;
    private String telURI;
    private URI url;

    public List<EmergencyCallDataReference> getReferences() {
        return this.references;
    }
    public void setReferences(List<EmergencyCallDataReference> references) {
        this.references = references;
    }

    public List<EmergencyCallDataValue> getValues() {
        return this.values;
    }
    public void setValues(List<EmergencyCallDataValue> values) {
        this.values = values;
    }

    public String getDataProviderID() {
        return this.dataProviderID;
    }
    public void setDataProviderID(String dataProviderID) {
        this.dataProviderID = dataProviderID;
    }

    public String getTelURI() {
        return this.telURI;
    }
    public void setTelURI(String telURI) {
        this.telURI = telURI;
    }

    public URI getURL() {
        return this.url;
    }
    public void setURL(URI url) {
        this.url = url;
    }

// Cloneable

    @Override
    public ProvidedBy clone() {
        final ProvidedBy clone;
        try {
            clone = (ProvidedBy)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        if (this.references != null) {
            clone.references = new ArrayList<>(this.references.size());
            for (EmergencyCallDataReference reference : this.references)
                clone.references.add(reference.clone());
        }
        if (this.values != null) {
            clone.values = new ArrayList<>(this.values.size());
            for (EmergencyCallDataValue value : this.values)
                clone.values.add(value.clone());
        }
        return clone;
    }
}

