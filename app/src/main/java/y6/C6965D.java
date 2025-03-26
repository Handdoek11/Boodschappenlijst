package y6;

/* renamed from: y6.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6965D {

    /* renamed from: a, reason: collision with root package name */
    private final int f44636a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f44637b;

    public C6965D(int i8, Object obj) {
        this.f44636a = i8;
        this.f44637b = obj;
    }

    public final int a() {
        return this.f44636a;
    }

    public final Object b() {
        return this.f44637b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6965D)) {
            return false;
        }
        C6965D c6965d = (C6965D) obj;
        return this.f44636a == c6965d.f44636a && J6.r.a(this.f44637b, c6965d.f44637b);
    }

    public int hashCode() {
        int i8 = this.f44636a * 31;
        Object obj = this.f44637b;
        return i8 + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f44636a + ", value=" + this.f44637b + ')';
    }
}
