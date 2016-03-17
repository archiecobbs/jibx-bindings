
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo;

import org.dellroad.jibxbindings.ParseUtil;
import org.jibx.runtime.JiBXParseException;

/**
 * The {@code <ca:civicAddress>} element as defined in RFC 5139.
 */
public class CivicAddress implements Cloneable {

// CHECKSTYLE OFF: MemberName
// CHECKSTYLE OFF: ParameterNameCheck
    private String country;
    private CAValue A1;
    private CAValue A2;
    private CAValue A3;
    private CAValue A4;
    private CAValue A5;
    private CAValue A6;
    private CAValue PRM;
    private CAValue PRD;
    private CAValue RD;
    private CAValue STS;
    private CAValue POD;
    private CAValue POM;
    private CAValue RDSEC;
    private CAValue RDBR;
    private CAValue RDSUBBR;
    private CAValue HNO;
    private CAValue HNS;
    private CAValue LMK;
    private CAValue LOC;
    private CAValue FLR;
    private CAValue NAM;
    private CAValue PC;
    private CAValue BLD;
    private CAValue UNIT;
    private CAValue ROOM;
    private CAValue SEAT;
    private CAValue PLC;
    private CAValue PCN;
    private CAValue POBOX;
    private CAValue ADDCODE;

    /**
     * Get country code, which (if not null) should always be a two-letter, all-caps country code.
     */
    public String getCountry() {
        return this.country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public CAValue getA1() {
        return this.A1;
    }
    public void setA1(CAValue A1) {
        this.A1 = A1;
    }

    public CAValue getA2() {
        return this.A2;
    }
    public void setA2(CAValue A2) {
        this.A2 = A2;
    }

    public CAValue getA3() {
        return this.A3;
    }
    public void setA3(CAValue A3) {
        this.A3 = A3;
    }

    public CAValue getA4() {
        return this.A4;
    }
    public void setA4(CAValue A4) {
        this.A4 = A4;
    }

    public CAValue getA5() {
        return this.A5;
    }
    public void setA5(CAValue A5) {
        this.A5 = A5;
    }

    public CAValue getA6() {
        return this.A6;
    }
    public void setA6(CAValue A6) {
        this.A6 = A6;
    }

    public CAValue getPRM() {
        return this.PRM;
    }
    public void setPRM(CAValue PRM) {
        this.PRM = PRM;
    }

    public CAValue getPRD() {
        return this.PRD;
    }
    public void setPRD(CAValue PRD) {
        this.PRD = PRD;
    }

    public CAValue getRD() {
        return this.RD;
    }
    public void setRD(CAValue RD) {
        this.RD = RD;
    }

    public CAValue getSTS() {
        return this.STS;
    }
    public void setSTS(CAValue STS) {
        this.STS = STS;
    }

    public CAValue getPOD() {
        return this.POD;
    }
    public void setPOD(CAValue POD) {
        this.POD = POD;
    }

    public CAValue getPOM() {
        return this.POM;
    }
    public void setPOM(CAValue POM) {
        this.POM = POM;
    }

    public CAValue getRDSEC() {
        return this.RDSEC;
    }
    public void setRDSEC(CAValue RDSEC) {
        this.RDSEC = RDSEC;
    }

    public CAValue getRDBR() {
        return this.RDBR;
    }
    public void setRDBR(CAValue RDBR) {
        this.RDBR = RDBR;
    }

    public CAValue getRDSUBBR() {
        return this.RDSUBBR;
    }
    public void setRDSUBBR(CAValue RDSUBBR) {
        this.RDSUBBR = RDSUBBR;
    }

    public CAValue getHNO() {
        return this.HNO;
    }
    public void setHNO(CAValue HNO) {
        this.HNO = HNO;
    }

    public CAValue getHNS() {
        return this.HNS;
    }
    public void setHNS(CAValue HNS) {
        this.HNS = HNS;
    }

    public CAValue getLMK() {
        return this.LMK;
    }
    public void setLMK(CAValue LMK) {
        this.LMK = LMK;
    }

    public CAValue getLOC() {
        return this.LOC;
    }
    public void setLOC(CAValue LOC) {
        this.LOC = LOC;
    }

    public CAValue getFLR() {
        return this.FLR;
    }
    public void setFLR(CAValue FLR) {
        this.FLR = FLR;
    }

    public CAValue getNAM() {
        return this.NAM;
    }
    public void setNAM(CAValue NAM) {
        this.NAM = NAM;
    }

    public CAValue getPC() {
        return this.PC;
    }
    public void setPC(CAValue PC) {
        this.PC = PC;
    }

    public CAValue getBLD() {
        return this.BLD;
    }
    public void setBLD(CAValue BLD) {
        this.BLD = BLD;
    }

    public CAValue getUNIT() {
        return this.UNIT;
    }
    public void setUNIT(CAValue UNIT) {
        this.UNIT = UNIT;
    }

    public CAValue getROOM() {
        return this.ROOM;
    }
    public void setROOM(CAValue ROOM) {
        this.ROOM = ROOM;
    }

    public CAValue getSEAT() {
        return this.SEAT;
    }
    public void setSEAT(CAValue SEAT) {
        this.SEAT = SEAT;
    }

    public CAValue getPLC() {
        return this.PLC;
    }
    public void setPLC(CAValue PLC) {
        this.PLC = PLC;
    }

    public CAValue getPCN() {
        return this.PCN;
    }
    public void setPCN(CAValue PCN) {
        this.PCN = PCN;
    }

    public CAValue getPOBOX() {
        return this.POBOX;
    }
    public void setPOBOX(CAValue POBOX) {
        this.POBOX = POBOX;
    }

    public CAValue getADDCODE() {
        return this.ADDCODE;
    }
    public void setADDCODE(CAValue ADDCODE) {
        this.ADDCODE = ADDCODE;
    }
// CHECKSTYLE ON: MemberName
// CHECKSTYLE ON: ParameterNameCheck

    /**
     * Deserialize the {@link #getCountry country} value, which must be a two-letter, all-caps country code.
     */
    public static String deserializeCountry(String string) throws JiBXParseException {
        return ParseUtil.deserializeMatching("[A-Z]{2}", string);
    }

// Cloneable

    @Override
    public CivicAddress clone() {
        final CivicAddress clone;
        try {
            clone = (CivicAddress)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        clone.A1 = this.A1 != null ? this.A1.clone() : null;
        clone.A2 = this.A2 != null ? this.A2.clone() : null;
        clone.A3 = this.A3 != null ? this.A3.clone() : null;
        clone.A4 = this.A4 != null ? this.A4.clone() : null;
        clone.A5 = this.A5 != null ? this.A5.clone() : null;
        clone.A6 = this.A6 != null ? this.A6.clone() : null;
        clone.PRM = this.PRM != null ? this.PRM.clone() : null;
        clone.PRD = this.PRD != null ? this.PRD.clone() : null;
        clone.RD = this.RD != null ? this.RD.clone() : null;
        clone.STS = this.STS != null ? this.STS.clone() : null;
        clone.POD = this.POD != null ? this.POD.clone() : null;
        clone.POM = this.POM != null ? this.POM.clone() : null;
        clone.RDSEC = this.RDSEC != null ? this.RDSEC.clone() : null;
        clone.RDBR = this.RDBR != null ? this.RDBR.clone() : null;
        clone.RDSUBBR = this.RDSUBBR != null ? this.RDSUBBR.clone() : null;
        clone.HNO = this.HNO != null ? this.HNO.clone() : null;
        clone.HNS = this.HNS != null ? this.HNS.clone() : null;
        clone.LMK = this.LMK != null ? this.LMK.clone() : null;
        clone.LOC = this.LOC != null ? this.LOC.clone() : null;
        clone.FLR = this.FLR != null ? this.FLR.clone() : null;
        clone.NAM = this.NAM != null ? this.NAM.clone() : null;
        clone.PC = this.PC != null ? this.PC.clone() : null;
        clone.BLD = this.BLD != null ? this.BLD.clone() : null;
        clone.UNIT = this.UNIT != null ? this.UNIT.clone() : null;
        clone.ROOM = this.ROOM != null ? this.ROOM.clone() : null;
        clone.SEAT = this.SEAT != null ? this.SEAT.clone() : null;
        clone.PLC = this.PLC != null ? this.PLC.clone() : null;
        clone.PCN = this.PCN != null ? this.PCN.clone() : null;
        clone.POBOX = this.POBOX != null ? this.POBOX.clone() : null;
        clone.ADDCODE = this.ADDCODE != null ? this.ADDCODE.clone() : null;
        return clone;
    }
}

