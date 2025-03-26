package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.google.android.gms.internal.ads.Lb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1510Lb0 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1579Nb0 f16854a;

    C1510Lb0(C1579Nb0 c1579Nb0) {
        this.f16854a = c1579Nb0;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + String.valueOf(webView));
        if (this.f16854a.a() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            this.f16854a.n(null);
        }
        webView.destroy();
        return true;
    }
}
