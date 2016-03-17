
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.twiml;

import java.io.IOException;
import java.net.URL;

import org.dellroad.jibxbindings.ParseTestSupport;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwiMLParseTest extends ParseTestSupport {

    // Valid cases

    @Test(dataProvider = "validResponses")
    public void testValidResponse(URL url) throws Exception {
        super.testValidParse(url, Response.class);
    }

    @DataProvider(name = "validResponses")
    public Object[][] validResponses() throws IOException {
        return genCases("response");
    }

    // Invalid cases
}

