package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.vM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4358vM {

    /* renamed from: a, reason: collision with root package name */
    private final C2808h70 f27249a;

    /* renamed from: b, reason: collision with root package name */
    private final C4031sM f27250b;

    C4358vM(C2808h70 c2808h70, C4031sM c4031sM) {
        this.f27249a = c2808h70;
        this.f27250b = c4031sM;
    }

    final InterfaceC1242Dl a() {
        InterfaceC1242Dl b8 = this.f27249a.b();
        if (b8 != null) {
            return b8;
        }
        H2.p.g("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final InterfaceC1171Bm b(String str) {
        InterfaceC1171Bm C7 = a().C(str);
        this.f27250b.d(str, C7);
        return C7;
    }

    public final C3024j70 c(String str, JSONObject jSONObject) {
        InterfaceC1350Gl v7;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                v7 = new BinderC2546em(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                v7 = new BinderC2546em(new zzbrw());
            } else {
                InterfaceC1242Dl a8 = a();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        v7 = a8.n(string) ? a8.v("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : a8.Z(string) ? a8.v(string) : a8.v("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e8) {
                        H2.p.e("Invalid custom event.", e8);
                    }
                } else {
                    v7 = a8.v(str);
                }
            }
            C3024j70 c3024j70 = new C3024j70(v7);
            this.f27250b.c(str, c3024j70);
            return c3024j70;
        } catch (Throwable th) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.l9)).booleanValue()) {
                this.f27250b.c(str, null);
            }
            throw new zzfcq(th);
        }
    }

    public final boolean d() {
        return this.f27249a.b() != null;
    }
}
