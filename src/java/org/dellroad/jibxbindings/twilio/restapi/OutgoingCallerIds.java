
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an <code>&lt;OutgoingCallerIds&gt;</code> list.
 */
public class OutgoingCallerIds extends Page implements TwilioResponseContent {

    private List<OutgoingCallerId> outgoingCallerIds = new ArrayList<OutgoingCallerId>();

    public List<OutgoingCallerId> getOutgoingCallerIds() {
        return this.outgoingCallerIds;
    }
    public void setOutgoingCallerIds(List<OutgoingCallerId> outgoingCallerIds) {
        this.outgoingCallerIds = outgoingCallerIds;
    }
}

