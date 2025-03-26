package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5005q6 implements InterfaceC4981n6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f29515a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4945j3 f29516b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC4945j3 f29517c;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.dma_consent.client", true);
        e8.d("measurement.dma_consent.client_bow_check2", true);
        e8.d("measurement.dma_consent.separate_service_calls_fix", true);
        e8.d("measurement.dma_consent.service", true);
        f29515a = e8.d("measurement.dma_consent.service_database_update_fix", true);
        e8.d("measurement.dma_consent.service_dcu_event", true);
        f29516b = e8.d("measurement.dma_consent.service_dcu_event2", true);
        e8.d("measurement.dma_consent.service_npa_remote_default", true);
        e8.d("measurement.dma_consent.service_split_batch_on_consent", true);
        e8.d("measurement.dma_consent.set_consent_inline_on_worker", true);
        f29517c = e8.d("measurement.dma_consent.setting_npa_inline_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4981n6
    public final boolean a() {
        return ((Boolean) f29517c.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4981n6
    public final boolean zza() {
        return ((Boolean) f29515a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4981n6
    public final boolean zzb() {
        return ((Boolean) f29516b.f()).booleanValue();
    }
}
