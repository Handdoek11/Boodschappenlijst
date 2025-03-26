package X6;

/* loaded from: classes2.dex */
public abstract class a implements b {

    /* renamed from: X6.a$a, reason: collision with other inner class name */
    static final class C0119a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f5974o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f5975s;

        /* renamed from: u, reason: collision with root package name */
        int f5977u;

        C0119a(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5975s = obj;
            this.f5977u |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // X6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(X6.c r6, A6.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X6.a.C0119a
            if (r0 == 0) goto L13
            r0 = r7
            X6.a$a r0 = (X6.a.C0119a) r0
            int r1 = r0.f5977u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5977u = r1
            goto L18
        L13:
            X6.a$a r0 = new X6.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5975s
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f5977u
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f5974o
            Y6.h r6 = (Y6.h) r6
            x6.q.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            x6.q.b(r7)
            Y6.h r7 = new Y6.h
            A6.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f5974o = r7     // Catch: java.lang.Throwable -> L55
            r0.f5977u = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.b(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            x6.E r6 = x6.C6916E.f44463a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.a.a(X6.c, A6.d):java.lang.Object");
    }

    public abstract Object b(c cVar, A6.d dVar);
}
