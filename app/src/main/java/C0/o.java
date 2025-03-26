package c0;

import J6.AbstractC0650j;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f12091a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final long f12092b = b(0);

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final long a() {
            return o.f12092b;
        }

        private a() {
        }
    }

    public static final boolean c(long j8, long j9) {
        return j8 == j9;
    }

    public static final int d(long j8) {
        return (int) (j8 & 4294967295L);
    }

    public static final int e(long j8) {
        return (int) (j8 >> 32);
    }

    public abstract /* synthetic */ long f();

    public static long b(long j8) {
        return j8;
    }
}
