
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a <code>&lt;Messages&gt;</code> list.
 */
public class Messages extends Page implements TwilioResponseContent {

    private List<Message> messages = new ArrayList<Message>();

    public List<Message> getMessages() {
        return this.messages;
    }
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}

