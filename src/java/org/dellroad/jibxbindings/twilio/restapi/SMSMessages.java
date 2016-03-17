
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a <code>&lt;SMSMessages&gt;</code> list.
 */
public class SMSMessages extends Page implements TwilioResponseContent {

    private List<SMSMessage> smsMessages = new ArrayList<SMSMessage>();

    public List<SMSMessage> getSMSMessages() {
        return this.smsMessages;
    }
    public void setSMSMessages(List<SMSMessage> smsMessages) {
        this.smsMessages = smsMessages;
    }
}

