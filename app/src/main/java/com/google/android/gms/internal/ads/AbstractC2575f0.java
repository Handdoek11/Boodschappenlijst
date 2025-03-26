package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2575f0 implements R0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f21908a;

    /* renamed from: b, reason: collision with root package name */
    private final long f21909b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21910c;

    /* renamed from: d, reason: collision with root package name */
    private final long f21911d;

    /* renamed from: e, reason: collision with root package name */
    private final int f21912e;

    /* renamed from: f, reason: collision with root package name */
    private final long f21913f;

    public AbstractC2575f0(long j8, long j9, int i8, int i9, boolean z7) {
        long g8;
        this.f21908a = j8;
        this.f21909b = j9;
        this.f21910c = i9 == -1 ? 1 : i9;
        this.f21912e = i8;
        if (j8 == -1) {
            this.f21911d = -1L;
            g8 = -9223372036854775807L;
        } else {
            this.f21911d = j8 - j9;
            g8 = g(j8, j9, i8);
        }
        this.f21913f = g8;
    }

    private static long g(long j8, long j9, int i8) {
        return (Math.max(0L, j8 - j9) * 8000000) / i8;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final P0 c(long j8) {
        long j9 = this.f21911d;
        if (j9 == -1) {
            S0 s02 = new S0(0L, this.f21909b);
            return new P0(s02, s02);
        }
        long j10 = this.f21910c;
        long j11 = (((this.f21912e * j8) / 8000000) / j10) * j10;
        if (j9 != -1) {
            j11 = Math.min(j11, j9 - j10);
        }
        long max = this.f21909b + Math.max(j11, 0L);
        long f8 = f(max);
        S0 s03 = new S0(f8, max);
        if (this.f21911d != -1 && f8 < j8) {
            long j12 = max + this.f21910c;
            if (j12 < this.f21908a) {
                return new P0(s03, new S0(f(j12), j12));
            }
        }
        return new P0(s03, s03);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final boolean e() {
        return this.f21911d != -1;
    }

    public final long f(long j8) {
        return g(j8, this.f21909b, this.f21912e);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long zza() {
        return this.f21913f;
    }
}
