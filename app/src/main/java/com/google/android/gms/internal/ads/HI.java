package com.google.android.gms.internal.ads;

import D2.BinderC0534q1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.util.Collections;
import java.util.List;
import q.C6407k;

/* loaded from: classes.dex */
public final class HI {

    /* renamed from: a, reason: collision with root package name */
    private int f15683a;

    /* renamed from: b, reason: collision with root package name */
    private D2.Y0 f15684b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1693Qg f15685c;

    /* renamed from: d, reason: collision with root package name */
    private View f15686d;

    /* renamed from: e, reason: collision with root package name */
    private List f15687e;

    /* renamed from: g, reason: collision with root package name */
    private BinderC0534q1 f15689g;

    /* renamed from: h, reason: collision with root package name */
    private Bundle f15690h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC4410vt f15691i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC4410vt f15692j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC4410vt f15693k;

    /* renamed from: l, reason: collision with root package name */
    private C3929rT f15694l;

    /* renamed from: m, reason: collision with root package name */
    private com.google.common.util.concurrent.d f15695m;

    /* renamed from: n, reason: collision with root package name */
    private C1811Tq f15696n;

    /* renamed from: o, reason: collision with root package name */
    private View f15697o;

    /* renamed from: p, reason: collision with root package name */
    private View f15698p;

    /* renamed from: q, reason: collision with root package name */
    private InterfaceC5852a f15699q;

    /* renamed from: r, reason: collision with root package name */
    private double f15700r;

    /* renamed from: s, reason: collision with root package name */
    private InterfaceC1938Xg f15701s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC1938Xg f15702t;

    /* renamed from: u, reason: collision with root package name */
    private String f15703u;

    /* renamed from: x, reason: collision with root package name */
    private float f15706x;

    /* renamed from: y, reason: collision with root package name */
    private String f15707y;

    /* renamed from: v, reason: collision with root package name */
    private final C6407k f15704v = new C6407k();

    /* renamed from: w, reason: collision with root package name */
    private final C6407k f15705w = new C6407k();

    /* renamed from: f, reason: collision with root package name */
    private List f15688f = Collections.emptyList();

    public static HI H(C1631Ol c1631Ol) {
        try {
            GI L7 = L(c1631Ol.q2(), null);
            InterfaceC1693Qg r32 = c1631Ol.r3();
            View view = (View) N(c1631Ol.W4());
            String o8 = c1631Ol.o();
            List t7 = c1631Ol.t7();
            String k8 = c1631Ol.k();
            Bundle c8 = c1631Ol.c();
            String l8 = c1631Ol.l();
            View view2 = (View) N(c1631Ol.s7());
            InterfaceC5852a j8 = c1631Ol.j();
            String q8 = c1631Ol.q();
            String p8 = c1631Ol.p();
            double b8 = c1631Ol.b();
            InterfaceC1938Xg I32 = c1631Ol.I3();
            HI hi = new HI();
            hi.f15683a = 2;
            hi.f15684b = L7;
            hi.f15685c = r32;
            hi.f15686d = view;
            hi.z("headline", o8);
            hi.f15687e = t7;
            hi.z("body", k8);
            hi.f15690h = c8;
            hi.z("call_to_action", l8);
            hi.f15697o = view2;
            hi.f15699q = j8;
            hi.z("store", q8);
            hi.z("price", p8);
            hi.f15700r = b8;
            hi.f15701s = I32;
            return hi;
        } catch (RemoteException e8) {
            H2.p.h("Failed to get native ad from app install ad mapper", e8);
            return null;
        }
    }

    public static HI I(C1666Pl c1666Pl) {
        try {
            GI L7 = L(c1666Pl.q2(), null);
            InterfaceC1693Qg r32 = c1666Pl.r3();
            View view = (View) N(c1666Pl.f());
            String o8 = c1666Pl.o();
            List t7 = c1666Pl.t7();
            String k8 = c1666Pl.k();
            Bundle b8 = c1666Pl.b();
            String l8 = c1666Pl.l();
            View view2 = (View) N(c1666Pl.W4());
            InterfaceC5852a s72 = c1666Pl.s7();
            String j8 = c1666Pl.j();
            InterfaceC1938Xg I32 = c1666Pl.I3();
            HI hi = new HI();
            hi.f15683a = 1;
            hi.f15684b = L7;
            hi.f15685c = r32;
            hi.f15686d = view;
            hi.z("headline", o8);
            hi.f15687e = t7;
            hi.z("body", k8);
            hi.f15690h = b8;
            hi.z("call_to_action", l8);
            hi.f15697o = view2;
            hi.f15699q = s72;
            hi.z("advertiser", j8);
            hi.f15702t = I32;
            return hi;
        } catch (RemoteException e8) {
            H2.p.h("Failed to get native ad from content ad mapper", e8);
            return null;
        }
    }

