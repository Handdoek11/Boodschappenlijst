package P6;

/* loaded from: classes2.dex */
final class d implements e {

    /* renamed from: o, reason: collision with root package name */
    private final float f4420o;

    /* renamed from: s, reason: collision with root package name */
    private final float f4421s;

    public d(float f8, float f9) {
        this.f4420o = f8;
        this.f4421s = f9;
    }

    @Override // P6.f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float d() {
        return Float.valueOf(this.f4421s);
    }

    @Override // P6.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float b() {
        return Float.valueOf(this.f4420o);
    }

    public boolean e() {
        return this.f4420o > this.f4421s;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!e() || !((d) obj).e()) {
                d dVar = (d) obj;
                if (this.f4420o != dVar.f4420o || this.f4421s != dVar.f4421s) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (e()) {
            return -1;
        }
        return (Float.floatToIntBits(this.f4420o) * 31) + Float.floatToIntBits(this.f4421s);
    }

    public String toString() {
        return this.f4420o + ".." + this.f4421s;
    }
}
