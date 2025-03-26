package T6;

import H.AbstractC0626b;
import J6.AbstractC0650j;
import J6.r;
import P6.l;
import P6.m;
import S6.h;

/* loaded from: classes2.dex */
public final class a implements Comparable {

    /* renamed from: s, reason: collision with root package name */
    public static final C0107a f5296s = new C0107a(null);

    /* renamed from: t, reason: collision with root package name */
    private static final long f5297t = l(0);

    /* renamed from: u, reason: collision with root package name */
    private static final long f5298u = c.j(4611686018427387903L);

    /* renamed from: v, reason: collision with root package name */
    private static final long f5299v = c.j(-4611686018427387903L);

    /* renamed from: o, reason: collision with root package name */
    private final long f5300o;

    /* renamed from: T6.a$a, reason: collision with other inner class name */
    public static final class C0107a {
        public /* synthetic */ C0107a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final long a() {
            return a.f5298u;
        }

        public final long b() {
            return a.f5297t;
        }

        public final long c(String str) {
            r.e(str, "value");
            try {
                return c.p(str, true);
            } catch (IllegalArgumentException e8) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e8);
            }
        }

        private C0107a() {
        }
    }

    private /* synthetic */ a(long j8) {
        this.f5300o = j8;
    }

    private static final long A(long j8) {
        return j8 >> 1;
    }

    public static int B(long j8) {
        return AbstractC0626b.a(j8);
    }

    public static final boolean C(long j8) {
        return !F(j8);
    }

    private static final boolean D(long j8) {
        return (((int) j8) & 1) == 1;
    }

    private static final boolean E(long j8) {
        return (((int) j8) & 1) == 0;
    }

    public static final boolean F(long j8) {
        return j8 == f5298u || j8 == f5299v;
    }

    public static final boolean G(long j8) {
        return j8 < 0;
    }

    public static final boolean H(long j8) {
        return j8 > 0;
    }

    public static final long I(long j8, long j9) {
        if (F(j8)) {
            if (C(j9) || (j9 ^ j8) >= 0) {
                return j8;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (F(j9)) {
            return j9;
        }
        if ((((int) j8) & 1) != (((int) j9) & 1)) {
            return D(j8) ? f(j8, A(j8), A(j9)) : f(j8, A(j9), A(j8));
        }
        long A7 = A(j8) + A(j9);
        return E(j8) ? c.m(A7) : c.k(A7);
    }

    public static final String J(long j8) {
        StringBuilder sb = new StringBuilder();
        if (G(j8)) {
            sb.append('-');
        }
        sb.append("PT");
        long p8 = p(j8);
        long s8 = s(p8);
        int w7 = w(p8);
        int y7 = y(p8);
        int x7 = x(p8);
        if (F(j8)) {
            s8 = 9999999999999L;
        }
        boolean z7 = false;
        boolean z8 = s8 != 0;
        boolean z9 = (y7 == 0 && x7 == 0) ? false : true;
        if (w7 != 0 || (z9 && z8)) {
            z7 = true;
        }
        if (z8) {
            sb.append(s8);
            sb.append('H');
        }
        if (z7) {
            sb.append(w7);
            sb.append('M');
        }
        if (z9 || (!z8 && !z7)) {
            g(j8, sb, y7, x7, 9, "S", true);
        }
        String sb2 = sb.toString();
        r.d(sb2, "toString(...)");
        return sb2;
    }

    public static final long K(long j8, d dVar) {
        r.e(dVar, "unit");
        if (j8 == f5298u) {
            return Long.MAX_VALUE;
        }
        if (j8 == f5299v) {
            return Long.MIN_VALUE;
        }
        return e.b(A(j8), z(j8), dVar);
    }

    public static String L(long j8) {
        if (j8 == 0) {
            return "0s";
        }
        if (j8 == f5298u) {
            return "Infinity";
        }
        if (j8 == f5299v) {
            return "-Infinity";
        }
        boolean G7 = G(j8);
        StringBuilder sb = new StringBuilder();
        if (G7) {
            sb.append('-');
        }
        long p8 = p(j8);
        long r8 = r(p8);
        int q8 = q(p8);
        int w7 = w(p8);
        int y7 = y(p8);
        int x7 = x(p8);
        int i8 = 0;
        boolean z7 = r8 != 0;
        boolean z8 = q8 != 0;
        boolean z9 = w7 != 0;
        boolean z10 = (y7 == 0 && x7 == 0) ? false : true;
        if (z7) {
            sb.append(r8);
            sb.append('d');
            i8 = 1;
        }
        if (z8 || (z7 && (z9 || z10))) {
            int i9 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(q8);
            sb.append('h');
            i8 = i9;
        }
        if (z9 || (z10 && (z8 || z7))) {
            int i10 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(w7);
            sb.append('m');
            i8 = i10;
        }
        if (z10) {
            int i11 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            if (y7 != 0 || z7 || z8 || z9) {
                g(j8, sb, y7, x7, 9, "s", false);
            } else if (x7 >= 1000000) {
                g(j8, sb, x7 / 1000000, x7 % 1000000, 6, "ms", false);
            } else if (x7 >= 1000) {
                g(j8, sb, x7 / 1000, x7 % 1000, 3, "us", false);
            } else {
                sb.append(x7);
                sb.append("ns");
            }
            i8 = i11;
        }
        if (G7 && i8 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        r.d(sb2, "toString(...)");
        return sb2;
    }

    public static final long M(long j8) {
        return c.i(-A(j8), ((int) j8) & 1);
    }

    private static final long f(long j8, long j9, long j10) {
        long o8 = c.o(j10);
        long j11 = j9 + o8;
        if (!new l(-4611686018426L, 4611686018426L).o(j11)) {
            return c.j(m.j(j11, -4611686018427387903L, 4611686018427387903L));
        }
        return c.l(c.n(j11) + (j10 - c.n(o8)));
    }

    private static final void g(long j8, StringBuilder sb, int i8, int i9, int i10, String str, boolean z7) {
        sb.append(i8);
        if (i9 != 0) {
            sb.append('.');
            String a02 = h.a0(String.valueOf(i9), i10, '0');
            int i11 = -1;
            int length = a02.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i12 = length - 1;
                    if (a02.charAt(length) != '0') {
                        i11 = length;
                        break;
                    } else if (i12 < 0) {
                        break;
                    } else {
                        length = i12;
                    }
                }
            }
            int i13 = i11 + 1;
            if (z7 || i13 >= 3) {
                sb.append((CharSequence) a02, 0, ((i11 + 3) / 3) * 3);
                r.d(sb, "append(...)");
            } else {
                sb.append((CharSequence) a02, 0, i13);
                r.d(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ a h(long j8) {
        return new a(j8);
    }

    public static int k(long j8, long j9) {
        long j10 = j8 ^ j9;
        if (j10 < 0 || (((int) j10) & 1) == 0) {
            return r.g(j8, j9);
        }
        int i8 = (((int) j8) & 1) - (((int) j9) & 1);
        return G(j8) ? -i8 : i8;
    }

    public static long l(long j8) {
        if (b.a()) {
            if (E(j8)) {
                if (!new l(-4611686018426999999L, 4611686018426999999L).o(A(j8))) {
                    throw new AssertionError(A(j8) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new l(-4611686018427387903L, 4611686018427387903L).o(A(j8))) {
                    throw new AssertionError(A(j8) + " ms is out of milliseconds range");
                }
                if (new l(-4611686018426L, 4611686018426L).o(A(j8))) {
                    throw new AssertionError(A(j8) + " ms is denormalized");
                }
            }
        }
        return j8;
    }

    public static boolean m(long j8, Object obj) {
        return (obj instanceof a) && j8 == ((a) obj).N();
    }

    public static final long p(long j8) {
        return G(j8) ? M(j8) : j8;
    }

    public static final int q(long j8) {
        if (F(j8)) {
            return 0;
        }
        return (int) (s(j8) % 24);
    }

    public static final long r(long j8) {
        return K(j8, d.f5310y);
    }

    public static final long s(long j8) {
        return K(j8, d.f5309x);
    }

    public static final long t(long j8) {
        return (D(j8) && C(j8)) ? A(j8) : K(j8, d.f5306u);
    }

    public static final long u(long j8) {
        return K(j8, d.f5308w);
    }

    public static final long v(long j8) {
        return K(j8, d.f5307v);
    }

    public static final int w(long j8) {
        if (F(j8)) {
            return 0;
        }
        return (int) (u(j8) % 60);
    }

    public static final int x(long j8) {
        if (F(j8)) {
            return 0;
        }
        return (int) (D(j8) ? c.n(A(j8) % 1000) : A(j8) % 1000000000);
    }

    public static final int y(long j8) {
        if (F(j8)) {
            return 0;
        }
        return (int) (v(j8) % 60);
    }

    private static final d z(long j8) {
        return E(j8) ? d.f5304s : d.f5306u;
    }

    public final /* synthetic */ long N() {
        return this.f5300o;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return i(((a) obj).N());
    }

    public boolean equals(Object obj) {
        return m(this.f5300o, obj);
    }

    public int hashCode() {
        return B(this.f5300o);
    }

    public int i(long j8) {
        return k(this.f5300o, j8);
    }

    public String toString() {
        return L(this.f5300o);
    }
}
