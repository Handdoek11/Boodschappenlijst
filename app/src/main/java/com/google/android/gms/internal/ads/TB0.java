package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes.dex */
public final class TB0 implements YC0 {

    /* renamed from: h, reason: collision with root package name */
    public static final InterfaceC3296lg0 f19089h = new InterfaceC3296lg0() { // from class: com.google.android.gms.internal.ads.QB0
        @Override // com.google.android.gms.internal.ads.InterfaceC3296lg0
        public final Object zza() {
            return TB0.n();
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final Random f19090i = new Random();

    /* renamed from: d, reason: collision with root package name */
    private XC0 f19094d;

    /* renamed from: f, reason: collision with root package name */
    private String f19096f;

    /* renamed from: a, reason: collision with root package name */
    private final C4721yl f19091a = new C4721yl();

    /* renamed from: b, reason: collision with root package name */
    private final C1945Xk f19092b = new C1945Xk();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f19093c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private AbstractC1981Yl f19095e = AbstractC1981Yl.f20311a;

    /* renamed from: g, reason: collision with root package name */
    private long f19097g = -1;

    public TB0(InterfaceC3296lg0 interfaceC3296lg0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long l() {
        RB0 rb0 = (RB0) this.f19093c.get(this.f19096f);
        return (rb0 == null || rb0.f18615c == -1) ? this.f19097g + 1 : rb0.f18615c;
    }

    private final RB0 m(int i8, GG0 gg0) {
        long j8 = Long.MAX_VALUE;
        RB0 rb0 = null;
        for (RB0 rb02 : this.f19093c.values()) {
            rb02.g(i8, gg0);
            if (rb02.j(i8, gg0)) {
                long j9 = rb02.f18615c;
                if (j9 == -1 || j9 < j8) {
                    rb0 = rb02;
                    j8 = j9;
                } else if (j9 == j8) {
                    int i9 = AbstractC2301cW.f21206a;
                    if (rb0.f18616d != null && rb02.f18616d != null) {
                        rb0 = rb02;
                    }
                }
            }
        }
        if (rb0 != null) {
            return rb0;
        }
        String n8 = n();
        RB0 rb03 = new RB0(this, n8, i8, gg0);
        this.f19093c.put(n8, rb03);
        return rb03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String n() {
        byte[] bArr = new byte[12];
        f19090i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void o(RB0 rb0) {
        if (rb0.f18615c != -1) {
            this.f19097g = rb0.f18615c;
        }
        this.f19096f = null;
    }

    private final void p(KA0 ka0) {
        if (ka0.f16542b.o()) {
            String str = this.f19096f;
            if (str != null) {
                RB0 rb0 = (RB0) this.f19093c.get(str);
                rb0.getClass();
                o(rb0);
                return;
            }
            return;
        }
        RB0 rb02 = (RB0) this.f19093c.get(this.f19096f);
        RB0 m8 = m(ka0.f16543c, ka0.f16544d);
        this.f19096f = m8.f18613a;
        a(ka0);
        GG0 gg0 = ka0.f16544d;
        if (gg0 == null || !gg0.b()) {
            return;
        }
        if (rb02 != null) {
            if (rb02.f18615c == gg0.f15343d && rb02.f18616d != null && rb02.f18616d.f15341b == ka0.f16544d.f15341b && rb02.f18616d.f15342c == ka0.f16544d.f15342c) {
                return;
            }
        }
        GG0 gg02 = ka0.f16544d;
        String unused = m(ka0.f16543c, new GG0(gg02.f15340a, gg02.f15343d)).f18613a;
        String unused2 = m8.f18613a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.YC0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(com.google.android.gms.internal.ads.KA0 r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.XC0 r0 = r9.f19094d     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto Lc9
            com.google.android.gms.internal.ads.Yl r0 = r10.f16542b     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r0.o()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto Lf
            goto Lc7
        Lf:
            com.google.android.gms.internal.ads.GG0 r0 = r10.f16544d     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3f
            long r1 = r9.l()     // Catch: java.lang.Throwable -> L3c
            long r3 = r0.f15343d     // Catch: java.lang.Throwable -> L3c
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Lc7
            java.util.HashMap r0 = r9.f19093c     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r9.f19096f     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.RB0 r0 = (com.google.android.gms.internal.ads.RB0) r0     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3f
            long r1 = com.google.android.gms.internal.ads.RB0.b(r0)     // Catch: java.lang.Throwable -> L3c
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L3f
            int r0 = com.google.android.gms.internal.ads.RB0.a(r0)     // Catch: java.lang.Throwable -> L3c
            int r1 = r10.f16543c     // Catch: java.lang.Throwable -> L3c
            if (r0 != r1) goto Lc7
            goto L3f
        L3c:
            r10 = move-exception
            goto Lcb
        L3f:
            int r0 = r10.f16543c     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.GG0 r1 = r10.f16544d     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.RB0 r0 = r9.m(r0, r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r9.f19096f     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L51
            java.lang.String r1 = com.google.android.gms.internal.ads.RB0.d(r0)     // Catch: java.lang.Throwable -> L3c
            r9.f19096f = r1     // Catch: java.lang.Throwable -> L3c
        L51:
            com.google.android.gms.internal.ads.GG0 r1 = r10.f16544d     // Catch: java.lang.Throwable -> L3c
            r2 = 1
            if (r1 == 0) goto L9b
            boolean r3 = r1.b()     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L9b
            java.lang.Object r3 = r1.f15340a     // Catch: java.lang.Throwable -> L3c
            long r4 = r1.f15343d     // Catch: java.lang.Throwable -> L3c
            int r1 = r1.f15341b     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.GG0 r6 = new com.google.android.gms.internal.ads.GG0     // Catch: java.lang.Throwable -> L3c
            r6.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> L3c
            int r1 = r10.f16543c     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.RB0 r1 = r9.m(r1, r6)     // Catch: java.lang.Throwable -> L3c
            boolean r3 = com.google.android.gms.internal.ads.RB0.i(r1)     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L9b
            com.google.android.gms.internal.ads.RB0.f(r1, r2)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.Yl r3 = r10.f16542b     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.GG0 r4 = r10.f16544d     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.Xk r5 = r9.f19092b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r4 = r4.f15340a     // Catch: java.lang.Throwable -> L3c
            r3.n(r4, r5)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.Xk r3 = r9.f19092b     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.GG0 r4 = r10.f16544d     // Catch: java.lang.Throwable -> L3c
            int r4 = r4.f15341b     // Catch: java.lang.Throwable -> L3c
            r3.g(r4)     // Catch: java.lang.Throwable -> L3c
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.AbstractC2301cW.N(r3)     // Catch: java.lang.Throwable -> L3c
            long r7 = com.google.android.gms.internal.ads.AbstractC2301cW.N(r3)     // Catch: java.lang.Throwable -> L3c
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.RB0.d(r1)     // Catch: java.lang.Throwable -> L3c
        L9b:
            boolean r1 = com.google.android.gms.internal.ads.RB0.i(r0)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto La7
            com.google.android.gms.internal.ads.RB0.f(r0, r2)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.RB0.d(r0)     // Catch: java.lang.Throwable -> L3c
        La7:
            java.lang.String r1 = com.google.android.gms.internal.ads.RB0.d(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r9.f19096f     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto Lc7
            boolean r1 = com.google.android.gms.internal.ads.RB0.h(r0)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto Lc7
            com.google.android.gms.internal.ads.RB0.e(r0, r2)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.XC0 r1 = r9.f19094d     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = com.google.android.gms.internal.ads.RB0.d(r0)     // Catch: java.lang.Throwable -> L3c
            r1.i(r10, r0)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r9)
            return
        Lc7:
            monitor-exit(r9)
            return
        Lc9:
            r10 = 0
            throw r10     // Catch: java.lang.Throwable -> L3c
        Lcb:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3c
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.TB0.a(com.google.android.gms.internal.ads.KA0):void");
    }

    @Override // com.google.android.gms.internal.ads.YC0
    public final synchronized String b() {
        return this.f19096f;
    }

    @Override // com.google.android.gms.internal.ads.YC0
    public final synchronized void c(KA0 ka0) {
        try {
            if (this.f19094d == null) {
                throw null;
            }
            AbstractC1981Yl abstractC1981Yl = this.f19095e;
            this.f19095e = ka0.f16542b;
            Iterator it = this.f19093c.values().iterator();
            while (it.hasNext()) {
                RB0 rb0 = (RB0) it.next();
                if (!rb0.l(abstractC1981Yl, this.f19095e) || rb0.k(ka0)) {
                    it.remove();
                    if (rb0.f18617e) {
                        if (rb0.f18613a.equals(this.f19096f)) {
                            o(rb0);
                        }
                        this.f19094d.f(ka0, rb0.f18613a, false);
                    }
                }
            }
            p(ka0);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.YC0
    public final synchronized String d(AbstractC1981Yl abstractC1981Yl, GG0 gg0) {
        return m(abstractC1981Yl.n(gg0.f15340a, this.f19092b).f20118c, gg0).f18613a;
    }

    @Override // com.google.android.gms.internal.ads.YC0
    public final synchronized void e(KA0 ka0, int i8) {
        try {
            if (this.f19094d == null) {
                throw null;
            }
            Iterator it = this.f19093c.values().iterator();
            while (it.hasNext()) {
                RB0 rb0 = (RB0) it.next();
                if (rb0.k(ka0)) {
                    it.remove();
                    if (rb0.f18617e) {
                        boolean equals = rb0.f18613a.equals(this.f19096f);
                        boolean z7 = false;
                        if (i8 == 0 && equals && rb0.f18618f) {
                            z7 = true;
                        }
                        if (equals) {
                            o(rb0);
                        }
                        this.f19094d.f(ka0, rb0.f18613a, z7);
                    }
                }
            }
            p(ka0);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.YC0
    public final synchronized void f(KA0 ka0) {
        XC0 xc0;
        try {
            String str = this.f19096f;
            if (str != null) {
                RB0 rb0 = (RB0) this.f19093c.get(str);
                if (rb0 == null) {
                    throw null;
                }
                o(rb0);
            }
            Iterator it = this.f19093c.values().iterator();
            while (it.hasNext()) {
                RB0 rb02 = (RB0) it.next();
                it.remove();
                if (rb02.f18617e && (xc0 = this.f19094d) != null) {
                    xc0.f(ka0, rb02.f18613a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.YC0
    public final void g(XC0 xc0) {
        this.f19094d = xc0;
    }
}
