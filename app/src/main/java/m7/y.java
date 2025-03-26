package m7;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class y implements D {

    /* renamed from: a, reason: collision with root package name */
    private char[] f39471a = C6230d.f39449a.b();

    /* renamed from: b, reason: collision with root package name */
    private int f39472b;

    private final void e(int i8, int i9, String str) {
        byte b8;
        int length = str.length();
        while (i8 < length) {
            int g8 = g(i9, 2);
            char charAt = str.charAt(i8);
            if (charAt >= K.a().length || (b8 = K.a()[charAt]) == 0) {
                int i10 = g8 + 1;
                this.f39471a[g8] = charAt;
                i9 = i10;
                i8++;
            } else {
                if (b8 == 1) {
                    String str2 = K.b()[charAt];
                    J6.r.b(str2);
                    int g9 = g(g8, str2.length());
                    str2.getChars(0, str2.length(), this.f39471a, g9);
                    i9 = g9 + str2.length();
                    this.f39472b = i9;
                } else {
                    char[] cArr = this.f39471a;
                    cArr[g8] = '\\';
                    cArr[g8 + 1] = (char) b8;
                    i9 = g8 + 2;
                    this.f39472b = i9;
                }
                i8++;
            }
        }
        int g10 = g(i9, 1);
        this.f39471a[g10] = '\"';
        this.f39472b = g10 + 1;
    }

    private final void f(int i8) {
        g(this.f39472b, i8);
    }

    private final int g(int i8, int i9) {
        int i10 = i9 + i8;
        char[] cArr = this.f39471a;
        if (cArr.length <= i10) {
            char[] copyOf = Arrays.copyOf(cArr, P6.m.c(i10, i8 * 2));
            J6.r.d(copyOf, "copyOf(this, newSize)");
            this.f39471a = copyOf;
        }
        return i8;
    }

    @Override // m7.D
    public void a(char c8) {
        f(1);
        char[] cArr = this.f39471a;
        int i8 = this.f39472b;
        this.f39472b = i8 + 1;
        cArr[i8] = c8;
    }

    @Override // m7.D
    public void b(String str) {
        J6.r.e(str, "text");
        f(str.length() + 2);
        char[] cArr = this.f39471a;
        int i8 = this.f39472b;
        int i9 = i8 + 1;
        cArr[i8] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i9);
        int i10 = length + i9;
        for (int i11 = i9; i11 < i10; i11++) {
            char c8 = cArr[i11];
            if (c8 < K.a().length && K.a()[c8] != 0) {
                e(i11 - i9, i11, str);
                return;
            }
        }
        cArr[i10] = '\"';
        this.f39472b = i10 + 1;
    }

    @Override // m7.D
    public void c(long j8) {
        d(String.valueOf(j8));
    }

    @Override // m7.D
    public void d(String str) {
        J6.r.e(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        f(length);
        str.getChars(0, str.length(), this.f39471a, this.f39472b);
        this.f39472b += length;
    }

    public void h() {
        C6230d.f39449a.a(this.f39471a);
    }

    public String toString() {
        return new String(this.f39471a, 0, this.f39472b);
    }
}
