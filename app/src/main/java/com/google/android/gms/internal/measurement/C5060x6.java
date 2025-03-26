package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5060x6 implements InterfaceC5036u6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f29642a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4945j3 f29643b;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.client.ad_id_consent_fix", true);
        e8.d("measurement.service.consent.aiid_reset_fix", false);
        e8.d("measurement.service.consent.aiid_reset_fix2", true);
        e8.d("measurement.service.consent.app_start_fix", true);
        f29642a = e8.d("measurement.service.consent.params_on_fx", true);
        f29643b = e8.d("measurement.service.consent.pfo_on_fx", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5036u6
    public final boolean zza() {
        return ((Boolean) f29642a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5036u6
    public final boolean zzb() {
        return ((Boolean) f29643b.f()).booleanValue();
    }
}
