package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4965l6 implements InterfaceC4973m6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f29449a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4945j3 f29450b;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        f29449a = e8.d("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        f29450b = e8.d("measurement.set_default_event_parameters_propagate_clear.service", false);
        e8.b("measurement.id.set_default_event_parameters_propagate_clear.experiment_id", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4973m6
    public final boolean zza() {
        return ((Boolean) f29449a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4973m6
    public final boolean zzb() {
        return ((Boolean) f29450b.f()).booleanValue();
    }
}
