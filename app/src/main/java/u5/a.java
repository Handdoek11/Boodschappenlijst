package U5;

import J6.r;
import Q6.k;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Q6.b f5364a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f5365b;

    /* renamed from: c, reason: collision with root package name */
    private final k f5366c;

    public a(Q6.b bVar, Type type, k kVar) {
        r.e(bVar, "type");
        r.e(type, "reifiedType");
        this.f5364a = bVar;
        this.f5365b = type;
        this.f5366c = kVar;
    }

    public final k a() {
        return this.f5366c;
    }

    public final Q6.b b() {
        return this.f5364a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return r.a(this.f5364a, aVar.f5364a) && r.a(this.f5365b, aVar.f5365b) && r.a(this.f5366c, aVar.f5366c);
    }

    public int hashCode() {
        int hashCode = ((this.f5364a.hashCode() * 31) + this.f5365b.hashCode()) * 31;
        k kVar = this.f5366c;
        return hashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public String toString() {
        return "TypeInfo(type=" + this.f5364a + ", reifiedType=" + this.f5365b + ", kotlinType=" + this.f5366c + ')';
    }
}
