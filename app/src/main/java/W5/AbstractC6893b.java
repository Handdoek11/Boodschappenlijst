package w5;

/* renamed from: w5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6893b {

    /* renamed from: w5.b$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f44368o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f44369s;

        /* renamed from: t, reason: collision with root package name */
        int f44370t;

        a(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f44369s = obj;
            this.f44370t |= Integer.MIN_VALUE;
            return AbstractC6893b.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(w5.C6892a r8, A6.d r9) {
        /*
            boolean r0 = r9 instanceof w5.AbstractC6893b.a
            if (r0 == 0) goto L14
            r0 = r9
            w5.b$a r0 = (w5.AbstractC6893b.a) r0
            int r1 = r0.f44370t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f44370t = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            w5.b$a r0 = new w5.b$a
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f44369s
            java.lang.Object r0 = B6.b.e()
            int r1 = r4.f44370t
            r7 = 1
            if (r1 == 0) goto L37
            if (r1 != r7) goto L2f
            java.lang.Object r8 = r4.f44368o
            w5.a r8 = (w5.C6892a) r8
            x6.q.b(r9)
            goto L51
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            x6.q.b(r9)
            F5.c r9 = r8.e()
            io.ktor.utils.io.f r1 = r9.b()
            r4.f44368o = r8
            r4.f44370t = r7
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r9 = io.ktor.utils.io.f.b.a(r1, r2, r4, r5, r6)
            if (r9 != r0) goto L51
            return r0
        L51:
            X5.k r9 = (X5.k) r9
            r0 = 0
            r1 = 0
            byte[] r9 = X5.r.c(r9, r0, r7, r1)
            w5.c r0 = new w5.c
            v5.a r1 = r8.c()
            E5.b r2 = r8.d()
            F5.c r8 = r8.e()
            r0.<init>(r1, r2, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.AbstractC6893b.a(w5.a, A6.d):java.lang.Object");
    }
}
