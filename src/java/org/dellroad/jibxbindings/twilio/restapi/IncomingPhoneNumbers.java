
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an <code>&lt;IncomingPhoneNumbers&gt;</code> list.
 */
public class IncomingPhoneNumbers extends Page implements TwilioResponseContent {

    private List<IncomingPhoneNumber> phoneNumbers = new ArrayList<IncomingPhoneNumber>();

    public List<IncomingPhoneNumber> getPhoneNumbers() {
        return this.phoneNumbers;
    }
    public void setPhoneNumbers(List<IncomingPhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}

