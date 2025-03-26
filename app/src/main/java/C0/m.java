package c0;

import H.AbstractC0626b;
import J6.AbstractC0650j;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final a f12088b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f12089c = n.a(0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final long f12090a;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final long a() {
            return m.f12089c;
        }

        private a() {
        }
    }

    private /* synthetic */ m(long j8) {
        this.f12090a = j8;
    }

    public static final /* synthetic */ m b(long j8) {
        return new m(j8);
    }

    public static boolean d(long j8, Object obj) {
        return (obj instanceof m) && j8 == ((m) obj).j();
    }

    public static final boolean e(long j8, long j9) {
        return j8 == j9;
    }

    public static final int f(long j8) {
        return (int) (j8 >> 32);
    }

    public static final int g(long j8) {
        return (int) (j8 & 4294967295L);
    }

    public static int h(long j8) {
        return AbstractC0626b.a(j8);
    }

    public static String i(long j8) {
        return '(' + f(j8) + ", " + g(j8) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f12090a, obj);
    }

    public int hashCode() {
        return h(this.f12090a);
    }

    public final /* synthetic */ long j() {
        return this.f12090a;
    }

    public String toString() {
        return i(this.f12090a);
    }

    public static long c(long j8) {
        return j8;
    }
}
