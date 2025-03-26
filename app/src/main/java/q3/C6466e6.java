package q3;

/* renamed from: q3.e6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6466e6 extends AbstractC6498i6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f41654a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f41655b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41656c;

    /* synthetic */ C6466e6(String str, boolean z7, int i8, AbstractC6458d6 abstractC6458d6) {
        this.f41654a = str;
        this.f41655b = z7;
        this.f41656c = i8;
    }

    @Override // q3.AbstractC6498i6
    public final int a() {
        return this.f41656c;
    }

    @Override // q3.AbstractC6498i6
    public final String b() {
        return this.f41654a;
    }

    @Override // q3.AbstractC6498i6
    public final boolean c() {
        return this.f41655b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6498i6) {
            AbstractC6498i6 abstractC6498i6 = (AbstractC6498i6) obj;
            if (this.f41654a.equals(abstractC6498i6.b()) && this.f41655b == abstractC6498i6.c() && this.f41656c == abstractC6498i6.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f41654a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f41655b ? 1237 : 1231)) * 1000003) ^ this.f41656c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f41654a + ", enableFirelog=" + this.f41655b + ", firelogEventType=" + this.f41656c + "}";
    }
}
