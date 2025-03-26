package I5;

import io.ktor.http.URLDecodeException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import x6.C6916E;
import y6.AbstractC6987o;
import y6.P;

/* renamed from: I5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0627a {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f3208a;

    /* renamed from: b, reason: collision with root package name */
    private static final Set f3209b;

    /* renamed from: c, reason: collision with root package name */
    private static final Set f3210c;

    /* renamed from: d, reason: collision with root package name */
    private static final List f3211d;

    /* renamed from: e, reason: collision with root package name */
    private static final Set f3212e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f3213f;

    /* renamed from: g, reason: collision with root package name */
    private static final List f3214g;

    /* renamed from: I5.a$a, reason: collision with other inner class name */
    static final class C0055a extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ StringBuilder f3215o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f3216s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0055a(StringBuilder sb, boolean z7) {
            super(1);
            this.f3215o = sb;
            this.f3216s = z7;
        }

        public final void b(byte b8) {
            if (AbstractC0627a.f3208a.contains(Byte.valueOf(b8)) || AbstractC0627a.f3214g.contains(Byte.valueOf(b8))) {
                this.f3215o.append((char) b8);
            } else if (this.f3216s && b8 == 32) {
                this.f3215o.append('+');
            } else {
                this.f3215o.append(AbstractC0627a.u(b8));
            }
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((Number) obj).byteValue());
            return C6916E.f44463a;
        }
    }

    /* renamed from: I5.a$b */
    static final class b extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ StringBuilder f3217o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(StringBuilder sb) {
            super(1);
            this.f3217o = sb;
        }

        public final void b(byte b8) {
            this.f3217o.append(AbstractC0627a.u(b8));
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((Number) obj).byteValue());
            return C6916E.f44463a;
        }
    }

    /* renamed from: I5.a$c */
    static final class c extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f3218o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ StringBuilder f3219s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f3220t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z7, StringBuilder sb, boolean z8) {
            super(1);
            this.f3218o = z7;
            this.f3219s = sb;
            this.f3220t = z8;
        }

        public final void b(byte b8) {
            if (b8 == 32) {
                if (this.f3218o) {
                    this.f3219s.append('+');
                    return;
                } else {
                    this.f3219s.append("%20");
                    return;
                }
            }
            if (AbstractC0627a.f3208a.contains(Byte.valueOf(b8)) || (!this.f3220t && AbstractC0627a.f3211d.contains(Byte.valueOf(b8)))) {
                this.f3219s.append((char) b8);
            } else {
                this.f3219s.append(AbstractC0627a.u(b8));
            }
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((Number) obj).byteValue());
            return C6916E.f44463a;
        }
    }

    static {
        List N7 = AbstractC6987o.N(AbstractC6987o.M(new P6.c('a', 'z'), new P6.c('A', 'Z')), new P6.c('0', '9'));
        ArrayList arrayList = new ArrayList(AbstractC6987o.l(N7, 10));
        Iterator it = N7.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f3208a = AbstractC6987o.e0(arrayList);
        f3209b = AbstractC6987o.e0(AbstractC6987o.N(AbstractC6987o.M(new P6.c('a', 'z'), new P6.c('A', 'Z')), new P6.c('0', '9')));
        f3210c = AbstractC6987o.e0(AbstractC6987o.N(AbstractC6987o.M(new P6.c('a', 'f'), new P6.c('A', 'F')), new P6.c('0', '9')));
        Set e8 = P.e(':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+');
        ArrayList arrayList2 = new ArrayList(AbstractC6987o.l(e8, 10));
        Iterator it2 = e8.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f3211d = arrayList2;
        f3212e = P.e(':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~');
        f3213f = P.f(f3209b, P.e('!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'));
        List g8 = AbstractC6987o.g('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(AbstractC6987o.l(g8, 10));
        Iterator it3 = g8.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f3214g = arrayList3;
    }

    private static final int e(char c8) {
        if ('0' <= c8 && c8 < ':') {
            return c8 - '0';
        }
        if ('A' <= c8 && c8 < 'G') {
            return c8 - '7';
        }
        if ('a' > c8 || c8 >= 'g') {
            return -1;
        }
        return c8 - 'W';
    }

    private static final String f(CharSequence charSequence, int i8, int i9, int i10, boolean z7, Charset charset) {
        int i11 = i9 - i8;
        if (i11 > 255) {
            i11 /= 3;
        }
        StringBuilder sb = new StringBuilder(i11);
        if (i10 > i8) {
            sb.append(charSequence, i8, i10);
        }
        byte[] bArr = null;
        while (i10 < i9) {
            char charAt = charSequence.charAt(i10);
            if (z7 && charAt == '+') {
                sb.append(' ');
            } else if (charAt == '%') {
                if (bArr == null) {
                    bArr = new byte[(i9 - i10) / 3];
                }
                int i12 = 0;
                while (i10 < i9 && charSequence.charAt(i10) == '%') {
                    int i13 = i10 + 2;
                    if (i13 >= i9) {
                        throw new URLDecodeException("Incomplete trailing HEX escape: " + charSequence.subSequence(i10, charSequence.length()).toString() + ", in " + ((Object) charSequence) + " at " + i10);
                    }
                    int i14 = i10 + 1;
                    int e8 = e(charSequence.charAt(i14));
                    int e9 = e(charSequence.charAt(i13));
                    if (e8 == -1 || e9 == -1) {
                        throw new URLDecodeException("Wrong HEX escape: %" + charSequence.charAt(i14) + charSequence.charAt(i13) + ", in " + ((Object) charSequence) + ", at " + i10);
                    }
                    bArr[i12] = (byte) ((e8 * 16) + e9);
                    i10 += 3;
                    i12++;
                }
                sb.append(new String(bArr, 0, i12, charset));
            } else {
                sb.append(charAt);
            }
            i10++;
        }
        String sb2 = sb.toString();
        J6.r.d(sb2, "sb.toString()");
        return sb2;
    }

    private static final String g(String str, int i8, int i9, boolean z7, Charset charset) {
        for (int i10 = i8; i10 < i9; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '%' || (z7 && charAt == '+')) {
                return f(str, i8, i9, i10, z7, charset);
            }
        }
        if (i8 == 0 && i9 == str.length()) {
            return str.toString();
        }
        String substring = str.substring(i8, i9);
        J6.r.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String h(String str, int i8, int i9, Charset charset) {
        J6.r.e(str, "<this>");
        J6.r.e(charset, "charset");
        return g(str, i8, i9, false, charset);
    }

    public static /* synthetic */ String i(String str, int i8, int i9, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        if ((i10 & 4) != 0) {
            charset = S6.d.f5130b;
        }
        return h(str, i8, i9, charset);
    }

    public static final String j(String str, int i8, int i9, boolean z7, Charset charset) {
        J6.r.e(str, "<this>");
        J6.r.e(charset, "charset");
        return g(str, i8, i9, z7, charset);
    }

    public static /* synthetic */ String k(String str, int i8, int i9, boolean z7, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        if ((i10 & 4) != 0) {
            z7 = false;
        }
        if ((i10 & 8) != 0) {
            charset = S6.d.f5130b;
        }
        return j(str, i8, i9, z7, charset);
    }

    public static final String l(String str, boolean z7) {
        J6.r.e(str, "<this>");
        StringBuilder sb = new StringBuilder();
        CharsetEncoder newEncoder = S6.d.f5130b.newEncoder();
        J6.r.d(newEncoder, "UTF_8.newEncoder()");
        s(W5.b.d(newEncoder, str, 0, 0, 6, null), new C0055a(sb, z7));
        String sb2 = sb.toString();
        J6.r.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static /* synthetic */ String m(String str, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        return l(str, z7);
    }

    public static final String n(String str) {
        J6.r.e(str, "<this>");
        return l(str, true);
    }

    public static final String o(String str, boolean z7) {
        int i8;
        J6.r.e(str, "<this>");
        StringBuilder sb = new StringBuilder();
        Charset charset = S6.d.f5130b;
        int i9 = 0;
        while (i9 < str.length()) {
            char charAt = str.charAt(i9);
            if ((!z7 && charAt == '/') || f3209b.contains(Character.valueOf(charAt)) || f3212e.contains(Character.valueOf(charAt))) {
                sb.append(charAt);
                i9++;
            } else {
                if (charAt == '%' && (i8 = i9 + 2) < str.length()) {
                    Set set = f3210c;
                    int i10 = i9 + 1;
                    if (set.contains(Character.valueOf(str.charAt(i10))) && set.contains(Character.valueOf(str.charAt(i8)))) {
                        sb.append(charAt);
                        sb.append(str.charAt(i10));
                        sb.append(str.charAt(i8));
                        i9 += 3;
                    }
                }
                int i11 = S6.a.e(charAt) ? 2 : 1;
                CharsetEncoder newEncoder = charset.newEncoder();
                J6.r.d(newEncoder, "charset.newEncoder()");
                int i12 = i11 + i9;
                s(W5.b.c(newEncoder, str, i9, i12), new b(sb));
                i9 = i12;
            }
        }
        String sb2 = sb.toString();
        J6.r.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final String p(String str) {
        J6.r.e(str, "<this>");
        return o(str, true);
    }

    public static final String q(String str, boolean z7, boolean z8, Charset charset) {
        J6.r.e(str, "<this>");
        J6.r.e(charset, "charset");
        StringBuilder sb = new StringBuilder();
        CharsetEncoder newEncoder = charset.newEncoder();
        J6.r.d(newEncoder, "charset.newEncoder()");
        s(W5.b.d(newEncoder, str, 0, 0, 6, null), new c(z8, sb, z7));
        String sb2 = sb.toString();
        J6.r.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static /* synthetic */ String r(String str, boolean z7, boolean z8, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        if ((i8 & 4) != 0) {
            charset = S6.d.f5130b;
        }
        return q(str, z7, z8, charset);
    }

    private static final void s(X5.k kVar, I6.l lVar) {
        boolean z7 = true;
        Y5.a b8 = Y5.d.b(kVar, 1);
        if (b8 == null) {
            return;
        }
        while (true) {
            try {
                if (b8.k() > b8.i()) {
                    lVar.invoke(Byte.valueOf(b8.l()));
                } else {
                    try {
                        b8 = Y5.d.c(kVar, b8);
                        if (b8 == null) {
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z7 = false;
                        if (z7) {
                            Y5.d.a(kVar, b8);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private static final char t(int i8) {
        return (char) ((i8 < 0 || i8 >= 10) ? ((char) (i8 + 65)) - '\n' : i8 + 48);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String u(byte b8) {
        return S6.h.o(new char[]{'%', t((b8 & 255) >> 4), t(b8 & 15)});
    }
}
