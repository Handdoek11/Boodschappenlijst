package V3;

/* loaded from: classes2.dex */
public class j extends d {

    /* renamed from: a, reason: collision with root package name */
    float f5651a = -1.0f;

    @Override // V3.d
    public void a(m mVar, float f8, float f9, float f10) {
        mVar.o(0.0f, f10 * f9, 180.0f, 180.0f - f8);
        float f11 = f10 * 2.0f * f9;
        mVar.a(0.0f, 0.0f, f11, f11, 180.0f, f8);
    }
}
