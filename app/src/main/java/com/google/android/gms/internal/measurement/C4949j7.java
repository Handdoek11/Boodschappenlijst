package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4949j7 implements k7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f29378a;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        e8.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f29378a = e8.d("measurement.session_stitching_token_enabled", false);
        e8.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.k7
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.k7
    public final boolean zzb() {
        return ((Boolean) f29378a.f()).booleanValue();
    }
}
