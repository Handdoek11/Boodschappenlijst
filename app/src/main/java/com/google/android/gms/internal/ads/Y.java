package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    private final long f20168a;

    /* renamed from: b, reason: collision with root package name */
    private final long f20169b;

    /* renamed from: c, reason: collision with root package name */
    private final long f20170c;

    /* renamed from: d, reason: collision with root package name */
    private long f20171d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f20172e;

    /* renamed from: f, reason: collision with root package name */
    private long f20173f;

    /* renamed from: g, reason: collision with root package name */
    private long f20174g;

    /* renamed from: h, reason: collision with root package name */
    private long f20175h;

    protected Y(long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.f20168a = j8;
        this.f20169b = j9;
        this.f20172e = j11;
        this.f20173f = j12;
        this.f20174g = j13;
        this.f20170c = j14;
        this.f20175h = f(j9, 0L, j11, j12, j13, j14);
    }

    protected static long f(long j8, long j9, long j10, long j11, long j12, long j13) {
        if (j11 + 1 >= j12 || 1 + j9 >= j10) {
            return j11;
        }
        long j14 = (long) ((j8 - j9) * ((j12 - j11) / (j10 - j9)));
        return Math.max(j11, Math.min(((j11 + j14) - j13) - (j14 / 20), j12 - 1));
    }

    static /* bridge */ /* synthetic */ void g(Y y7, long j8, long j9) {
        y7.f20172e = j8;
        y7.f20174g = j9;
        y7.i();
    }

    static /* bridge */ /* synthetic */ void h(Y y7, long j8, long j9) {
        y7.f20171d = j8;
        y7.f20173f = j9;
        y7.i();
    }

    private final void i() {
        this.f20175h = f(this.f20169b, this.f20171d, this.f20172e, this.f20173f, this.f20174g, this.f20170c);
    }
}
