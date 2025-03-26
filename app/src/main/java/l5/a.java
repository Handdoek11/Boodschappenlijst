package L5;

import J6.r;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final g7.f f3702a;

    /* renamed from: L5.a$a, reason: collision with other inner class name */
    static final class C0069a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f3703o;

        /* renamed from: s, reason: collision with root package name */
        Object f3704s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f3705t;

        /* renamed from: v, reason: collision with root package name */
        int f3707v;

        C0069a(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3705t = obj;
            this.f3707v |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    public a(g7.f fVar) {
        r.e(fVar, "format");
        this.f3702a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(L5.e r6, A6.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof L5.a.C0069a
            if (r0 == 0) goto L13
            r0 = r7
            L5.a$a r0 = (L5.a.C0069a) r0
            int r1 = r0.f3707v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3707v = r1
            goto L18
        L13:
            L5.a$a r0 = new L5.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f3705t
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f3707v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            x6.q.b(r7)
            goto L84
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f3704s
            L5.e r6 = (L5.e) r6
            java.lang.Object r2 = r0.f3703o
            L5.a r2 = (L5.a) r2
            x6.q.b(r7)
            goto L62
        L40:
            x6.q.b(r7)
            U5.a r7 = r6.d()
            g7.f r2 = r5.f3702a
            n7.b r2 = r2.a()
            g7.b r7 = L5.f.d(r7, r2)
            r6.f(r7)
            r0.f3703o = r5
            r0.f3704s = r6
            r0.f3707v = r4
            java.lang.Object r7 = r5.b(r6, r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            r2 = r5
        L62:
            if (r7 == 0) goto L65
            return r7
        L65:
            java.lang.Object r7 = r6.e()
            g7.f r4 = r2.f3702a
            n7.b r4 = r4.a()
            g7.b r7 = L5.f.b(r7, r4)
            r6.f(r7)
            r7 = 0
            r0.f3703o = r7
            r0.f3704s = r7
            r0.f3707v = r3
            java.lang.Object r7 = r2.b(r6, r0)
            if (r7 != r1) goto L84
            return r1
        L84:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: L5.a.a(L5.e, A6.d):java.lang.Object");
    }

    public abstract Object b(e eVar, A6.d dVar);
}
