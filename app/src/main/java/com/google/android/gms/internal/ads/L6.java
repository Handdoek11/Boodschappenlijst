package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class L6 implements Executor {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Handler f16762o;

    L6(N6 n62, Handler handler) {
        this.f16762o = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f16762o.post(runnable);
    }
}
