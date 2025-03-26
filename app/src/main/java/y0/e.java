package y0;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f44525a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f44526b;

    public e(Object obj, Object obj2) {
        this.f44525a = obj;
        this.f44526b = obj2;
    }

    public static e a(Object obj, Object obj2) {
        return new e(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return d.a(eVar.f44525a, this.f44525a) && d.a(eVar.f44526b, this.f44526b);
    }

    public int hashCode() {
        Object obj = this.f44525a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f44526b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f44525a + " " + this.f44526b + "}";
    }
}
