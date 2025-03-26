package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;

/* renamed from: com.google.android.gms.internal.ads.du, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2453du {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2562eu f21678a;

    /* renamed from: b, reason: collision with root package name */
    private final C2345cu f21679b;

    public C2453du(InterfaceC2562eu interfaceC2562eu, C2345cu c2345cu) {
        this.f21679b = c2345cu;
        this.f21678a = interfaceC2562eu;
    }

    final /* synthetic */ void a(String str) {
        Uri parse = Uri.parse(str);
        AbstractC1358Gt q12 = ((ViewTreeObserverOnGlobalLayoutListenerC1919Wt) this.f21679b.f21323a).q1();
        if (q12 == null) {
            H2.p.d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            q12.d1(parse);
        }
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            AbstractC0608p0.k("Click string is empty, not proceeding.");
            return "";
        }
        N9 F7 = ((InterfaceC3214ku) this.f21678a).F();
        if (F7 == null) {
            AbstractC0608p0.k("Signal utils is empty, ignoring.");
            return "";
        }
        H9 c8 = F7.c();
        if (c8 == null) {
            AbstractC0608p0.k("Signals object is empty, ignoring.");
            return "";
        }
        if (this.f21678a.getContext() == null) {
            AbstractC0608p0.k("Context is null, ignoring.");
            return "";
        }
        InterfaceC2562eu interfaceC2562eu = this.f21678a;
        return c8.f(interfaceC2562eu.getContext(), str, ((InterfaceC3432mu) interfaceC2562eu).M(), this.f21678a.f());
    }

    @JavascriptInterface
    public String getViewSignals() {
        N9 F7 = ((InterfaceC3214ku) this.f21678a).F();
        if (F7 == null) {
            AbstractC0608p0.k("Signal utils is empty, ignoring.");
            return "";
        }
        H9 c8 = F7.c();
        if (c8 == null) {
            AbstractC0608p0.k("Signals object is empty, ignoring.");
            return "";
        }
        if (this.f21678a.getContext() == null) {
            AbstractC0608p0.k("Context is null, ignoring.");
            return "";
        }
        InterfaceC2562eu interfaceC2562eu = this.f21678a;
        return c8.i(interfaceC2562eu.getContext(), ((InterfaceC3432mu) interfaceC2562eu).M(), this.f21678a.f());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            H2.p.g("URL is empty, ignoring message");
        } else {
            G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.bu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20996o.a(str);
                }
            });
        }
    }
}
