package R4;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final String f4898a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4899b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4900c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4901d;

    public u(String str, int i8, int i9, boolean z7) {
        J6.r.e(str, "processName");
        this.f4898a = str;
        this.f4899b = i8;
        this.f4900c = i9;
        this.f4901d = z7;
    }

    public final int a() {
        return this.f4900c;
    }

    public final int b() {
        return this.f4899b;
    }

    public final String c() {
        return this.f4898a;
    }

    public final boolean d() {
        return this.f4901d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return J6.r.a(this.f4898a, uVar.f4898a) && this.f4899b == uVar.f4899b && this.f4900c == uVar.f4900c && this.f4901d == uVar.f4901d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f4898a.hashCode() * 31) + this.f4899b) * 31) + this.f4900c) * 31;
        boolean z7 = this.f4901d;
        int i8 = z7;
        if (z7 != 0) {
            i8 = 1;
        }
        return hashCode + i8;
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f4898a + ", pid=" + this.f4899b + ", importance=" + this.f4900c + ", isDefaultProcess=" + this.f4901d + ')';
    }
}
