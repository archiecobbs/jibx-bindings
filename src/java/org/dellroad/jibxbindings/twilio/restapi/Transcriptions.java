
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a <code>&lt;Transcriptions&gt;</code> list.
 */
public class Transcriptions extends Page implements TwilioResponseContent {

    private List<Transcription> transcriptions = new ArrayList<Transcription>();

    public List<Transcription> getTranscriptions() {
        return this.transcriptions;
    }
    public void setTranscriptions(List<Transcription> transcriptions) {
        this.transcriptions = transcriptions;
    }
}

