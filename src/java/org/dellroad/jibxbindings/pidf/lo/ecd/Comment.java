
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.ecd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dellroad.jibxbindings.pidf.LangContent;

/**
 * The {@code <pi:EmergencyCallData.Comment>} element.
 */
public class Comment extends AbstractDataProviderReferencing {

    private static final long serialVersionUID = 13965674900770783L;

    private List<LangContent> comments = new ArrayList<>();

    public Comment() {
    }

    public Comment(String dataProviderReference, LangContent... comments) {
        super(dataProviderReference);
        this.comments.addAll(Arrays.asList(comments));
    }

    public List<LangContent> getComments() {
        return this.comments;
    }
    public void setComments(List<LangContent> comments) {
        this.comments = comments;
    }

// Cloneable

    @Override
    public Comment clone() {
        final Comment clone = (Comment)super.clone();
        if (this.comments != null) {
            clone.comments = new ArrayList<>(this.comments.size());
            for (LangContent comment : this.comments)
                clone.comments.add(comment.clone());
        }
        return clone;
    }
}

