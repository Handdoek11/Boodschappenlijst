package com.google.android.gms.internal.play_billing;

import java.util.Locale;

/* renamed from: com.google.android.gms.internal.play_billing.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5199u2 extends AbstractC5211w2 {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f30012d;

    /* renamed from: e, reason: collision with root package name */
    private final int f30013e;

    /* renamed from: f, reason: collision with root package name */
    private int f30014f;

    C5199u2(byte[] bArr, int i8, int i9) {
        super(null);
        int length = bArr.length;
        if (((length - i9) | i9) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i9)));
        }
        this.f30012d = bArr;
        this.f30014f = 0;
        this.f30013e = i9;
    }

    public final void A(byte[] bArr, int i8, int i9) {
        try {
            System.arraycopy(bArr, 0, this.f30012d, this.f30014f, i9);
            this.f30014f += i9;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzgp(this.f30014f, this.f30013e, i9, e8);
        }
    }

    public final void B(String str) {
        int i8 = this.f30014f;
        try {
            int z7 = AbstractC5211w2.z(str.length() * 3);
            int z8 = AbstractC5211w2.z(str.length());
            if (z8 != z7) {
                t(H3.c(str));
                byte[] bArr = this.f30012d;
                int i9 = this.f30014f;
                this.f30014f = H3.b(str, bArr, i9, this.f30013e - i9);
                return;
            }
            int i10 = i8 + z8;
            this.f30014f = i10;
            int b8 = H3.b(str, this.f30012d, i10, this.f30013e - i10);
            this.f30014f = i8;
            t((b8 - i8) - z8);
            this.f30014f = b8;
        } catch (G3 e8) {
            this.f30014f = i8;
            c(str, e8);
        } catch (IndexOutOfBoundsException e9) {
            throw new zzgp(e9);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5211w2
    public final int e() {
        return this.f30013e - this.f30014f;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5211w2
    public final void f(byte b8) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i8;
        int i9 = this.f30014f;
        try {
            i8 = i9 + 1;
        } catch (IndexOutOfBoundsException e8) {
            indexOutOfBoundsException = e8;
        }
        try {
            this.f30012d[i9] = b8;
            this.f30014f = i8;
        } catch (IndexOutOfBoundsException e9) {
            indexOutOfBoundsException = e9;
            i9 = i8;
            throw new zzgp(i9, this.f30013e, 1, indexOutOfBoundsException);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5211w2
    public final void g(int i8, boolean z7) {
        t(i8 << 3);
        f(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5211w2
    public final void h(int i8, AbstractC5176q2 abstractC5176q2) {
        t((i8 << 3) | 2);
        t(abstractC5176q2.d());
        abstractC5176q2.n(this);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5211w2
    public final void i(int i8, int i9) {
        t((i8 << 3) | 5);
        j(i9);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5211w2
    public final void j(int i8) {
        int i9 = this.f30014f;
        try {
            byte[] bArr = this.f30012d;
            bArr[i9] = (byte) (i8 & 255);
            bArr[i9 + 1] = (byte) ((i8 >> 8) & 255);
            bArr[i9 + 2] = (byte) ((i8 >> 16) & 255);
            bArr[i9 + 3] = (byte) ((i8 >> 24) & 255);
            this.f30014f = i9 + 4;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzgp(i9, this.f30013e, 4, e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5211w2
    public final void k(int i8, long j8) {
        t((i8 << 3) | 1);
        l(j8);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5211w2
    public final void l(long j8) {
        int i8 = this.f30014f;
        try {
            byte[] bArr = this.f30012d;
            bArr[i8] = (byte) (((int) j8) & 255);
            bArr[i8 + 1] = (byte) (((int) (j8 >> 8)) & 255);
            bArr[i8 + 2] = (byte) (((int) (j8 >> 16)) & 255);
            bArr[i8 + 3] = (byte) (((int) (j8 >> 24)) & 255);
            bArr[i8 + 4] = (byte) (((int) (j8 >> 32)) & 255);
            bArr[i8 + 5] = (byte) (((int) (j8 >> 40)) & 255);
            bArr[i8 + 6] = (byte) (((int) (j8 >> 48)) & 255);
            bArr[i8 + 7] = (byte) (((int) (j8 >> 56)) & 255);
            this.f30014f = i8 + 8;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzgp(i8, this.f30013e, 8, e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5211w2
    public final void m(int i8, int i9) {
        t(i8 << 3);
        n(i9);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5211w2
    public final void n(int i8) {
        if (i8 >= 0) {
            t(i8);
        } else {
            v(i8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5211w2
    public final void o(byte[] bArr, int i8, int i9) {
        A(bArr, 0, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5211w2
    final void p(int i8, InterfaceC5123h3 interfaceC5123h3, InterfaceC5188s3 interfaceC5188s3) {
        t((i8 << 3) | 2);
        t(((AbstractC5086b2) interfaceC5123h3).a(interfaceC5188s3));
        interfaceC5188s3.i(interfaceC5123h3, this.f30024a);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5211w2
    public final void q(int i8, String str) {
        t((i8 << 3) | 2);
        B(str);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5211w2
    public final void r(int i8, int i9) {
        t((i8 << 3) | i9);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5211w2
    public final void s(int i8, int i9) {
        t(i8 << 3);
        t(i9);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5211w2
    public final void t(int i8) {
        while ((i8 & (-128)) != 0) {
            try {
                byte[] bArr = this.f30012d;
                int i9 = this.f30014f;
                this.f30014f = i9 + 1;
                bArr[i9] = (byte) ((i8 | 128) & 255);
                i8 >>>= 7;
            } catch (IndexOutOfBoundsException e8) {
                throw new zzgp(this.f30014f, this.f30013e, 1, e8);
            }
        }
        byte[] bArr2 = this.f30012d;
        int i10 = this.f30014f;
        this.f30014f = i10 + 1;
        bArr2[i10] = (byte) i8;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5211w2
    public final void u(int i8, long j8) {
        t(i8 << 3);
        v(j8);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5211w2
    public final void v(long j8) {
        if (!AbstractC5211w2.f30023c || this.f30013e - this.f30014f < 10) {
            while ((j8 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f30012d;
                    int i8 = this.f30014f;
                    this.f30014f = i8 + 1;
                    bArr[i8] = (byte) ((((int) j8) | 128) & 255);
                    j8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new zzgp(this.f30014f, this.f30013e, 1, e8);
                }
            }
            byte[] bArr2 = this.f30012d;
            int i9 = this.f30014f;
            this.f30014f = i9 + 1;
            bArr2[i9] = (byte) j8;
            return;
        }
        while (true) {
            int i10 = (int) j8;
            if ((j8 & (-128)) == 0) {
                byte[] bArr3 = this.f30012d;
                int i11 = this.f30014f;
                this.f30014f = i11 + 1;
                E3.s(bArr3, i11, (byte) i10);
                return;
            }
            byte[] bArr4 = this.f30012d;
            int i12 = this.f30014f;
            this.f30014f = i12 + 1;
            E3.s(bArr4, i12, (byte) ((i10 | 128) & 255));
            j8 >>>= 7;
        }
    }
}
