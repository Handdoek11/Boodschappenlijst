package F;

/* loaded from: classes.dex */
public abstract class h {
    public static final long a(float f8, float f9) {
        return g.b((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }
}
