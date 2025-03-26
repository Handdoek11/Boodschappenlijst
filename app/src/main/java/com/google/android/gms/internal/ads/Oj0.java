package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class Oj0 extends AbstractC1168Bj0 {

    /* renamed from: G, reason: collision with root package name */
    private Nj0 f17941G;

    Oj0(AbstractC3625oh0 abstractC3625oh0, boolean z7, Executor executor, Callable callable) {
        super(abstractC3625oh0, z7, false);
        this.f17941G = new Mj0(this, callable, executor);
        T();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1168Bj0
    final void R(int i8, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1168Bj0
    final void S() {
        Nj0 nj0 = this.f17941G;
        if (nj0 != null) {
            nj0.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1168Bj0
    final void W(int i8) {
        super.W(i8);
        if (i8 == 1) {
            this.f17941G = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0
    protected final void t() {
        Nj0 nj0 = this.f17941G;
        if (nj0 != null) {
            nj0.g();
        }
    }
}
