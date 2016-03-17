
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a <code>&lt;Notifications&gt;</code> list.
 */
public class Notifications extends Page implements TwilioResponseContent {

    private List<Notification> notifications = new ArrayList<Notification>();

    public List<Notification> getNotifications() {
        return this.notifications;
    }
    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
}

