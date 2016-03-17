
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo;

import org.jibx.runtime.JiBXParseException;

/**
 * The {@code <con:confidence>} element as defined in RFC 4119.
 *
 * @see <a href="https://datatracker.ietf.org/doc/draft-ietf-geopriv-uncertainty/?include_text=1">Representation of Uncertainty and Confidence in PIDF-LO</a>
 */
public class Confidence implements Cloneable {

    public static final String UNKNOWN_VALUE = "unknown";

    private ProbabilityDensityFunction probabilityDensityFunction = ProbabilityDensityFunction.UNKNOWN;
    private float value = Float.NaN;

    public Confidence() {
    }

    public Confidence(ProbabilityDensityFunction probabilityDensityFunction, float value) {
        this.setProbabilityDensityFunction(probabilityDensityFunction);
        this.setValue(value);
    }

    public ProbabilityDensityFunction getProbabilityDensityFunction() {
        return this.probabilityDensityFunction;
    }
    public void setProbabilityDensityFunction(ProbabilityDensityFunction probabilityDensityFunction) {
        this.probabilityDensityFunction = probabilityDensityFunction;
    }

    public float getValue() {
        return this.value;
    }
    public void setValue(float value) {
        this.value = value;
    }

// JiBX

    public static String serializeConfidenceValue(float value) {
        if (Float.isNaN(value) || Float.isInfinite(value))
            return UNKNOWN_VALUE;
        value = Math.min(Math.max(value, 0.0f), 100.0f);
        return String.format("%.1f", value);
    }

    public static float deserializeConfidenceValue(String string) throws JiBXParseException {
        if (string == null || (string = string.trim()).length() == 0 || string.equalsIgnoreCase(UNKNOWN_VALUE))
            return Float.NaN;
        float value;
        try {
            value = Float.parseFloat(string);
        } catch (NumberFormatException e) {
            throw new JiBXParseException("incorrectly formatted value", string, e);
        }
        value = Math.min(Math.max(value, 0.0f), 100.0f);
        return value;
    }

// Cloneable

    @Override
    public Confidence clone() {
        try {
            return (Confidence)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

// ProbabilityDensityFunction

    /**
     * Indicates probability density function associated with a {@link Confidence} value.
     */
    public enum ProbabilityDensityFunction {
        UNKNOWN("unknown"),
        NORMAL("normal"),
        RECTANGULAR("rectangular");

        private final String xmlValue;

        private ProbabilityDensityFunction(String xmlValue) {
            this.xmlValue = xmlValue;
        }

        public final String getXMLValue() {
            return this.xmlValue;
        }
    }
}

