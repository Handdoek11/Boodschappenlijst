package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class J0 implements R0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2944iM f16084a;

    /* renamed from: b, reason: collision with root package name */
    private final C2944iM f16085b;

    /* renamed from: c, reason: collision with root package name */
    private long f16086c;

    public J0(long[] jArr, long[] jArr2, long j8) {
        int length = jArr.length;
        int length2 = jArr2.length;
        AbstractC3796qC.d(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.f16084a = new C2944iM(length2);
            this.f16085b = new C2944iM(length2);
        } else {
            int i8 = length2 + 1;
            C2944iM c2944iM = new C2944iM(i8);
            this.f16084a = c2944iM;
            C2944iM c2944iM2 = new C2944iM(i8);
            this.f16085b = c2944iM2;
            c2944iM.c(0L);
            c2944iM2.c(0L);
        }
        this.f16084a.d(jArr);
        this.f16085b.d(jArr2);
        this.f16086c = j8;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final P0 c(long j8) {
        C2944iM c2944iM = this.f16085b;
        if (c2944iM.a() == 0) {
            S0 s02 = S0.f18728c;
            return new P0(s02, s02);
        }
        int t7 = AbstractC2301cW.t(c2944iM, j8, true, true);
        S0 s03 = new S0(this.f16085b.b(t7), this.f16084a.b(t7));
        if (s03.f18729a != j8) {
            C2944iM c2944iM2 = this.f16085b;
            if (t7 != c2944iM2.a() - 1) {
                int i8 = t7 + 1;
                return new P0(s03, new S0(c2944iM2.b(i8), this.f16084a.b(i8)));
            }
        }
        return new P0(s03, s03);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final boolean e() {
        return this.f16085b.a() > 0;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long zza() {
        return this.f16086c;
    }
}
