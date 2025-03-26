package com.google.android.gms.measurement.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5412s2 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC5419t2 f31176o;

    /* renamed from: s, reason: collision with root package name */
    private final int f31177s;

    /* renamed from: t, reason: collision with root package name */
    private final Throwable f31178t;

    /* renamed from: u, reason: collision with root package name */
    private final byte[] f31179u;

    /* renamed from: v, reason: collision with root package name */
    private final String f31180v;

    /* renamed from: w, reason: collision with root package name */
    private final Map f31181w;

    @Override // java.lang.Runnable
    public final void run() {
        this.f31176o.a(this.f31180v, this.f31177s, this.f31178t, this.f31179u, this.f31181w);
    }

    private RunnableC5412s2(String str, InterfaceC5419t2 interfaceC5419t2, int i8, Throwable th, byte[] bArr, Map map) {
        Z2.r.l(interfaceC5419t2);
        this.f31176o = interfaceC5419t2;
        this.f31177s = i8;
        this.f31178t = th;
        this.f31179u = bArr;
        this.f31180v = str;
        this.f31181w = map;
    }
}
