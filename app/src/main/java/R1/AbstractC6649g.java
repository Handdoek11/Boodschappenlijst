package r1;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: r1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6649g {
    public static PackageInfo a() {
        return WebView.getCurrentWebViewPackage();
    }

    public static boolean b(WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }

    public static WebChromeClient c(WebView webView) {
        return webView.getWebChromeClient();
    }

    public static WebViewClient d(WebView webView) {
        return webView.getWebViewClient();
    }

    public static void e(WebSettings webSettings, boolean z7) {
        webSettings.setSafeBrowsingEnabled(z7);
    }
}
