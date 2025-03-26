package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class QW extends AbstractBinderC1243Dm {

    /* renamed from: o, reason: collision with root package name */
    private final String f18477o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC1171Bm f18478s;

    /* renamed from: t, reason: collision with root package name */
    private final C1811Tq f18479t;

    /* renamed from: u, reason: collision with root package name */
    private final JSONObject f18480u;

    /* renamed from: v, reason: collision with root package name */
    private final long f18481v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f18482w;

    public QW(String str, InterfaceC1171Bm interfaceC1171Bm, C1811Tq c1811Tq, long j8) {
        JSONObject jSONObject = new JSONObject();
        this.f18480u = jSONObject;
        this.f18482w = false;
        this.f18479t = c1811Tq;
        this.f18477o = str;
        this.f18478s = interfaceC1171Bm;
        this.f18481v = j8;
        try {
            jSONObject.put("adapter_version", interfaceC1171Bm.c().toString());
            jSONObject.put("sdk_version", interfaceC1171Bm.g().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void t7(String str, C1811Tq c1811Tq) {
        synchronized (QW.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", str);
                    jSONObject.put("signal_error", "Adapter failed to instantiate");
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.f23696I1)).booleanValue()) {
                        jSONObject.put("signal_error_code", 1);
                    }
                    c1811Tq.c(jSONObject);
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final synchronized void u7(String str, int i8) {
        try {
            if (this.f18482w) {
                return;
            }
            try {
                this.f18480u.put("signal_error", str);
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23704J1)).booleanValue()) {
                    this.f18480u.put("latency", C2.v.c().b() - this.f18481v);
                }
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23696I1)).booleanValue()) {
                    this.f18480u.put("signal_error_code", i8);
                }
            } catch (JSONException unused) {
            }
            this.f18479t.c(this.f18480u);
            this.f18482w = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1279Em
    public final synchronized void E(String str) {
        u7(str, 2);
    }

    public final synchronized void a() {
        u7("Signal collection timeout.", 3);
    }

    public final synchronized void d() {
        if (this.f18482w) {
            return;
        }
        try {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23696I1)).booleanValue()) {
                this.f18480u.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f18479t.c(this.f18480u);
        this.f18482w = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1279Em
    public final synchronized void j7(D2.W0 w02) {
        u7(w02.f1163s, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1279Em
    public final synchronized void n(String str) {
        if (this.f18482w) {
            return;
        }
        if (str == null) {
            E("Adapter returned null signals");
            return;
        }
        try {
            this.f18480u.put("signals", str);
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23704J1)).booleanValue()) {
                this.f18480u.put("latency", C2.v.c().b() - this.f18481v);
            }
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23696I1)).booleanValue()) {
                this.f18480u.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f18479t.c(this.f18480u);
        this.f18482w = true;
    }
}
