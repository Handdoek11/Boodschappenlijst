package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class V3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ long f30734o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F3 f30735s;

    V3(F3 f32, long j8) {
        this.f30734o = j8;
        this.f30735s = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30735s.f().f31294m.b(this.f30734o);
        this.f30735s.h().D().b("Session timeout duration set", Long.valueOf(this.f30734o));
    }
}
