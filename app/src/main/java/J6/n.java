package J6;

/* loaded from: classes2.dex */
public abstract class n extends AbstractC0645e implements InterfaceC0653m, Q6.e {

    /* renamed from: y, reason: collision with root package name */
    private final int f3581y;

    /* renamed from: z, reason: collision with root package name */
    private final int f3582z;

    public n(int i8, Object obj, Class cls, String str, String str2, int i9) {
        super(obj, cls, str, str2, (i9 & 1) == 1);
        this.f3581y = i8;
        this.f3582z = i9 >> 1;
    }

    @Override // J6.AbstractC0645e
    protected Q6.a c() {
        return H.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return getName().equals(nVar.getName()) && i().equals(nVar.i()) && this.f3582z == nVar.f3582z && this.f3581y == nVar.f3581y && r.a(f(), nVar.f()) && r.a(g(), nVar.g());
        }
        if (obj instanceof Q6.e) {
            return obj.equals(b());
        }
        return false;
    }

    @Override // J6.InterfaceC0653m
    public int getArity() {
        return this.f3581y;
    }

    public int hashCode() {
        return (((g() == null ? 0 : g().hashCode() * 31) + getName().hashCode()) * 31) + i().hashCode();
    }

    public String toString() {
        Q6.a b8 = b();
        if (b8 != this) {
            return b8.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
