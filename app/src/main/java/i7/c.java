package i7;

import J6.r;
import java.util.List;

/* loaded from: classes2.dex */
final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    private final f f36699a;

    /* renamed from: b, reason: collision with root package name */
    public final Q6.b f36700b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36701c;

    public c(f fVar, Q6.b bVar) {
        r.e(fVar, "original");
        r.e(bVar, "kClass");
        this.f36699a = fVar;
        this.f36700b = bVar;
        this.f36701c = fVar.a() + '<' + bVar.a() + '>';
    }

    @Override // i7.f
    public String a() {
        return this.f36701c;
    }

    @Override // i7.f
    public boolean c() {
        return this.f36699a.c();
    }

    @Override // i7.f
    public int d(String str) {
        r.e(str, "name");
        return this.f36699a.d(str);
    }

    @Override // i7.f
    public j e() {
        return this.f36699a.e();
    }

    public boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && r.a(this.f36699a, cVar.f36699a) && r.a(cVar.f36700b, this.f36700b);
    }

    @Override // i7.f
    public List f() {
        return this.f36699a.f();
    }

    @Override // i7.f
    public int g() {
        return this.f36699a.g();
    }

    @Override // i7.f
    public String h(int i8) {
        return this.f36699a.h(i8);
    }

    public int hashCode() {
        return (this.f36700b.hashCode() * 31) + a().hashCode();
    }

    @Override // i7.f
    public boolean i() {
        return this.f36699a.i();
    }

    @Override // i7.f
    public List j(int i8) {
        return this.f36699a.j(i8);
    }

    @Override // i7.f
    public f k(int i8) {
        return this.f36699a.k(i8);
    }

    @Override // i7.f
    public boolean l(int i8) {
        return this.f36699a.l(i8);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f36700b + ", original: " + this.f36699a + ')';
    }
}
