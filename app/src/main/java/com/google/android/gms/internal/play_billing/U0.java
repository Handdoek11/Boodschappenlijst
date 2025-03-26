package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class U0 {

    /* renamed from: d, reason: collision with root package name */
    static final U0 f29838d = new U0();

    /* renamed from: a, reason: collision with root package name */
    final Runnable f29839a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f29840b;

    /* renamed from: c, reason: collision with root package name */
    U0 f29841c;

    U0() {
        this.f29839a = null;
        this.f29840b = null;
    }

    U0(Runnable runnable, Executor executor) {
        this.f29839a = runnable;
        this.f29840b = executor;
    }
}
