package com.adadapted.android.sdk.core.session;

import A6.d;
import C6.a;
import C6.b;
import I6.p;
import J6.r;
import J6.s;
import U6.M;
import com.adadapted.android.sdk.constants.Config;
import com.adadapted.android.sdk.core.concurrency.Timer;
import com.adadapted.android.sdk.core.concurrency.Transporter;
import com.adadapted.android.sdk.core.concurrency.TransporterCoroutineScope;
import com.adadapted.android.sdk.core.device.DeviceInfo;
import com.adadapted.android.sdk.core.device.DeviceInfoClient;
import com.adadapted.android.sdk.core.interfaces.DeviceCallback;
import com.adadapted.android.sdk.core.interfaces.SessionAdapter;
import com.adadapted.android.sdk.core.interfaces.SessionAdapterListener;
import com.adadapted.android.sdk.core.log.AALogger;
import com.adadapted.android.sdk.core.view.ZoneContext;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public final class SessionClient implements SessionAdapterListener {
    private static SessionAdapter adapter;
    private static Session currentSession;
    private static boolean hasInstance;
    public static final SessionClient INSTANCE = new SessionClient();
    private static TransporterCoroutineScope transporter = new Transporter();
    private static Set<ZoneContext> zoneContexts = new LinkedHashSet();
    private static final Set<SessionListener> sessionListeners = new HashSet();
    private static final Set<String> presenters = new HashSet();
    private static boolean pollingTimerRunning = false;
    private static boolean eventTimerRunning = false;
    private static Status status = Status.OK;
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status OK = new Status("OK", 0);
        public static final Status SHOULD_REFRESH = new Status("SHOULD_REFRESH", 1);
        public static final Status IS_REFRESH_ADS = new Status("IS_REFRESH_ADS", 2);
        public static final Status IS_REINITIALIZING_SESSION = new Status("IS_REINITIALIZING_SESSION", 3);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{OK, SHOULD_REFRESH, IS_REFRESH_ADS, IS_REINITIALIZING_SESSION};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Status(String str, int i8) {
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    @f(c = "com.adadapted.android.sdk.core.session.SessionClient$performInitialize$1", f = "SessionClient.kt", l = {65}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.session.SessionClient$performInitialize$1, reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        final /* synthetic */ DeviceInfo $deviceInfo;
        int label;
        final /* synthetic */ SessionClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DeviceInfo deviceInfo, SessionClient sessionClient, d dVar) {
            super(2, dVar);
            this.$deviceInfo = deviceInfo;
            this.this$0 = sessionClient;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$deviceInfo, this.this$0, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.label;
            if (i8 == 0) {
                q.b(obj);
                SessionAdapter sessionAdapter = SessionClient.adapter;
                if (sessionAdapter != null) {
                    DeviceInfo deviceInfo = this.$deviceInfo;
                    SessionClient sessionClient = this.this$0;
                    this.label = 1;
                    if (sessionAdapter.sendInit(deviceInfo, sessionClient, this) == e8) {
                        return e8;
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            return C6916E.f44463a;
        }
    }

    @f(c = "com.adadapted.android.sdk.core.session.SessionClient$performRefreshAds$1", f = "SessionClient.kt", l = {102}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.session.SessionClient$performRefreshAds$1, reason: invalid class name and case insensitive filesystem */
    static final class C10481 extends l implements p {
        int label;

        C10481(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return SessionClient.this.new C10481(dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10481) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.label;
            if (i8 == 0) {
                q.b(obj);
                SessionAdapter sessionAdapter = SessionClient.adapter;
                if (sessionAdapter != null) {
                    Session session = SessionClient.currentSession;
                    if (session == null) {
                        r.p("currentSession");
                        session = null;
                    }
                    SessionClient sessionClient = SessionClient.this;
                    Set<ZoneContext> set = SessionClient.zoneContexts;
                    this.label = 1;
                    if (sessionAdapter.sendRefreshAds(session, sessionClient, set, this) == e8) {
                        return e8;
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            return C6916E.f44463a;
        }
    }

    @f(c = "com.adadapted.android.sdk.core.session.SessionClient$performReinitialize$1", f = "SessionClient.kt", l = {88}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.session.SessionClient$performReinitialize$1, reason: invalid class name and case insensitive filesystem */
    static final class C10491 extends l implements p {
        final /* synthetic */ DeviceInfo $deviceInfo;
        int label;
        final /* synthetic */ SessionClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10491(DeviceInfo deviceInfo, SessionClient sessionClient, d dVar) {
            super(2, dVar);
            this.$deviceInfo = deviceInfo;
            this.this$0 = sessionClient;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C10491(this.$deviceInfo, this.this$0, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10491) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.label;
            if (i8 == 0) {
                q.b(obj);
                SessionAdapter sessionAdapter = SessionClient.adapter;
                if (sessionAdapter != null) {
                    DeviceInfo deviceInfo = this.$deviceInfo;
                    SessionClient sessionClient = this.this$0;
                    this.label = 1;
                    if (sessionAdapter.sendInit(deviceInfo, sessionClient, this) == e8) {
                        return e8;
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            return C6916E.f44463a;
        }
    }

    /* renamed from: com.adadapted.android.sdk.core.session.SessionClient$removeZoneContext$1, reason: invalid class name and case insensitive filesystem */
    static final class C10501 extends s implements I6.l {
        final /* synthetic */ String $zoneId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10501(String str) {
            super(1);
            this.$zoneId = str;
        }

        @Override // I6.l
        public final Boolean invoke(ZoneContext zoneContext) {
            r.e(zoneContext, "z");
            return Boolean.valueOf(r.a(zoneContext.getZoneId(), this.$zoneId));
        }
    }

    private SessionClient() {
    }

    private final void notifyAdsAvailable() {
        for (SessionListener sessionListener : sessionListeners) {
            Session session = currentSession;
            if (session == null) {
                r.p("currentSession");
                session = null;
            }
            sessionListener.onAdsAvailable(session);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyPublishEvents() {
        Iterator<SessionListener> it = sessionListeners.iterator();
        while (it.hasNext()) {
            it.next().onPublishEvents();
        }
    }

    private final void notifySessionAvailable() {
        for (SessionListener sessionListener : sessionListeners) {
            Session session = currentSession;
            if (session == null) {
                r.p("currentSession");
                session = null;
            }
            sessionListener.onSessionAvailable(session);
        }
    }

    private final void notifySessionExpired() {
        Iterator<SessionListener> it = sessionListeners.iterator();
        while (it.hasNext()) {
            it.next().onSessionExpired();
        }
    }

    private final void notifySessionInitFailed() {
        Iterator<SessionListener> it = sessionListeners.iterator();
        while (it.hasNext()) {
            it.next().onSessionInitFailed();
        }
    }

    private final void performAddListener(SessionListener sessionListener) {
        sessionListeners.add(sessionListener);
        Session session = currentSession;
        if (session != null) {
            if (session == null) {
                r.p("currentSession");
                session = null;
            }
            sessionListener.onSessionAvailable(session);
        }
    }

    private final void performAddPresenter(SessionListener sessionListener) {
        performAddListener(sessionListener);
        presenters.add(sessionListener.toString());
        if (status == Status.SHOULD_REFRESH) {
            performRefresh$default(this, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performInitialize(DeviceInfo deviceInfo) {
        transporter.dispatchToThread(new AnonymousClass1(deviceInfo, this, null));
    }

    private final void performRefresh(DeviceInfo deviceInfo) {
        Session session = currentSession;
        Session session2 = null;
        if (session == null) {
            r.p("currentSession");
            session = null;
        }
        if (!session.hasExpired()) {
            performRefreshAds();
            return;
        }
        AALogger aALogger = AALogger.INSTANCE;
        Session session3 = currentSession;
        if (session3 == null) {
            r.p("currentSession");
        } else {
            session2 = session3;
        }
        aALogger.logInfo("Session has expired. Expired at: " + session2.getExpiration());
        notifySessionExpired();
        if (deviceInfo != null) {
            performReinitialize(deviceInfo);
        }
    }

    static /* synthetic */ void performRefresh$default(SessionClient sessionClient, DeviceInfo deviceInfo, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            deviceInfo = DeviceInfoClient.INSTANCE.getCachedDeviceInfo();
        }
        sessionClient.performRefresh(deviceInfo);
    }

    private final void performRefreshAds() {
        Status status2 = status;
        Status status3 = Status.OK;
        if (status2 == status3 || status == Status.SHOULD_REFRESH) {
            if (presenterSize() <= 0) {
                status = Status.SHOULD_REFRESH;
                return;
            }
            AALogger.INSTANCE.logInfo("Checking for more Ads.");
            if (!AbstractC6987o.t(zoneContexts)) {
                status3 = Status.IS_REFRESH_ADS;
            }
            status = status3;
            transporter.dispatchToThread(new C10481(null));
        }
    }

    private final void performReinitialize(DeviceInfo deviceInfo) {
        if (status == Status.OK || status == Status.SHOULD_REFRESH) {
            if (presenterSize() <= 0) {
                status = Status.SHOULD_REFRESH;
                return;
            }
            AALogger.INSTANCE.logInfo("Reinitializing Session.");
            status = Status.IS_REINITIALIZING_SESSION;
            transporter.dispatchToThread(new C10491(deviceInfo, this, null));
        }
    }

    private final void performRemoveListener(SessionListener sessionListener) {
        sessionListeners.remove(sessionListener);
    }

    private final void performRemovePresenter(SessionListener sessionListener) {
        performRemoveListener(sessionListener);
        presenters.remove(sessionListener.toString());
    }

    private final int presenterSize() {
        return presenters.size();
    }

    private final void startPollingTimer() {
        if (!pollingTimerRunning) {
            Session session = currentSession;
            Session session2 = null;
            if (session == null) {
                r.p("currentSession");
                session = null;
            }
            if (!session.willNotServeAds()) {
                pollingTimerRunning = true;
                AALogger.INSTANCE.logInfo("Starting Ad polling timer.");
                SessionClient$startPollingTimer$refreshTimer$1 sessionClient$startPollingTimer$refreshTimer$1 = SessionClient$startPollingTimer$refreshTimer$1.INSTANCE;
                Session session3 = currentSession;
                if (session3 == null) {
                    r.p("currentSession");
                    session3 = null;
                }
                long refreshTime = session3.getRefreshTime();
                Session session4 = currentSession;
                if (session4 == null) {
                    r.p("currentSession");
                } else {
                    session2 = session4;
                }
                new Timer(sessionClient$startPollingTimer$refreshTimer$1, refreshTime, session2.getRefreshTime()).startTimer();
                return;
            }
        }
        AALogger.INSTANCE.logInfo("Session will not serve Ads. Ignoring Ad polling timer.");
    }

    private final void startPublishTimer() {
        if (eventTimerRunning) {
            return;
        }
        eventTimerRunning = true;
        new Timer(SessionClient$startPublishTimer$eventTimer$1.INSTANCE, Config.DEFAULT_EVENT_POLLING, Config.DEFAULT_EVENT_POLLING).startTimer();
    }

    private final void updateCurrentSession(Session session) {
        currentSession = session;
        startPublishTimer();
        startPollingTimer();
    }

    private final void updateCurrentZones(Session session) {
        Session session2 = currentSession;
        if (session2 == null) {
            r.p("currentSession");
            session2 = null;
        }
        session2.updateZones(session.getAllZones());
        startPollingTimer();
    }

    public final void addListener(SessionListener sessionListener) {
        r.e(sessionListener, "listener");
        performAddListener(sessionListener);
    }

    public final void addPresenter(SessionListener sessionListener) {
        r.e(sessionListener, "listener");
        performAddPresenter(sessionListener);
    }

    public final void clearZoneContext() {
        zoneContexts = new LinkedHashSet();
        performRefreshAds();
    }

    public final void createInstance(SessionAdapter sessionAdapter, TransporterCoroutineScope transporterCoroutineScope) {
        r.e(sessionAdapter, "adapter");
        r.e(transporterCoroutineScope, "transporter");
        adapter = sessionAdapter;
        transporter = transporterCoroutineScope;
        hasInstance = true;
    }

    public final Status getStatus() {
        return status;
    }

    public final boolean hasInstance() {
        return hasInstance;
    }

    public final boolean hasStaleAds() {
        return status != Status.OK;
    }

    @Override // com.adadapted.android.sdk.core.interfaces.AdGetListener
    public void onNewAdsLoadFailed() {
        updateCurrentZones(new Session(null, false, false, 0L, 0L, null, 63, null));
        status = Status.OK;
        notifyAdsAvailable();
    }

    @Override // com.adadapted.android.sdk.core.interfaces.AdGetListener
    public void onNewAdsLoaded(Session session) {
        r.e(session, "session");
        updateCurrentZones(session);
        status = Status.OK;
        notifyAdsAvailable();
    }

    @Override // com.adadapted.android.sdk.core.interfaces.SessionInitListener
    public void onSessionInitializeFailed() {
        updateCurrentSession(new Session(null, false, false, 0L, 0L, null, 63, null));
        status = Status.OK;
        notifySessionInitFailed();
    }

    @Override // com.adadapted.android.sdk.core.interfaces.SessionInitListener
    public void onSessionInitialized(Session session) {
        r.e(session, "session");
        updateCurrentSession(session);
        status = Status.OK;
        notifySessionAvailable();
    }

    public final void removeListener(SessionListener sessionListener) {
        r.e(sessionListener, "listener");
        performRemoveListener(sessionListener);
    }

    public final void removePresenter(SessionListener sessionListener) {
        r.e(sessionListener, "listener");
        performRemovePresenter(sessionListener);
    }

    public final void removeZoneContext(String str) {
        r.e(str, "zoneId");
        AbstractC6987o.q(zoneContexts, new C10501(str));
        performRefreshAds();
    }

    public final void setZoneContext(ZoneContext zoneContext) {
        r.e(zoneContext, "zoneContext");
        Set<ZoneContext> set = zoneContexts;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (r.a(((ZoneContext) it.next()).getZoneId(), zoneContext.getZoneId())) {
                    return;
                }
            }
        }
        zoneContexts.add(zoneContext);
        performRefreshAds();
    }

    public final synchronized void start(SessionListener sessionListener) {
        r.e(sessionListener, "listener");
        addListener(sessionListener);
        DeviceInfoClient.INSTANCE.getDeviceInfo(new DeviceCallback() { // from class: com.adadapted.android.sdk.core.session.SessionClient.start.1
            @Override // com.adadapted.android.sdk.core.interfaces.DeviceCallback
            public void onDeviceInfoCollected(DeviceInfo deviceInfo) {
                r.e(deviceInfo, "deviceInfo");
                SessionClient.transporter.dispatchToThread(new SessionClient$start$1$onDeviceInfoCollected$1(deviceInfo, null));
            }
        });
    }
}
