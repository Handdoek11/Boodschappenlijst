package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.Wp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ThreadFactoryC1915Wp implements ThreadFactory {

    /* renamed from: o, reason: collision with root package name */
    private final AtomicInteger f19847o = new AtomicInteger(1);

    ThreadFactoryC1915Wp(C1950Xp c1950Xp) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(SCION_TASK_EXECUTOR) #" + this.f19847o.getAndIncrement());
    }
}
