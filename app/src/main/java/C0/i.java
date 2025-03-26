package c0;

import J6.AbstractC0650j;

/* loaded from: classes.dex */
public abstract class i implements Comparable {

    /* renamed from: o, reason: collision with root package name */
    public static final a f12080o = new a(null);

    /* renamed from: s, reason: collision with root package name */
    private static final float f12081s = c(0.0f);

    /* renamed from: t, reason: collision with root package name */
    private static final float f12082t = c(Float.POSITIVE_INFINITY);

    /* renamed from: u, reason: collision with root package name */
    private static final float f12083u = c(Float.NaN);

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final float a() {
            return i.f12083u;
        }

        private a() {
        }
    }

    public static final boolean f(float f8, float f9) {
        return Float.compare(f8, f9) == 0;
    }

    public static int g(float f8) {
        return Float.floatToIntBits(f8);
    }

    public static float c(float f8) {
        return f8;
    }
}
