
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.twiml;

/**
 * TwiML <code>&lt;Reject&gt;</code> verb.
 */
public class Reject implements Verb {

    private RejectReason reason = RejectReason.REJECTED;

    public Reject() {
    }

    public Reject(RejectReason reason) {
        this.setReason(reason);
    }

    public RejectReason getReason() {
        return this.reason;
    }
    public void setReason(RejectReason reason) {
        this.reason = reason;
    }
}

