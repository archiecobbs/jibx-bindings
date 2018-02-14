
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf;

import java.io.Serializable;
import java.util.Objects;

/**
 * Represents a string and a specified language.
 */
public class LangContent implements Cloneable, Serializable {

    private static final long serialVersionUID = -1664801480863183585L;

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
    public LangContent clone() {
        try {
            return (LangContent)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

// Object

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        final LangContent that = (LangContent)obj;
        return Objects.equals(this.lang, that.lang) && Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.lang) ^ Objects.hashCode(this.content);
    }
}

