package com.adadapted.android.sdk.core.keyword;

import A6.d;
import B6.b;
import I6.p;
import J6.AbstractC0650j;
import J6.r;
import U6.M;
import com.adadapted.android.sdk.core.concurrency.TransporterCoroutineScope;
import com.adadapted.android.sdk.core.interfaces.InterceptListener;
import com.adadapted.android.sdk.core.keyword.InterceptAdapter;
import com.adadapted.android.sdk.core.session.Session;
import com.adadapted.android.sdk.core.session.SessionClient;
import com.adadapted.android.sdk.core.session.SessionListener;
import java.util.HashSet;
import java.util.Set;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;

/* loaded from: classes.dex */
public final class InterceptClient implements SessionListener {
    private static InterceptClient instance;
    private final InterceptAdapter adapter;
    private Session currentSession;
    private final Set<InterceptEvent> events;
    private final TransporterCoroutineScope transporter;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final void createInstance(InterceptAdapter interceptAdapter, TransporterCoroutineScope transporterCoroutineScope) {
            r.e(interceptAdapter, "adapter");
            r.e(transporterCoroutineScope, "transporter");
            InterceptClient.instance = new InterceptClient(interceptAdapter, transporterCoroutineScope, null);
        }

        public final InterceptClient getInstance() {
            InterceptClient interceptClient = InterceptClient.instance;
            if (interceptClient != null) {
                return interceptClient;
            }
            r.p("instance");
            return null;
        }

