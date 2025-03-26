package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class o7 implements l7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f29492a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4945j3 f29493b;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.client.sessions.background_sessions_enabled", true);
        f29492a = e8.d("measurement.client.sessions.enable_fix_background_engagement", false);
        e8.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f29493b = e8.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        e8.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        e8.d("measurement.client.sessions.session_id_enabled", true);
        e8.b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.l7
    public final boolean zza() {
        return ((Boolean) f29492a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.l7
    public final boolean zzb() {
        return ((Boolean) f29493b.f()).booleanValue();
    }
}
