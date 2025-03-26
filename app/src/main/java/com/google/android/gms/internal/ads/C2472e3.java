package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2472e3 implements InterfaceC2147b3 {

    /* renamed from: a, reason: collision with root package name */
    private final long f21715a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21716b;

    /* renamed from: c, reason: collision with root package name */
    private final long f21717c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21718d;

    /* renamed from: e, reason: collision with root package name */
    private final long f21719e;

    /* renamed from: f, reason: collision with root package name */
    private final long f21720f;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f21721g;

    private C2472e3(long j8, int i8, long j9, int i9, long j10, long[] jArr) {
        this.f21715a = j8;
        this.f21716b = i8;
        this.f21717c = j9;
        this.f21718d = i9;
        this.f21719e = j10;
        this.f21721g = jArr;
        this.f21720f = j10 != -1 ? j8 + j10 : -1L;
    }

    public static C2472e3 f(C2364d3 c2364d3, long j8) {
        long[] jArr;
        long a8 = c2364d3.a();
        if (a8 == -9223372036854775807L) {
            return null;
        }
        long j9 = c2364d3.f21398c;
        if (j9 == -1 || (jArr = c2364d3.f21401f) == null) {
            K0 k02 = c2364d3.f21396a;
            return new C2472e3(j8, k02.f16491c, a8, k02.f16494f, -1L, null);
        }
        K0 k03 = c2364d3.f21396a;
        return new C2472e3(j8, k03.f16491c, a8, k03.f16494f, j9, jArr);
    }

    private final long g(int i8) {
        return (this.f21717c * i8) / 100;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2147b3
    public final int a() {
        return this.f21718d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2147b3
    public final long b(long j8) {
        if (!e()) {
            return 0L;
        }
        long j9 = j8 - this.f21715a;
        if (j9 <= this.f21716b) {
            return 0L;
        }
        long[] jArr = this.f21721g;
        AbstractC3796qC.b(jArr);
        double d8 = (j9 * 256.0d) / this.f21719e;
        int v7 = AbstractC2301cW.v(jArr, (long) d8, true, true);
        long g8 = g(v7);
        long j10 = jArr[v7];
        int i8 = v7 + 1;
        long g9 = g(i8);
        return g8 + Math.round((j10 == (v7 == 99 ? 256L : jArr[i8]) ? 0.0d : (d8 - j10) / (r0 - j10)) * (g9 - g8));
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final P0 c(long j8) {
        if (!e()) {
            S0 s02 = new S0(0L, this.f21715a + this.f21716b);
            return new P0(s02, s02);
        }
        long max = Math.max(0L, Math.min(j8, this.f21717c));
        double d8 = (max * 100.0d) / this.f21717c;
        double d9 = 0.0d;
        if (d8 > 0.0d) {
            if (d8 >= 100.0d) {
                d9 = 256.0d;
            } else {
                int i8 = (int) d8;
                long[] jArr = this.f21721g;
                AbstractC3796qC.b(jArr);
                double d10 = jArr[i8];
                d9 = d10 + ((d8 - i8) * ((i8 == 99 ? 256.0d : jArr[i8 + 1]) - d10));
            }
        }
        long j9 = this.f21719e;
        S0 s03 = new S0(max, this.f21715a + Math.max(this.f21716b, Math.min(Math.round((d9 / 256.0d) * j9), j9 - 1)));
        return new P0(s03, s03);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2147b3
    public final long d() {
        return this.f21720f;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final boolean e() {
        return this.f21721g != null;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long zza() {
        return this.f21717c;
    }
}
