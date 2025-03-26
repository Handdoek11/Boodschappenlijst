package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ys, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4735ys implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f28212o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f28213s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ long f28214t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ AbstractC1141As f28215u;

    RunnableC4735ys(AbstractC1141As abstractC1141As, String str, String str2, long j8) {
        this.f28212o = str;
        this.f28213s = str2;
        this.f28214t = j8;
        this.f28215u = abstractC1141As;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f28212o);
        hashMap.put("cachedSrc", this.f28213s);
        hashMap.put("totalDuration", Long.toString(this.f28214t));
        AbstractC1141As.a(this.f28215u, "onPrecacheEvent", hashMap);
    }
}
