package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.d4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5310d4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f30902o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f30903s = null;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ String f30904t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ String f30905u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ boolean f30906v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ F3 f30907w;

    RunnableC5310d4(F3 f32, AtomicReference atomicReference, String str, String str2, String str3, boolean z7) {
        this.f30902o = atomicReference;
        this.f30904t = str2;
        this.f30905u = str3;
        this.f30906v = z7;
        this.f30907w = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30907w.f31239a.H().P(this.f30902o, null, this.f30904t, this.f30905u, this.f30906v);
    }
}
