package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5437w implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ InterfaceC5455y3 f31234o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ AbstractC5416t f31235s;

    RunnableC5437w(AbstractC5416t abstractC5416t, InterfaceC5455y3 interfaceC5455y3) {
        this.f31234o = interfaceC5455y3;
        this.f31235s = abstractC5416t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31234o.d();
        if (C5298c.a()) {
            this.f31234o.j().B(this);
            return;
        }
        boolean e8 = this.f31235s.e();
        this.f31235s.f31191c = 0L;
        if (e8) {
            this.f31235s.d();
        }
    }
}
