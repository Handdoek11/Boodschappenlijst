package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class Y implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ long f30777o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ C5451y f30778s;

    Y(C5451y c5451y, long j8) {
        this.f30777o = j8;
        this.f30778s = c5451y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30778s.z(this.f30777o);
    }
}
