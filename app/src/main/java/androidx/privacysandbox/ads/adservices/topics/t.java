package androidx.privacysandbox.ads.adservices.topics;

import U6.C0733p;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class t extends d {

    /* renamed from: b, reason: collision with root package name */
    private final TopicsManager f10700b;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f10701o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f10702s;

        /* renamed from: u, reason: collision with root package name */
        int f10704u;

        a(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10702s = obj;
            this.f10704u |= Integer.MIN_VALUE;
            return t.e(t.this, null, this);
        }
    }

    public t(TopicsManager topicsManager) {
        J6.r.e(topicsManager, "mTopicsManager");
        this.f10700b = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object e(androidx.privacysandbox.ads.adservices.topics.t r4, androidx.privacysandbox.ads.adservices.topics.a r5, A6.d r6) {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.t.a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.topics.t$a r0 = (androidx.privacysandbox.ads.adservices.topics.t.a) r0
            int r1 = r0.f10704u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10704u = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.t$a r0 = new androidx.privacysandbox.ads.adservices.topics.t$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f10702s
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f10704u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f10701o
            androidx.privacysandbox.ads.adservices.topics.t r4 = (androidx.privacysandbox.ads.adservices.topics.t) r4
            x6.q.b(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            x6.q.b(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.c(r5)
            r0.f10701o = r4
            r0.f10704u = r3
            java.lang.Object r6 = r4.f(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            android.adservices.topics.GetTopicsResponse r5 = androidx.privacysandbox.ads.adservices.topics.m.a(r6)
            androidx.privacysandbox.ads.adservices.topics.b r4 = r4.d(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.t.e(androidx.privacysandbox.ads.adservices.topics.t, androidx.privacysandbox.ads.adservices.topics.a, A6.d):java.lang.Object");
    }

    private final Object f(GetTopicsRequest getTopicsRequest, A6.d dVar) {
        C0733p c0733p = new C0733p(B6.b.c(dVar), 1);
        c0733p.C();
        this.f10700b.getTopics(getTopicsRequest, new Z0.m(), v0.t.a(c0733p));
        Object z7 = c0733p.z();
        if (z7 == B6.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return z7;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.d
    public Object a(androidx.privacysandbox.ads.adservices.topics.a aVar, A6.d dVar) {
        return e(this, aVar, dVar);
    }

    public GetTopicsRequest c(androidx.privacysandbox.ads.adservices.topics.a aVar) {
        J6.r.e(aVar, "request");
        GetTopicsRequest build = h.a().setAdsSdkName(aVar.a()).build();
        J6.r.d(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }

    public final b d(GetTopicsResponse getTopicsResponse) {
        J6.r.e(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = getTopicsResponse.getTopics().iterator();
        while (it.hasNext()) {
            Topic a8 = o.a(it.next());
            arrayList.add(new c(a8.getTaxonomyVersion(), a8.getModelVersion(), a8.getTopicId()));
        }
        return new b(arrayList);
    }
}
