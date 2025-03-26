package z;

import y6.AbstractC6980h;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6993b {

    /* renamed from: a, reason: collision with root package name */
    private int f44662a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f44663b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    private int[] f44664c = new int[16];

    /* renamed from: d, reason: collision with root package name */
    private int[] f44665d;

    /* renamed from: e, reason: collision with root package name */
    private int f44666e;

    public C6993b() {
        int[] iArr = new int[16];
        int i8 = 0;
        while (i8 < 16) {
            int i9 = i8 + 1;
            iArr[i8] = i9;
            i8 = i9;
        }
        this.f44665d = iArr;
    }

    private final int b() {
        int length = this.f44665d.length;
        if (this.f44666e >= length) {
            int i8 = length * 2;
            int[] iArr = new int[i8];
            int i9 = 0;
            while (i9 < i8) {
                int i10 = i9 + 1;
                iArr[i9] = i10;
                i9 = i10;
            }
            AbstractC6980h.i(this.f44665d, iArr, 0, 0, 0, 14, null);
            this.f44665d = iArr;
        }
        int i11 = this.f44666e;
        this.f44666e = this.f44665d[i11];
        return i11;
    }

    private final void c(int i8) {
        int[] iArr = this.f44663b;
        int length = iArr.length;
        if (i8 <= length) {
            return;
        }
        int i9 = length * 2;
        int[] iArr2 = new int[i9];
        int[] iArr3 = new int[i9];
        AbstractC6980h.i(iArr, iArr2, 0, 0, 0, 14, null);
        AbstractC6980h.i(this.f44664c, iArr3, 0, 0, 0, 14, null);
        this.f44663b = iArr2;
        this.f44664c = iArr3;
    }

    private final void d(int i8) {
        this.f44665d[i8] = this.f44666e;
        this.f44666e = i8;
    }

    private final void g(int i8) {
        int i9;
        int[] iArr = this.f44663b;
        int i10 = this.f44662a >> 1;
        while (i8 < i10) {
            int i11 = (i8 + 1) << 1;
            int i12 = i11 - 1;
            if (i11 >= this.f44662a || (i9 = iArr[i11]) >= iArr[i12]) {
                if (iArr[i12] >= iArr[i8]) {
                    return;
                }
                i(i12, i8);
                i8 = i12;
            } else {
                if (i9 >= iArr[i8]) {
                    return;
                }
                i(i11, i8);
                i8 = i11;
            }
        }
    }

    private final void h(int i8) {
        int[] iArr = this.f44663b;
        int i9 = iArr[i8];
        while (i8 > 0) {
            int i10 = ((i8 + 1) >> 1) - 1;
            if (iArr[i10] <= i9) {
                return;
            }
            i(i10, i8);
            i8 = i10;
        }
    }

    private final void i(int i8, int i9) {
        int[] iArr = this.f44663b;
        int[] iArr2 = this.f44664c;
        int[] iArr3 = this.f44665d;
        int i10 = iArr[i8];
        iArr[i8] = iArr[i9];
        iArr[i9] = i10;
        int i11 = iArr2[i8];
        iArr2[i8] = iArr2[i9];
        iArr2[i9] = i11;
        iArr3[iArr2[i8]] = i8;
        iArr3[iArr2[i9]] = i9;
    }

    public final int a(int i8) {
        c(this.f44662a + 1);
        int i9 = this.f44662a;
        this.f44662a = i9 + 1;
        int b8 = b();
        this.f44663b[i9] = i8;
        this.f44664c[i9] = b8;
        this.f44665d[b8] = i9;
        h(i9);
        return b8;
    }

    public final int e(int i8) {
        return this.f44662a > 0 ? this.f44663b[0] : i8;
    }

    public final void f(int i8) {
        int i9 = this.f44665d[i8];
        i(i9, this.f44662a - 1);
        this.f44662a--;
        h(i9);
        g(i9);
        d(i8);
    }
}
