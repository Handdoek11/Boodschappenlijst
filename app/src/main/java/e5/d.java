package E5;

import I5.InterfaceC0637k;
import I5.K;
import I5.t;
import J6.r;
import U6.InterfaceC0745v0;
import java.util.Map;
import java.util.Set;
import y5.InterfaceC6961d;
import y6.P;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final K f2179a;

    /* renamed from: b, reason: collision with root package name */
    private final t f2180b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0637k f2181c;

    /* renamed from: d, reason: collision with root package name */
    private final J5.b f2182d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC0745v0 f2183e;

    /* renamed from: f, reason: collision with root package name */
    private final N5.b f2184f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f2185g;

    public d(K k8, t tVar, InterfaceC0637k interfaceC0637k, J5.b bVar, InterfaceC0745v0 interfaceC0745v0, N5.b bVar2) {
        Set keySet;
        r.e(k8, "url");
        r.e(tVar, "method");
        r.e(interfaceC0637k, "headers");
        r.e(bVar, "body");
        r.e(interfaceC0745v0, "executionContext");
        r.e(bVar2, "attributes");
        this.f2179a = k8;
        this.f2180b = tVar;
        this.f2181c = interfaceC0637k;
        this.f2182d = bVar;
        this.f2183e = interfaceC0745v0;
        this.f2184f = bVar2;
        Map map = (Map) bVar2.c(y5.e.a());
        this.f2185g = (map == null || (keySet = map.keySet()) == null) ? P.b() : keySet;
    }

    public final N5.b a() {
        return this.f2184f;
    }

    public final J5.b b() {
        return this.f2182d;
    }

    public final Object c(InterfaceC6961d interfaceC6961d) {
        r.e(interfaceC6961d, "key");
        Map map = (Map) this.f2184f.c(y5.e.a());
        if (map != null) {
            return map.get(interfaceC6961d);
        }
        return null;
    }

    public final InterfaceC0745v0 d() {
        return this.f2183e;
    }

    public final InterfaceC0637k e() {
        return this.f2181c;
    }

    public final t f() {
        return this.f2180b;
    }

    public final Set g() {
        return this.f2185g;
    }

    public final K h() {
        return this.f2179a;
    }

    public String toString() {
        return "HttpRequestData(url=" + this.f2179a + ", method=" + this.f2180b + ')';
    }
}
