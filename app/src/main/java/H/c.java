package H;

import J6.AbstractC0650j;
import com.adadapted.android.sdk.core.device.DeviceInfo;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2772a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final long f2773b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f2774c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f2775d;

    /* renamed from: e, reason: collision with root package name */
    private static final long f2776e;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final long a() {
            return c.f2775d;
        }

        public final long b() {
            return c.f2773b;
        }

        public final long c() {
            return c.f2774c;
        }

        private a() {
        }
    }

    static {
        long j8 = 3;
        long j9 = j8 << 32;
        f2773b = d((0 & 4294967295L) | j9);
        f2774c = d((1 & 4294967295L) | j9);
        f2775d = d(j9 | (2 & 4294967295L));
        f2776e = d((j8 & 4294967295L) | (4 << 32));
    }

    public static final boolean e(long j8, long j9) {
        return j8 == j9;
    }

    public static final int f(long j8) {
        return (int) (j8 >> 32);
    }

    public static int g(long j8) {
        return AbstractC0626b.a(j8);
    }

    public static String h(long j8) {
        return e(j8, f2773b) ? "Rgb" : e(j8, f2774c) ? "Xyz" : e(j8, f2775d) ? "Lab" : e(j8, f2776e) ? "Cmyk" : DeviceInfo.UNKNOWN_VALUE;
    }

    public static long d(long j8) {
        return j8;
    }
}
