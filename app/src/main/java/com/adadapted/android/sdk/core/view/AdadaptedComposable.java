package com.adadapted.android.sdk.core.view;

import J6.r;
import J6.s;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.appcompat.app.E;
import com.adadapted.android.sdk.core.ad.Ad;
import com.adadapted.android.sdk.core.ad.AdContentListener;
import com.adadapted.android.sdk.core.ad.AdContentPublisher;
import com.adadapted.android.sdk.core.session.SessionClient;
import com.adadapted.android.sdk.core.view.AdWebView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import t.AbstractC6768f;
import t.C;
import t.C6776n;
import t.InterfaceC6766d;
import t.InterfaceC6775m;
import x6.C6916E;

/* loaded from: classes.dex */
public final class AdadaptedComposable implements AdZonePresenterListener {
    public static final int $stable = 8;
    private boolean isAdVisible;
    private AdZonePresenter presenter;
    private AdContentListener storedContentListener;
    private AdWebView webView;
    private boolean webViewLoaded;
    private Listener zoneViewListener;

    /* renamed from: com.adadapted.android.sdk.core.view.AdadaptedComposable$CustomZoneView$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements I6.p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ B.e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(B.e eVar, int i8) {
            super(2);
            this.$modifier = eVar;
            this.$$changed = i8;
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            E.a(obj);
            invoke((InterfaceC6766d) null, ((Number) obj2).intValue());
            return C6916E.f44463a;
        }

        public final void invoke(InterfaceC6766d interfaceC6766d, int i8) {
            AdadaptedComposable.this.CustomZoneView(this.$modifier, interfaceC6766d, C.a(this.$$changed | 1));
        }
    }

    /* renamed from: com.adadapted.android.sdk.core.view.AdadaptedComposable$InternalZoneView$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements I6.l {
        AnonymousClass2() {
            super(1);
        }

        @Override // I6.l
        public final InterfaceC6775m invoke(C6776n c6776n) {
            r.e(c6776n, "$this$DisposableEffect");
            final AdadaptedComposable adadaptedComposable = AdadaptedComposable.this;
            return new InterfaceC6775m() { // from class: com.adadapted.android.sdk.core.view.AdadaptedComposable$InternalZoneView$2$invoke$$inlined$onDispose$1
                public void dispose() {
                    adadaptedComposable.dispose();
                }
            };
        }
    }

    /* renamed from: com.adadapted.android.sdk.core.view.AdadaptedComposable$InternalZoneView$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements I6.p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ B.e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(B.e eVar, int i8) {
            super(2);
            this.$modifier = eVar;
            this.$$changed = i8;
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            E.a(obj);
            invoke((InterfaceC6766d) null, ((Number) obj2).intValue());
            return C6916E.f44463a;
        }

        public final void invoke(InterfaceC6766d interfaceC6766d, int i8) {
            AdadaptedComposable.this.InternalZoneView(this.$modifier, interfaceC6766d, C.a(this.$$changed | 1));
        }
    }

    public interface Listener {
        void onAdLoadFailed();

        void onAdLoaded();

        void onZoneHasAds(boolean z7);
    }

    /* renamed from: com.adadapted.android.sdk.core.view.AdadaptedComposable$ZoneView$1, reason: invalid class name and case insensitive filesystem */
    static final class C10521 extends s implements I6.p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10521(int i8) {
            super(2);
            this.$$changed = i8;
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            E.a(obj);
            invoke((InterfaceC6766d) null, ((Number) obj2).intValue());
            return C6916E.f44463a;
        }

