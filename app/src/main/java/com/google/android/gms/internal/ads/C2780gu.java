package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.gu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2780gu extends AbstractC2671fu {
    public C2780gu(InterfaceC4410vt interfaceC4410vt, C2000Zc c2000Zc, boolean z7, US us) {
        super(interfaceC4410vt, c2000Zc, z7, us);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return j1(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
