package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class Ky0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f16695a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16696b;

    /* renamed from: c, reason: collision with root package name */
    private long f16697c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    private long f16698d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    private long f16700f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f16701g = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private float f16704j = 0.97f;

    /* renamed from: i, reason: collision with root package name */
    private float f16703i = 1.03f;

    /* renamed from: k, reason: collision with root package name */
    private float f16705k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private long f16706l = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    private long f16699e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f16702h = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    private long f16707m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private long f16708n = -9223372036854775807L;

    /* synthetic */ Ky0(float f8, float f9, long j8, float f10, long j9, long j10, float f11, Jy0 jy0) {
        this.f16695a = j9;
        this.f16696b = j10;
    }

    private static long f(long j8, long j9, float f8) {
        return (long) ((j8 * 0.999f) + (j9 * 9.999871E-4f));
    }

    private final void g() {
        long j8;
        long j9 = this.f16697c;
        if (j9 != -9223372036854775807L) {
            j8 = this.f16698d;
            if (j8 == -9223372036854775807L) {
                long j10 = this.f16700f;
                if (j10 != -9223372036854775807L && j9 < j10) {
                    j9 = j10;
                }
                j8 = this.f16701g;
                if (j8 == -9223372036854775807L || j9 <= j8) {
                    j8 = j9;
                }
            }
        } else {
            j8 = -9223372036854775807L;
        }
        if (this.f16699e == j8) {
            return;
        }
        this.f16699e = j8;
        this.f16702h = j8;
        this.f16707m = -9223372036854775807L;
        this.f16708n = -9223372036854775807L;
        this.f16706l = -9223372036854775807L;
    }

    public final float a(long j8, long j9) {
        long j10;
        if (this.f16697c == -9223372036854775807L) {
            return 1.0f;
        }
        long j11 = j8 - j9;
        long j12 = this.f16707m;
        if (j12 == -9223372036854775807L) {
            this.f16707m = j11;
            this.f16708n = 0L;
        } else {
            long max = Math.max(j11, f(j12, j11, 0.999f));
            this.f16707m = max;
            this.f16708n = f(this.f16708n, Math.abs(j11 - max), 0.999f);
        }
        if (this.f16706l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f16706l < 1000) {
            return this.f16705k;
        }
        this.f16706l = SystemClock.elapsedRealtime();
        long j13 = this.f16707m + (this.f16708n * 3);
        if (this.f16702h > j13) {
            float K7 = AbstractC2301cW.K(1000L);
            long[] jArr = {j13, this.f16699e, this.f16702h - (((long) ((this.f16705k - 1.0f) * K7)) + ((long) ((this.f16703i - 1.0f) * K7)))};
            j10 = jArr[0];
            for (int i8 = 1; i8 < 3; i8++) {
                long j14 = jArr[i8];
                if (j14 > j10) {
                    j10 = j14;
                }
            }
            this.f16702h = j10;
        } else {
            long max2 = Math.max(this.f16702h, Math.min(j8 - ((long) (Math.max(0.0f, this.f16705k - 1.0f) / 1.0E-7f)), j13));
            this.f16702h = max2;
            long j15 = this.f16701g;
            if (j15 == -9223372036854775807L || max2 <= j15) {
                j10 = max2;
            } else {
                this.f16702h = j15;
                j10 = j15;
            }
        }
        long j16 = j8 - j10;
        if (Math.abs(j16) < this.f16695a) {
            this.f16705k = 1.0f;
            return 1.0f;
        }
        float max3 = Math.max(this.f16704j, Math.min((j16 * 1.0E-7f) + 1.0f, this.f16703i));
        this.f16705k = max3;
        return max3;
    }

    public final long b() {
        return this.f16702h;
    }

    public final void c() {
        long j8 = this.f16702h;
        if (j8 == -9223372036854775807L) {
            return;
        }
        long j9 = j8 + this.f16696b;
        this.f16702h = j9;
        long j10 = this.f16701g;
        if (j10 != -9223372036854775807L && j9 > j10) {
            this.f16702h = j10;
        }
        this.f16706l = -9223372036854775807L;
    }

    public final void d(J4 j42) {
        long j8 = j42.f16094a;
        this.f16697c = AbstractC2301cW.K(-9223372036854775807L);
        this.f16700f = AbstractC2301cW.K(-9223372036854775807L);
        this.f16701g = AbstractC2301cW.K(-9223372036854775807L);
        this.f16704j = 0.97f;
        this.f16703i = 1.03f;
        g();
    }

    public final void e(long j8) {
        this.f16698d = j8;
        g();
    }
}
