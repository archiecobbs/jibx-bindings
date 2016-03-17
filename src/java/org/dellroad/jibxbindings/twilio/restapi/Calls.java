
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a <code>&lt;Calls&gt;</code> list.
 */
public class Calls extends Page implements TwilioResponseContent {

    private List<Call> calls = new ArrayList<Call>();

    public List<Call> getCalls() {
        return this.calls;
    }
    public void setCalls(List<Call> calls) {
        this.calls = calls;
    }
}

