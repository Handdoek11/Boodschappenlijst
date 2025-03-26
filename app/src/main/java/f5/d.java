package F5;

import J6.r;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final U5.a f2396a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f2397b;

    public d(U5.a aVar, Object obj) {
        r.e(aVar, "expectedType");
        r.e(obj, "response");
        this.f2396a = aVar;
        this.f2397b = obj;
    }

    public final U5.a a() {
        return this.f2396a;
    }

    public final Object b() {
        return this.f2397b;
    }

    public final Object c() {
        return this.f2397b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return r.a(this.f2396a, dVar.f2396a) && r.a(this.f2397b, dVar.f2397b);
    }

    public int hashCode() {
        return (this.f2396a.hashCode() * 31) + this.f2397b.hashCode();
    }

    public String toString() {
        return "HttpResponseContainer(expectedType=" + this.f2396a + ", response=" + this.f2397b + ')';
    }
}
