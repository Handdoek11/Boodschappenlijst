package com.google.android.gms.internal.ads;

import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.vu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4413vu0 extends AbstractC4740yu0 {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f27384d;

    /* renamed from: e, reason: collision with root package name */
    private final int f27385e;

    /* renamed from: f, reason: collision with root package name */
    private int f27386f;

    C4413vu0(byte[] bArr, int i8, int i9) {
        super(null);
        int length = bArr.length;
        if (((length - i9) | i9) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i9)));
        }
        this.f27384d = bArr;
        this.f27386f = 0;
        this.f27385e = i9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void A(long j8) {
        int i8;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i9 = this.f27386f;
        if (!AbstractC4740yu0.f28227c || this.f27385e - i9 < 10) {
            while ((j8 & (-128)) != 0) {
                try {
                    int i10 = i9 + 1;
                    try {
                        this.f27384d[i9] = (byte) (((int) j8) | 128);
                        j8 >>>= 7;
                        i9 = i10;
                    } catch (IndexOutOfBoundsException e8) {
                        e = e8;
                        i9 = i10;
                        indexOutOfBoundsException = e;
                        throw new zzgwt(i9, this.f27385e, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e9) {
                    e = e9;
                }
            }
            i8 = i9 + 1;
            try {
                this.f27384d[i9] = (byte) j8;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                i9 = i8;
                throw new zzgwt(i9, this.f27385e, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j8 & (-128)) != 0) {
                Vv0.y(this.f27384d, i9, (byte) (((int) j8) | 128));
                j8 >>>= 7;
                i9++;
            }
            i8 = i9 + 1;
            Vv0.y(this.f27384d, i9, (byte) j8);
        }
        this.f27386f = i8;
    }

    public final void C(byte[] bArr, int i8, int i9) {
        try {
            System.arraycopy(bArr, i8, this.f27384d, this.f27386f, i9);
            this.f27386f += i9;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzgwt(this.f27386f, this.f27385e, i9, e8);
        }
    }

    public final void D(String str) {
        int i8 = this.f27386f;
        try {
            int e8 = AbstractC4740yu0.e(str.length() * 3);
            int e9 = AbstractC4740yu0.e(str.length());
            if (e9 != e8) {
                y(AbstractC2133aw0.e(str));
                byte[] bArr = this.f27384d;
                int i9 = this.f27386f;
                this.f27386f = AbstractC2133aw0.d(str, bArr, i9, this.f27385e - i9);
                return;
            }
            int i10 = i8 + e9;
            this.f27386f = i10;
            int d8 = AbstractC2133aw0.d(str, this.f27384d, i10, this.f27385e - i10);
            this.f27386f = i8;
            y((d8 - i8) - e9);
            this.f27386f = d8;
        } catch (Zv0 e10) {
            this.f27386f = i8;
            h(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzgwt(e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0, com.google.android.gms.internal.ads.AbstractC2563eu0
    public final void a(byte[] bArr, int i8, int i9) {
        C(bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void k(byte b8) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i8;
        int i9 = this.f27386f;
        try {
            i8 = i9 + 1;
        } catch (IndexOutOfBoundsException e8) {
            indexOutOfBoundsException = e8;
        }
        try {
            this.f27384d[i9] = b8;
            this.f27386f = i8;
        } catch (IndexOutOfBoundsException e9) {
            indexOutOfBoundsException = e9;
            i9 = i8;
            throw new zzgwt(i9, this.f27385e, 1, indexOutOfBoundsException);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void l(int i8, boolean z7) {
        y(i8 << 3);
        k(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void m(int i8, AbstractC3542nu0 abstractC3542nu0) {
        y((i8 << 3) | 2);
        y(abstractC3542nu0.j());
        abstractC3542nu0.v(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final int n() {
        return this.f27385e - this.f27386f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void o(int i8, int i9) {
        y((i8 << 3) | 5);
        p(i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void p(int i8) {
        int i9 = this.f27386f;
        try {
            byte[] bArr = this.f27384d;
            bArr[i9] = (byte) i8;
            bArr[i9 + 1] = (byte) (i8 >> 8);
            bArr[i9 + 2] = (byte) (i8 >> 16);
            bArr[i9 + 3] = (byte) (i8 >> 24);
            this.f27386f = i9 + 4;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzgwt(i9, this.f27385e, 4, e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void q(int i8, long j8) {
        y((i8 << 3) | 1);
        r(j8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void r(long j8) {
        int i8 = this.f27386f;
        try {
            byte[] bArr = this.f27384d;
            bArr[i8] = (byte) j8;
            bArr[i8 + 1] = (byte) (j8 >> 8);
            bArr[i8 + 2] = (byte) (j8 >> 16);
            bArr[i8 + 3] = (byte) (j8 >> 24);
            bArr[i8 + 4] = (byte) (j8 >> 32);
            bArr[i8 + 5] = (byte) (j8 >> 40);
            bArr[i8 + 6] = (byte) (j8 >> 48);
            bArr[i8 + 7] = (byte) (j8 >> 56);
            this.f27386f = i8 + 8;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzgwt(i8, this.f27385e, 8, e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void s(int i8, int i9) {
        y(i8 << 3);
        t(i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void t(int i8) {
        if (i8 >= 0) {
            y(i8);
        } else {
            A(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    final void u(int i8, InterfaceC3871qv0 interfaceC3871qv0, Iv0 iv0) {
        y((i8 << 3) | 2);
        y(((Wt0) interfaceC3871qv0).e(iv0));
        iv0.g(interfaceC3871qv0, this.f28228a);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void v(int i8, String str) {
        y((i8 << 3) | 2);
        D(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void w(int i8, int i9) {
        y((i8 << 3) | i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void x(int i8, int i9) {
        y(i8 << 3);
        y(i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void y(int i8) {
        int i9;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i10 = this.f27386f;
        while ((i8 & (-128)) != 0) {
            try {
                i9 = i10 + 1;
            } catch (IndexOutOfBoundsException e8) {
                indexOutOfBoundsException = e8;
                throw new zzgwt(i10, this.f27385e, 1, indexOutOfBoundsException);
            }
            try {
                this.f27384d[i10] = (byte) (i8 | 128);
                i8 >>>= 7;
                i10 = i9;
            } catch (IndexOutOfBoundsException e9) {
                indexOutOfBoundsException = e9;
                i10 = i9;
                throw new zzgwt(i10, this.f27385e, 1, indexOutOfBoundsException);
            }
        }
        i9 = i10 + 1;
        this.f27384d[i10] = (byte) i8;
        this.f27386f = i9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void z(int i8, long j8) {
        y(i8 << 3);
        A(j8);
    }
}
