package com.adadapted.android.sdk.core.view;

import J6.r;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adadapted.android.sdk.core.ad.Ad;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

@SuppressLint({"ClickableViewAccessibility", "SetJavaScriptEnabled", "ViewConstructor"})
/* loaded from: classes.dex */
public final class AdWebView extends WebView {
    public static final int $stable = 8;
    private Ad currentAd;
    private final Listener listener;
    private boolean loaded;

    public interface Listener {
        void onAdInWebViewClicked(Ad ad);

        void onAdLoadInWebViewFailed();

        void onAdLoadedInWebView(Ad ad);

        void onBlankAdInWebViewLoaded();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdWebView(Context context, Listener listener) {
        super(context.getApplicationContext());
        r.e(context, "context");
        r.e(listener, "listener");
        this.listener = listener;
        setLayerType(1, null);
        setBackgroundColor(0);
        setOnTouchListener(new View.OnTouchListener() { // from class: com.adadapted.android.sdk.core.view.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AdWebView._init_$lambda$4(this.f12268o, view, motionEvent);
            }
        });
        setWebViewClient(new WebViewClient() { // from class: com.adadapted.android.sdk.core.view.AdWebView.2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                String id;
                r.e(webView, "view");
                r.e(str, "url");
                super.onPageFinished(webView, str);
                Ad currentAd = AdWebView.this.getCurrentAd();
                if (currentAd == null || (id = currentAd.getId()) == null || id.length() <= 0 || AdWebView.this.loaded) {
                    return;
                }
                AdWebView.this.loaded = true;
                AdWebView.this.notifyAdLoaded();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                String id;
                r.e(webView, "view");
                r.e(webResourceRequest, "request");
                r.e(webResourceError, "error");
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                Ad currentAd = AdWebView.this.getCurrentAd();
                if (currentAd == null || (id = currentAd.getId()) == null || id.length() <= 0 || AdWebView.this.loaded) {
                    return;
                }
                AdWebView.this.loaded = true;
                AdWebView.this.notifyAdLoadFailed();
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                r.e(webView, "view");
                r.e(webResourceRequest, "request");
                return true;
            }
        });
        getSettings().setJavaScriptEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$4(AdWebView adWebView, View view, MotionEvent motionEvent) {
        r.e(adWebView, "this$0");
        int action = motionEvent.getAction();
        if (action != 1) {
            return action == 2;
        }
        Ad ad = adWebView.currentAd;
        if (ad != null && ad.getId() != null) {
            adWebView.notifyAdClicked();
        }
        return true;
    }

    private final void notifyAdClicked() {
        Ad ad = this.currentAd;
        if (ad != null) {
            this.listener.onAdInWebViewClicked(ad);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyAdLoadFailed() {
        this.listener.onAdLoadInWebViewFailed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyAdLoaded() {
        Ad ad = this.currentAd;
        if (ad != null) {
            this.listener.onAdLoadedInWebView(ad);
        }
    }

    private final void notifyBlankLoaded() {
        this.listener.onBlankAdInWebViewLoaded();
    }

    public final Ad getCurrentAd() {
        return this.currentAd;
    }

    public final void loadAd(Ad ad) {
        String url;
        r.e(ad, "ad");
        this.currentAd = ad;
        this.loaded = false;
        if (ad == null || (url = ad.getUrl()) == null) {
            return;
        }
        loadUrl(url);
    }

    public final void loadBlank() {
        this.currentAd = new Ad(null, null, null, null, null, null, 0L, ModuleDescriptor.MODULE_VERSION, null);
        loadData("<html><head><meta name=\"viewport\" content=\"width=device-width, user-scalable=no\" /></head><body></body></html>", "text/html", null);
        notifyBlankLoaded();
    }

    public final void setCurrentAd(Ad ad) {
        this.currentAd = ad;
    }
}
