package io.ktor.utils.io;

import J6.r;

/* loaded from: classes2.dex */
public abstract class h {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f36876o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f36877s;

        /* renamed from: t, reason: collision with root package name */
        int f36878t;

        a(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36877s = obj;
            this.f36878t |= Integer.MIN_VALUE;
            return h.b(null, null, 0L, this);
        }
    }

    public static final boolean a(f fVar) {
        r.e(fVar, "<this>");
        return fVar.b(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(io.ktor.utils.io.f r4, io.ktor.utils.io.i r5, long r6, A6.d r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.h.a
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.h$a r0 = (io.ktor.utils.io.h.a) r0
            int r1 = r0.f36878t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36878t = r1
            goto L18
        L13:
            io.ktor.utils.io.h$a r0 = new io.ktor.utils.io.h$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f36877s
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f36878t
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f36876o
            r5 = r4
            io.ktor.utils.io.i r5 = (io.ktor.utils.io.i) r5
            x6.q.b(r8)
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            x6.q.b(r8)
            r0.f36876o = r5
            r0.f36878t = r3
            java.lang.Object r8 = io.ktor.utils.io.g.b(r4, r5, r6, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            java.lang.Number r8 = (java.lang.Number) r8
            long r6 = r8.longValue()
            io.ktor.utils.io.j.a(r5)
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.b.c(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.h.b(io.ktor.utils.io.f, io.ktor.utils.io.i, long, A6.d):java.lang.Object");
    }

    public static /* synthetic */ Object c(f fVar, i iVar, long j8, A6.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = Long.MAX_VALUE;
        }
        return b(fVar, iVar, j8, dVar);
    }

    public static final Object d(f fVar, A6.d dVar) {
        return fVar.g(Long.MAX_VALUE, dVar);
    }

    public static final Object e(f fVar, byte[] bArr, A6.d dVar) {
        return fVar.f(bArr, 0, bArr.length, dVar);
    }
}
