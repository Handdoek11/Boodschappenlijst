package B6;

import A6.g;
import I6.p;
import J6.L;
import J6.r;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import x6.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends j {

        /* renamed from: o, reason: collision with root package name */
        private int f734o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ p f735s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f736t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(A6.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f735s = pVar;
            this.f736t = obj;
            r.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i8 = this.f734o;
            if (i8 == 0) {
                this.f734o = 1;
                q.b(obj);
                r.c(this.f735s, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) L.d(this.f735s, 2)).invoke(this.f736t, this);
            }
            if (i8 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f734o = 2;
            q.b(obj);
            return obj;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        private int f737o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ p f738s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f739t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(A6.d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f738s = pVar;
            this.f739t = obj;
            r.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i8 = this.f737o;
            if (i8 == 0) {
                this.f737o = 1;
                q.b(obj);
                r.c(this.f738s, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) L.d(this.f738s, 2)).invoke(this.f739t, this);
            }
            if (i8 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f737o = 2;
            q.b(obj);
            return obj;
        }
    }

    /* renamed from: B6.c$c, reason: collision with other inner class name */
    public static final class C0022c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0022c(A6.d dVar) {
            super(dVar);
            r.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            q.b(obj);
            return obj;
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(A6.d dVar, g gVar) {
            super(dVar, gVar);
            r.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            q.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static A6.d a(p pVar, Object obj, A6.d dVar) {
        r.e(pVar, "<this>");
        r.e(dVar, "completion");
        A6.d a8 = h.a(dVar);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(obj, a8);
        }
        g context = a8.getContext();
        return context == A6.h.f250o ? new a(a8, pVar, obj) : new b(a8, context, pVar, obj);
    }

    private static final A6.d b(A6.d dVar) {
        g context = dVar.getContext();
        return context == A6.h.f250o ? new C0022c(dVar) : new d(dVar, context);
    }

    public static A6.d c(A6.d dVar) {
        A6.d intercepted;
        r.e(dVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar2 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return (dVar2 == null || (intercepted = dVar2.intercepted()) == null) ? dVar : intercepted;
    }

    public static Object d(I6.q qVar, Object obj, Object obj2, A6.d dVar) {
        r.e(qVar, "<this>");
        r.e(dVar, "completion");
        return ((I6.q) L.d(qVar, 3)).d(obj, obj2, b(h.a(dVar)));
    }
}
