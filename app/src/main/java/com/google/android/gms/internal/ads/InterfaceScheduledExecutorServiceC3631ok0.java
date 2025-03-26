package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ok0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceScheduledExecutorServiceC3631ok0 extends ScheduledExecutorService, InterfaceExecutorServiceC3522nk0 {
    InterfaceScheduledFutureC3413mk0 M(Callable callable, long j8, TimeUnit timeUnit);
}
