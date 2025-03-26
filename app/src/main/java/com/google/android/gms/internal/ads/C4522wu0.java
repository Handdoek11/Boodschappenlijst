package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.ads.wu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4522wu0 extends AbstractC4304uu0 {

    /* renamed from: h, reason: collision with root package name */
    private final OutputStream f27580h;

    C4522wu0(OutputStream outputStream, int i8) {
        super(i8);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f27580h = outputStream;
    }

    private final void H() {
        this.f27580h.write(this.f27136d, 0, this.f27138f);
        this.f27138f = 0;
    }

    private final void I(int i8) {
        if (this.f27137e - this.f27138f < i8) {
            H();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void A(long j8) {
        I(10);
        G(j8);
    }

    public final void J(byte[] bArr, int i8, int i9) {
        int i10 = this.f27137e;
        int i11 = this.f27138f;
        int i12 = i10 - i11;
        if (i12 >= i9) {
            System.arraycopy(bArr, i8, this.f27136d, i11, i9);
            this.f27138f += i9;
            this.f27139g += i9;
            return;
        }
        System.arraycopy(bArr, i8, this.f27136d, i11, i12);
        int i13 = i8 + i12;
        this.f27138f = this.f27137e;
        this.f27139g += i12;
        H();
        int i14 = i9 - i12;
        if (i14 <= this.f27137e) {
            System.arraycopy(bArr, i13, this.f27136d, 0, i14);
            this.f27138f = i14;
        } else {
            this.f27580h.write(bArr, i13, i14);
        }
        this.f27139g += i14;
    }

    public final void K(String str) {
        int e8;
        try {
            int length = str.length() * 3;
            int e9 = AbstractC4740yu0.e(length);
            int i8 = e9 + length;
            int i9 = this.f27137e;
            if (i8 > i9) {
                byte[] bArr = new byte[length];
                int d8 = AbstractC2133aw0.d(str, bArr, 0, length);
                y(d8);
                J(bArr, 0, d8);
                return;
            }
            if (i8 > i9 - this.f27138f) {
                H();
            }
            int e10 = AbstractC4740yu0.e(str.length());
            int i10 = this.f27138f;
            try {
                if (e10 == e9) {
                    int i11 = i10 + e10;
                    this.f27138f = i11;
                    int d9 = AbstractC2133aw0.d(str, this.f27136d, i11, this.f27137e - i11);
                    this.f27138f = i10;
                    e8 = (d9 - i10) - e10;
                    F(e8);
                    this.f27138f = d9;
                } else {
                    e8 = AbstractC2133aw0.e(str);
                    F(e8);
                    this.f27138f = AbstractC2133aw0.d(str, this.f27136d, this.f27138f, e8);
                }
                this.f27139g += e8;
            } catch (Zv0 e11) {
                this.f27139g -= this.f27138f - i10;
                this.f27138f = i10;
                throw e11;
            } catch (ArrayIndexOutOfBoundsException e12) {
                throw new zzgwt(e12);
            }
        } catch (Zv0 e13) {
            h(str, e13);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0, com.google.android.gms.internal.ads.AbstractC2563eu0
    public final void a(byte[] bArr, int i8, int i9) {
        J(bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void j() {
        if (this.f27138f > 0) {
            H();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void k(byte b8) {
        if (this.f27138f == this.f27137e) {
            H();
        }
        C(b8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void l(int i8, boolean z7) {
        I(11);
        F(i8 << 3);
        C(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void m(int i8, AbstractC3542nu0 abstractC3542nu0) {
        y((i8 << 3) | 2);
        y(abstractC3542nu0.j());
        abstractC3542nu0.v(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void o(int i8, int i9) {
        I(14);
        F((i8 << 3) | 5);
        D(i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void p(int i8) {
        I(4);
        D(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void q(int i8, long j8) {
        I(18);
        F((i8 << 3) | 1);
        E(j8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void r(long j8) {
        I(8);
        E(j8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void s(int i8, int i9) {
        I(20);
        F(i8 << 3);
        if (i9 >= 0) {
            F(i9);
        } else {
            G(i9);
        }
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
        K(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void w(int i8, int i9) {
        y((i8 << 3) | i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void x(int i8, int i9) {
        I(20);
        F(i8 << 3);
        F(i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void y(int i8) {
        I(5);
        F(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final void z(int i8, long j8) {
        I(20);
        F(i8 << 3);
        G(j8);
    }
}
