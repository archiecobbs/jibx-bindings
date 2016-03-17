
/*
 * Copyright (C) 2010 Archie L Cobbs. All rights reserved.
 */

/**
 * JiBX bindings for the Presence Information Data Format (PIDF).
 *
 * <p>
 * This package includes several abstract JiBX mapping definitions for PIDF XML structures
 * and one concrete JiBX binding named {@code "pidf"} defining a mapping for the {@code <pidf:presence>} element.
 * The binding technically does not adhere to RFC 3863 because it doesn't allow arbitrary nested
 * elements from other namespaces in several locations where supporting that is required. This is
 * because JiBX doesn't support doing that.
 * <p>
 *
 * <p>
 * Several re-usable abstract mappings are defined in this package, including:
 * <dl>
 * <dt>{@code pidf:presence}</dt>
 * <dd>{@code <presence>} element; represented by {@link org.dellroad.jibxbindings.pidf.Presence}.</dd>
 * <dt>{@code pidf:tuple}</dt>
 * <dd>{@code <tuple>} element; represented by {@link org.dellroad.jibxbindings.pidf.Tuple}.</dd>
 * <dt>{@code pidf:status}</dt>
 * <dd>{@code <status>} element; represented by {@link org.dellroad.jibxbindings.pidf.Status}.</dd>
 * <dt>{@code pidf:contact}</dt>
 * <dd>{@code <contact>} element; represented by {@link org.dellroad.jibxbindings.pidf.Contact}.</dd>
 * </dl>
 * </p>
 *
 * <p>
 * The {@code type-name}s listed above use the following XML namespace prefixes:
 * <dl>
 * <dt>{@code pidf}</dt>
 * <dd>{@code urn:ietf:params:xml:ns:pidf}</dd>
 * <dl>
 * </p>
 *
 * @see <a href="http://tools.ietf.org/html/rfc3863">RFC 3863</a>
 * @see <a href="https://github.com/archiecobbs/jibx-bindings">JiBX Bindings</a>
 */
package org.dellroad.jibxbindings.pidf;

