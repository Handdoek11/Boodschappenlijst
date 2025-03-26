package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class PR {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3964ro f18185a;

    PR(AbstractC3964ro abstractC3964ro) {
        this.f18185a = abstractC3964ro;
    }

    public final void a() {
        com.google.common.util.concurrent.d a8 = this.f18185a.a();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.C7)).booleanValue()) {
            AbstractC1601Nq.b(a8, "persistFlags");
        } else {
            AbstractC1601Nq.a(a8, "persistFlags");
        }
    }
}
