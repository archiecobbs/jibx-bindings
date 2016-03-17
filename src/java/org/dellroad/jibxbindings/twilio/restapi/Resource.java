
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.net.URI;
import java.util.Date;

/**
 * Abstract superclass for XML represenations of REST resources.
 */
public abstract class Resource {

    private Date dateCreated;
    private Date dateUpdated;
    private URI uri;
    private SubresourceUris subresourceUris;

    /**
     * Get the date this resource was created.
     */
    public Date getDateCreated() {
        return this.dateCreated;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * Get the date this resource was last updated.
     */
    public Date getDateUpdated() {
        return this.dateUpdated;
    }
    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * Get the URI for this resource, relative to {@code https://api.twilio.com/}.
     */
    public URI getURI() {
        return this.uri;
    }
    public void setURI(URI uri) {
        this.uri = uri;
    }

    public SubresourceUris getSubresourceUris() {
        return this.subresourceUris;
    }
    public void setSubresourceUris(SubresourceUris subresourceUris) {
        this.subresourceUris = subresourceUris;
    }
}

