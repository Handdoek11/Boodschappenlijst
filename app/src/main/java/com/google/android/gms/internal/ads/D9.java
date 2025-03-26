package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class D9 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ E9 f14421o;

    D9(E9 e9) {
        this.f14421o = e9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f14421o.f14657E) {
            if (this.f14421o.f14658F) {
                return;
            }
            this.f14421o.f14658F = true;
            try {
                E9.n(this.f14421o);
            } catch (Exception e8) {
                this.f14421o.f14666w.c(2023, -1L, e8);
            }
            synchronized (this.f14421o.f14657E) {
                this.f14421o.f14658F = false;
            }
        }
    }
}
