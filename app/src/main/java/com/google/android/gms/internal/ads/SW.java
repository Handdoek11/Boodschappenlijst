package com.google.android.gms.internal.ads;

import D2.C0492c1;
import D2.C0521m0;
import D2.InterfaceC0485a0;
import D2.InterfaceC0509i0;
import D2.InterfaceC0530p0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.util.Collections;

/* loaded from: classes.dex */
public final class SW extends D2.U {

    /* renamed from: o, reason: collision with root package name */
    private final Context f18914o;

    /* renamed from: s, reason: collision with root package name */
    private final D2.H f18915s;

    /* renamed from: t, reason: collision with root package name */
    private final L60 f18916t;

    /* renamed from: u, reason: collision with root package name */
    private final AbstractC4420vy f18917u;

    /* renamed from: v, reason: collision with root package name */
    private final ViewGroup f18918v;

    /* renamed from: w, reason: collision with root package name */
    private final HN f18919w;

    public SW(Context context, D2.H h8, L60 l60, AbstractC4420vy abstractC4420vy, HN hn) {
        this.f18914o = context;
        this.f18915s = h8;
        this.f18916t = l60;
        this.f18917u = abstractC4420vy;
        this.f18919w = hn;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View k8 = abstractC4420vy.k();
        C2.v.t();
        frameLayout.addView(k8, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(g().f1223t);
        frameLayout.setMinimumWidth(g().f1226w);
        this.f18918v = frameLayout;
    }

    @Override // D2.V
    public final void B() {
        Z2.r.e("destroy must be called on the main UI thread.");
        this.f18917u.a();
    }

    @Override // D2.V
    public final void B6(InterfaceC4376vc interfaceC4376vc) {
    }

    @Override // D2.V
    public final boolean F0() {
        AbstractC4420vy abstractC4420vy = this.f18917u;
        return abstractC4420vy != null && abstractC4420vy.h();
    }

    @Override // D2.V
    public final boolean G6() {
        return false;
    }

    @Override // D2.V
    public final void H2(D2.E e8) {
        H2.p.f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // D2.V
    public final void I() {
        Z2.r.e("destroy must be called on the main UI thread.");
        this.f18917u.d().p1(null);
    }

    @Override // D2.V
    public final void I5(boolean z7) {
    }

    @Override // D2.V
    public final void J5(D2.H h8) {
        H2.p.f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // D2.V
    public final void M2(String str) {
    }

    @Override // D2.V
    public final void S1(InterfaceC0485a0 interfaceC0485a0) {
        H2.p.f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // D2.V
    public final boolean T3(D2.X1 x12) {
        H2.p.f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // D2.V
    public final void V0(String str) {
    }

    @Override // D2.V
    public final void Y() {
    }

    @Override // D2.V
    public final void a1(C0521m0 c0521m0) {
        H2.p.f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // D2.V
    public final void c0() {
        Z2.r.e("destroy must be called on the main UI thread.");
        this.f18917u.d().q1(null);
    }

    @Override // D2.V
    public final Bundle d() {
        H2.p.f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // D2.V
    public final boolean e0() {
        return false;
    }

    @Override // D2.V
    public final void e3(InterfaceC1303Ff interfaceC1303Ff) {
        H2.p.f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // D2.V
    public final D2.H f() {
        return this.f18915s;
    }

    @Override // D2.V
    public final void f0() {
        this.f18917u.o();
    }

    @Override // D2.V
    public final void f7(boolean z7) {
        H2.p.f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // D2.V
    public final D2.c2 g() {
        Z2.r.e("getAdSize must be called on the main UI thread.");
        return R60.a(this.f18914o, Collections.singletonList(this.f18917u.m()));
    }

    @Override // D2.V
    public final InterfaceC0509i0 h() {
        return this.f18916t.f16776n;
    }

    @Override // D2.V
    public final void h6(InterfaceC0509i0 interfaceC0509i0) {
        C4042sX c4042sX = this.f18916t.f16765c;
        if (c4042sX != null) {
            c4042sX.C(interfaceC0509i0);
        }
    }

    @Override // D2.V
    public final D2.U0 i() {
        return this.f18917u.c();
    }

    @Override // D2.V
    public final void i3(D2.N0 n02) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.ub)).booleanValue()) {
            H2.p.f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        C4042sX c4042sX = this.f18916t.f16765c;
        if (c4042sX != null) {
            try {
                if (!n02.c()) {
                    this.f18919w.e();
                }
            } catch (RemoteException e8) {
                H2.p.c("Error in making CSI ping for reporting paid event callback", e8);
            }
            c4042sX.w(n02);
        }
    }

    @Override // D2.V
    public final D2.Y0 j() {
        return this.f18917u.l();
    }

    @Override // D2.V
    public final void k2(InterfaceC1352Gn interfaceC1352Gn, String str) {
    }

    @Override // D2.V
    public final InterfaceC5852a l() {
        return BinderC5853b.p2(this.f18918v);
    }

    @Override // D2.V
    public final void l2(InterfaceC1704Qo interfaceC1704Qo) {
    }

    @Override // D2.V
    public final void m5(D2.c2 c2Var) {
        Z2.r.e("setAdSize must be called on the main UI thread.");
        AbstractC4420vy abstractC4420vy = this.f18917u;
        if (abstractC4420vy != null) {
            abstractC4420vy.p(this.f18918v, c2Var);
        }
    }

    @Override // D2.V
    public final String r() {
        return this.f18916t.f16768f;
    }

    @Override // D2.V
    public final void r6(D2.Q1 q12) {
        H2.p.f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // D2.V
    public final String s() {
        if (this.f18917u.c() != null) {
            return this.f18917u.c().g();
        }
        return null;
    }

    @Override // D2.V
    public final String t() {
        if (this.f18917u.c() != null) {
            return this.f18917u.c().g();
        }
        return null;
    }

    @Override // D2.V
    public final void y3(InterfaceC1244Dn interfaceC1244Dn) {
    }

    @Override // D2.V
    public final void Q5(C0492c1 c0492c1) {
    }

    @Override // D2.V
    public final void S5(InterfaceC5852a interfaceC5852a) {
    }

    @Override // D2.V
    public final void v4(InterfaceC0530p0 interfaceC0530p0) {
    }

    @Override // D2.V
    public final void y4(D2.i2 i2Var) {
    }

    @Override // D2.V
    public final void R4(D2.X1 x12, D2.K k8) {
    }
}
