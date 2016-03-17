
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a <code>&lt;Recordings&gt;</code> list.
 */
public class Recordings extends Page implements TwilioResponseContent {

    private List<Recording> recordings = new ArrayList<Recording>();

    public List<Recording> getRecordings() {
        return this.recordings;
    }
    public void setRecordings(List<Recording> recordings) {
        this.recordings = recordings;
    }
}