        private Companion() {
        }
    }

    @f(c = "com.adadapted.android.sdk.core.keyword.InterceptClient$initialize$1", f = "InterceptClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.keyword.InterceptClient$initialize$1, reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        final /* synthetic */ InterceptListener $interceptListener;
        final /* synthetic */ Session $session;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Session session, InterceptListener interceptListener, d dVar) {
            super(2, dVar);
            this.$session = session;
            this.$interceptListener = interceptListener;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return InterceptClient.this.new AnonymousClass1(this.$session, this.$interceptListener, dVar);
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
            InterceptClient.this.performInitialize(this.$session, this.$interceptListener);
            return C6916E.f44463a;
        }
    }

    @f(c = "com.adadapted.android.sdk.core.keyword.InterceptClient$onPublishEvents$1", f = "InterceptClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.keyword.InterceptClient$onPublishEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C10321 extends l implements p {
        int label;

        C10321(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return InterceptClient.this.new C10321(dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10321) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            InterceptClient.this.performPublishEvents();
            return C6916E.f44463a;
        }
    }

    @f(c = "com.adadapted.android.sdk.core.keyword.InterceptClient$performInitialize$1", f = "InterceptClient.kt", l = {23}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.keyword.InterceptClient$performInitialize$1, reason: invalid class name and case insensitive filesystem */
    static final class C10331 extends l implements p {
        final /* synthetic */ InterceptListener $interceptListener;
        final /* synthetic */ Session $session;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10331(Session session, InterceptListener interceptListener, d dVar) {
            super(2, dVar);
            this.$session = session;
            this.$interceptListener = interceptListener;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return InterceptClient.this.new C10331(this.$session, this.$interceptListener, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10331) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = b.e();
            int i8 = this.label;
            if (i8 == 0) {
                q.b(obj);
                InterceptAdapter interceptAdapter = InterceptClient.this.adapter;
                Session session = this.$session;
                final InterceptListener interceptListener = this.$interceptListener;
                InterceptAdapter.Listener listener = new InterceptAdapter.Listener() { // from class: com.adadapted.android.sdk.core.keyword.InterceptClient.performInitialize.1.1
                    @Override // com.adadapted.android.sdk.core.keyword.InterceptAdapter.Listener
                    public void onSuccess(Intercept intercept) {
                        r.e(intercept, "intercept");
                        interceptListener.onKeywordInterceptInitialized(intercept);
                    }
                };
                this.label = 1;
                if (interceptAdapter.retrieve(session, listener, this) == e8) {
                    return e8;
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

    @f(c = "com.adadapted.android.sdk.core.keyword.InterceptClient$performPublishEvents$1", f = "InterceptClient.kt", l = {63}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.keyword.InterceptClient$performPublishEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C10341 extends l implements p {
        final /* synthetic */ Set<InterceptEvent> $currentEvents;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10341(Set<InterceptEvent> set, d dVar) {
            super(2, dVar);
            this.$currentEvents = set;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return InterceptClient.this.new C10341(this.$currentEvents, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10341) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = b.e();
            int i8 = this.label;
            if (i8 == 0) {
                q.b(obj);
                InterceptAdapter interceptAdapter = InterceptClient.this.adapter;
                Session session = InterceptClient.this.currentSession;
                if (session == null) {
                    r.p("currentSession");
                    session = null;
                }
                Set<InterceptEvent> set = this.$currentEvents;
                this.label = 1;
                if (interceptAdapter.sendEvents(session, set, this) == e8) {
                    return e8;
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

    @f(c = "com.adadapted.android.sdk.core.keyword.InterceptClient$trackEvent$1", f = "InterceptClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.keyword.InterceptClient$trackEvent$1, reason: invalid class name and case insensitive filesystem */
    static final class C10351 extends l implements p {
        final /* synthetic */ InterceptEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10351(InterceptEvent interceptEvent, d dVar) {
            super(2, dVar);
            this.$event = interceptEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return InterceptClient.this.new C10351(this.$event, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10351) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            InterceptClient.this.fileEvent(this.$event);
            return C6916E.f44463a;
        }
    }

    public /* synthetic */ InterceptClient(InterceptAdapter interceptAdapter, TransporterCoroutineScope transporterCoroutineScope, AbstractC0650j abstractC0650j) {
        this(interceptAdapter, transporterCoroutineScope);
    }

    private final Set<InterceptEvent> consolidateEvents(InterceptEvent interceptEvent, Set<InterceptEvent> set) {
        HashSet hashSet = new HashSet(this.events);
        for (InterceptEvent interceptEvent2 : set) {
            if (!interceptEvent.supersedes(interceptEvent2)) {
                hashSet.add(interceptEvent2);
            }
        }
        hashSet.add(interceptEvent);
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void fileEvent(InterceptEvent interceptEvent) {
        HashSet hashSet = new HashSet(this.events);
        this.events.clear();
        this.events.addAll(consolidateEvents(interceptEvent, hashSet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performInitialize(Session session, InterceptListener interceptListener) {
        if (session == null || interceptListener == null) {
            return;
        }
        this.transporter.dispatchToThread(new C10331(session, interceptListener, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void performPublishEvents() {
        if (this.events.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(this.events);
        this.events.clear();
        this.transporter.dispatchToThread(new C10341(hashSet, null));
    }

    private final synchronized void trackEvent(String str, String str2, String str3, String str4, String str5) {
        this.transporter.dispatchToThread(new C10351(new InterceptEvent(str, str5, str4, str2, str3, 0L, 32, (AbstractC0650j) null), null));
    }

    public final void initialize(Session session, InterceptListener interceptListener) {
        this.transporter.dispatchToThread(new AnonymousClass1(session, interceptListener, null));
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onAdsAvailable(Session session) {
        SessionListener.DefaultImpls.onAdsAvailable(this, session);
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onPublishEvents() {
        this.transporter.dispatchToThread(new C10321(null));
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onSessionAvailable(Session session) {
        r.e(session, "session");
        this.currentSession = session;
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onSessionExpired() {
        SessionListener.DefaultImpls.onSessionExpired(this);
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onSessionInitFailed() {
        SessionListener.DefaultImpls.onSessionInitFailed(this);
    }

    public final synchronized void trackMatched(String str, String str2, String str3, String str4) {
        r.e(str, "searchId");
        r.e(str2, "termId");
        r.e(str3, "term");
        r.e(str4, "userInput");
        trackEvent(str, str2, str3, str4, InterceptEvent.MATCHED);
    }

    public final synchronized void trackNotMatched(String str, String str2) {
        r.e(str, "searchId");
        r.e(str2, "userInput");
        trackEvent(str, "", "NA", str2, InterceptEvent.NOT_MATCHED);
    }

    public final synchronized void trackPresented(String str, String str2, String str3, String str4) {
        r.e(str, "searchId");
        r.e(str2, "termId");
        r.e(str3, "term");
        r.e(str4, "userInput");
        trackEvent(str, str2, str3, str4, InterceptEvent.PRESENTED);
    }

    public final synchronized void trackSelected(String str, String str2, String str3, String str4) {
        r.e(str, "searchId");
        r.e(str2, "termId");
        r.e(str3, "term");
        r.e(str4, "userInput");
        trackEvent(str, str2, str3, str4, InterceptEvent.SELECTED);
    }

    private InterceptClient(InterceptAdapter interceptAdapter, TransporterCoroutineScope transporterCoroutineScope) {
        this.adapter = interceptAdapter;
        this.transporter = transporterCoroutineScope;
        this.events = new HashSet();
        SessionClient.INSTANCE.addListener(this);
    }
}
