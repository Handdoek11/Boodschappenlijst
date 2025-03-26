package com.google.android.gms.internal.ads;

import D2.C0555y;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import j$.util.Objects;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import w2.C6882h;

/* renamed from: com.google.android.gms.internal.ads.em, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2546em extends AbstractBinderC1314Fl {

    /* renamed from: o, reason: collision with root package name */
    private final Object f21877o;

    /* renamed from: s, reason: collision with root package name */
    private C2655fm f21878s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC1879Vo f21879t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceC5852a f21880u;

    /* renamed from: v, reason: collision with root package name */
    private View f21881v;

    /* renamed from: w, reason: collision with root package name */
    private J2.r f21882w;

    /* renamed from: x, reason: collision with root package name */
    private final String f21883x = "";

    public BinderC2546em(J2.a aVar) {
        this.f21877o = aVar;
    }

    private final Bundle t7(D2.X1 x12) {
        Bundle bundle;
        Bundle bundle2 = x12.f1172D;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f21877o.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle u7(String str, D2.X1 x12, String str2) {
        H2.p.b("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f21877o instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (x12 != null) {
                    bundle.putInt("tagForChildDirectedTreatment", x12.f1192x);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            H2.p.e("", th);
            throw new RemoteException();
        }
    }

    private static final boolean v7(D2.X1 x12) {
        if (x12.f1191w) {
            return true;
        }
        C0555y.b();
        return H2.g.v();
    }

    private static final String w7(String str, D2.X1 x12) {
        String str2 = x12.f1180L;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E1(i3.InterfaceC5852a r6, com.google.android.gms.internal.ads.InterfaceC1594Nj r7, java.util.List r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f21877o
            boolean r0 = r0 instanceof J2.a
            if (r0 == 0) goto Lb8
            com.google.android.gms.internal.ads.Wl r0 = new com.google.android.gms.internal.ads.Wl
            r0.<init>(r5, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r8.iterator()
        L14:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Laa
            java.lang.Object r1 = r8.next()
            com.google.android.gms.internal.ads.Tj r1 = (com.google.android.gms.internal.ads.C1804Tj) r1
            java.lang.String r2 = r1.f19167o
            int r3 = r2.hashCode()
            switch(r3) {
                case -1396342996: goto L66;
                case -1052618729: goto L5c;
                case -239580146: goto L52;
                case 604727084: goto L48;
                case 1167692200: goto L3e;
                case 1778294298: goto L34;
                case 1911491517: goto L2a;
                default: goto L29;
            }
        L29:
            goto L70
        L2a:
            java.lang.String r3 = "rewarded_interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 3
            goto L71
        L34:
            java.lang.String r3 = "app_open_ad"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 6
            goto L71
        L3e:
            java.lang.String r3 = "app_open"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 5
            goto L71
        L48:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 1
            goto L71
        L52:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 2
            goto L71
        L5c:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 4
            goto L71
        L66:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 0
            goto L71
        L70:
            r2 = -1
        L71:
            r3 = 0
            switch(r2) {
                case 0: goto L9a;
                case 1: goto L97;
                case 2: goto L94;
                case 3: goto L91;
                case 4: goto L8e;
                case 5: goto L8b;
                case 6: goto L76;
                default: goto L75;
            }
        L75:
            goto L9c
        L76:
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.AbstractC3184kf.Jb
            com.google.android.gms.internal.ads.if r4 = D2.A.c()
            java.lang.Object r2 = r4.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L9c
            w2.c r3 = w2.EnumC6877c.APP_OPEN_AD
            goto L9c
        L8b:
            w2.c r3 = w2.EnumC6877c.APP_OPEN_AD
            goto L9c
        L8e:
            w2.c r3 = w2.EnumC6877c.NATIVE
            goto L9c
        L91:
            w2.c r3 = w2.EnumC6877c.REWARDED_INTERSTITIAL
            goto L9c
        L94:
            w2.c r3 = w2.EnumC6877c.REWARDED
            goto L9c
        L97:
            w2.c r3 = w2.EnumC6877c.INTERSTITIAL
            goto L9c
        L9a:
            w2.c r3 = w2.EnumC6877c.BANNER
        L9c:
            if (r3 == 0) goto L14
            J2.j r2 = new J2.j
            android.os.Bundle r1 = r1.f19168s
            r2.<init>(r3, r1)
            r7.add(r2)
            goto L14
        Laa:
            java.lang.Object r8 = r5.f21877o
            J2.a r8 = (J2.a) r8
            java.lang.Object r6 = i3.BinderC5853b.J0(r6)
            android.content.Context r6 = (android.content.Context) r6
            r8.initialize(r6, r0, r7)
            return
        Lb8:
            android.os.RemoteException r6 = new android.os.RemoteException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC2546em.E1(i3.a, com.google.android.gms.internal.ads.Nj, java.util.List):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void F() {
        Object obj = this.f21877o;
        if (obj instanceof MediationInterstitialAdapter) {
            H2.p.b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f21877o).showInterstitial();
                return;
            } catch (Throwable th) {
                H2.p.e("", th);
                throw new RemoteException();
            }
        }
        H2.p.g(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final C1631Ol H() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void I2(InterfaceC5852a interfaceC5852a, D2.c2 c2Var, D2.X1 x12, String str, String str2, InterfaceC1457Jl interfaceC1457Jl) {
        Object obj = this.f21877o;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof J2.a)) {
            H2.p.g(MediationBannerAdapter.class.getCanonicalName() + " or " + J2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        H2.p.b("Requesting banner ad from adapter.");
        C6882h d8 = c2Var.f1219E ? w2.z.d(c2Var.f1225v, c2Var.f1222s) : w2.z.c(c2Var.f1225v, c2Var.f1222s, c2Var.f1221o);
        Object obj2 = this.f21877o;
        if (!(obj2 instanceof MediationBannerAdapter)) {
            if (obj2 instanceof J2.a) {
                try {
                    ((J2.a) obj2).loadBannerAd(new J2.h((Context) BinderC5853b.J0(interfaceC5852a), "", u7(str, x12, str2), t7(x12), v7(x12), x12.f1170B, x12.f1192x, x12.f1179K, w7(str, x12), d8, this.f21883x), new C1946Xl(this, interfaceC1457Jl));
                    return;
                } catch (Throwable th) {
                    H2.p.e("", th);
                    AbstractC1134Al.a(interfaceC5852a, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
            List list = x12.f1190v;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j8 = x12.f1187s;
            C1841Ul c1841Ul = new C1841Ul(j8 == -1 ? null : new Date(j8), x12.f1189u, hashSet, x12.f1170B, v7(x12), x12.f1192x, x12.f1177I, x12.f1179K, w7(str, x12));
            Bundle bundle = x12.f1172D;
            mediationBannerAdapter.requestBannerAd((Context) BinderC5853b.J0(interfaceC5852a), new C2655fm(interfaceC1457Jl), u7(str, x12, str2), d8, c1841Ul, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            H2.p.e("", th2);
            AbstractC1134Al.a(interfaceC5852a, th2, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final boolean J() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final boolean L() {
        Object obj = this.f21877o;
        if ((obj instanceof J2.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f21879t != null;
        }
        Object obj2 = this.f21877o;
        H2.p.g(J2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void M() {
        Object obj = this.f21877o;
        if (obj instanceof J2.f) {
            try {
                ((J2.f) obj).onResume();
            } catch (Throwable th) {
                H2.p.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void O() {
        Object obj = this.f21877o;
        if (obj instanceof J2.a) {
            H2.p.d("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        H2.p.g(J2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void Q2(InterfaceC5852a interfaceC5852a) {
        Object obj = this.f21877o;
        if ((obj instanceof J2.a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                F();
                return;
            } else {
                H2.p.b("Show interstitial ad from adapter.");
                H2.p.d("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        H2.p.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + J2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void W0(InterfaceC5852a interfaceC5852a, InterfaceC1879Vo interfaceC1879Vo, List list) {
        H2.p.g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void Y3(InterfaceC5852a interfaceC5852a, D2.X1 x12, String str, String str2, InterfaceC1457Jl interfaceC1457Jl) {
        Object obj = this.f21877o;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof J2.a)) {
            H2.p.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + J2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        H2.p.b("Requesting interstitial ad from adapter.");
        Object obj2 = this.f21877o;
        if (!(obj2 instanceof MediationInterstitialAdapter)) {
            if (obj2 instanceof J2.a) {
                try {
                    ((J2.a) obj2).loadInterstitialAd(new J2.k((Context) BinderC5853b.J0(interfaceC5852a), "", u7(str, x12, str2), t7(x12), v7(x12), x12.f1170B, x12.f1192x, x12.f1179K, w7(str, x12), this.f21883x), new C2016Zl(this, interfaceC1457Jl));
                    return;
                } catch (Throwable th) {
                    H2.p.e("", th);
                    AbstractC1134Al.a(interfaceC5852a, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
            List list = x12.f1190v;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j8 = x12.f1187s;
            C1841Ul c1841Ul = new C1841Ul(j8 == -1 ? null : new Date(j8), x12.f1189u, hashSet, x12.f1170B, v7(x12), x12.f1192x, x12.f1177I, x12.f1179K, w7(str, x12));
            Bundle bundle = x12.f1172D;
            mediationInterstitialAdapter.requestInterstitialAd((Context) BinderC5853b.J0(interfaceC5852a), new C2655fm(interfaceC1457Jl), u7(str, x12, str2), c1841Ul, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            H2.p.e("", th2);
            AbstractC1134Al.a(interfaceC5852a, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final Bundle b() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void b5(D2.X1 x12, String str) {
        w2(x12, str, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final Bundle c() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final C1666Pl d0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void d1(InterfaceC5852a interfaceC5852a) {
        Object obj = this.f21877o;
        if (obj instanceof J2.a) {
            H2.p.b("Show app open ad from adapter.");
            H2.p.d("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        H2.p.g(J2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void d2(InterfaceC5852a interfaceC5852a, D2.c2 c2Var, D2.X1 x12, String str, InterfaceC1457Jl interfaceC1457Jl) {
        I2(interfaceC5852a, c2Var, x12, str, null, interfaceC1457Jl);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final D2.Y0 e() {
        Object obj = this.f21877o;
        if (obj instanceof J2.s) {
            try {
                return ((J2.s) obj).getVideoController();
            } catch (Throwable th) {
                H2.p.e("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void e2(InterfaceC5852a interfaceC5852a, D2.X1 x12, String str, InterfaceC1457Jl interfaceC1457Jl) {
        Object obj = this.f21877o;
        if (!(obj instanceof J2.a)) {
            H2.p.g(J2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        H2.p.b("Requesting app open ad from adapter.");
        try {
            ((J2.a) this.f21877o).loadAppOpenAd(new J2.g((Context) BinderC5853b.J0(interfaceC5852a), "", u7(str, x12, null), t7(x12), v7(x12), x12.f1170B, x12.f1192x, x12.f1179K, w7(str, x12), ""), new C2438dm(this, interfaceC1457Jl));
        } catch (Exception e8) {
            H2.p.e("", e8);
            AbstractC1134Al.a(interfaceC5852a, e8, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void e7(InterfaceC5852a interfaceC5852a, D2.X1 x12, String str, InterfaceC1457Jl interfaceC1457Jl) {
        Object obj = this.f21877o;
        if (obj instanceof J2.a) {
            H2.p.b("Requesting rewarded interstitial ad from adapter.");
            try {
                ((J2.a) this.f21877o).loadRewardedInterstitialAd(new J2.o((Context) BinderC5853b.J0(interfaceC5852a), "", u7(str, x12, null), t7(x12), v7(x12), x12.f1170B, x12.f1192x, x12.f1179K, w7(str, x12), ""), new C2329cm(this, interfaceC1457Jl));
                return;
            } catch (Exception e8) {
                AbstractC1134Al.a(interfaceC5852a, e8, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        H2.p.g(J2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final InterfaceC3842qh f() {
        C2655fm c2655fm = this.f21878s;
        if (c2655fm == null) {
            return null;
        }
        C3950rh u7 = c2655fm.u();
        if (u7 instanceof C3950rh) {
            return u7.a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final Bundle g() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final InterfaceC1561Ml h() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void h5(InterfaceC5852a interfaceC5852a, D2.c2 c2Var, D2.X1 x12, String str, String str2, InterfaceC1457Jl interfaceC1457Jl) {
        Object obj = this.f21877o;
        if (!(obj instanceof J2.a)) {
            H2.p.g(J2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        H2.p.b("Requesting interscroller ad from adapter.");
        try {
            J2.a aVar = (J2.a) this.f21877o;
            aVar.loadInterscrollerAd(new J2.h((Context) BinderC5853b.J0(interfaceC5852a), "", u7(str, x12, str2), t7(x12), v7(x12), x12.f1170B, x12.f1192x, x12.f1179K, w7(str, x12), w2.z.e(c2Var.f1225v, c2Var.f1222s), ""), new C1876Vl(this, interfaceC1457Jl, aVar));
        } catch (Exception e8) {
            H2.p.e("", e8);
            AbstractC1134Al.a(interfaceC5852a, e8, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final InterfaceC1771Sl i() {
        J2.r rVar;
        J2.r t7;
        Object obj = this.f21877o;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof J2.a) || (rVar = this.f21882w) == null) {
                return null;
            }
            return new BinderC2981im(rVar);
        }
        C2655fm c2655fm = this.f21878s;
        if (c2655fm == null || (t7 = c2655fm.t()) == null) {
            return null;
        }
        return new BinderC2981im(t7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final C1667Pm j() {
        Object obj = this.f21877o;
        if (!(obj instanceof J2.a)) {
            return null;
        }
        ((J2.a) obj).getVersionInfo();
        return C1667Pm.A0(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final C1667Pm k() {
        Object obj = this.f21877o;
        if (!(obj instanceof J2.a)) {
            return null;
        }
        ((J2.a) obj).getSDKVersionInfo();
        return C1667Pm.A0(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void k6(InterfaceC5852a interfaceC5852a, D2.X1 x12, String str, InterfaceC1879Vo interfaceC1879Vo, String str2) {
        Object obj = this.f21877o;
        if ((obj instanceof J2.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f21880u = interfaceC5852a;
            this.f21879t = interfaceC1879Vo;
            interfaceC1879Vo.R2(BinderC5853b.p2(this.f21877o));
            return;
        }
        Object obj2 = this.f21877o;
        H2.p.g(J2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final InterfaceC5852a l() {
        Object obj = this.f21877o;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return BinderC5853b.p2(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                H2.p.e("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof J2.a) {
            return BinderC5853b.p2(this.f21881v);
        }
        H2.p.g(MediationBannerAdapter.class.getCanonicalName() + " or " + J2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void m2(InterfaceC5852a interfaceC5852a, D2.X1 x12, String str, InterfaceC1457Jl interfaceC1457Jl) {
        Object obj = this.f21877o;
        if (!(obj instanceof J2.a)) {
            H2.p.g(J2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        H2.p.b("Requesting rewarded ad from adapter.");
        try {
            ((J2.a) this.f21877o).loadRewardedAd(new J2.o((Context) BinderC5853b.J0(interfaceC5852a), "", u7(str, x12, null), t7(x12), v7(x12), x12.f1170B, x12.f1192x, x12.f1179K, w7(str, x12), ""), new C2329cm(this, interfaceC1457Jl));
        } catch (Exception e8) {
            H2.p.e("", e8);
            AbstractC1134Al.a(interfaceC5852a, e8, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void m4(InterfaceC5852a interfaceC5852a) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void n5(InterfaceC5852a interfaceC5852a, D2.X1 x12, String str, InterfaceC1457Jl interfaceC1457Jl) {
        Y3(interfaceC5852a, x12, str, null, interfaceC1457Jl);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void o() {
        Object obj = this.f21877o;
        if (obj instanceof J2.f) {
            try {
                ((J2.f) obj).onDestroy();
            } catch (Throwable th) {
                H2.p.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void q0() {
        Object obj = this.f21877o;
        if (obj instanceof J2.f) {
            try {
                ((J2.f) obj).onPause();
            } catch (Throwable th) {
                H2.p.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void r5(InterfaceC5852a interfaceC5852a) {
        Object obj = this.f21877o;
        if (obj instanceof J2.a) {
            H2.p.b("Show rewarded ad from adapter.");
            H2.p.d("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        H2.p.g(J2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void w2(D2.X1 x12, String str, String str2) {
        Object obj = this.f21877o;
        if (obj instanceof J2.a) {
            m2(this.f21880u, x12, str, new BinderC2764gm((J2.a) obj, this.f21879t));
            return;
        }
        H2.p.g(J2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void x2(InterfaceC5852a interfaceC5852a, D2.X1 x12, String str, String str2, InterfaceC1457Jl interfaceC1457Jl, C1553Mg c1553Mg, List list) {
        Object obj = this.f21877o;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof J2.a)) {
            H2.p.g(MediationNativeAdapter.class.getCanonicalName() + " or " + J2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        H2.p.b("Requesting native ad from adapter.");
        Object obj2 = this.f21877o;
        if (obj2 instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                List list2 = x12.f1190v;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j8 = x12.f1187s;
                C2873hm c2873hm = new C2873hm(j8 == -1 ? null : new Date(j8), x12.f1189u, hashSet, x12.f1170B, v7(x12), x12.f1192x, c1553Mg, list, x12.f1177I, x12.f1179K, w7(str, x12));
                Bundle bundle = x12.f1172D;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f21878s = new C2655fm(interfaceC1457Jl);
                mediationNativeAdapter.requestNativeAd((Context) BinderC5853b.J0(interfaceC5852a), this.f21878s, u7(str, x12, str2), c2873hm, bundle2);
                return;
            } catch (Throwable th) {
                H2.p.e("", th);
                AbstractC1134Al.a(interfaceC5852a, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (obj2 instanceof J2.a) {
            try {
                ((J2.a) obj2).loadNativeAdMapper(new J2.m((Context) BinderC5853b.J0(interfaceC5852a), "", u7(str, x12, str2), t7(x12), v7(x12), x12.f1170B, x12.f1192x, x12.f1179K, w7(str, x12), this.f21883x, c1553Mg), new C2221bm(this, interfaceC1457Jl));
            } catch (Throwable th2) {
                H2.p.e("", th2);
                AbstractC1134Al.a(interfaceC5852a, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    ((J2.a) this.f21877o).loadNativeAd(new J2.m((Context) BinderC5853b.J0(interfaceC5852a), "", u7(str, x12, str2), t7(x12), v7(x12), x12.f1170B, x12.f1192x, x12.f1179K, w7(str, x12), this.f21883x, c1553Mg), new C2112am(this, interfaceC1457Jl));
                } catch (Throwable th3) {
                    H2.p.e("", th3);
                    AbstractC1134Al.a(interfaceC5852a, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void y0(boolean z7) {
        Object obj = this.f21877o;
        if (obj instanceof J2.q) {
            try {
                ((J2.q) obj).onImmersiveModeUpdated(z7);
                return;
            } catch (Throwable th) {
                H2.p.e("", th);
                return;
            }
        }
        H2.p.b(J2.q.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    public BinderC2546em(J2.f fVar) {
        this.f21877o = fVar;
    }
}
