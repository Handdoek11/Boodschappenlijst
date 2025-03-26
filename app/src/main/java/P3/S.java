package p3;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
final class S extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ U f40206a;

    /* synthetic */ S(U u7, T t7) {
        this.f40206a = u7;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (U.f(this.f40206a, str)) {
            this.f40206a.f40208s.d(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (this.f40206a.f40209t) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        this.f40206a.f40209t = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i8, String str, String str2) {
        this.f40206a.f40208s.e(i8, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        if (!U.f(this.f40206a, uri)) {
            return false;
        }
        this.f40206a.f40208s.d(uri);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!U.f(this.f40206a, str)) {
            return false;
        }
        this.f40206a.f40208s.d(str);
        return true;
    }
}
