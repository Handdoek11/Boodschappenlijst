package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Vd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1863Vd0 implements InterfaceC1828Ud0 {
    /* synthetic */ C1863Vd0(AbstractC1898Wd0 abstractC1898Wd0) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1828Ud0
    public final ExecutorService a(int i8, ThreadFactory threadFactory, int i9) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i8, i8, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1828Ud0
    public final ExecutorService b(ThreadFactory threadFactory, int i8) {
        return a(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1828Ud0
    public final ExecutorService m(int i8) {
        return a(1, Executors.defaultThreadFactory(), 2);
    }
}
