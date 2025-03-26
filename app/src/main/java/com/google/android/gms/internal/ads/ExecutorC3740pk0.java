package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.android.gms.internal.ads.pk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ExecutorC3740pk0 implements Executor {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Executor f25502o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ AbstractC3738pj0 f25503s;

    ExecutorC3740pk0(Executor executor, AbstractC3738pj0 abstractC3738pj0) {
        this.f25502o = executor;
        this.f25503s = abstractC3738pj0;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f25502o.execute(runnable);
        } catch (RejectedExecutionException e8) {
            this.f25503s.h(e8);
        }
    }
}
