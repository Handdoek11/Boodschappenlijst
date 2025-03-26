package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3556o1 {

    /* renamed from: a, reason: collision with root package name */
    protected final Y0 f25071a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25072b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25073c;

    /* renamed from: d, reason: collision with root package name */
    private final long f25074d;

    /* renamed from: e, reason: collision with root package name */
    private final int f25075e;

    /* renamed from: f, reason: collision with root package name */
    private int f25076f;

    /* renamed from: g, reason: collision with root package name */
    private int f25077g;

    /* renamed from: h, reason: collision with root package name */
    private int f25078h;

    /* renamed from: i, reason: collision with root package name */
    private int f25079i;

    /* renamed from: j, reason: collision with root package name */
    private int f25080j;

    /* renamed from: k, reason: collision with root package name */
    private long f25081k;

    /* renamed from: l, reason: collision with root package name */
    private long[] f25082l;

    /* renamed from: m, reason: collision with root package name */
    private int[] f25083m;

    public C3556o1(int i8, int i9, long j8, int i10, Y0 y02) {
        i9 = i9 != 1 ? 2 : i9;
        this.f25074d = j8;
        this.f25075e = i10;
        this.f25071a = y02;
        this.f25072b = h(i8, i9 == 2 ? 1667497984 : 1651965952);
        this.f25073c = i9 == 2 ? h(i8, 1650720768) : -1;
        this.f25081k = -1L;
        this.f25082l = new long[512];
        this.f25083m = new int[512];
    }

    private static int h(int i8, int i9) {
        return (((i8 % 10) + 48) << 8) | ((i8 / 10) + 48) | i9;
    }

    private final long i(int i8) {
        return (this.f25074d * i8) / this.f25075e;
    }

    private final S0 j(int i8) {
        return new S0(this.f25083m[i8] * i(1), this.f25082l[i8]);
    }

    public final P0 a(long j8) {
        if (this.f25080j == 0) {
            S0 s02 = new S0(0L, this.f25081k);
            return new P0(s02, s02);
        }
        int i8 = (int) (j8 / i(1));
        int u7 = AbstractC2301cW.u(this.f25083m, i8, true, true);
        if (this.f25083m[u7] == i8) {
            S0 j9 = j(u7);
            return new P0(j9, j9);
        }
        S0 j10 = j(u7);
        int i9 = u7 + 1;
        return i9 < this.f25082l.length ? new P0(j10, j(i9)) : new P0(j10, j10);
    }

    public final void b(long j8, boolean z7) {
        if (this.f25081k == -1) {
            this.f25081k = j8;
        }
        if (z7) {
            if (this.f25080j == this.f25083m.length) {
                long[] jArr = this.f25082l;
                this.f25082l = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f25083m;
                this.f25083m = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f25082l;
            int i8 = this.f25080j;
            jArr2[i8] = j8;
            this.f25083m[i8] = this.f25079i;
            this.f25080j = i8 + 1;
        }
        this.f25079i++;
    }

    public final void c() {
        this.f25082l = Arrays.copyOf(this.f25082l, this.f25080j);
        this.f25083m = Arrays.copyOf(this.f25083m, this.f25080j);
    }

    public final void d(int i8) {
        this.f25076f = i8;
        this.f25077g = i8;
    }

    public final void e(long j8) {
        if (this.f25080j == 0) {
            this.f25078h = 0;
        } else {
            this.f25078h = this.f25083m[AbstractC2301cW.v(this.f25082l, j8, true, true)];
        }
    }

    public final boolean f(int i8) {
        return this.f25072b == i8 || this.f25073c == i8;
    }

    public final boolean g(InterfaceC3989s0 interfaceC3989s0) {
        int i8 = this.f25077g;
        int e8 = i8 - this.f25071a.e(interfaceC3989s0, i8, false);
        this.f25077g = e8;
        boolean z7 = e8 == 0;
        if (z7) {
            if (this.f25076f > 0) {
                this.f25071a.b(i(this.f25078h), Arrays.binarySearch(this.f25083m, this.f25078h) >= 0 ? 1 : 0, this.f25076f, 0, null);
            }
            this.f25078h++;
        }
        return z7;
    }
}
