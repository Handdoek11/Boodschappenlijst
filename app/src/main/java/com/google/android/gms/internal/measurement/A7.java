package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class A7 implements y7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4945j3 f28798a;

    static {
        C5009r3 e8 = new C5009r3(AbstractC4954k3.a("com.google.android.gms.measurement")).f().e();
        f28798a = e8.d("measurement.currency.escape_underscore_fix", true);
        e8.d("measurement.validation.value_and_currency_params", true);
    }

    @Override // com.google.android.gms.internal.measurement.y7
    public final boolean zza() {
        return ((Boolean) f28798a.f()).booleanValue();
    }
}
