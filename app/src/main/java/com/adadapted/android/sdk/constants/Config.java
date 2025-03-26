package com.adadapted.android.sdk.constants;

/* loaded from: classes.dex */
public final class Config {
    public static final String AASDK_PREFS_GENERATED_ID_KEY = "GENERATED_ID";
    public static final String AASDK_PREFS_KEY = "AASDK_PREFS";
    public static final String AASDK_PREFS_TRACKING_DISABLED_KEY = "TRACKING_DISABLED";
    private static final String AD_EVENTS_PATH = "android/ads/events";
    public static final String AD_ID_PARAM = "aid";
    private static final String AD_SERVER_VERSION = "/v/0.9.5/";
    public static final long DEFAULT_AD_POLLING = 300000;
    public static final long DEFAULT_AD_REFRESH = 6000;
    public static final long DEFAULT_EVENT_POLLING = 3000;
    private static final String ERROR_TRACK_PATH = "android/errors";
    private static final String EVENT_TRACK_PATH = "android/events";
    private static final String INTERCEPT_EVENTS_PATH = "android/intercepts/events";
    public static final String LIBRARY_VERSION = "4.0.13";
    public static final String LOG_TAG = "ADADAPTED_ANDROID_SDK";
    private static final String PAYLOAD_PICKUP_PATH = "pickup";
    private static final String PAYLOAD_SERVER_VERSION = "/v/1/";
    private static final String PAYLOAD_TRACK_PATH = "tracking";
    private static final String REFRESH_ADS_PATH = "android/ads/retrieve";
    private static final String RETRIEVE_INTERCEPTS_PATH = "android/intercepts/retrieve";
    private static final String SESSION_INIT_PATH = "android/sessions/initialize";
    private static final String TRACKING_SERVER_VERSION = "/v/1/";
    public static final String UDID_PARAM = "uid";
    private static boolean isProd;
    public static final Config INSTANCE = new Config();
    public static final int $stable = 8;

    public static final class Prod {
        public static final int $stable = 0;
        public static final String AD_REPORTING_URL = "https://feedback.add-it.io/?";
        public static final String AD_SERVER_HOST = "https://ads.adadapted.com";
        public static final String EVENT_COLLECTOR_HOST = "https://ec.adadapted.com";
        public static final Prod INSTANCE = new Prod();
        public static final String PAYLOAD_HOST = "https://payload.adadapted.com";

        private Prod() {
        }
    }

    public static final class Sand {
        public static final int $stable = 0;
        public static final String AD_REPORTING_URL = "https://dev.feedback.add-it.io/?";
        public static final String AD_SERVER_HOST = "https://sandbox.adadapted.com";
        public static final String EVENT_COLLECTOR_HOST = "https://sandec.adadapted.com";
        public static final Sand INSTANCE = new Sand();
        public static final String PAYLOAD_HOST = "https://sandpayload.adadapted.com";

        private Sand() {
        }
    }

    private Config() {
    }

    private final String getAdServerFormattedUrl(String str) {
        return getAdServerHost() + AD_SERVER_VERSION + str;
    }

    private final String getAdServerHost() {
        return isProd ? Prod.AD_SERVER_HOST : Sand.AD_SERVER_HOST;
    }

    private final String getEventCollectorHost() {
        return isProd ? Prod.EVENT_COLLECTOR_HOST : Sand.EVENT_COLLECTOR_HOST;
    }

    private final String getPayloadHost() {
        return isProd ? Prod.PAYLOAD_HOST : Sand.PAYLOAD_HOST;
    }

    private final String getPayloadServerFormattedUrl(String str) {
        return getPayloadHost() + "/v/1/" + str;
    }

    private final String getTrackingServerFormattedUrl(String str) {
        return getEventCollectorHost() + "/v/1/" + str;
    }

    public final String getAdEventsUrl() {
        return getAdServerFormattedUrl(AD_EVENTS_PATH);
    }

    public final String getAdReportingHost() {
        return isProd ? Prod.AD_REPORTING_URL : Sand.AD_REPORTING_URL;
    }

    public final String getInitSessionUrl() {
        return getAdServerFormattedUrl(SESSION_INIT_PATH);
    }

    public final String getInterceptEventsUrl() {
        return getAdServerFormattedUrl(INTERCEPT_EVENTS_PATH);
    }

    public final String getPickupPayloadsUrl() {
        return getPayloadServerFormattedUrl(PAYLOAD_PICKUP_PATH);
    }

    public final String getRefreshAdsUrl() {
        return getAdServerFormattedUrl(REFRESH_ADS_PATH);
    }

    public final String getRetrieveInterceptsUrl() {
        return getAdServerFormattedUrl(RETRIEVE_INTERCEPTS_PATH);
    }

    public final String getSdkErrorsUrl() {
        return getTrackingServerFormattedUrl(ERROR_TRACK_PATH);
    }

    public final String getSdkEventsUrl() {
        return getTrackingServerFormattedUrl(EVENT_TRACK_PATH);
    }

    public final String getTrackingPayloadUrl() {
        return getPayloadServerFormattedUrl(PAYLOAD_TRACK_PATH);
    }

    public final void init(boolean z7) {
        isProd = z7;
    }
}
