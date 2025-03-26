package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
class b implements ThreadFactory {

    /* renamed from: v, reason: collision with root package name */
    private static final ThreadFactory f32729v = Executors.defaultThreadFactory();

    /* renamed from: o, reason: collision with root package name */
    private final AtomicLong f32730o = new AtomicLong();

    /* renamed from: s, reason: collision with root package name */
    private final String f32731s;

    /* renamed from: t, reason: collision with root package name */
    private final int f32732t;

    /* renamed from: u, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f32733u;

    b(String str, int i8, StrictMode.ThreadPolicy threadPolicy) {
        this.f32731s = str;
        this.f32732t = i8;
        this.f32733u = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f32732t);
        StrictMode.ThreadPolicy threadPolicy = this.f32733u;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f32729v.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f32727o.b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f32731s, Long.valueOf(this.f32730o.getAndIncrement())));
        return newThread;
    }
}
