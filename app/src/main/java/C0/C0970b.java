package c0;

import H.AbstractC0626b;
import J6.AbstractC0650j;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0970b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f12070b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f12071c = {18, 20, 17, 15};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f12072d = {65535, 262143, 32767, 8191};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f12073e = {32767, 8191, 65535, 262143};

    /* renamed from: a, reason: collision with root package name */
    private final long f12074a;

    /* renamed from: c0.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private final int a(int i8) {
            if (i8 < 8191) {
                return 13;
            }
            if (i8 < 32767) {
                return 15;
            }
            if (i8 < 65535) {
                return 16;
            }
            if (i8 < 262143) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i8 + " in Constraints");
        }

        public final long b(int i8, int i9, int i10, int i11) {
            long j8;
            int i12 = i11 == Integer.MAX_VALUE ? i10 : i11;
            int a8 = a(i12);
            int i13 = i9 == Integer.MAX_VALUE ? i8 : i9;
            int a9 = a(i13);
            if (a8 + a9 > 31) {
                throw new IllegalArgumentException("Can't represent a width of " + i13 + " and height of " + i12 + " in Constraints");
            }
            if (a9 == 13) {
                j8 = 3;
            } else if (a9 == 18) {
                j8 = 1;
            } else if (a9 == 15) {
                j8 = 2;
            } else {
                if (a9 != 16) {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                j8 = 0;
            }
            int i14 = i9 == Integer.MAX_VALUE ? 0 : i9 + 1;
            int i15 = i11 != Integer.MAX_VALUE ? i11 + 1 : 0;
            int i16 = C0970b.f12071c[(int) j8];
            return C0970b.c((i14 << 33) | j8 | (i8 << 2) | (i10 << i16) | (i15 << (i16 + 31)));
        }

        private a() {
        }
    }

    private /* synthetic */ C0970b(long j8) {
        this.f12074a = j8;
    }

    public static final /* synthetic */ C0970b b(long j8) {
        return new C0970b(j8);
    }

    public static boolean d(long j8, Object obj) {
        return (obj instanceof C0970b) && j8 == ((C0970b) obj).m();
    }

    public static final boolean e(long j8, long j9) {
        return j8 == j9;
    }

    private static final int f(long j8) {
        return (int) (j8 & 3);
    }

    public static final int g(long j8) {
        int f8 = f(j8);
        int i8 = ((int) (j8 >> (f12071c[f8] + 31))) & f12073e[f8];
        if (i8 == 0) {
            return Integer.MAX_VALUE;
        }
        return i8 - 1;
    }

    public static final int h(long j8) {
        int i8 = ((int) (j8 >> 33)) & f12072d[f(j8)];
        if (i8 == 0) {
            return Integer.MAX_VALUE;
        }
        return i8 - 1;
    }

    public static final int i(long j8) {
        int f8 = f(j8);
        return ((int) (j8 >> f12071c[f8])) & f12073e[f8];
    }

    public static final int j(long j8) {
        return ((int) (j8 >> 2)) & f12072d[f(j8)];
    }

    public static int k(long j8) {
        return AbstractC0626b.a(j8);
    }

    public static String l(long j8) {
        int h8 = h(j8);
        String valueOf = h8 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(h8);
        int g8 = g(j8);
        return "Constraints(minWidth = " + j(j8) + ", maxWidth = " + valueOf + ", minHeight = " + i(j8) + ", maxHeight = " + (g8 != Integer.MAX_VALUE ? String.valueOf(g8) : "Infinity") + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f12074a, obj);
    }

    public int hashCode() {
        return k(this.f12074a);
    }

    public final /* synthetic */ long m() {
        return this.f12074a;
    }

    public String toString() {
        return l(this.f12074a);
    }

    public static long c(long j8) {
        return j8;
    }
}
