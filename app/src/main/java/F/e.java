package F;

/* loaded from: classes.dex */
public abstract class e {
    public static final long a(float f8, float f9) {
        return d.c((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    public static final boolean b(long j8) {
        float f8 = d.f(j8);
        if (!Float.isInfinite(f8) && !Float.isNaN(f8)) {
            float g8 = d.g(j8);
            if (!Float.isInfinite(g8) && !Float.isNaN(g8)) {
                return true;
            }
        }
        return false;
    }
}
