package com.adadapted.android.sdk.core.network;

import B6.b;
import C5.a;
import D5.e;
import F5.c;
import I6.l;
import I6.p;
import J6.r;
import J6.s;
import com.adadapted.android.sdk.core.log.AALogger;
import kotlin.coroutines.jvm.internal.f;
import l7.d;
import l7.n;
import v5.C6842b;
import x6.C6916E;
import x6.q;

/* loaded from: classes.dex */
final class HttpConnector$client$1 extends s implements l {
    public static final HttpConnector$client$1 INSTANCE = new HttpConnector$client$1();

    /* renamed from: com.adadapted.android.sdk.core.network.HttpConnector$client$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        /* renamed from: com.adadapted.android.sdk.core.network.HttpConnector$client$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C02141 extends s implements l {
            public static final C02141 INSTANCE = new C02141();

            C02141() {
                super(1);
            }

            @Override // I6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((d) obj);
                return C6916E.f44463a;
            }

            public final void invoke(d dVar) {
                r.e(dVar, "$this$Json");
                dVar.i(false);
                dVar.f(true);
                dVar.g(true);
                dVar.h(true);
            }
        }

        AnonymousClass1() {
            super(1);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a.C0023a) obj);
            return C6916E.f44463a;
        }

        public final void invoke(a.C0023a c0023a) {
            r.e(c0023a, "$this$install");
            M5.a.b(c0023a, n.b(null, C02141.INSTANCE, 1, null), null, 2, null);
        }
    }

    /* renamed from: com.adadapted.android.sdk.core.network.HttpConnector$client$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements l {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @f(c = "com.adadapted.android.sdk.core.network.HttpConnector$client$1$2$1", f = "HttpConnector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.adadapted.android.sdk.core.network.HttpConnector$client$1$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(A6.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // I6.p
            public final Object invoke(c cVar, A6.d dVar) {
                return ((AnonymousClass1) create(cVar, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b.e();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
                c cVar = (c) this.L$0;
                AALogger.INSTANCE.logInfo("HTTP status: " + cVar.e().b0());
                return C6916E.f44463a;
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((e.a) obj);
            return C6916E.f44463a;
        }

        public final void invoke(e.a aVar) {
            r.e(aVar, "$this$install");
            aVar.c(new AnonymousClass1(null));
        }
    }

    HttpConnector$client$1() {
        super(1);
    }

    @Override // I6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C6842b) obj);
        return C6916E.f44463a;
    }

    public final void invoke(C6842b c6842b) {
        r.e(c6842b, "$this$HttpClient");
        c6842b.g(a.f1084c, AnonymousClass1.INSTANCE);
        c6842b.g(e.f2104c, AnonymousClass2.INSTANCE);
        C6842b.j(c6842b, B5.p.f631g, null, 2, null);
    }
}
