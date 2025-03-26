package H;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private final float f2765a;

    /* renamed from: b, reason: collision with root package name */
    private final float f2766b;

    public A(float f8, float f9) {
        this.f2765a = f8;
        this.f2766b = f9;
    }

    public final float a() {
        return this.f2765a;
    }

    public final float b() {
        return this.f2766b;
    }

    public final float[] c() {
        float f8 = this.f2765a;
        float f9 = this.f2766b;
        return new float[]{f8 / f9, 1.0f, ((1.0f - f8) - f9) / f9};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a8 = (A) obj;
        return Float.compare(this.f2765a, a8.f2765a) == 0 && Float.compare(this.f2766b, a8.f2766b) == 0;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f2765a) * 31) + Float.floatToIntBits(this.f2766b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f2765a + ", y=" + this.f2766b + ')';
    }
}
