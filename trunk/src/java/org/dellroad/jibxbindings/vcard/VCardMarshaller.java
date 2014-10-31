
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.vcard;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.jibx.extras.DomElementMapper;
import org.jibx.runtime.IMarshallingContext;
import org.jibx.runtime.IUnmarshallingContext;
import org.jibx.runtime.JiBXException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import ezvcard.VCard;
import ezvcard.io.xml.XCardDocument;

/**
 * JiBX marshaller/unmarshaller for a single {@link VCard}.
 *
 * @see <a href="https://ez-vcard.googlecode.com">The EZ-vCard Project</a>
 */
public class VCardMarshaller extends DomElementMapper {

    public static final String VCARD_NAMESPACE_URI = "urn:ietf:params:xml:ns:vcard-4.0";
    public static final String VCARDS_ELEMENT_NAME = "vcards";
    public static final String VCARD_ELEMENT_NAME = "vcard";

    public VCardMarshaller() throws JiBXException {
        this(VCARD_NAMESPACE_URI, 0, VCARD_ELEMENT_NAME);
    }

    public VCardMarshaller(String uri, int index, String name) throws JiBXException {
        super(uri, index, name);
    }

    @Override
    public void marshal(Object obj, IMarshallingContext ctx) throws JiBXException {

        // Handle null
        if (obj == null)
            return;

        // Convert to XML
        final XCardDocument xcard = new XCardDocument();
        xcard.add((VCard)obj);
        super.marshal(xcard.getDocument().getDocumentElement().getFirstChild(), ctx);
    }

    @Override
    public VCard unmarshal(Object obj, IUnmarshallingContext ctx) throws JiBXException {

        // Get XML element
        final Element element = (Element)super.unmarshal(obj, ctx);

        // Handle null
        if (element == null)
            return null;

        // Create temporary XML <vcards> document
        final Document doc;
        try {
            doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException("unexpected exception", e);
        }
        final Element vcards = doc.createElementNS(VCARD_NAMESPACE_URI, VCARDS_ELEMENT_NAME);
        doc.appendChild(vcards);

        // Append <vcard> node
        vcards.appendChild(doc.importNode(element, true));

        // Read it
        try {
            return new XCardDocument(doc).reader().readNext();
        } catch (IOException e) {
            throw new RuntimeException("unexpected exception", e);
        }
    }
}

