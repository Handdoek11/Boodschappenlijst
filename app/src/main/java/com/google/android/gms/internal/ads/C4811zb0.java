package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4811zb0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C4811zb0 f28678a = new C4811zb0();

    private C4811zb0() {
    }

    public static final C4811zb0 a() {
        return f28678a;
    }

    public static final boolean k(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: ".concat(String.valueOf(str)));
            return true;
        }
    }

    final void b(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            AbstractC1822Ua0.f19418a.booleanValue();
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        for (Object obj : objArr) {
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof String) {
                String obj2 = obj.toString();
                if (obj2.startsWith("{")) {
                    sb.append(obj2);
                } else {
                    sb.append('\"');
                    sb.append(obj2);
                    sb.append('\"');
                }
            } else {
                sb.append(obj);
            }
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append(")}");
        String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            k(webView, sb2);
        } else {
            handler.post(new RunnableC4702yb0(this, webView, sb2));
        }
    }

    public final void c(WebView webView, String str) {
        b(webView, "finishSession", str);
    }

    public final void d(WebView webView, String str, JSONObject jSONObject) {
        b(webView, "init", jSONObject, str);
    }

    public final void e(WebView webView, String str, float f8) {
        b(webView, "setDeviceVolume", Float.valueOf(f8), str);
    }

    public final void f(WebView webView, JSONObject jSONObject) {
        b(webView, "setLastActivity", jSONObject);
    }

    public final void g(WebView webView, String str, String str2) {
        b(webView, "setDeviceLockState", str2);
    }

    public final void h(WebView webView, String str, String str2) {
        b(webView, "setNativeViewHierarchy", str2, str);
    }

    public final void i(WebView webView, String str, String str2) {
        b(webView, "setState", str2, str);
    }

    public final void j(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        b(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}
