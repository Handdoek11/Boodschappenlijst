package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class UQ {

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f19367d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f19368e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC4714yh0 f19369f = AbstractC4714yh0.F(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* renamed from: a, reason: collision with root package name */
    private byte[] f19370a;

    /* renamed from: b, reason: collision with root package name */
    private int f19371b;

    /* renamed from: c, reason: collision with root package name */
    private int f19372c;

    public UQ(byte[] bArr, int i8) {
        this.f19370a = bArr;
        this.f19372c = i8;
    }

    private final char o(Charset charset, char[] cArr) {
        int p8 = p(charset);
        if (p8 != 0) {
            int i8 = p8 >> 16;
            for (char c8 : cArr) {
                char c9 = (char) i8;
                if (c8 == c9) {
                    this.f19371b += (char) p8;
                    return c9;
                }
            }
        }
        return (char) 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int p(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            boolean r0 = r5.equals(r0)
            r1 = 1
            if (r0 != 0) goto L11
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L25
        L11:
            int r0 = r4.f19372c
            int r2 = r4.f19371b
            int r0 = r0 - r2
            if (r0 <= 0) goto L25
            byte[] r5 = r4.f19370a
            r5 = r5[r2]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r2 = (long) r5
            char r5 = com.google.android.gms.internal.ads.AbstractC1838Ui0.a(r2)
            byte r5 = (byte) r5
            goto L67
        L25:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            r2 = 2
            if (r0 != 0) goto L36
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L4b
        L36:
            int r0 = r4.f19372c
            int r3 = r4.f19371b
            int r0 = r0 - r3
            if (r0 < r2) goto L4b
            byte[] r5 = r4.f19370a
            r0 = r5[r3]
            int r3 = r3 + r1
            r5 = r5[r3]
            char r5 = com.google.android.gms.internal.ads.AbstractC1838Ui0.b(r0, r5)
        L48:
            byte r5 = (byte) r5
            r1 = r2
            goto L67
        L4b:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L70
            int r5 = r4.f19372c
            int r0 = r4.f19371b
            int r5 = r5 - r0
            if (r5 < r2) goto L70
            byte[] r5 = r4.f19370a
            int r1 = r0 + 1
            r1 = r5[r1]
            r5 = r5[r0]
            char r5 = com.google.android.gms.internal.ads.AbstractC1838Ui0.b(r1, r5)
            goto L48
        L67:
            long r2 = (long) r5
            char r5 = com.google.android.gms.internal.ads.AbstractC1838Ui0.a(r2)
            int r5 = r5 << 16
            int r5 = r5 + r1
            return r5
        L70:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.UQ.p(java.nio.charset.Charset):int");
    }

    public final int A() {
        byte[] bArr = this.f19370a;
        int i8 = this.f19371b;
        int i9 = i8 + 1;
        this.f19371b = i9;
        int i10 = bArr[i8] & 255;
        this.f19371b = i8 + 2;
        return ((bArr[i9] & 255) << 8) | i10;
    }

    public final int B() {
        return (C() << 21) | (C() << 14) | (C() << 7) | C();
    }

    public final int C() {
        byte[] bArr = this.f19370a;
        int i8 = this.f19371b;
        this.f19371b = i8 + 1;
        return bArr[i8] & 255;
    }

    public final int D() {
        byte[] bArr = this.f19370a;
        int i8 = this.f19371b;
        int i9 = i8 + 1;
        this.f19371b = i9;
        int i10 = bArr[i8] & 255;
        this.f19371b = i8 + 2;
        int i11 = bArr[i9] & 255;
        this.f19371b = i8 + 4;
        return i11 | (i10 << 8);
    }

    public final int E() {
        byte[] bArr = this.f19370a;
        int i8 = this.f19371b;
        int i9 = i8 + 1;
        this.f19371b = i9;
        int i10 = bArr[i8] & 255;
        int i11 = i8 + 2;
        this.f19371b = i11;
        int i12 = bArr[i9] & 255;
        this.f19371b = i8 + 3;
        return (bArr[i11] & 255) | (i10 << 16) | (i12 << 8);
    }

    public final int F() {
        int w7 = w();
        if (w7 >= 0) {
            return w7;
        }
        throw new IllegalStateException("Top bit not zero: " + w7);
    }

    public final int G() {
        byte[] bArr = this.f19370a;
        int i8 = this.f19371b;
        int i9 = i8 + 1;
        this.f19371b = i9;
        int i10 = bArr[i8] & 255;
        this.f19371b = i8 + 2;
        return (bArr[i9] & 255) | (i10 << 8);
    }

    public final long H() {
        byte[] bArr = this.f19370a;
        int i8 = this.f19371b;
        int i9 = i8 + 1;
        this.f19371b = i9;
        long j8 = bArr[i8];
        int i10 = i8 + 2;
        this.f19371b = i10;
        long j9 = bArr[i9];
        int i11 = i8 + 3;
        this.f19371b = i11;
        long j10 = bArr[i10];
        int i12 = i8 + 4;
        this.f19371b = i12;
        long j11 = bArr[i11];
        int i13 = i8 + 5;
        this.f19371b = i13;
        long j12 = bArr[i12];
        int i14 = i8 + 6;
        this.f19371b = i14;
        long j13 = bArr[i13];
        this.f19371b = i8 + 7;
        long j14 = bArr[i14];
        this.f19371b = i8 + 8;
        return ((bArr[r5] & 255) << 56) | ((j14 & 255) << 48) | ((j9 & 255) << 8) | (j8 & 255) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((j12 & 255) << 32) | ((j13 & 255) << 40);
    }

    public final long I() {
        byte[] bArr = this.f19370a;
        int i8 = this.f19371b;
        int i9 = i8 + 1;
        this.f19371b = i9;
        long j8 = bArr[i8];
        int i10 = i8 + 2;
        this.f19371b = i10;
        long j9 = bArr[i9];
        this.f19371b = i8 + 3;
        long j10 = bArr[i10];
        this.f19371b = i8 + 4;
        return ((bArr[r2] & 255) << 24) | (j8 & 255) | ((j9 & 255) << 8) | ((j10 & 255) << 16);
    }

    public final long J() {
        byte[] bArr = this.f19370a;
        int i8 = this.f19371b;
        int i9 = i8 + 1;
        this.f19371b = i9;
        long j8 = bArr[i8];
        int i10 = i8 + 2;
        this.f19371b = i10;
        long j9 = bArr[i9];
        int i11 = i8 + 3;
        this.f19371b = i11;
        long j10 = bArr[i10];
        int i12 = i8 + 4;
        this.f19371b = i12;
        long j11 = bArr[i11];
        int i13 = i8 + 5;
        this.f19371b = i13;
        long j12 = bArr[i12];
        int i14 = i8 + 6;
        this.f19371b = i14;
        long j13 = bArr[i13];
        this.f19371b = i8 + 7;
        long j14 = bArr[i14];
        this.f19371b = i8 + 8;
        return (bArr[r3] & 255) | ((j8 & 255) << 56) | ((j9 & 255) << 48) | ((j10 & 255) << 40) | ((j11 & 255) << 32) | ((j12 & 255) << 24) | ((j13 & 255) << 16) | ((j14 & 255) << 8);
    }

    public final long K() {
        byte[] bArr = this.f19370a;
        int i8 = this.f19371b;
        int i9 = i8 + 1;
        this.f19371b = i9;
        long j8 = bArr[i8];
        int i10 = i8 + 2;
        this.f19371b = i10;
        long j9 = bArr[i9];
        this.f19371b = i8 + 3;
        long j10 = bArr[i10];
        this.f19371b = i8 + 4;
        return (bArr[r2] & 255) | ((j8 & 255) << 24) | ((j9 & 255) << 16) | ((j10 & 255) << 8);
    }

    public final long L() {
        long j8 = 0;
        for (int i8 = 0; i8 < 9; i8++) {
            if (this.f19371b == this.f19372c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long C7 = C();
            j8 |= (127 & C7) << (i8 * 7);
            if ((C7 & 128) == 0) {
                break;
            }
        }
        return j8;
    }

    public final long M() {
        long J7 = J();
        if (J7 >= 0) {
            return J7;
        }
        throw new IllegalStateException("Top bit not zero: " + J7);
    }

    public final long N() {
        int i8;
        int i9;
        long j8 = this.f19370a[this.f19371b];
        int i10 = 7;
        while (true) {
            i8 = 0;
            if (i10 < 0) {
                break;
            }
            if (((1 << i10) & j8) != 0) {
                i10--;
            } else if (i10 < 6) {
                j8 &= r7 - 1;
                i8 = 7 - i10;
            } else if (i10 == 7) {
                i8 = 1;
            }
        }
        if (i8 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j8);
        }
        for (i9 = 1; i9 < i8; i9++) {
            if ((this.f19370a[this.f19371b + i9] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j8);
            }
            j8 = (j8 << 6) | (r2 & 63);
        }
        this.f19371b += i8;
        return j8;
    }

    public final String O(char c8) {
        int i8 = this.f19372c;
        int i9 = this.f19371b;
        if (i8 - i9 == 0) {
            return null;
        }
        while (i9 < this.f19372c && this.f19370a[i9] != 0) {
            i9++;
        }
        byte[] bArr = this.f19370a;
        int i10 = this.f19371b;
        String c9 = AbstractC2301cW.c(bArr, i10, i9 - i10);
        this.f19371b = i9;
        if (i9 < this.f19372c) {
            this.f19371b = i9 + 1;
        }
        return c9;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String P(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.yh0 r0 = com.google.android.gms.internal.ads.UQ.f19369f
            boolean r0 = r0.contains(r5)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Unsupported charset: "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.internal.ads.AbstractC3796qC.e(r0, r1)
            int r0 = r4.f19372c
            int r1 = r4.f19371b
            int r0 = r0 - r1
            if (r0 != 0) goto L1c
            r5 = 0
            return r5
        L1c:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L27
            r4.c()
        L27:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            boolean r1 = r5.equals(r1)
            r3 = 1
            if (r1 != 0) goto L5f
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L37
            goto L5f
        L37:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            r3 = 2
            if (r0 != 0) goto L5f
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L5f
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L51
            goto L5f
        L51:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r2.concat(r5)
            r0.<init>(r5)
            throw r0
        L5f:
            int r0 = r4.f19371b
        L61:
            int r1 = r4.f19372c
            int r2 = r3 + (-1)
            int r2 = r1 - r2
            if (r0 >= r2) goto Lbe
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L79
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L83
        L79:
            byte[] r1 = r4.f19370a
            r1 = r1[r0]
            boolean r1 = com.google.android.gms.internal.ads.AbstractC2301cW.l(r1)
            if (r1 != 0) goto Lbf
        L83:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L93
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto La3
        L93:
            byte[] r1 = r4.f19370a
            r2 = r1[r0]
            if (r2 != 0) goto La3
            int r2 = r0 + 1
            r1 = r1[r2]
            boolean r1 = com.google.android.gms.internal.ads.AbstractC2301cW.l(r1)
            if (r1 != 0) goto Lbf
        La3:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto Lbc
            int r1 = r0 + 1
            byte[] r2 = r4.f19370a
            r1 = r2[r1]
            if (r1 != 0) goto Lbc
            r1 = r2[r0]
            boolean r1 = com.google.android.gms.internal.ads.AbstractC2301cW.l(r1)
            if (r1 == 0) goto Lbc
            goto Lbf
        Lbc:
            int r0 = r0 + r3
            goto L61
        Lbe:
            r0 = r1
        Lbf:
            int r1 = r4.f19371b
            int r0 = r0 - r1
            java.lang.String r0 = r4.b(r0, r5)
            int r1 = r4.f19371b
            int r2 = r4.f19372c
            if (r1 == r2) goto Ldb
            char[] r1 = com.google.android.gms.internal.ads.UQ.f19367d
            char r1 = r4.o(r5, r1)
            r2 = 13
            if (r1 != r2) goto Ldb
            char[] r1 = com.google.android.gms.internal.ads.UQ.f19368e
            r4.o(r5, r1)
        Ldb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.UQ.P(java.nio.charset.Charset):java.lang.String");
    }

    public final String a(int i8) {
        if (i8 == 0) {
            return "";
        }
        int i9 = this.f19371b;
        int i10 = (i9 + i8) - 1;
        String c8 = AbstractC2301cW.c(this.f19370a, i9, (i10 >= this.f19372c || this.f19370a[i10] != 0) ? i8 : i8 - 1);
        this.f19371b += i8;
        return c8;
    }

    public final String b(int i8, Charset charset) {
        byte[] bArr = this.f19370a;
        int i9 = this.f19371b;
        String str = new String(bArr, i9, i8, charset);
        this.f19371b = i9 + i8;
        return str;
    }

    public final Charset c() {
        int i8 = this.f19372c;
        int i9 = this.f19371b;
        int i10 = i8 - i9;
        if (i10 >= 3) {
            byte[] bArr = this.f19370a;
            if (bArr[i9] == -17 && bArr[i9 + 1] == -69 && bArr[i9 + 2] == -65) {
                this.f19371b = i9 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (i10 < 2) {
            return null;
        }
        byte[] bArr2 = this.f19370a;
        byte b8 = bArr2[i9];
        if (b8 == -2) {
            if (bArr2[i9 + 1] != -1) {
                return null;
            }
            this.f19371b = i9 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b8 != -1 || bArr2[i9 + 1] != -2) {
            return null;
        }
        this.f19371b = i9 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final short d() {
        byte[] bArr = this.f19370a;
        int i8 = this.f19371b;
        int i9 = i8 + 1;
        this.f19371b = i9;
        int i10 = bArr[i8] & 255;
        this.f19371b = i8 + 2;
        return (short) (((bArr[i9] & 255) << 8) | i10);
    }

    public final short e() {
        byte[] bArr = this.f19370a;
        int i8 = this.f19371b;
        int i9 = i8 + 1;
        this.f19371b = i9;
        int i10 = bArr[i8] & 255;
        this.f19371b = i8 + 2;
        return (short) ((bArr[i9] & 255) | (i10 << 8));
    }

    public final void f(int i8) {
        byte[] bArr = this.f19370a;
        if (i8 > bArr.length) {
            this.f19370a = Arrays.copyOf(bArr, i8);
        }
    }

    public final void g(C4144tQ c4144tQ, int i8) {
        h(c4144tQ.f26885a, 0, i8);
        c4144tQ.l(0);
    }

    public final void h(byte[] bArr, int i8, int i9) {
        System.arraycopy(this.f19370a, this.f19371b, bArr, i8, i9);
        this.f19371b += i9;
    }

    public final void i(int i8) {
        byte[] bArr = this.f19370a;
        if (bArr.length < i8) {
            bArr = new byte[i8];
        }
        j(bArr, i8);
    }

    public final void j(byte[] bArr, int i8) {
        this.f19370a = bArr;
        this.f19372c = i8;
        this.f19371b = 0;
    }

    public final void k(int i8) {
        boolean z7 = false;
        if (i8 >= 0 && i8 <= this.f19370a.length) {
            z7 = true;
        }
        AbstractC3796qC.d(z7);
        this.f19372c = i8;
    }

    public final void l(int i8) {
        boolean z7 = false;
        if (i8 >= 0 && i8 <= this.f19372c) {
            z7 = true;
        }
        AbstractC3796qC.d(z7);
        this.f19371b = i8;
    }

    public final void m(int i8) {
        l(this.f19371b + i8);
    }

    public final byte[] n() {
        return this.f19370a;
    }

    public final char q(Charset charset) {
        AbstractC3796qC.e(f19369f.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        return (char) (p(charset) >> 16);
    }

    public final int r() {
        return this.f19372c - this.f19371b;
    }

    public final int s() {
        return this.f19370a.length;
    }

    public final int t() {
        return this.f19371b;
    }

    public final int u() {
        return this.f19372c;
    }

    public final int v() {
        return this.f19370a[this.f19371b] & 255;
    }

    public final int w() {
        byte[] bArr = this.f19370a;
        int i8 = this.f19371b;
        int i9 = i8 + 1;
        this.f19371b = i9;
        int i10 = bArr[i8] & 255;
        int i11 = i8 + 2;
        this.f19371b = i11;
        int i12 = bArr[i9] & 255;
        int i13 = i8 + 3;
        this.f19371b = i13;
        int i14 = bArr[i11] & 255;
        this.f19371b = i8 + 4;
        return (bArr[i13] & 255) | (i10 << 24) | (i12 << 16) | (i14 << 8);
    }

    public final int x() {
        byte[] bArr = this.f19370a;
        int i8 = this.f19371b;
        int i9 = i8 + 1;
        this.f19371b = i9;
        int i10 = bArr[i8] & 255;
        int i11 = i8 + 2;
        this.f19371b = i11;
        int i12 = bArr[i9] & 255;
        this.f19371b = i8 + 3;
        return (bArr[i11] & 255) | ((i10 << 24) >> 8) | (i12 << 8);
    }

    public final int y() {
        byte[] bArr = this.f19370a;
        int i8 = this.f19371b;
        int i9 = i8 + 1;
        this.f19371b = i9;
        int i10 = bArr[i8] & 255;
        int i11 = i8 + 2;
        this.f19371b = i11;
        int i12 = bArr[i9] & 255;
        int i13 = i8 + 3;
        this.f19371b = i13;
        int i14 = bArr[i11] & 255;
        this.f19371b = i8 + 4;
        return ((bArr[i13] & 255) << 24) | (i12 << 8) | i10 | (i14 << 16);
    }

    public final int z() {
        int y7 = y();
        if (y7 >= 0) {
            return y7;
        }
        throw new IllegalStateException("Top bit not zero: " + y7);
    }

    public UQ() {
        this.f19370a = AbstractC2301cW.f21211f;
    }

    public UQ(int i8) {
        this.f19370a = new byte[i8];
        this.f19372c = i8;
    }

    public UQ(byte[] bArr) {
        this.f19370a = bArr;
        this.f19372c = bArr.length;
    }
}
