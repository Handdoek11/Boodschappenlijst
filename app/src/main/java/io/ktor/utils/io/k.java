package io.ktor.utils.io;

import A6.g;
import J6.r;
import U6.InterfaceC0708c0;
import U6.InterfaceC0742u;
import U6.InterfaceC0745v0;
import U6.InterfaceC0746w;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
final class k implements InterfaceC0745v0, p {

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC0745v0 f36966o;

    /* renamed from: s, reason: collision with root package name */
    private final c f36967s;

    public k(InterfaceC0745v0 interfaceC0745v0, c cVar) {
        r.e(interfaceC0745v0, "delegate");
        r.e(cVar, "channel");
        this.f36966o = interfaceC0745v0;
        this.f36967s = cVar;
    }

    @Override // U6.InterfaceC0745v0
    public CancellationException A() {
        return this.f36966o.A();
    }

    @Override // U6.InterfaceC0745v0
    public InterfaceC0708c0 D(I6.l lVar) {
        r.e(lVar, "handler");
        return this.f36966o.D(lVar);
    }

    @Override // U6.InterfaceC0745v0
    public Object I(A6.d dVar) {
        return this.f36966o.I(dVar);
    }

    @Override // U6.InterfaceC0745v0
    public InterfaceC0742u K(InterfaceC0746w interfaceC0746w) {
        r.e(interfaceC0746w, "child");
        return this.f36966o.K(interfaceC0746w);
    }

    @Override // io.ktor.utils.io.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c g() {
        return this.f36967s;
    }

    @Override // U6.InterfaceC0745v0
    public InterfaceC0708c0 c0(boolean z7, boolean z8, I6.l lVar) {
        r.e(lVar, "handler");
        return this.f36966o.c0(z7, z8, lVar);
    }

    @Override // A6.g.b, A6.g
    public g.b d(g.c cVar) {
        r.e(cVar, "key");
        return this.f36966o.d(cVar);
    }

    @Override // A6.g.b, A6.g
    public Object e(Object obj, I6.p pVar) {
        r.e(pVar, "operation");
        return this.f36966o.e(obj, pVar);
    }

    @Override // A6.g.b, A6.g
    public A6.g f(g.c cVar) {
        r.e(cVar, "key");
        return this.f36966o.f(cVar);
    }

    @Override // A6.g.b
    public g.c getKey() {
        return this.f36966o.getKey();
    }

    @Override // U6.InterfaceC0745v0
    public boolean h() {
        return this.f36966o.h();
    }

    @Override // U6.InterfaceC0745v0
    public boolean isCancelled() {
        return this.f36966o.isCancelled();
    }

    @Override // U6.InterfaceC0745v0
    public void l0(CancellationException cancellationException) {
        this.f36966o.l0(cancellationException);
    }

    @Override // U6.InterfaceC0745v0
    public boolean start() {
        return this.f36966o.start();
    }

    public String toString() {
        return "ChannelJob[" + this.f36966o + ']';
    }

    @Override // A6.g
    public A6.g u(A6.g gVar) {
        r.e(gVar, "context");
        return this.f36966o.u(gVar);
    }
}
