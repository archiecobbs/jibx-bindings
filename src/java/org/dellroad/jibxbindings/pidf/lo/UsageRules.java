
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo;

import java.io.Serializable;
import java.net.URI;
import java.util.Date;

import org.dellroad.jibxbindings.pidf.LangContent;

/**
 * The {@code <gp:usage-rules>} element as defined in RFC 4119.
 */
public class UsageRules implements Cloneable, Serializable {

    private static final long serialVersionUID = 3794248676112179639L;

    private boolean retransmissionAllowed;
    private Date retentionExpiry;
    private URI externalRuleset;
    private LangContent noteWell;

    public boolean isRetransmissionAllowed() {
        return this.retransmissionAllowed;
    }
    public void setRetransmissionAllowed(boolean retransmissionAllowed) {
        this.retransmissionAllowed = retransmissionAllowed;
    }

    public Date getRetentionExpiry() {
        return this.retentionExpiry;
    }
    public void setRetentionExpiry(Date retentionExpiry) {
        this.retentionExpiry = retentionExpiry;
    }

    public URI getExternalRuleset() {
        return this.externalRuleset;
    }
    public void setExternalRuleset(URI externalRuleset) {
        this.externalRuleset = externalRuleset;
    }

    public LangContent getNoteWell() {
        return this.noteWell;
    }
    public void setNoteWell(LangContent noteWell) {
        this.noteWell = noteWell;
    }

// Cloneable

    @Override
    public UsageRules clone() {
        final UsageRules clone;
        try {
            clone = (UsageRules)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        clone.noteWell = this.noteWell != null ? this.noteWell.clone() : null;
        return clone;
    }
}

