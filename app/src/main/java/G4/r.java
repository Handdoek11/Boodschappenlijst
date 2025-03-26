package g4;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final B f36070a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36071b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36072c;

    private r(Class cls, int i8, int i9) {
        this(B.b(cls), i8, i9);
    }

    public static r a(Class cls) {
        return new r(cls, 0, 2);
    }

    private static String b(int i8) {
        if (i8 == 0) {
            return "direct";
        }
        if (i8 == 1) {
            return "provider";
        }
        if (i8 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i8);
    }

    public static r h(Class cls) {
        return new r(cls, 0, 0);
    }

    public static r i(B b8) {
        return new r(b8, 0, 1);
    }

    public static r j(Class cls) {
        return new r(cls, 0, 1);
    }

    public static r k(B b8) {
        return new r(b8, 1, 0);
    }

    public static r l(Class cls) {
        return new r(cls, 1, 0);
    }

    public static r m(B b8) {
        return new r(b8, 1, 1);
    }

    public static r n(Class cls) {
        return new r(cls, 1, 1);
    }

    public static r o(Class cls) {
        return new r(cls, 2, 0);
    }

    public B c() {
        return this.f36070a;
    }

    public boolean d() {
        return this.f36072c == 2;
    }

    public boolean e() {
        return this.f36072c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f36070a.equals(rVar.f36070a) && this.f36071b == rVar.f36071b && this.f36072c == rVar.f36072c;
    }

    public boolean f() {
        return this.f36071b == 1;
    }

    public boolean g() {
        return this.f36071b == 2;
    }

    public int hashCode() {
        return ((((this.f36070a.hashCode() ^ 1000003) * 1000003) ^ this.f36071b) * 1000003) ^ this.f36072c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f36070a);
        sb.append(", type=");
        int i8 = this.f36071b;
        sb.append(i8 == 1 ? "required" : i8 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(b(this.f36072c));
        sb.append("}");
        return sb.toString();
    }

    private r(B b8, int i8, int i9) {
        this.f36070a = (B) AbstractC5804A.c(b8, "Null dependency anInterface.");
        this.f36071b = i8;
        this.f36072c = i9;
    }
}
