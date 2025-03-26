package E5;

import I5.InterfaceC0637k;
import I5.u;
import I5.v;
import J6.r;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final v f2193a;

    /* renamed from: b, reason: collision with root package name */
    private final Q5.b f2194b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0637k f2195c;

    /* renamed from: d, reason: collision with root package name */
    private final u f2196d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f2197e;

    /* renamed from: f, reason: collision with root package name */
    private final A6.g f2198f;

    /* renamed from: g, reason: collision with root package name */
    private final Q5.b f2199g;

    public g(v vVar, Q5.b bVar, InterfaceC0637k interfaceC0637k, u uVar, Object obj, A6.g gVar) {
        r.e(vVar, "statusCode");
        r.e(bVar, "requestTime");
        r.e(interfaceC0637k, "headers");
        r.e(uVar, "version");
        r.e(obj, "body");
        r.e(gVar, "callContext");
        this.f2193a = vVar;
        this.f2194b = bVar;
        this.f2195c = interfaceC0637k;
        this.f2196d = uVar;
        this.f2197e = obj;
        this.f2198f = gVar;
        this.f2199g = Q5.a.b(null, 1, null);
    }

    public final Object a() {
        return this.f2197e;
    }

    public final A6.g b() {
        return this.f2198f;
    }

    public final InterfaceC0637k c() {
        return this.f2195c;
    }

    public final Q5.b d() {
        return this.f2194b;
    }

    public final Q5.b e() {
        return this.f2199g;
    }

    public final v f() {
        return this.f2193a;
    }

    public final u g() {
        return this.f2196d;
    }

    public String toString() {
        return "HttpResponseData=(statusCode=" + this.f2193a + ')';
    }
}
