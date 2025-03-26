package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class T5 implements U5 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f29024a;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        f29024a = e8.d("measurement.service.ad_impression.convert_value_to_double", true);
        e8.d("measurement.client.ad_impression", true);
        e8.d("measurement.service.separate_public_internal_event_blacklisting", true);
        e8.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.U5
    public final boolean zza() {
        return ((Boolean) f29024a.f()).booleanValue();
    }
}
