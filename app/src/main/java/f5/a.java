package F5;

import I5.InterfaceC0637k;
import I5.u;
import I5.v;
import J6.r;
import w5.C6892a;

/* loaded from: classes2.dex */
public final class a extends c {

    /* renamed from: o, reason: collision with root package name */
    private final C6892a f2383o;

    /* renamed from: s, reason: collision with root package name */
    private final A6.g f2384s;

    /* renamed from: t, reason: collision with root package name */
    private final v f2385t;

    /* renamed from: u, reason: collision with root package name */
    private final u f2386u;

    /* renamed from: v, reason: collision with root package name */
    private final Q5.b f2387v;

    /* renamed from: w, reason: collision with root package name */
    private final Q5.b f2388w;

    /* renamed from: x, reason: collision with root package name */
    private final io.ktor.utils.io.f f2389x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC0637k f2390y;

    public a(C6892a c6892a, E5.g gVar) {
        r.e(c6892a, "call");
        r.e(gVar, "responseData");
        this.f2383o = c6892a;
        this.f2384s = gVar.b();
        this.f2385t = gVar.f();
        this.f2386u = gVar.g();
        this.f2387v = gVar.d();
        this.f2388w = gVar.e();
        Object a8 = gVar.a();
        io.ktor.utils.io.f fVar = a8 instanceof io.ktor.utils.io.f ? (io.ktor.utils.io.f) a8 : null;
        this.f2389x = fVar == null ? io.ktor.utils.io.f.f36863a.a() : fVar;
        this.f2390y = gVar.c();
    }

    @Override // F5.c
    public C6892a M() {
        return this.f2383o;
    }

    @Override // I5.q
    public InterfaceC0637k a() {
        return this.f2390y;
    }

    @Override // F5.c
    public io.ktor.utils.io.f b() {
        return this.f2389x;
    }

    @Override // F5.c
    public Q5.b c() {
        return this.f2387v;
    }

    @Override // F5.c
    public Q5.b d() {
        return this.f2388w;
    }

    @Override // F5.c
    public v e() {
        return this.f2385t;
    }

    @Override // F5.c
    public u f() {
        return this.f2386u;
    }

    @Override // U6.M
    public A6.g getCoroutineContext() {
        return this.f2384s;
    }
}
