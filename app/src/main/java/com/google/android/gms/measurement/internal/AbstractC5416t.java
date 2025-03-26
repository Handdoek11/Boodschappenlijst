package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* renamed from: com.google.android.gms.measurement.internal.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5416t {

    /* renamed from: d, reason: collision with root package name */
    private static volatile Handler f31188d;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5455y3 f31189a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f31190b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f31191c;

    AbstractC5416t(InterfaceC5455y3 interfaceC5455y3) {
        Z2.r.l(interfaceC5455y3);
        this.f31189a = interfaceC5455y3;
        this.f31190b = new RunnableC5437w(this, interfaceC5455y3);
    }

    private final Handler f() {
        Handler handler;
        if (f31188d != null) {
            return f31188d;
        }
        synchronized (AbstractC5416t.class) {
            try {
                if (f31188d == null) {
                    f31188d = new com.google.android.gms.internal.measurement.M0(this.f31189a.zza().getMainLooper());
                }
                handler = f31188d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    final void a() {
        this.f31191c = 0L;
        f().removeCallbacks(this.f31190b);
    }

    public final void b(long j8) {
        a();
        if (j8 >= 0) {
            this.f31191c = this.f31189a.zzb().a();
            if (f().postDelayed(this.f31190b, j8)) {
                return;
            }
            this.f31189a.h().E().b("Failed to schedule delayed post. time", Long.valueOf(j8));
        }
    }

    public abstract void d();

    public final boolean e() {
        return this.f31191c != 0;
    }
}
