
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf;

import java.io.Serializable;
import java.net.URI;

/**
 * PIDF {@code <contact>} element.
 */
public class Contact implements Cloneable, Serializable {

    private static final long serialVersionUID = 1688544846640343745L;

    private URI uri;
    private float priority;

    public float getPriority() {
        return this.priority;
    }
    public void setPriority(float priority) {
        this.priority = priority;
    }

    public URI getURI() {
        return this.uri;
    }
    public void setURI(URI uri) {
        this.uri = uri;
    }

// Cloneable

    @Override
    public Contact clone() {
        try {
            return (Contact)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

