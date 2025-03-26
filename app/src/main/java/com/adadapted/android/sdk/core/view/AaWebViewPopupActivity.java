package com.adadapted.android.sdk.core.view;

import J6.AbstractC0650j;
import J6.r;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adadapted.android.sdk.constants.EventStrings;
import com.adadapted.android.sdk.core.ad.Ad;
import com.adadapted.android.sdk.core.event.EventClient;
import com.adadapted.android.sdk.core.log.AALogger;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class AaWebViewPopupActivity extends Activity {
    private static final String EXTRA_POPUP_AD = "AndroidWebViewPopupActivity.EXTRA_POPUP_AD";
    private Ad ad;
    private WebView popupWebView;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        private Companion() {
        }
    }

    @SuppressLint({"AddJavascriptInterface", "SetJavaScriptEnabled"})
    private final void loadPopup(final String str) {
        if (str == null) {
            return;
        }
        WebView webView = this.popupWebView;
        WebView webView2 = null;
        if (webView == null) {
            r.p("popupWebView");
            webView = null;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        WebView webView3 = this.popupWebView;
        if (webView3 == null) {
            r.p("popupWebView");
            webView3 = null;
        }
        Ad ad = this.ad;
        if (ad == null) {
            r.p("ad");
            ad = null;
        }
        webView3.addJavascriptInterface(new JavascriptBridge(ad), "AdAdapted");
        WebView webView4 = this.popupWebView;
        if (webView4 == null) {
            r.p("popupWebView");
            webView4 = null;
        }
        webView4.setWebViewClient(new WebViewClient() { // from class: com.adadapted.android.sdk.core.view.AaWebViewPopupActivity.loadPopup.1
            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView5, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                r.e(webView5, "view");
                r.e(webResourceRequest, "request");
                r.e(webResourceError, "error");
                super.onReceivedError(webView5, webResourceRequest, webResourceError);
                AALogger.INSTANCE.logError("onReceivedError: " + webResourceRequest + " " + webResourceError);
                HashMap hashMap = new HashMap();
                hashMap.put("url", str);
                hashMap.put("error", webResourceError.getDescription().toString());
                EventClient.INSTANCE.trackSdkError(EventStrings.POPUP_URL_LOAD_FAILED, "Problem loading popup url", hashMap);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView5, WebResourceRequest webResourceRequest) {
                r.e(webView5, "view");
                r.e(webResourceRequest, "request");
                return false;
            }
        });
        WebView webView5 = this.popupWebView;
        if (webView5 == null) {
            r.p("popupWebView");
        } else {
            webView2 = webView5;
        }
        webView2.loadUrl(str);
    }

    public final Intent createActivity(Context context, Ad ad) {
        r.e(context, "context");
        r.e(ad, "ad");
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) AaWebViewPopupActivity.class);
        intent.putExtra(EXTRA_POPUP_AD, l7.a.f38819d.b(Ad.Companion.serializer(), ad));
        intent.addFlags(268435456);
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            super.onCreate(r14)
            android.widget.RelativeLayout$LayoutParams r14 = new android.widget.RelativeLayout$LayoutParams
            r0 = -1
            r14.<init>(r0, r0)
            android.webkit.WebView r0 = new android.webkit.WebView
            r0.<init>(r13)
            r13.popupWebView = r0
            r0.setLayoutParams(r14)
            android.widget.RelativeLayout r14 = new android.widget.RelativeLayout
            r14.<init>(r13)
            android.webkit.WebView r0 = r13.popupWebView
            r1 = 0
            if (r0 != 0) goto L23
            java.lang.String r0 = "popupWebView"
            J6.r.p(r0)
            r0 = r1
        L23:
            r14.addView(r0)
            r13.setContentView(r14)
            java.lang.String r14 = "Featured"
            r13.setTitle(r14)
            android.content.Intent r14 = r13.getIntent()
            java.lang.String r0 = "AndroidWebViewPopupActivity.EXTRA_POPUP_AD"
            java.lang.String r14 = r14.getStringExtra(r0)
            if (r14 == 0) goto L57
            l7.a$a r0 = l7.a.f38819d
            n7.b r2 = r0.a()
            java.lang.Class<com.adadapted.android.sdk.core.ad.Ad> r3 = com.adadapted.android.sdk.core.ad.Ad.class
            Q6.k r3 = J6.H.i(r3)
            g7.b r2 = g7.j.c(r2, r3)
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>"
            J6.r.c(r2, r3)
            java.lang.Object r14 = r0.c(r2, r14)
            com.adadapted.android.sdk.core.ad.Ad r14 = (com.adadapted.android.sdk.core.ad.Ad) r14
            if (r14 != 0) goto L68
        L57:
            com.adadapted.android.sdk.core.ad.Ad r14 = new com.adadapted.android.sdk.core.ad.Ad
            r11 = 127(0x7f, float:1.78E-43)
            r12 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r12)
        L68:
            r13.ad = r14
            java.lang.String r14 = r14.getActionPath()
            r0 = 0
            r2 = 2
            java.lang.String r3 = "http"
            boolean r14 = S6.h.B(r14, r3, r0, r2, r1)
            java.lang.String r0 = "ad"
            if (r14 == 0) goto L8b
            com.adadapted.android.sdk.core.ad.Ad r14 = r13.ad
            if (r14 != 0) goto L82
            J6.r.p(r0)
            goto L83
        L82:
            r1 = r14
        L83:
            java.lang.String r14 = r1.getActionPath()
            r13.loadPopup(r14)
            goto Lb4
        L8b:
            com.adadapted.android.sdk.core.event.EventClient r14 = com.adadapted.android.sdk.core.event.EventClient.INSTANCE
            com.adadapted.android.sdk.core.ad.Ad r2 = r13.ad
            if (r2 != 0) goto L95
            J6.r.p(r0)
            goto L96
        L95:
            r1 = r2
        L96:
            java.lang.String r0 = r1.getId()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Incorrect Action Path URL supplied for Ad: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            r4 = 4
            r5 = 0
            java.lang.String r1 = "POPUP_URL_MALFORMED"
            r3 = 0
            r0 = r14
            com.adadapted.android.sdk.core.event.EventClient.trackSdkError$default(r0, r1, r2, r3, r4, r5)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adadapted.android.sdk.core.view.AaWebViewPopupActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        r.e(keyEvent, "event");
        if (i8 == 4) {
            WebView webView = this.popupWebView;
            WebView webView2 = null;
            if (webView == null) {
                r.p("popupWebView");
                webView = null;
            }
            if (webView.canGoBack()) {
                WebView webView3 = this.popupWebView;
                if (webView3 == null) {
                    r.p("popupWebView");
                } else {
                    webView2 = webView3;
                }
                webView2.goBack();
                return true;
            }
        }
        return super.onKeyDown(i8, keyEvent);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        EventClient eventClient = EventClient.INSTANCE;
        Ad ad = this.ad;
        if (ad == null) {
            r.p("ad");
            ad = null;
        }
        eventClient.trackPopupBegin(ad);
    }
}
