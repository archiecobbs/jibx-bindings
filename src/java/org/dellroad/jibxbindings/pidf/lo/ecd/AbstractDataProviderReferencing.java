
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.ecd;

import java.io.Serializable;

/**
 * Support superclass.
 */
public abstract class AbstractDataProviderReferencing implements Cloneable, Serializable {

    private static final long serialVersionUID = 4866632452628360362L;

    private String dataProviderReference;                   // mandatory

    protected AbstractDataProviderReferencing() {
    }

    protected AbstractDataProviderReferencing(String dataProviderReference) {
        this.setDataProviderReference(dataProviderReference);
    }

    public String getDataProviderReference() {
        return this.dataProviderReference;
    }
    public void setDataProviderReference(String dataProviderReference) {
        this.dataProviderReference = dataProviderReference;
    }

// Cloneable

    @Override
    public AbstractDataProviderReferencing clone() {
        try {
            return (AbstractDataProviderReferencing)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

