
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.ecd;

/**
 * Support superclass.
 */
public abstract class AbstractDataProviderReferencing implements Cloneable {

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

