package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4144tQ {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f26885a;

    /* renamed from: b, reason: collision with root package name */
    private int f26886b;

    /* renamed from: c, reason: collision with root package name */
    private int f26887c;

    /* renamed from: d, reason: collision with root package name */
    private int f26888d;

    public C4144tQ(byte[] bArr, int i8) {
        this.f26885a = bArr;
        this.f26888d = i8;
    }

    private final void q() {
        int i8;
        int i9 = this.f26886b;
        boolean z7 = false;
        if (i9 >= 0 && (i9 < (i8 = this.f26888d) || (i9 == i8 && this.f26887c == 0))) {
            z7 = true;
        }
        AbstractC3796qC.f(z7);
    }

    public final int a() {
        return ((this.f26888d - this.f26886b) * 8) - this.f26887c;
    }

    public final int b() {
        AbstractC3796qC.f(this.f26887c == 0);
        return this.f26886b;
    }

    public final int c() {
        return (this.f26886b * 8) + this.f26887c;
    }

    public final int d(int i8) {
        int i9;
        if (i8 == 0) {
            return 0;
        }
        this.f26887c += i8;
        int i10 = 0;
        while (true) {
            i9 = this.f26887c;
            if (i9 <= 8) {
                break;
            }
            int i11 = i9 - 8;
            this.f26887c = i11;
            byte[] bArr = this.f26885a;
            int i12 = this.f26886b;
            this.f26886b = i12 + 1;
            i10 |= (bArr[i12] & 255) << i11;
        }
        byte[] bArr2 = this.f26885a;
        int i13 = this.f26886b;
        int i14 = i10 | ((bArr2[i13] & 255) >> (8 - i9));
        int i15 = 32 - i8;
        if (i9 == 8) {
            this.f26887c = 0;
            this.f26886b = i13 + 1;
        }
        int i16 = ((-1) >>> i15) & i14;
        q();
        return i16;
    }

    public final long e(int i8) {
        if (i8 <= 32) {
            int d8 = d(i8);
            int i9 = AbstractC2301cW.f21206a;
            return 4294967295L & d8;
        }
        int d9 = d(i8 - 32);
        int d10 = d(32);
        int i10 = AbstractC2301cW.f21206a;
        return (4294967295L & d10) | ((d9 & 4294967295L) << 32);
    }

    public final void f() {
        if (this.f26887c == 0) {
            return;
        }
        this.f26887c = 0;
        this.f26886b++;
        q();
    }

    public final void g(int i8, int i9) {
        int min = Math.min(8 - this.f26887c, 14);
        int i10 = this.f26887c;
        int i11 = (8 - i10) - min;
        byte[] bArr = this.f26885a;
        int i12 = this.f26886b;
        byte b8 = (byte) (((65280 >> i10) | ((1 << i11) - 1)) & bArr[i12]);
        bArr[i12] = b8;
        int i13 = 14 - min;
        int i14 = i8 & 16383;
        bArr[i12] = (byte) (b8 | ((i14 >>> i13) << i11));
        int i15 = i12 + 1;
        while (i13 > 8) {
            i13 -= 8;
            this.f26885a[i15] = (byte) (i14 >>> i13);
            i15++;
        }
        byte[] bArr2 = this.f26885a;
        byte b9 = (byte) (bArr2[i15] & ((1 << r0) - 1));
        bArr2[i15] = b9;
        bArr2[i15] = (byte) (((i14 & ((1 << i13) - 1)) << (8 - i13)) | b9);
        n(14);
        q();
    }

    public final void h(byte[] bArr, int i8, int i9) {
        int i10;
        int i11 = 0;
        while (true) {
            i10 = i9 >> 3;
            if (i11 >= i10) {
                break;
            }
            byte[] bArr2 = this.f26885a;
            int i12 = this.f26886b;
            int i13 = i12 + 1;
            this.f26886b = i13;
            byte b8 = bArr2[i12];
            int i14 = this.f26887c;
            byte b9 = (byte) (b8 << i14);
            bArr[i11] = b9;
            bArr[i11] = (byte) (((bArr2[i13] & 255) >> (8 - i14)) | b9);
            i11++;
        }
        int i15 = i9 & 7;
        if (i15 == 0) {
            return;
        }
        byte b10 = (byte) (bArr[i10] & (255 >> i15));
        bArr[i10] = b10;
        int i16 = this.f26887c;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f26885a;
            int i17 = this.f26886b;
            this.f26886b = i17 + 1;
            b10 = (byte) (b10 | ((bArr3[i17] & 255) << i16));
            bArr[i10] = b10;
            i16 -= 8;
        }
        int i18 = i16 + i15;
        this.f26887c = i18;
        byte[] bArr4 = this.f26885a;
        int i19 = this.f26886b;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | b10);
        if (i18 == 8) {
            this.f26887c = 0;
            this.f26886b = i19 + 1;
        }
        q();
    }

    public final void i(byte[] bArr, int i8, int i9) {
        AbstractC3796qC.f(this.f26887c == 0);
        System.arraycopy(this.f26885a, this.f26886b, bArr, 0, i9);
        this.f26886b += i9;
        q();
    }

    public final void j(UQ uq) {
        k(uq.n(), uq.u());
        l(uq.t() * 8);
    }

    public final void k(byte[] bArr, int i8) {
        this.f26885a = bArr;
        this.f26886b = 0;
        this.f26887c = 0;
        this.f26888d = i8;
    }

    public final void l(int i8) {
        int i9 = i8 / 8;
        this.f26886b = i9;
        this.f26887c = i8 - (i9 * 8);
        q();
    }

    public final void m() {
        int i8 = this.f26887c + 1;
        this.f26887c = i8;
        if (i8 == 8) {
            this.f26887c = 0;
            this.f26886b++;
        }
        q();
    }

    public final void n(int i8) {
        int i9 = i8 / 8;
        int i10 = this.f26886b + i9;
        this.f26886b = i10;
        int i11 = this.f26887c + (i8 - (i9 * 8));
        this.f26887c = i11;
        if (i11 > 7) {
            this.f26886b = i10 + 1;
            this.f26887c = i11 - 8;
        }
        q();
    }

    public final void o(int i8) {
        AbstractC3796qC.f(this.f26887c == 0);
        this.f26886b += i8;
        q();
    }

    public final boolean p() {
        int i8 = this.f26885a[this.f26886b] & (128 >> this.f26887c);
        m();
        return i8 != 0;
    }

    public C4144tQ() {
        this.f26885a = AbstractC2301cW.f21211f;
    }
}
