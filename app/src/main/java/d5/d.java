package D5;

import A6.g;
import I5.InterfaceC0637k;
import I5.u;
import I5.v;
import J6.r;
import w5.C6892a;

/* loaded from: classes2.dex */
public final class d extends F5.c {

    /* renamed from: o, reason: collision with root package name */
    private final C6892a f2100o;

    /* renamed from: s, reason: collision with root package name */
    private final io.ktor.utils.io.f f2101s;

    /* renamed from: t, reason: collision with root package name */
    private final F5.c f2102t;

    /* renamed from: u, reason: collision with root package name */
    private final g f2103u;

    public d(C6892a c6892a, io.ktor.utils.io.f fVar, F5.c cVar) {
        r.e(c6892a, "call");
        r.e(fVar, "content");
        r.e(cVar, "origin");
        this.f2100o = c6892a;
        this.f2101s = fVar;
        this.f2102t = cVar;
        this.f2103u = cVar.getCoroutineContext();
    }

    @Override // F5.c
    public C6892a M() {
        return this.f2100o;
    }

    @Override // I5.q
    public InterfaceC0637k a() {
        return this.f2102t.a();
    }

    @Override // F5.c
    public io.ktor.utils.io.f b() {
        return this.f2101s;
    }

    @Override // F5.c
    public Q5.b c() {
        return this.f2102t.c();
    }

    @Override // F5.c
    public Q5.b d() {
        return this.f2102t.d();
    }

    @Override // F5.c
    public v e() {
        return this.f2102t.e();
    }

    @Override // F5.c
    public u f() {
        return this.f2102t.f();
    }

    @Override // U6.M
    public g getCoroutineContext() {
        return this.f2103u;
    }
}
