
/*
 * Copyright (C) 2010 Archie L Cobbs. All rights reserved.
 */

/**
 * JiBX bindings for HTTP-Enabled Location Delivery (HELD).
 *
 * <p>
 * This package includes JiBX bindings for the {@code <locationRequest>}, {@code <locationResponse>}, and
 * and {@code <error>} XML tags used in the HELD protocol as described by
 * <a href="http://tools.ietf.org/html/rfc5985">RFC 5985</a>. The binding name defined here is {@code "held"}.
 *
 * <p>
 * The concrete mappings defined are:
 * <dl>
 * <dt>{@code held:locationRequest}</dt>
 * <dd>{@code <locationRequest>} element; represented by {@link org.dellroad.jibxbindings.pidf.held.LocationRequest}.</dd>
 * <dt>{@code held:locationResponse}</dt>
 * <dd>{@code <locationResponse>} element; represented by {@link org.dellroad.jibxbindings.pidf.held.LocationResponse}.</dd>
 * <dt>{@code held:error}</dt>
 * <dd>{@code <error>} element; represented by {@link org.dellroad.jibxbindings.pidf.held.Error}.</dd>
 * </dl>
 * </p>
 *
 * <p>
 * The {@code type-name}s listed above use the following XML namespace prefixes:
 * <dl>
 * <dt>{@code held}</dt>
 * <dd>{@code urn:ietf:params:xml:ns:geopriv:held}</dd>
 * <dl>
 * </p>
 *
 * @see <a href="http://tools.ietf.org/html/rfc5985">RFC 5985</a>
 * @see <a href="https://github.com/archiecobbs/jibx-bindings">JiBX Bindings</a>
 */
package org.dellroad.jibxbindings.pidf.held;

