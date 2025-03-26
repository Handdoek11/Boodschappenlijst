package W5;

import J6.r;
import X5.j;
import X5.k;
import X5.n;
import X5.q;
import Y5.d;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes2.dex */
public abstract class b {
    public static final String a(CharsetDecoder charsetDecoder, n nVar, int i8) {
        r.e(charsetDecoder, "<this>");
        r.e(nVar, "input");
        StringBuilder sb = new StringBuilder((int) Math.min(i8, g(nVar)));
        a.a(charsetDecoder, nVar, sb, i8);
        String sb2 = sb.toString();
        r.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public static /* synthetic */ String b(CharsetDecoder charsetDecoder, n nVar, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = Integer.MAX_VALUE;
        }
        return a(charsetDecoder, nVar, i8);
    }

    public static final k c(CharsetEncoder charsetEncoder, CharSequence charSequence, int i8, int i9) {
        r.e(charsetEncoder, "<this>");
        r.e(charSequence, "input");
        j jVar = new j(null, 1, 0 == true ? 1 : 0);
        try {
            f(charsetEncoder, jVar, charSequence, i8, i9);
            return jVar.X();
        } catch (Throwable th) {
            jVar.I();
            throw th;
        }
    }

    public static /* synthetic */ k d(CharsetEncoder charsetEncoder, CharSequence charSequence, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = charSequence.length();
        }
        return c(charsetEncoder, charSequence, i8, i9);
    }

    private static final int e(CharsetEncoder charsetEncoder, q qVar) {
        Y5.a d8 = d.d(qVar, 1, null);
        int i8 = 1;
        int i9 = 0;
        while (true) {
            try {
                int g8 = d8.g() - d8.k();
                i8 = a.e(charsetEncoder, d8) ? 0 : i8 + 1;
                i9 += g8 - (d8.g() - d8.k());
                if (i8 <= 0) {
                    return i9;
                }
                d8 = d.d(qVar, 1, d8);
            } finally {
                qVar.d();
            }
        }
    }

    public static final int f(CharsetEncoder charsetEncoder, q qVar, CharSequence charSequence, int i8, int i9) {
        r.e(charsetEncoder, "<this>");
        r.e(qVar, "destination");
        r.e(charSequence, "input");
        if (i8 >= i9) {
            return 0;
        }
        Y5.a d8 = d.d(qVar, 1, null);
        int i10 = 0;
        while (true) {
            try {
                int g8 = d8.g() - d8.k();
                int f8 = a.f(charsetEncoder, charSequence, i8, i9, d8);
                if (f8 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                i8 += f8;
                i10 += g8 - (d8.g() - d8.k());
                int i11 = i8 >= i9 ? 0 : f8 == 0 ? 8 : 1;
                if (i11 <= 0) {
                    qVar.d();
                    return i10 + e(charsetEncoder, qVar);
                }
                d8 = d.d(qVar, i11, d8);
            } catch (Throwable th) {
                qVar.d();
                throw th;
            }
        }
    }

    public static final long g(n nVar) {
        r.e(nVar, "<this>");
        return nVar instanceof k ? nVar.c0() : Math.max(nVar.c0(), 16L);
    }
}
