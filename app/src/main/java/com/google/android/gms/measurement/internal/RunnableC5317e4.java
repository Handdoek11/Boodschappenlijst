package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.e4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5317e4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f30932o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f30933s = null;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ String f30934t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ String f30935u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ F3 f30936v;

    RunnableC5317e4(F3 f32, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f30932o = atomicReference;
        this.f30934t = str2;
        this.f30935u = str3;
        this.f30936v = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30936v.f31239a.H().O(this.f30932o, null, this.f30934t, this.f30935u);
    }
}
