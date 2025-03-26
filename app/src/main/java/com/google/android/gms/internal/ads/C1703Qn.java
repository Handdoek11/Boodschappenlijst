package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.ads.Qn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1703Qn implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Thread.UncaughtExceptionHandler f18533a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1773Sn f18534b;

    C1703Qn(C1773Sn c1773Sn, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f18533a = uncaughtExceptionHandler;
        this.f18534b = c1773Sn;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f18534b.i(thread, th);
            } catch (Throwable unused) {
                H2.p.d("AdMob exception reporter failed reporting the exception.");
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f18533a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f18533a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
