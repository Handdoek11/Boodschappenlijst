package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.v6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4328v6 implements R0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4001s6 f27188a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27189b;

    /* renamed from: c, reason: collision with root package name */
    private final long f27190c;

    /* renamed from: d, reason: collision with root package name */
    private final long f27191d;

    /* renamed from: e, reason: collision with root package name */
    private final long f27192e;

    public C4328v6(C4001s6 c4001s6, int i8, long j8, long j9) {
        this.f27188a = c4001s6;
        this.f27189b = i8;
        this.f27190c = j8;
        long j10 = (j9 - j8) / c4001s6.f26568d;
        this.f27191d = j10;
        this.f27192e = f(j10);
    }

    private final long f(long j8) {
        return AbstractC2301cW.M(j8 * this.f27189b, 1000000L, this.f27188a.f26567c, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final P0 c(long j8) {
        long max = Math.max(0L, Math.min((this.f27188a.f26567c * j8) / (this.f27189b * 1000000), this.f27191d - 1));
        long f8 = f(max);
        S0 s02 = new S0(f8, this.f27190c + (this.f27188a.f26568d * max));
        if (f8 >= j8 || max == this.f27191d - 1) {
            return new P0(s02, s02);
        }
        long j9 = max + 1;
        return new P0(s02, new S0(f(j9), this.f27190c + (j9 * this.f27188a.f26568d)));
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long zza() {
        return this.f27192e;
    }
}
