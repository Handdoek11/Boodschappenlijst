package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5020s6 implements InterfaceC5028t6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f29565a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4945j3 f29566b;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.collection.event_safelist", true);
        f29565a = e8.d("measurement.service.store_null_safelist", true);
        f29566b = e8.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5028t6
    public final boolean a() {
        return ((Boolean) f29566b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5028t6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5028t6
    public final boolean zzb() {
        return ((Boolean) f29565a.f()).booleanValue();
    }
}
