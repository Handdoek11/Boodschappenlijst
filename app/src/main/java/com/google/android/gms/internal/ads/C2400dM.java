package com.google.android.gms.internal.ads;

import D2.InterfaceC0484a;
import F2.InterfaceC0572d;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.dM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2400dM {

    /* renamed from: a, reason: collision with root package name */
    private final C2817hC f21530a;

    /* renamed from: b, reason: collision with root package name */
    private final C3695pG f21531b;

    /* renamed from: c, reason: collision with root package name */
    private final SC f21532c;

    /* renamed from: d, reason: collision with root package name */
    private final C2601fD f21533d;

    /* renamed from: e, reason: collision with root package name */
    private final C3906rD f21534e;

    /* renamed from: f, reason: collision with root package name */
    private final LE f21535f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f21536g;

    /* renamed from: h, reason: collision with root package name */
    private final C3259lG f21537h;

    /* renamed from: i, reason: collision with root package name */
    private final C1643Ox f21538i;

    /* renamed from: j, reason: collision with root package name */
    private final C2.b f21539j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1426Ip f21540k;

    /* renamed from: l, reason: collision with root package name */
    private final N9 f21541l;

    /* renamed from: m, reason: collision with root package name */
    private final CE f21542m;

    /* renamed from: n, reason: collision with root package name */
    private final JS f21543n;

    /* renamed from: o, reason: collision with root package name */
    private final C2959ia0 f21544o;

    /* renamed from: p, reason: collision with root package name */
    private final HN f21545p;

    /* renamed from: q, reason: collision with root package name */
    private final C3874qx f21546q;

    /* renamed from: r, reason: collision with root package name */
    private final C3160kM f21547r;

    public C2400dM(C2817hC c2817hC, SC sc, C2601fD c2601fD, C3906rD c3906rD, LE le, Executor executor, C3259lG c3259lG, C1643Ox c1643Ox, C2.b bVar, InterfaceC1426Ip interfaceC1426Ip, N9 n9, CE ce, JS js, C2959ia0 c2959ia0, HN hn, C3695pG c3695pG, C3874qx c3874qx, C3160kM c3160kM) {
        this.f21530a = c2817hC;
        this.f21532c = sc;
        this.f21533d = c2601fD;
        this.f21534e = c3906rD;
        this.f21535f = le;
        this.f21536g = executor;
        this.f21537h = c3259lG;
        this.f21538i = c1643Ox;
        this.f21539j = bVar;
        this.f21540k = interfaceC1426Ip;
        this.f21541l = n9;
        this.f21542m = ce;
        this.f21543n = js;
        this.f21544o = c2959ia0;
        this.f21545p = hn;
        this.f21531b = c3695pG;
        this.f21546q = c3874qx;
        this.f21547r = c3160kM;
    }

    public static final com.google.common.util.concurrent.d j(InterfaceC4410vt interfaceC4410vt, String str, String str2, final Bundle bundle) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23949m2)).booleanValue()) {
            bundle.putLong(EnumC3706pN.RENDERING_WEBVIEW_LOAD_HTML_START.a(), C2.v.c().a());
        }
        final C1811Tq c1811Tq = new C1811Tq();
        interfaceC4410vt.L().i0(new InterfaceC3541nu() { // from class: com.google.android.gms.internal.ads.UL
            @Override // com.google.android.gms.internal.ads.InterfaceC3541nu
            public final void a(boolean z7, int i8, String str3, String str4) {
                C1811Tq c1811Tq2 = c1811Tq;
                if (z7) {
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.f23949m2)).booleanValue()) {
                        bundle.putLong(EnumC3706pN.RENDERING_WEBVIEW_LOAD_HTML_END.a(), C2.v.c().a());
                    }
                    c1811Tq2.c(null);
                    return;
                }
                c1811Tq2.d(new Exception("Ad Web View failed to load. Error code: " + i8 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        interfaceC4410vt.S0(str, str2, null);
        return c1811Tq;
    }

    final /* synthetic */ void c() {
        this.f21530a.I0();
    }

    final /* synthetic */ void d(String str, String str2) {
        this.f21535f.m(str, str2);
    }

    final /* synthetic */ void e() {
        this.f21532c.zzb();
    }

    final /* synthetic */ void f(View view) {
        this.f21539j.a();
    }

    final /* synthetic */ void g(InterfaceC4410vt interfaceC4410vt, InterfaceC4410vt interfaceC4410vt2, Map map) {
        this.f21538i.b(interfaceC4410vt);
    }

    final /* synthetic */ boolean h(View view, MotionEvent motionEvent) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.U9)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.f21547r.b(motionEvent);
        }
        this.f21539j.a();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public final void i(final InterfaceC4410vt interfaceC4410vt, boolean z7, C1767Si c1767Si, Bundle bundle) {
        H9 c8;
        AbstractC2207bf abstractC2207bf = AbstractC3184kf.f23949m2;
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
            bundle.putLong(EnumC3706pN.RENDERING_CONFIGURE_WEBVIEW_START.a(), C2.v.c().a());
        }
        interfaceC4410vt.L().e1(new InterfaceC0484a() { // from class: com.google.android.gms.internal.ads.VL
            @Override // D2.InterfaceC0484a
            public final void I0() {
                this.f19584o.c();
            }
        }, this.f21533d, this.f21534e, new InterfaceC2756gi() { // from class: com.google.android.gms.internal.ads.WL
            @Override // com.google.android.gms.internal.ads.InterfaceC2756gi
            public final void m(String str, String str2) {
                this.f19780o.d(str, str2);
            }
        }, new InterfaceC0572d() { // from class: com.google.android.gms.internal.ads.XL
            @Override // F2.InterfaceC0572d
            public final void g() {
                this.f20034o.e();
            }
        }, z7, c1767Si, this.f21539j, new C2291cM(this), this.f21540k, this.f21543n, this.f21544o, this.f21545p, null, this.f21531b, null, null, null, this.f21546q);
        interfaceC4410vt.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.YL
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f20249o.h(view, motionEvent);
                return false;
            }
        });
        interfaceC4410vt.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.ZL
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20460o.f(view);
            }
        });
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23713K2)).booleanValue() && (c8 = this.f21541l.c()) != null) {
            c8.b(interfaceC4410vt.M());
        }
        this.f21537h.f1(interfaceC4410vt, this.f21536g);
        this.f21537h.f1(new InterfaceC4701yb() { // from class: com.google.android.gms.internal.ads.aM
            @Override // com.google.android.gms.internal.ads.InterfaceC4701yb
            public final void A0(C4592xb c4592xb) {
                InterfaceC3759pu L7 = interfaceC4410vt.L();
                Rect rect = c4592xb.f27877d;
                L7.O0(rect.left, rect.top, false);
            }
        }, this.f21536g);
        this.f21537h.m1(interfaceC4410vt.M());
        interfaceC4410vt.Z0("/trackActiveViewUnit", new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.bM
            @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
            public final void a(Object obj, Map map) {
                this.f20856a.g(interfaceC4410vt, (InterfaceC4410vt) obj, map);
            }
        });
        this.f21538i.c(interfaceC4410vt);
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
            bundle.putLong(EnumC3706pN.RENDERING_CONFIGURE_WEBVIEW_END.a(), C2.v.c().a());
        }
    }
}