        public final void invoke(InterfaceC6766d interfaceC6766d, int i8) {
            AdadaptedComposable.this.ZoneView(interfaceC6766d, C.a(this.$$changed | 1));
        }
    }

    public AdadaptedComposable(Context context) {
        r.e(context, "context");
        this.presenter = new AdZonePresenter(new AdViewHandler(context), SessionClient.INSTANCE);
        this.isAdVisible = true;
        AdWebView adWebView = new AdWebView(context, new AdWebView.Listener() { // from class: com.adadapted.android.sdk.core.view.AdadaptedComposable$webView$1
            @Override // com.adadapted.android.sdk.core.view.AdWebView.Listener
            public void onAdInWebViewClicked(Ad ad) {
                r.e(ad, "ad");
                this.this$0.presenter.onAdClicked(ad);
            }

            @Override // com.adadapted.android.sdk.core.view.AdWebView.Listener
            public void onAdLoadInWebViewFailed() {
                this.this$0.presenter.onAdDisplayFailed();
                this.this$0.notifyClientAdLoadFailed();
            }

            @Override // com.adadapted.android.sdk.core.view.AdWebView.Listener
            public void onAdLoadedInWebView(Ad ad) {
                r.e(ad, "ad");
                this.this$0.presenter.onAdDisplayed(ad, this.this$0.isAdVisible);
                this.this$0.notifyClientAdLoaded();
            }

            @Override // com.adadapted.android.sdk.core.view.AdWebView.Listener
            public void onBlankAdInWebViewLoaded() {
                this.this$0.presenter.onBlankDisplayed();
            }
        });
        adWebView.setCurrentAd(new Ad(null, null, null, null, null, null, 0L, ModuleDescriptor.MODULE_VERSION, null));
        this.webView = adWebView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void InternalZoneView(B.e eVar, InterfaceC6766d interfaceC6766d, int i8) {
        interfaceC6766d.f(712930291);
        if (AbstractC6768f.c()) {
            AbstractC6768f.e(712930291, i8, -1, "com.adadapted.android.sdk.core.view.AdadaptedComposable.InternalZoneView (AdadaptedComposable.kt:76)");
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispose() {
        AdContentListener adContentListener = this.storedContentListener;
        if (adContentListener != null) {
            AdContentPublisher.INSTANCE.removeListener(adContentListener);
        }
        this.storedContentListener = null;
        this.zoneViewListener = null;
        this.presenter.onDetach();
    }

    private final void loadWebViewAd(final Ad ad) {
        if (this.isAdVisible) {
            this.webViewLoaded = true;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.adadapted.android.sdk.core.view.n
                @Override // java.lang.Runnable
                public final void run() {
                    AdadaptedComposable.loadWebViewAd$lambda$4(this.f12272o, ad);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadWebViewAd$lambda$4(AdadaptedComposable adadaptedComposable, Ad ad) {
        r.e(adadaptedComposable, "this$0");
        r.e(ad, "$ad");
        adadaptedComposable.webView.loadAd(ad);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyClientAdLoadFailed() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.adadapted.android.sdk.core.view.m
            @Override // java.lang.Runnable
            public final void run() {
                AdadaptedComposable.notifyClientAdLoadFailed$lambda$7(this.f12271o);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyClientAdLoadFailed$lambda$7(AdadaptedComposable adadaptedComposable) {
        r.e(adadaptedComposable, "this$0");
        Listener listener = adadaptedComposable.zoneViewListener;
        if (listener != null) {
            listener.onAdLoadFailed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyClientAdLoaded() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.adadapted.android.sdk.core.view.p
            @Override // java.lang.Runnable
            public final void run() {
                AdadaptedComposable.notifyClientAdLoaded$lambda$6(this.f12275o);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyClientAdLoaded$lambda$6(AdadaptedComposable adadaptedComposable) {
        r.e(adadaptedComposable, "this$0");
        Listener listener = adadaptedComposable.zoneViewListener;
        if (listener != null) {
            listener.onAdLoaded();
        }
    }

    private final void notifyClientZoneHasAds(final boolean z7) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.adadapted.android.sdk.core.view.l
            @Override // java.lang.Runnable
            public final void run() {
                AdadaptedComposable.notifyClientZoneHasAds$lambda$5(this.f12269o, z7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyClientZoneHasAds$lambda$5(AdadaptedComposable adadaptedComposable, boolean z7) {
        r.e(adadaptedComposable, "this$0");
        Listener listener = adadaptedComposable.zoneViewListener;
        if (listener != null) {
            listener.onZoneHasAds(z7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNoAdAvailable$lambda$3(AdadaptedComposable adadaptedComposable) {
        r.e(adadaptedComposable, "this$0");
        adadaptedComposable.webView.loadBlank();
    }

    public final void CustomZoneView(B.e eVar, InterfaceC6766d interfaceC6766d, int i8) {
        r.e(eVar, "modifier");
        interfaceC6766d.f(1900280359);
        if (AbstractC6768f.c()) {
            AbstractC6768f.e(1900280359, i8, -1, "com.adadapted.android.sdk.core.view.AdadaptedComposable.CustomZoneView (AdadaptedComposable.kt:61)");
        }
        InternalZoneView(eVar, null, (i8 & 14) | 64);
        if (!AbstractC6768f.c()) {
            throw null;
        }
        AbstractC6768f.d();
        throw null;
    }

    public final void ZoneView(InterfaceC6766d interfaceC6766d, int i8) {
        interfaceC6766d.f(19649773);
        if (AbstractC6768f.c()) {
            AbstractC6768f.e(19649773, i8, -1, "com.adadapted.android.sdk.core.view.AdadaptedComposable.ZoneView (AdadaptedComposable.kt:66)");
        }
        float f8 = 4;
        InternalZoneView(androidx.compose.foundation.layout.a.b(androidx.compose.foundation.layout.b.c(androidx.compose.foundation.layout.b.b(B.e.f275a, 0.0f, 1, null), c0.i.c(100)), c0.i.c(f8), 0.0f, c0.i.c(f8), 0.0f, 10, null), null, 70);
        if (!AbstractC6768f.c()) {
            throw null;
        }
        AbstractC6768f.d();
        throw null;
    }

    public final void clearAdZoneContext() {
        this.presenter.clearZoneContext();
    }

    public final void init(String str, Listener listener, AdContentListener adContentListener) {
        r.e(str, "zoneId");
        this.presenter.init(str);
        this.storedContentListener = adContentListener;
        this.zoneViewListener = listener;
        if (adContentListener != null) {
            AdContentPublisher.INSTANCE.addListener(adContentListener);
        }
        this.presenter.onAttach(this);
        this.webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // com.adadapted.android.sdk.core.view.AdZonePresenterListener
    public void onAdAvailable(Ad ad) {
        r.e(ad, "ad");
        loadWebViewAd(ad);
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

    @Override // com.adadapted.android.sdk.core.view.AdZonePresenterListener
    public void onNoAdAvailable() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.adadapted.android.sdk.core.view.o
            @Override // java.lang.Runnable
            public final void run() {
                AdadaptedComposable.onNoAdAvailable$lambda$3(this.f12274o);
            }
        });
    }

    @Override // com.adadapted.android.sdk.core.view.AdZonePresenterListener
    public void onZoneAvailable(Zone zone) {
        r.e(zone, "zone");
        notifyClientZoneHasAds(zone.hasAds());
    }

    public final void removeAdZoneContext() {
        this.presenter.removeZoneContext();
    }

    public final void setAdZoneContextId(String str) {
        r.e(str, "contextId");
        this.presenter.setZoneContext(str);
    }

    public final void setAdZoneVisibility(boolean z7) {
        this.isAdVisible = z7;
        this.presenter.onAdVisibilityChanged(z7);
    }
}
