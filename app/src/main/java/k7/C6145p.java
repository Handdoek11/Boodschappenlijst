package k7;

import java.util.Arrays;

/* renamed from: k7.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6145p extends AbstractC6157v0 {

    /* renamed from: a, reason: collision with root package name */
    private char[] f38714a;

    /* renamed from: b, reason: collision with root package name */
    private int f38715b;

    public C6145p(char[] cArr) {
        J6.r.e(cArr, "bufferWithData");
        this.f38714a = cArr;
        this.f38715b = cArr.length;
        b(10);
    }

    @Override // k7.AbstractC6157v0
    public void b(int i8) {
        char[] cArr = this.f38714a;
        if (cArr.length < i8) {
            char[] copyOf = Arrays.copyOf(cArr, P6.m.c(i8, cArr.length * 2));
            J6.r.d(copyOf, "copyOf(this, newSize)");
            this.f38714a = copyOf;
        }
    }

    @Override // k7.AbstractC6157v0
    public int d() {
        return this.f38715b;
    }

    public final void e(char c8) {
        AbstractC6157v0.c(this, 0, 1, null);
        char[] cArr = this.f38714a;
        int d8 = d();
        this.f38715b = d8 + 1;
        cArr[d8] = c8;
    }

    @Override // k7.AbstractC6157v0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] copyOf = Arrays.copyOf(this.f38714a, d());
        J6.r.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
