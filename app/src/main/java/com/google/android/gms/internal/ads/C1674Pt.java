package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Pt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1674Pt extends FrameLayout implements InterfaceC4410vt {

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC4410vt f18284o;

    /* renamed from: s, reason: collision with root package name */
    private final C1176Br f18285s;

    /* renamed from: t, reason: collision with root package name */
    private final AtomicBoolean f18286t;

    /* JADX WARN: Multi-variable type inference failed */
    public C1674Pt(InterfaceC4410vt interfaceC4410vt) {
        super(interfaceC4410vt.getContext());
        this.f18286t = new AtomicBoolean();
        this.f18284o = interfaceC4410vt;
        this.f18285s = new C1176Br(interfaceC4410vt.q0(), this, this);
        addView((View) interfaceC4410vt);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final WebView A() {
        return (WebView) this.f18284o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4701yb
    public final void A0(C4592xb c4592xb) {
        this.f18284o.A0(c4592xb);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final void B(BinderC2024Zt binderC2024Zt) {
        this.f18284o.B(binderC2024Zt);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void B0(InterfaceC3178kc interfaceC3178kc) {
        this.f18284o.B0(interfaceC3178kc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2889hu
    public final void C(boolean z7, int i8, boolean z8) {
        this.f18284o.C(z7, i8, z8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void D() {
        C3929rT y7;
        C3712pT d02;
        TextView textView = new TextView(getContext());
        C2.v.t();
        textView.setText(G2.D0.e0());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23889f5)).booleanValue() && (d02 = d0()) != null) {
            d02.a(textView);
        } else if (((Boolean) D2.A.c().a(AbstractC3184kf.f23880e5)).booleanValue() && (y7 = y()) != null && y7.b()) {
            C2.v.b().d(y7.a(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2869hk
    public final void D0(String str, Map map) {
        this.f18284o.D0(str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final List E0() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt != this.f18284o) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC3214ku
    public final N9 F() {
        return this.f18284o.F();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void F0() {
        this.f18284o.F0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final InterfaceC3178kc G() {
        return this.f18284o.G();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void G0(String str, InterfaceC1662Pi interfaceC1662Pi) {
        this.f18284o.G0(str, interfaceC1662Pi);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC3105ju
    public final C3976ru H() {
        return this.f18284o.H();
    }

    @Override // D2.InterfaceC0484a
    public final void I0() {
        InterfaceC4410vt interfaceC4410vt = this.f18284o;
        if (interfaceC4410vt != null) {
            interfaceC4410vt.I0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final F2.x J() {
        return this.f18284o.J();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void J0(boolean z7) {
        this.f18284o.J0(z7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void K() {
        setBackgroundColor(0);
        this.f18284o.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3912rG
    public final void K0() {
        InterfaceC4410vt interfaceC4410vt = this.f18284o;
        if (interfaceC4410vt != null) {
            interfaceC4410vt.K0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final InterfaceC3759pu L() {
        return ((ViewTreeObserverOnGlobalLayoutListenerC1919Wt) this.f18284o).q1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC3432mu
    public final View M() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final P60 N0() {
        return this.f18284o.N0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final F2.x O() {
        return this.f18284o.O();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC3430mt
    public final C3785q60 P() {
        return this.f18284o.P();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final void P0(boolean z7) {
        this.f18284o.P0(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void Q0(InterfaceC1519Lg interfaceC1519Lg) {
        this.f18284o.Q0(interfaceC1519Lg);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final InterfaceC1519Lg R() {
        return this.f18284o.R();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void R0(C3712pT c3712pT) {
        this.f18284o.R0(c3712pT);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final WebViewClient S() {
        return this.f18284o.S();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void S0(String str, String str2, String str3) {
        this.f18284o.S0(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final void T(int i8) {
        this.f18284o.T(i8);
    }

    @Override // C2.n
    public final void T0() {
        this.f18284o.T0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void U() {
        this.f18284o.U();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final boolean U0() {
        return this.f18284o.U0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final com.google.common.util.concurrent.d V() {
        return this.f18284o.V();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2889hu
    public final void V0(F2.l lVar, boolean z7, boolean z8, String str) {
        this.f18284o.V0(lVar, z7, z8, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final void W(String str, AbstractC1141As abstractC1141As) {
        this.f18284o.W(str, abstractC1141As);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2889hu
    public final void W0(String str, String str2, int i8) {
        this.f18284o.W0(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void X() {
        this.f18284o.X();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void X0(boolean z7) {
        this.f18284o.X0(z7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void Y() {
        this.f18285s.e();
        this.f18284o.Y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final void Z(int i8) {
        this.f18285s.g(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void Z0(String str, InterfaceC1662Pi interfaceC1662Pi) {
        this.f18284o.Z0(str, interfaceC1662Pi);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void a0(boolean z7) {
        this.f18284o.a0(z7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final boolean a1(boolean z7, int i8) {
        if (!this.f18286t.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23807W0)).booleanValue()) {
            return false;
        }
        if (this.f18284o.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f18284o.getParent()).removeView((View) this.f18284o);
        }
        this.f18284o.a1(z7, i8);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final int c() {
        return this.f18284o.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void c0(int i8) {
        this.f18284o.c0(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final boolean canGoBack() {
        return this.f18284o.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final C3712pT d0() {
        return this.f18284o.d0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void destroy() {
        final C3712pT d02;
        final C3929rT y7 = y();
        if (y7 != null) {
            HandlerC1968Yd0 handlerC1968Yd0 = G2.D0.f2566l;
            handlerC1968Yd0.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Mt
                @Override // java.lang.Runnable
                public final void run() {
                    C2.v.b().i(y7.a());
                }
            });
            InterfaceC4410vt interfaceC4410vt = this.f18284o;
            Objects.requireNonNull(interfaceC4410vt);
            handlerC1968Yd0.postDelayed(new RunnableC1534Lt(interfaceC4410vt), ((Integer) D2.A.c().a(AbstractC3184kf.f23871d5)).intValue());
            return;
        }
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23889f5)).booleanValue() || (d02 = d0()) == null) {
            this.f18284o.destroy();
        } else {
            G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Nt
                @Override // java.lang.Runnable
                public final void run() {
                    d02.f(new C1639Ot(this.f17654o));
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final int e() {
        return ((Boolean) D2.A.c().a(AbstractC3184kf.f23810W3)).booleanValue() ? this.f18284o.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void e0() {
        this.f18284o.e0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC2562eu, com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final Activity f() {
        return this.f18284o.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final boolean f0() {
        return this.f18284o.f0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final void f1(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final int g() {
        return ((Boolean) D2.A.c().a(AbstractC3184kf.f23810W3)).booleanValue() ? this.f18284o.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void g0(boolean z7) {
        this.f18284o.g0(z7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final boolean g1() {
        return this.f18286t.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void goBack() {
        this.f18284o.goBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final C2.a h() {
        return this.f18284o.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void h0(F2.x xVar) {
        this.f18284o.h0(xVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void h1(boolean z7) {
        this.f18284o.h1(z7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final C4491wf i() {
        return this.f18284o.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void i1(C3976ru c3976ru) {
        this.f18284o.i1(c3976ru);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void j0(boolean z7) {
        this.f18284o.j0(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final void j1(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final C4600xf k() {
        return this.f18284o.k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void k0(Context context) {
        this.f18284o.k0(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void k1(boolean z7) {
        this.f18284o.k1(z7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC3323lu, com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final H2.a l() {
        return this.f18284o.l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void l0(C3785q60 c3785q60, C4111t60 c4111t60) {
        this.f18284o.l0(c3785q60, c4111t60);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final void l1(boolean z7, long j8) {
        this.f18284o.l1(z7, j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void loadData(String str, String str2, String str3) {
        this.f18284o.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f18284o.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void loadUrl(String str) {
        this.f18284o.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174tk
    public final void m(String str, String str2) {
        this.f18284o.m("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void m0(InterfaceC1449Jg interfaceC1449Jg) {
        this.f18284o.m0(interfaceC1449Jg);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174tk
    public final void m1(String str, JSONObject jSONObject) {
        ((ViewTreeObserverOnGlobalLayoutListenerC1919Wt) this.f18284o).m(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174tk
    public final void n(String str) {
        ((ViewTreeObserverOnGlobalLayoutListenerC1919Wt) this.f18284o).v1(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final boolean n0() {
        return this.f18284o.n0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void n1(C3929rT c3929rT) {
        this.f18284o.n1(c3929rT);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final C1176Br o() {
        return this.f18285s;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final boolean o1() {
        return this.f18284o.o1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void onPause() {
        this.f18285s.f();
        this.f18284o.onPause();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void onResume() {
        this.f18284o.onResume();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2869hk
    public final void p(String str, JSONObject jSONObject) {
        this.f18284o.p(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void p0(F2.x xVar) {
        this.f18284o.p0(xVar);
    }

    final /* synthetic */ void p1(boolean z7) {
        InterfaceC4410vt interfaceC4410vt = this.f18284o;
        HandlerC1968Yd0 handlerC1968Yd0 = G2.D0.f2566l;
        Objects.requireNonNull(interfaceC4410vt);
        handlerC1968Yd0.post(new RunnableC1534Lt(interfaceC4410vt));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final BinderC2024Zt q() {
        return this.f18284o.q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final Context q0() {
        return this.f18284o.q0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final String r() {
        return this.f18284o.r();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2889hu
    public final void r0(boolean z7, int i8, String str, String str2, boolean z8) {
        this.f18284o.r0(z7, i8, str, str2, z8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final String s() {
        return this.f18284o.s();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final AbstractC1141As s0(String str) {
        return this.f18284o.s0(str);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f18284o.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f18284o.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f18284o.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f18284o.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2889hu
    public final void t(boolean z7, int i8, String str, boolean z8, boolean z9) {
        this.f18284o.t(z7, i8, str, z8, z9);
    }

    @Override // C2.n
    public final void t0() {
        this.f18284o.t0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final String u() {
        return this.f18284o.u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void u0(int i8) {
        this.f18284o.u0(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void v() {
        this.f18284o.v();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final void w() {
        this.f18284o.w();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final void w0() {
        this.f18284o.w0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3912rG
    public final void x() {
        InterfaceC4410vt interfaceC4410vt = this.f18284o;
        if (interfaceC4410vt != null) {
            interfaceC4410vt.x();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final boolean x0() {
        return this.f18284o.x0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final C3929rT y() {
        return this.f18284o.y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC2128au
    public final C4111t60 z() {
        return this.f18284o.z();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void z0(String str, f3.n nVar) {
        this.f18284o.z0(str, nVar);
    }
}
