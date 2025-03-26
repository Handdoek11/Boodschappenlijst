package w5;

import A6.g;
import I5.InterfaceC0637k;
import I5.u;
import I5.v;
import J6.r;
import U6.A;
import U6.A0;
import io.ktor.utils.io.f;

/* loaded from: classes2.dex */
public final class e extends F5.c {

    /* renamed from: o, reason: collision with root package name */
    private final c f44375o;

    /* renamed from: s, reason: collision with root package name */
    private final A f44376s;

    /* renamed from: t, reason: collision with root package name */
    private final v f44377t;

    /* renamed from: u, reason: collision with root package name */
    private final u f44378u;

    /* renamed from: v, reason: collision with root package name */
    private final Q5.b f44379v;

    /* renamed from: w, reason: collision with root package name */
    private final Q5.b f44380w;

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC0637k f44381x;

    /* renamed from: y, reason: collision with root package name */
    private final g f44382y;

    /* renamed from: z, reason: collision with root package name */
    private final f f44383z;

    public e(c cVar, byte[] bArr, F5.c cVar2) {
        r.e(cVar, "call");
        r.e(bArr, "body");
        r.e(cVar2, "origin");
        this.f44375o = cVar;
        A b8 = A0.b(null, 1, null);
        this.f44376s = b8;
        this.f44377t = cVar2.e();
        this.f44378u = cVar2.f();
        this.f44379v = cVar2.c();
        this.f44380w = cVar2.d();
        this.f44381x = cVar2.a();
        this.f44382y = cVar2.getCoroutineContext().u(b8);
        this.f44383z = io.ktor.utils.io.d.a(bArr);
    }

    @Override // I5.q
    public InterfaceC0637k a() {
        return this.f44381x;
    }

    @Override // F5.c
    public f b() {
        return this.f44383z;
    }

    @Override // F5.c
    public Q5.b c() {
        return this.f44379v;
    }

    @Override // F5.c
    public Q5.b d() {
        return this.f44380w;
    }

    @Override // F5.c
    public v e() {
        return this.f44377t;
    }

    @Override // F5.c
    public u f() {
        return this.f44378u;
    }

    @Override // U6.M
    public g getCoroutineContext() {
        return this.f44382y;
    }

    @Override // F5.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public c M() {
        return this.f44375o;
    }
}
