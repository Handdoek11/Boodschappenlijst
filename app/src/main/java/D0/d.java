package d0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f35200a = new d();

    private d() {
    }

    public final float a(float f8, float f9, float f10, float f11, float f12) {
        return b(f8, f9, Math.max(0.0f, Math.min(1.0f, c(f10, f11, f12))));
    }

    public final float b(float f8, float f9, float f10) {
        return f8 + ((f9 - f8) * f10);
    }

    public final float c(float f8, float f9, float f10) {
        if (f8 == f9) {
            return 0.0f;
        }
        return (f10 - f8) / (f9 - f8);
    }
}
