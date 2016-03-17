
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an <code>&lt;Conferences&gt;</code> list.
 */
public class Conferences extends Page implements TwilioResponseContent {

    private List<Conference> conferences = new ArrayList<Conference>();

    public List<Conference> getConferences() {
        return this.conferences;
    }
    public void setConferences(List<Conference> conferences) {
        this.conferences = conferences;
    }
}

