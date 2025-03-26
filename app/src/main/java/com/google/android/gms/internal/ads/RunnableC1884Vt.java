package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Vt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC1884Vt implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1919Wt f19666o;

    RunnableC1884Vt(ViewTreeObserverOnGlobalLayoutListenerC1919Wt viewTreeObserverOnGlobalLayoutListenerC1919Wt) {
        this.f19666o = viewTreeObserverOnGlobalLayoutListenerC1919Wt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
