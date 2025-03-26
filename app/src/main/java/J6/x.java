package J6;

/* loaded from: classes2.dex */
public final class x implements InterfaceC0647g {

    /* renamed from: a, reason: collision with root package name */
    private final Class f3585a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3586b;

    public x(Class cls, String str) {
        r.e(cls, "jClass");
        r.e(str, "moduleName");
        this.f3585a = cls;
        this.f3586b = str;
    }

    @Override // J6.InterfaceC0647g
    public Class c() {
        return this.f3585a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && r.a(c(), ((x) obj).c());
    }

    public int hashCode() {
        return c().hashCode();
    }

    public String toString() {
        return c().toString() + " (Kotlin reflection is not available)";
    }
}
