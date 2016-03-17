
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf;

/**
 * Represents a string and a specified language.
 */
public class LangContent implements Cloneable {

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
}

