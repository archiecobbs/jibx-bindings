
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf;

import java.io.IOException;
import java.net.URL;

import org.dellroad.jibxbindings.ParseTestSupport;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PIDFParseTest extends ParseTestSupport {

    @Test(dataProvider = "validCases")
    public void testValid(URL url) throws Exception {
        super.testValidParse(url, Presence.class, "pidf");
    }

    @Test(dataProvider = "invalidCases")
    public void testInvalid(URL url) throws Exception {
        super.testInvalidParse(url, Presence.class, "pidf");
    }

    @DataProvider(name = "validCases")
    public Object[][] validCases() throws IOException {
        return genCases("pidf-valid");
    }

    @DataProvider(name = "invalidCases")
    public Object[][] invalidCases() throws IOException {
        return genCases("pidf-invalid");
    }
}

