package H;

import J6.AbstractC0650j;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final double f2867a;

    /* renamed from: b, reason: collision with root package name */
    private final double f2868b;

    /* renamed from: c, reason: collision with root package name */
    private final double f2869c;

    /* renamed from: d, reason: collision with root package name */
    private final double f2870d;

    /* renamed from: e, reason: collision with root package name */
    private final double f2871e;

    /* renamed from: f, reason: collision with root package name */
    private final double f2872f;

    /* renamed from: g, reason: collision with root package name */
    private final double f2873g;

    public z(double d8, double d9, double d10, double d11, double d12, double d13, double d14) {
        this.f2867a = d8;
        this.f2868b = d9;
        this.f2869c = d10;
        this.f2870d = d11;
        this.f2871e = d12;
        this.f2872f = d13;
        this.f2873g = d14;
        if (Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d8)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d12 < 0.0d || d12 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d12);
        }
        if (d12 == 0.0d && (d9 == 0.0d || d8 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d12 >= 1.0d && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d9 == 0.0d || d8 == 0.0d) && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d11 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d9 < 0.0d || d8 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final double a() {
        return this.f2868b;
    }

    public final double b() {
        return this.f2869c;
    }

    public final double c() {
        return this.f2870d;
    }

    public final double d() {
        return this.f2871e;
    }

    public final double e() {
        return this.f2872f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Double.compare(this.f2867a, zVar.f2867a) == 0 && Double.compare(this.f2868b, zVar.f2868b) == 0 && Double.compare(this.f2869c, zVar.f2869c) == 0 && Double.compare(this.f2870d, zVar.f2870d) == 0 && Double.compare(this.f2871e, zVar.f2871e) == 0 && Double.compare(this.f2872f, zVar.f2872f) == 0 && Double.compare(this.f2873g, zVar.f2873g) == 0;
    }

    public final double f() {
        return this.f2873g;
    }

    public final double g() {
        return this.f2867a;
    }

    public int hashCode() {
        return (((((((((((y.a(this.f2867a) * 31) + y.a(this.f2868b)) * 31) + y.a(this.f2869c)) * 31) + y.a(this.f2870d)) * 31) + y.a(this.f2871e)) * 31) + y.a(this.f2872f)) * 31) + y.a(this.f2873g);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f2867a + ", a=" + this.f2868b + ", b=" + this.f2869c + ", c=" + this.f2870d + ", d=" + this.f2871e + ", e=" + this.f2872f + ", f=" + this.f2873g + ')';
    }

    public /* synthetic */ z(double d8, double d9, double d10, double d11, double d12, double d13, double d14, int i8, AbstractC0650j abstractC0650j) {
        this(d8, d9, d10, d11, d12, (i8 & 32) != 0 ? 0.0d : d13, (i8 & 64) != 0 ? 0.0d : d14);
    }
}
