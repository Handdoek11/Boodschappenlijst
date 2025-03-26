package com.google.android.gms.internal.ads;

import java.util.Random;

/* renamed from: com.google.android.gms.internal.ads.na0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3502na0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f24992a;

    /* renamed from: b, reason: collision with root package name */
    private final long f24993b;

    /* renamed from: e, reason: collision with root package name */
    private long f24996e;

    /* renamed from: d, reason: collision with root package name */
    private long f24995d = 5;

    /* renamed from: f, reason: collision with root package name */
    private final Random f24997f = new Random();

    /* renamed from: c, reason: collision with root package name */
    private long f24994c = 0;

    public C3502na0(long j8, double d8, long j9, double d9) {
        this.f24992a = j8;
        this.f24993b = j9;
        c();
    }

    public final long a() {
        double d8 = this.f24996e;
        double d9 = 0.2d * d8;
        long j8 = (long) (d8 + d9);
        return ((long) (d8 - d9)) + ((long) (this.f24997f.nextDouble() * ((j8 - r0) + 1)));
    }

    public final void b() {
        double d8 = this.f24996e;
        this.f24996e = Math.min((long) (d8 + d8), this.f24993b);
        this.f24994c++;
    }

    public final void c() {
        this.f24996e = this.f24992a;
        this.f24994c = 0L;
    }

    public final synchronized void d(int i8) {
        Z2.r.a(i8 > 0);
        this.f24995d = i8;
    }

    public final boolean e() {
        return this.f24994c > Math.max(this.f24995d, (long) ((Integer) D2.A.c().a(AbstractC3184kf.f24057z)).intValue()) && this.f24996e >= this.f24993b;
    }
}
