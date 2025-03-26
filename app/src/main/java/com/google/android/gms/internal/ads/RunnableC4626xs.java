package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.xs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4626xs implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f27932o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f27933s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ int f27934t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ AbstractC1141As f27935u;

    RunnableC4626xs(AbstractC1141As abstractC1141As, String str, String str2, int i8) {
        this.f27932o = str;
        this.f27933s = str2;
        this.f27934t = i8;
        this.f27935u = abstractC1141As;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f27932o);
        hashMap.put("cachedSrc", this.f27933s);
        hashMap.put("totalBytes", Integer.toString(this.f27934t));
        AbstractC1141As.a(this.f27935u, "onPrecacheEvent", hashMap);
    }
}
