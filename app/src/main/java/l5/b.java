package L5;

import I5.AbstractC0630d;
import I5.C0628b;
import J5.b;
import J6.H;
import J6.r;
import g7.l;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class b implements K5.b {

    /* renamed from: a, reason: collision with root package name */
    private final g7.f f3708a;

    /* renamed from: b, reason: collision with root package name */
    private final C0070b f3709b;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f3710o;

        /* renamed from: s, reason: collision with root package name */
        Object f3711s;

        /* renamed from: t, reason: collision with root package name */
        Object f3712t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f3713u;

        /* renamed from: w, reason: collision with root package name */
        int f3715w;

        a(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3713u = obj;
            this.f3715w |= Integer.MIN_VALUE;
            return b.this.a(null, null, null, this);
        }
    }

    /* renamed from: L5.b$b, reason: collision with other inner class name */
    public static final class C0070b extends L5.a {
        C0070b(g7.f fVar) {
            super(fVar);
        }

        @Override // L5.a
        public Object b(e eVar, A6.d dVar) {
            if (eVar instanceof d) {
                return b.this.d(eVar.c(), eVar.b(), eVar.e(), ((d) eVar).g(), eVar.a());
            }
            throw new IllegalStateException(("parameters type is " + H.b(eVar.getClass()).a() + ", but expected " + H.b(d.class).a()).toString());
        }
    }

    public b(g7.f fVar) {
        r.e(fVar, "format");
        this.f3708a = fVar;
        if (fVar instanceof l) {
            this.f3709b = new C0070b(fVar);
            return;
        }
        throw new IllegalArgumentException(("Only binary and string formats are supported, " + fVar + " is not supported.").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b.a d(g7.b bVar, g7.f fVar, Object obj, C0628b c0628b, Charset charset) {
        if (fVar instanceof l) {
            r.c(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            return new J5.c(((l) fVar).b(bVar, obj), AbstractC0630d.c(c0628b, charset), null, 4, null);
        }
        throw new IllegalStateException(("Unsupported format " + fVar).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // K5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.nio.charset.Charset r9, U5.a r10, io.ktor.utils.io.f r11, A6.d r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof L5.b.a
            if (r0 == 0) goto L14
            r0 = r12
            L5.b$a r0 = (L5.b.a) r0
            int r1 = r0.f3715w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f3715w = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            L5.b$a r0 = new L5.b$a
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r4.f3713u
            java.lang.Object r0 = B6.b.e()
            int r1 = r4.f3715w
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L37
            java.lang.Object r9 = r4.f3712t
            g7.b r9 = (g7.b) r9
            java.lang.Object r10 = r4.f3711s
            java.nio.charset.Charset r10 = (java.nio.charset.Charset) r10
            java.lang.Object r11 = r4.f3710o
            L5.b r11 = (L5.b) r11
            x6.q.b(r12)
            goto L64
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            x6.q.b(r12)
            g7.f r12 = r8.f3708a
            n7.b r12 = r12.a()
            g7.b r10 = L5.f.d(r10, r12)
            r4.f3710o = r8
            r4.f3711s = r9
            r4.f3712t = r10
            r4.f3715w = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r11
            java.lang.Object r12 = io.ktor.utils.io.f.b.a(r1, r2, r4, r5, r6)
            if (r12 != r0) goto L60
            return r0
        L60:
            r11 = r8
            r7 = r10
            r10 = r9
            r9 = r7
        L64:
            X5.k r12 = (X5.k) r12
            g7.f r0 = r11.f3708a     // Catch: java.lang.Throwable -> L7a
            boolean r1 = r0 instanceof g7.l     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L7c
            g7.l r0 = (g7.l) r0     // Catch: java.lang.Throwable -> L7a
            r11 = 2
            r1 = 0
            r2 = 0
            java.lang.String r10 = X5.r.e(r12, r10, r2, r11, r1)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r9 = r0.c(r9, r10)     // Catch: java.lang.Throwable -> L7a
            return r9
        L7a:
            r9 = move-exception
            goto L9c
        L7c:
            X5.p.a(r12)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r9.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r10 = "Unsupported format "
            r9.append(r10)     // Catch: java.lang.Throwable -> L7a
            g7.f r10 = r11.f3708a     // Catch: java.lang.Throwable -> L7a
            r9.append(r10)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L7a
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7a
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L7a
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L7a
            throw r10     // Catch: java.lang.Throwable -> L7a
        L9c:
            io.ktor.serialization.JsonConvertException r10 = new io.ktor.serialization.JsonConvertException
            java.lang.String r11 = "Illegal input"
            r10.<init>(r11, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: L5.b.a(java.nio.charset.Charset, U5.a, io.ktor.utils.io.f, A6.d):java.lang.Object");
    }

    @Override // K5.b
    public Object b(C0628b c0628b, Charset charset, U5.a aVar, Object obj, A6.d dVar) {
        return this.f3709b.a(new d(this.f3708a, obj, aVar, charset, c0628b), dVar);
    }
}
