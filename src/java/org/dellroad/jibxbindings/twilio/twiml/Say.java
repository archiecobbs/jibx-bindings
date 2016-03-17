
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.twiml;

/**
 * TwiML <code>&lt;Say&gt;</code> verb.
 */
public class Say implements GatherVerb {

    public static final int DEFAULT_LOOP = 1;

    private Voice voice = Voice.MAN;
    private Language language = Language.EN;
    private int loop = DEFAULT_LOOP;
    private String text;

    public Say() {
    }

    public Say(String text) {
        this.setText(text);
    }

    public Say(String text, Language language, Voice voice) {
        this(text);
        this.setLanguage(language);
        this.setVoice(voice);
    }

    public Voice getVoice() {
        return this.voice;
    }
    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    public Language getLanguage() {
        return this.language;
    }
    public void setLanguage(Language language) {
        this.language = language;
    }

    public int getLoop() {
        return this.loop;
    }
    public void setLoop(int loop) {
        this.loop = loop;
    }

    public String getText() {
        return this.text;
    }
    public void setText(String text) {
        this.text = text;
    }
}

