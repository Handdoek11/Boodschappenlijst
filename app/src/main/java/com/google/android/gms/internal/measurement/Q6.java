package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class Q6 implements R6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f29000a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4945j3 f29001b;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        f29000a = e8.d("measurement.gmscore_feature_tracking", true);
        f29001b = e8.d("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean a() {
        return ((Boolean) f29001b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean zzb() {
        return ((Boolean) f29000a.f()).booleanValue();
    }
}
