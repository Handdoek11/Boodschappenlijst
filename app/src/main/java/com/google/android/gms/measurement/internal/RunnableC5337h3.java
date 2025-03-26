package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5337h3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ C5312e f30979o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ X2 f30980s;

    RunnableC5337h3(X2 x22, C5312e c5312e) {
        this.f30979o = c5312e;
        this.f30980s = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30980s.f30758o.x0();
        if (this.f30979o.f30923t.A0() == null) {
            this.f30980s.f30758o.r(this.f30979o);
        } else {
            this.f30980s.f30758o.U(this.f30979o);
        }
    }
}
