package F5;

import A6.g;
import J6.r;
import U6.A;
import U6.InterfaceC0745v0;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class e {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f2398o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f2399s;

        /* renamed from: t, reason: collision with root package name */
        int f2400t;

        a(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2399s = obj;
            this.f2400t |= Integer.MIN_VALUE;
            return e.a(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(F5.c r5, java.nio.charset.Charset r6, A6.d r7) {
        /*
            boolean r0 = r7 instanceof F5.e.a
            if (r0 == 0) goto L13
            r0 = r7
            F5.e$a r0 = (F5.e.a) r0
            int r1 = r0.f2400t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2400t = r1
            goto L18
        L13:
            F5.e$a r0 = new F5.e$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f2399s
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f2400t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f2398o
            java.nio.charset.CharsetDecoder r5 = (java.nio.charset.CharsetDecoder) r5
            x6.q.b(r7)
            goto L66
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            x6.q.b(r7)
            java.nio.charset.Charset r7 = I5.s.a(r5)
            if (r7 != 0) goto L3f
            goto L40
        L3f:
            r6 = r7
        L40:
            java.nio.charset.CharsetDecoder r6 = r6.newDecoder()
            w5.a r5 = r5.M()
            java.lang.Class<X5.n> r7 = X5.n.class
            Q6.k r2 = J6.H.i(r7)
            java.lang.reflect.Type r4 = Q6.n.e(r2)
            Q6.b r7 = J6.H.b(r7)
            U5.a r7 = U5.b.b(r4, r7, r2)
            r0.f2398o = r6
            r0.f2400t = r3
            java.lang.Object r7 = r5.a(r7, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            r5 = r6
        L66:
            if (r7 == 0) goto L77
            X5.n r7 = (X5.n) r7
            java.lang.String r6 = "decoder"
            J6.r.d(r5, r6)
            r6 = 2
            r0 = 0
            r1 = 0
            java.lang.String r5 = W5.b.b(r5, r7, r1, r6, r0)
            return r5
        L77:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type io.ktor.utils.io.core.Input"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.e.a(F5.c, java.nio.charset.Charset, A6.d):java.lang.Object");
    }

    public static /* synthetic */ Object b(c cVar, Charset charset, A6.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = S6.d.f5130b;
        }
        return a(cVar, charset, dVar);
    }

    public static final void c(c cVar) {
        r.e(cVar, "<this>");
        g.b d8 = cVar.getCoroutineContext().d(InterfaceC0745v0.f5485d);
        r.b(d8);
        ((A) d8).T();
    }

    public static final E5.b d(c cVar) {
        r.e(cVar, "<this>");
        return cVar.M().d();
    }
}
