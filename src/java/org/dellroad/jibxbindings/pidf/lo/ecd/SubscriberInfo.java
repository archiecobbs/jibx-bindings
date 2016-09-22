
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.ecd;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.dellroad.jibxbindings.vcard.VCardMarshaller;
import org.w3c.dom.Document;

import ezvcard.VCard;

/**
 * The {@code <pi:EmergencyCallData.SubscriberInfo>} element.
 */
public class SubscriberInfo extends AbstractDataProviderReferencing {

    private static final long serialVersionUID = -3347025705140073183L;

    private boolean privacyRequested;                       // mandatory
    private transient VCard subscriberData;

    public SubscriberInfo() {
    }

    public SubscriberInfo(String dataProviderReference, boolean privacyRequested, VCard subscriberData) {
        super(dataProviderReference);
        this.setPrivacyRequested(privacyRequested);
        this.setSubscriberData(subscriberData);
    }

    public boolean isPrivacyRequested() {
        return this.privacyRequested;
    }
    public void setPrivacyRequested(boolean privacyRequested) {
        this.privacyRequested = privacyRequested;
    }

    public VCard getSubscriberData() {
        return this.subscriberData;
    }
    public void setSubscriberData(VCard subscriberData) {
        this.subscriberData = subscriberData;
    }

// JiBX

    public boolean hasSubscriberData() {
        return this.getSubscriberData() != null;
    }

// Serializable

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        if (this.subscriberData == null) {
            new DataOutputStream(stream).writeInt(0);
            return;
        }
        final ByteArrayOutputStream buf = new ByteArrayOutputStream();
        final StreamResult result = new StreamResult(buf);
        this.transform(new DOMSource(VCardMarshaller.toXML(this.subscriberData)), result);
        final byte[] data = buf.toByteArray();
        new DataOutputStream(stream).writeInt(data.length);
        stream.write(data);
    }

    private void readObject(ObjectInputStream input) throws IOException, ClassNotFoundException {
        input.defaultReadObject();
        final int length = new DataInputStream(input).readInt();
        if (length <= 0)
            return;
        final byte[] data = new byte[length];
        int count = 0;
        while (count < data.length) {
            final int r = input.read(data, count, data.length - count);
            if (r == -1)
                throw new EOFException("truncated input");
            count += r;
        }
        final DOMResult result = new DOMResult();
        this.transform(new StreamSource(new ByteArrayInputStream(data)), result);
        this.subscriberData = VCardMarshaller.fromXML((Document)result.getNode());
    }

    private void transform(Source source, Result result) {
        try {
            final Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.transform(source, result);
        } catch (TransformerException e) {
            throw new RuntimeException("XML transformer error", e);
        }
    }

// Cloneable

    @Override
    public SubscriberInfo clone() {
        final SubscriberInfo clone = (SubscriberInfo)super.clone();
        clone.subscriberData = this.subscriberData != null ? VCardMarshaller.clone(this.subscriberData) : null;
        return clone;
    }
}

