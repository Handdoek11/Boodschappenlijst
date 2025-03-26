package com.android.billingclient.api;

import E1.InterfaceC0563c;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.AbstractBinderC5101e;
import com.google.android.gms.internal.play_billing.AbstractC5103e1;
import com.google.android.gms.internal.play_billing.I4;
import com.google.android.gms.internal.play_billing.J3;
import com.google.android.gms.internal.play_billing.L3;
import com.google.android.gms.internal.play_billing.R3;
import com.google.android.gms.internal.play_billing.V3;
import com.google.android.gms.internal.play_billing.Y3;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ServiceConnectionC1070s implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0563c f12475a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1054b f12476b;

    /* synthetic */ ServiceConnectionC1070s(C1054b c1054b, InterfaceC0563c interfaceC0563c, E1.p pVar) {
        this.f12476b = c1054b;
        this.f12475a = interfaceC0563c;
    }

    private final void c(C1057e c1057e) {
        synchronized (this.f12476b.f12388a) {
            try {
                if (this.f12476b.f12389b == 3) {
                    return;
                }
                this.f12475a.a(c1057e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ java.lang.Object a() {
        /*
            Method dump skipped, instructions count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ServiceConnectionC1070s.a():java.lang.Object");
    }

    final /* synthetic */ void b() {
        this.f12476b.Q(0);
        C1057e c1057e = H.f12309n;
        this.f12476b.t0(24, 6, c1057e);
        c(c1057e);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        AbstractC5103e1.j("BillingClient", "Billing service died.");
        try {
            if (C1054b.j0(this.f12476b)) {
                G g8 = this.f12476b.f12394g;
                J3 E7 = L3.E();
                E7.v(6);
                R3 G7 = V3.G();
                G7.x(122);
                E7.u(G7);
                g8.d((L3) E7.p());
            } else {
                this.f12476b.f12394g.a(Y3.A());
            }
        } catch (Throwable th) {
            AbstractC5103e1.k("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f12476b.f12388a) {
            if (this.f12476b.f12389b != 3 && this.f12476b.f12389b != 0) {
                this.f12476b.Q(0);
                this.f12476b.R();
                this.f12475a.b();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC5103e1.i("BillingClient", "Billing service connected.");
        synchronized (this.f12476b.f12388a) {
            try {
                if (this.f12476b.f12389b == 3) {
                    return;
                }
                this.f12476b.f12395h = AbstractBinderC5101e.D0(iBinder);
                C1054b c1054b = this.f12476b;
                if (C1054b.m(new Callable() { // from class: com.android.billingclient.api.q
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        this.f12473o.a();
                        return null;
                    }
                }, 30000L, new Runnable() { // from class: com.android.billingclient.api.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f12474o.b();
                    }
                }, c1054b.o0(), c1054b.K()) == null) {
                    C1054b c1054b2 = this.f12476b;
                    C1057e I7 = c1054b2.I();
                    c1054b2.t0(25, 6, I7);
                    c(I7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC5103e1.j("BillingClient", "Billing service disconnected.");
        try {
            if (C1054b.j0(this.f12476b)) {
                G g8 = this.f12476b.f12394g;
                J3 E7 = L3.E();
                E7.v(6);
                R3 G7 = V3.G();
                G7.x(121);
                E7.u(G7);
                g8.d((L3) E7.p());
            } else {
                this.f12476b.f12394g.b(I4.A());
            }
        } catch (Throwable th) {
            AbstractC5103e1.k("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f12476b.f12388a) {
            try {
                if (this.f12476b.f12389b == 3) {
                    return;
                }
                this.f12476b.Q(0);
                this.f12475a.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
