package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ws, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4517ws implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    final /* synthetic */ AbstractC1141As f27565A;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f27566o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f27567s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ int f27568t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ int f27569u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ long f27570v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ long f27571w;

    /* renamed from: x, reason: collision with root package name */
    final /* synthetic */ boolean f27572x;

    /* renamed from: y, reason: collision with root package name */
    final /* synthetic */ int f27573y;

    /* renamed from: z, reason: collision with root package name */
    final /* synthetic */ int f27574z;

    RunnableC4517ws(AbstractC1141As abstractC1141As, String str, String str2, int i8, int i9, long j8, long j9, boolean z7, int i10, int i11) {
        this.f27566o = str;
        this.f27567s = str2;
        this.f27568t = i8;
        this.f27569u = i9;
        this.f27570v = j8;
        this.f27571w = j9;
        this.f27572x = z7;
        this.f27573y = i10;
        this.f27574z = i11;
        this.f27565A = abstractC1141As;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f27566o);
        hashMap.put("cachedSrc", this.f27567s);
        hashMap.put("bytesLoaded", Integer.toString(this.f27568t));
        hashMap.put("totalBytes", Integer.toString(this.f27569u));
        hashMap.put("bufferedDuration", Long.toString(this.f27570v));
        hashMap.put("totalDuration", Long.toString(this.f27571w));
        hashMap.put("cacheReady", true != this.f27572x ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f27573y));
        hashMap.put("playerPreparedCount", Integer.toString(this.f27574z));
        AbstractC1141As.a(this.f27565A, "onPrecacheEvent", hashMap);
    }
}
