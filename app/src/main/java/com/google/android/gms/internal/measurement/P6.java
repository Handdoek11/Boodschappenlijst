package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class P6 implements M6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f28993a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4945j3 f28994b;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        f28993a = e8.d("measurement.gbraid_campaign.gbraid.client", true);
        f28994b = e8.d("measurement.gbraid_campaign.gbraid.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.M6
    public final boolean a() {
        return ((Boolean) f28994b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.M6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.M6
    public final boolean zzb() {
        return ((Boolean) f28993a.f()).booleanValue();
    }
}
