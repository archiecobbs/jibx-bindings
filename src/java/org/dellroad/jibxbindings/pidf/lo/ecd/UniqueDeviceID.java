
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.ecd;

/**
 * The {@code <dev:UniqueDeviceID>} element.
 */
public class UniqueDeviceID {

    private String typeOfDeviceID;                      // mandatory
    private String content;

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
}

