package L6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class c extends b {
    public static int a(float f8) {
        if (Float.isNaN(f8)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f8);
    }

    public static long b(double d8) {
        if (Double.isNaN(d8)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d8);
    }
}
