package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class N3 implements Executor {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ F3 f30624o;

    N3(F3 f32) {
        this.f30624o = f32;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f30624o.j().B(runnable);
    }
}
