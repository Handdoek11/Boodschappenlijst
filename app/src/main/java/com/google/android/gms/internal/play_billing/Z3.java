package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class Z3 implements O2 {

    /* renamed from: a, reason: collision with root package name */
    static final O2 f29858a = new Z3();

    private Z3() {
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final boolean m(int i8) {
        return (i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? null : EnumC5082a4.ALTERNATIVE_BILLING_ACTION : EnumC5082a4.LOCAL_PURCHASES_UPDATED_ACTION : EnumC5082a4.PURCHASES_UPDATED_ACTION : EnumC5082a4.BROADCAST_ACTION_UNSPECIFIED) != null;
    }
}
