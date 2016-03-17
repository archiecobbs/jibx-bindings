
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.twilio;

/**
 * Twilio error codes.
 *
 * @see <a href="http://www.twilio.com/docs/errors/reference">Twilio Error Code Reference</a>
 */
public final class ErrorCodes {

    public static final int ACCOUNT_IS_NOT_ACTIVE = 10001;
    public static final int TRIAL_ACCOUNT_DOES_NOT_SUPPORT_THIS_FEATURE = 10002;
    public static final int INCOMING_CALL_REJECTED_DUE_TO_INACTIVE_ACCOUNT = 10003;
    public static final int INVALID_URL_FORMAT = 11100;
    public static final int HTTP_RETRIEVAL_FAILURE = 11200;
    public static final int HTTP_CONNECTION_FAILURE = 11205;
    public static final int HTTP_PROTOCOL_VIOLATION = 11206;
    public static final int HTTP_BAD_HOST_NAME = 11210;
    public static final int HTTP_TOO_MANY_REDIRECTS = 11215;
    public static final int INVALID_TEMPLATE_URL = 11300;
    public static final int INVALID_TEMPLATE_TOKEN = 11310;
    public static final int INVALID_TEMPLATE_UNCLOSED_BRACKETS = 11320;
    public static final int DOCUMENT_PARSE_FAILURE = 12100;
    public static final int INVALID_TWILIO_MARKUP_XML_VERSION = 12101;
    public static final int THE_ROOT_ELEMENT_MUST_BE_RESPONSE = 12102;
    public static final int SCHEMA_VALIDATION_WARNING = 12200;
    public static final int INVALID_CONTENT_TYPE = 12300;
    public static final int INTERNAL_FAILURE = 12400;
    public static final int DIAL_CANNOT_DIAL_OUT_FROM_A_DIAL_CALL_SEGMENT = 13201;
    public static final int DIAL_INVALID_METHOD_VALUE = 13210;
    public static final int DIAL_INVALID_IFMACHINE_VALUE = 13211;
    public static final int DIAL_INVALID_TIMEOUT_VALUE = 13212;
    public static final int DIAL_INVALID_HANGUPONSTAR_VALUE = 13213;
    public static final int DIAL_INVALID_CALLERID_VALUE = 13214;
    public static final int DIAL_INVALID_NESTED_ELEMENT = 13215;
    public static final int DIAL_INVALID_TIMELIMIT_VALUE = 13216;
    public static final int DIAL_INVALID_RECORD_VALUE = 13217;
    public static final int DIAL_NUMBER_INVALID_METHOD_VALUE = 13221;
    public static final int DIAL_NUMBER_INVALID_SENDDIGITS_VALUE = 13222;
    public static final int DIAL_INVALID_PHONE_NUMBER_FORMAT = 13223;
    public static final int DIAL_INVALID_PHONE_NUMBER = 13224;
    public static final int DIAL_FORBIDDEN_PHONE_NUMBER = 13225;
    public static final int DIAL_INVALID_COUNTRY_CODE = 13226;
    public static final int DIAL_NO_INTERNATIONAL_AUTHORIZATION = 13227;
    public static final int DIAL_CONFERENCE_INVALID_MUTED_VALUE = 13230;
    public static final int DIAL_CONFERENCE_INVALID_ENDCONFERENCEONEXIT_VALUE = 13231;
    public static final int DIAL_CONFERENCE_INVALID_STARTCONFERENCEONENTER_VALUE = 13232;
    public static final int DIAL_CONFERENCE_INVALID_WAITURL_VALUE = 13233;
    public static final int DIAL_CONFERENCE_INVALID_WAITMETHOD_VALUE = 13234;
    public static final int DIAL_CONFERENCE_INVALID_BEEP_VALUE = 13235;
    public static final int DIAL_CONFERENCE_INVALID_CONFERENCE_SID_VALUE = 13236;
    public static final int DIAL_CONFERENCE_INVALID_CONFERENCE_NAME = 13237;
    public static final int DIAL_CONFERENCE_INVALID_VERB_FOR_WAITURL_TWIML = 13238;
    public static final int DIAL_SIP_INVALID_METHOD_VALUE = 13241;
    public static final int DIAL_SIP_INVALID_SENDDIGITS_VALUE = 13242;
    public static final int DIAL_SIP_INVALID_SIP_URI = 13243;
    public static final int DIAL_NO_SIP_AUTHORIZATION = 13244;
    public static final int GATHER_INVALID_FINISHONKEY_VALUE = 13310;
    public static final int GATHER_INVALID_FINISHONKEY_VALUE2 = 13311;
    public static final int GATHER_INVALID_METHOD_VALUE = 13312;
    public static final int GATHER_INVALID_TIMEOUT_VALUE = 13313;
    public static final int GATHER_INVALID_NUMDIGITS_VALUE = 13314;
    public static final int GATHER_INVALID_NESTED_VERB = 13320;
    public static final int GATHER_SAY_INVALID_VOICE_VALUE = 13321;
    public static final int GATHER_SAY_INVALID_LOOP_VALUE = 13322;
    public static final int GATHER_PLAY_INVALID_CONTENT_TYPE = 13325;
    public static final int PLAY_INVALID_LOOP_VALUE = 13410;
    public static final int PLAY_INVALID_CONTENT_TYPE = 13420;
    public static final int SAY_INVALID_LOOP_VALUE = 13510;
    public static final int SAY_INVALID_VOICE_VALUE = 13511;
    public static final int SAY_INVALID_TEXT = 13520;
    public static final int RECORD_INVALID_METHOD_VALUE = 13610;
    public static final int RECORD_INVALID_TIMEOUT_VALUE = 13611;
    public static final int RECORD_INVALID_MAXLENGTH_VALUE = 13612;
    public static final int RECORD_INVALID_FINISHONKEY_VALUE = 13613;
    public static final int RECORD_INVALID_TRANSCRIBE_VALUE = 13614;
    public static final int RECORD_MAXLENGTH_TOO_HIGH_FOR_TRANSCRIPTION = 13615;
    public static final int RECORD_PLAYBEEP_MUST_BE_TRUE_OR_FALSE = 13616;
    public static final int REDIRECT_INVALID_METHOD_VALUE = 13710;
    public static final int PAUSE_INVALID_LENGTH_VALUE = 13910;
    public static final int TO_ATTRIBUTE_IS_INVALID = 14101;
    public static final int SMS_FROM_ATTRIBUTE_IS_INVALID = 14102;
    public static final int SMS_INVALID_BODY = 14103;
    public static final int SMS_METHOD_ATTRIBUTE_INVALID = 14104;
    public static final int SMS_VERB_STATUSCALLBACK_ATTRIBUTE_INVALID = 14105;
    public static final int SMS_REPLY_TWIML_DOCUMENT_RETRIEVAL_LIMIT_REACHED = 14106;
    public static final int SMS_RATE_MESSAGE_LIMIT_EXCEEDED = 14107;
    public static final int SMS_FROM_PHONE_NUMBER_NOT_SMS_CAPABLE = 14108;
    public static final int SMS_REPLY_MESSAGE_LIMIT_EXCEEDED = 14109;
    public static final int INVALID_VERB_FOR_SMS_REPLY = 14110;
    public static final int INVALID_TO_PHONE_NUMBER_FOR_TRIAL_MODE = 14111;
    public static final int UNKNOWN_PARAMETERS = 20001;
    public static final int INVALID_FRIENDLYNAME = 20002;
    public static final int PERMISSION_DENIED = 20003;
    public static final int METHOD_NOT_ALLOWED = 20004;
    public static final int ACCOUNT_NOT_ACTIVE = 20005;
    public static final int ACCESS_DENIED = 20006;
    public static final int ACCOUNTS_RESOURCE = 21100;
    public static final int CALLS_RESOURCE = 21200;
    public static final int NO_TO_NUMBER_SPECIFIED = 21201;
    public static final int TO_NUMBER_IS_A_PREMIUM_NUMBER = 21202;
    public static final int INTERNATIONAL_CALLING_NOT_ENABLED = 21203;
    public static final int CALL_ALREADY_INITIATED = 21204;
    public static final int INVALID_URL = 21205;
    public static final int INVALID_SENDDIGITS = 21206;
    public static final int INVALID_IFMACHINE = 21207;
    public static final int INVALID_TIMEOUT = 21208;
    public static final int INVALID_METHOD = 21209;
    public static final int FROM_PHONE_NUMBER_NOT_VERIFIED = 21210;
    public static final int INVALID_TO_PHONE_NUMBER = 21211;
    public static final int INVALID_FROM_PHONE_NUMBER = 21212;
    public static final int FROM_PHONE_NUMBER_IS_REQUIRED = 21213;
    public static final int TO_PHONE_NUMBER_CANNOT_BE_REACHED = 21214;
    public static final int ACCOUNT_NOT_AUTHORIZED_TO_CALL_PHONE_NUMBER = 21215;
    public static final int ACCOUNT_NOT_ALLOWED_TO_CALL_PHONE_NUMBER = 21216;
    public static final int PHONE_NUMBER_DOES_NOT_APPEAR_TO_BE_VALID = 21217;
    public static final int INVALID_APPLICATIONSID = 21218;
    public static final int TO_PHONE_NUMBER_NOT_VERIFIED = 21219;
    public static final int INVALID_CALL_STATE = 21220;
    public static final int INVALID_PHONE_NUMBER = 21401;
    public static final int INVALID_URL2 = 21402;
    public static final int INVALID_METHOD2 = 21403;
    public static final int INBOUND_PHONE_NUMBERS_NOT_AVAILABLE_TO_TRIAL_ACCOUNTS = 21404;
    public static final int CANNOT_SET_VOICEFALLBACKURL_WITHOUT_SETTING_URL = 21405;
    public static final int CANNOT_SET_SMSFALLBACKURL_WITHOUT_SETTING_SMSURL = 21406;
    public static final int THIS_PHONE_NUMBER_TYPE_DOES_NOT_SUPPORT_SMS = 21407;
    public static final int PERMISSION_TO_SEND_AN_SMS_HAS_NOT_BEEN_ENABLED_FOR_THE_REGION_INDICATED_BY_THE_TO_NUMBER = 21408;
    public static final int APPLICATIONSID_IS_NOT_ACCESSIBLE = 21420;
    public static final int PHONENUMBER_IS_INVALID = 21421;
    public static final int PHONENUMBER_IS_NOT_AVAILABLE_FOR_PURCHASE = 21422;
    public static final int PHONE_NUMBER_ALREADY_VERIFIED_FOR_YOUR_ACCOUNT = 21450;
    public static final int INVALID_AREA_CODE = 21451;
    public static final int NO_PHONE_NUMBERS_FOUND_IN_AREA_CODE = 21452;
    public static final int PHONE_NUMBER_ALREADY_VERIFIED_FOR_ANOTHER_ACCOUNT = 21453;
    public static final int INVALID_CALLDELAY = 21454;
    public static final int INVALID_PLAYURL = 21455;
    public static final int INVALID_CALLBACKURL = 21456;
    public static final int AREACODE_PARAMETER_NOT_SUPPORTED = 21457;
    public static final int PHONENUMBER_PROVISIONING_TYPE_MISMATCH = 21458;
    public static final int INVALID_ACCOUNTSID = 21470;
    public static final int ACCOUNT_DOES_NOT_EXIST = 21471;
    public static final int ACCOUNT_IS_NOT_ACTIVE2 = 21472;
    public static final int ACCOUNTSID_YOU_ARE_TRANSFERRING_TO_IS_NOT_RELATED_TO_THE_ORIGINATING_OWNER_OF_THE_PHONE_NUMBER = 21473;
    public static final int API_USER_MUST_BE_THE_PARENT_ACCOUNT_TO_TRANSFER_PHONE_NUMBERS = 21474;
    public static final int UNABLE_TO_UPDATE_STATUS_INVALID_STATUS = 21475;
    public static final int UNABLE_TO_UPDATE_STATUS_FOR_SUBACCOUNT_PARENT_ACCOUNT_IS_SUSPENDED = 21476;
    public static final int UNABLE_TO_UPDATE_STATUS_FOR_PARENT_ACCOUNTS = 21477;
    public static final int UNABLE_TO_UPDATE_STATUS_FOR_SUBACCOUNT_SUBACCOUNT_HAS_BEEN_SUSPENDED_BY_TWILIO = 21478;
    public static final int UNABLE_TO_UPDATE_STATUS_FOR_SUBACCOUNT_SUBACCOUNT_HAS_BEEN_CLOSED = 21479;
    public static final int REACHED_MAXIMUM_NUMBER_OF_SUBACCOUNTS = 21480;
    public static final int RESOURCE_NOT_AVAILABLE = 21501;
    public static final int INVALID_CALLBACK_URL = 21502;
    public static final int INVALID_TRANSCRIPTION_TYPE = 21503;
    public static final int RECORDINGSID_IS_REQUIRED = 21504;
    public static final int PHONE_NUMBER_IS_NOT_A_VALID_SMS_CAPABLE_INBOUND_PHONE_NUMBER = 21601;
    public static final int MESSAGE_BODY_IS_REQUIRED_TO_SEND_AN_SMS = 21602;
    public static final int FROM_PHONE_NUMBER_IS_REQUIRED_TO_SEND_AN_SMS = 21603;
    public static final int TO_PHONE_NUMBER_IS_REQUIRED_TO_SEND_AN_SMS = 21604;
    public static final int MAXIMUM_BODY_LENGTH_IS_160_CHARACTERS = 21605;
    public static final int THE_FROM_PHONE_NUMBER_PROVIDED_IS_NOT_A_VALID_SMS_CAPABLE_TWILIO_PHONE_NUMBER = 21606;
    public static final int THE_FROM_NUMBER_MUST_BE_THE_SANDBOX_PHONE_NUMBER_FOR_TRIAL_ACCOUNTS = 21607;
    public static final int THE_SANDBOX_NUMBER_CAN_SEND_SMS_MESSAGES_ONLY_TO_VERIFIED_NUMBERS = 21608;
    public static final int SMS_CANNOT_BE_SENT_TO_THE_TO_NUMBER_BECAUSE_THE_CUSTOMER_HAS_REPLIED_WITH_STOP = 21610;
    public static final int THIS_FROM_NUMBER_HAS_EXCEEDED_THE_MAXIMUM_NUMBER_OF_QUEUED_MESSAGES = 21611;
    public static final int THE_TO_PHONE_NUMBER_IS_NOT_CURRENTLY_REACHABLE_VIA_SMS = 21612;
    public static final int PHONENUMBER_REQUIRES_CERTIFICATION = 21613;
    public static final int TO_NUMBER_IS_NOT_A_VALID_MOBILE_NUMBER = 21614;
    public static final int THE_FROM_NUMBER_MATCHES_MULTIPLE_NUMBERS_FOR_YOUR_ACCOUNT = 21616;

    private ErrorCodes() {
    }
}

