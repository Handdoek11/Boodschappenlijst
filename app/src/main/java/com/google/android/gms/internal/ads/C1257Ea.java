package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ea, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1257Ea extends AbstractCallableC2524eb {
    public C1257Ea(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9) {
        super(c3610oa, "BI30n3J1CRcYA+VG0+4MYT6iqJe6ygS/jaP36BUmRAco9FZAzOIaWUnrLPPOeEgd", "opDPFauVb4cwnfQzDqDp9yn5NlOrrzIvgPDGrYZmcXE=", c2918i8, i8, 5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        this.f21840u.v0(-1L);
        this.f21840u.u0(-1L);
        int[] iArr = (int[]) this.f21841v.invoke(null, this.f21837o.b());
        synchronized (this.f21840u) {
            try {
                this.f21840u.v0(iArr[0]);
                this.f21840u.u0(iArr[1]);
                int i8 = iArr[2];
                if (i8 != Integer.MIN_VALUE) {
                    this.f21840u.t0(i8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
