package com.adadapted.android.sdk;

import C6.a;
import C6.b;
import I6.l;
import J6.r;
import J6.s;
import android.content.Context;
import android.content.SharedPreferences;
import com.adadapted.android.sdk.constants.Config;
import com.adadapted.android.sdk.core.atl.AddItContentPublisher;
import com.adadapted.android.sdk.core.atl.AdditContent;
import com.adadapted.android.sdk.core.concurrency.Transporter;
import com.adadapted.android.sdk.core.device.DeviceInfoClient;
import com.adadapted.android.sdk.core.device.DeviceInfoExtractor;
import com.adadapted.android.sdk.core.event.EventBroadcaster;
import com.adadapted.android.sdk.core.event.EventClient;
import com.adadapted.android.sdk.core.interfaces.AaSdkAdditContentListener;
import com.adadapted.android.sdk.core.interfaces.AaSdkEventListener;
import com.adadapted.android.sdk.core.interfaces.AaSdkSessionListener;
import com.adadapted.android.sdk.core.keyword.InterceptClient;
import com.adadapted.android.sdk.core.keyword.KeywordInterceptMatcher;
import com.adadapted.android.sdk.core.log.AALogger;
import com.adadapted.android.sdk.core.network.HttpConnector;
import com.adadapted.android.sdk.core.network.HttpEventAdapter;
import com.adadapted.android.sdk.core.network.HttpInterceptAdapter;
import com.adadapted.android.sdk.core.network.HttpPayloadAdapter;
import com.adadapted.android.sdk.core.network.HttpSessionAdapter;
import com.adadapted.android.sdk.core.payload.PayloadClient;
import com.adadapted.android.sdk.core.session.Session;
import com.adadapted.android.sdk.core.session.SessionClient;
import com.adadapted.android.sdk.core.session.SessionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x6.C6916E;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public final class AdAdapted {
    private static AaSdkAdditContentListener contentListener;
    private static AaSdkEventListener eventListener;
    private static boolean hasStarted;
    private static boolean isKeywordInterceptEnabled;
    private static boolean isPayloadEnabled;
    private static boolean isProd;
    public static AaSdkSessionListener sessionListener;
    public static final AdAdapted INSTANCE = new AdAdapted();
    private static String apiKey = "";
    private static String customIdentifier = "";
    private static Map<String, String> params = new HashMap();
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Env {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Env[] $VALUES;
        public static final Env PROD = new Env("PROD", 0);
        public static final Env DEV = new Env("DEV", 1);

        private static final /* synthetic */ Env[] $values() {
            return new Env[]{PROD, DEV};
        }

        static {
            Env[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Env(String str, int i8) {
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static Env valueOf(String str) {
            return (Env) Enum.valueOf(Env.class, str);
        }

        public static Env[] values() {
            return (Env[]) $VALUES.clone();
        }
    }

    /* renamed from: com.adadapted.android.sdk.AdAdapted$start$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements l {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(1);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<AdditContent>) obj);
            return C6916E.f44463a;
        }

        public final void invoke(List<AdditContent> list) {
            r.e(list, "it");
            if (list.isEmpty()) {
                return;
            }
            Iterator<AdditContent> it = list.iterator();
            while (it.hasNext()) {
                AddItContentPublisher.INSTANCE.publishAddItContent(it.next());
            }
        }
    }

    private AdAdapted() {
    }

    private final void setAdTracking(Context context, boolean z7) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(Config.AASDK_PREFS_KEY, 0);
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(Config.AASDK_PREFS_TRACKING_DISABLED_KEY, z7);
        edit.apply();
    }

    private final void setupClients(Context context) {
        Config config = Config.INSTANCE;
        config.init(isProd);
        DeviceInfoClient.INSTANCE.createInstance(apiKey, isProd, params, customIdentifier, new DeviceInfoExtractor(context), new Transporter());
        SessionClient sessionClient = SessionClient.INSTANCE;
        String initSessionUrl = config.getInitSessionUrl();
        String refreshAdsUrl = config.getRefreshAdsUrl();
        HttpConnector httpConnector = HttpConnector.INSTANCE;
        sessionClient.createInstance(new HttpSessionAdapter(initSessionUrl, refreshAdsUrl, httpConnector), new Transporter());
        EventClient eventClient = EventClient.INSTANCE;
        eventClient.createInstance(new HttpEventAdapter(config.getAdEventsUrl(), config.getSdkEventsUrl(), config.getSdkErrorsUrl(), httpConnector), new Transporter());
        InterceptClient.Companion.createInstance(new HttpInterceptAdapter(config.getRetrieveInterceptsUrl(), config.getInterceptEventsUrl(), httpConnector), new Transporter());
        PayloadClient.INSTANCE.createInstance(new HttpPayloadAdapter(config.getPickupPayloadsUrl(), config.getTrackingPayloadUrl(), httpConnector), eventClient, new Transporter());
    }

    public final AdAdapted disableAdTracking(Context context) {
        r.e(context, "context");
        setAdTracking(context, true);
        return this;
    }

    public final AdAdapted enableAdTracking(Context context) {
        r.e(context, "context");
        setAdTracking(context, false);
        return this;
    }

    public final AdAdapted enableDebugLogging() {
        AALogger.INSTANCE.enableDebugLogging();
        return this;
    }

    public final AdAdapted enableKeywordIntercept(boolean z7) {
        isKeywordInterceptEnabled = z7;
        return this;
    }

    public final AdAdapted enablePayloads(boolean z7) {
        isPayloadEnabled = z7;
        return this;
    }

    public final AaSdkSessionListener getSessionListener() {
        AaSdkSessionListener aaSdkSessionListener = sessionListener;
        if (aaSdkSessionListener != null) {
            return aaSdkSessionListener;
        }
        r.p("sessionListener");
        return null;
    }

    public final AdAdapted inEnv(Env env) {
        r.e(env, "env");
        isProd = env == Env.PROD;
        return this;
    }

    public final AdAdapted setCustomIdentifier(String str) {
        r.e(str, "identifier");
        customIdentifier = str;
        return this;
    }

    public final AdAdapted setOptionalParams(HashMap<String, String> hashMap) {
        r.e(hashMap, "params");
        params = hashMap;
        return this;
    }

    public final AdAdapted setSdkAdditContentListener(AaSdkAdditContentListener aaSdkAdditContentListener) {
        r.e(aaSdkAdditContentListener, "listener");
        contentListener = aaSdkAdditContentListener;
        return this;
    }

    public final AdAdapted setSdkEventListener(AaSdkEventListener aaSdkEventListener) {
        r.e(aaSdkEventListener, "listener");
        eventListener = aaSdkEventListener;
        return this;
    }

    public final AdAdapted setSdkSessionListener(AaSdkSessionListener aaSdkSessionListener) {
        r.e(aaSdkSessionListener, "listener");
        setSessionListener(aaSdkSessionListener);
        return this;
    }

    public final void setSessionListener(AaSdkSessionListener aaSdkSessionListener) {
        r.e(aaSdkSessionListener, "<set-?>");
        sessionListener = aaSdkSessionListener;
    }

    public final void start(Context context) {
        r.e(context, "context");
        if (apiKey.length() == 0) {
            AALogger.INSTANCE.logError("The AdAdapted Api Key is missing or NULL");
        }
        if (hasStarted && !isProd) {
            AALogger.INSTANCE.logError("AdAdapted Android Advertising SDK has already been started.");
        }
        hasStarted = true;
        setupClients(context);
        AaSdkEventListener aaSdkEventListener = eventListener;
        AaSdkAdditContentListener aaSdkAdditContentListener = null;
        if (aaSdkEventListener == null) {
            r.p("eventListener");
            aaSdkEventListener = null;
        }
        EventBroadcaster.setListener$default(EventBroadcaster.INSTANCE, aaSdkEventListener, null, 2, null);
        AaSdkAdditContentListener aaSdkAdditContentListener2 = contentListener;
        if (aaSdkAdditContentListener2 == null) {
            r.p("contentListener");
        } else {
            aaSdkAdditContentListener = aaSdkAdditContentListener2;
        }
        AddItContentPublisher.INSTANCE.addListener(aaSdkAdditContentListener);
        if (isPayloadEnabled) {
            PayloadClient.INSTANCE.pickupPayloads(AnonymousClass3.INSTANCE);
        }
        SessionClient.INSTANCE.start(new SessionListener() { // from class: com.adadapted.android.sdk.AdAdapted$start$startListener$1
            @Override // com.adadapted.android.sdk.core.session.SessionListener
            public void onAdsAvailable(Session session) {
                r.e(session, "session");
                AdAdapted.INSTANCE.getSessionListener().onHasAdsToServe(session.hasActiveCampaigns(), session.getZonesWithAds());
            }

            @Override // com.adadapted.android.sdk.core.session.SessionListener
            public void onPublishEvents() {
                SessionListener.DefaultImpls.onPublishEvents(this);
            }

            @Override // com.adadapted.android.sdk.core.session.SessionListener
            public void onSessionAvailable(Session session) {
                r.e(session, "session");
                AdAdapted.INSTANCE.getSessionListener().onHasAdsToServe(session.hasActiveCampaigns(), session.getZonesWithAds());
                if (session.hasActiveCampaigns() && session.getZonesWithAds().isEmpty()) {
                    AALogger.INSTANCE.logError("The session has ads to show but none were loaded properly. Is an obfuscation tool obstructing the AdAdapted Library?");
                }
            }

            @Override // com.adadapted.android.sdk.core.session.SessionListener
            public void onSessionExpired() {
                SessionListener.DefaultImpls.onSessionExpired(this);
            }

            @Override // com.adadapted.android.sdk.core.session.SessionListener
            public void onSessionInitFailed() {
                AdAdapted.INSTANCE.getSessionListener().onHasAdsToServe(false, AbstractC6987o.e());
            }
        });
        if (isKeywordInterceptEnabled) {
            KeywordInterceptMatcher.INSTANCE.match("INIT");
        }
        AALogger.INSTANCE.logInfo("AdAdapted Android SDK 4.0.13 initialized.");
    }

    public final AdAdapted withAppId(String str) {
        r.e(str, "key");
        apiKey = str;
        return this;
    }
}
