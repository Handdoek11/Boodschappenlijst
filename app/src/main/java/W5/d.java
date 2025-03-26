package w5;

import A6.g;
import I5.InterfaceC0637k;
import I5.K;
import I5.t;
import J6.r;

/* loaded from: classes2.dex */
public final class d implements E5.b {

    /* renamed from: o, reason: collision with root package name */
    private final c f44373o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ E5.b f44374s;

    public d(c cVar, E5.b bVar) {
        r.e(cVar, "call");
        r.e(bVar, "origin");
        this.f44373o = cVar;
        this.f44374s = bVar;
    }

    @Override // E5.b
    public t E() {
        return this.f44374s.E();
    }

    @Override // E5.b
    public N5.b G() {
        return this.f44374s.G();
    }

    @Override // I5.q
    public InterfaceC0637k a() {
        return this.f44374s.a();
    }

    @Override // E5.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c M() {
        return this.f44373o;
    }

    @Override // E5.b, U6.M
    public g getCoroutineContext() {
        return this.f44374s.getCoroutineContext();
    }

    @Override // E5.b
    public K k() {
        return this.f44374s.k();
    }
}
