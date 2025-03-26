package W5;

import J6.r;
import V5.c;
import X5.n;
import Y5.d;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final CharBuffer f5825a = CharBuffer.allocate(0);

    /* renamed from: b, reason: collision with root package name */
    private static final ByteBuffer f5826b;

    static {
        ByteBuffer allocate = ByteBuffer.allocate(0);
        r.b(allocate);
        f5826b = allocate;
    }

    public static final int a(CharsetDecoder charsetDecoder, n nVar, Appendable appendable, int i8) {
        CoderResult decode;
        Y5.a c8;
        r.e(charsetDecoder, "<this>");
        r.e(nVar, "input");
        r.e(appendable, "dst");
        CharBuffer allocate = CharBuffer.allocate(8192);
        boolean z7 = true;
        Y5.a b8 = d.b(nVar, 1);
        int i9 = 0;
        if (b8 != null) {
            int i10 = 1;
            int i11 = 1;
            int i12 = 0;
            while (true) {
                try {
                    int k8 = b8.k() - b8.i();
                    if (k8 >= i10) {
                        int i13 = i8 - i12;
                        if (i13 == 0) {
                            i10 = 0;
                        } else {
                            try {
                                ByteBuffer h8 = b8.h();
                                int i14 = b8.i();
                                int k9 = b8.k() - i14;
                                ByteBuffer d8 = c.d(h8, i14, k9);
                                allocate.clear();
                                if (i13 < 8192) {
                                    allocate.limit(i13);
                                }
                                CoderResult decode2 = charsetDecoder.decode(d8, allocate, false);
                                allocate.flip();
                                i12 += allocate.remaining();
                                appendable.append(allocate);
                                if (decode2.isMalformed() || decode2.isUnmappable()) {
                                    r.d(decode2, "rc");
                                    j(decode2);
                                }
                                i11 = (decode2.isUnderflow() && d8.hasRemaining()) ? i11 + 1 : 1;
                                if (d8.limit() != k9) {
                                    throw new IllegalStateException("Buffer's limit change is not allowed");
                                }
                                b8.c(d8.position());
                                i10 = i11;
                            } finally {
                                b8.k();
                                b8.i();
                            }
                        }
                        k8 = b8.k() - b8.i();
                    }
                    if (k8 == 0) {
                        try {
                            c8 = d.c(nVar, b8);
                        } catch (Throwable th) {
                            th = th;
                            z7 = false;
                            if (z7) {
                                d.a(nVar, b8);
                            }
                            throw th;
                        }
                    } else if (k8 < i10 || b8.f() - b8.g() < 8) {
                        d.a(nVar, b8);
                        c8 = d.b(nVar, i10);
                    } else {
                        c8 = b8;
                    }
                    if (c8 == null) {
                        break;
                    }
                    if (i10 <= 0) {
                        i9 = 1;
                        b8 = c8;
                        break;
                    }
                    b8 = c8;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (i9 != 0) {
                d.a(nVar, b8);
            }
            i9 = i12;
        }
        do {
            allocate.clear();
            int i15 = i8 - i9;
            if (i15 == 0) {
                break;
            }
            if (i15 < 8192) {
                allocate.limit(i15);
            }
            decode = charsetDecoder.decode(f5826b, allocate, true);
            allocate.flip();
            i9 += allocate.remaining();
            appendable.append(allocate);
            if (decode.isUnmappable() || decode.isMalformed()) {
                r.d(decode, "cr");
                j(decode);
            }
        } while (decode.isOverflow());
        return i9;
    }

    public static final String b(CharsetDecoder charsetDecoder, n nVar, int i8) {
        r.e(charsetDecoder, "<this>");
        r.e(nVar, "input");
        if (i8 == 0) {
            return "";
        }
        if (nVar.N() - nVar.X() < i8) {
            return d(charsetDecoder, nVar, i8);
        }
        if (!nVar.T().hasArray()) {
            return c(charsetDecoder, nVar, i8);
        }
        ByteBuffer T7 = nVar.T();
        byte[] array = T7.array();
        r.d(array, "bb.array()");
        int arrayOffset = T7.arrayOffset() + T7.position() + nVar.M().i();
        Charset charset = charsetDecoder.charset();
        r.d(charset, "charset()");
        String str = new String(array, arrayOffset, i8, charset);
        nVar.m(i8);
        return str;
    }

    private static final String c(CharsetDecoder charsetDecoder, n nVar, int i8) {
        CharBuffer allocate = CharBuffer.allocate(i8);
        ByteBuffer d8 = c.d(nVar.T(), nVar.M().i(), i8);
        CoderResult decode = charsetDecoder.decode(d8, allocate, true);
        if (decode.isMalformed() || decode.isUnmappable()) {
            r.d(decode, "rc");
            j(decode);
        }
        allocate.flip();
        nVar.m(d8.position());
        String charBuffer = allocate.toString();
        r.d(charBuffer, "cb.toString()");
        return charBuffer;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.String d(java.nio.charset.CharsetDecoder r17, X5.n r18, int r19) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W5.a.d(java.nio.charset.CharsetDecoder, X5.n, int):java.lang.String");
    }

    public static final boolean e(CharsetEncoder charsetEncoder, X5.a aVar) {
        r.e(charsetEncoder, "<this>");
        r.e(aVar, "dst");
        ByteBuffer h8 = aVar.h();
        int k8 = aVar.k();
        int g8 = aVar.g() - k8;
        ByteBuffer d8 = c.d(h8, k8, g8);
        CoderResult encode = charsetEncoder.encode(f5825a, d8, true);
        if (encode.isMalformed() || encode.isUnmappable()) {
            r.d(encode, "result");
            j(encode);
        }
        boolean isUnderflow = encode.isUnderflow();
        if (d8.limit() != g8) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        aVar.a(d8.position());
        return isUnderflow;
    }

    public static final int f(CharsetEncoder charsetEncoder, CharSequence charSequence, int i8, int i9, X5.a aVar) {
        r.e(charsetEncoder, "<this>");
        r.e(charSequence, "input");
        r.e(aVar, "dst");
        CharBuffer wrap = CharBuffer.wrap(charSequence, i8, i9);
        int remaining = wrap.remaining();
        ByteBuffer h8 = aVar.h();
        int k8 = aVar.k();
        int g8 = aVar.g() - k8;
        ByteBuffer d8 = c.d(h8, k8, g8);
        CoderResult encode = charsetEncoder.encode(wrap, d8, false);
        if (encode.isMalformed() || encode.isUnmappable()) {
            r.d(encode, "result");
            j(encode);
        }
        if (d8.limit() != g8) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        aVar.a(d8.position());
        return remaining - wrap.remaining();
    }

    public static final byte[] g(CharsetEncoder charsetEncoder, CharSequence charSequence, int i8, int i9) {
        r.e(charsetEncoder, "<this>");
        r.e(charSequence, "input");
        if (!(charSequence instanceof String)) {
            return h(charsetEncoder, charSequence, i8, i9);
        }
        if (i8 == 0 && i9 == charSequence.length()) {
            byte[] bytes = ((String) charSequence).getBytes(charsetEncoder.charset());
            r.d(bytes, "input as java.lang.String).getBytes(charset())");
            return bytes;
        }
        String substring = ((String) charSequence).substring(i8, i9);
        r.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        r.c(substring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes2 = substring.getBytes(charsetEncoder.charset());
        r.d(bytes2, "input.substring(fromInde…ring).getBytes(charset())");
        return bytes2;
    }

    private static final byte[] h(CharsetEncoder charsetEncoder, CharSequence charSequence, int i8, int i9) {
        ByteBuffer encode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i8, i9));
        byte[] bArr = null;
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            byte[] array = encode.array();
            if (array.length == encode.remaining()) {
                bArr = array;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[encode.remaining()];
        encode.get(bArr2);
        return bArr2;
    }

    public static final String i(Charset charset) {
        r.e(charset, "<this>");
        String name = charset.name();
        r.d(name, "name()");
        return name;
    }

    private static final void j(CoderResult coderResult) {
        try {
            coderResult.throwException();
        } catch (MalformedInputException e8) {
            String message = e8.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new io.ktor.utils.io.charsets.MalformedInputException(message);
        }
    }
}
