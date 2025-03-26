package Y6;

import A6.g;
import I6.p;
import I6.q;
import J6.r;
import J6.s;
import U6.AbstractC0751y0;
import x6.C6916E;
import x6.C6934p;

/* loaded from: classes2.dex */
public final class h extends kotlin.coroutines.jvm.internal.d implements X6.c, kotlin.coroutines.jvm.internal.e {

    /* renamed from: o, reason: collision with root package name */
    public final X6.c f6148o;

    /* renamed from: s, reason: collision with root package name */
    public final A6.g f6149s;

    /* renamed from: t, reason: collision with root package name */
    public final int f6150t;

    /* renamed from: u, reason: collision with root package name */
    private A6.g f6151u;

    /* renamed from: v, reason: collision with root package name */
    private A6.d f6152v;

    static final class a extends s implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final a f6153o = new a();

        a() {
            super(2);
        }

        public final Integer b(int i8, g.b bVar) {
            return Integer.valueOf(i8 + 1);
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public h(X6.c cVar, A6.g gVar) {
        super(f.f6143o, A6.h.f250o);
        this.f6148o = cVar;
        this.f6149s = gVar;
        this.f6150t = ((Number) gVar.e(0, a.f6153o)).intValue();
    }

    private final void f(A6.g gVar, A6.g gVar2, Object obj) {
        if (gVar2 instanceof d) {
            h((d) gVar2, obj);
        }
        j.a(this, gVar);
    }

    private final Object g(A6.d dVar, Object obj) {
        A6.g context = dVar.getContext();
        AbstractC0751y0.g(context);
        A6.g gVar = this.f6151u;
        if (gVar != context) {
            f(context, gVar, obj);
            this.f6151u = context;
        }
        this.f6152v = dVar;
        q qVar = i.f6154a;
        X6.c cVar = this.f6148o;
        r.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        r.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object d8 = qVar.d(cVar, obj, this);
        if (!r.a(d8, B6.b.e())) {
            this.f6152v = null;
        }
        return d8;
    }

    private final void h(d dVar, Object obj) {
        throw new IllegalStateException(S6.h.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + dVar.f6141o + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // X6.c
    public Object c(Object obj, A6.d dVar) {
        try {
            Object g8 = g(dVar, obj);
            if (g8 == B6.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return g8 == B6.b.e() ? g8 : C6916E.f44463a;
        } catch (Throwable th) {
            this.f6151u = new d(th, dVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        A6.d dVar = this.f6152v;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, A6.d
    public A6.g getContext() {
        A6.g gVar = this.f6151u;
        return gVar == null ? A6.h.f250o : gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public Object invokeSuspend(Object obj) {
        Throwable e8 = C6934p.e(obj);
        if (e8 != null) {
            this.f6151u = new d(e8, getContext());
        }
        A6.d dVar = this.f6152v;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return B6.b.e();
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
