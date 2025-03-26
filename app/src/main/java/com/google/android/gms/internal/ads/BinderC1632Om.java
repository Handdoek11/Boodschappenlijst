package com.google.android.gms.internal.ads;

import D2.C0555y;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Om, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1632Om extends AbstractBinderC1135Am {

    /* renamed from: o, reason: collision with root package name */
    private final RtbAdapter f17947o;

    /* renamed from: s, reason: collision with root package name */
    private String f17948s = "";

    public BinderC1632Om(RtbAdapter rtbAdapter) {
        this.f17947o = rtbAdapter;
    }

    private final Bundle u7(D2.X1 x12) {
        Bundle bundle;
        Bundle bundle2 = x12.f1172D;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f17947o.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle v7(String str) {
        H2.p.g("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e8) {
            H2.p.e("", e8);
            throw new RemoteException();
        }
    }

    private static final boolean w7(D2.X1 x12) {
        if (x12.f1191w) {
            return true;
        }
        C0555y.b();
        return H2.g.v();
    }

    private static final String x7(String str, D2.X1 x12) {
        String str2 = x12.f1180L;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1171Bm
    public final void G0(String str) {
        this.f17948s = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1171Bm
    public final void H5(String str, String str2, D2.X1 x12, InterfaceC5852a interfaceC5852a, InterfaceC3634om interfaceC3634om, InterfaceC1457Jl interfaceC1457Jl, D2.c2 c2Var) {
        try {
            this.f17947o.loadRtbBannerAd(new J2.h((Context) BinderC5853b.J0(interfaceC5852a), str, v7(str2), u7(x12), w7(x12), x12.f1170B, x12.f1192x, x12.f1179K, x7(str2, x12), w2.z.c(c2Var.f1225v, c2Var.f1222s, c2Var.f1221o), this.f17948s), new C1351Gm(this, interfaceC3634om, interfaceC1457Jl));
        } catch (Throwable th) {
            H2.p.e("Adapter failed to render banner ad.", th);
            AbstractC1134Al.a(interfaceC5852a, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1171Bm
    public final void N1(String str, String str2, D2.X1 x12, InterfaceC5852a interfaceC5852a, InterfaceC4287um interfaceC4287um, InterfaceC1457Jl interfaceC1457Jl) {
        g5(str, str2, x12, interfaceC5852a, interfaceC4287um, interfaceC1457Jl, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1171Bm
    public final void W2(String str, String str2, D2.X1 x12, InterfaceC5852a interfaceC5852a, InterfaceC3960rm interfaceC3960rm, InterfaceC1457Jl interfaceC1457Jl) {
        try {
            this.f17947o.loadRtbInterstitialAd(new J2.k((Context) BinderC5853b.J0(interfaceC5852a), str, v7(str2), u7(x12), w7(x12), x12.f1170B, x12.f1192x, x12.f1179K, x7(str2, x12), this.f17948s), new C1423Im(this, interfaceC3960rm, interfaceC1457Jl));
        } catch (Throwable th) {
            H2.p.e("Adapter failed to render interstitial ad.", th);
            AbstractC1134Al.a(interfaceC5852a, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1171Bm
    public final boolean X(InterfaceC5852a interfaceC5852a) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1171Bm
    public final D2.Y0 b() {
        Object obj = this.f17947o;
        if (obj instanceof J2.s) {
            try {
                return ((J2.s) obj).getVideoController();
            } catch (Throwable th) {
                H2.p.e("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1171Bm
    public final C1667Pm c() {
        this.f17947o.getVersionInfo();
        return C1667Pm.A0(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1171Bm
    public final void c5(String str, String str2, D2.X1 x12, InterfaceC5852a interfaceC5852a, InterfaceC3634om interfaceC3634om, InterfaceC1457Jl interfaceC1457Jl, D2.c2 c2Var) {
        try {
            this.f17947o.loadRtbInterscrollerAd(new J2.h((Context) BinderC5853b.J0(interfaceC5852a), str, v7(str2), u7(x12), w7(x12), x12.f1170B, x12.f1192x, x12.f1179K, x7(str2, x12), w2.z.c(c2Var.f1225v, c2Var.f1222s, c2Var.f1221o), this.f17948s), new C1387Hm(this, interfaceC3634om, interfaceC1457Jl));
        } catch (Throwable th) {
            H2.p.e("Adapter failed to render interscroller ad.", th);
            AbstractC1134Al.a(interfaceC5852a, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1171Bm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e4(i3.InterfaceC5852a r5, java.lang.String r6, android.os.Bundle r7, android.os.Bundle r8, D2.c2 r9, com.google.android.gms.internal.ads.InterfaceC1279Em r10) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.Mm r0 = new com.google.android.gms.internal.ads.Mm     // Catch: java.lang.Throwable -> L71
            r0.<init>(r4, r10)     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r10 = r4.f17947o     // Catch: java.lang.Throwable -> L71
            J2.j r1 = new J2.j     // Catch: java.lang.Throwable -> L71
            int r2 = r6.hashCode()     // Catch: java.lang.Throwable -> L71
            switch(r2) {
                case -1396342996: goto L4d;
                case -1052618729: goto L43;
                case -239580146: goto L39;
                case 604727084: goto L2f;
                case 1167692200: goto L25;
                case 1778294298: goto L1b;
                case 1911491517: goto L11;
                default: goto L10;
            }
        L10:
            goto L57
        L11:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 3
            goto L58
        L1b:
            java.lang.String r2 = "app_open_ad"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 6
            goto L58
        L25:
            java.lang.String r2 = "app_open"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 5
            goto L58
        L2f:
            java.lang.String r2 = "interstitial"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 1
            goto L58
        L39:
            java.lang.String r2 = "rewarded"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 2
            goto L58
        L43:
            java.lang.String r2 = "native"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 4
            goto L58
        L4d:
            java.lang.String r2 = "banner"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 0
            goto L58
        L57:
            r6 = -1
        L58:
            switch(r6) {
                case 0: goto L8a;
                case 1: goto L87;
                case 2: goto L84;
                case 3: goto L81;
                case 4: goto L7e;
                case 5: goto L7b;
                case 6: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L73
        L5c:
            com.google.android.gms.internal.ads.bf r6 = com.google.android.gms.internal.ads.AbstractC3184kf.Jb     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.internal.ads.if r2 = D2.A.c()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r6 = r2.a(r6)     // Catch: java.lang.Throwable -> L71
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L71
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L71
            if (r6 == 0) goto L73
            w2.c r6 = w2.EnumC6877c.APP_OPEN_AD     // Catch: java.lang.Throwable -> L71
            goto L8c
        L71:
            r6 = move-exception
            goto Lb0
        L73:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L71
            java.lang.String r7 = "Internal Error"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L71
            throw r6     // Catch: java.lang.Throwable -> L71
        L7b:
            w2.c r6 = w2.EnumC6877c.APP_OPEN_AD     // Catch: java.lang.Throwable -> L71
            goto L8c
        L7e:
            w2.c r6 = w2.EnumC6877c.NATIVE     // Catch: java.lang.Throwable -> L71
            goto L8c
        L81:
            w2.c r6 = w2.EnumC6877c.REWARDED_INTERSTITIAL     // Catch: java.lang.Throwable -> L71
            goto L8c
        L84:
            w2.c r6 = w2.EnumC6877c.REWARDED     // Catch: java.lang.Throwable -> L71
            goto L8c
        L87:
            w2.c r6 = w2.EnumC6877c.INTERSTITIAL     // Catch: java.lang.Throwable -> L71
            goto L8c
        L8a:
            w2.c r6 = w2.EnumC6877c.BANNER     // Catch: java.lang.Throwable -> L71
        L8c:
            r1.<init>(r6, r8)     // Catch: java.lang.Throwable -> L71
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L71
            r6.<init>()     // Catch: java.lang.Throwable -> L71
            r6.add(r1)     // Catch: java.lang.Throwable -> L71
            L2.a r8 = new L2.a     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = i3.BinderC5853b.J0(r5)     // Catch: java.lang.Throwable -> L71
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> L71
            int r2 = r9.f1225v     // Catch: java.lang.Throwable -> L71
            int r3 = r9.f1222s     // Catch: java.lang.Throwable -> L71
            java.lang.String r9 = r9.f1221o     // Catch: java.lang.Throwable -> L71
            w2.h r9 = w2.z.c(r2, r3, r9)     // Catch: java.lang.Throwable -> L71
            r8.<init>(r1, r6, r7, r9)     // Catch: java.lang.Throwable -> L71
            r10.collectSignals(r8, r0)     // Catch: java.lang.Throwable -> L71
            return
        Lb0:
            java.lang.String r7 = "Error generating signals for RTB"
            H2.p.e(r7, r6)
            java.lang.String r7 = "adapter.collectSignals"
            com.google.android.gms.internal.ads.AbstractC1134Al.a(r5, r6, r7)
            android.os.RemoteException r5 = new android.os.RemoteException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC1632Om.e4(i3.a, java.lang.String, android.os.Bundle, android.os.Bundle, D2.c2, com.google.android.gms.internal.ads.Em):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1171Bm
    public final C1667Pm g() {
        this.f17947o.getSDKVersionInfo();
        return C1667Pm.A0(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1171Bm
    public final boolean g0(InterfaceC5852a interfaceC5852a) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1171Bm
    public final void g5(String str, String str2, D2.X1 x12, InterfaceC5852a interfaceC5852a, InterfaceC4287um interfaceC4287um, InterfaceC1457Jl interfaceC1457Jl, C1553Mg c1553Mg) {
        try {
            this.f17947o.loadRtbNativeAdMapper(new J2.m((Context) BinderC5853b.J0(interfaceC5852a), str, v7(str2), u7(x12), w7(x12), x12.f1170B, x12.f1192x, x12.f1179K, x7(str2, x12), this.f17948s, c1553Mg), new C1458Jm(this, interfaceC4287um, interfaceC1457Jl));
        } catch (Throwable th) {
            H2.p.e("Adapter failed to render native ad.", th);
            AbstractC1134Al.a(interfaceC5852a, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                this.f17947o.loadRtbNativeAd(new J2.m((Context) BinderC5853b.J0(interfaceC5852a), str, v7(str2), u7(x12), w7(x12), x12.f1170B, x12.f1192x, x12.f1179K, x7(str2, x12), this.f17948s, c1553Mg), new C1493Km(this, interfaceC4287um, interfaceC1457Jl));
            } catch (Throwable th2) {
                H2.p.e("Adapter failed to render native ad.", th2);
                AbstractC1134Al.a(interfaceC5852a, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1171Bm
    public final void j6(String str, String str2, D2.X1 x12, InterfaceC5852a interfaceC5852a, InterfaceC4723ym interfaceC4723ym, InterfaceC1457Jl interfaceC1457Jl) {
        try {
            this.f17947o.loadRtbRewardedAd(new J2.o((Context) BinderC5853b.J0(interfaceC5852a), str, v7(str2), u7(x12), w7(x12), x12.f1170B, x12.f1192x, x12.f1179K, x7(str2, x12), this.f17948s), new C1597Nm(this, interfaceC4723ym, interfaceC1457Jl));
        } catch (Throwable th) {
            H2.p.e("Adapter failed to render rewarded ad.", th);
            AbstractC1134Al.a(interfaceC5852a, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1171Bm
    public final void k7(String str, String str2, D2.X1 x12, InterfaceC5852a interfaceC5852a, InterfaceC4723ym interfaceC4723ym, InterfaceC1457Jl interfaceC1457Jl) {
        try {
            this.f17947o.loadRtbRewardedInterstitialAd(new J2.o((Context) BinderC5853b.J0(interfaceC5852a), str, v7(str2), u7(x12), w7(x12), x12.f1170B, x12.f1192x, x12.f1179K, x7(str2, x12), this.f17948s), new C1597Nm(this, interfaceC4723ym, interfaceC1457Jl));
        } catch (Throwable th) {
            H2.p.e("Adapter failed to render rewarded interstitial ad.", th);
            AbstractC1134Al.a(interfaceC5852a, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1171Bm
    public final void o3(String str, String str2, D2.X1 x12, InterfaceC5852a interfaceC5852a, InterfaceC3307lm interfaceC3307lm, InterfaceC1457Jl interfaceC1457Jl) {
        try {
            this.f17947o.loadRtbAppOpenAd(new J2.g((Context) BinderC5853b.J0(interfaceC5852a), str, v7(str2), u7(x12), w7(x12), x12.f1170B, x12.f1192x, x12.f1179K, x7(str2, x12), this.f17948s), new C1528Lm(this, interfaceC3307lm, interfaceC1457Jl));
        } catch (Throwable th) {
            H2.p.e("Adapter failed to render app open ad.", th);
            AbstractC1134Al.a(interfaceC5852a, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1171Bm
    public final boolean u3(InterfaceC5852a interfaceC5852a) {
        return false;
    }
}
