package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.google.android.gms.internal.ads.oj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3628oj extends WebViewClient {
    protected abstract WebViewClient a();

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z7) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return;
        }
        a8.doUpdateVisitedHistory(webView, str, z7);
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return;
        }
        a8.onFormResubmission(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return;
        }
        a8.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return;
        }
        a8.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return;
        }
        a8.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return;
        }
        a8.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return;
        }
        a8.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i8, String str, String str2) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return;
        }
        a8.onReceivedError(webView, i8, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return;
        }
        a8.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return;
        }
        a8.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return;
        }
        a8.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return;
        }
        a8.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return false;
        }
        return a8.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i8, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return;
        }
        a8.onSafeBrowsingHit(webView, webResourceRequest, i8, safeBrowsingResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f8, float f9) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return;
        }
        a8.onScaleChanged(webView, f8, f9);
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return;
        }
        a8.onTooManyRedirects(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return;
        }
        a8.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return null;
        }
        return a8.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return false;
        }
        return a8.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return false;
        }
        return a8.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return;
        }
        a8.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return null;
        }
        return a8.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient a8 = a();
        if (a8 == null) {
            return false;
        }
        return a8.shouldOverrideUrlLoading(webView, str);
    }
}
