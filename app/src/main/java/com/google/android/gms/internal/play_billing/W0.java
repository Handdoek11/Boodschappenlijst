package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class W0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final AbstractC5091c1 f29850o;

    /* renamed from: s, reason: collision with root package name */
    final InterfaceFutureC5225z1 f29851s;

    W0(AbstractC5091c1 abstractC5091c1, InterfaceFutureC5225z1 interfaceFutureC5225z1) {
        this.f29850o = abstractC5091c1;
        this.f29851s = interfaceFutureC5225z1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f29850o.f29883o != this) {
            return;
        }
        InterfaceFutureC5225z1 interfaceFutureC5225z1 = this.f29851s;
        if (AbstractC5091c1.f29881w.f(this.f29850o, this, AbstractC5091c1.s(interfaceFutureC5225z1))) {
            AbstractC5091c1.x(this.f29850o, false);
        }
    }
}
