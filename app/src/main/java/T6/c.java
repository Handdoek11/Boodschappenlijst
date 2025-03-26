package T6;

import J6.r;
import P6.i;
import P6.l;
import P6.m;
import S6.h;
import T6.a;
import java.util.Collection;
import java.util.Iterator;
import y6.AbstractC6968G;

/* loaded from: classes2.dex */
public abstract class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j8, int i8) {
        return a.l((j8 << 1) + i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j8) {
        return a.l((j8 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j8) {
        return new l(-4611686018426L, 4611686018426L).o(j8) ? l(n(j8)) : j(m.j(j8, -4611686018427387903L, 4611686018427387903L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j8) {
        return a.l(j8 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j8) {
        return new l(-4611686018426999999L, 4611686018426999999L).o(j8) ? l(j8) : j(o(j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j8) {
        return j8 * 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long o(long j8) {
        return j8 / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long p(String str, boolean z7) {
        long j8;
        String str2 = str;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        a.C0107a c0107a = a.f5296s;
        long b8 = c0107a.b();
        char charAt = str2.charAt(0);
        boolean z8 = true;
        int i8 = (charAt == '+' || charAt == '-') ? 1 : 0;
        boolean z9 = i8 > 0;
        boolean z10 = z9 && h.p0(str2, '-', false, 2, null);
        if (length <= i8) {
            throw new IllegalArgumentException("No components");
        }
        char c8 = '9';
        char c9 = '0';
        if (str2.charAt(i8) == 'P') {
            int i9 = i8 + 1;
            if (i9 == length) {
                throw new IllegalArgumentException();
            }
            d dVar = null;
            boolean z11 = false;
            while (i9 < length) {
                if (str2.charAt(i9) != 'T') {
                    int i10 = i9;
                    while (i10 < str.length()) {
                        char charAt2 = str2.charAt(i10);
                        if (!new P6.c(c9, c8).o(charAt2) && !h.F("+-.", charAt2, false, 2, null)) {
                            break;
                        }
                        i10++;
                        c8 = '9';
                        c9 = '0';
                    }
                    r.c(str2, "null cannot be cast to non-null type java.lang.String");
                    String substring = str2.substring(i9, i10);
                    r.d(substring, "substring(...)");
                    if (substring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length2 = i9 + substring.length();
                    if (length2 < 0 || length2 > h.J(str)) {
                        throw new IllegalArgumentException("Missing unit for value " + substring);
                    }
                    char charAt3 = str2.charAt(length2);
                    i9 = length2 + 1;
                    d d8 = f.d(charAt3, z11);
                    if (dVar != null && dVar.compareTo(d8) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int O7 = h.O(substring, '.', 0, false, 6, null);
                    if (d8 != d.f5307v || O7 <= 0) {
                        b8 = a.I(b8, t(q(substring), d8));
                    } else {
                        r.c(substring, "null cannot be cast to non-null type java.lang.String");
                        String substring2 = substring.substring(0, O7);
                        r.d(substring2, "substring(...)");
                        long I7 = a.I(b8, t(q(substring2), d8));
                        r.c(substring, "null cannot be cast to non-null type java.lang.String");
                        String substring3 = substring.substring(O7);
                        r.d(substring3, "substring(...)");
                        b8 = a.I(I7, r(Double.parseDouble(substring3), d8));
                    }
                    dVar = d8;
                    c8 = '9';
                    c9 = '0';
                    z8 = true;
                    str2 = str;
                } else {
                    if (z11 || (i9 = i9 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z11 = z8;
                }
            }
        } else {
            if (z7) {
                throw new IllegalArgumentException();
            }
            String str3 = "Unexpected order of duration components";
            if (h.u(str, i8, "Infinity", 0, Math.max(length - i8, 8), true)) {
                b8 = c0107a.a();
            } else {
                boolean z12 = !z9;
                if (z9 && str.charAt(i8) == '(' && h.A0(str) == ')') {
                    i8++;
                    length--;
                    if (i8 == length) {
                        throw new IllegalArgumentException("No components");
                    }
                    j8 = b8;
                    z12 = true;
                } else {
                    j8 = b8;
                }
                boolean z13 = false;
                d dVar2 = null;
                while (i8 < length) {
                    if (z13 && z12) {
                        while (i8 < str.length() && str.charAt(i8) == ' ') {
                            i8++;
                        }
                    }
                    int i11 = i8;
                    while (i11 < str.length()) {
                        char charAt4 = str.charAt(i11);
                        if (!new P6.c('0', '9').o(charAt4) && charAt4 != '.') {
                            break;
                        }
                        i11++;
                    }
                    r.c(str, "null cannot be cast to non-null type java.lang.String");
                    String substring4 = str.substring(i8, i11);
                    r.d(substring4, "substring(...)");
                    if (substring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i8 + substring4.length();
                    int i12 = length3;
                    while (i12 < str.length()) {
                        if (!new P6.c('a', 'z').o(str.charAt(i12))) {
                            break;
                        }
                        i12++;
                    }
                    r.c(str, "null cannot be cast to non-null type java.lang.String");
                    String substring5 = str.substring(length3, i12);
                    r.d(substring5, "substring(...)");
                    i8 = length3 + substring5.length();
                    d e8 = f.e(substring5);
                    if (dVar2 != null && dVar2.compareTo(e8) <= 0) {
                        throw new IllegalArgumentException(str3);
                    }
                    String str4 = str3;
                    int O8 = h.O(substring4, '.', 0, false, 6, null);
                    if (O8 > 0) {
                        r.c(substring4, "null cannot be cast to non-null type java.lang.String");
                        String substring6 = substring4.substring(0, O8);
                        r.d(substring6, "substring(...)");
                        long I8 = a.I(j8, t(Long.parseLong(substring6), e8));
                        r.c(substring4, "null cannot be cast to non-null type java.lang.String");
                        String substring7 = substring4.substring(O8);
                        r.d(substring7, "substring(...)");
                        j8 = a.I(I8, r(Double.parseDouble(substring7), e8));
                        if (i8 < length) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        j8 = a.I(j8, t(Long.parseLong(substring4), e8));
                    }
                    dVar2 = e8;
                    str3 = str4;
                    z13 = true;
                }
                b8 = j8;
            }
        }
        return z10 ? a.M(b8) : b8;
    }

    private static final long q(String str) {
        int length = str.length();
        int i8 = (length <= 0 || !h.F("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i8 > 16) {
            Iterable iVar = new i(i8, h.J(str));
            if (!(iVar instanceof Collection) || !((Collection) iVar).isEmpty()) {
                Iterator it = iVar.iterator();
                while (it.hasNext()) {
                    if (!new P6.c('0', '9').o(str.charAt(((AbstractC6968G) it).a()))) {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (h.B(str, "+", false, 2, null)) {
            str = h.y0(str, 1);
        }
        return Long.parseLong(str);
    }

    public static final long r(double d8, d dVar) {
        r.e(dVar, "unit");
        double a8 = e.a(d8, dVar, d.f5304s);
        if (Double.isNaN(a8)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long b8 = L6.a.b(a8);
        return new l(-4611686018426999999L, 4611686018426999999L).o(b8) ? l(b8) : k(L6.a.b(e.a(d8, dVar, d.f5306u)));
    }

    public static final long s(int i8, d dVar) {
        r.e(dVar, "unit");
        return dVar.compareTo(d.f5307v) <= 0 ? l(e.c(i8, dVar, d.f5304s)) : t(i8, dVar);
    }

    public static final long t(long j8, d dVar) {
        r.e(dVar, "unit");
        d dVar2 = d.f5304s;
        long c8 = e.c(4611686018426999999L, dVar2, dVar);
        return new l(-c8, c8).o(j8) ? l(e.c(j8, dVar, dVar2)) : j(m.j(e.b(j8, dVar, d.f5306u), -4611686018427387903L, 4611686018427387903L));
    }
}
