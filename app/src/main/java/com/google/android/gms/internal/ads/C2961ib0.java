package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ib0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2961ib0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f22999a;

    /* renamed from: b, reason: collision with root package name */
    private int f23000b;

    /* renamed from: c, reason: collision with root package name */
    private int f23001c;

    /* renamed from: d, reason: collision with root package name */
    private int f23002d = 0;

    public C2961ib0(byte[] bArr, int i8, int i9) {
        this.f22999a = bArr;
        this.f23001c = i8;
        this.f23000b = i9;
        j();
    }

    private final int i() {
        int i8 = 0;
        while (!h()) {
            i8++;
        }
        return ((1 << i8) - 1) + (i8 > 0 ? a(i8) : 0);
    }

    private final void j() {
        int i8;
        int i9 = this.f23001c;
        boolean z7 = false;
        if (i9 >= 0 && (i9 < (i8 = this.f23000b) || (i9 == i8 && this.f23002d == 0))) {
            z7 = true;
        }
        AbstractC3796qC.f(z7);
    }

    private final boolean k(int i8) {
        if (i8 < 2 || i8 >= this.f23000b) {
            return false;
        }
        byte[] bArr = this.f22999a;
        return bArr[i8] == 3 && bArr[i8 + (-2)] == 0 && bArr[i8 + (-1)] == 0;
    }

    public final int a(int i8) {
        int i9;
        this.f23002d += i8;
        int i10 = 0;
        while (true) {
            i9 = this.f23002d;
            if (i9 <= 8) {
                break;
            }
            int i11 = i9 - 8;
            this.f23002d = i11;
            byte[] bArr = this.f22999a;
            int i12 = this.f23001c;
            i10 |= (bArr[i12] & 255) << i11;
            if (true != k(i12 + 1)) {
                r3 = 1;
            }
            this.f23001c = i12 + r3;
        }
        byte[] bArr2 = this.f22999a;
        int i13 = this.f23001c;
        int i14 = i10 | ((bArr2[i13] & 255) >> (8 - i9));
        int i15 = 32 - i8;
        if (i9 == 8) {
            this.f23002d = 0;
            this.f23001c = i13 + (true != k(i13 + 1) ? 1 : 2);
        }
        int i16 = ((-1) >>> i15) & i14;
        j();
        return i16;
    }

    public final int b() {
        int i8 = i();
        return (i8 % 2 == 0 ? -1 : 1) * ((i8 + 1) / 2);
    }

    public final int c() {
        return i();
    }

    public final void d() {
        int i8 = this.f23002d;
        if (i8 > 0) {
            f(8 - i8);
        }
    }

    public final void e() {
        int i8 = this.f23002d + 1;
        this.f23002d = i8;
        if (i8 == 8) {
            this.f23002d = 0;
            int i9 = this.f23001c;
            this.f23001c = i9 + (true == k(i9 + 1) ? 2 : 1);
        }
        j();
    }

    public final void f(int i8) {
        int i9 = this.f23001c;
        int i10 = i8 / 8;
        int i11 = i9 + i10;
        this.f23001c = i11;
        int i12 = this.f23002d + (i8 - (i10 * 8));
        this.f23002d = i12;
        if (i12 > 7) {
            this.f23001c = i11 + 1;
            this.f23002d = i12 - 8;
        }
        while (true) {
            i9++;
            if (i9 > this.f23001c) {
                j();
                return;
            } else if (k(i9)) {
                this.f23001c++;
                i9 += 2;
            }
        }
    }

    public final boolean g(int i8) {
        int i9 = this.f23001c;
        int i10 = i8 / 8;
        int i11 = i9 + i10;
        int i12 = (this.f23002d + i8) - (i10 * 8);
        if (i12 > 7) {
            i11++;
            i12 -= 8;
        }
        while (true) {
            i9++;
            if (i9 > i11 || i11 >= this.f23000b) {
                break;
            }
            if (k(i9)) {
                i11++;
                i9 += 2;
            }
        }
        int i13 = this.f23000b;
        if (i11 >= i13) {
            return i11 == i13 && i12 == 0;
        }
        return true;
    }

    public final boolean h() {
        int i8 = this.f22999a[this.f23001c] & (128 >> this.f23002d);
        e();
        return i8 != 0;
    }
}
