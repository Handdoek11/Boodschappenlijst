package com.adadapted.android.sdk.core.concurrency;

import A6.d;
import A6.g;
import B6.b;
import I6.p;
import J6.r;
import U6.AbstractC0723k;
import U6.C0706b0;
import U6.InterfaceC0745v0;
import U6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;

/* loaded from: classes.dex */
public interface TransporterCoroutineScope extends M {

    public static final class DefaultImpls {
        public static InterfaceC0745v0 dispatchToMain(TransporterCoroutineScope transporterCoroutineScope, p pVar) {
            r.e(pVar, "func");
            return AbstractC0723k.d(transporterCoroutineScope, C0706b0.c(), null, new AnonymousClass1(pVar, null), 2, null);
        }

        public static InterfaceC0745v0 dispatchToThread(TransporterCoroutineScope transporterCoroutineScope, p pVar) {
            r.e(pVar, "func");
            return AbstractC0723k.d(transporterCoroutineScope, C0706b0.a(), null, new C10241(pVar, null), 2, null);
        }
    }

    @f(c = "com.adadapted.android.sdk.core.concurrency.TransporterCoroutineScope$dispatchToMain$1", f = "TransporterCoroutineScope.kt", l = {17}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.concurrency.TransporterCoroutineScope$dispatchToMain$1, reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        final /* synthetic */ p $func;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(p pVar, d dVar) {
            super(2, dVar);
            this.$func = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$func, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = b.e();
            int i8 = this.label;
            if (i8 == 0) {
                q.b(obj);
                M m8 = (M) this.L$0;
                p pVar = this.$func;
                this.label = 1;
                if (pVar.invoke(m8, this) == e8) {
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

    @f(c = "com.adadapted.android.sdk.core.concurrency.TransporterCoroutineScope$dispatchToThread$1", f = "TransporterCoroutineScope.kt", l = {11}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.concurrency.TransporterCoroutineScope$dispatchToThread$1, reason: invalid class name and case insensitive filesystem */
    static final class C10241 extends l implements p {
        final /* synthetic */ p $func;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10241(p pVar, d dVar) {
            super(2, dVar);
            this.$func = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            C10241 c10241 = new C10241(this.$func, dVar);
            c10241.L$0 = obj;
            return c10241;
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10241) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = b.e();
            int i8 = this.label;
            if (i8 == 0) {
                q.b(obj);
                M m8 = (M) this.L$0;
                p pVar = this.$func;
                this.label = 1;
                if (pVar.invoke(m8, this) == e8) {
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

    InterfaceC0745v0 dispatchToMain(p pVar);

    InterfaceC0745v0 dispatchToThread(p pVar);

    @Override // U6.M
    /* synthetic */ g getCoroutineContext();
}
