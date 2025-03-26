package X5;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes2.dex */
public abstract class r {
    public static final Void a(int i8) {
        throw new EOFException("Premature end of stream: expected " + i8 + " bytes");
    }

    public static final byte[] b(k kVar, int i8) {
        J6.r.e(kVar, "<this>");
        if (i8 == 0) {
            return Y5.d.f6135a;
        }
        byte[] bArr = new byte[i8];
        o.a(kVar, bArr, 0, i8);
        return bArr;
    }

    public static /* synthetic */ byte[] c(k kVar, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            long c02 = kVar.c0();
            if (c02 > 2147483647L) {
                throw new IllegalArgumentException("Unable to convert to a ByteArray: packet is too big");
            }
            i8 = (int) c02;
        }
        return b(kVar, i8);
    }

    public static final String d(n nVar, Charset charset, int i8) {
        J6.r.e(nVar, "<this>");
        J6.r.e(charset, "charset");
        CharsetDecoder newDecoder = charset.newDecoder();
        J6.r.d(newDecoder, "charset.newDecoder()");
        return W5.b.a(newDecoder, nVar, i8);
    }

    public static /* synthetic */ String e(n nVar, Charset charset, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charset = S6.d.f5130b;
        }
        if ((i9 & 2) != 0) {
            i8 = Integer.MAX_VALUE;
        }
        return d(nVar, charset, i8);
    }

    public static final String f(n nVar, int i8, Charset charset) {
        J6.r.e(nVar, "<this>");
        J6.r.e(charset, "charset");
        CharsetDecoder newDecoder = charset.newDecoder();
        J6.r.d(newDecoder, "charset.newDecoder()");
        return W5.a.b(newDecoder, nVar, i8);
    }

    public static /* synthetic */ String g(n nVar, int i8, Charset charset, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            charset = S6.d.f5130b;
        }
        return f(nVar, i8, charset);
    }

    public static final void h(q qVar, CharSequence charSequence, int i8, int i9, Charset charset) {
        J6.r.e(qVar, "<this>");
        J6.r.e(charSequence, "text");
        J6.r.e(charset, "charset");
        if (charset == S6.d.f5130b) {
            i(qVar, charSequence, i8, i9);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        J6.r.d(newEncoder, "charset.newEncoder()");
        W5.b.f(newEncoder, qVar, charSequence, i8, i9);
    }

    private static final void i(q qVar, CharSequence charSequence, int i8, int i9) {
        Y5.a d8 = Y5.d.d(qVar, 1, null);
        while (true) {
            try {
                int b8 = Y5.c.b(d8.h(), charSequence, i8, i9, d8.k(), d8.g());
                int a8 = Y5.b.a(b8) & 65535;
                i8 += a8;
                d8.a(Y5.b.b(b8) & 65535);
                int i10 = (a8 != 0 || i8 >= i9) ? i8 < i9 ? 1 : 0 : 8;
                if (i10 <= 0) {
                    return;
                } else {
                    d8 = Y5.d.d(qVar, i10, d8);
                }
            } finally {
                qVar.d();
            }
        }
    }
}
