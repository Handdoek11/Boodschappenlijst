package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.android.billingclient.api.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ThreadFactoryC1066n implements ThreadFactory {

    /* renamed from: o, reason: collision with root package name */
    private final ThreadFactory f12465o = Executors.defaultThreadFactory();

    /* renamed from: s, reason: collision with root package name */
    private final AtomicInteger f12466s = new AtomicInteger(1);

    ThreadFactoryC1066n(C1054b c1054b) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f12466s;
        Thread newThread = this.f12465o.newThread(runnable);
        newThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return newThread;
    }
}
