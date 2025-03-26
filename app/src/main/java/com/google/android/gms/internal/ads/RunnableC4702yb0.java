package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.yb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4702yb0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ WebView f28148o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f28149s;

    RunnableC4702yb0(C4811zb0 c4811zb0, WebView webView, String str) {
        this.f28148o = webView;
        this.f28149s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4811zb0.k(this.f28148o, this.f28149s);
    }
}
