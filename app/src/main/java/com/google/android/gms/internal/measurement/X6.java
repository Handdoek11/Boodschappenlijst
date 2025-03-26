package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class X6 implements Y6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f29053a;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        e8.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f29053a = e8.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        e8.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.Y6
    public final boolean zza() {
        return ((Boolean) f29053a.f()).booleanValue();
    }
}
