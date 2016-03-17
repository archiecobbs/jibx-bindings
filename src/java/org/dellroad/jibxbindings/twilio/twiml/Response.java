
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.twiml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * TwiML <code>&lt;Response&gt;</code> element.
 */
public class Response {

    private List<Verb> verbs = new ArrayList<Verb>();

    public Response() {
    }

    public Response(Collection<? extends Verb> verbs) {
        this.verbs.addAll(verbs);
    }

    public Response(Verb... verbs) {
        this(Arrays.asList(verbs));
    }

    /**
     * Get the {@link Verb}s contained in this response.
     */
    public List<Verb> getVerbs() {
        return this.verbs;
    }
    public void setVerbs(List<Verb> verbs) {
        this.verbs = verbs;
    }
}

