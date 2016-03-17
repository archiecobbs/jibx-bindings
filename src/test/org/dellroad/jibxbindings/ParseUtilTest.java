
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings;

import java.util.Date;

import org.jibx.runtime.JiBXParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class ParseUtilTest extends TestSupport {

    @Test(dataProvider = "rfc3339")
    public void testRFC3339(String input, Long output) throws Exception {

        // Parse it
        Date date;
        try {
            date = ParseUtil.deserializeRFC3339Timestamp(input);
            assertEquals((Long)date.getTime(), output);
        } catch (JiBXParseException e) {
            assertNull(output);
            return;
        }

        // Unparse and reparse it
        Date date2 = ParseUtil.deserializeRFC3339Timestamp(ParseUtil.serializeRFC3339Timestamp(date));
        assertEquals(date2, date);
    }

    @DataProvider(name = "rfc3339")
    public Object[][] genRFC3339() {
        return new Object[][] {

            // Valid cases
            { "2010-09-28T19:16:10Z", 1285701370000L },
            { "2010-09-28T19:16:10.123Z", 1285701370123L },
            { "2010-09-28T19:16:10+00:00", 1285701370000L },
            { "2010-09-28T19:16:10-00:00", 1285701370000L },
            { "2010-09-28T19:16:10.123Z", 1285701370123L },
            { "2010-09-28T12:16:10-07:00", 1285701370000L },
            { "2010-09-28T23:16:10+04:00", 1285701370000L },

            // Invalid cases
            { "2010-09-28T19:16:10", null },
            { "2010-09-28T19:16:10.123", null },
            { "2010-09-28T19:16:10GMT+00:00", null },
            { "2010-09-28T19:16:10GMT-00:00", null },
            { "10-09-28T19:16:10Z", null },
            { "10-09-28T19:16:10Z", null },
            { "2010-09-28T19:16:10ZZ", null },
        };
    }
}

