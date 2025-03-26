package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.y6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5068y6 implements InterfaceC5076z6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f29652a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4945j3 f29653b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC4945j3 f29654c;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f29652a = e8.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f29653b = e8.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f29654c = e8.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5076z6
    public final boolean a() {
        return ((Boolean) f29653b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5076z6
    public final boolean d() {
        return ((Boolean) f29654c.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5076z6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5076z6
    public final boolean zzb() {
        return ((Boolean) f29652a.f()).booleanValue();
    }
}
