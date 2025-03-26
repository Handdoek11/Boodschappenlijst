package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.c80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ThreadFactoryC2266c80 implements ThreadFactory {

    /* renamed from: o, reason: collision with root package name */
    private final AtomicInteger f21081o = new AtomicInteger(1);

    ThreadFactoryC2266c80() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(NG) #" + this.f21081o.getAndIncrement());
    }
}
