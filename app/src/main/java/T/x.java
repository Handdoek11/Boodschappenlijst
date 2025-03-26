package t;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final String f43787a;

    public x(String str) {
        this.f43787a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && J6.r.a(this.f43787a, ((x) obj).f43787a);
    }

    public int hashCode() {
        return this.f43787a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f43787a + ')';
    }
}
