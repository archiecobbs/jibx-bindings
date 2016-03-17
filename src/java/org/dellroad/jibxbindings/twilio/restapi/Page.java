
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.net.URI;

/**
 * Abstract superclass for XML represenations of one page in a list of REST resources.
 */
public abstract class Page {

    private int page;
    private int numPages;
    private int pageSize;
    private int total;
    private int start;
    private int end;
    private URI uri;
    private URI firstPageURI;
    private URI nextPageURI;
    private URI previousPageURI;
    private URI lastPageURI;

    /**
     * Current page number. Starts at zero.
     */
    public int getPage() {
        return this.page;
    }
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * Total number of pages.
     */
    public int getNumPages() {
        return this.numPages;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    /**
     * Number of items in each page.
     */
    public int getPageSize() {
        return this.pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Total number of items in the list.
     */
    public int getTotal() {
        return this.total;
    }
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The position in the overall list of the first item in this page.
     */
    public int getStart() {
        return this.start;
    }
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * The position in the overall list of the last item in this page.
     */
    public int getEnd() {
        return this.end;
    }
    public void setEnd(int end) {
        this.end = end;
    }

    /**
     * The URI of the current page.
     */
    public URI getURI() {
        return this.uri;
    }
    public void setURI(URI uri) {
        this.uri = uri;
    }

    /**
     * The URI for the first page of this list.
     */
    public URI getFirstPageURI() {
        return this.firstPageURI;
    }
    public void setFirstPageURI(URI firstPageURI) {
        this.firstPageURI = firstPageURI;
    }

    /**
     * The URI for the next page of this list.
     */
    public URI getNextPageURI() {
        return this.nextPageURI;
    }
    public void setNextPageURI(URI nextPageURI) {
        this.nextPageURI = nextPageURI;
    }

    /**
     * The URI for the previous page of this list.
     */
    public URI getPreviousPageURI() {
        return this.previousPageURI;
    }
    public void setPreviousPageURI(URI previousPageURI) {
        this.previousPageURI = previousPageURI;
    }

    /**
     * The URI for the last page of this list.
     */
    public URI getLastPageURI() {
        return this.lastPageURI;
    }
    public void setLastPageURI(URI lastPageURI) {
        this.lastPageURI = lastPageURI;
    }
}

