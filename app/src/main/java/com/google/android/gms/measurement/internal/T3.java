package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class T3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ boolean f30719o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F3 f30720s;

    T3(F3 f32, boolean z7) {
        this.f30719o = z7;
        this.f30720s = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean n8 = this.f30720s.f31239a.n();
        boolean m8 = this.f30720s.f31239a.m();
        this.f30720s.f31239a.k(this.f30719o);
        if (m8 == this.f30719o) {
            this.f30720s.f31239a.h().I().b("Default data collection state already set to", Boolean.valueOf(this.f30719o));
        }
        if (this.f30720s.f31239a.n() == n8 || this.f30720s.f31239a.n() != this.f30720s.f31239a.m()) {
            this.f30720s.f31239a.h().K().c("Default data collection is different than actual status", Boolean.valueOf(this.f30719o), Boolean.valueOf(n8));
        }
        this.f30720s.I0();
    }
}
