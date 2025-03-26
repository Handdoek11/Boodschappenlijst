package H2;

/* loaded from: classes.dex */
final class n extends w {

    /* renamed from: a, reason: collision with root package name */
    private final int f2948a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2949b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2950c;

    n(int i8, int i9, boolean z7) {
        this.f2948a = i8;
        this.f2949b = i9;
        this.f2950c = z7;
    }

    @Override // H2.w
    public final int a() {
        return this.f2949b;
    }

    @Override // H2.w
    public final int b() {
        return this.f2948a;
    }

    @Override // H2.w
    public final boolean c() {
        return this.f2950c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f2948a == wVar.b() && this.f2949b == wVar.a() && this.f2950c == wVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f2950c ? 1237 : 1231) ^ ((((this.f2948a ^ 1000003) * 1000003) ^ this.f2949b) * 1000003);
    }

    public final String toString() {
        return "OfflineAdConfig{impressionPrerequisite=" + this.f2948a + ", clickPrerequisite=" + this.f2949b + ", notificationFlowEnabled=" + this.f2950c + "}";
    }
}
