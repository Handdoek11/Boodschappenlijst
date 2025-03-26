package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ts, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4190ts implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f26940o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f26941s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ int f26942t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ int f26943u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ AbstractC1141As f26944v;

    RunnableC4190ts(AbstractC1141As abstractC1141As, String str, String str2, int i8, int i9, boolean z7) {
        this.f26940o = str;
        this.f26941s = str2;
        this.f26942t = i8;
        this.f26943u = i9;
        this.f26944v = abstractC1141As;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f26940o);
        hashMap.put("cachedSrc", this.f26941s);
        hashMap.put("bytesLoaded", Integer.toString(this.f26942t));
        hashMap.put("totalBytes", Integer.toString(this.f26943u));
        hashMap.put("cacheReady", "0");
        AbstractC1141As.a(this.f26944v, "onPrecacheEvent", hashMap);
    }
}
