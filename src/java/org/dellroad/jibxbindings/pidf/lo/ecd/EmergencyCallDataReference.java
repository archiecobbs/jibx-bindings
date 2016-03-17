
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.ecd;

import java.net.URI;

/**
 * The {@code <ad:EmergencyCallDataReference>} element.
 */
public class EmergencyCallDataReference implements Cloneable {

    private String purpose;                     // mandatory
    private URI ref;                            // mandatory

    public EmergencyCallDataReference() {
    }

    public EmergencyCallDataReference(String purpose, URI ref) {
        this.setPurpose(purpose);
        this.setRef(ref);
    }

    public String getPurpose() {
        return this.purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public URI getRef() {
        return this.ref;
    }
    public void setRef(URI ref) {
        this.ref = ref;
    }

// Cloneable

    @Override
    public EmergencyCallDataReference clone() {
        try {
            return (EmergencyCallDataReference)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

