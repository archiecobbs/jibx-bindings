
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Top level element in the Presence Information Data Format (PIDF).
 */
public class Presence implements Cloneable, Serializable {

    private static final long serialVersionUID = -6425928356189967947L;

    private URI entity;
    private List<Component> components = new ArrayList<Component>();
    private List<LangContent> notes = new ArrayList<LangContent>();

    public URI getEntity() {
        return this.entity;
    }
    public void setEntity(URI entity) {
        this.entity = entity;
    }

    public List<Component> getComponents() {
        return this.components;
    }
    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public List<LangContent> getNotes() {
        return this.notes;
    }
    public void setNotes(List<LangContent> notes) {
        this.notes = notes;
    }

// Cloneable

    @Override
    public Presence clone() {
        final Presence clone;
        try {
            clone = (Presence)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        if (this.components != null) {
            clone.components = new ArrayList<>(this.components.size());
            for (Component component : this.components)
                clone.components.add(component.clone());
        }
        if (this.notes != null) {
            clone.notes = new ArrayList<>(this.notes.size());
            for (LangContent note : this.notes)
                clone.notes.add(note.clone());
        }
        return clone;
    }
}

