package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.ja, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ThreadFactoryC3065ja implements ThreadFactory {

    /* renamed from: o, reason: collision with root package name */
    private final ThreadFactory f23276o = Executors.defaultThreadFactory();

    /* renamed from: s, reason: collision with root package name */
    private final AtomicInteger f23277s = new AtomicInteger(1);

    ThreadFactoryC3065ja() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f23277s;
        Thread newThread = this.f23276o.newThread(runnable);
        newThread.setName("gads-" + atomicInteger.getAndIncrement());
        return newThread;
    }
}
