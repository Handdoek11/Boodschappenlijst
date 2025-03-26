package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.kH0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3153kH0 implements EG0, InterfaceC4207u0, XI0, InterfaceC2180bJ0, InterfaceC4351vH0 {

    /* renamed from: e0, reason: collision with root package name */
    private static final Map f23532e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final D f23533f0;

    /* renamed from: A, reason: collision with root package name */
    private final YG0 f23534A;

    /* renamed from: F, reason: collision with root package name */
    private DG0 f23539F;

    /* renamed from: G, reason: collision with root package name */
    private X1 f23540G;

    /* renamed from: J, reason: collision with root package name */
    private boolean f23543J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f23544K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f23545L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f23546M;

    /* renamed from: N, reason: collision with root package name */
    private C3044jH0 f23547N;

    /* renamed from: O, reason: collision with root package name */
    private R0 f23548O;

    /* renamed from: P, reason: collision with root package name */
    private long f23549P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f23550Q;

    /* renamed from: S, reason: collision with root package name */
    private boolean f23552S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f23553T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f23554U;

    /* renamed from: V, reason: collision with root package name */
    private int f23555V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f23556W;

    /* renamed from: X, reason: collision with root package name */
    private long f23557X;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f23559Z;

    /* renamed from: a0, reason: collision with root package name */
    private int f23560a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f23561b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f23562c0;

    /* renamed from: d0, reason: collision with root package name */
    private final RI0 f23563d0;

    /* renamed from: o, reason: collision with root package name */
    private final Uri f23564o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC1344Gh0 f23565s;

    /* renamed from: t, reason: collision with root package name */
    private final RE0 f23566t;

    /* renamed from: u, reason: collision with root package name */
    private final QG0 f23567u;

    /* renamed from: v, reason: collision with root package name */
    private final ME0 f23568v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC2719gH0 f23569w;

    /* renamed from: x, reason: collision with root package name */
    private final long f23570x;

    /* renamed from: y, reason: collision with root package name */
    private final long f23571y;

    /* renamed from: z, reason: collision with root package name */
    private final C2505eJ0 f23572z = new C2505eJ0("ProgressiveMediaPeriod");

    /* renamed from: B, reason: collision with root package name */
    private final C4344vE f23535B = new C4344vE(RC.f18620a);

    /* renamed from: C, reason: collision with root package name */
    private final Runnable f23536C = new Runnable() { // from class: com.google.android.gms.internal.ads.bH0
        @Override // java.lang.Runnable
        public final void run() {
            this.f20845o.E();
        }
    };

    /* renamed from: D, reason: collision with root package name */
    private final Runnable f23537D = new Runnable() { // from class: com.google.android.gms.internal.ads.cH0
        @Override // java.lang.Runnable
        public final void run() {
            this.f21124o.t();
        }
    };

    /* renamed from: E, reason: collision with root package name */
    private final Handler f23538E = AbstractC2301cW.Q(null);

    /* renamed from: I, reason: collision with root package name */
    private C2937iH0[] f23542I = new C2937iH0[0];

    /* renamed from: H, reason: collision with root package name */
    private C4569xH0[] f23541H = new C4569xH0[0];

    /* renamed from: Y, reason: collision with root package name */
    private long f23558Y = -9223372036854775807L;

    /* renamed from: R, reason: collision with root package name */
    private int f23551R = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f23532e0 = DesugarCollections.unmodifiableMap(hashMap);
        C2723gJ0 c2723gJ0 = new C2723gJ0();
        c2723gJ0.m("icy");
        c2723gJ0.B("application/x-icy");
        f23533f0 = c2723gJ0.H();
    }

    public C3153kH0(Uri uri, InterfaceC1344Gh0 interfaceC1344Gh0, YG0 yg0, RE0 re0, ME0 me0, VI0 vi0, QG0 qg0, InterfaceC2719gH0 interfaceC2719gH0, RI0 ri0, String str, int i8, boolean z7, long j8, InterfaceExecutorC3484nJ0 interfaceExecutorC3484nJ0) {
        this.f23564o = uri;
        this.f23565s = interfaceC1344Gh0;
        this.f23566t = re0;
        this.f23568v = me0;
        this.f23567u = qg0;
        this.f23569w = interfaceC2719gH0;
        this.f23563d0 = ri0;
        this.f23570x = i8;
        this.f23534A = yg0;
        this.f23571y = j8;
    }

    private final int A() {
        int i8 = 0;
        for (C4569xH0 c4569xH0 : this.f23541H) {
            i8 += c4569xH0.y();
        }
        return i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long B(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.xH0[] r3 = r5.f23541H
            int r4 = r3.length
            if (r0 >= r4) goto L22
            if (r6 != 0) goto L15
            com.google.android.gms.internal.ads.jH0 r4 = r5.f23547N
            r4.getClass()
            boolean[] r4 = r4.f23232c
            boolean r4 = r4[r0]
            if (r4 == 0) goto L1f
        L15:
            r3 = r3[r0]
            long r3 = r3.A()
            long r1 = java.lang.Math.max(r1, r3)
        L1f:
            int r0 = r0 + 1
            goto L3
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3153kH0.B(boolean):long");
    }

    private final Y0 C(C2937iH0 c2937iH0) {
        int length = this.f23541H.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (c2937iH0.equals(this.f23542I[i8])) {
                return this.f23541H[i8];
            }
        }
        if (this.f23543J) {
            HL.f("ProgressiveMediaPeriod", "Extractor added new track (id=" + c2937iH0.f22939a + ") after finishing tracks.");
            return new C3336m0();
        }
        C4569xH0 c4569xH0 = new C4569xH0(this.f23563d0, this.f23566t, this.f23568v);
        c4569xH0.J(this);
        int i9 = length + 1;
        C2937iH0[] c2937iH0Arr = (C2937iH0[]) Arrays.copyOf(this.f23542I, i9);
        c2937iH0Arr[length] = c2937iH0;
        int i10 = AbstractC2301cW.f21206a;
        this.f23542I = c2937iH0Arr;
        C4569xH0[] c4569xH0Arr = (C4569xH0[]) Arrays.copyOf(this.f23541H, i9);
        c4569xH0Arr[length] = c4569xH0;
        this.f23541H = c4569xH0Arr;
        return c4569xH0;
    }

    private final void D() {
        AbstractC3796qC.f(this.f23544K);
        this.f23547N.getClass();
        this.f23548O.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        int i8;
        if (this.f23562c0 || this.f23544K || !this.f23543J || this.f23548O == null) {
            return;
        }
        for (C4569xH0 c4569xH0 : this.f23541H) {
            if (c4569xH0.B() == null) {
                return;
            }
        }
        this.f23535B.c();
        int length = this.f23541H.length;
        C4614xm[] c4614xmArr = new C4614xm[length];
        boolean[] zArr = new boolean[length];
        for (int i9 = 0; i9 < length; i9++) {
            D B7 = this.f23541H[i9].B();
            B7.getClass();
            String str = B7.f14334o;
            boolean g8 = AbstractC1650Pc.g(str);
            boolean z7 = g8 || AbstractC1650Pc.i(str);
            zArr[i9] = z7;
            this.f23545L = z7 | this.f23545L;
            this.f23546M = this.f23571y != -9223372036854775807L && length == 1 && AbstractC1650Pc.h(str);
            X1 x12 = this.f23540G;
            if (x12 != null) {
                if (g8 || this.f23542I[i9].f22940b) {
                    C3503nb c3503nb = B7.f14331l;
                    C3503nb c3503nb2 = c3503nb == null ? new C3503nb(-9223372036854775807L, x12) : c3503nb.c(x12);
                    C2723gJ0 b8 = B7.b();
                    b8.t(c3503nb2);
                    B7 = b8.H();
                }
                if (g8 && B7.f14327h == -1 && B7.f14328i == -1 && (i8 = x12.f19937o) != -1) {
                    C2723gJ0 b9 = B7.b();
                    b9.q0(i8);
                    B7 = b9.H();
                }
            }
            D c8 = B7.c(this.f23566t.b(B7));
            c4614xmArr[i9] = new C4614xm(Integer.toString(i9), c8);
            this.f23554U = c8.f14340u | this.f23554U;
        }
        this.f23547N = new C3044jH0(new JH0(c4614xmArr), zArr);
        if (this.f23546M && this.f23549P == -9223372036854775807L) {
            this.f23549P = this.f23571y;
            this.f23548O = new C2501eH0(this, this.f23548O);
        }
        this.f23569w.d(this.f23549P, this.f23548O.e(), this.f23550Q);
        this.f23544K = true;
        DG0 dg0 = this.f23539F;
        dg0.getClass();
        dg0.k(this);
    }

    private final void F(int i8) {
        D();
        C3044jH0 c3044jH0 = this.f23547N;
        boolean[] zArr = c3044jH0.f23233d;
        if (zArr[i8]) {
            return;
        }
        D b8 = c3044jH0.f23230a.b(i8).b(0);
        this.f23567u.d(new CG0(1, AbstractC1650Pc.b(b8.f14334o), b8, 0, null, AbstractC2301cW.N(this.f23557X), -9223372036854775807L));
        zArr[i8] = true;
    }

    private final void G(int i8) {
        D();
        boolean[] zArr = this.f23547N.f23231b;
        if (this.f23559Z && zArr[i8] && !this.f23541H[i8].M(false)) {
            this.f23558Y = 0L;
            this.f23559Z = false;
            this.f23553T = true;
            this.f23557X = 0L;
            this.f23560a0 = 0;
            for (C4569xH0 c4569xH0 : this.f23541H) {
                c4569xH0.H(false);
            }
            DG0 dg0 = this.f23539F;
            dg0.getClass();
            dg0.g(this);
        }
    }

    private final void H() {
        C2610fH0 c2610fH0 = new C2610fH0(this, this.f23564o, this.f23565s, this.f23534A, this, this.f23535B);
        if (this.f23544K) {
            AbstractC3796qC.f(I());
            long j8 = this.f23549P;
            if (j8 != -9223372036854775807L && this.f23558Y > j8) {
                this.f23561b0 = true;
                this.f23558Y = -9223372036854775807L;
                return;
            }
            R0 r02 = this.f23548O;
            r02.getClass();
            C2610fH0.h(c2610fH0, r02.c(this.f23558Y).f18099a.f18730b, this.f23558Y);
            for (C4569xH0 c4569xH0 : this.f23541H) {
                c4569xH0.I(this.f23558Y);
            }
            this.f23558Y = -9223372036854775807L;
        }
        this.f23560a0 = A();
        long a8 = this.f23572z.a(c2610fH0, this, VI0.a(this.f23551R));
        this.f23567u.h(new C4458wG0(c2610fH0.f21980a, c2610fH0.f21990k, a8), new CG0(1, -1, null, 0, null, AbstractC2301cW.N(c2610fH0.f21989j), AbstractC2301cW.N(this.f23549P)));
    }

    private final boolean I() {
        return this.f23558Y != -9223372036854775807L;
    }

    private final boolean J() {
        return this.f23553T || I();
    }

    static /* bridge */ /* synthetic */ long S(C3153kH0 c3153kH0, boolean z7) {
        return c3153kH0.B(true);
    }

    static /* bridge */ /* synthetic */ void s(final C3153kH0 c3153kH0) {
        c3153kH0.f23538E.post(new Runnable() { // from class: com.google.android.gms.internal.ads.aH0
            @Override // java.lang.Runnable
            public final void run() {
                this.f20675o.u();
            }
        });
    }

    final int K(int i8, Tz0 tz0, C4530wy0 c4530wy0, int i9) {
        if (J()) {
            return -3;
        }
        F(i8);
        int z7 = this.f23541H[i8].z(tz0, c4530wy0, i9, this.f23561b0);
        if (z7 == -3) {
            G(i8);
        }
        return z7;
    }

    final int L(int i8, long j8) {
        if (J()) {
            return 0;
        }
        F(i8);
        C4569xH0 c4569xH0 = this.f23541H[i8];
        int x7 = c4569xH0.x(j8, this.f23561b0);
        c4569xH0.K(x7);
        if (x7 != 0) {
            return x7;
        }
        G(i8);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2180bJ0
    public final void O() {
        for (C4569xH0 c4569xH0 : this.f23541H) {
            c4569xH0.G();
        }
        this.f23534A.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4207u0
    public final void P() {
        this.f23543J = true;
        this.f23538E.post(this.f23536C);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4207u0
    public final void Q(final R0 r02) {
        this.f23538E.post(new Runnable() { // from class: com.google.android.gms.internal.ads.dH0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21489o.v(r02);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4207u0
    public final Y0 R(int i8, int i9) {
        return C(new C2937iH0(i8, false));
    }

    final Y0 V() {
        return C(new C2937iH0(0, true));
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final long a() {
        return zzb();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // com.google.android.gms.internal.ads.EG0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(long r9) {
        /*
            r8 = this;
            r8.D()
            com.google.android.gms.internal.ads.jH0 r0 = r8.f23547N
            boolean[] r0 = r0.f23231b
            com.google.android.gms.internal.ads.R0 r1 = r8.f23548O
            boolean r1 = r1.e()
            r2 = 1
            if (r2 == r1) goto L12
            r9 = 0
        L12:
            r1 = 0
            r8.f23553T = r1
            long r2 = r8.f23557X
            r8.f23557X = r9
            boolean r4 = r8.I()
            if (r4 == 0) goto L22
            r8.f23558Y = r9
            return r9
        L22:
            int r4 = r8.f23551R
            r5 = 7
            if (r4 == r5) goto L67
            boolean r4 = r8.f23561b0
            if (r4 != 0) goto L33
            com.google.android.gms.internal.ads.eJ0 r4 = r8.f23572z
            boolean r4 = r4.l()
            if (r4 == 0) goto L67
        L33:
            com.google.android.gms.internal.ads.xH0[] r4 = r8.f23541H
            int r4 = r4.length
            r5 = r1
        L37:
            if (r5 >= r4) goto L9b
            com.google.android.gms.internal.ads.xH0[] r6 = r8.f23541H
            r6 = r6[r5]
            int r7 = r6.w()
            if (r7 != 0) goto L48
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 != 0) goto L48
            goto L64
        L48:
            boolean r7 = r8.f23546M
            if (r7 == 0) goto L55
            int r7 = r6.v()
            boolean r6 = r6.N(r7)
            goto L59
        L55:
            boolean r6 = r6.h(r9, r1)
        L59:
            if (r6 != 0) goto L64
            boolean r6 = r0[r5]
            if (r6 != 0) goto L67
            boolean r6 = r8.f23545L
            if (r6 != 0) goto L64
            goto L67
        L64:
            int r5 = r5 + 1
            goto L37
        L67:
            r8.f23559Z = r1
            r8.f23558Y = r9
            r8.f23561b0 = r1
            r8.f23554U = r1
            com.google.android.gms.internal.ads.eJ0 r0 = r8.f23572z
            boolean r2 = r0.l()
            if (r2 == 0) goto L8a
            com.google.android.gms.internal.ads.xH0[] r0 = r8.f23541H
            int r2 = r0.length
        L7a:
            if (r1 >= r2) goto L84
            r3 = r0[r1]
            r3.D()
            int r1 = r1 + 1
            goto L7a
        L84:
            com.google.android.gms.internal.ads.eJ0 r0 = r8.f23572z
            r0.g()
            goto L9b
        L8a:
            r0.h()
            com.google.android.gms.internal.ads.xH0[] r0 = r8.f23541H
            int r2 = r0.length
            r3 = r1
        L91:
            if (r3 >= r2) goto L9b
            r4 = r0[r3]
            r4.H(r1)
            int r3 = r3 + 1
            goto L91
        L9b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3153kH0.b(long):long");
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final void c(long j8) {
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final long d() {
        if (this.f23554U) {
            this.f23554U = false;
        } else {
            if (!this.f23553T) {
                return -9223372036854775807L;
            }
            if (!this.f23561b0 && A() <= this.f23560a0) {
                return -9223372036854775807L;
            }
            this.f23553T = false;
        }
        return this.f23557X;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final JH0 e() {
        D();
        return this.f23547N.f23230a;
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final boolean f(Yz0 yz0) {
        if (this.f23561b0) {
            return false;
        }
        C2505eJ0 c2505eJ0 = this.f23572z;
        if (c2505eJ0.k() || this.f23559Z) {
            return false;
        }
        if (this.f23544K && this.f23555V == 0) {
            return false;
        }
        boolean e8 = this.f23535B.e();
        if (c2505eJ0.l()) {
            return e8;
        }
        H();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.XI0
    public final /* bridge */ /* synthetic */ void g(InterfaceC2071aJ0 interfaceC2071aJ0, long j8, long j9, boolean z7) {
        C2610fH0 c2610fH0 = (C2610fH0) interfaceC2071aJ0;
        Cu0 cu0 = c2610fH0.f21982c;
        C4458wG0 c4458wG0 = new C4458wG0(c2610fH0.f21980a, c2610fH0.f21990k, cu0.i(), cu0.j(), j8, j9, cu0.g());
        long unused = c2610fH0.f21980a;
        this.f23567u.e(c4458wG0, new CG0(1, -1, null, 0, null, AbstractC2301cW.N(c2610fH0.f21989j), AbstractC2301cW.N(this.f23549P)));
        if (z7) {
            return;
        }
        for (C4569xH0 c4569xH0 : this.f23541H) {
            c4569xH0.H(false);
        }
        if (this.f23555V > 0) {
            DG0 dg0 = this.f23539F;
            dg0.getClass();
            dg0.g(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final long h(long j8, FA0 fa0) {
        D();
        if (!this.f23548O.e()) {
            return 0L;
        }
        P0 c8 = this.f23548O.c(j8);
        S0 s02 = c8.f18099a;
        S0 s03 = c8.f18100b;
        long j9 = fa0.f15097a;
        if (j9 == 0) {
            if (fa0.f15098b == 0) {
                return j8;
            }
            j9 = 0;
        }
        long j10 = s02.f18729a;
        int i8 = AbstractC2301cW.f21206a;
        long j11 = j8 - j9;
        long j12 = fa0.f15098b;
        long j13 = j8 + j12;
        long j14 = j8 ^ j13;
        long j15 = j12 ^ j13;
        if (((j8 ^ j9) & (j8 ^ j11)) < 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((j14 & j15) < 0) {
            j13 = Long.MAX_VALUE;
        }
        boolean z7 = j11 <= j10 && j10 <= j13;
        long j16 = s03.f18729a;
        boolean z8 = j11 <= j16 && j16 <= j13;
        if (z7 && z8) {
            if (Math.abs(j10 - j8) > Math.abs(j16 - j8)) {
                return j16;
            }
        } else if (!z7) {
            return z8 ? j16 : j11;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void i() {
        w();
        if (this.f23561b0 && !this.f23544K) {
            throw zzbc.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void j(long j8, boolean z7) {
        if (this.f23546M) {
            return;
        }
        D();
        if (I()) {
            return;
        }
        boolean[] zArr = this.f23547N.f23232c;
        int length = this.f23541H.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.f23541H[i8].C(j8, false, zArr[i8]);
        }
    }

    @Override // com.google.android.gms.internal.ads.XI0
    public final /* bridge */ /* synthetic */ YI0 k(InterfaceC2071aJ0 interfaceC2071aJ0, long j8, long j9, IOException iOException, int i8) {
        long j10;
        YI0 b8;
        R0 r02;
        C2610fH0 c2610fH0 = (C2610fH0) interfaceC2071aJ0;
        Cu0 cu0 = c2610fH0.f21982c;
        C4458wG0 c4458wG0 = new C4458wG0(c2610fH0.f21980a, c2610fH0.f21990k, cu0.i(), cu0.j(), j8, j9, cu0.g());
        long unused = c2610fH0.f21989j;
        int i9 = AbstractC2301cW.f21206a;
        if ((iOException instanceof zzbc) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzgo) || (iOException instanceof zzyw)) {
            j10 = -9223372036854775807L;
            break;
        }
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof zzfz) && ((zzfz) th).f28763o == 2008) {
                j10 = -9223372036854775807L;
                break;
            }
        }
        j10 = Math.min((i8 - 1) * 1000, 5000);
        if (j10 == -9223372036854775807L) {
            b8 = C2505eJ0.f21791e;
        } else {
            int A7 = A();
            boolean z7 = A7 > this.f23560a0;
            if (this.f23556W || !((r02 = this.f23548O) == null || r02.zza() == -9223372036854775807L)) {
                this.f23560a0 = A7;
            } else {
                boolean z8 = this.f23544K;
                if (!z8 || J()) {
                    this.f23553T = z8;
                    this.f23557X = 0L;
                    this.f23560a0 = 0;
                    for (C4569xH0 c4569xH0 : this.f23541H) {
                        c4569xH0.H(false);
                    }
                    C2610fH0.h(c2610fH0, 0L, 0L);
                } else {
                    this.f23559Z = true;
                    b8 = C2505eJ0.f21790d;
                }
            }
            b8 = C2505eJ0.b(z7, j10);
        }
        boolean c8 = b8.c();
        this.f23567u.g(c4458wG0, new CG0(1, -1, null, 0, null, AbstractC2301cW.N(c2610fH0.f21989j), AbstractC2301cW.N(this.f23549P)), iOException, true ^ c8);
        if (!c8) {
            long unused2 = c2610fH0.f21980a;
        }
        return b8;
    }

    @Override // com.google.android.gms.internal.ads.XI0
    public final /* bridge */ /* synthetic */ void l(InterfaceC2071aJ0 interfaceC2071aJ0, long j8, long j9) {
        R0 r02;
        C2610fH0 c2610fH0 = (C2610fH0) interfaceC2071aJ0;
        if (this.f23549P == -9223372036854775807L && (r02 = this.f23548O) != null) {
            boolean e8 = r02.e();
            long B7 = B(true);
            long j10 = B7 == Long.MIN_VALUE ? 0L : B7 + 10000;
            this.f23549P = j10;
            this.f23569w.d(j10, e8, this.f23550Q);
        }
        Cu0 cu0 = c2610fH0.f21982c;
        C4458wG0 c4458wG0 = new C4458wG0(c2610fH0.f21980a, c2610fH0.f21990k, cu0.i(), cu0.j(), j8, j9, cu0.g());
        long unused = c2610fH0.f21980a;
        this.f23567u.f(c4458wG0, new CG0(1, -1, null, 0, null, AbstractC2301cW.N(c2610fH0.f21989j), AbstractC2301cW.N(this.f23549P)));
        this.f23561b0 = true;
        DG0 dg0 = this.f23539F;
        dg0.getClass();
        dg0.g(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4351vH0
    public final void m(D d8) {
        this.f23538E.post(this.f23536C);
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final long n(BI0[] bi0Arr, boolean[] zArr, InterfaceC4678yH0[] interfaceC4678yH0Arr, boolean[] zArr2, long j8) {
        BI0 bi0;
        D();
        C3044jH0 c3044jH0 = this.f23547N;
        JH0 jh0 = c3044jH0.f23230a;
        boolean[] zArr3 = c3044jH0.f23232c;
        int i8 = this.f23555V;
        int i9 = 0;
        for (int i10 = 0; i10 < bi0Arr.length; i10++) {
            InterfaceC4678yH0 interfaceC4678yH0 = interfaceC4678yH0Arr[i10];
            if (interfaceC4678yH0 != null && (bi0Arr[i10] == null || !zArr[i10])) {
                int i11 = ((C2828hH0) interfaceC4678yH0).f22529a;
                AbstractC3796qC.f(zArr3[i11]);
                this.f23555V--;
                zArr3[i11] = false;
                interfaceC4678yH0Arr[i10] = null;
            }
        }
        boolean z7 = !this.f23552S ? j8 == 0 || this.f23546M : i8 != 0;
        for (int i12 = 0; i12 < bi0Arr.length; i12++) {
            if (interfaceC4678yH0Arr[i12] == null && (bi0 = bi0Arr[i12]) != null) {
                AbstractC3796qC.f(bi0.d() == 1);
                AbstractC3796qC.f(bi0.m(0) == 0);
                int a8 = jh0.a(bi0.g());
                AbstractC3796qC.f(!zArr3[a8]);
                this.f23555V++;
                zArr3[a8] = true;
                this.f23554U = bi0.c().f14340u | this.f23554U;
                interfaceC4678yH0Arr[i12] = new C2828hH0(this, a8);
                zArr2[i12] = true;
                if (!z7) {
                    C4569xH0 c4569xH0 = this.f23541H[a8];
                    z7 = (c4569xH0.w() == 0 || c4569xH0.h(j8, true)) ? false : true;
                }
            }
        }
        if (this.f23555V == 0) {
            this.f23559Z = false;
            this.f23553T = false;
            this.f23554U = false;
            if (this.f23572z.l()) {
                C4569xH0[] c4569xH0Arr = this.f23541H;
                int length = c4569xH0Arr.length;
                while (i9 < length) {
                    c4569xH0Arr[i9].D();
                    i9++;
                }
                this.f23572z.g();
            } else {
                this.f23561b0 = false;
                for (C4569xH0 c4569xH02 : this.f23541H) {
                    c4569xH02.H(false);
                }
            }
        } else if (z7) {
            j8 = b(j8);
            while (i9 < interfaceC4678yH0Arr.length) {
                if (interfaceC4678yH0Arr[i9] != null) {
                    zArr2[i9] = true;
                }
                i9++;
            }
        }
        this.f23552S = true;
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void o(DG0 dg0, long j8) {
        this.f23539F = dg0;
        this.f23535B.e();
        H();
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final boolean p() {
        return this.f23572z.l() && this.f23535B.d();
    }

    final /* synthetic */ void t() {
        if (this.f23562c0) {
            return;
        }
        DG0 dg0 = this.f23539F;
        dg0.getClass();
        dg0.g(this);
    }

    final /* synthetic */ void u() {
        this.f23556W = true;
    }

    final /* synthetic */ void v(R0 r02) {
        this.f23548O = this.f23540G == null ? r02 : new Q0(-9223372036854775807L, 0L);
        this.f23549P = r02.zza();
        boolean z7 = false;
        if (!this.f23556W && r02.zza() == -9223372036854775807L) {
            z7 = true;
        }
        this.f23550Q = z7;
        this.f23551R = true == z7 ? 7 : 1;
        if (this.f23544K) {
            this.f23569w.d(this.f23549P, r02.e(), this.f23550Q);
        } else {
            E();
        }
    }

    final void w() {
        this.f23572z.i(VI0.a(this.f23551R));
    }

    final void x(int i8) {
        this.f23541H[i8].E();
        w();
    }

    public final void y() {
        if (this.f23544K) {
            for (C4569xH0 c4569xH0 : this.f23541H) {
                c4569xH0.F();
            }
        }
        this.f23572z.j(this);
        this.f23538E.removeCallbacksAndMessages(null);
        this.f23539F = null;
        this.f23562c0 = true;
    }

    final boolean z(int i8) {
        return !J() && this.f23541H[i8].M(this.f23561b0);
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final long zzb() {
        long j8;
        D();
        if (this.f23561b0 || this.f23555V == 0) {
            return Long.MIN_VALUE;
        }
        if (I()) {
            return this.f23558Y;
        }
        if (this.f23545L) {
            int length = this.f23541H.length;
            j8 = Long.MAX_VALUE;
            for (int i8 = 0; i8 < length; i8++) {
                C3044jH0 c3044jH0 = this.f23547N;
                if (c3044jH0.f23231b[i8] && c3044jH0.f23232c[i8] && !this.f23541H[i8].L()) {
                    j8 = Math.min(j8, this.f23541H[i8].A());
                }
            }
        } else {
            j8 = Long.MAX_VALUE;
        }
        if (j8 == Long.MAX_VALUE) {
            j8 = B(false);
        }
        return j8 == Long.MIN_VALUE ? this.f23557X : j8;
    }
}
