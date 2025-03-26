package D5;

import A6.g;
import I5.InterfaceC0637k;
import I5.K;
import I5.t;
import J6.r;
import w5.C6892a;

/* loaded from: classes2.dex */
public final class c implements E5.b {

    /* renamed from: o, reason: collision with root package name */
    private final C6892a f2098o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ E5.b f2099s;

    public c(C6892a c6892a, E5.b bVar) {
        r.e(c6892a, "call");
        r.e(bVar, "origin");
        this.f2098o = c6892a;
        this.f2099s = bVar;
    }

    @Override // E5.b
    public t E() {
        return this.f2099s.E();
    }

    @Override // E5.b
    public N5.b G() {
        return this.f2099s.G();
    }

    @Override // E5.b
    public C6892a M() {
        return this.f2098o;
    }

    @Override // I5.q
    public InterfaceC0637k a() {
        return this.f2099s.a();
    }

    @Override // E5.b, U6.M
    public g getCoroutineContext() {
        return this.f2099s.getCoroutineContext();
    }

    @Override // E5.b
    public K k() {
        return this.f2099s.k();
    }
}
