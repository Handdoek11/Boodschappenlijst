package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.m4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5373m4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ C5430v f31088o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F3 f31089s;

    RunnableC5373m4(F3 f32, C5430v c5430v) {
        this.f31088o = c5430v;
        this.f31089s = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f31089s.f().y(this.f31088o)) {
            this.f31089s.h().H().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.f31088o.a()));
            return;
        }
        this.f31089s.h().I().b("Setting DMA consent(FE)", this.f31088o);
        if (this.f31089s.r().h0()) {
            this.f31089s.r().c0();
        } else {
            this.f31089s.r().S(false);
        }
    }
}
