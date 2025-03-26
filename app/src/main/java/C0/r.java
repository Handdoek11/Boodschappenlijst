package c0;

import d0.InterfaceC5695a;

/* loaded from: classes.dex */
final class r implements InterfaceC5695a {

    /* renamed from: a, reason: collision with root package name */
    private final float f12096a;

    public r(float f8) {
        this.f12096a = f8;
    }

    @Override // d0.InterfaceC5695a
    public float a(float f8) {
        return f8 * this.f12096a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Float.compare(this.f12096a, ((r) obj).f12096a) == 0;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f12096a);
    }

    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.f12096a + ')';
    }
}
