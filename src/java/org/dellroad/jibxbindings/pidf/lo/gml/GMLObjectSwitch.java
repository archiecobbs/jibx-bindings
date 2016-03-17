
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

/**
 * Visitor pattern interface for GML shapes.
 */
public interface GMLObjectSwitch {

    /**
     * Invoked when the instance visited is a {@link Point}.
     */
    void casePoint(Point point);

    /**
     * Invoked when the instance visited is a {@link Polygon}.
     */
    void casePolygon(Polygon polygon);

    /**
     * Invoked when the instance visited is a {@link Circle}.
     */
    void caseCircle(Circle circle);

    /**
     * Invoked when the instance visited is a {@link Ellipse}.
     */
    void caseEllipse(Ellipse ellipse);

    /**
     * Invoked when the instance visited is a {@link ArcBand}.
     */
    void caseArcBand(ArcBand arcBand);

    /**
     * Invoked when the instance visited is a {@link Sphere}.
     */
    void caseSphere(Sphere sphere);

    /**
     * Invoked when the instance visited is a {@link Ellipsoid}.
     */
    void caseEllipsoid(Ellipsoid ellipsoid);

    /**
     * Invoked when the instance visited is a {@link Prism}.
     */
    void casePrism(Prism prism);

    /**
     * Invoked when the instance visited is a {@link LineString}.
     */
    void caseLineString(LineString lineString);

    /**
     * Invoked when the instance visited is a {@link LinearRing}.
     */
    void caseLinearRing(LinearRing linearRing);
}

