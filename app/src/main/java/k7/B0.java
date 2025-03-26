package k7;

import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class B0 implements i7.f, InterfaceC6141n {

    /* renamed from: a, reason: collision with root package name */
    private final i7.f f38588a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38589b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f38590c;

    public B0(i7.f fVar) {
        J6.r.e(fVar, "original");
        this.f38588a = fVar;
        this.f38589b = fVar.a() + '?';
        this.f38590c = AbstractC6148q0.a(fVar);
    }

    @Override // i7.f
    public String a() {
        return this.f38589b;
    }

    @Override // k7.InterfaceC6141n
    public Set b() {
        return this.f38590c;
    }

    @Override // i7.f
    public boolean c() {
        return true;
    }

    @Override // i7.f
    public int d(String str) {
        J6.r.e(str, "name");
        return this.f38588a.d(str);
    }

    @Override // i7.f
    public i7.j e() {
        return this.f38588a.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B0) && J6.r.a(this.f38588a, ((B0) obj).f38588a);
    }

    @Override // i7.f
    public List f() {
        return this.f38588a.f();
    }

    @Override // i7.f
    public int g() {
        return this.f38588a.g();
    }

    @Override // i7.f
    public String h(int i8) {
        return this.f38588a.h(i8);
    }

    public int hashCode() {
        return this.f38588a.hashCode() * 31;
    }

    @Override // i7.f
    public boolean i() {
        return this.f38588a.i();
    }

    @Override // i7.f
    public List j(int i8) {
        return this.f38588a.j(i8);
    }

    @Override // i7.f
    public i7.f k(int i8) {
        return this.f38588a.k(i8);
    }

    @Override // i7.f
    public boolean l(int i8) {
        return this.f38588a.l(i8);
    }

    public final i7.f m() {
        return this.f38588a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f38588a);
        sb.append('?');
        return sb.toString();
    }
}
