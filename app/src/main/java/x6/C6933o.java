package x6;

import java.io.Serializable;

/* renamed from: x6.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6933o implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final Object f44485o;

    /* renamed from: s, reason: collision with root package name */
    private final Object f44486s;

    public C6933o(Object obj, Object obj2) {
        this.f44485o = obj;
        this.f44486s = obj2;
    }

    public final Object a() {
        return this.f44485o;
    }

    public final Object b() {
        return this.f44486s;
    }

    public final Object c() {
        return this.f44485o;
    }

    public final Object d() {
        return this.f44486s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6933o)) {
            return false;
        }
        C6933o c6933o = (C6933o) obj;
        return J6.r.a(this.f44485o, c6933o.f44485o) && J6.r.a(this.f44486s, c6933o.f44486s);
    }

    public int hashCode() {
        Object obj = this.f44485o;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f44486s;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f44485o + ", " + this.f44486s + ')';
    }
}
