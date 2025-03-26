package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4912f6 implements InterfaceC4921g6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f29296a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4945j3 f29297b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC4945j3 f29298c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC4945j3 f29299d;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        f29296a = e8.d("measurement.consent.stop_reset_on_storage_denied.client", true);
        f29297b = e8.d("measurement.consent.stop_reset_on_storage_denied.service", true);
        f29298c = e8.d("measurement.consent.scrub_audience_data_analytics_consent", true);
        f29299d = e8.d("measurement.consent.fix_first_open_count_from_snapshot", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4921g6
    public final boolean a() {
        return ((Boolean) f29297b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4921g6
    public final boolean b() {
        return ((Boolean) f29299d.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4921g6
    public final boolean d() {
        return ((Boolean) f29298c.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4921g6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4921g6
    public final boolean zzb() {
        return ((Boolean) f29296a.f()).booleanValue();
    }
}