    public static HI J(C1631Ol c1631Ol) {
        try {
            return M(L(c1631Ol.q2(), null), c1631Ol.r3(), (View) N(c1631Ol.W4()), c1631Ol.o(), c1631Ol.t7(), c1631Ol.k(), c1631Ol.c(), c1631Ol.l(), (View) N(c1631Ol.s7()), c1631Ol.j(), c1631Ol.q(), c1631Ol.p(), c1631Ol.b(), c1631Ol.I3(), null, 0.0f);
        } catch (RemoteException e8) {
            H2.p.h("Failed to get native ad assets from app install ad mapper", e8);
            return null;
        }
    }

    public static HI K(C1666Pl c1666Pl) {
        try {
            return M(L(c1666Pl.q2(), null), c1666Pl.r3(), (View) N(c1666Pl.f()), c1666Pl.o(), c1666Pl.t7(), c1666Pl.k(), c1666Pl.b(), c1666Pl.l(), (View) N(c1666Pl.W4()), c1666Pl.s7(), null, null, -1.0d, c1666Pl.I3(), c1666Pl.j(), 0.0f);
        } catch (RemoteException e8) {
            H2.p.h("Failed to get native ad assets from content ad mapper", e8);
            return null;
        }
    }

    private static GI L(D2.Y0 y02, InterfaceC1771Sl interfaceC1771Sl) {
        if (y02 == null) {
            return null;
        }
        return new GI(y02, interfaceC1771Sl);
    }

    private static HI M(D2.Y0 y02, InterfaceC1693Qg interfaceC1693Qg, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, InterfaceC5852a interfaceC5852a, String str4, String str5, double d8, InterfaceC1938Xg interfaceC1938Xg, String str6, float f8) {
        HI hi = new HI();
        hi.f15683a = 6;
        hi.f15684b = y02;
        hi.f15685c = interfaceC1693Qg;
        hi.f15686d = view;
        hi.z("headline", str);
        hi.f15687e = list;
        hi.z("body", str2);
        hi.f15690h = bundle;
        hi.z("call_to_action", str3);
        hi.f15697o = view2;
        hi.f15699q = interfaceC5852a;
        hi.z("store", str4);
        hi.z("price", str5);
        hi.f15700r = d8;
        hi.f15701s = interfaceC1938Xg;
        hi.z("advertiser", str6);
        hi.r(f8);
        return hi;
    }

    private static Object N(InterfaceC5852a interfaceC5852a) {
        if (interfaceC5852a == null) {
            return null;
        }
        return BinderC5853b.J0(interfaceC5852a);
    }

    public static HI g0(InterfaceC1771Sl interfaceC1771Sl) {
        try {
            return M(L(interfaceC1771Sl.h(), interfaceC1771Sl), interfaceC1771Sl.i(), (View) N(interfaceC1771Sl.k()), interfaceC1771Sl.s(), interfaceC1771Sl.u(), interfaceC1771Sl.q(), interfaceC1771Sl.f(), interfaceC1771Sl.r(), (View) N(interfaceC1771Sl.l()), interfaceC1771Sl.o(), interfaceC1771Sl.x(), interfaceC1771Sl.t(), interfaceC1771Sl.b(), interfaceC1771Sl.j(), interfaceC1771Sl.p(), interfaceC1771Sl.c());
        } catch (RemoteException e8) {
            H2.p.h("Failed to get native ad assets from unified ad mapper", e8);
            return null;
        }
    }

    public final synchronized double A() {
        return this.f15700r;
    }

    public final synchronized void B(int i8) {
        this.f15683a = i8;
    }

    public final synchronized void C(D2.Y0 y02) {
        this.f15684b = y02;
    }

    public final synchronized void D(View view) {
        this.f15697o = view;
    }

    public final synchronized void E(InterfaceC4410vt interfaceC4410vt) {
        this.f15691i = interfaceC4410vt;
    }

    public final synchronized void F(View view) {
        this.f15698p = view;
    }

    public final synchronized boolean G() {
        return this.f15692j != null;
    }

    public final synchronized float O() {
        return this.f15706x;
    }

    public final synchronized int P() {
        return this.f15683a;
    }

