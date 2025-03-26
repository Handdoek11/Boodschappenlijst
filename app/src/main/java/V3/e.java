package V3;

/* loaded from: classes2.dex */
public class e extends d {

    /* renamed from: a, reason: collision with root package name */
    float f5599a = -1.0f;

    @Override // V3.d
    public void a(m mVar, float f8, float f9, float f10) {
        mVar.o(0.0f, f10 * f9, 180.0f, 180.0f - f8);
        double d8 = f10;
        double d9 = f9;
        mVar.m((float) (Math.sin(Math.toRadians(f8)) * d8 * d9), (float) (Math.sin(Math.toRadians(90.0f - f8)) * d8 * d9));
    }
}
