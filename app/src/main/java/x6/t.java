package x6;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class t implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final Object f44498o;

    /* renamed from: s, reason: collision with root package name */
    private final Object f44499s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f44500t;

    public t(Object obj, Object obj2, Object obj3) {
        this.f44498o = obj;
        this.f44499s = obj2;
        this.f44500t = obj3;
    }

    public final Object a() {
        return this.f44498o;
    }

    public final Object b() {
        return this.f44499s;
    }

    public final Object c() {
        return this.f44500t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return J6.r.a(this.f44498o, tVar.f44498o) && J6.r.a(this.f44499s, tVar.f44499s) && J6.r.a(this.f44500t, tVar.f44500t);
    }

    public int hashCode() {
        Object obj = this.f44498o;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f44499s;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f44500t;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f44498o + ", " + this.f44499s + ", " + this.f44500t + ')';
    }
}
