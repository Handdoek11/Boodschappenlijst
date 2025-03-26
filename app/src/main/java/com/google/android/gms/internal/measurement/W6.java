package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class W6 implements T6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f29048a;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        f29048a = e8.d("measurement.gmscore_network_migration", false);
        e8.b("measurement.id.gmscore_network_migration", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.T6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.T6
    public final boolean zzb() {
        return ((Boolean) f29048a.f()).booleanValue();
    }
}
