package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.Gq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ThreadFactoryC1355Gq implements ThreadFactory {

    /* renamed from: o, reason: collision with root package name */
    private final AtomicInteger f15445o = new AtomicInteger(1);

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f15446s;

    ThreadFactoryC1355Gq(String str) {
        this.f15446s = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f15446s + ") #" + this.f15445o.getAndIncrement());
    }
}
