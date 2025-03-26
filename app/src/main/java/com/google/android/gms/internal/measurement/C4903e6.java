package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4903e6 implements InterfaceC4876b6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f29286a;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.client.consent_state_v1", true);
        e8.d("measurement.client.3p_consent_state_v1", true);
        e8.d("measurement.service.consent_state_v1_W36", true);
        f29286a = e8.b("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4876b6
    public final long zza() {
        return ((Long) f29286a.f()).longValue();
    }
}
