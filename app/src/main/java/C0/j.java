package c0;

/* loaded from: classes.dex */
public abstract class j {
    public static final long a(float f8, float f9) {
        return k.c((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }
}
