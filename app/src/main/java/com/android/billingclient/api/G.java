package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC5132j0;
import com.google.android.gms.internal.play_billing.E4;
import com.google.android.gms.internal.play_billing.EnumC5082a4;
import com.google.android.gms.internal.play_billing.I4;
import com.google.android.gms.internal.play_billing.L3;
import com.google.android.gms.internal.play_billing.Q3;
import com.google.android.gms.internal.play_billing.Y3;

/* loaded from: classes.dex */
interface G {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12288a = 0;

    static {
        AbstractC5132j0.d("com.android.vending.billing.PURCHASES_UPDATED", EnumC5082a4.PURCHASES_UPDATED_ACTION, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", EnumC5082a4.LOCAL_PURCHASES_UPDATED_ACTION, "com.android.vending.billing.ALTERNATIVE_BILLING", EnumC5082a4.ALTERNATIVE_BILLING_ACTION);
    }

    void a(Y3 y32);

    void b(I4 i42);

    void c(E4 e42);

    void d(L3 l32);

    void e(L3 l32, int i8);

    void f(Q3 q32, int i8);

    void g(Q3 q32);
}
