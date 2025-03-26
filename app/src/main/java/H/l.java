package H;

import J6.AbstractC0650j;

/* loaded from: classes.dex */
public final class l extends d {

    /* renamed from: e, reason: collision with root package name */
    public static final a f2829e = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public l(String str, int i8) {
        super(str, c.f2772a.a(), i8, null);
    }

    @Override // H.d
    public float c(int i8) {
        return i8 == 0 ? 100.0f : 128.0f;
    }

    @Override // H.d
    public float d(int i8) {
        return i8 == 0 ? 0.0f : -128.0f;
    }

    @Override // H.d
    public long h(float f8, float f9, float f10) {
        float h8 = (P6.m.h(f8, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float h9 = (P6.m.h(f9, -128.0f, 128.0f) * 0.002f) + h8;
        float f11 = h9 > 0.20689656f ? h9 * h9 * h9 : (h9 - 0.13793103f) * 0.12841855f;
        float f12 = h8 > 0.20689656f ? h8 * h8 * h8 : (h8 - 0.13793103f) * 0.12841855f;
        float f13 = f11 * k.f2818a.c()[0];
        return (Float.floatToRawIntBits(f12 * r5.c()[1]) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    @Override // H.d
    public float i(float f8, float f9, float f10) {
        float h8 = ((P6.m.h(f8, 0.0f, 100.0f) + 16.0f) / 116.0f) - (P6.m.h(f10, -128.0f, 128.0f) * 0.005f);
        return (h8 > 0.20689656f ? h8 * h8 * h8 : 0.12841855f * (h8 - 0.13793103f)) * k.f2818a.c()[2];
    }

    @Override // H.d
    public long j(float f8, float f9, float f10, float f11, d dVar) {
        k kVar = k.f2818a;
        float f12 = f8 / kVar.c()[0];
        float f13 = f9 / kVar.c()[1];
        float f14 = f10 / kVar.c()[2];
        float pow = f12 > 0.008856452f ? (float) Math.pow(f12, 0.33333334f) : (f12 * 7.787037f) + 0.13793103f;
        float pow2 = f13 > 0.008856452f ? (float) Math.pow(f13, 0.33333334f) : (f13 * 7.787037f) + 0.13793103f;
        return G.h.a(P6.m.h((116.0f * pow2) - 16.0f, 0.0f, 100.0f), P6.m.h((pow - pow2) * 500.0f, -128.0f, 128.0f), P6.m.h((pow2 - (f14 > 0.008856452f ? (float) Math.pow(f14, 0.33333334f) : (f14 * 7.787037f) + 0.13793103f)) * 200.0f, -128.0f, 128.0f), f11, dVar);
    }
}
