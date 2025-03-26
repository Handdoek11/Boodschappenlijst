package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5433v2 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ boolean f31226o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ C5440w2 f31227s;

    RunnableC5433v2(C5440w2 c5440w2, boolean z7) {
        this.f31226o = z7;
        this.f31227s = c5440w2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31227s.f31236a.I(this.f31226o);
    }
}
