package M2;

import G2.D0;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC2534eg;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C3533nq;
import com.google.android.gms.internal.ads.InterfaceC2160b90;
import com.google.android.gms.internal.ads.InterfaceC2772gq;
import com.google.android.gms.internal.ads.RunnableC3464n90;
import com.google.android.gms.internal.ads.Yj0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: M2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0671s implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.d f3929a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3533nq f3930b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC2772gq f3931c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC2160b90 f3932d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC0675w f3933e;

    C0671s(BinderC0675w binderC0675w, com.google.common.util.concurrent.d dVar, C3533nq c3533nq, InterfaceC2772gq interfaceC2772gq, InterfaceC2160b90 interfaceC2160b90) {
        this.f3929a = dVar;
        this.f3930b = c3533nq;
        this.f3931c = interfaceC2772gq;
        this.f3932d = interfaceC2160b90;
        this.f3933e = binderC0675w;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.C7)).booleanValue()) {
            C2.v.s().w(th, "SignalGeneratorImpl.generateSignals");
        } else {
            C2.v.s().x(th, "SignalGeneratorImpl.generateSignals");
        }
        RunnableC3464n90 a8 = BinderC0675w.a8(this.f3929a, this.f3930b);
        if (((Boolean) AbstractC2534eg.f21869e.e()).booleanValue() && a8 != null) {
            InterfaceC2160b90 interfaceC2160b90 = this.f3932d;
            interfaceC2160b90.c(th);
            interfaceC2160b90.I0(false);
            a8.a(interfaceC2160b90);
            a8.h();
        }
        if (this.f3931c == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.f3931c.v(message);
        } catch (RemoteException e8) {
            H2.p.e("", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        N n8 = (N) obj;
        RunnableC3464n90 a8 = BinderC0675w.a8(this.f3929a, this.f3930b);
        this.f3933e.f3981S.set(true);
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.x7)).booleanValue()) {
            try {
                InterfaceC2772gq interfaceC2772gq = this.f3931c;
                if (interfaceC2772gq != null) {
                    interfaceC2772gq.v("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e8) {
                H2.p.d("QueryInfo generation has been disabled.".concat(e8.toString()));
            }
            if (!((Boolean) AbstractC2534eg.f21869e.e()).booleanValue() || a8 == null) {
                return;
            }
            InterfaceC2160b90 interfaceC2160b90 = this.f3932d;
            interfaceC2160b90.C("QueryInfo generation has been disabled.");
            interfaceC2160b90.I0(false);
            a8.a(interfaceC2160b90);
            a8.h();
            return;
        }
        try {
            try {
                if (n8 == null) {
                    InterfaceC2772gq interfaceC2772gq2 = this.f3931c;
                    if (interfaceC2772gq2 != null) {
                        interfaceC2772gq2.a2(null, null, null);
                    }
                    this.f3932d.I0(true);
                    if (!((Boolean) AbstractC2534eg.f21869e.e()).booleanValue() || a8 == null) {
                        return;
                    }
                    a8.a(this.f3932d);
                    a8.h();
                    return;
                }
                try {
                    if (TextUtils.isEmpty((!TextUtils.isEmpty(n8.f3803c) ? new JSONObject(n8.f3803c) : new JSONObject(n8.f3802b)).optString("request_id", ""))) {
                        H2.p.g("The request ID is empty in request JSON.");
                        InterfaceC2772gq interfaceC2772gq3 = this.f3931c;
                        if (interfaceC2772gq3 != null) {
                            interfaceC2772gq3.v("Internal error: request ID is empty in request JSON.");
                        }
                        InterfaceC2160b90 interfaceC2160b902 = this.f3932d;
                        interfaceC2160b902.C("Request ID empty");
                        interfaceC2160b902.I0(false);
                        if (!((Boolean) AbstractC2534eg.f21869e.e()).booleanValue() || a8 == null) {
                            return;
                        }
                        a8.a(this.f3932d);
                        a8.h();
                        return;
                    }
                    Bundle bundle = n8.f3806f;
                    BinderC0675w binderC0675w = this.f3933e;
                    if (binderC0675w.f3969G && bundle != null && bundle.getInt(binderC0675w.f3971I, -1) == -1) {
                        BinderC0675w binderC0675w2 = this.f3933e;
                        bundle.putInt(binderC0675w2.f3971I, binderC0675w2.f3972J.get());
                    }
                    BinderC0675w binderC0675w3 = this.f3933e;
                    if (binderC0675w3.f3968F && bundle != null && TextUtils.isEmpty(bundle.getString(binderC0675w3.f3970H))) {
                        if (TextUtils.isEmpty(this.f3933e.f3974L)) {
                            BinderC0675w binderC0675w4 = this.f3933e;
                            D0 t7 = C2.v.t();
                            BinderC0675w binderC0675w5 = this.f3933e;
                            binderC0675w4.f3974L = t7.H(binderC0675w5.f3987s, binderC0675w5.f3973K.f2914o);
                        }
                        BinderC0675w binderC0675w6 = this.f3933e;
                        bundle.putString(binderC0675w6.f3970H, binderC0675w6.f3974L);
                    }
                    if (this.f3931c != null) {
                        if (TextUtils.isEmpty(n8.f3803c)) {
                            this.f3931c.a2(n8.f3801a, n8.f3802b, bundle);
                        } else {
                            this.f3931c.a2(n8.f3801a, n8.f3803c, bundle);
                        }
                    }
                    this.f3932d.I0(true);
                    if (!((Boolean) AbstractC2534eg.f21869e.e()).booleanValue() || a8 == null) {
                        return;
                    }
                    a8.a(this.f3932d);
                    a8.h();
                } catch (JSONException e9) {
                    H2.p.g("Failed to create JSON object from the request string.");
                    InterfaceC2772gq interfaceC2772gq4 = this.f3931c;
                    if (interfaceC2772gq4 != null) {
                        interfaceC2772gq4.v("Internal error for request JSON: " + e9.toString());
                    }
                    InterfaceC2160b90 interfaceC2160b903 = this.f3932d;
                    interfaceC2160b903.c(e9);
                    interfaceC2160b903.I0(false);
                    C2.v.s().x(e9, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) AbstractC2534eg.f21869e.e()).booleanValue() || a8 == null) {
                        return;
                    }
                    a8.a(this.f3932d);
                    a8.h();
                }
            } catch (RemoteException e10) {
                InterfaceC2160b90 interfaceC2160b904 = this.f3932d;
                interfaceC2160b904.c(e10);
                interfaceC2160b904.I0(false);
                H2.p.e("", e10);
                C2.v.s().x(e10, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) AbstractC2534eg.f21869e.e()).booleanValue() || a8 == null) {
                    return;
                }
                a8.a(this.f3932d);
                a8.h();
            }
        } catch (Throwable th) {
            if (((Boolean) AbstractC2534eg.f21869e.e()).booleanValue() && a8 != null) {
                a8.a(this.f3932d);
                a8.h();
            }
            throw th;
        }
    }
}
