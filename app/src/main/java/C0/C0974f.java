package c0;

/* renamed from: c0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0974f implements InterfaceC0973e {

    /* renamed from: a, reason: collision with root package name */
    private final float f12075a;

    /* renamed from: b, reason: collision with root package name */
    private final float f12076b;

    public C0974f(float f8, float f9) {
        this.f12075a = f8;
        this.f12076b = f9;
    }

    @Override // c0.InterfaceC0973e
    public float d() {
        return this.f12075a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0974f)) {
            return false;
        }
        C0974f c0974f = (C0974f) obj;
        return Float.compare(this.f12075a, c0974f.f12075a) == 0 && Float.compare(this.f12076b, c0974f.f12076b) == 0;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f12075a) * 31) + Float.floatToIntBits(this.f12076b);
    }

    @Override // c0.InterfaceC0973e
    public /* synthetic */ float l(float f8) {
        return AbstractC0972d.a(this, f8);
    }

    @Override // c0.InterfaceC0973e
    public /* synthetic */ long q(long j8) {
        return AbstractC0972d.b(this, j8);
    }

    public String toString() {
        return "DensityImpl(density=" + this.f12075a + ", fontScale=" + this.f12076b + ')';
    }
}
