
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.io.IOException;
import java.net.URL;

import org.dellroad.jibxbindings.ParseTestSupport;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RestAPIParseTest extends ParseTestSupport {

    // Valid cases

    @Test(dataProvider = "validTwilioResponses")
    public void testValidTwilioResponse(URL url) throws Exception {
        super.testValidParse(url, TwilioResponse.class);
    }

    @DataProvider(name = "validTwilioResponses")
    public Object[][] validTwilioResponses() throws IOException {
        return genCases(
          "account",
          "accounts",
          "availablePhoneNumbers",
          "call",
          "calls",
          "conference",
          "conferences",
          "incomingPhoneNumber",
          "incomingPhoneNumbers",
          "notification",
          "notifications",
          "outgoingCallerId",
          "outgoingCallerIds",
          "participant",
          "participants",
          "recording",
          "recordings",
          "restException",
          "smsMessage",
          "smsMessages",
          "transcription",
          "transcriptions",
          "twilioSandbox",
          "validationRequest"
        );
    }

    // Invalid cases
}
