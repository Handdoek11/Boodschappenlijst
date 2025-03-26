package com.google.ads.mediation;

import J2.n;
import com.google.android.gms.internal.ads.C3950rh;
import w2.AbstractC6878d;
import w2.m;
import z2.AbstractC7072g;
import z2.InterfaceC7077l;
import z2.InterfaceC7078m;
import z2.InterfaceC7080o;

/* loaded from: classes.dex */
final class e extends AbstractC6878d implements InterfaceC7080o, InterfaceC7078m, InterfaceC7077l {

    /* renamed from: o, reason: collision with root package name */
    final AbstractAdViewAdapter f13035o;

    /* renamed from: s, reason: collision with root package name */
    final n f13036s;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, n nVar) {
        this.f13035o = abstractAdViewAdapter;
        this.f13036s = nVar;
    }

    @Override // w2.AbstractC6878d
    public final void I0() {
        this.f13036s.l(this.f13035o);
    }

    @Override // z2.InterfaceC7077l
    public final void a(C3950rh c3950rh, String str) {
        this.f13036s.k(this.f13035o, c3950rh, str);
    }

    @Override // z2.InterfaceC7080o
    public final void c(AbstractC7072g abstractC7072g) {
        this.f13036s.n(this.f13035o, new a(abstractC7072g));
    }

    @Override // z2.InterfaceC7078m
    public final void e(C3950rh c3950rh) {
        this.f13036s.d(this.f13035o, c3950rh);
    }

    @Override // w2.AbstractC6878d
    public final void g() {
        this.f13036s.i(this.f13035o);
    }

    @Override // w2.AbstractC6878d
    public final void i(m mVar) {
        this.f13036s.f(this.f13035o, mVar);
    }

    @Override // w2.AbstractC6878d
    public final void m() {
        this.f13036s.r(this.f13035o);
    }

    @Override // w2.AbstractC6878d
    public final void o() {
    }

    @Override // w2.AbstractC6878d
    public final void p() {
        this.f13036s.b(this.f13035o);
    }
}
