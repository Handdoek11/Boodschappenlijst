package p3;

import android.webkit.WebView;

/* renamed from: p3.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6366t0 {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f40385a;

    public static void a(WebView webView, String str) {
        boolean booleanValue;
        synchronized (AbstractC6366t0.class) {
            if (f40385a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    f40385a = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    f40385a = Boolean.FALSE;
                }
                booleanValue = f40385a.booleanValue();
            } else {
                booleanValue = f40385a.booleanValue();
            }
        }
        if (booleanValue) {
            webView.evaluateJavascript(str, null);
        } else {
            webView.loadUrl("javascript:".concat(str));
        }
    }
}
