package W;

/* loaded from: classes.dex */
public final class b implements r {

    /* renamed from: b, reason: collision with root package name */
    private final int f5744b;

    public b(int i8) {
        this.f5744b = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f5744b == ((b) obj).f5744b;
    }

    public int hashCode() {
        return this.f5744b;
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f5744b + ')';
    }
}
