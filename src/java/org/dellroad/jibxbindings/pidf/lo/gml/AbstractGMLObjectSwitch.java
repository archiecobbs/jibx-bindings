
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

/**
 * Adapter class for the {@link GMLObjectSwitch} interface.
 */
public class AbstractGMLObjectSwitch implements GMLObjectSwitch {

    protected AbstractGMLObjectSwitch() {
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseDefault}.
     * </p>
     */
    @Override
    public void casePoint(Point point) {
        caseDefault(point);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseSurface}.
     * </p>
     */
    @Override
    public void casePolygon(Polygon polygon) {
        caseSurface(polygon);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseSurface}.
     * </p>
     */
    @Override
    public void caseCircle(Circle circle) {
        caseSurface(circle);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseSurface}.
     * </p>
     */
    @Override
    public void caseEllipse(Ellipse ellipse) {
        caseSurface(ellipse);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseSurface}.
     * </p>
     */
    @Override
    public void caseArcBand(ArcBand arcBand) {
        caseSurface(arcBand);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseSolid}.
     * </p>
     */
    @Override
    public void caseSphere(Sphere sphere) {
        caseSolid(sphere);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseSolid}.
     * </p>
     */
    @Override
    public void caseEllipsoid(Ellipsoid ellipsoid) {
        caseSolid(ellipsoid);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseSolid}.
     * </p>
     */
    @Override
    public void casePrism(Prism prism) {
        caseSolid(prism);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseDefault}.
     * </p>
     */
    @Override
    public void caseLineString(LineString lineString) {
        caseDefault(lineString);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseDefault}.
     * </p>
     */
    @Override
    public void caseLinearRing(LinearRing linearRing) {
        caseDefault(linearRing);
    }

    /**
     * Roll-up method for {@link Surface} subclasses.
     *
     * <p>
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseDefault}.
     * </p>
     */
    protected void caseSurface(Surface surface) {
        caseDefault(surface);
    }

    /**
     * Roll-up method for {@link Solid} subclasses.
     *
     * <p>
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseDefault}.
     * </p>
     */
    protected void caseSolid(Solid solid) {
        caseDefault(solid);
    }

    /**
     * Roll-up method for all cases.
     *
     * <p>
     * The implementation in {@link AbstractGMLObjectSwitch} does nothing.
     * </p>
     */
    protected void caseDefault(GMLObject object) {
    }
}

