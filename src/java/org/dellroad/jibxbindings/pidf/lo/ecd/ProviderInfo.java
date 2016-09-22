
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.ecd;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dellroad.jibxbindings.vcard.VCardMarshaller;

import ezvcard.VCard;

/**
 * The {@code <pi:EmergencyCallData.ProviderInfo>} element.
 */
public class ProviderInfo extends AbstractDataProviderReferencing {

    private static final long serialVersionUID = -587635968134426366L;

    private String dataProviderString;                      // mandatory
    private String providerId;
    private String providerIdSeries;
    private String typeOfProvider;
    private URI contactURI;                                 // mandatory
    private List<String> languages = new ArrayList<>();     // mandatory (one or more)
    private VCard dataProviderContact;
    private String subcontratorPrincipal;
    private SubcontractorPriority subcontratorPriority;

    public ProviderInfo() {
    }

    public ProviderInfo(String dataProviderReference, URI contactURI, String... languages) {
        super(dataProviderReference);
        this.setContactURI(contactURI);
        this.languages.addAll(Arrays.asList(languages));
    }

    public String getDataProviderString() {
        return this.dataProviderString;
    }
    public void setDataProviderString(String dataProviderString) {
        this.dataProviderString = dataProviderString;
    }

    public String getProviderId() {
        return this.providerId;
    }
    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderIdSeries() {
        return this.providerIdSeries;
    }
    public void setProviderIdSeries(String providerIdSeries) {
        this.providerIdSeries = providerIdSeries;
    }

    public String getTypeOfProvider() {
        return this.typeOfProvider;
    }
    public void setTypeOfProvider(String typeOfProvider) {
        this.typeOfProvider = typeOfProvider;
    }

    public URI getContactURI() {
        return this.contactURI;
    }
    public void setContactURI(URI contactURI) {
        this.contactURI = contactURI;
    }

    public List<String> getLanguages() {
        return this.languages;
    }
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public VCard getDataProviderContact() {
        return this.dataProviderContact;
    }
    public void setDataProviderContact(VCard dataProviderContact) {
        this.dataProviderContact = dataProviderContact;
    }

    public String getSubcontratorPrincipal() {
        return this.subcontratorPrincipal;
    }
    public void setSubcontratorPrincipal(String subcontratorPrincipal) {
        this.subcontratorPrincipal = subcontratorPrincipal;
    }

    public SubcontractorPriority getSubcontratorPriority() {
        return this.subcontratorPriority;
    }
    public void setSubcontratorPriority(SubcontractorPriority subcontratorPriority) {
        this.subcontratorPriority = subcontratorPriority;
    }

// JiBX

    public boolean hasDataProviderContact() {
        return this.getDataProviderContact() != null;
    }

// Cloneable

    @Override
    public ProviderInfo clone() {
        final ProviderInfo clone = (ProviderInfo)super.clone();
        clone.languages = this.languages != null ? new ArrayList<>(this.languages) : null;
        clone.dataProviderContact = this.dataProviderContact != null ? VCardMarshaller.clone(this.dataProviderContact) : null;
        return clone;
    }
}

