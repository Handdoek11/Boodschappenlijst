package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.us, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4299us implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    final /* synthetic */ int f27122A;

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ AbstractC1141As f27123B;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f27124o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f27125s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ long f27126t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ long f27127u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ long f27128v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ long f27129w;

    /* renamed from: x, reason: collision with root package name */
    final /* synthetic */ long f27130x;

    /* renamed from: y, reason: collision with root package name */
    final /* synthetic */ boolean f27131y;

    /* renamed from: z, reason: collision with root package name */
    final /* synthetic */ int f27132z;

    RunnableC4299us(AbstractC1141As abstractC1141As, String str, String str2, long j8, long j9, long j10, long j11, long j12, boolean z7, int i8, int i9) {
        this.f27124o = str;
        this.f27125s = str2;
        this.f27126t = j8;
        this.f27127u = j9;
        this.f27128v = j10;
        this.f27129w = j11;
        this.f27130x = j12;
        this.f27131y = z7;
        this.f27132z = i8;
        this.f27122A = i9;
        this.f27123B = abstractC1141As;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f27124o);
        hashMap.put("cachedSrc", this.f27125s);
        hashMap.put("bufferedDuration", Long.toString(this.f27126t));
        hashMap.put("totalDuration", Long.toString(this.f27127u));
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23824Y1)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f27128v));
            hashMap.put("qoeCachedBytes", Long.toString(this.f27129w));
            hashMap.put("totalBytes", Long.toString(this.f27130x));
            hashMap.put("reportTime", Long.toString(C2.v.c().a()));
        }
        hashMap.put("cacheReady", true != this.f27131y ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f27132z));
        hashMap.put("playerPreparedCount", Integer.toString(this.f27122A));
        AbstractC1141As.a(this.f27123B, "onPrecacheEvent", hashMap);
    }
}
