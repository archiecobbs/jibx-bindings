
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.ecd;

import java.io.Serializable;

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
}

