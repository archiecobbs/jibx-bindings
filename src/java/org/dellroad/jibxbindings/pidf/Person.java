
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf;

import java.util.Date;

import org.dellroad.jibxbindings.pidf.lo.GeoPriv;

/**
 * The {@code <dm:person>} element as defined in RFC 4479.
 *
 * @see <a href="http://tools.ietf.org/html/rfc4479">RFC 4479</a>
 */
public class Person implements Component {

    private String id;
    private GeoPriv geoPriv;
    private LangContent note;
    private Date timestamp;

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public GeoPriv getGeoPriv() {
        return this.geoPriv;
    }
    public void setGeoPriv(GeoPriv geoPriv) {
        this.geoPriv = geoPriv;
    }

    public LangContent getNote() {
        return this.note;
    }
    public void setNote(LangContent note) {
        this.note = note;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public void visit(ComponentSwitch componentSwitch) {
        componentSwitch.casePerson(this);
    }

// Cloneable

    @Override
    public Person clone() {
        final Person clone;
        try {
            clone = (Person)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        clone.geoPriv = this.geoPriv != null ? this.geoPriv.clone() : null;
        clone.note = this.note != null ? this.note.clone() : null;
        return clone;
    }
}

