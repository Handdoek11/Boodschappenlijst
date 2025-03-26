package com.adadapted.android.sdk.core.view;

import J6.G;
import J6.r;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.adadapted.android.sdk.core.ad.Ad;
import com.adadapted.android.sdk.core.ad.AdContentListener;
import com.adadapted.android.sdk.core.ad.AdContentPublisher;
import com.adadapted.android.sdk.core.device.DeviceInfo;
import com.adadapted.android.sdk.core.device.DeviceInfoClient;
import com.adadapted.android.sdk.core.session.SessionClient;
import com.adadapted.android.sdk.core.view.AdWebView;
import com.adadapted.android.sdk.core.view.Dimension;

/* loaded from: classes.dex */
public final class AaZoneView extends RelativeLayout implements AdZonePresenterListener, AdWebView.Listener {
    public static final int $stable = 8;
    private boolean isAdVisible;
    private boolean isAdaptiveSizingEnabled;
    private boolean isVisible;
    private AdZonePresenter presenter;
    private ImageButton reportButton;
    private AdWebView webView;
    private boolean webViewLoaded;
    private Listener zoneViewListener;

    public interface Listener {
        void onAdLoadFailed();

        void onAdLoaded();

        void onZoneHasAds(boolean z7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AaZoneView(Context context) {
        super(context.getApplicationContext());
        r.e(context, "context");
        Context context2 = getContext();
        r.d(context2, "getContext(...)");
        this.presenter = new AdZonePresenter(new AdViewHandler(context2), SessionClient.INSTANCE);
        this.isVisible = true;
        this.isAdVisible = true;
        setup(context);
    }

    private final void loadWebViewAd(final Ad ad) {
        boolean z7 = this.isVisible;
        if (z7 && this.isAdVisible && !this.webViewLoaded) {
            this.webViewLoaded = true;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.adadapted.android.sdk.core.view.b
                @Override // java.lang.Runnable
                public final void run() {
                    AaZoneView.loadWebViewAd$lambda$7(this.f12253o, ad);
                }
            });
        } else if (z7 && this.webViewLoaded) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.adadapted.android.sdk.core.view.c
                @Override // java.lang.Runnable
                public final void run() {
                    AaZoneView.loadWebViewAd$lambda$8(this.f12255o, ad);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadWebViewAd$lambda$7(AaZoneView aaZoneView, Ad ad) {
        r.e(aaZoneView, "this$0");
        r.e(ad, "$ad");
        AdWebView adWebView = aaZoneView.webView;
        if (adWebView == null) {
            r.p("webView");
            adWebView = null;
        }
        adWebView.loadAd(ad);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadWebViewAd$lambda$8(AaZoneView aaZoneView, Ad ad) {
        r.e(aaZoneView, "this$0");
        r.e(ad, "$ad");
        AdWebView adWebView = aaZoneView.webView;
        if (adWebView == null) {
            r.p("webView");
            adWebView = null;
        }
        adWebView.loadAd(ad);
    }

    private final void notifyClientAdLoadFailed() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.adadapted.android.sdk.core.view.a
            @Override // java.lang.Runnable
            public final void run() {
                AaZoneView.notifyClientAdLoadFailed$lambda$11(this.f12252o);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyClientAdLoadFailed$lambda$11(AaZoneView aaZoneView) {
        r.e(aaZoneView, "this$0");
        Listener listener = aaZoneView.zoneViewListener;
        if (listener != null) {
            listener.onAdLoadFailed();
        }
    }

    private final void notifyClientAdLoaded() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.adadapted.android.sdk.core.view.d
            @Override // java.lang.Runnable
            public final void run() {
                AaZoneView.notifyClientAdLoaded$lambda$10(this.f12257o);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyClientAdLoaded$lambda$10(AaZoneView aaZoneView) {
        r.e(aaZoneView, "this$0");
        Listener listener = aaZoneView.zoneViewListener;
        if (listener != null) {
            listener.onAdLoaded();
        }
    }

    private final void notifyClientZoneHasAds(final boolean z7) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.adadapted.android.sdk.core.view.j
            @Override // java.lang.Runnable
            public final void run() {
                AaZoneView.notifyClientZoneHasAds$lambda$9(this.f12266o, z7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyClientZoneHasAds$lambda$9(AaZoneView aaZoneView, boolean z7) {
        r.e(aaZoneView, "this$0");
        Listener listener = aaZoneView.zoneViewListener;
        if (listener != null) {
            listener.onZoneHasAds(z7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNoAdAvailable$lambda$6(AaZoneView aaZoneView) {
        r.e(aaZoneView, "this$0");
        AdWebView adWebView = aaZoneView.webView;
        if (adWebView == null) {
            r.p("webView");
            adWebView = null;
        }
        adWebView.loadBlank();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onZoneAvailable$lambda$5(AaZoneView aaZoneView, G g8) {
        r.e(aaZoneView, "this$0");
        r.e(g8, "$adjustedLayoutParams");
        AdWebView adWebView = aaZoneView.webView;
        ImageButton imageButton = null;
        if (adWebView == null) {
            r.p("webView");
            adWebView = null;
        }
        adWebView.setLayoutParams((ViewGroup.LayoutParams) g8.f3547o);
        ImageButton imageButton2 = aaZoneView.reportButton;
        if (imageButton2 == null) {
            r.p("reportButton");
            imageButton2 = null;
        }
        if (aaZoneView.indexOfChild(imageButton2) == -1) {
            ImageButton imageButton3 = aaZoneView.reportButton;
            if (imageButton3 == null) {
                r.p("reportButton");
            } else {
                imageButton = imageButton3;
            }
            aaZoneView.addView(imageButton);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resizeAdZoneView$lambda$4(int i8, int i9, AaZoneView aaZoneView) {
        r.e(aaZoneView, "this$0");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i8, i9);
        aaZoneView.setLayoutParams(layoutParams);
        AdWebView adWebView = aaZoneView.webView;
        if (adWebView == null) {
            r.p("webView");
            adWebView = null;
        }
        adWebView.setLayoutParams(layoutParams);
    }

    private final void setInvisible() {
        this.isVisible = false;
        this.presenter.onDetach();
    }

    private final void setVisible() {
        this.isVisible = true;
        this.presenter.onAttach(this);
    }

    private final void setup(Context context) {
        Context applicationContext = context.getApplicationContext();
        r.d(applicationContext, "getApplicationContext(...)");
        this.webView = new AdWebView(applicationContext, this);
        ImageButton imageButton = new ImageButton(getContext());
        this.reportButton = imageButton;
        imageButton.setImageResource(D1.a.f1134a);
        ImageButton imageButton2 = this.reportButton;
        ImageButton imageButton3 = null;
        if (imageButton2 == null) {
            r.p("reportButton");
            imageButton2 = null;
        }
        imageButton2.setColorFilter(Color.rgb(0, 175, 204));
        ImageButton imageButton4 = this.reportButton;
        if (imageButton4 == null) {
            r.p("reportButton");
            imageButton4 = null;
        }
        imageButton4.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        ImageButton imageButton5 = this.reportButton;
        if (imageButton5 == null) {
            r.p("reportButton");
            imageButton5 = null;
        }
        imageButton5.setLayoutParams(layoutParams);
        layoutParams.addRule(21);
        layoutParams.addRule(10);
        layoutParams.setMarginEnd(4);
        layoutParams.topMargin = 4;
        ImageButton imageButton6 = this.reportButton;
        if (imageButton6 == null) {
            r.p("reportButton");
        } else {
            imageButton3 = imageButton6;
        }
        imageButton3.setOnClickListener(new View.OnClickListener() { // from class: com.adadapted.android.sdk.core.view.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AaZoneView.setup$lambda$2(this.f12260o, view);
            }
        });
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.adadapted.android.sdk.core.view.g
            @Override // java.lang.Runnable
            public final void run() {
                AaZoneView.setup$lambda$3(this.f12261o);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setup$lambda$2(AaZoneView aaZoneView, View view) {
        String udid;
        String id;
        r.e(aaZoneView, "this$0");
        DeviceInfo cachedDeviceInfo = DeviceInfoClient.INSTANCE.getCachedDeviceInfo();
        if (cachedDeviceInfo == null || (udid = cachedDeviceInfo.getUdid()) == null) {
            return;
        }
        AdWebView adWebView = aaZoneView.webView;
        if (adWebView == null) {
            r.p("webView");
            adWebView = null;
        }
        Ad currentAd = adWebView.getCurrentAd();
        if (currentAd == null || (id = currentAd.getId()) == null) {
            return;
        }
        aaZoneView.presenter.onReportAdClicked(id, udid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setup$lambda$3(AaZoneView aaZoneView) {
        r.e(aaZoneView, "this$0");
        AdWebView adWebView = aaZoneView.webView;
        if (adWebView == null) {
            r.p("webView");
            adWebView = null;
        }
        aaZoneView.addView(adWebView);
    }

    public final void clearAdZoneContext() {
        this.presenter.clearZoneContext();
    }

    public final void enableAdaptiveSizing(boolean z7) {
        this.isAdaptiveSizingEnabled = z7;
    }

    public final void init(String str) {
        r.e(str, "zoneId");
        this.presenter.init(str);
    }

    @Override // com.adadapted.android.sdk.core.view.AdZonePresenterListener
    public void onAdAvailable(Ad ad) {
        r.e(ad, "ad");
        loadWebViewAd(ad);
    }

    @Override // com.adadapted.android.sdk.core.view.AdWebView.Listener
    public void onAdInWebViewClicked(Ad ad) {
        r.e(ad, "ad");
        this.presenter.onAdClicked(ad);
    }

    @Override // com.adadapted.android.sdk.core.view.AdWebView.Listener
    public void onAdLoadInWebViewFailed() {
        this.presenter.onAdDisplayFailed();
        notifyClientAdLoadFailed();
    }

    @Override // com.adadapted.android.sdk.core.view.AdWebView.Listener
    public void onAdLoadedInWebView(Ad ad) {
        r.e(ad, "ad");
        this.presenter.onAdDisplayed(ad, this.isAdVisible);
        notifyClientAdLoaded();
    }

    @Override // com.adadapted.android.sdk.core.view.AdZonePresenterListener
    public void onAdVisibilityChanged(Ad ad) {
        r.e(ad, "ad");
        if (this.webViewLoaded) {
            return;
        }
        loadWebViewAd(ad);
    }

    @Override // com.adadapted.android.sdk.core.view.AdZonePresenterListener
    public void onAdsRefreshed(Zone zone) {
        r.e(zone, "zone");
        notifyClientZoneHasAds(zone.hasAds());
    }

    @Override // com.adadapted.android.sdk.core.view.AdWebView.Listener
    public void onBlankAdInWebViewLoaded() {
        this.presenter.onBlankDisplayed();
    }

    @Override // com.adadapted.android.sdk.core.view.AdZonePresenterListener
    public void onNoAdAvailable() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.adadapted.android.sdk.core.view.h
            @Override // java.lang.Runnable
            public final void run() {
                AaZoneView.onNoAdAvailable$lambda$6(this.f12262o);
            }
        });
    }

    public final void onStart() {
        this.presenter.onAttach(this);
    }

    public final void onStop() {
        this.zoneViewListener = null;
        this.presenter.onDetach();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i8) {
        r.e(view, "changedView");
        super.onVisibilityChanged(view, i8);
        if (i8 == 0) {
            setVisible();
        } else if (i8 == 4) {
            setInvisible();
        } else {
            if (i8 != 8) {
                return;
            }
            setInvisible();
        }
    }

    @Override // com.adadapted.android.sdk.core.view.AdZonePresenterListener
    public void onZoneAvailable(Zone zone) {
        RelativeLayout.LayoutParams layoutParams;
        r.e(zone, "zone");
        final G g8 = new G();
        g8.f3547o = new RelativeLayout.LayoutParams(getWidth(), getHeight());
        if (getWidth() == 0 || getHeight() == 0) {
            if (this.isAdaptiveSizingEnabled) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            } else {
                Dimension dimension = zone.getDimensions().get(Dimension.Orientation.PORT);
                layoutParams = new RelativeLayout.LayoutParams(dimension != null ? dimension.getWidth() : -1, dimension != null ? dimension.getHeight() : -1);
            }
            g8.f3547o = layoutParams;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.adadapted.android.sdk.core.view.e
            @Override // java.lang.Runnable
            public final void run() {
                AaZoneView.onZoneAvailable$lambda$5(this.f12258o, g8);
            }
        });
        notifyClientZoneHasAds(zone.hasAds());
    }

    public final void removeAdZoneContext() {
        this.presenter.removeZoneContext();
    }

    public final void resizeAdZoneView(final int i8, final int i9) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.adadapted.android.sdk.core.view.i
            @Override // java.lang.Runnable
            public final void run() {
                AaZoneView.resizeAdZoneView$lambda$4(i8, i9, this);
            }
        });
    }

    public final void setAdZoneContextId(String str) {
        r.e(str, "contextId");
        this.presenter.setZoneContext(str);
    }

    public final void setAdZoneVisibility(boolean z7) {
        this.isAdVisible = z7;
        this.presenter.onAdVisibilityChanged(z7);
    }

    public final void shutdown() {
        onStop();
    }

    public final void onStart(Listener listener) {
        r.e(listener, "listener");
        this.zoneViewListener = listener;
        onStart();
    }

    public final void onStop(AdContentListener adContentListener) {
        r.e(adContentListener, "listener");
        AdContentPublisher.INSTANCE.removeListener(adContentListener);
        onStop();
    }

    public final void onStart(Listener listener, AdContentListener adContentListener) {
        r.e(listener, "listener");
        r.e(adContentListener, "contentListener");
        AdContentPublisher.INSTANCE.addListener(adContentListener);
        onStart(listener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AaZoneView(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        r.e(context, "context");
        r.e(attributeSet, "attrs");
        Context context2 = getContext();
        r.d(context2, "getContext(...)");
        this.presenter = new AdZonePresenter(new AdViewHandler(context2), SessionClient.INSTANCE);
        this.isVisible = true;
        this.isAdVisible = true;
        setup(context);
    }

    public final void onStart(AdContentListener adContentListener) {
        r.e(adContentListener, "contentListener");
        AdContentPublisher.INSTANCE.addListener(adContentListener);
        onStart();
    }
}
