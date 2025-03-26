package com.google.android.gms.internal.ads;

import D2.C0555y;
import D2.InterfaceC0484a;
import F2.InterfaceC0570b;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.adadapted.android.sdk.core.ad.AdActionType;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.cj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2323cj implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    private final C2.b f21271a;

    /* renamed from: b, reason: collision with root package name */
    private final HN f21272b;

    /* renamed from: d, reason: collision with root package name */
    private final C1982Ym f21274d;

    /* renamed from: e, reason: collision with root package name */
    private final JS f21275e;

    /* renamed from: f, reason: collision with root package name */
    private final C3874qx f21276f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC0570b f21277g = null;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f21278h = AbstractC1497Kq.f16650g;

    /* renamed from: c, reason: collision with root package name */
    private final H2.u f21273c = new H2.u(null);

    public C2323cj(C2.b bVar, C1982Ym c1982Ym, JS js, HN hn, C3874qx c3874qx) {
        this.f21271a = bVar;
        this.f21274d = c1982Ym;
        this.f21275e = js;
        this.f21272b = hn;
        this.f21276f = c3874qx;
    }

    public static int b(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if (AdActionType.POPUP.equalsIgnoreCase(str)) {
            return 7;
        }
        if (AdActionType.LINK.equalsIgnoreCase(str)) {
            return 6;
        }
        return AdActionType.CONTENT.equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri c(Context context, N9 n9, Uri uri, View view, Activity activity, P60 p60) {
        if (n9 == null) {
            return uri;
        }
        try {
            if (!((Boolean) D2.A.c().a(AbstractC3184kf.Sb)).booleanValue() || p60 == null) {
                if (n9.e(uri)) {
                    uri = n9.a(uri, context, view, activity);
                }
            } else if (n9.e(uri)) {
                uri = p60.a(uri, context, view, activity);
            }
        } catch (zzavb unused) {
        } catch (Exception e8) {
            C2.v.s().x(e8, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    static Uri d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e8) {
            H2.p.e("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e8);
        }
        return uri;
    }

    public static boolean f(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r29, D2.InterfaceC0484a r30, java.util.Map r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2323cj.h(java.lang.String, D2.a, java.util.Map, java.lang.String):void");
    }

    private final void i(Context context, String str, String str2) {
        this.f21275e.f(str);
        HN hn = this.f21272b;
        if (hn != null) {
            US.v7(context, hn, this.f21275e, str, "dialog_not_shown", AbstractC4496wh0.f("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0157, code lost:
    
        r22 = r7;
        r11 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j(D2.InterfaceC0484a r21, java.util.Map r22, boolean r23, java.lang.String r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2323cj.j(D2.a, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void k(boolean z7) {
        C1982Ym c1982Ym = this.f21274d;
        if (c1982Ym != null) {
            c1982Ym.h(z7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (((java.lang.Boolean) D2.A.c().a(com.google.android.gms.internal.ads.AbstractC3184kf.u8)).booleanValue() != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) D2.A.c().a(com.google.android.gms.internal.ads.AbstractC3184kf.p8)).booleanValue() : ((java.lang.Boolean) D2.A.c().a(com.google.android.gms.internal.ads.AbstractC3184kf.o8)).booleanValue()) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean l(D2.InterfaceC0484a r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2323cj.l(D2.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(int i8) {
        HN hn;
        String str;
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23675F4)).booleanValue() || (hn = this.f21272b) == null) {
            return;
        }
        GN a8 = hn.a();
        a8.b("action", "cct_action");
        switch (i8) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        a8.b("cct_open_status", str);
        a8.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC0484a interfaceC0484a = (InterfaceC0484a) obj;
        String str = (String) map.get("u");
        Map hashMap = new HashMap();
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) interfaceC0484a;
        if (interfaceC4410vt.P() != null) {
            hashMap = interfaceC4410vt.P().f25823w0;
        }
        String c8 = AbstractC2020Zp.c(str, interfaceC4410vt.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            H2.p.g("Action missing from an open GMSG.");
            return;
        }
        C2.b bVar = this.f21271a;
        if (bVar == null || bVar.c()) {
            AbstractC2326ck0.r((((Boolean) D2.A.c().a(AbstractC3184kf.U9)).booleanValue() && this.f21276f != null && C3874qx.j(c8)) ? this.f21276f.b(c8, C0555y.e()) : AbstractC2326ck0.h(c8), new C1942Xi(this, map, interfaceC0484a, str2), this.f21278h);
        } else {
            bVar.b(c8);
        }
    }
}
