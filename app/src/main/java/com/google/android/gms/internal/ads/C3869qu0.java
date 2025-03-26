package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.qu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3869qu0 extends AbstractC4086su0 {

    /* renamed from: f, reason: collision with root package name */
    private final InputStream f26002f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f26003g;

    /* renamed from: h, reason: collision with root package name */
    private int f26004h;

    /* renamed from: i, reason: collision with root package name */
    private int f26005i;

    /* renamed from: j, reason: collision with root package name */
    private int f26006j;

    /* renamed from: k, reason: collision with root package name */
    private int f26007k;

    /* renamed from: l, reason: collision with root package name */
    private int f26008l;

    /* renamed from: m, reason: collision with root package name */
    private int f26009m;

    /* synthetic */ C3869qu0(InputStream inputStream, int i8, AbstractC3977ru0 abstractC3977ru0) {
        super(null);
        this.f26009m = Integer.MAX_VALUE;
        byte[] bArr = AbstractC2131av0.f20783b;
        this.f26002f = inputStream;
        this.f26003g = new byte[4096];
        this.f26004h = 0;
        this.f26006j = 0;
        this.f26008l = 0;
    }

    private final List C(int i8) {
        ArrayList arrayList = new ArrayList();
        while (i8 > 0) {
            int min = Math.min(i8, 4096);
            byte[] bArr = new byte[min];
            int i9 = 0;
            while (i9 < min) {
                int read = this.f26002f.read(bArr, i9, min - i9);
                if (read == -1) {
                    throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f26008l += read;
                i9 += read;
            }
            i8 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void D() {
        int i8 = this.f26004h + this.f26005i;
        this.f26004h = i8;
        int i9 = this.f26008l + i8;
        int i10 = this.f26009m;
        if (i9 <= i10) {
            this.f26005i = 0;
            return;
        }
        int i11 = i9 - i10;
        this.f26005i = i11;
        this.f26004h = i8 - i11;
    }

    private final void E(int i8) {
        if (F(i8)) {
            return;
        }
        if (i8 <= (Integer.MAX_VALUE - this.f26008l) - this.f26006j) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzgyg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    private final boolean F(int i8) {
        int i9 = this.f26006j;
        int i10 = i9 + i8;
        int i11 = this.f26004h;
        if (i10 <= i11) {
            throw new IllegalStateException("refillBuffer() called when " + i8 + " bytes were already available in buffer");
        }
        int i12 = this.f26008l;
        if (i8 > (Integer.MAX_VALUE - i12) - i9 || i12 + i9 + i8 > this.f26009m) {
            return false;
        }
        if (i9 > 0) {
            if (i11 > i9) {
                byte[] bArr = this.f26003g;
                System.arraycopy(bArr, i9, bArr, 0, i11 - i9);
            }
            i12 = this.f26008l + i9;
            this.f26008l = i12;
            i11 = this.f26004h - i9;
            this.f26004h = i11;
            this.f26006j = 0;
        }
        try {
            int read = this.f26002f.read(this.f26003g, i11, Math.min(4096 - i11, (Integer.MAX_VALUE - i12) - i11));
            if (read == 0 || read < -1 || read > 4096) {
                throw new IllegalStateException(String.valueOf(this.f26002f.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f26004h += read;
            D();
            if (this.f26004h >= i8) {
                return true;
            }
            return F(i8);
        } catch (zzgyg e8) {
            e8.a();
            throw e8;
        }
    }

    private final byte[] G(int i8, boolean z7) {
        byte[] H7 = H(i8);
        if (H7 != null) {
            return H7;
        }
        int i9 = this.f26006j;
        int i10 = this.f26004h;
        int i11 = i10 - i9;
        this.f26008l += i10;
        this.f26006j = 0;
        this.f26004h = 0;
        List<byte[]> C7 = C(i8 - i11);
        byte[] bArr = new byte[i8];
        System.arraycopy(this.f26003g, i9, bArr, 0, i11);
        for (byte[] bArr2 : C7) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i11, length);
            i11 += length;
        }
        return bArr;
    }

    private final byte[] H(int i8) {
        if (i8 == 0) {
            return AbstractC2131av0.f20783b;
        }
        int i9 = this.f26008l;
        int i10 = this.f26006j;
        int i11 = i9 + i10 + i8;
        if ((-2147483647) + i11 > 0) {
            throw new zzgyg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i12 = this.f26009m;
        if (i11 > i12) {
            B((i12 - i9) - i10);
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i13 = this.f26004h - i10;
        int i14 = i8 - i13;
        if (i14 >= 4096) {
            try {
                if (i14 > this.f26002f.available()) {
                    return null;
                }
            } catch (zzgyg e8) {
                e8.a();
                throw e8;
            }
        }
        byte[] bArr = new byte[i8];
        System.arraycopy(this.f26003g, this.f26006j, bArr, 0, i13);
        this.f26008l += this.f26004h;
        this.f26006j = 0;
        this.f26004h = 0;
        while (i13 < i8) {
            try {
                int read = this.f26002f.read(bArr, i13, i8 - i13);
                if (read == -1) {
                    throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f26008l += read;
                i13 += read;
            } catch (zzgyg e9) {
                e9.a();
                throw e9;
            }
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final void A(int i8) {
        this.f26009m = i8;
        D();
    }

    public final void B(int i8) {
        int i9 = this.f26004h;
        int i10 = this.f26006j;
        int i11 = i9 - i10;
        if (i8 <= i11 && i8 >= 0) {
            this.f26006j = i10 + i8;
            return;
        }
        if (i8 < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i12 = this.f26008l;
        int i13 = i12 + i10;
        int i14 = this.f26009m;
        if (i13 + i8 > i14) {
            B((i14 - i12) - i10);
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f26008l = i13;
        this.f26004h = 0;
        this.f26006j = 0;
        while (i11 < i8) {
            try {
                long j8 = i8 - i11;
                try {
                    long skip = this.f26002f.skip(j8);
                    if (skip < 0 || skip > j8) {
                        throw new IllegalStateException(String.valueOf(this.f26002f.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i11 += (int) skip;
                    }
                } catch (zzgyg e8) {
                    e8.a();
                    throw e8;
                }
            } catch (Throwable th) {
                this.f26008l += i11;
                D();
                throw th;
            }
        }
        this.f26008l += i11;
        D();
        if (i11 >= i8) {
            return;
        }
        int i15 = this.f26004h;
        int i16 = i15 - this.f26006j;
        this.f26006j = i15;
        E(1);
        while (true) {
            int i17 = i8 - i16;
            int i18 = this.f26004h;
            if (i17 <= i18) {
                this.f26006j = i17;
                return;
            } else {
                i16 += i18;
                this.f26006j = i18;
                E(1);
            }
        }
    }

    public final int I() {
        int i8 = this.f26006j;
        if (this.f26004h - i8 < 4) {
            E(4);
            i8 = this.f26006j;
        }
        byte[] bArr = this.f26003g;
        this.f26006j = i8 + 4;
        int i9 = bArr[i8] & 255;
        int i10 = bArr[i8 + 1] & 255;
        int i11 = bArr[i8 + 2] & 255;
        return ((bArr[i8 + 3] & 255) << 24) | (i10 << 8) | i9 | (i11 << 16);
    }

    public final int J() {
        int i8;
        int i9 = this.f26006j;
        int i10 = this.f26004h;
        if (i10 != i9) {
            byte[] bArr = this.f26003g;
            int i11 = i9 + 1;
            byte b8 = bArr[i9];
            if (b8 >= 0) {
                this.f26006j = i11;
                return b8;
            }
            if (i10 - i11 >= 9) {
                int i12 = i9 + 2;
                int i13 = (bArr[i11] << 7) ^ b8;
                if (i13 < 0) {
                    i8 = i13 ^ (-128);
                } else {
                    int i14 = i9 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        i8 = i15 ^ 16256;
                    } else {
                        int i16 = i9 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            i8 = (-2080896) ^ i17;
                        } else {
                            i14 = i9 + 5;
                            byte b9 = bArr[i16];
                            int i18 = (i17 ^ (b9 << 28)) ^ 266354560;
                            if (b9 < 0) {
                                i16 = i9 + 6;
                                if (bArr[i14] < 0) {
                                    i14 = i9 + 7;
                                    if (bArr[i16] < 0) {
                                        i16 = i9 + 8;
                                        if (bArr[i14] < 0) {
                                            i14 = i9 + 9;
                                            if (bArr[i16] < 0) {
                                                int i19 = i9 + 10;
                                                if (bArr[i14] >= 0) {
                                                    i12 = i19;
                                                    i8 = i18;
                                                }
                                            }
                                        }
                                    }
                                }
                                i8 = i18;
                            }
                            i8 = i18;
                        }
                        i12 = i16;
                    }
                    i12 = i14;
                }
                this.f26006j = i12;
                return i8;
            }
        }
        return (int) M();
    }

    public final long K() {
        int i8 = this.f26006j;
        if (this.f26004h - i8 < 8) {
            E(8);
            i8 = this.f26006j;
        }
        byte[] bArr = this.f26003g;
        this.f26006j = i8 + 8;
        long j8 = bArr[i8];
        long j9 = bArr[i8 + 2];
        long j10 = bArr[i8 + 3];
        return ((bArr[i8 + 7] & 255) << 56) | (j8 & 255) | ((bArr[i8 + 1] & 255) << 8) | ((j9 & 255) << 16) | ((j10 & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
    }

    public final long L() {
        long j8;
        long j9;
        int i8 = this.f26006j;
        int i9 = this.f26004h;
        if (i9 != i8) {
            byte[] bArr = this.f26003g;
            int i10 = i8 + 1;
            byte b8 = bArr[i8];
            if (b8 >= 0) {
                this.f26006j = i10;
                return b8;
            }
            if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b8;
                if (i12 < 0) {
                    j8 = i12 ^ (-128);
                } else {
                    int i13 = i8 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        j8 = i14 ^ 16256;
                    } else {
                        int i15 = i8 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            long j10 = (-2080896) ^ i16;
                            i11 = i15;
                            j8 = j10;
                        } else {
                            i13 = i8 + 5;
                            long j11 = (bArr[i15] << 28) ^ i16;
                            if (j11 >= 0) {
                                j8 = j11 ^ 266354560;
                            } else {
                                i11 = i8 + 6;
                                long j12 = (bArr[i13] << 35) ^ j11;
                                if (j12 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    int i17 = i8 + 7;
                                    long j13 = j12 ^ (bArr[i11] << 42);
                                    if (j13 >= 0) {
                                        j8 = j13 ^ 4363953127296L;
                                    } else {
                                        i11 = i8 + 8;
                                        j12 = j13 ^ (bArr[i17] << 49);
                                        if (j12 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            i17 = i8 + 9;
                                            long j14 = (j12 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                            if (j14 < 0) {
                                                i11 = i8 + 10;
                                                if (bArr[i17] >= 0) {
                                                    j8 = j14;
                                                }
                                            } else {
                                                j8 = j14;
                                            }
                                        }
                                    }
                                    i11 = i17;
                                }
                                j8 = j12 ^ j9;
                            }
                        }
                    }
                    i11 = i13;
                }
                this.f26006j = i11;
                return j8;
            }
        }
        return M();
    }

    final long M() {
        long j8 = 0;
        for (int i8 = 0; i8 < 64; i8 += 7) {
            if (this.f26006j == this.f26004h) {
                E(1);
            }
            byte[] bArr = this.f26003g;
            int i9 = this.f26006j;
            this.f26006j = i9 + 1;
            j8 |= (r3 & Byte.MAX_VALUE) << i8;
            if ((bArr[i9] & 128) == 0) {
                return j8;
            }
        }
        throw new zzgyg("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final boolean a() {
        return this.f26006j == this.f26004h && !F(1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final boolean b() {
        return L() != 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final double g() {
        return Double.longBitsToDouble(K());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final float h() {
        return Float.intBitsToFloat(I());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int i() {
        return this.f26008l + this.f26006j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int j(int i8) {
        if (i8 < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i9 = i8 + this.f26008l + this.f26006j;
        if (i9 < 0) {
            throw new zzgyg("Failed to parse the message.");
        }
        int i10 = this.f26009m;
        if (i9 > i10) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f26009m = i9;
        D();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int k() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int l() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int m() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int n() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int o() {
        return AbstractC4086su0.c(J());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int p() {
        if (a()) {
            this.f26007k = 0;
            return 0;
        }
        int J7 = J();
        this.f26007k = J7;
        if ((J7 >>> 3) != 0) {
            return J7;
        }
        throw new zzgyg("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int q() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final long r() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final long s() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final long t() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final long u() {
        return AbstractC4086su0.d(L());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final long v() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final AbstractC3542nu0 w() {
        int J7 = J();
        int i8 = this.f26004h;
        int i9 = this.f26006j;
        if (J7 <= i8 - i9 && J7 > 0) {
            AbstractC3542nu0 H7 = AbstractC3542nu0.H(this.f26003g, i9, J7);
            this.f26006j += J7;
            return H7;
        }
        if (J7 == 0) {
            return AbstractC3542nu0.f25048s;
        }
        if (J7 < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] H8 = H(J7);
        if (H8 != null) {
            return AbstractC3542nu0.H(H8, 0, H8.length);
        }
        int i10 = this.f26006j;
        int i11 = this.f26004h;
        int i12 = i11 - i10;
        this.f26008l += i11;
        this.f26006j = 0;
        this.f26004h = 0;
        List<byte[]> C7 = C(J7 - i12);
        byte[] bArr = new byte[J7];
        System.arraycopy(this.f26003g, i10, bArr, 0, i12);
        for (byte[] bArr2 : C7) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return new C3215ku0(bArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final String x() {
        int J7 = J();
        if (J7 > 0) {
            int i8 = this.f26004h;
            int i9 = this.f26006j;
            if (J7 <= i8 - i9) {
                String str = new String(this.f26003g, i9, J7, AbstractC2131av0.f20782a);
                this.f26006j += J7;
                return str;
            }
        }
        if (J7 == 0) {
            return "";
        }
        if (J7 < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (J7 > this.f26004h) {
            return new String(G(J7, false), AbstractC2131av0.f20782a);
        }
        E(J7);
        String str2 = new String(this.f26003g, this.f26006j, J7, AbstractC2131av0.f20782a);
        this.f26006j += J7;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final String y() {
        byte[] G7;
        int J7 = J();
        int i8 = this.f26006j;
        int i9 = this.f26004h;
        if (J7 <= i9 - i8 && J7 > 0) {
            G7 = this.f26003g;
            this.f26006j = i8 + J7;
        } else {
            if (J7 == 0) {
                return "";
            }
            if (J7 < 0) {
                throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i8 = 0;
            if (J7 <= i9) {
                E(J7);
                G7 = this.f26003g;
                this.f26006j = J7;
            } else {
                G7 = G(J7, false);
            }
        }
        return AbstractC2133aw0.g(G7, i8, J7);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final void z(int i8) {
        if (this.f26007k != i8) {
            throw new zzgyg("Protocol message end-group tag did not match expected tag.");
        }
    }
}
