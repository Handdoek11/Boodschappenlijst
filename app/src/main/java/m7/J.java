package m7;

import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class J extends AbstractC6227a {

    /* renamed from: e, reason: collision with root package name */
    private final String f39432e;

    public J(String str) {
        J6.r.e(str, "source");
        this.f39432e = str;
    }

    @Override // m7.AbstractC6227a
    public int G(int i8) {
        if (i8 < C().length()) {
            return i8;
        }
        return -1;
    }

    @Override // m7.AbstractC6227a
    public int I() {
        char charAt;
        int i8 = this.f39442a;
        if (i8 == -1) {
            return i8;
        }
        while (i8 < C().length() && ((charAt = C().charAt(i8)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i8++;
        }
        this.f39442a = i8;
        return i8;
    }

    @Override // m7.AbstractC6227a
    public boolean L() {
        int I7 = I();
        if (I7 == C().length() || I7 == -1 || C().charAt(I7) != ',') {
            return false;
        }
        this.f39442a++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.AbstractC6227a
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public String C() {
        return this.f39432e;
    }

    @Override // m7.AbstractC6227a
    public boolean f() {
        int i8 = this.f39442a;
        if (i8 == -1) {
            return false;
        }
        while (i8 < C().length()) {
            char charAt = C().charAt(i8);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f39442a = i8;
                return D(charAt);
            }
            i8++;
        }
        this.f39442a = i8;
        return false;
    }

    @Override // m7.AbstractC6227a
    public String k() {
        o('\"');
        int i8 = this.f39442a;
        int O7 = S6.h.O(C(), '\"', i8, false, 4, null);
        if (O7 == -1) {
            z((byte) 1);
            throw new KotlinNothingValueException();
        }
        for (int i9 = i8; i9 < O7; i9++) {
            if (C().charAt(i9) == '\\') {
                return r(C(), this.f39442a, i9);
            }
        }
        this.f39442a = O7 + 1;
        String substring = C().substring(i8, O7);
        J6.r.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @Override // m7.AbstractC6227a
    public String l(String str, boolean z7) {
        J6.r.e(str, "keyToMatch");
        int i8 = this.f39442a;
        try {
            if (m() != 6) {
                this.f39442a = i8;
                return null;
            }
            if (!J6.r.a(z7 ? k() : t(), str)) {
                this.f39442a = i8;
                return null;
            }
            if (m() != 5) {
                this.f39442a = i8;
                return null;
            }
            String q8 = z7 ? q() : t();
            this.f39442a = i8;
            return q8;
        } catch (Throwable th) {
            this.f39442a = i8;
            throw th;
        }
    }

    @Override // m7.AbstractC6227a
    public byte m() {
        byte a8;
        String C7 = C();
        do {
            int i8 = this.f39442a;
            if (i8 == -1 || i8 >= C7.length()) {
                return (byte) 10;
            }
            int i9 = this.f39442a;
            this.f39442a = i9 + 1;
            a8 = AbstractC6228b.a(C7.charAt(i9));
        } while (a8 == 3);
        return a8;
    }

    @Override // m7.AbstractC6227a
    public void o(char c8) {
        if (this.f39442a == -1) {
            N(c8);
        }
        String C7 = C();
        while (this.f39442a < C7.length()) {
            int i8 = this.f39442a;
            this.f39442a = i8 + 1;
            char charAt = C7.charAt(i8);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c8) {
                    return;
                } else {
                    N(c8);
                }
            }
        }
        N(c8);
    }
}
