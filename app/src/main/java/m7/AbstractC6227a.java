package m7;

import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import y6.AbstractC6987o;

/* renamed from: m7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6227a {

    /* renamed from: a, reason: collision with root package name */
    protected int f39442a;

    /* renamed from: c, reason: collision with root package name */
    private String f39444c;

    /* renamed from: b, reason: collision with root package name */
    public final w f39443b = new w();

    /* renamed from: d, reason: collision with root package name */
    private StringBuilder f39445d = new StringBuilder();

    private final int B(CharSequence charSequence, int i8) {
        char charAt = charSequence.charAt(i8);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        y(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final String K() {
        String str = this.f39444c;
        J6.r.b(str);
        this.f39444c = null;
        return str;
    }

    private final boolean O() {
        return C().charAt(this.f39442a - 1) != '\"';
    }

    private final int b(int i8) {
        int G7 = G(i8);
        if (G7 == -1) {
            y(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i9 = G7 + 1;
        char charAt = C().charAt(G7);
        if (charAt == 'u') {
            return d(C(), i9);
        }
        char b8 = AbstractC6228b.b(charAt);
        if (b8 != 0) {
            this.f39445d.append(b8);
            return i9;
        }
        y(this, "Invalid escaped char '" + charAt + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int c(int i8, int i9) {
        e(i8, i9);
        return b(i9 + 1);
    }

    private final int d(CharSequence charSequence, int i8) {
        int i9 = i8 + 4;
        if (i9 < charSequence.length()) {
            this.f39445d.append((char) ((B(charSequence, i8) << 12) + (B(charSequence, i8 + 1) << 8) + (B(charSequence, i8 + 2) << 4) + B(charSequence, i8 + 3)));
            return i9;
        }
        this.f39442a = i8;
        v();
        if (this.f39442a + 4 < charSequence.length()) {
            return d(charSequence, this.f39442a);
        }
        y(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean h(int i8) {
        int G7 = G(i8);
        if (G7 >= C().length() || G7 == -1) {
            y(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i9 = G7 + 1;
        int charAt = C().charAt(G7) | ' ';
        if (charAt == 102) {
            j("alse", i9);
            return false;
        }
        if (charAt == 116) {
            j("rue", i9);
            return true;
        }
        y(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final void j(String str, int i8) {
        if (C().length() - i8 < str.length()) {
            y(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int length = str.length();
        for (int i9 = 0; i9 < length; i9++) {
            if (str.charAt(i9) != (C().charAt(i8 + i9) | ' ')) {
                y(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        this.f39442a = i8 + str.length();
    }

    private final String u(int i8, int i9) {
        e(i8, i9);
        String sb = this.f39445d.toString();
        J6.r.d(sb, "escapedString.toString()");
        this.f39445d.setLength(0);
        return sb;
    }

    public static /* synthetic */ Void y(AbstractC6227a abstractC6227a, String str, int i8, String str2, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i9 & 2) != 0) {
            i8 = abstractC6227a.f39442a;
        }
        if ((i9 & 4) != 0) {
            str2 = "";
        }
        return abstractC6227a.x(str, i8, str2);
    }

    public final void A(String str) {
        J6.r.e(str, "key");
        x("Encountered an unknown key '" + str + '\'', S6.h.V(J(0, this.f39442a), str, 0, false, 6, null), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new KotlinNothingValueException();
    }

    protected abstract CharSequence C();

    protected final boolean D(char c8) {
        return !(c8 == '}' || c8 == ']' || c8 == ':' || c8 == ',');
    }

    public final byte E() {
        CharSequence C7 = C();
        int i8 = this.f39442a;
        while (true) {
            int G7 = G(i8);
            if (G7 == -1) {
                this.f39442a = G7;
                return (byte) 10;
            }
            char charAt = C7.charAt(G7);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f39442a = G7;
                return AbstractC6228b.a(charAt);
            }
            i8 = G7 + 1;
        }
    }

    public final String F(boolean z7) {
        String q8;
        byte E7 = E();
        if (z7) {
            if (E7 != 1 && E7 != 0) {
                return null;
            }
            q8 = s();
        } else {
            if (E7 != 1) {
                return null;
            }
            q8 = q();
        }
        this.f39444c = q8;
        return q8;
    }

    public abstract int G(int i8);

    public final void H(boolean z7) {
        ArrayList arrayList = new ArrayList();
        byte E7 = E();
        if (E7 != 8 && E7 != 6) {
            s();
            return;
        }
        while (true) {
            byte E8 = E();
            if (E8 != 1) {
                if (E8 == 8 || E8 == 6) {
                    arrayList.add(Byte.valueOf(E8));
                } else if (E8 == 9) {
                    if (((Number) AbstractC6987o.J(arrayList)).byteValue() != 8) {
                        throw u.e(this.f39442a, "found ] instead of } at path: " + this.f39443b, C());
                    }
                    AbstractC6987o.r(arrayList);
                } else if (E8 == 7) {
                    if (((Number) AbstractC6987o.J(arrayList)).byteValue() != 6) {
                        throw u.e(this.f39442a, "found } instead of ] at path: " + this.f39443b, C());
                    }
                    AbstractC6987o.r(arrayList);
                } else if (E8 == 10) {
                    y(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                m();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z7) {
                s();
            } else {
                k();
            }
        }
    }

    public abstract int I();

    public String J(int i8, int i9) {
        return C().subSequence(i8, i9).toString();
    }

    public abstract boolean L();

    public final boolean M() {
        int G7 = G(I());
        int length = C().length() - G7;
        if (length < 4 || G7 == -1) {
            return true;
        }
        for (int i8 = 0; i8 < 4; i8++) {
            if ("null".charAt(i8) != C().charAt(G7 + i8)) {
                return true;
            }
        }
        if (length > 4 && AbstractC6228b.a(C().charAt(G7 + 4)) == 0) {
            return true;
        }
        this.f39442a = G7 + 4;
        return false;
    }

    protected final void N(char c8) {
        int i8 = this.f39442a - 1;
        this.f39442a = i8;
        if (i8 >= 0 && c8 == '\"' && J6.r.a(s(), "null")) {
            x("Expected string literal but 'null' literal was found", this.f39442a - 4, "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw new KotlinNothingValueException();
        }
        z(AbstractC6228b.a(c8));
        throw new KotlinNothingValueException();
    }

    protected void e(int i8, int i9) {
        this.f39445d.append(C(), i8, i9);
    }

    public abstract boolean f();

    public final boolean g() {
        return h(I());
    }

    public final boolean i() {
        boolean z7;
        int I7 = I();
        if (I7 == C().length()) {
            y(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (C().charAt(I7) == '\"') {
            I7++;
            z7 = true;
        } else {
            z7 = false;
        }
        boolean h8 = h(I7);
        if (z7) {
            if (this.f39442a == C().length()) {
                y(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (C().charAt(this.f39442a) != '\"') {
                y(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            this.f39442a++;
        }
        return h8;
    }

    public abstract String k();

    public abstract String l(String str, boolean z7);

    public abstract byte m();

    public final byte n(byte b8) {
        byte m8 = m();
        if (m8 == b8) {
            return m8;
        }
        z(b8);
        throw new KotlinNothingValueException();
    }

    public abstract void o(char c8);

    public final long p() {
        boolean z7;
        int G7 = G(I());
        if (G7 >= C().length() || G7 == -1) {
            y(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (C().charAt(G7) == '\"') {
            G7++;
            if (G7 == C().length()) {
                y(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            z7 = true;
        } else {
            z7 = false;
        }
        int i8 = G7;
        long j8 = 0;
        boolean z8 = true;
        boolean z9 = false;
        while (z8) {
            char charAt = C().charAt(i8);
            if (charAt != '-') {
                if (AbstractC6228b.a(charAt) != 0) {
                    break;
                }
                i8++;
                z8 = i8 != C().length();
                int i9 = charAt - '0';
                if (i9 < 0 || i9 >= 10) {
                    y(this, "Unexpected symbol '" + charAt + "' in numeric literal", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                j8 = (j8 * 10) - i9;
                if (j8 > 0) {
                    y(this, "Numeric value overflow", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                if (i8 != G7) {
                    y(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                i8++;
                z9 = true;
            }
        }
        if (G7 == i8 || (z9 && G7 == i8 - 1)) {
            y(this, "Expected numeric literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (z7) {
            if (!z8) {
                y(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (C().charAt(i8) != '\"') {
                y(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            i8++;
        }
        this.f39442a = i8;
        if (z9) {
            return j8;
        }
        if (j8 != Long.MIN_VALUE) {
            return -j8;
        }
        y(this, "Numeric value overflow", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final String q() {
        return this.f39444c != null ? K() : k();
    }

    protected final String r(CharSequence charSequence, int i8, int i9) {
        int G7;
        J6.r.e(charSequence, "source");
        char charAt = charSequence.charAt(i9);
        boolean z7 = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                G7 = G(c(i8, i9));
                if (G7 == -1) {
                    y(this, "EOF", G7, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                i9++;
                if (i9 >= charSequence.length()) {
                    e(i8, i9);
                    G7 = G(i9);
                    if (G7 == -1) {
                        y(this, "EOF", G7, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i9);
                }
            }
            z7 = true;
            i8 = G7;
            i9 = i8;
            charAt = charSequence.charAt(i9);
        }
        String J7 = !z7 ? J(i8, i9) : u(i8, i9);
        this.f39442a = i9 + 1;
        return J7;
    }

    public final String s() {
        if (this.f39444c != null) {
            return K();
        }
        int I7 = I();
        if (I7 >= C().length() || I7 == -1) {
            y(this, "EOF", I7, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte a8 = AbstractC6228b.a(C().charAt(I7));
        if (a8 == 1) {
            return q();
        }
        if (a8 != 0) {
            y(this, "Expected beginning of the string, but got " + C().charAt(I7), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z7 = false;
        while (AbstractC6228b.a(C().charAt(I7)) == 0) {
            I7++;
            if (I7 >= C().length()) {
                e(this.f39442a, I7);
                int G7 = G(I7);
                if (G7 == -1) {
                    this.f39442a = I7;
                    return u(0, 0);
                }
                I7 = G7;
                z7 = true;
            }
        }
        String J7 = !z7 ? J(this.f39442a, I7) : u(this.f39442a, I7);
        this.f39442a = I7;
        return J7;
    }

    public final String t() {
        String s8 = s();
        if (!J6.r.a(s8, "null") || !O()) {
            return s8;
        }
        y(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) C()) + "', currentPosition=" + this.f39442a + ')';
    }

    public final void w() {
        if (m() == 10) {
            return;
        }
        y(this, "Expected EOF after parsing, but had " + C().charAt(this.f39442a - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final Void x(String str, int i8, String str2) {
        String str3;
        J6.r.e(str, "message");
        J6.r.e(str2, "hint");
        if (str2.length() == 0) {
            str3 = "";
        } else {
            str3 = '\n' + str2;
        }
        throw u.e(i8, str + " at path: " + this.f39443b.a() + str3, C());
    }

    public final Void z(byte b8) {
        y(this, "Expected " + (b8 == 1 ? "quotation mark '\"'" : b8 == 4 ? "comma ','" : b8 == 5 ? "colon ':'" : b8 == 6 ? "start of the object '{'" : b8 == 7 ? "end of the object '}'" : b8 == 8 ? "start of the array '['" : b8 == 9 ? "end of the array ']'" : "valid token") + ", but had '" + ((this.f39442a == C().length() || this.f39442a <= 0) ? "EOF" : String.valueOf(C().charAt(this.f39442a - 1))) + "' instead", this.f39442a - 1, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public void v() {
    }
}
