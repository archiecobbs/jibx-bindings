
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a <code>&lt;Participants&gt;</code> list.
 */
public class Participants extends Page implements TwilioResponseContent {

    private List<Participant> participants = new ArrayList<Participant>();

    public List<Participant> getParticipants() {
        return this.participants;
    }
    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
}

