package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5309d3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ M5 f30900o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ X2 f30901s;

    RunnableC5309d3(X2 x22, M5 m52) {
        this.f30900o = m52;
        this.f30901s = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30901s.f30758o.x0();
        this.f30901s.f30758o.f0(this.f30900o);
    }
}
