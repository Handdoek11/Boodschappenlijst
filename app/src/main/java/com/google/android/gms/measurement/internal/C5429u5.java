package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.u5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5429u5 {

    /* renamed from: a, reason: collision with root package name */
    private long f31216a;

    /* renamed from: b, reason: collision with root package name */
    protected long f31217b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5416t f31218c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C5395p5 f31219d;

    public C5429u5(C5395p5 c5395p5) {
        this.f31219d = c5395p5;
        this.f31218c = new C5450x5(this, c5395p5.f31239a);
        long b8 = c5395p5.zzb().b();
        this.f31216a = b8;
        this.f31217b = b8;
    }

    static /* synthetic */ void c(C5429u5 c5429u5) {
        c5429u5.f31219d.l();
        c5429u5.d(false, false, c5429u5.f31219d.zzb().b());
        c5429u5.f31219d.m().t(c5429u5.f31219d.zzb().b());
    }

    final long a(long j8) {
        long j9 = j8 - this.f31217b;
        this.f31217b = j8;
        return j9;
    }

    final void b() {
        this.f31218c.a();
        if (this.f31219d.a().r(G.f30430c1)) {
            this.f31216a = this.f31219d.zzb().b();
        } else {
            this.f31216a = 0L;
        }
        this.f31217b = this.f31216a;
    }

    public final boolean d(boolean z7, boolean z8, long j8) {
        this.f31219d.l();
        this.f31219d.t();
        if (this.f31219d.f31239a.n()) {
            this.f31219d.f().f31299r.b(this.f31219d.zzb().a());
        }
        long j9 = j8 - this.f31216a;
        if (!z7 && j9 < 1000) {
            this.f31219d.h().I().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j9));
            return false;
        }
        if (!z8) {
            j9 = a(j8);
        }
        this.f31219d.h().I().b("Recording user engagement, ms", Long.valueOf(j9));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j9);
        d6.V(this.f31219d.q().A(!this.f31219d.a().T()), bundle, true);
        if (!z8) {
            this.f31219d.p().Z0("auto", "_e", bundle);
        }
        this.f31216a = j8;
        this.f31218c.a();
        this.f31218c.b(((Long) G.f30432d0.a(null)).longValue());
        return true;
    }

    final void e(long j8) {
        this.f31218c.a();
    }

    final void f(long j8) {
        this.f31219d.l();
        this.f31218c.a();
        this.f31216a = j8;
        this.f31217b = j8;
    }
}
