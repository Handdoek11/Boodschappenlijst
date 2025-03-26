package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class NK {

    /* renamed from: a, reason: collision with root package name */
    private final L60 f17513a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f17514b;

    /* renamed from: c, reason: collision with root package name */
    private final C2508eM f17515c;

    /* renamed from: d, reason: collision with root package name */
    private final C4684yL f17516d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f17517e;

    /* renamed from: f, reason: collision with root package name */
    private final HN f17518f;

    /* renamed from: g, reason: collision with root package name */
    private final C2959ia0 f17519g;

    /* renamed from: h, reason: collision with root package name */
    private final JS f17520h;

    public NK(L60 l60, Executor executor, C2508eM c2508eM, Context context, HN hn, C2959ia0 c2959ia0, JS js, C4684yL c4684yL) {
        this.f17513a = l60;
        this.f17514b = executor;
        this.f17515c = c2508eM;
        this.f17517e = context;
        this.f17518f = hn;
        this.f17519g = c2959ia0;
        this.f17520h = js;
        this.f17516d = c4684yL;
    }

    private final void h(InterfaceC4410vt interfaceC4410vt) {
        j(interfaceC4410vt);
        interfaceC4410vt.Z0("/video", AbstractC1627Oi.f17926l);
        interfaceC4410vt.Z0("/videoMeta", AbstractC1627Oi.f17927m);
        interfaceC4410vt.Z0("/precache", new C1177Bs());
        interfaceC4410vt.Z0("/delayPageLoaded", AbstractC1627Oi.f17930p);
        interfaceC4410vt.Z0("/instrument", AbstractC1627Oi.f17928n);
        interfaceC4410vt.Z0("/log", AbstractC1627Oi.f17921g);
        interfaceC4410vt.Z0("/click", new C3408mi(null, 0 == true ? 1 : 0));
        if (this.f17513a.f16764b != null) {
            interfaceC4410vt.L().y0(true);
            interfaceC4410vt.Z0("/open", new C2323cj(null, null, null, null, null));
        } else {
            interfaceC4410vt.L().y0(false);
        }
        if (C2.v.r().p(interfaceC4410vt.getContext())) {
            Map hashMap = new HashMap();
            if (interfaceC4410vt.P() != null) {
                hashMap = interfaceC4410vt.P().f25823w0;
            }
            interfaceC4410vt.Z0("/logScionEvent", new C1872Vi(interfaceC4410vt.getContext(), hashMap));
        }
    }

    private final void i(InterfaceC4410vt interfaceC4410vt, C1776Sq c1776Sq) {
        if (this.f17513a.f16763a != null && interfaceC4410vt.q() != null) {
            interfaceC4410vt.q().x7(this.f17513a.f16763a);
        }
        c1776Sq.h();
    }

    private static final void j(InterfaceC4410vt interfaceC4410vt) {
        interfaceC4410vt.Z0("/videoClicked", AbstractC1627Oi.f17922h);
        interfaceC4410vt.L().C0(true);
        interfaceC4410vt.Z0("/getNativeAdViewSignals", AbstractC1627Oi.f17933s);
        interfaceC4410vt.Z0("/getNativeClickMeta", AbstractC1627Oi.f17934t);
    }

    public final com.google.common.util.concurrent.d a(final JSONObject jSONObject) {
        return AbstractC2326ck0.n(AbstractC2326ck0.n(AbstractC2326ck0.h(null), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.DK
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f14477a.e(obj);
            }
        }, this.f17514b), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.CK
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f14155a.c(jSONObject, (InterfaceC4410vt) obj);
            }
        }, this.f17514b);
    }

    public final com.google.common.util.concurrent.d b(final String str, final String str2, final C3785q60 c3785q60, final C4111t60 c4111t60, final D2.c2 c2Var) {
        return AbstractC2326ck0.n(AbstractC2326ck0.h(null), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.BK
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f13778a.d(c2Var, c3785q60, c4111t60, str, str2, obj);
            }
        }, this.f17514b);
    }

    final /* synthetic */ com.google.common.util.concurrent.d c(JSONObject jSONObject, final InterfaceC4410vt interfaceC4410vt) {
        C1874Vj c1874Vj = this.f17513a.f16764b;
        final C1776Sq e8 = C1776Sq.e(interfaceC4410vt);
        if (c1874Vj != null) {
            interfaceC4410vt.i1(C3976ru.d());
        } else {
            interfaceC4410vt.i1(C3976ru.e());
        }
        interfaceC4410vt.L().i0(new InterfaceC3541nu() { // from class: com.google.android.gms.internal.ads.GK
            @Override // com.google.android.gms.internal.ads.InterfaceC3541nu
            public final void a(boolean z7, int i8, String str, String str2) {
                this.f15356o.f(interfaceC4410vt, e8, z7, i8, str, str2);
            }
        });
        interfaceC4410vt.m1("google.afma.nativeAds.renderVideo", jSONObject);
        return e8;
    }

    final /* synthetic */ com.google.common.util.concurrent.d d(D2.c2 c2Var, C3785q60 c3785q60, C4111t60 c4111t60, String str, String str2, Object obj) {
        final InterfaceC4410vt a8 = this.f17515c.a(c2Var, c3785q60, c4111t60);
        final C1776Sq e8 = C1776Sq.e(a8);
        if (this.f17513a.f16764b != null) {
            h(a8);
            a8.i1(C3976ru.d());
        } else {
            C4357vL b8 = this.f17516d.b();
            a8.L().e1(b8, b8, b8, b8, b8, false, null, new C2.b(this.f17517e, null, null), null, null, this.f17520h, this.f17519g, this.f17518f, null, b8, null, null, null, null);
            j(a8);
        }
        a8.L().i0(new InterfaceC3541nu() { // from class: com.google.android.gms.internal.ads.HK
            @Override // com.google.android.gms.internal.ads.InterfaceC3541nu
            public final void a(boolean z7, int i8, String str3, String str4) {
                this.f15711o.g(a8, e8, z7, i8, str3, str4);
            }
        });
        a8.S0(str, str2, null);
        return e8;
    }

    final /* synthetic */ com.google.common.util.concurrent.d e(Object obj) {
        InterfaceC4410vt a8 = this.f17515c.a(D2.c2.C0(), null, null);
        final C1776Sq e8 = C1776Sq.e(a8);
        h(a8);
        a8.L().v0(new InterfaceC3650ou() { // from class: com.google.android.gms.internal.ads.EK
            @Override // com.google.android.gms.internal.ads.InterfaceC3650ou
            public final void zza() {
                e8.h();
            }
        });
        a8.loadUrl((String) D2.A.c().a(AbstractC3184kf.f23770R3));
        return e8;
    }

    final /* synthetic */ void f(InterfaceC4410vt interfaceC4410vt, C1776Sq c1776Sq, boolean z7, int i8, String str, String str2) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23834Z3)).booleanValue()) {
            i(interfaceC4410vt, c1776Sq);
            return;
        }
        if (z7) {
            i(interfaceC4410vt, c1776Sq);
            return;
        }
        c1776Sq.d(new zzegu(1, "Native Video WebView failed to load. Error code: " + i8 + ", Description: " + str + ", Failing URL: " + str2));
    }

    final /* synthetic */ void g(InterfaceC4410vt interfaceC4410vt, C1776Sq c1776Sq, boolean z7, int i8, String str, String str2) {
        if (z7) {
            if (this.f17513a.f16763a != null && interfaceC4410vt.q() != null) {
                interfaceC4410vt.q().x7(this.f17513a.f16763a);
            }
            c1776Sq.h();
            return;
        }
        c1776Sq.d(new zzegu(1, "Html video Web View failed to load. Error code: " + i8 + ", Description: " + str + ", Failing URL: " + str2));
    }
}
