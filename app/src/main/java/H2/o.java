package H2;

/* loaded from: classes.dex */
final class o extends x {

    /* renamed from: a, reason: collision with root package name */
    private final int f2951a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2952b;

    /* renamed from: c, reason: collision with root package name */
    private final double f2953c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f2954d;

    o(int i8, int i9, double d8, boolean z7) {
        this.f2951a = i8;
        this.f2952b = i9;
        this.f2953c = d8;
        this.f2954d = z7;
    }

    @Override // H2.x
    public final double a() {
        return this.f2953c;
    }

    @Override // H2.x
    public final int b() {
        return this.f2952b;
    }

    @Override // H2.x
    public final int c() {
        return this.f2951a;
    }

    @Override // H2.x
    public final boolean d() {
        return this.f2954d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f2951a == xVar.c() && this.f2952b == xVar.b() && Double.doubleToLongBits(this.f2953c) == Double.doubleToLongBits(xVar.a()) && this.f2954d == xVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((int) ((Double.doubleToLongBits(this.f2953c) >>> 32) ^ Double.doubleToLongBits(this.f2953c))) ^ ((((this.f2951a ^ 1000003) * 1000003) ^ this.f2952b) * 1000003)) * 1000003) ^ (true != this.f2954d ? 1237 : 1231);
    }

    public final String toString() {
        return "PingStrategy{maxAttempts=" + this.f2951a + ", initialBackoffMs=" + this.f2952b + ", backoffMultiplier=" + this.f2953c + ", bufferAfterMaxAttempts=" + this.f2954d + "}";
    }
}
