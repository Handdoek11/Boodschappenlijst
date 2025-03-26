package J6;

/* loaded from: classes2.dex */
public abstract class C extends AbstractC0645e implements Q6.j {

    /* renamed from: y, reason: collision with root package name */
    private final boolean f3543y;

    public C(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.f3543y = (i8 & 2) == 2;
    }

    @Override // J6.AbstractC0645e
    public Q6.a b() {
        return this.f3543y ? this : super.b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C) {
            C c8 = (C) obj;
            return g().equals(c8.g()) && getName().equals(c8.getName()) && i().equals(c8.i()) && r.a(f(), c8.f());
        }
        if (obj instanceof Q6.j) {
            return obj.equals(b());
        }
        return false;
    }

    public int hashCode() {
        return (((g().hashCode() * 31) + getName().hashCode()) * 31) + i().hashCode();
    }

    protected Q6.j j() {
        if (this.f3543y) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (Q6.j) super.h();
    }

    public String toString() {
        Q6.a b8 = b();
        if (b8 != this) {
            return b8.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
