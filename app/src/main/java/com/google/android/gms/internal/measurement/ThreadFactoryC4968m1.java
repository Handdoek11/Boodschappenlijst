package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.measurement.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ThreadFactoryC4968m1 implements ThreadFactory {

    /* renamed from: o, reason: collision with root package name */
    private ThreadFactory f29451o = Executors.defaultThreadFactory();

    ThreadFactoryC4968m1(C4889d1 c4889d1) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f29451o.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
