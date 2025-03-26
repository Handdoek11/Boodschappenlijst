package A1;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f72a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73b;

    public g(String str, int i8) {
        this.f72a = str;
        this.f73b = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f73b != gVar.f73b) {
            return false;
        }
        return this.f72a.equals(gVar.f72a);
    }

    public int hashCode() {
        return (this.f72a.hashCode() * 31) + this.f73b;
    }
}
