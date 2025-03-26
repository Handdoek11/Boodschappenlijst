package H;

/* loaded from: classes.dex */
public final class B extends d {
    public B(String str, int i8) {
        super(str, c.f2772a.c(), i8, null);
    }

    private final float k(float f8) {
        return P6.m.h(f8, -2.0f, 2.0f);
    }

    @Override // H.d
    public float c(int i8) {
        return 2.0f;
    }

    @Override // H.d
    public float d(int i8) {
        return -2.0f;
    }

    @Override // H.d
    public long h(float f8, float f9, float f10) {
        float k8 = k(f8);
        float k9 = k(f9);
        return (Float.floatToRawIntBits(k9) & 4294967295L) | (Float.floatToRawIntBits(k8) << 32);
    }

    @Override // H.d
    public float i(float f8, float f9, float f10) {
        return k(f10);
    }

    @Override // H.d
    public long j(float f8, float f9, float f10, float f11, d dVar) {
        return G.h.a(k(f8), k(f9), k(f10), f11, dVar);
    }
}
