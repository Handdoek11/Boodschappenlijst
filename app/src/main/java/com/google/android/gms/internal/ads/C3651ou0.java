package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ou0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3651ou0 extends AbstractC4086su0 {

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f25289f;

    /* renamed from: g, reason: collision with root package name */
    private int f25290g;

    /* renamed from: h, reason: collision with root package name */
    private int f25291h;

    /* renamed from: i, reason: collision with root package name */
    private int f25292i;

    /* renamed from: j, reason: collision with root package name */
    private final int f25293j;

    /* renamed from: k, reason: collision with root package name */
    private int f25294k;

    /* renamed from: l, reason: collision with root package name */
    private int f25295l;

    /* synthetic */ C3651ou0(byte[] bArr, int i8, int i9, boolean z7, AbstractC3977ru0 abstractC3977ru0) {
        super(null);
        this.f25295l = Integer.MAX_VALUE;
        this.f25289f = bArr;
        this.f25290g = i9 + i8;
        this.f25292i = i8;
        this.f25293j = i8;
    }

    private final void B() {
        int i8 = this.f25290g + this.f25291h;
        this.f25290g = i8;
        int i9 = i8 - this.f25293j;
        int i10 = this.f25295l;
        if (i9 <= i10) {
            this.f25291h = 0;
            return;
        }
        int i11 = i9 - i10;
        this.f25291h = i11;
        this.f25290g = i8 - i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final void A(int i8) {
        this.f25295l = i8;
        B();
    }

    public final int C() {
        int i8 = this.f25292i;
        if (this.f25290g - i8 < 4) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f25289f;
        this.f25292i = i8 + 4;
        int i9 = bArr[i8] & 255;
        int i10 = bArr[i8 + 1] & 255;
        int i11 = bArr[i8 + 2] & 255;
        return ((bArr[i8 + 3] & 255) << 24) | (i10 << 8) | i9 | (i11 << 16);
    }

    public final int D() {
        int i8;
        int i9 = this.f25292i;
        int i10 = this.f25290g;
        if (i10 != i9) {
            byte[] bArr = this.f25289f;
            int i11 = i9 + 1;
            byte b8 = bArr[i9];
            if (b8 >= 0) {
                this.f25292i = i11;
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
                this.f25292i = i12;
                return i8;
            }
        }
        return (int) G();
    }

    public final long E() {
        int i8 = this.f25292i;
        if (this.f25290g - i8 < 8) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f25289f;
        this.f25292i = i8 + 8;
        long j8 = bArr[i8];
        long j9 = bArr[i8 + 2];
        long j10 = bArr[i8 + 3];
        return ((bArr[i8 + 7] & 255) << 56) | (j8 & 255) | ((bArr[i8 + 1] & 255) << 8) | ((j9 & 255) << 16) | ((j10 & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
    }

    public final long F() {
        long j8;
        long j9;
        int i8 = this.f25292i;
        int i9 = this.f25290g;
        if (i9 != i8) {
            byte[] bArr = this.f25289f;
            int i10 = i8 + 1;
            byte b8 = bArr[i8];
            if (b8 >= 0) {
                this.f25292i = i10;
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
                this.f25292i = i11;
                return j8;
            }
        }
        return G();
    }

    final long G() {
        long j8 = 0;
        for (int i8 = 0; i8 < 64; i8 += 7) {
            int i9 = this.f25292i;
            if (i9 == this.f25290g) {
                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr = this.f25289f;
            this.f25292i = i9 + 1;
            j8 |= (r3 & Byte.MAX_VALUE) << i8;
            if ((bArr[i9] & 128) == 0) {
                return j8;
            }
        }
        throw new zzgyg("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final boolean a() {
        return this.f25292i == this.f25290g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final boolean b() {
        return F() != 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final double g() {
        return Double.longBitsToDouble(E());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final float h() {
        return Float.intBitsToFloat(C());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int i() {
        return this.f25292i - this.f25293j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int j(int i8) {
        if (i8 < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i9 = i8 + (this.f25292i - this.f25293j);
        if (i9 < 0) {
            throw new zzgyg("Failed to parse the message.");
        }
        int i10 = this.f25295l;
        if (i9 > i10) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f25295l = i9;
        B();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int k() {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int l() {
        return C();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int m() {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int n() {
        return C();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int o() {
        return AbstractC4086su0.c(D());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int p() {
        if (a()) {
            this.f25294k = 0;
            return 0;
        }
        int D7 = D();
        this.f25294k = D7;
        if ((D7 >>> 3) != 0) {
            return D7;
        }
        throw new zzgyg("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int q() {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final long r() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final long s() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final long t() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final long u() {
        return AbstractC4086su0.d(F());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final long v() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final AbstractC3542nu0 w() {
        int D7 = D();
        if (D7 > 0) {
            int i8 = this.f25290g;
            int i9 = this.f25292i;
            if (D7 <= i8 - i9) {
                AbstractC3542nu0 H7 = AbstractC3542nu0.H(this.f25289f, i9, D7);
                this.f25292i += D7;
                return H7;
            }
        }
        if (D7 == 0) {
            return AbstractC3542nu0.f25048s;
        }
        if (D7 > 0) {
            int i10 = this.f25290g;
            int i11 = this.f25292i;
            if (D7 <= i10 - i11) {
                int i12 = D7 + i11;
                this.f25292i = i12;
                return new C3215ku0(Arrays.copyOfRange(this.f25289f, i11, i12));
            }
        }
        if (D7 <= 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final String x() {
        int D7 = D();
        if (D7 > 0) {
            int i8 = this.f25290g;
            int i9 = this.f25292i;
            if (D7 <= i8 - i9) {
                String str = new String(this.f25289f, i9, D7, AbstractC2131av0.f20782a);
                this.f25292i += D7;
                return str;
            }
        }
        if (D7 == 0) {
            return "";
        }
        if (D7 < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final String y() {
        int D7 = D();
        if (D7 > 0) {
            int i8 = this.f25290g;
            int i9 = this.f25292i;
            if (D7 <= i8 - i9) {
                String g8 = AbstractC2133aw0.g(this.f25289f, i9, D7);
                this.f25292i += D7;
                return g8;
            }
        }
        if (D7 == 0) {
            return "";
        }
        if (D7 <= 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final void z(int i8) {
        if (this.f25294k != i8) {
            throw new zzgyg("Protocol message end-group tag did not match expected tag.");
        }
    }
}
