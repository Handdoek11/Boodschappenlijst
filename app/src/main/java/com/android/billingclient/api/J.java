package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.AbstractC5103e1;
import com.google.android.gms.internal.play_billing.y4;
import h2.AbstractC5830d;
import h2.C5829c;
import h2.InterfaceC5834h;
import h2.InterfaceC5835i;

/* loaded from: classes.dex */
final class J {

    /* renamed from: a, reason: collision with root package name */
    private boolean f12324a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC5835i f12325b;

    J(Context context) {
        try {
            j2.u.f(context);
            this.f12325b = j2.u.c().g(com.google.android.datatransport.cct.a.f13041g).a("PLAY_BILLING_LIBRARY", y4.class, C5829c.b("proto"), new InterfaceC5834h() { // from class: E1.z
                @Override // h2.InterfaceC5834h
                public final Object apply(Object obj) {
                    return ((y4) obj).d();
                }
            });
        } catch (Throwable unused) {
            this.f12324a = true;
        }
    }

    public final void a(y4 y4Var) {
        if (this.f12324a) {
            AbstractC5103e1.j("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f12325b.a(AbstractC5830d.f(y4Var));
        } catch (Throwable unused) {
            AbstractC5103e1.j("BillingLogger", "logging failed.");
        }
    }
}
