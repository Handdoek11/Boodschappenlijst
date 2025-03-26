package com.google.ads.mediation;

import w2.l;

/* loaded from: classes.dex */
final class d extends l {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f13033a;

    /* renamed from: b, reason: collision with root package name */
    final J2.l f13034b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, J2.l lVar) {
        this.f13033a = abstractAdViewAdapter;
        this.f13034b = lVar;
    }

    @Override // w2.l
    public final void b() {
        this.f13034b.q(this.f13033a);
    }

    @Override // w2.l
    public final void e() {
        this.f13034b.s(this.f13033a);
    }
}
