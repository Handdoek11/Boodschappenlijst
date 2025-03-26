package c0;

import d0.InterfaceC5695a;

/* loaded from: classes.dex */
final class h implements InterfaceC0973e {

    /* renamed from: a, reason: collision with root package name */
    private final float f12077a;

    /* renamed from: b, reason: collision with root package name */
    private final float f12078b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5695a f12079c;

    public h(float f8, float f9, InterfaceC5695a interfaceC5695a) {
        this.f12077a = f8;
        this.f12078b = f9;
        this.f12079c = interfaceC5695a;
    }

    @Override // c0.InterfaceC0973e
    public float d() {
        return this.f12077a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f12077a, hVar.f12077a) == 0 && Float.compare(this.f12078b, hVar.f12078b) == 0 && J6.r.a(this.f12079c, hVar.f12079c);
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f12077a) * 31) + Float.floatToIntBits(this.f12078b)) * 31) + this.f12079c.hashCode();
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
        return "DensityWithConverter(density=" + this.f12077a + ", fontScale=" + this.f12078b + ", converter=" + this.f12079c + ')';
    }
}
