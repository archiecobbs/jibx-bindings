
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf.lo.ecd;

import java.io.IOException;
import java.net.URL;

import org.dellroad.jibxbindings.ParseTestSupport;
import org.dellroad.jibxbindings.pidf.Presence;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ECDParseTest extends ParseTestSupport {

    @Test(dataProvider = "validCases")
    public void testValid(URL url) throws Exception {
        super.testValidParse(url, Presence.class, "pidf");
    }

    @DataProvider(name = "validCases")
    public Object[][] validCases() throws IOException {
        return genCases("ecd-valid");
    }
}

