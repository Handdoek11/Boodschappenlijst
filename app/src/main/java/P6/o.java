package P6;

import J6.r;
import P6.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class o extends n {
    public static int c(int i8, int i9) {
        return i8 < i9 ? i9 : i8;
    }

    public static long d(long j8, long j9) {
        return j8 < j9 ? j9 : j8;
    }

    public static int e(int i8, int i9) {
        return i8 > i9 ? i9 : i8;
    }

    public static long f(long j8, long j9) {
        return j8 > j9 ? j9 : j8;
    }

    public static double g(double d8, double d9, double d10) {
        if (d9 <= d10) {
            return d8 < d9 ? d9 : d8 > d10 ? d10 : d8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d10 + " is less than minimum " + d9 + '.');
    }

    public static float h(float f8, float f9, float f10) {
        if (f9 <= f10) {
            return f8 < f9 ? f9 : f8 > f10 ? f10 : f8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f10 + " is less than minimum " + f9 + '.');
    }

    public static int i(int i8, int i9, int i10) {
        if (i9 <= i10) {
            return i8 < i9 ? i9 : i8 > i10 ? i10 : i8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i10 + " is less than minimum " + i9 + '.');
    }

    public static long j(long j8, long j9, long j10) {
        if (j9 <= j10) {
            return j8 < j9 ? j9 : j8 > j10 ? j10 : j8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j10 + " is less than minimum " + j9 + '.');
    }

    public static g k(int i8, int i9) {
        return g.f4422u.a(i8, i9, -1);
    }

    public static g l(g gVar, int i8) {
        r.e(gVar, "<this>");
        n.a(i8 > 0, Integer.valueOf(i8));
        g.a aVar = g.f4422u;
        int e8 = gVar.e();
        int j8 = gVar.j();
        if (gVar.n() <= 0) {
            i8 = -i8;
        }
        return aVar.a(e8, j8, i8);
    }

    public static i m(int i8, int i9) {
        return i9 <= Integer.MIN_VALUE ? i.f4430v.a() : new i(i8, i9 - 1);
    }
}
