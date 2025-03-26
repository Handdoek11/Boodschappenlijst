package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4886c7 implements Z6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f29244a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4945j3 f29245b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC4945j3 f29246c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC4945j3 f29247d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC4945j3 f29248e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC4945j3 f29249f;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        f29244a = e8.d("measurement.test.boolean_flag", false);
        f29245b = e8.b("measurement.test.cached_long_flag", -1L);
        f29246c = e8.a("measurement.test.double_flag", -3.0d);
        f29247d = e8.b("measurement.test.int_flag", -2L);
        f29248e = e8.b("measurement.test.long_flag", -1L);
        f29249f = e8.c("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.Z6
    public final long a() {
        return ((Long) f29247d.f()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Z6
    public final String b() {
        return (String) f29249f.f();
    }

    @Override // com.google.android.gms.internal.measurement.Z6
    public final boolean c() {
        return ((Boolean) f29244a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.Z6
    public final long d() {
        return ((Long) f29248e.f()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Z6
    public final double zza() {
        return ((Double) f29246c.f()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.Z6
    public final long zzb() {
        return ((Long) f29245b.f()).longValue();
    }
}
