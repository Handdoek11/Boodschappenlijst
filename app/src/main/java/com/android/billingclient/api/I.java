package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.AbstractC5103e1;
import com.google.android.gms.internal.play_billing.C5112f4;
import com.google.android.gms.internal.play_billing.C5124h4;
import com.google.android.gms.internal.play_billing.E4;
import com.google.android.gms.internal.play_billing.I4;
import com.google.android.gms.internal.play_billing.L3;
import com.google.android.gms.internal.play_billing.Q3;
import com.google.android.gms.internal.play_billing.Y3;
import com.google.android.gms.internal.play_billing.w4;
import com.google.android.gms.internal.play_billing.y4;

/* loaded from: classes.dex */
final class I implements G {

    /* renamed from: b, reason: collision with root package name */
    private C5124h4 f12322b;

    /* renamed from: c, reason: collision with root package name */
    private final J f12323c;

    I(Context context, C5124h4 c5124h4) {
        this.f12323c = new J(context);
        this.f12322b = c5124h4;
    }

    @Override // com.android.billingclient.api.G
    public final void a(Y3 y32) {
        try {
            w4 I7 = y4.I();
            I7.x(this.f12322b);
            I7.w(y32);
            this.f12323c.a((y4) I7.p());
        } catch (Throwable th) {
            AbstractC5103e1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.G
    public final void b(I4 i42) {
        if (i42 == null) {
            return;
        }
        try {
            w4 I7 = y4.I();
            I7.x(this.f12322b);
            I7.z(i42);
            this.f12323c.a((y4) I7.p());
        } catch (Throwable th) {
            AbstractC5103e1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.G
    public final void c(E4 e42) {
        try {
            J j8 = this.f12323c;
            w4 I7 = y4.I();
            I7.x(this.f12322b);
            I7.y(e42);
            j8.a((y4) I7.p());
        } catch (Throwable th) {
            AbstractC5103e1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.G
    public final void d(L3 l32) {
        if (l32 == null) {
            return;
        }
        try {
            w4 I7 = y4.I();
            I7.x(this.f12322b);
            I7.u(l32);
            this.f12323c.a((y4) I7.p());
        } catch (Throwable th) {
            AbstractC5103e1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.G
    public final void e(L3 l32, int i8) {
        try {
            C5112f4 c5112f4 = (C5112f4) this.f12322b.n();
            c5112f4.u(i8);
            this.f12322b = (C5124h4) c5112f4.p();
            d(l32);
        } catch (Throwable th) {
            AbstractC5103e1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.G
    public final void f(Q3 q32, int i8) {
        try {
            C5112f4 c5112f4 = (C5112f4) this.f12322b.n();
            c5112f4.u(i8);
            this.f12322b = (C5124h4) c5112f4.p();
            g(q32);
        } catch (Throwable th) {
            AbstractC5103e1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.G
    public final void g(Q3 q32) {
        if (q32 == null) {
            return;
        }
        try {
            w4 I7 = y4.I();
            I7.x(this.f12322b);
            I7.v(q32);
            this.f12323c.a((y4) I7.p());
        } catch (Throwable th) {
            AbstractC5103e1.k("BillingLogger", "Unable to log.", th);
        }
    }
}
