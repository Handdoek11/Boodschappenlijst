package T5;

import J6.r;
import java.util.List;

/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: s, reason: collision with root package name */
    private final List f5261s;

    /* renamed from: t, reason: collision with root package name */
    private final A6.g f5262t;

    /* renamed from: u, reason: collision with root package name */
    private Object f5263u;

    /* renamed from: v, reason: collision with root package name */
    private int f5264v;

    /* renamed from: T5.a$a, reason: collision with other inner class name */
    static final class C0106a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f5265o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f5266s;

        /* renamed from: u, reason: collision with root package name */
        int f5268u;

        C0106a(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5266s = obj;
            this.f5268u |= Integer.MIN_VALUE;
            return a.this.i(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Object obj, List list, Object obj2, A6.g gVar) {
        super(obj);
        r.e(obj, "context");
        r.e(list, "interceptors");
        r.e(obj2, "subject");
        r.e(gVar, "coroutineContext");
        this.f5261s = list;
        this.f5262t = gVar;
        this.f5263u = obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(A6.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof T5.a.C0106a
            if (r0 == 0) goto L13
            r0 = r7
            T5.a$a r0 = (T5.a.C0106a) r0
            int r1 = r0.f5268u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5268u = r1
            goto L18
        L13:
            T5.a$a r0 = new T5.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5266s
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f5268u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.f5265o
            T5.a r2 = (T5.a) r2
            x6.q.b(r7)
            goto L39
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            x6.q.b(r7)
            r2 = r6
        L39:
            int r7 = r2.f5264v
            r4 = -1
            if (r7 != r4) goto L3f
            goto L4a
        L3f:
            java.util.List r4 = r2.f5261s
            int r5 = r4.size()
            if (r7 < r5) goto L4f
            r2.h()
        L4a:
            java.lang.Object r7 = r2.c()
            return r7
        L4f:
            java.lang.Object r4 = r4.get(r7)
            I6.q r4 = (I6.q) r4
            int r7 = r7 + 1
            r2.f5264v = r7
            java.lang.String r7 = "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext>, TSubject of io.ktor.util.pipeline.DebugPipelineContext, kotlin.Unit>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptor<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext> }"
            J6.r.c(r4, r7)
            java.lang.Object r7 = r2.c()
            r0.f5265o = r2
            r0.f5268u = r3
            java.lang.Object r7 = r4.d(r2, r7, r0)
            if (r7 != r1) goto L39
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.a.i(A6.d):java.lang.Object");
    }

    @Override // T5.e
    public Object a(Object obj, A6.d dVar) {
        this.f5264v = 0;
        j(obj);
        return d(dVar);
    }

    @Override // T5.e
    public Object c() {
        return this.f5263u;
    }

    @Override // T5.e
    public Object d(A6.d dVar) {
        int i8 = this.f5264v;
        if (i8 < 0) {
            return c();
        }
        if (i8 < this.f5261s.size()) {
            return i(dVar);
        }
        h();
        return c();
    }

    @Override // T5.e
    public Object e(Object obj, A6.d dVar) {
        j(obj);
        return d(dVar);
    }

    @Override // U6.M
    public A6.g getCoroutineContext() {
        return this.f5262t;
    }

    public void h() {
        this.f5264v = -1;
    }

    public void j(Object obj) {
        r.e(obj, "<set-?>");
        this.f5263u = obj;
    }
}
