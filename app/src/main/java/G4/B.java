package g4;

/* loaded from: classes2.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    private final Class f36013a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f36014b;

    private @interface a {
    }

    public B(Class cls, Class cls2) {
        this.f36013a = cls;
        this.f36014b = cls2;
    }

    public static B a(Class cls, Class cls2) {
        return new B(cls, cls2);
    }

    public static B b(Class cls) {
        return new B(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B.class != obj.getClass()) {
            return false;
        }
        B b8 = (B) obj;
        if (this.f36014b.equals(b8.f36014b)) {
            return this.f36013a.equals(b8.f36013a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f36014b.hashCode() * 31) + this.f36013a.hashCode();
    }

    public String toString() {
        if (this.f36013a == a.class) {
            return this.f36014b.getName();
        }
        return "@" + this.f36013a.getName() + " " + this.f36014b.getName();
    }
}
