package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class BU {

    /* renamed from: a, reason: collision with root package name */
    private long f13802a;

    /* renamed from: b, reason: collision with root package name */
    private long f13803b;

    /* renamed from: c, reason: collision with root package name */
    private long f13804c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal f13805d = new ThreadLocal();

    public BU(long j8) {
        i(0L);
    }

    public static long g(long j8) {
        return AbstractC2301cW.M(j8, 1000000L, 90000L, RoundingMode.DOWN);
    }

    public static long h(long j8) {
        return AbstractC2301cW.M(j8, 90000L, 1000000L, RoundingMode.DOWN);
    }

    public final synchronized long a(long j8) {
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!j()) {
                long j9 = this.f13802a;
                if (j9 == 9223372036854775806L) {
                    Long l8 = (Long) this.f13805d.get();
                    if (l8 == null) {
                        throw null;
                    }
                    j9 = l8.longValue();
                }
                this.f13803b = j9 - j8;
                notifyAll();
            }
            this.f13804c = j8;
            return j8 + this.f13803b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j8) {
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j9 = this.f13804c;
            if (j9 != -9223372036854775807L) {
                long h8 = h(j9);
                long j10 = (4294967296L + h8) / 8589934592L;
                long j11 = (((-1) + j10) * 8589934592L) + j8;
                j8 += j10 * 8589934592L;
                if (Math.abs(j11 - h8) < Math.abs(j8 - h8)) {
                    j8 = j11;
                }
            }
            return a(g(j8));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j8) {
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j9 = this.f13804c;
        if (j9 != -9223372036854775807L) {
            long h8 = h(j9);
            long j10 = h8 / 8589934592L;
            Long.signum(j10);
            long j11 = (j10 * 8589934592L) + j8;
            j8 += (j10 + 1) * 8589934592L;
            if (j11 >= h8) {
                j8 = j11;
            }
        }
        return a(g(j8));
    }

    public final synchronized long d() {
        long j8 = this.f13802a;
        if (j8 == Long.MAX_VALUE || j8 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j8;
    }

    public final synchronized long e() {
        long j8;
        try {
            j8 = this.f13804c;
        } catch (Throwable th) {
            throw th;
        }
        return j8 != -9223372036854775807L ? j8 + this.f13803b : d();
    }

    public final synchronized long f() {
        return this.f13803b;
    }

    public final synchronized void i(long j8) {
        this.f13802a = j8;
        this.f13803b = j8 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f13804c = -9223372036854775807L;
    }

    public final synchronized boolean j() {
        return this.f13803b != -9223372036854775807L;
    }
}
