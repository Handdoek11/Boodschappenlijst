package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.Vb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC1858Vb implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final ValueCallback f19624o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ C1578Nb f19625s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ WebView f19626t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ boolean f19627u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ C1928Xb f19628v;

    RunnableC1858Vb(C1928Xb c1928Xb, final C1578Nb c1578Nb, final WebView webView, final boolean z7) {
        this.f19625s = c1578Nb;
        this.f19626t = webView;
        this.f19627u = z7;
        this.f19628v = c1928Xb;
        this.f19624o = new ValueCallback() { // from class: com.google.android.gms.internal.ads.Ub
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.f19419a.f19628v.c(c1578Nb, webView, (String) obj, z7);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19626t.getSettings().getJavaScriptEnabled()) {
            try {
                this.f19626t.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f19624o);
            } catch (Throwable unused) {
                this.f19624o.onReceiveValue("");
            }
        }
    }
}
