package com.google.ads.mediation;

import D2.InterfaceC0484a;
import J2.i;
import w2.AbstractC6878d;
import w2.m;
import x2.InterfaceC6905d;

/* loaded from: classes.dex */
final class b extends AbstractC6878d implements InterfaceC6905d, InterfaceC0484a {

    /* renamed from: o, reason: collision with root package name */
    final AbstractAdViewAdapter f13029o;

    /* renamed from: s, reason: collision with root package name */
    final i f13030s;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, i iVar) {
        this.f13029o = abstractAdViewAdapter;
        this.f13030s = iVar;
    }

    @Override // w2.AbstractC6878d
    public final void I0() {
        this.f13030s.g(this.f13029o);
    }

    @Override // w2.AbstractC6878d
    public final void g() {
        this.f13030s.a(this.f13029o);
    }

    @Override // w2.AbstractC6878d
    public final void i(m mVar) {
        this.f13030s.e(this.f13029o, mVar);
    }

    @Override // x2.InterfaceC6905d
    public final void n(String str, String str2) {
        this.f13030s.h(this.f13029o, str, str2);
    }

    @Override // w2.AbstractC6878d
    public final void o() {
        this.f13030s.j(this.f13029o);
    }

    @Override // w2.AbstractC6878d
    public final void p() {
        this.f13030s.p(this.f13029o);
    }
}
