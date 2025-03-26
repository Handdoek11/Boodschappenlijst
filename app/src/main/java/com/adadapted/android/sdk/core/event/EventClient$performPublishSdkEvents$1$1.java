package com.adadapted.android.sdk.core.event;

import A6.d;
import B6.b;
import I6.p;
import J6.r;
import U6.M;
import com.adadapted.android.sdk.core.session.Session;
import java.util.Set;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;

@f(c = "com.adadapted.android.sdk.core.event.EventClient$performPublishSdkEvents$1$1", f = "EventClient.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class EventClient$performPublishSdkEvents$1$1 extends l implements p {
    final /* synthetic */ Set<SdkEvent> $currentSdkEvents;
    final /* synthetic */ Session $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventClient$performPublishSdkEvents$1$1(Session session, Set<SdkEvent> set, d dVar) {
        super(2, dVar);
        this.$it = session;
        this.$currentSdkEvents = set;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new EventClient$performPublishSdkEvents$1$1(this.$it, this.$currentSdkEvents, dVar);
    }

    @Override // I6.p
    public final Object invoke(M m8, d dVar) {
        return ((EventClient$performPublishSdkEvents$1$1) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 == 0) {
            q.b(obj);
            EventAdapter eventAdapter = EventClient.eventAdapter;
            if (eventAdapter == null) {
                r.p("eventAdapter");
                eventAdapter = null;
            }
            Session session = this.$it;
            Set<SdkEvent> set = this.$currentSdkEvents;
            this.label = 1;
            if (eventAdapter.publishSdkEvents(session, set, this) == e8) {
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
