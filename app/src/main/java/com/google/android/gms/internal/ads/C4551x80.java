package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.x80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4551x80 implements com.google.common.util.concurrent.d {

    /* renamed from: o, reason: collision with root package name */
    private final Object f27754o;

    /* renamed from: s, reason: collision with root package name */
    private final String f27755s;

    /* renamed from: t, reason: collision with root package name */
    private final com.google.common.util.concurrent.d f27756t;

    public C4551x80(Object obj, String str, com.google.common.util.concurrent.d dVar) {
        this.f27754o = obj;
        this.f27755s = str;
        this.f27756t = dVar;
    }

    public final Object a() {
        return this.f27754o;
    }

    public final String b() {
        return this.f27755s;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        return this.f27756t.cancel(z7);
    }

    @Override // com.google.common.util.concurrent.d
    public final void f(Runnable runnable, Executor executor) {
        this.f27756t.f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f27756t.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f27756t.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f27756t.isDone();
    }

    public final String toString() {
        return this.f27755s + "@" + System.identityHashCode(this);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return this.f27756t.get(j8, timeUnit);
    }
}
