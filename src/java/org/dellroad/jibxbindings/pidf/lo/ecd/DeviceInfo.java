
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.ecd;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code <dev:EmergencyCallData.DeviceInfo>} element.
 */
public class DeviceInfo extends AbstractDataProviderReferencing {

    private static final long serialVersionUID = -7084493297634230715L;

    private String deviceClassification;
    private String deviceMfgr;
    private String deviceModelNr;
    private List<UniqueDeviceID> uniqueDeviceIDs = new ArrayList<>();
    private String deviceSpecificData;
    private String deviceSpecificType;

    public DeviceInfo() {
    }

    public DeviceInfo(String dataProviderReference) {
        super(dataProviderReference);
    }

    public String getDeviceClassification() {
        return this.deviceClassification;
    }
    public void setDeviceClassification(String deviceClassification) {
        this.deviceClassification = deviceClassification;
    }

    public String getDeviceMfgr() {
        return this.deviceMfgr;
    }
    public void setDeviceMfgr(String deviceMfgr) {
        this.deviceMfgr = deviceMfgr;
    }

    public String getDeviceModelNr() {
        return this.deviceModelNr;
    }
    public void setDeviceModelNr(String deviceModelNr) {
        this.deviceModelNr = deviceModelNr;
    }

    public List<UniqueDeviceID> getUniqueDeviceIDs() {
        return this.uniqueDeviceIDs;
    }
    public void setUniqueDeviceIDs(List<UniqueDeviceID> uniqueDeviceIDs) {
        this.uniqueDeviceIDs = uniqueDeviceIDs;
    }

    public String getDeviceSpecificData() {
        return this.deviceSpecificData;
    }
    public void setDeviceSpecificData(String deviceSpecificData) {
        this.deviceSpecificData = deviceSpecificData;
    }

    public String getDeviceSpecificType() {
        return this.deviceSpecificType;
    }
    public void setDeviceSpecificType(String deviceSpecificType) {
        this.deviceSpecificType = deviceSpecificType;
    }

// Cloneable

    @Override
    public DeviceInfo clone() {
        final DeviceInfo clone = (DeviceInfo)super.clone();
        if (this.uniqueDeviceIDs != null) {
            clone.uniqueDeviceIDs = new ArrayList<>(this.uniqueDeviceIDs.size());
            for (UniqueDeviceID uniqueDeviceID : this.uniqueDeviceIDs)
                clone.uniqueDeviceIDs.add(uniqueDeviceID.clone());
        }
        return clone;
    }
}

