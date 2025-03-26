package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class Q0 implements R0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f18336a;

    /* renamed from: b, reason: collision with root package name */
    private final P0 f18337b;

    public Q0(long j8, long j9) {
        this.f18336a = j8;
        S0 s02 = j9 == 0 ? S0.f18728c : new S0(0L, j9);
        this.f18337b = new P0(s02, s02);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final P0 c(long j8) {
        return this.f18337b;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long zza() {
        return this.f18336a;
    }
}
