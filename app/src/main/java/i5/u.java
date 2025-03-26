package I5;

import J6.AbstractC0650j;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final a f3386d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final u f3387e = new u("HTTP", 2, 0);

    /* renamed from: f, reason: collision with root package name */
    private static final u f3388f = new u("HTTP", 1, 1);

    /* renamed from: g, reason: collision with root package name */
    private static final u f3389g = new u("HTTP", 1, 0);

    /* renamed from: h, reason: collision with root package name */
    private static final u f3390h = new u("SPDY", 3, 0);

    /* renamed from: i, reason: collision with root package name */
    private static final u f3391i = new u("QUIC", 1, 0);

    /* renamed from: a, reason: collision with root package name */
    private final String f3392a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3393b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3394c;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final u a() {
            return u.f3388f;
        }

        private a() {
        }
    }

    public u(String str, int i8, int i9) {
        J6.r.e(str, "name");
        this.f3392a = str;
        this.f3393b = i8;
        this.f3394c = i9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return J6.r.a(this.f3392a, uVar.f3392a) && this.f3393b == uVar.f3393b && this.f3394c == uVar.f3394c;
    }

    public int hashCode() {
        return (((this.f3392a.hashCode() * 31) + this.f3393b) * 31) + this.f3394c;
    }

    public String toString() {
        return this.f3392a + '/' + this.f3393b + '.' + this.f3394c;
    }
}
