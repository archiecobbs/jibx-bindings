
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.held;

import java.io.IOException;
import java.net.URL;

import org.dellroad.jibxbindings.ParseTestSupport;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LocationResponseTest extends ParseTestSupport {

    @Test(dataProvider = "validCases")
    public void testValid(URL url) throws Exception {
        super.testValidParse(url, LocationResponse.class);
    }

    @Test(dataProvider = "invalidCases")
    public void testInvalid(URL url) throws Exception {
        super.testInvalidParse(url, LocationResponse.class);
    }

    @DataProvider(name = "validCases")
    public Object[][] validCases() throws IOException {
        return genCases("locationResponse-valid");
    }

    @DataProvider(name = "invalidCases")
    public Object[][] invalidCases() throws IOException {
        return genCases("locationResponse-invalid");
    }
}

