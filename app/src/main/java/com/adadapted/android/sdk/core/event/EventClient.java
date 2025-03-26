package com.adadapted.android.sdk.core.event;

import A6.d;
import B6.b;
import I6.p;
import J6.AbstractC0650j;
import J6.r;
import U6.M;
import com.adadapted.android.sdk.constants.EventStrings;
import com.adadapted.android.sdk.core.ad.Ad;
import com.adadapted.android.sdk.core.concurrency.Transporter;
import com.adadapted.android.sdk.core.concurrency.TransporterCoroutineScope;
import com.adadapted.android.sdk.core.interfaces.EventClientListener;
import com.adadapted.android.sdk.core.log.AALogger;
import com.adadapted.android.sdk.core.session.Session;
import com.adadapted.android.sdk.core.session.SessionClient;
import com.adadapted.android.sdk.core.session.SessionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public final class EventClient implements SessionListener {
    public static final int $stable;
    public static final EventClient INSTANCE;
    private static final Set<AdEvent> adEvents;
    private static EventAdapter eventAdapter;
    private static boolean hasInstance;
    private static final Set<EventClientListener> listeners;
    private static final Set<SdkError> sdkErrors;
    private static final Set<SdkEvent> sdkEvents;
    private static Session session;
    private static TransporterCoroutineScope transporter;

    @f(c = "com.adadapted.android.sdk.core.event.EventClient$onPublishEvents$1", f = "EventClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.event.EventClient$onPublishEvents$1, reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        int label;

        AnonymousClass1(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            EventClient eventClient = EventClient.INSTANCE;
            eventClient.performPublishAdEvents();
            eventClient.performPublishSdkEvents();
            eventClient.performPublishSdkErrors();
            return C6916E.f44463a;
        }
    }

    @f(c = "com.adadapted.android.sdk.core.event.EventClient$trackImpression$1", f = "EventClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.event.EventClient$trackImpression$1, reason: invalid class name and case insensitive filesystem */
    static final class C10261 extends l implements p {
        final /* synthetic */ Ad $ad;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10261(Ad ad, d dVar) {
            super(2, dVar);
            this.$ad = ad;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C10261(this.$ad, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10261) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            EventClient.INSTANCE.fileEvent(this.$ad, AdEventTypes.IMPRESSION);
            return C6916E.f44463a;
        }
    }

    @f(c = "com.adadapted.android.sdk.core.event.EventClient$trackInteraction$1", f = "EventClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.event.EventClient$trackInteraction$1, reason: invalid class name and case insensitive filesystem */
    static final class C10271 extends l implements p {
        final /* synthetic */ Ad $ad;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10271(Ad ad, d dVar) {
            super(2, dVar);
            this.$ad = ad;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C10271(this.$ad, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10271) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            EventClient.INSTANCE.fileEvent(this.$ad, AdEventTypes.INTERACTION);
            return C6916E.f44463a;
        }
    }

    @f(c = "com.adadapted.android.sdk.core.event.EventClient$trackInvisibleImpression$1", f = "EventClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.event.EventClient$trackInvisibleImpression$1, reason: invalid class name and case insensitive filesystem */
    static final class C10281 extends l implements p {
        final /* synthetic */ Ad $ad;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10281(Ad ad, d dVar) {
            super(2, dVar);
            this.$ad = ad;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C10281(this.$ad, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10281) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            EventClient.INSTANCE.fileEvent(this.$ad, AdEventTypes.INVISIBLE_IMPRESSION);
            return C6916E.f44463a;
        }
    }

    @f(c = "com.adadapted.android.sdk.core.event.EventClient$trackPopupBegin$1", f = "EventClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.event.EventClient$trackPopupBegin$1, reason: invalid class name and case insensitive filesystem */
    static final class C10291 extends l implements p {
        final /* synthetic */ Ad $ad;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10291(Ad ad, d dVar) {
            super(2, dVar);
            this.$ad = ad;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C10291(this.$ad, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10291) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            EventClient.INSTANCE.fileEvent(this.$ad, AdEventTypes.POPUP_BEGIN);
            return C6916E.f44463a;
        }
    }

    @f(c = "com.adadapted.android.sdk.core.event.EventClient$trackSdkError$1", f = "EventClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.event.EventClient$trackSdkError$1, reason: invalid class name and case insensitive filesystem */
    static final class C10301 extends l implements p {
        final /* synthetic */ String $code;
        final /* synthetic */ String $message;
        final /* synthetic */ Map<String, String> $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10301(String str, String str2, Map<String, String> map, d dVar) {
            super(2, dVar);
            this.$code = str;
            this.$message = str2;
            this.$params = map;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C10301(this.$code, this.$message, this.$params, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10301) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            EventClient.INSTANCE.performTrackSdkError(this.$code, this.$message, this.$params);
            return C6916E.f44463a;
        }
    }

    @f(c = "com.adadapted.android.sdk.core.event.EventClient$trackSdkEvent$1", f = "EventClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.event.EventClient$trackSdkEvent$1, reason: invalid class name and case insensitive filesystem */
    static final class C10311 extends l implements p {
        final /* synthetic */ String $name;
        final /* synthetic */ Map<String, String> $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10311(String str, Map<String, String> map, d dVar) {
            super(2, dVar);
            this.$name = str;
            this.$params = map;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C10311(this.$name, this.$params, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10311) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            EventClient.INSTANCE.performTrackSdkEvent(this.$name, this.$params);
            return C6916E.f44463a;
        }
    }

    static {
        EventClient eventClient = new EventClient();
        INSTANCE = eventClient;
        transporter = new Transporter();
        listeners = new HashSet();
        adEvents = new HashSet();
        sdkEvents = new HashSet();
        sdkErrors = new HashSet();
        SessionClient.INSTANCE.addListener(eventClient);
        $stable = 8;
    }

    private EventClient() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void fileEvent(Ad ad, String str) {
        if (session == null) {
            return;
        }
        AdEvent adEvent = new AdEvent(ad.getId(), ad.getZoneId(), ad.getImpressionId(), str, 0L, 16, (AbstractC0650j) null);
        adEvents.add(adEvent);
        notifyAdEventTracked(adEvent);
    }

    private final synchronized void notifyAdEventTracked(AdEvent adEvent) {
        Iterator<EventClientListener> it = listeners.iterator();
        while (it.hasNext()) {
            it.next().onAdEventTracked(adEvent);
        }
    }

    private final void performAddListener(EventClientListener eventClientListener) {
        listeners.add(eventClientListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void performPublishAdEvents() {
        try {
            if (session != null) {
                Set<AdEvent> set = adEvents;
                if (!set.isEmpty()) {
                    ArrayList arrayList = new ArrayList(AbstractC6987o.l(set, 10));
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AdEvent.copy$default((AdEvent) it.next(), null, null, null, null, 0L, 31, null));
                    }
                    Set e02 = AbstractC6987o.e0(arrayList);
                    adEvents.clear();
                    Session session2 = session;
                    if (session2 != null) {
                        transporter.dispatchToThread(new EventClient$performPublishAdEvents$1$1(session2, e02, null));
                    }
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void performPublishSdkErrors() {
        try {
            if (session != null) {
                Set<SdkError> set = sdkErrors;
                if (!set.isEmpty()) {
                    ArrayList arrayList = new ArrayList(AbstractC6987o.l(set, 10));
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(SdkError.copy$default((SdkError) it.next(), null, null, null, 0L, 15, null));
                    }
                    Set e02 = AbstractC6987o.e0(arrayList);
                    sdkErrors.clear();
                    Session session2 = session;
                    if (session2 != null) {
                        transporter.dispatchToThread(new EventClient$performPublishSdkErrors$1$1(session2, e02, null));
                    }
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void performPublishSdkEvents() {
        try {
            if (session != null) {
                Set<SdkEvent> set = sdkEvents;
                if (!set.isEmpty()) {
                    ArrayList arrayList = new ArrayList(AbstractC6987o.l(set, 10));
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(SdkEvent.copy$default((SdkEvent) it.next(), null, null, 0L, null, 15, null));
                    }
                    Set e02 = AbstractC6987o.e0(arrayList);
                    sdkEvents.clear();
                    Session session2 = session;
                    if (session2 != null) {
                        transporter.dispatchToThread(new EventClient$performPublishSdkEvents$1$1(session2, e02, null));
                    }
                }
            }
        } finally {
        }
    }

    private final void performRemoveListener(EventClientListener eventClientListener) {
        listeners.remove(eventClientListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void performTrackSdkError(String str, String str2, Map<String, String> map) {
        AALogger.INSTANCE.logError("App Error: " + str + " - " + str2);
        sdkErrors.add(new SdkError(str, str2, map, 0L, 8, (AbstractC0650j) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void performTrackSdkEvent(String str, Map<String, String> map) {
        sdkEvents.add(new SdkEvent(EventStrings.SDK_EVENT_TYPE, str, 0L, map, 4, (AbstractC0650j) null));
    }

    private final void trackGAIDAvailability(Session session2) {
        if (session2.getDeviceInfo().isAllowRetargetingEnabled()) {
            return;
        }
        trackSdkError$default(this, EventStrings.GAID_UNAVAILABLE, "GAID and/or tracking has been disabled for this device.", null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackSdkError$default(EventClient eventClient, String str, String str2, Map map, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            map = new HashMap();
        }
        eventClient.trackSdkError(str, str2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackSdkEvent$default(EventClient eventClient, String str, Map map, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            map = new HashMap();
        }
        eventClient.trackSdkEvent(str, map);
    }

    public final void addListener(EventClientListener eventClientListener) {
        r.e(eventClientListener, "listener");
        performAddListener(eventClientListener);
    }

    public final void createInstance(EventAdapter eventAdapter2, TransporterCoroutineScope transporterCoroutineScope) {
        r.e(eventAdapter2, "eventAdapter");
        r.e(transporterCoroutineScope, "transporter");
        if (hasInstance) {
            return;
        }
        eventAdapter = eventAdapter2;
        transporter = transporterCoroutineScope;
        hasInstance = true;
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onAdsAvailable(Session session2) {
        r.e(session2, "session");
        session = session2;
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public synchronized void onPublishEvents() {
        transporter.dispatchToThread(new AnonymousClass1(null));
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onSessionAvailable(Session session2) {
        r.e(session2, "session");
        session = session2;
        trackGAIDAvailability(session2);
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onSessionExpired() {
        trackSdkEvent$default(this, EventStrings.EXPIRED_EVENT, null, 2, null);
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onSessionInitFailed() {
        SessionListener.DefaultImpls.onSessionInitFailed(this);
    }

    public final void removeListener(EventClientListener eventClientListener) {
        r.e(eventClientListener, "listener");
        performRemoveListener(eventClientListener);
    }

    public final void trackImpression(Ad ad) {
        r.e(ad, "ad");
        AALogger.INSTANCE.logDebug("Ad Impression Tracked.");
        transporter.dispatchToThread(new C10261(ad, null));
    }

    public final void trackInteraction(Ad ad) {
        r.e(ad, "ad");
        AALogger.INSTANCE.logDebug("Ad Interaction Tracked.");
        transporter.dispatchToThread(new C10271(ad, null));
    }

    public final void trackInvisibleImpression(Ad ad) {
        r.e(ad, "ad");
        transporter.dispatchToThread(new C10281(ad, null));
    }

    public final void trackPopupBegin(Ad ad) {
        r.e(ad, "ad");
        transporter.dispatchToThread(new C10291(ad, null));
    }

    public final void trackRecipeContextEvent(String str, String str2) {
        r.e(str, "contextId");
        r.e(str2, "zoneId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(RecipeSources.CONTEXT_ID, str);
        linkedHashMap.put(RecipeSources.ZONE_ID, str2);
        trackSdkEvent(EventStrings.RECIPE_CONTEXT, linkedHashMap);
    }

    public final void trackSdkError(String str, String str2, Map<String, String> map) {
        r.e(str, "code");
        r.e(str2, "message");
        r.e(map, "params");
        transporter.dispatchToThread(new C10301(str, str2, map, null));
    }

    public final void trackSdkEvent(String str, Map<String, String> map) {
        r.e(str, "name");
        r.e(map, "params");
        transporter.dispatchToThread(new C10311(str, map, null));
    }
}
