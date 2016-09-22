
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;

import org.dellroad.jibxbindings.ParseTestSupport;
import org.testng.Assert;
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

    @Test(dataProvider = "validCases")
    public void testSerialization(URL url) throws Exception {

        // Parse it
        final Presence p1 = this.parse(url, Presence.class, "pidf");

        // Unparse it
        final String s1 = this.unparse(p1, "pidf");

        // Serialize it
        final ByteArrayOutputStream buf = new ByteArrayOutputStream();
        final ObjectOutputStream output = new ObjectOutputStream(buf);
        output.writeObject(p1);
        output.close();

        // Deserialize it
        final ObjectInputStream input = new ObjectInputStream(new ByteArrayInputStream(buf.toByteArray()));
        final Presence p2 = (Presence)input.readObject();

        // Unparse it again
        final String s2 = this.unparse(p2, "pidf");

        // Check unparse is the same
        Assert.assertEquals(s2, s1);
    }
}

