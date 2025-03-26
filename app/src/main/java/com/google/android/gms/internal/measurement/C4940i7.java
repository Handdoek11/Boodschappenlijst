package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4940i7 implements InterfaceC4913f7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f29343a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4945j3 f29344b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC4945j3 f29345c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC4945j3 f29346d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC4945j3 f29347e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC4945j3 f29348f;

    /* renamed from: g, reason: collision with root package name */
    private static final AbstractC4945j3 f29349g;

    /* renamed from: h, reason: collision with root package name */
    private static final AbstractC4945j3 f29350h;

    /* renamed from: i, reason: collision with root package name */
    private static final AbstractC4945j3 f29351i;

    /* renamed from: j, reason: collision with root package name */
    private static final AbstractC4945j3 f29352j;

    /* renamed from: k, reason: collision with root package name */
    private static final AbstractC4945j3 f29353k;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        f29343a = e8.d("measurement.rb.attribution.ad_campaign_info", false);
        f29344b = e8.d("measurement.rb.attribution.client.bundle_on_backgrounded", true);
        f29345c = e8.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f29346d = e8.d("measurement.rb.attribution.client2", true);
        e8.d("measurement.rb.attribution.dma_fix", true);
        f29347e = e8.d("measurement.rb.attribution.followup1.service", false);
        e8.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f29348f = e8.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f29349g = e8.d("measurement.rb.attribution.retry_disposition", false);
        f29350h = e8.d("measurement.rb.attribution.service", true);
        f29351i = e8.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f29352j = e8.d("measurement.rb.attribution.uuid_generation", true);
        e8.b("measurement.id.rb.attribution.retry_disposition", 0L);
        f29353k = e8.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4913f7
    public final boolean a() {
        return ((Boolean) f29344b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4913f7
    public final boolean b() {
        return ((Boolean) f29346d.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4913f7
    public final boolean c() {
        return ((Boolean) f29347e.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4913f7
    public final boolean d() {
        return ((Boolean) f29345c.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4913f7
    public final boolean e() {
        return ((Boolean) f29349g.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4913f7
    public final boolean f() {
        return ((Boolean) f29350h.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4913f7
    public final boolean g() {
        return ((Boolean) f29348f.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4913f7
    public final boolean h() {
        return ((Boolean) f29351i.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4913f7
    public final boolean i() {
        return ((Boolean) f29352j.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4913f7
    public final boolean j() {
        return ((Boolean) f29353k.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4913f7
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4913f7
    public final boolean zzb() {
        return ((Boolean) f29343a.f()).booleanValue();
    }
}
