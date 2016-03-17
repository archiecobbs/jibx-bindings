
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.twiml;

/**
 * Specifies the language used in {@link Say} elements.
 */
public enum Language {
    CA_ES(true),
    DA_DK(true),
    DE   (false),
    DE_DE(true),
    EN   (false),
    EN_AU(true),
    EN_CA(true),
    EN_GB(false),
    EN_IN(true),
    EN_US(true),
    ES   (false),
    ES_ES(true),
    ES_MX(true),
    FI_FI(true),
    FR   (false),
    FR_CA(true),
    FR_FR(true),
    IT   (false),
    IT_IT(true),
    JA_JP(true),
    KO_KR(true),
    NB_NO(true),
    NL_NL(true),
    PL_PL(true),
    PT_BR(true),
    PT_PT(true),
    RU_RU(true),
    SV_SE(true),
    ZH_CN(true),
    ZH_HK(true),
    ZH_TW(true);

    private final boolean aliceOnly;

    private Language(boolean aliceOnly) {
        this.aliceOnly = aliceOnly;
    }

    @Override
    public String toString() {
        return this.name().toLowerCase().replace('_', '-');
    }

    /**
     * Determine whether this language setting overrides the {@link Voice} setting, forcing the {@link Voice#ALICE} voice.
     *
     * @see <a href="http://www.twilio.com/docs/api/twiml/say">Twilio Docs - API TwiML Say</a>
     */
    public boolean isAliceOnly() {
        return this.aliceOnly;
    }
}

