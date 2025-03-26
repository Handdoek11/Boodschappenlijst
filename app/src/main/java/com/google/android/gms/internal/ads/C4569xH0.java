package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.xH0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4569xH0 implements Y0 {

    /* renamed from: A, reason: collision with root package name */
    private boolean f27789A;

    /* renamed from: B, reason: collision with root package name */
    private SE0 f27790B;

    /* renamed from: a, reason: collision with root package name */
    private final C3915rH0 f27791a;

    /* renamed from: d, reason: collision with root package name */
    private final RE0 f27794d;

    /* renamed from: e, reason: collision with root package name */
    private final ME0 f27795e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC4351vH0 f27796f;

    /* renamed from: g, reason: collision with root package name */
    private D f27797g;

    /* renamed from: o, reason: collision with root package name */
    private int f27805o;

    /* renamed from: p, reason: collision with root package name */
    private int f27806p;

    /* renamed from: q, reason: collision with root package name */
    private int f27807q;

    /* renamed from: r, reason: collision with root package name */
    private int f27808r;

    /* renamed from: v, reason: collision with root package name */
    private boolean f27812v;

    /* renamed from: y, reason: collision with root package name */
    private D f27815y;

    /* renamed from: b, reason: collision with root package name */
    private final C4133tH0 f27792b = new C4133tH0();

    /* renamed from: h, reason: collision with root package name */
    private int f27798h = 1000;

    /* renamed from: i, reason: collision with root package name */
    private long[] f27799i = new long[1000];

    /* renamed from: j, reason: collision with root package name */
    private long[] f27800j = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    private long[] f27803m = new long[1000];

    /* renamed from: l, reason: collision with root package name */
    private int[] f27802l = new int[1000];

    /* renamed from: k, reason: collision with root package name */
    private int[] f27801k = new int[1000];

    /* renamed from: n, reason: collision with root package name */
    private X0[] f27804n = new X0[1000];

    /* renamed from: c, reason: collision with root package name */
    private final EH0 f27793c = new EH0(new WE() { // from class: com.google.android.gms.internal.ads.sH0
        @Override // com.google.android.gms.internal.ads.WE
        public final void a(Object obj) {
            QE0 qe0 = ((C4242uH0) obj).f27016b;
        }
    });

    /* renamed from: s, reason: collision with root package name */
    private long f27809s = Long.MIN_VALUE;

    /* renamed from: t, reason: collision with root package name */
    private long f27810t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    private long f27811u = Long.MIN_VALUE;

    /* renamed from: x, reason: collision with root package name */
    private boolean f27814x = true;

    /* renamed from: w, reason: collision with root package name */
    private boolean f27813w = true;

    /* renamed from: z, reason: collision with root package name */
    private boolean f27816z = true;

    protected C4569xH0(RI0 ri0, RE0 re0, ME0 me0) {
        this.f27794d = re0;
        this.f27795e = me0;
        this.f27791a = new C3915rH0(ri0);
    }

    private final int i(int i8, int i9, long j8, boolean z7) {
        int i10 = -1;
        for (int i11 = 0; i11 < i9; i11++) {
            long j9 = this.f27803m[i8];
            if (j9 > j8) {
                break;
            }
            if (!z7 || (this.f27802l[i8] & 1) != 0) {
                i10 = i11;
                if (j9 == j8) {
                    break;
                }
            }
            i8++;
            if (i8 == this.f27798h) {
                i8 = 0;
            }
        }
        return i10;
    }

    private final int j(int i8) {
        int i9 = this.f27807q + i8;
        int i10 = this.f27798h;
        return i9 < i10 ? i9 : i9 - i10;
    }

    private final synchronized int k(Tz0 tz0, C4530wy0 c4530wy0, boolean z7, boolean z8, C4133tH0 c4133tH0) {
        try {
            c4530wy0.f27696e = false;
            if (!s()) {
                if (!z8 && !this.f27812v) {
                    D d8 = this.f27815y;
                    if (d8 == null || (!z7 && d8 == this.f27797g)) {
                        return -3;
                    }
                    p(d8, tz0);
                    return -5;
                }
                c4530wy0.c(4);
                c4530wy0.f27697f = Long.MIN_VALUE;
                return -4;
            }
            D d9 = ((C4242uH0) this.f27793c.a(this.f27806p + this.f27808r)).f27015a;
            if (!z7 && d9 == this.f27797g) {
                int j8 = j(this.f27808r);
                if (!t(j8)) {
                    c4530wy0.f27696e = true;
                    return -3;
                }
                c4530wy0.c(this.f27802l[j8]);
                if (this.f27808r == this.f27805o - 1 && (z8 || this.f27812v)) {
                    c4530wy0.a(536870912);
                }
                c4530wy0.f27697f = this.f27803m[j8];
                c4133tH0.f26864a = this.f27801k[j8];
                c4133tH0.f26865b = this.f27800j[j8];
                c4133tH0.f26866c = this.f27804n[j8];
                return -4;
            }
            p(d9, tz0);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized long l(long j8, boolean z7, boolean z8) {
        int i8;
        try {
            int i9 = this.f27805o;
            if (i9 != 0) {
                long[] jArr = this.f27803m;
                int i10 = this.f27807q;
                if (j8 >= jArr[i10]) {
                    if (z8 && (i8 = this.f27808r) != i9) {
                        i9 = i8 + 1;
                    }
                    int i11 = i(i10, i9, j8, false);
                    if (i11 != -1) {
                        return n(i11);
                    }
                }
            }
            return -1L;
        } finally {
        }
    }

    private final synchronized long m() {
        int i8 = this.f27805o;
        if (i8 == 0) {
            return -1L;
        }
        return n(i8);
    }

    private final long n(int i8) {
        long j8 = this.f27810t;
        long j9 = Long.MIN_VALUE;
        if (i8 != 0) {
            int j10 = j(i8 - 1);
            for (int i9 = 0; i9 < i8; i9++) {
                j9 = Math.max(j9, this.f27803m[j10]);
                if ((this.f27802l[j10] & 1) != 0) {
                    break;
                }
                j10--;
                if (j10 == -1) {
                    j10 = this.f27798h - 1;
                }
            }
        }
        this.f27810t = Math.max(j8, j9);
        this.f27805o -= i8;
        int i10 = this.f27806p + i8;
        this.f27806p = i10;
        int i11 = this.f27807q + i8;
        this.f27807q = i11;
        int i12 = this.f27798h;
        if (i11 >= i12) {
            this.f27807q = i11 - i12;
        }
        int i13 = this.f27808r - i8;
        this.f27808r = i13;
        if (i13 < 0) {
            this.f27808r = 0;
        }
        this.f27793c.e(i10);
        if (this.f27805o != 0) {
            return this.f27800j[this.f27807q];
        }
        int i14 = this.f27807q;
        if (i14 == 0) {
            i14 = this.f27798h;
        }
        return this.f27800j[i14 - 1] + this.f27801k[r12];
    }

    private final synchronized void o(long j8, int i8, long j9, int i9, X0 x02) {
        try {
            int i10 = this.f27805o;
            if (i10 > 0) {
                int j10 = j(i10 - 1);
                AbstractC3796qC.d(this.f27800j[j10] + ((long) this.f27801k[j10]) <= j9);
            }
            this.f27812v = (536870912 & i8) != 0;
            this.f27811u = Math.max(this.f27811u, j8);
            int j11 = j(this.f27805o);
            this.f27803m[j11] = j8;
            this.f27800j[j11] = j9;
            this.f27801k[j11] = i9;
            this.f27802l[j11] = i8;
            this.f27804n[j11] = x02;
            this.f27799i[j11] = 0;
            if (this.f27793c.f() || !((C4242uH0) this.f27793c.b()).f27015a.equals(this.f27815y)) {
                D d8 = this.f27815y;
                if (d8 == null) {
                    throw null;
                }
                this.f27793c.c(this.f27806p + this.f27805o, new C4242uH0(d8, this.f27794d.a(this.f27795e, d8), null));
            }
            int i11 = this.f27805o + 1;
            this.f27805o = i11;
            int i12 = this.f27798h;
            if (i11 == i12) {
                int i13 = i12 + 1000;
                long[] jArr = new long[i13];
                long[] jArr2 = new long[i13];
                long[] jArr3 = new long[i13];
                int[] iArr = new int[i13];
                int[] iArr2 = new int[i13];
                X0[] x0Arr = new X0[i13];
                int i14 = this.f27807q;
                int i15 = i12 - i14;
                System.arraycopy(this.f27800j, i14, jArr2, 0, i15);
                System.arraycopy(this.f27803m, this.f27807q, jArr3, 0, i15);
                System.arraycopy(this.f27802l, this.f27807q, iArr, 0, i15);
                System.arraycopy(this.f27801k, this.f27807q, iArr2, 0, i15);
                System.arraycopy(this.f27804n, this.f27807q, x0Arr, 0, i15);
                System.arraycopy(this.f27799i, this.f27807q, jArr, 0, i15);
                int i16 = this.f27807q;
                System.arraycopy(this.f27800j, 0, jArr2, i15, i16);
                System.arraycopy(this.f27803m, 0, jArr3, i15, i16);
                System.arraycopy(this.f27802l, 0, iArr, i15, i16);
                System.arraycopy(this.f27801k, 0, iArr2, i15, i16);
                System.arraycopy(this.f27804n, 0, x0Arr, i15, i16);
                System.arraycopy(this.f27799i, 0, jArr, i15, i16);
                this.f27800j = jArr2;
                this.f27803m = jArr3;
                this.f27802l = iArr;
                this.f27801k = iArr2;
                this.f27804n = x0Arr;
                this.f27799i = jArr;
                this.f27807q = 0;
                this.f27798h = i13;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void p(D d8, Tz0 tz0) {
        D d9 = this.f27797g;
        C4785zG0 c4785zG0 = d9 == null ? null : d9.f14338s;
        this.f27797g = d8;
        C4785zG0 c4785zG02 = d8.f14338s;
        tz0.f19205a = d8.c(this.f27794d.b(d8));
        tz0.f19206b = this.f27790B;
        if (d9 == null || !Objects.equals(c4785zG0, c4785zG02)) {
            SE0 c8 = this.f27794d.c(this.f27795e, d8);
            this.f27790B = c8;
            tz0.f19206b = c8;
        }
    }

    private final void q() {
        if (this.f27790B != null) {
            this.f27790B = null;
            this.f27797g = null;
        }
    }

    private final synchronized void r() {
        this.f27808r = 0;
        this.f27791a.g();
    }

    private final boolean s() {
        return this.f27808r != this.f27805o;
    }

    private final boolean t(int i8) {
        if (this.f27790B != null) {
            return (this.f27802l[i8] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean u(D d8) {
        try {
            this.f27814x = false;
            if (Objects.equals(d8, this.f27815y)) {
                return false;
            }
            if (this.f27793c.f() || !((C4242uH0) this.f27793c.b()).f27015a.equals(d8)) {
                this.f27815y = d8;
            } else {
                this.f27815y = ((C4242uH0) this.f27793c.b()).f27015a;
            }
            boolean z7 = this.f27816z;
            D d9 = this.f27815y;
            this.f27816z = z7 & AbstractC1650Pc.f(d9.f14334o, d9.f14330k);
            this.f27789A = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long A() {
        return this.f27811u;
    }

    public final synchronized D B() {
        if (this.f27814x) {
            return null;
        }
        return this.f27815y;
    }

    public final void C(long j8, boolean z7, boolean z8) {
        this.f27791a.c(l(j8, false, z8));
    }

    public final void D() {
        this.f27791a.c(m());
    }

    public final void E() {
        SE0 se0 = this.f27790B;
        if (se0 != null) {
            throw se0.a();
        }
    }

    public final void F() {
        D();
        q();
    }

    public final void G() {
        H(true);
        q();
    }

    public final void H(boolean z7) {
        this.f27791a.f();
        this.f27805o = 0;
        this.f27806p = 0;
        this.f27807q = 0;
        this.f27808r = 0;
        this.f27813w = true;
        this.f27809s = Long.MIN_VALUE;
        this.f27810t = Long.MIN_VALUE;
        this.f27811u = Long.MIN_VALUE;
        this.f27812v = false;
        this.f27793c.d();
        if (z7) {
            this.f27815y = null;
            this.f27814x = true;
            this.f27816z = true;
        }
    }

    public final void I(long j8) {
        this.f27809s = j8;
    }

    public final void J(InterfaceC4351vH0 interfaceC4351vH0) {
        this.f27796f = interfaceC4351vH0;
    }

    public final synchronized void K(int i8) {
        boolean z7 = false;
        if (i8 >= 0) {
            try {
                if (this.f27808r + i8 <= this.f27805o) {
                    z7 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC3796qC.d(z7);
        this.f27808r += i8;
    }

    public final synchronized boolean L() {
        return this.f27812v;
    }

    public final synchronized boolean M(boolean z7) {
        boolean z8 = true;
        if (s()) {
            if (((C4242uH0) this.f27793c.a(this.f27806p + this.f27808r)).f27015a != this.f27797g) {
                return true;
            }
            return t(j(this.f27808r));
        }
        if (!z7 && !this.f27812v) {
            D d8 = this.f27815y;
            if (d8 == null) {
                z8 = false;
            } else if (d8 == this.f27797g) {
                return false;
            }
        }
        return z8;
    }

    public final synchronized boolean N(int i8) {
        r();
        int i9 = this.f27806p;
        if (i8 >= i9 && i8 <= this.f27805o + i9) {
            this.f27809s = Long.MIN_VALUE;
            this.f27808r = i8 - i9;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final /* synthetic */ void a(UQ uq, int i8) {
        W0.b(this, uq, i8);
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final void b(long j8, int i8, int i9, int i10, X0 x02) {
        if (this.f27813w) {
            if ((i8 & 1) == 0) {
                return;
            } else {
                this.f27813w = false;
            }
        }
        if (this.f27816z) {
            if (j8 < this.f27809s) {
                return;
            }
            if ((i8 & 1) == 0) {
                if (!this.f27789A) {
                    HL.f("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f27815y)));
                    this.f27789A = true;
                }
                i8 |= 1;
            }
        }
        o(j8, i8, (this.f27791a.b() - i9) - i10, i9, x02);
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final void c(D d8) {
        boolean u7 = u(d8);
        InterfaceC4351vH0 interfaceC4351vH0 = this.f27796f;
        if (interfaceC4351vH0 == null || !u7) {
            return;
        }
        interfaceC4351vH0.m(d8);
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final /* synthetic */ void d(long j8) {
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final /* synthetic */ int e(InterfaceC3684pA0 interfaceC3684pA0, int i8, boolean z7) {
        return W0.a(this, interfaceC3684pA0, i8, z7);
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final int f(InterfaceC3684pA0 interfaceC3684pA0, int i8, boolean z7, int i9) {
        return this.f27791a.a(interfaceC3684pA0, i8, z7);
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final void g(UQ uq, int i8, int i9) {
        this.f27791a.h(uq, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean h(long r11, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            r10.r()     // Catch: java.lang.Throwable -> L40
            int r0 = r10.f27808r     // Catch: java.lang.Throwable -> L40
            int r2 = r10.j(r0)     // Catch: java.lang.Throwable -> L40
            boolean r1 = r10.s()     // Catch: java.lang.Throwable -> L40
            r7 = 0
            if (r1 == 0) goto L60
            long[] r1 = r10.f27803m     // Catch: java.lang.Throwable -> L40
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L40
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 < 0) goto L60
            long r3 = r10.f27811u     // Catch: java.lang.Throwable -> L40
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            r8 = 1
            if (r1 <= 0) goto L23
            if (r13 == 0) goto L60
            r13 = r8
        L23:
            boolean r1 = r10.f27816z     // Catch: java.lang.Throwable -> L40
            r9 = -1
            if (r1 == 0) goto L49
            int r1 = r10.f27805o     // Catch: java.lang.Throwable -> L40
            int r1 = r1 - r0
            r0 = r7
        L2c:
            if (r0 >= r1) goto L44
            long[] r3 = r10.f27803m     // Catch: java.lang.Throwable -> L40
            r4 = r3[r2]     // Catch: java.lang.Throwable -> L40
            int r3 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r3 >= 0) goto L42
            int r2 = r2 + 1
            int r3 = r10.f27798h     // Catch: java.lang.Throwable -> L40
            if (r2 != r3) goto L3d
            r2 = r7
        L3d:
            int r0 = r0 + 1
            goto L2c
        L40:
            r11 = move-exception
            goto L62
        L42:
            r1 = r0
            goto L54
        L44:
            if (r13 == 0) goto L47
            goto L54
        L47:
            r1 = r9
            goto L54
        L49:
            int r13 = r10.f27805o     // Catch: java.lang.Throwable -> L40
            int r3 = r13 - r0
            r6 = 1
            r1 = r10
            r4 = r11
            int r1 = r1.i(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L40
        L54:
            if (r1 != r9) goto L57
            goto L60
        L57:
            r10.f27809s = r11     // Catch: java.lang.Throwable -> L40
            int r11 = r10.f27808r     // Catch: java.lang.Throwable -> L40
            int r11 = r11 + r1
            r10.f27808r = r11     // Catch: java.lang.Throwable -> L40
            monitor-exit(r10)
            return r8
        L60:
            monitor-exit(r10)
            return r7
        L62:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L40
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4569xH0.h(long, boolean):boolean");
    }

    public final int v() {
        return this.f27806p;
    }

    public final int w() {
        return this.f27806p + this.f27808r;
    }

    public final synchronized int x(long j8, boolean z7) {
        int i8 = this.f27808r;
        int j9 = j(i8);
        if (s() && j8 >= this.f27803m[j9]) {
            if (j8 > this.f27811u && z7) {
                return this.f27805o - i8;
            }
            int i9 = i(j9, this.f27805o - i8, j8, true);
            if (i9 == -1) {
                return 0;
            }
            return i9;
        }
        return 0;
    }

    public final int y() {
        return this.f27806p + this.f27805o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r9 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int z(com.google.android.gms.internal.ads.Tz0 r9, com.google.android.gms.internal.ads.C4530wy0 r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = r1
            goto L9
        L7:
            r0 = 0
            r5 = r0
        L9:
            com.google.android.gms.internal.ads.tH0 r7 = r8.f27792b
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.k(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.f()
            if (r9 != 0) goto L2b
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L35
            if (r9 == 0) goto L2d
            com.google.android.gms.internal.ads.rH0 r9 = r8.f27791a
            com.google.android.gms.internal.ads.tH0 r11 = r8.f27792b
            r9.d(r10, r11)
        L2b:
            r9 = r12
            goto L3e
        L2d:
            com.google.android.gms.internal.ads.rH0 r9 = r8.f27791a
            com.google.android.gms.internal.ads.tH0 r11 = r8.f27792b
            r9.e(r10, r11)
            goto L38
        L35:
            if (r9 == 0) goto L38
            goto L2b
        L38:
            int r9 = r8.f27808r
            int r9 = r9 + r1
            r8.f27808r = r9
            return r12
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4569xH0.z(com.google.android.gms.internal.ads.Tz0, com.google.android.gms.internal.ads.wy0, int, boolean):int");
    }
}
