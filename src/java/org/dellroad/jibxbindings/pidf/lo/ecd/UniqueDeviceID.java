
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.ecd;

import java.io.Serializable;
import java.util.Objects;

/**
 * The {@code <dev:UniqueDeviceID>} element.
 */
public class UniqueDeviceID implements Cloneable, Serializable {

    private static final long serialVersionUID = -6181959074337882052L;

    private String typeOfDeviceID;                      // mandatory
    private String content;

    public UniqueDeviceID() {
    }

    public UniqueDeviceID(String typeOfDeviceID, String content) {
        this.setTypeOfDeviceID(typeOfDeviceID);
        this.setContent(content);
    }

    public String getTypeOfDeviceID() {
        return this.typeOfDeviceID;
    }
    public void setTypeOfDeviceID(String typeOfDeviceID) {
        this.typeOfDeviceID = typeOfDeviceID;
    }

    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }

// Cloneable

    @Override
    public UniqueDeviceID clone() {
        try {
            return (UniqueDeviceID)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

// Object

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        final UniqueDeviceID that = (UniqueDeviceID)obj;
        return Objects.equals(this.typeOfDeviceID, that.typeOfDeviceID) && Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.typeOfDeviceID) ^ Objects.hashCode(this.content);
    }
}

