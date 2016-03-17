
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dellroad.jibxbindings.pidf.lo.GeoPriv;

/**
 * PIDF {@code <tuple>} element.
 */
public class Tuple implements Component {

    private String id;
    private Status status;
    private Contact contact;
    private List<LangContent> notes = new ArrayList<LangContent>();
    private Date timestamp;

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Status getStatus() {
        return this.status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public Contact getContact() {
        return this.contact;
    }
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<LangContent> getNotes() {
        return this.notes;
    }
    public void setNotes(List<LangContent> notes) {
        this.notes = notes;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public GeoPriv getGeoPriv() {
        return this.status != null ? this.status.getGeoPriv() : null;
    }

    @Override
    public void visit(ComponentSwitch componentSwitch) {
        componentSwitch.caseTuple(this);
    }

// Cloneable

    @Override
    public Tuple clone() {
        final Tuple clone;
        try {
            clone = (Tuple)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        clone.status = this.status != null ? this.status.clone() : null;
        clone.contact = this.contact != null ? this.contact.clone() : null;
        if (this.notes != null) {
            clone.notes = new ArrayList<>(this.notes.size());
            for (LangContent note : this.notes)
                clone.notes.add(note.clone());
        }
        return clone;
    }
}

