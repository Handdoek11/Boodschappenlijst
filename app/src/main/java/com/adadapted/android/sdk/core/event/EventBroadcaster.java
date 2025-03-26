package com.adadapted.android.sdk.core.event;

import A6.d;
import B6.b;
import I6.p;
import J6.r;
import U6.M;
import com.adadapted.android.sdk.core.concurrency.Transporter;
import com.adadapted.android.sdk.core.concurrency.TransporterCoroutineScope;
import com.adadapted.android.sdk.core.interfaces.AaSdkEventListener;
import com.adadapted.android.sdk.core.interfaces.EventClientListener;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;

/* loaded from: classes.dex */
public final class EventBroadcaster implements EventClientListener {
    public static final int $stable;
    public static final EventBroadcaster INSTANCE;
    private static AaSdkEventListener listener;
    private static TransporterCoroutineScope transporter;

    @f(c = "com.adadapted.android.sdk.core.event.EventBroadcaster$onAdEventTracked$1", f = "EventBroadcaster.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.event.EventBroadcaster$onAdEventTracked$1, reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        final /* synthetic */ AdEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdEvent adEvent, d dVar) {
            super(2, dVar);
            this.$event = adEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$event, dVar);
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
            AaSdkEventListener aaSdkEventListener = EventBroadcaster.listener;
            if (aaSdkEventListener != null) {
                aaSdkEventListener.onNextAdEvent(this.$event.getZoneId(), this.$event.getEventType());
            }
            return C6916E.f44463a;
        }
    }

    static {
        EventBroadcaster eventBroadcaster = new EventBroadcaster();
        INSTANCE = eventBroadcaster;
        transporter = new Transporter();
        EventClient.INSTANCE.addListener(eventBroadcaster);
        $stable = 8;
    }

    private EventBroadcaster() {
    }

    public static /* synthetic */ void setListener$default(EventBroadcaster eventBroadcaster, AaSdkEventListener aaSdkEventListener, TransporterCoroutineScope transporterCoroutineScope, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            transporterCoroutineScope = new Transporter();
        }
        eventBroadcaster.setListener(aaSdkEventListener, transporterCoroutineScope);
    }

    @Override // com.adadapted.android.sdk.core.interfaces.EventClientListener
    public void onAdEventTracked(AdEvent adEvent) {
        if (listener == null || adEvent == null) {
            return;
        }
        transporter.dispatchToThread(new AnonymousClass1(adEvent, null));
    }

    public final void setListener(AaSdkEventListener aaSdkEventListener, TransporterCoroutineScope transporterCoroutineScope) {
        r.e(aaSdkEventListener, "listener");
        r.e(transporterCoroutineScope, "transporter");
        listener = aaSdkEventListener;
        transporter = transporterCoroutineScope;
    }
}
