package com.google.android.gms.internal.ads;

import D2.InterfaceC0484a;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4410vt extends InterfaceC0484a, InterfaceC3912rG, InterfaceC3430mt, InterfaceC2869hk, InterfaceC2128au, InterfaceC2562eu, InterfaceC4174tk, InterfaceC4701yb, InterfaceC2889hu, C2.n, InterfaceC3214ku, InterfaceC3323lu, InterfaceC1567Mr, InterfaceC3432mu {
    WebView A();

    void B(BinderC2024Zt binderC2024Zt);

    void B0(InterfaceC3178kc interfaceC3178kc);

    void D();

    List E0();

    N9 F();

    void F0();

    InterfaceC3178kc G();

    void G0(String str, InterfaceC1662Pi interfaceC1662Pi);

    C3976ru H();

    F2.x J();

    void J0(boolean z7);

    void K();

    InterfaceC3759pu L();

    View M();

    P60 N0();

    F2.x O();

    C3785q60 P();

    void Q0(InterfaceC1519Lg interfaceC1519Lg);

    InterfaceC1519Lg R();

    void R0(C3712pT c3712pT);

    WebViewClient S();

    void S0(String str, String str2, String str3);

    void U();

    boolean U0();

    com.google.common.util.concurrent.d V();

    void W(String str, AbstractC1141As abstractC1141As);

    void X();

    void X0(boolean z7);

    void Y();

    void Z0(String str, InterfaceC1662Pi interfaceC1662Pi);

    void a0(boolean z7);

    boolean a1(boolean z7, int i8);

    void c0(int i8);

    boolean canGoBack();

    C3712pT d0();

    void destroy();

    void e0();

    Activity f();

    boolean f0();

    void g0(boolean z7);

    boolean g1();

    @Override // com.google.android.gms.internal.ads.InterfaceC2562eu, com.google.android.gms.internal.ads.InterfaceC1567Mr
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    C2.a h();

    void h0(F2.x xVar);

    void h1(boolean z7);

    void i1(C3976ru c3976ru);

    boolean isAttachedToWindow();

    void j0(boolean z7);

    C4600xf k();

    void k0(Context context);

    void k1(boolean z7);

    H2.a l();

    void l0(C3785q60 c3785q60, C4111t60 c4111t60);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void m0(InterfaceC1449Jg interfaceC1449Jg);

    void measure(int i8, int i9);

    boolean n0();

    void n1(C3929rT c3929rT);

    boolean o1();

    void onPause();

    void onResume();

    void p0(F2.x xVar);

    BinderC2024Zt q();

    Context q0();

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    void setBackgroundColor(int i8);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    String u();

    void u0(int i8);

    void v();

    boolean x0();

    C3929rT y();

    C4111t60 z();

    void z0(String str, f3.n nVar);
}
