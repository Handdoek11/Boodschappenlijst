package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC3084jj0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final AbstractC3738pj0 f23341o;

    /* renamed from: s, reason: collision with root package name */
    final com.google.common.util.concurrent.d f23342s;

    RunnableC3084jj0(AbstractC3738pj0 abstractC3738pj0, com.google.common.util.concurrent.d dVar) {
        this.f23341o = abstractC3738pj0;
        this.f23342s = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f23341o.f25497o != this) {
            return;
        }
        com.google.common.util.concurrent.d dVar = this.f23342s;
        if (AbstractC3738pj0.f25495w.f(this.f23341o, this, AbstractC3738pj0.i(dVar))) {
            AbstractC3738pj0.A(this.f23341o, false);
        }
    }
}
