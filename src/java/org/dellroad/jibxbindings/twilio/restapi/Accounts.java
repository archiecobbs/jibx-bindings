
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an <code>&lt;Accounts&gt;</code> list.
 */
public class Accounts extends Page implements TwilioResponseContent {

    private List<Account> accounts = new ArrayList<Account>();

    public List<Account> getAccounts() {
        return this.accounts;
    }
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}

