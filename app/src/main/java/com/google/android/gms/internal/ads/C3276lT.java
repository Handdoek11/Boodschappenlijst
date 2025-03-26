package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.lT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3276lT implements InterfaceC3385mT {
    static /* synthetic */ C3929rT l(String str, String str2, String str3, EnumC3494nT enumC3494nT, String str4, WebView webView, String str5, String str6, EnumC3603oT enumC3603oT) {
        C3286lb0 a8 = C3286lb0.a("Google", str2);
        EnumC3177kb0 p8 = p("javascript");
        EnumC2308cb0 n8 = n(enumC3494nT.toString());
        EnumC3177kb0 enumC3177kb0 = EnumC3177kb0.NONE;
        if (p8 == enumC3177kb0) {
            H2.p.g("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (n8 == null) {
            H2.p.g("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(enumC3494nT)));
            return null;
        }
        EnumC3177kb0 p9 = p(str4);
        if (n8 == EnumC2308cb0.VIDEO && p9 == enumC3177kb0) {
            H2.p.g("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        C1997Za0 b8 = C1997Za0.b(a8, webView, str5, "");
        return new C3929rT(AbstractC1927Xa0.a(C1962Ya0.a(n8, o(enumC3603oT.toString()), p8, p9, true), b8), b8);
    }

    static /* synthetic */ C3929rT m(String str, String str2, String str3, String str4, EnumC3494nT enumC3494nT, WebView webView, String str5, String str6, EnumC3603oT enumC3603oT) {
        C3286lb0 a8 = C3286lb0.a(str, str2);
        EnumC3177kb0 p8 = p("javascript");
        EnumC3177kb0 p9 = p(str4);
        EnumC2308cb0 n8 = n(enumC3494nT.toString());
        EnumC3177kb0 enumC3177kb0 = EnumC3177kb0.NONE;
        if (p8 == enumC3177kb0) {
            H2.p.g("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (n8 == null) {
            H2.p.g("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(enumC3494nT)));
            return null;
        }
        if (n8 == EnumC2308cb0.VIDEO && p9 == enumC3177kb0) {
            H2.p.g("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        C1997Za0 c8 = C1997Za0.c(a8, webView, str5, "");
        return new C3929rT(AbstractC1927Xa0.a(C1962Ya0.a(n8, o(enumC3603oT.toString()), p8, p9, true), c8), c8);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.EnumC2308cb0 n(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L20
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L43
            if (r4 == r3) goto L40
            if (r4 == r2) goto L3d
            r4 = 0
            return r4
        L3d:
            com.google.android.gms.internal.ads.cb0 r4 = com.google.android.gms.internal.ads.EnumC2308cb0.VIDEO
            return r4
        L40:
            com.google.android.gms.internal.ads.cb0 r4 = com.google.android.gms.internal.ads.EnumC2308cb0.NATIVE_DISPLAY
            return r4
        L43:
            com.google.android.gms.internal.ads.cb0 r4 = com.google.android.gms.internal.ads.EnumC2308cb0.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3276lT.n(java.lang.String):com.google.android.gms.internal.ads.cb0");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.EnumC2634fb0 o(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 1
            r3 = 2
            if (r0 == r1) goto L2a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L20
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L44
            if (r4 == r2) goto L41
            if (r4 == r3) goto L3e
            com.google.android.gms.internal.ads.fb0 r4 = com.google.android.gms.internal.ads.EnumC2634fb0.UNSPECIFIED
            return r4
        L3e:
            com.google.android.gms.internal.ads.fb0 r4 = com.google.android.gms.internal.ads.EnumC2634fb0.ONE_PIXEL
            return r4
        L41:
            com.google.android.gms.internal.ads.fb0 r4 = com.google.android.gms.internal.ads.EnumC2634fb0.DEFINED_BY_JAVASCRIPT
            return r4
        L44:
            com.google.android.gms.internal.ads.fb0 r4 = com.google.android.gms.internal.ads.EnumC2634fb0.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3276lT.o(java.lang.String):com.google.android.gms.internal.ads.fb0");
    }

    private static EnumC3177kb0 p(String str) {
        return "native".equals(str) ? EnumC3177kb0.NATIVE : "javascript".equals(str) ? EnumC3177kb0.JAVASCRIPT : EnumC3177kb0.NONE;
    }

    private static final Object q(InterfaceC3167kT interfaceC3167kT) {
        try {
            return interfaceC3167kT.zza();
        } catch (RuntimeException e8) {
            C2.v.s().w(e8, "omid exception");
            return null;
        }
    }

    private static final void r(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e8) {
            C2.v.s().w(e8, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3385mT
    public final String a(Context context) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23862c5)).booleanValue()) {
            return (String) q(new InterfaceC3167kT() { // from class: com.google.android.gms.internal.ads.gT
                @Override // com.google.android.gms.internal.ads.InterfaceC3167kT
                public final Object zza() {
                    return "a.1.5.2-google_20241009";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3385mT
    public final void b(final C3068jb0 c3068jb0, final View view) {
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.fT
            @Override // java.lang.Runnable
            public final void run() {
                c3068jb0.f(view, EnumC2525eb0.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3385mT
    public final void c(final AbstractC1927Xa0 abstractC1927Xa0, final View view) {
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.bT
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23862c5)).booleanValue() && AbstractC1857Va0.b()) {
                    abstractC1927Xa0.d(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3385mT
    public final void d(final AbstractC1927Xa0 abstractC1927Xa0, final View view) {
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.YS
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23862c5)).booleanValue() && AbstractC1857Va0.b()) {
                    abstractC1927Xa0.b(view, EnumC2525eb0.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3385mT
    public final void e(final AbstractC1927Xa0 abstractC1927Xa0) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23862c5)).booleanValue() && AbstractC1857Va0.b()) {
            Objects.requireNonNull(abstractC1927Xa0);
            r(new Runnable() { // from class: com.google.android.gms.internal.ads.cT
                @Override // java.lang.Runnable
                public final void run() {
                    abstractC1927Xa0.e();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3385mT
    public final boolean f(final Context context) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23862c5)).booleanValue()) {
            Boolean bool = (Boolean) q(new InterfaceC3167kT() { // from class: com.google.android.gms.internal.ads.eT
                @Override // com.google.android.gms.internal.ads.InterfaceC3167kT
                public final Object zza() {
                    if (AbstractC1857Va0.b()) {
                        return Boolean.TRUE;
                    }
                    AbstractC1857Va0.a(context);
                    return Boolean.valueOf(AbstractC1857Va0.b());
                }
            });
            return bool != null && bool.booleanValue();
        }
        H2.p.g("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3385mT
    public final C3929rT g(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final EnumC3603oT enumC3603oT, final EnumC3494nT enumC3494nT, final String str6) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23862c5)).booleanValue() || !AbstractC1857Va0.b()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (C3929rT) q(new InterfaceC3167kT(str5, str, str8, str4, enumC3494nT, webView, str6, str7, enumC3603oT) { // from class: com.google.android.gms.internal.ads.dT

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f21554a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f21555b;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f21557d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ EnumC3494nT f21558e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ WebView f21559f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ String f21560g;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ EnumC3603oT f21562i;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f21556c = "javascript";

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ String f21561h = "";

            {
                this.f21557d = str4;
                this.f21558e = enumC3494nT;
                this.f21559f = webView;
                this.f21560g = str6;
                this.f21562i = enumC3603oT;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC3167kT
            public final Object zza() {
                return C3276lT.m(this.f21554a, this.f21555b, this.f21556c, this.f21557d, this.f21558e, this.f21559f, this.f21560g, this.f21561h, this.f21562i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3385mT
    public final C3068jb0 h(final H2.a aVar, final WebView webView, boolean z7) {
        final boolean z8 = true;
        return (C3068jb0) q(new InterfaceC3167kT(webView, z8) { // from class: com.google.android.gms.internal.ads.iT

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebView f22976b;

            @Override // com.google.android.gms.internal.ads.InterfaceC3167kT
            public final Object zza() {
                H2.a aVar2 = this.f22975a;
                return C3068jb0.b(C3286lb0.a("Google", aVar2.f2915s + "." + aVar2.f2916t), this.f22976b, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3385mT
    public final void i(final AbstractC1927Xa0 abstractC1927Xa0) {
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.jT
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23862c5)).booleanValue() && AbstractC1857Va0.b()) {
                    abstractC1927Xa0.c();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3385mT
    public final void j(final C3068jb0 c3068jb0, final C1639Ot c1639Ot) {
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.hT
            @Override // java.lang.Runnable
            public final void run() {
                c3068jb0.g(c1639Ot);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3385mT
    public final C3929rT k(final String str, final WebView webView, String str2, String str3, final String str4, final EnumC3603oT enumC3603oT, final EnumC3494nT enumC3494nT, final String str5) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23862c5)).booleanValue() || !AbstractC1857Va0.b()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (C3929rT) q(new InterfaceC3167kT(str7, str, str6, enumC3494nT, str4, webView, str5, str8, enumC3603oT) { // from class: com.google.android.gms.internal.ads.aT

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f20696b;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ EnumC3494nT f20698d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f20699e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ WebView f20700f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ String f20701g;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ EnumC3603oT f20703i;

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f20695a = "Google";

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f20697c = "javascript";

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ String f20702h = "";

            {
                this.f20696b = str;
                this.f20698d = enumC3494nT;
                this.f20699e = str4;
                this.f20700f = webView;
                this.f20701g = str5;
                this.f20703i = enumC3603oT;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC3167kT
            public final Object zza() {
                return C3276lT.l(this.f20695a, this.f20696b, this.f20697c, this.f20698d, this.f20699e, this.f20700f, this.f20701g, this.f20702h, this.f20703i);
            }
        });
    }
}
