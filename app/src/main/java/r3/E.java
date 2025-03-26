package r3;

/* loaded from: classes.dex */
final class E extends H {

    /* renamed from: a, reason: collision with root package name */
    private final String f42544a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f42545b;

    /* renamed from: c, reason: collision with root package name */
    private final int f42546c;

    /* synthetic */ E(String str, boolean z7, int i8, D d8) {
        this.f42544a = str;
        this.f42545b = z7;
        this.f42546c = i8;
    }

    @Override // r3.H
    public final int a() {
        return this.f42546c;
    }

    @Override // r3.H
    public final String b() {
        return this.f42544a;
    }

    @Override // r3.H
    public final boolean c() {
        return this.f42545b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H) {
            H h8 = (H) obj;
            if (this.f42544a.equals(h8.b()) && this.f42545b == h8.c() && this.f42546c == h8.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f42544a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f42545b ? 1237 : 1231)) * 1000003) ^ this.f42546c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f42544a + ", enableFirelog=" + this.f42545b + ", firelogEventType=" + this.f42546c + "}";
    }
}
