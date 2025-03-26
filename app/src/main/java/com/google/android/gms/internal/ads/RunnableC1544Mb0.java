package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.Mb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC1544Mb0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final WebView f17373o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ C1579Nb0 f17374s;

    RunnableC1544Mb0(C1579Nb0 c1579Nb0) {
        this.f17374s = c1579Nb0;
        this.f17373o = c1579Nb0.f17571e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17373o.destroy();
    }
}
