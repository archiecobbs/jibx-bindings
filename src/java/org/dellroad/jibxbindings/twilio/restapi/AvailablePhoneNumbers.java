
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an <code>&lt;AvailablePhoneNumbers&gt;</code> list.
 */
public class AvailablePhoneNumbers extends Page implements TwilioResponseContent {

    private List<AvailablePhoneNumber> phoneNumbers = new ArrayList<AvailablePhoneNumber>();

    public List<AvailablePhoneNumber> getPhoneNumbers() {
        return this.phoneNumbers;
    }
    public void setPhoneNumbers(List<AvailablePhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}

