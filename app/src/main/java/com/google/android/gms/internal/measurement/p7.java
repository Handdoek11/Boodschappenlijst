package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class p7 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f29503a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4945j3 f29504b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC4945j3 f29505c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC4945j3 f29506d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC4945j3 f29507e;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        f29503a = e8.d("measurement.sgtm.google_signal.enable", false);
        f29504b = e8.d("measurement.sgtm.preview_mode_enabled", true);
        f29505c = e8.d("measurement.sgtm.rollout_percentage_fix", false);
        f29506d = e8.d("measurement.sgtm.service", true);
        f29507e = e8.d("measurement.sgtm.upload_queue", false);
        e8.b("measurement.id.sgtm", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.q7
    public final boolean a() {
        return ((Boolean) f29504b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q7
    public final boolean b() {
        return ((Boolean) f29506d.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q7
    public final boolean c() {
        return ((Boolean) f29507e.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q7
    public final boolean d() {
        return ((Boolean) f29505c.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q7
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.q7
    public final boolean zzb() {
        return ((Boolean) f29503a.f()).booleanValue();
    }
}
