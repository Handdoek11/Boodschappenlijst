package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5459z0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f31279o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ long f31280s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ C5451y f31281t;

    RunnableC5459z0(C5451y c5451y, String str, long j8) {
        this.f31279o = str;
        this.f31280s = j8;
        this.f31281t = c5451y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5451y.A(this.f31281t, this.f31279o, this.f31280s);
    }
}
