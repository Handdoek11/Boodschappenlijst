package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.Kb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1475Kb0 extends AbstractC1440Jb0 {
    public C1475Kb0(String str, WebView webView) {
        super(str);
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        n(webView);
    }
}
