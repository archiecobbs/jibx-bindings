
/*
 * Copyright (C) 2010 Archie L Cobbs. All rights reserved.
 */

/**
 * JiBX bindings for the Presence Information Data Format - Location Object (PIDF-LO).
 *
 * <p>
 * This package includes several abstract JiBX mapping definitions for PIDF-LO XML structures.
 * The binding technically does not adhere to RFC 4119 because it doesn't allow arbitrary nested
 * elements from other namespaces in several locations where supporting that is required. This is
 * because JiBX doesn't support doing that.
 * <p>
 *
 * <p>
 * Several re-usable abstract mappings are defined in this package, including:
 * <dl>
 * <dt>{@code gp:geopriv}</dt>
 * <dd>{@code <geopriv>} element; represented by {@link org.dellroad.jibxbindings.pidf.lo.GeoPriv}
 *  and defined by {@code geoPriv.xml}.</dd>
 * <dt>{@code ca:civicAddress}</dt>
 * <dd>{@code <civicAddress>} element; represented by {@link org.dellroad.jibxbindings.pidf.lo.CivicAddress}
 *  and defined by {@code civicAddress.xml}.</dd>
 * </dl>
 * </p>
 *
 * <p>
 * The {@code type-name}s listed above use the following XML namespace prefixes:
 * <dl>
 * <dt>{@code gp}</dt>
 * <dd>{@code urn:ietf:params:xml:ns:pidf:geopriv10}</dd>
 * <dt>{@code ca}</dt>
 * <dd>{@code urn:ietf:params:xml:ns:pidf:geopriv10:civicAddr}</dd>
 * <dl>
 * </p>
 *
 * @see <a href="http://tools.ietf.org/html/rfc4119">RFC 4119</a>
 * @see <a href="http://tools.ietf.org/html/rfc5139">RFC 5139</a>
 * @see <a href="http://tools.ietf.org/html/rfc5491">RFC 5491</a>
 * @see <a href="https://github.com/archiecobbs/jibx-bindings">JiBX Bindings</a>
 */
package org.dellroad.jibxbindings.pidf.lo;

