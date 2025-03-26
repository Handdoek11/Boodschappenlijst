package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.k6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4957k6 implements InterfaceC4930h6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f29387a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4945j3 f29388b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC4945j3 f29389c;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        f29387a = e8.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        f29388b = e8.d("measurement.defensively_copy_bundles_validate_default_params", true);
        f29389c = e8.d("measurement.set_default_event_parameters_with_backfill.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4930h6
    public final boolean a() {
        return ((Boolean) f29388b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4930h6
    public final boolean d() {
        return ((Boolean) f29389c.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4930h6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4930h6
    public final boolean zzb() {
        return ((Boolean) f29387a.f()).booleanValue();
    }
}
