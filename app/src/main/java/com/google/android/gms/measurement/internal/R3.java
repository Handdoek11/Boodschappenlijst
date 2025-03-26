package com.google.android.gms.measurement.internal;

import android.util.SparseArray;

/* loaded from: classes2.dex */
final class R3 implements com.google.common.util.concurrent.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ B5 f30668a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F3 f30669b;

    R3(F3 f32, B5 b52) {
        this.f30668a = b52;
        this.f30669b = f32;
    }

    private final void c() {
        SparseArray I7 = this.f30669b.f().I();
        B5 b52 = this.f30668a;
        I7.put(b52.f30300t, Long.valueOf(b52.f30299s));
        this.f30669b.f().t(I7);
    }

    @Override // com.google.common.util.concurrent.a
    public final void a(Throwable th) {
        this.f30669b.l();
        this.f30669b.f30348i = false;
        if (!this.f30669b.a().r(G.f30399O0)) {
            this.f30669b.F0();
            this.f30669b.h().E().b("registerTriggerAsync failed with throwable", th);
            return;
        }
        int A7 = (this.f30669b.a().r(G.f30395M0) ? F3.A(this.f30669b, th) : 2) - 1;
        if (A7 == 0) {
            this.f30669b.h().J().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", C5378n2.t(this.f30669b.n().D()), C5378n2.t(th.toString()));
            this.f30669b.f30349j = 1;
            this.f30669b.y0().add(this.f30668a);
            return;
        }
        if (A7 != 1) {
            if (A7 != 2) {
                return;
            }
            this.f30669b.h().E().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", C5378n2.t(this.f30669b.n().D()), th);
            c();
            this.f30669b.f30349j = 1;
            this.f30669b.F0();
            return;
        }
        this.f30669b.y0().add(this.f30668a);
        if (this.f30669b.f30349j > 32) {
            this.f30669b.f30349j = 1;
            this.f30669b.h().J().c("registerTriggerAsync failed. May try later. App ID, throwable", C5378n2.t(this.f30669b.n().D()), C5378n2.t(th.toString()));
            return;
        }
        this.f30669b.h().J().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", C5378n2.t(this.f30669b.n().D()), C5378n2.t(String.valueOf(this.f30669b.f30349j)), C5378n2.t(th.toString()));
        F3 f32 = this.f30669b;
        F3.N0(f32, f32.f30349j);
        this.f30669b.f30349j <<= 1;
    }

    @Override // com.google.common.util.concurrent.a
    public final void b(Object obj) {
        this.f30669b.l();
        if (!this.f30669b.a().r(G.f30399O0)) {
            this.f30669b.f30348i = false;
            this.f30669b.F0();
            this.f30669b.h().D().b("registerTriggerAsync ran. uri", this.f30668a.f30298o);
        } else {
            c();
            this.f30669b.f30348i = false;
            this.f30669b.f30349j = 1;
            this.f30669b.h().D().b("Successfully registered trigger URI", this.f30668a.f30298o);
            this.f30669b.F0();
        }
    }
}
