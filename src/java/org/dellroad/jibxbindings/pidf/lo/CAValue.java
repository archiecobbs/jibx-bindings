
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo;

import java.io.Serializable;

/**
 * One field in a {@code <ca:civicAddress>} element as defined in RFC 5139.
 * This differs from {@link org.dellroad.jibxbindings.pidf.LangContent} in that the field content is whitespace normalized.
 */
public class CAValue implements Cloneable, Serializable {

    private static final long serialVersionUID = -5493271897495075186L;

    private String lang;
    private String content;

    /**
     * Get the language. Typically comes from an {@code xml:lang} attribute.
     */
    public String getLang() {
        return this.lang;
    }
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * Get the string content.
     */
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }

// Cloneable

    @Override
    public CAValue clone() {
        try {
            return (CAValue)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

