package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.pJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3702pJ0 {

    /* renamed from: a, reason: collision with root package name */
    private long f25381a;

    /* renamed from: b, reason: collision with root package name */
    private long f25382b;

    /* renamed from: c, reason: collision with root package name */
    private long f25383c;

    /* renamed from: d, reason: collision with root package name */
    private long f25384d;

    /* renamed from: e, reason: collision with root package name */
    private long f25385e;

    /* renamed from: f, reason: collision with root package name */
    private long f25386f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f25387g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    private int f25388h;

    public final long a() {
        long j8 = this.f25385e;
        if (j8 == 0) {
            return 0L;
        }
        return this.f25386f / j8;
    }

    public final long b() {
        return this.f25386f;
    }

    public final void c(long j8) {
        long j9 = this.f25384d;
        if (j9 == 0) {
            this.f25381a = j8;
        } else if (j9 == 1) {
            long j10 = j8 - this.f25381a;
            this.f25382b = j10;
            this.f25386f = j10;
            this.f25385e = 1L;
        } else {
            long j11 = j8 - this.f25383c;
            int i8 = (int) (j9 % 15);
            if (Math.abs(j11 - this.f25382b) <= 1000000) {
                this.f25385e++;
                this.f25386f += j11;
                boolean[] zArr = this.f25387g;
                if (zArr[i8]) {
                    zArr[i8] = false;
                    this.f25388h--;
                }
            } else {
                boolean[] zArr2 = this.f25387g;
                if (!zArr2[i8]) {
                    zArr2[i8] = true;
                    this.f25388h++;
                }
            }
        }
        this.f25384d++;
        this.f25383c = j8;
    }

    public final void d() {
        this.f25384d = 0L;
        this.f25385e = 0L;
        this.f25386f = 0L;
        this.f25388h = 0;
        Arrays.fill(this.f25387g, false);
    }

    public final boolean e() {
        long j8 = this.f25384d;
        if (j8 == 0) {
            return false;
        }
        return this.f25387g[(int) ((j8 - 1) % 15)];
    }

    public final boolean f() {
        return this.f25384d > 15 && this.f25388h == 0;
    }
}
