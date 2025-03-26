package com.google.android.gms.internal.wearable;

/* loaded from: classes2.dex */
final class V extends X {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f30099d;

    /* renamed from: e, reason: collision with root package name */
    private final int f30100e;

    /* renamed from: f, reason: collision with root package name */
    private int f30101f;

    V(byte[] bArr, int i8, int i9) {
        super(null);
        int length = bArr.length;
        if (((length - i9) | i9) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i9)));
        }
        this.f30099d = bArr;
        this.f30101f = 0;
        this.f30100e = i9;
    }

    public final void A(byte[] bArr, int i8, int i9) {
        try {
            System.arraycopy(bArr, 0, this.f30099d, this.f30101f, i9);
            this.f30101f += i9;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzbu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30101f), Integer.valueOf(this.f30100e), Integer.valueOf(i9)), e8);
        }
    }

    public final void B(String str) {
        int i8 = this.f30101f;
        try {
            int z7 = X.z(str.length() * 3);
            int z8 = X.z(str.length());
            if (z8 != z7) {
                t(i1.c(str));
                byte[] bArr = this.f30099d;
                int i9 = this.f30101f;
                this.f30101f = i1.b(str, bArr, i9, this.f30100e - i9);
                return;
            }
            int i10 = i8 + z8;
            this.f30101f = i10;
            int b8 = i1.b(str, this.f30099d, i10, this.f30100e - i10);
            this.f30101f = i8;
            t((b8 - i8) - z8);
            this.f30101f = b8;
        } catch (h1 e8) {
            this.f30101f = i8;
            c(str, e8);
        } catch (IndexOutOfBoundsException e9) {
            throw new zzbu(e9);
        }
    }

    @Override // com.google.android.gms.internal.wearable.X
    public final int e() {
        return this.f30100e - this.f30101f;
    }

    @Override // com.google.android.gms.internal.wearable.X
    public final void f(byte b8) {
        try {
            byte[] bArr = this.f30099d;
            int i8 = this.f30101f;
            this.f30101f = i8 + 1;
            bArr[i8] = b8;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzbu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30101f), Integer.valueOf(this.f30100e), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.wearable.X
    public final void g(int i8, boolean z7) {
        t(i8 << 3);
        f(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.wearable.X
    public final void h(int i8, Q q8) {
        t((i8 << 3) | 2);
        t(q8.d());
        q8.o(this);
    }

    @Override // com.google.android.gms.internal.wearable.X
    public final void i(int i8, int i9) {
        t((i8 << 3) | 5);
        j(i9);
    }

    @Override // com.google.android.gms.internal.wearable.X
    public final void j(int i8) {
        try {
            byte[] bArr = this.f30099d;
            int i9 = this.f30101f;
            int i10 = i9 + 1;
            this.f30101f = i10;
            bArr[i9] = (byte) (i8 & 255);
            int i11 = i9 + 2;
            this.f30101f = i11;
            bArr[i10] = (byte) ((i8 >> 8) & 255);
            int i12 = i9 + 3;
            this.f30101f = i12;
            bArr[i11] = (byte) ((i8 >> 16) & 255);
            this.f30101f = i9 + 4;
            bArr[i12] = (byte) ((i8 >> 24) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzbu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30101f), Integer.valueOf(this.f30100e), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.wearable.X
    public final void k(int i8, long j8) {
        t((i8 << 3) | 1);
        l(j8);
    }

    @Override // com.google.android.gms.internal.wearable.X
    public final void l(long j8) {
        try {
            byte[] bArr = this.f30099d;
            int i8 = this.f30101f;
            int i9 = i8 + 1;
            this.f30101f = i9;
            bArr[i8] = (byte) (((int) j8) & 255);
            int i10 = i8 + 2;
            this.f30101f = i10;
            bArr[i9] = (byte) (((int) (j8 >> 8)) & 255);
            int i11 = i8 + 3;
            this.f30101f = i11;
            bArr[i10] = (byte) (((int) (j8 >> 16)) & 255);
            int i12 = i8 + 4;
            this.f30101f = i12;
            bArr[i11] = (byte) (((int) (j8 >> 24)) & 255);
            int i13 = i8 + 5;
            this.f30101f = i13;
            bArr[i12] = (byte) (((int) (j8 >> 32)) & 255);
            int i14 = i8 + 6;
            this.f30101f = i14;
            bArr[i13] = (byte) (((int) (j8 >> 40)) & 255);
            int i15 = i8 + 7;
            this.f30101f = i15;
            bArr[i14] = (byte) (((int) (j8 >> 48)) & 255);
            this.f30101f = i8 + 8;
            bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzbu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30101f), Integer.valueOf(this.f30100e), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.wearable.X
    public final void m(int i8, int i9) {
        t(i8 << 3);
        n(i9);
    }

    @Override // com.google.android.gms.internal.wearable.X
    public final void n(int i8) {
        if (i8 >= 0) {
            t(i8);
        } else {
            v(i8);
        }
    }

    @Override // com.google.android.gms.internal.wearable.X
    public final void o(byte[] bArr, int i8, int i9) {
        A(bArr, 0, i9);
    }

    @Override // com.google.android.gms.internal.wearable.X
    final void p(int i8, I0 i02, U0 u02) {
        t((i8 << 3) | 2);
        t(((C) i02).a(u02));
        u02.h(i02, this.f30106a);
    }

    @Override // com.google.android.gms.internal.wearable.X
    public final void q(int i8, String str) {
        t((i8 << 3) | 2);
        B(str);
    }

    @Override // com.google.android.gms.internal.wearable.X
    public final void r(int i8, int i9) {
        t((i8 << 3) | i9);
    }

    @Override // com.google.android.gms.internal.wearable.X
    public final void s(int i8, int i9) {
        t(i8 << 3);
        t(i9);
    }

    @Override // com.google.android.gms.internal.wearable.X
    public final void t(int i8) {
        while ((i8 & (-128)) != 0) {
            try {
                byte[] bArr = this.f30099d;
                int i9 = this.f30101f;
                this.f30101f = i9 + 1;
                bArr[i9] = (byte) ((i8 | 128) & 255);
                i8 >>>= 7;
            } catch (IndexOutOfBoundsException e8) {
                throw new zzbu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30101f), Integer.valueOf(this.f30100e), 1), e8);
            }
        }
        byte[] bArr2 = this.f30099d;
        int i10 = this.f30101f;
        this.f30101f = i10 + 1;
        bArr2[i10] = (byte) i8;
    }

    @Override // com.google.android.gms.internal.wearable.X
    public final void u(int i8, long j8) {
        t(i8 << 3);
        v(j8);
    }

    @Override // com.google.android.gms.internal.wearable.X
    public final void v(long j8) {
        if (!X.f30105c || this.f30100e - this.f30101f < 10) {
            while ((j8 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f30099d;
                    int i8 = this.f30101f;
                    this.f30101f = i8 + 1;
                    bArr[i8] = (byte) ((((int) j8) | 128) & 255);
                    j8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new zzbu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30101f), Integer.valueOf(this.f30100e), 1), e8);
                }
            }
            byte[] bArr2 = this.f30099d;
            int i9 = this.f30101f;
            this.f30101f = i9 + 1;
            bArr2[i9] = (byte) j8;
            return;
        }
        while (true) {
            int i10 = (int) j8;
            if ((j8 & (-128)) == 0) {
                byte[] bArr3 = this.f30099d;
                int i11 = this.f30101f;
                this.f30101f = 1 + i11;
                f1.s(bArr3, i11, (byte) i10);
                return;
            }
            byte[] bArr4 = this.f30099d;
            int i12 = this.f30101f;
            this.f30101f = i12 + 1;
            f1.s(bArr4, i12, (byte) ((i10 | 128) & 255));
            j8 >>>= 7;
        }
    }
}
