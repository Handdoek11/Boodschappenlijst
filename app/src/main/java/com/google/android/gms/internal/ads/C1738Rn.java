package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.ads.Rn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1738Rn implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Thread.UncaughtExceptionHandler f18697a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1773Sn f18698b;

    C1738Rn(C1773Sn c1773Sn, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f18697a = uncaughtExceptionHandler;
        this.f18698b = c1773Sn;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f18698b.i(thread, th);
            } catch (Throwable unused) {
                H2.p.d("AdMob exception reporter failed reporting the exception.");
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f18697a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f18697a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
