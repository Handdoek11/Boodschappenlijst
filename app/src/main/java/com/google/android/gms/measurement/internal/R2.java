package com.google.android.gms.measurement.internal;

import java.lang.Thread;

/* loaded from: classes2.dex */
final class R2 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final String f30666a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ P2 f30667b;

    public R2(P2 p22, String str) {
        this.f30667b = p22;
        Z2.r.l(str);
        this.f30666a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f30667b.h().E().b(this.f30666a, th);
    }
}
