package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ab, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2090ab extends AbstractCallableC2524eb {
    public C2090ab(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9) {
        super(c3610oa, "rKSUjmRV/NKsFlHbU0cho8FUC8WVx3Rlxhld5Ju7IE8ltyxUVL0g87xJ7LkJDCm6", "KIfx7EUeWhnA+aC9P4Mk2uzmdiZwzAWUKm+DIiGxj24=", c2918i8, i8, 48);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        this.f21840u.j0(3);
        boolean booleanValue = ((Boolean) this.f21841v.invoke(null, this.f21837o.b())).booleanValue();
        synchronized (this.f21840u) {
            try {
                if (booleanValue) {
                    this.f21840u.j0(2);
                } else {
                    this.f21840u.j0(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
