
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

/**
 * Represents a <code>&lt;TwilioResponse&gt;</code>.
 */
public class TwilioResponse {

    private TwilioResponseContent content;

    /**
     * Get the response content.
     */
    public TwilioResponseContent getContent() {
        return this.content;
    }
    public void setContent(TwilioResponseContent content) {
        this.content = content;
    }
}

