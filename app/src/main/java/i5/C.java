package I5;

import I5.x;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public abstract class C {
    private static final void a(y yVar, String str, int i8, int i9, int i10, boolean z7) {
        String substring;
        String substring2;
        String substring3;
        if (i9 == -1) {
            int f8 = f(i8, i10, str);
            int e8 = e(f8, i10, str);
            if (e8 > f8) {
                if (z7) {
                    substring3 = AbstractC0627a.k(str, f8, e8, false, null, 12, null);
                } else {
                    substring3 = str.substring(f8, e8);
                    J6.r.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                yVar.f(substring3, AbstractC6987o.e());
                return;
            }
            return;
        }
        int f9 = f(i8, i9, str);
        int e9 = e(f9, i9, str);
        if (e9 > f9) {
            if (z7) {
                substring = AbstractC0627a.k(str, f9, e9, false, null, 12, null);
            } else {
                substring = str.substring(f9, e9);
                J6.r.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            int f10 = f(i9 + 1, i10, str);
            int e10 = e(f10, i10, str);
            if (z7) {
                substring2 = AbstractC0627a.k(str, f10, e10, true, null, 8, null);
            } else {
                substring2 = str.substring(f10, e10);
                J6.r.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            yVar.g(substring, substring2);
        }
    }

    private static final void b(y yVar, String str, int i8, int i9, boolean z7) {
        int i10;
        int i11;
        int J7 = S6.h.J(str);
        int i12 = 0;
        if (i8 <= J7) {
            int i13 = 0;
            int i14 = -1;
            int i15 = i8;
            int i16 = i15;
            while (i13 != i9) {
                char charAt = str.charAt(i15);
                if (charAt == '&') {
                    a(yVar, str, i16, i14, i15, z7);
                    i13++;
                    i14 = -1;
                    i16 = i15 + 1;
                } else if (charAt == '=' && i14 == -1) {
                    i14 = i15;
                }
                if (i15 != J7) {
                    i15++;
                } else {
                    i11 = i16;
                    i10 = i14;
                    i12 = i13;
                }
            }
            return;
        }
        i10 = -1;
        i11 = i8;
        if (i12 == i9) {
            return;
        }
        a(yVar, str, i11, i10, str.length(), z7);
    }

    public static final x c(String str, int i8, int i9, boolean z7) {
        J6.r.e(str, "query");
        if (i8 > S6.h.J(str)) {
            return x.f3452b.a();
        }
        x.a aVar = x.f3452b;
        y b8 = B.b(0, 1, null);
        b(b8, str, i8, i9, z7);
        return b8.a();
    }

    public static /* synthetic */ x d(String str, int i8, int i9, boolean z7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = 1000;
        }
        if ((i10 & 8) != 0) {
            z7 = true;
        }
        return c(str, i8, i9, z7);
    }

    private static final int e(int i8, int i9, CharSequence charSequence) {
        while (i9 > i8 && S6.a.c(charSequence.charAt(i9 - 1))) {
            i9--;
        }
        return i9;
    }

    private static final int f(int i8, int i9, CharSequence charSequence) {
        while (i8 < i9 && S6.a.c(charSequence.charAt(i8))) {
            i8++;
        }
        return i8;
    }
}