    public final synchronized Bundle Q() {
        try {
            if (this.f15690h == null) {
                this.f15690h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f15690h;
    }

    public final synchronized View R() {
        return this.f15686d;
    }

    public final synchronized View S() {
        return this.f15697o;
    }

    public final synchronized View T() {
        return this.f15698p;
    }

    public final synchronized C6407k U() {
        return this.f15704v;
    }

    public final synchronized C6407k V() {
        return this.f15705w;
    }

    public final synchronized D2.Y0 W() {
        return this.f15684b;
    }

    public final synchronized BinderC0534q1 X() {
        return this.f15689g;
    }

    public final synchronized InterfaceC1693Qg Y() {
        return this.f15685c;
    }

    public final InterfaceC1938Xg Z() {
        List list = this.f15687e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f15687e.get(0);
        if (obj instanceof IBinder) {
            return AbstractBinderC1903Wg.t7((IBinder) obj);
        }
        return null;
    }

    public final synchronized String a() {
        return this.f15703u;
    }

    public final synchronized InterfaceC1938Xg a0() {
        return this.f15701s;
    }

    public final synchronized String b() {
        return f("headline");
    }

    public final synchronized InterfaceC1938Xg b0() {
        return this.f15702t;
    }

    public final synchronized String c() {
        return this.f15707y;
    }

    public final synchronized C1811Tq c0() {
        return this.f15696n;
    }

    public final synchronized String d() {
        return f("price");
    }

    public final synchronized InterfaceC4410vt d0() {
        return this.f15692j;
    }

    public final synchronized String e() {
        return f("store");
    }

    public final synchronized InterfaceC4410vt e0() {
        return this.f15693k;
    }

    public final synchronized String f(String str) {
        return (String) this.f15705w.get(str);
    }

    public final synchronized InterfaceC4410vt f0() {
        return this.f15691i;
    }

    public final synchronized List g() {
        return this.f15687e;
    }

    public final synchronized List h() {
        return this.f15688f;
    }

    public final synchronized C3929rT h0() {
        return this.f15694l;
    }

    public final synchronized void i() {
        try {
            InterfaceC4410vt interfaceC4410vt = this.f15691i;
            if (interfaceC4410vt != null) {
                interfaceC4410vt.destroy();
                this.f15691i = null;
            }
            InterfaceC4410vt interfaceC4410vt2 = this.f15692j;
            if (interfaceC4410vt2 != null) {
                interfaceC4410vt2.destroy();
                this.f15692j = null;
            }
            InterfaceC4410vt interfaceC4410vt3 = this.f15693k;
            if (interfaceC4410vt3 != null) {
                interfaceC4410vt3.destroy();
                this.f15693k = null;
            }
            com.google.common.util.concurrent.d dVar = this.f15695m;
            if (dVar != null) {
                dVar.cancel(false);
                this.f15695m = null;
            }
            C1811Tq c1811Tq = this.f15696n;
            if (c1811Tq != null) {
                c1811Tq.cancel(false);
                this.f15696n = null;
            }
            this.f15694l = null;
            this.f15704v.clear();
            this.f15705w.clear();
            this.f15684b = null;
            this.f15685c = null;
            this.f15686d = null;
            this.f15687e = null;
            this.f15690h = null;
            this.f15697o = null;
            this.f15698p = null;
            this.f15699q = null;
            this.f15701s = null;
            this.f15702t = null;
            this.f15703u = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized InterfaceC5852a i0() {
        return this.f15699q;
    }

    public final synchronized void j(InterfaceC1693Qg interfaceC1693Qg) {
        this.f15685c = interfaceC1693Qg;
    }

    public final synchronized com.google.common.util.concurrent.d j0() {
        return this.f15695m;
    }

    public final synchronized void k(String str) {
        this.f15703u = str;
    }

    public final synchronized String k0() {
        return f("advertiser");
    }

    public final synchronized void l(BinderC0534q1 binderC0534q1) {
        this.f15689g = binderC0534q1;
    }

    public final synchronized String l0() {
        return f("body");
    }

    public final synchronized void m(InterfaceC1938Xg interfaceC1938Xg) {
        this.f15701s = interfaceC1938Xg;
    }

    public final synchronized String m0() {
        return f("call_to_action");
    }

    public final synchronized void n(String str, BinderC1484Kg binderC1484Kg) {
        if (binderC1484Kg == null) {
            this.f15704v.remove(str);
        } else {
            this.f15704v.put(str, binderC1484Kg);
        }
    }

    public final synchronized void o(InterfaceC4410vt interfaceC4410vt) {
        this.f15692j = interfaceC4410vt;
    }

    public final synchronized void p(List list) {
        this.f15687e = list;
    }

    public final synchronized void q(InterfaceC1938Xg interfaceC1938Xg) {
        this.f15702t = interfaceC1938Xg;
    }

    public final synchronized void r(float f8) {
        this.f15706x = f8;
    }

    public final synchronized void s(List list) {
        this.f15688f = list;
    }

    public final synchronized void t(InterfaceC4410vt interfaceC4410vt) {
        this.f15693k = interfaceC4410vt;
    }

    public final synchronized void u(com.google.common.util.concurrent.d dVar) {
        this.f15695m = dVar;
    }

    public final synchronized void v(String str) {
        this.f15707y = str;
    }

    public final synchronized void w(C3929rT c3929rT) {
        this.f15694l = c3929rT;
    }

    public final synchronized void x(C1811Tq c1811Tq) {
        this.f15696n = c1811Tq;
    }

    public final synchronized void y(double d8) {
        this.f15700r = d8;
    }

    public final synchronized void z(String str, String str2) {
        if (str2 == null) {
            this.f15705w.remove(str);
        } else {
            this.f15705w.put(str, str2);
        }
    }
}
