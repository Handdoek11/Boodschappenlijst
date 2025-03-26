package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4797zP implements F2.z, InterfaceC3541nu {

    /* renamed from: o, reason: collision with root package name */
    private final Context f28609o;

    /* renamed from: s, reason: collision with root package name */
    private final H2.a f28610s;

    /* renamed from: t, reason: collision with root package name */
    private C3490nP f28611t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceC4410vt f28612u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f28613v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f28614w;

    /* renamed from: x, reason: collision with root package name */
    private long f28615x;

    /* renamed from: y, reason: collision with root package name */
    private D2.H0 f28616y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f28617z;

    C4797zP(Context context, H2.a aVar) {
        this.f28609o = context;
        this.f28610s = aVar;
    }

    private final synchronized boolean g(D2.H0 h02) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.O8)).booleanValue()) {
            H2.p.g("Ad inspector had an internal error.");
            try {
                h02.A5(AbstractC3351m70.d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f28611t == null) {
            H2.p.g("Ad inspector had an internal error.");
            try {
                C2.v.s().x(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                h02.A5(AbstractC3351m70.d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f28613v && !this.f28614w) {
            if (C2.v.c().a() >= this.f28615x + ((Integer) D2.A.c().a(AbstractC3184kf.R8)).intValue()) {
                return true;
            }
        }
        H2.p.g("Ad inspector cannot be opened because it is already open.");
        try {
            h02.A5(AbstractC3351m70.d(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // F2.z
    public final void D0() {
    }

    @Override // F2.z
    public final void I3() {
    }

    @Override // F2.z
    public final synchronized void W4(int i8) {
        this.f28612u.destroy();
        if (!this.f28617z) {
            AbstractC0608p0.k("Inspector closed.");
            D2.H0 h02 = this.f28616y;
            if (h02 != null) {
                try {
                    h02.A5(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f28614w = false;
        this.f28613v = false;
        this.f28615x = 0L;
        this.f28617z = false;
        this.f28616y = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3541nu
    public final synchronized void a(boolean z7, int i8, String str, String str2) {
        if (z7) {
            AbstractC0608p0.k("Ad inspector loaded.");
            this.f28613v = true;
            f("");
            return;
        }
        H2.p.g("Ad inspector failed to load.");
        try {
            C2.v.s().x(new Exception("Failed to load UI. Error code: " + i8 + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            D2.H0 h02 = this.f28616y;
            if (h02 != null) {
                h02.A5(AbstractC3351m70.d(17, null, null));
            }
        } catch (RemoteException e8) {
            C2.v.s().x(e8, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.f28617z = true;
        this.f28612u.destroy();
    }

    public final Activity b() {
        InterfaceC4410vt interfaceC4410vt = this.f28612u;
        if (interfaceC4410vt == null || interfaceC4410vt.f0()) {
            return null;
        }
        return this.f28612u.f();
    }

    public final void c(C3490nP c3490nP) {
        this.f28611t = c3490nP;
    }

    final /* synthetic */ void d(String str) {
        JSONObject f8 = this.f28611t.f();
        if (!TextUtils.isEmpty(str)) {
            try {
                f8.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.f28612u.m("window.inspectorInfo", f8.toString());
    }

    public final synchronized void e(D2.H0 h02, C3192kj c3192kj, C2432dj c2432dj, C1697Qi c1697Qi) {
        if (g(h02)) {
            try {
                C2.v.a();
                InterfaceC4410vt a8 = C1500Kt.a(this.f28609o, C3976ru.a(), "", false, false, null, null, this.f28610s, null, null, null, C2000Zc.a(), null, null, null, null);
                this.f28612u = a8;
                InterfaceC3759pu L7 = a8.L();
                if (L7 == null) {
                    H2.p.g("Failed to obtain a web view for the ad inspector");
                    try {
                        C2.v.s().x(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        h02.A5(AbstractC3351m70.d(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e8) {
                        C2.v.s().x(e8, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.f28616y = h02;
                L7.e1(null, null, null, null, null, false, null, null, null, null, null, null, null, c3192kj, null, new C3083jj(this.f28609o), c2432dj, c1697Qi, null);
                L7.i0(this);
                this.f28612u.loadUrl((String) D2.A.c().a(AbstractC3184kf.P8));
                C2.v.m();
                F2.y.a(this.f28609o, new AdOverlayInfoParcel(this, this.f28612u, 1, this.f28610s), true, null);
                this.f28615x = C2.v.c().a();
            } catch (zzcfj e9) {
                H2.p.h("Failed to obtain a web view for the ad inspector", e9);
                try {
                    C2.v.s().x(e9, "InspectorUi.openInspector 0");
                    h02.A5(AbstractC3351m70.d(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e10) {
                    C2.v.s().x(e10, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void f(final String str) {
        if (this.f28613v && this.f28614w) {
            AbstractC1497Kq.f16649f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.yP
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28109o.d(str);
                }
            });
        }
    }

    @Override // F2.z
    public final void q2() {
    }

    @Override // F2.z
    public final synchronized void r3() {
        this.f28614w = true;
        f("");
    }

    @Override // F2.z
    public final void w0() {
    }
}
