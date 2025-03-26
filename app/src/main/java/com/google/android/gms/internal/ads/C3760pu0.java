package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.pu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3760pu0 extends AbstractC4086su0 {

    /* renamed from: f, reason: collision with root package name */
    private final Iterable f25532f;

    /* renamed from: g, reason: collision with root package name */
    private final Iterator f25533g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f25534h;

    /* renamed from: i, reason: collision with root package name */
    private int f25535i;

    /* renamed from: j, reason: collision with root package name */
    private int f25536j;

    /* renamed from: k, reason: collision with root package name */
    private int f25537k;

    /* renamed from: l, reason: collision with root package name */
    private int f25538l;

    /* renamed from: m, reason: collision with root package name */
    private int f25539m;

    /* renamed from: n, reason: collision with root package name */
    private long f25540n;

    /* renamed from: o, reason: collision with root package name */
    private long f25541o;

    /* renamed from: p, reason: collision with root package name */
    private long f25542p;

    /* synthetic */ C3760pu0(Iterable iterable, int i8, boolean z7, AbstractC3977ru0 abstractC3977ru0) {
        super(null);
        this.f25537k = Integer.MAX_VALUE;
        this.f25535i = i8;
        this.f25532f = iterable;
        this.f25533g = iterable.iterator();
        this.f25539m = 0;
        if (i8 != 0) {
            G();
            return;
        }
        this.f25534h = AbstractC2131av0.f20784c;
        this.f25540n = 0L;
        this.f25541o = 0L;
        this.f25542p = 0L;
    }

    private final int C() {
        return (int) (((this.f25535i - this.f25539m) - this.f25540n) + this.f25541o);
    }

    private final void D() {
        if (!this.f25533g.hasNext()) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        G();
    }

    private final void E(byte[] bArr, int i8, int i9) {
        if (i9 > C()) {
            if (i9 > 0) {
                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i10 = i9;
        while (i10 > 0) {
            if (this.f25542p - this.f25540n == 0) {
                D();
            }
            int min = Math.min(i10, (int) (this.f25542p - this.f25540n));
            long j8 = min;
            Vv0.w(this.f25540n, bArr, i9 - i10, j8);
            i10 -= min;
            this.f25540n += j8;
        }
    }

    private final void F() {
        int i8 = this.f25535i + this.f25536j;
        this.f25535i = i8;
        int i9 = this.f25537k;
        if (i8 <= i9) {
            this.f25536j = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f25536j = i10;
        this.f25535i = i8 - i10;
    }

    private final void G() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f25533g.next();
        this.f25534h = byteBuffer;
        this.f25539m += (int) (this.f25540n - this.f25541o);
        long position = byteBuffer.position();
        this.f25540n = position;
        this.f25541o = position;
        this.f25542p = this.f25534h.limit();
        long m8 = Vv0.m(this.f25534h);
        this.f25540n += m8;
        this.f25541o += m8;
        this.f25542p += m8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final void A(int i8) {
        this.f25537k = i8;
        F();
    }

    final long B() {
        long j8 = 0;
        for (int i8 = 0; i8 < 64; i8 += 7) {
            j8 |= (r3 & Byte.MAX_VALUE) << i8;
            if ((H() & 128) == 0) {
                return j8;
            }
        }
        throw new zzgyg("CodedInputStream encountered a malformed varint.");
    }

    public final byte H() {
        if (this.f25542p - this.f25540n == 0) {
            D();
        }
        long j8 = this.f25540n;
        this.f25540n = 1 + j8;
        return Vv0.i(j8);
    }

    public final int I() {
        long j8 = this.f25542p;
        long j9 = this.f25540n;
        if (j8 - j9 < 4) {
            int H7 = H() & 255;
            int H8 = (H() & 255) << 8;
            return H7 | H8 | ((H() & 255) << 16) | ((H() & 255) << 24);
        }
        this.f25540n = 4 + j9;
        int i8 = Vv0.i(j9) & 255;
        int i9 = (Vv0.i(1 + j9) & 255) << 8;
        return i8 | i9 | ((Vv0.i(2 + j9) & 255) << 16) | ((Vv0.i(j9 + 3) & 255) << 24);
    }

    public final int J() {
        int i8;
        long j8 = this.f25540n;
        if (this.f25542p != j8) {
            long j9 = j8 + 1;
            byte i9 = Vv0.i(j8);
            if (i9 >= 0) {
                this.f25540n++;
                return i9;
            }
            if (this.f25542p - this.f25540n >= 10) {
                long j10 = 2 + j8;
                int i10 = (Vv0.i(j9) << 7) ^ i9;
                if (i10 < 0) {
                    i8 = i10 ^ (-128);
                } else {
                    long j11 = 3 + j8;
                    int i11 = (Vv0.i(j10) << 14) ^ i10;
                    if (i11 >= 0) {
                        i8 = i11 ^ 16256;
                    } else {
                        long j12 = 4 + j8;
                        int i12 = i11 ^ (Vv0.i(j11) << 21);
                        if (i12 < 0) {
                            i8 = (-2080896) ^ i12;
                        } else {
                            j11 = 5 + j8;
                            byte i13 = Vv0.i(j12);
                            int i14 = (i12 ^ (i13 << 28)) ^ 266354560;
                            if (i13 < 0) {
                                j12 = 6 + j8;
                                if (Vv0.i(j11) < 0) {
                                    j11 = 7 + j8;
                                    if (Vv0.i(j12) < 0) {
                                        j12 = 8 + j8;
                                        if (Vv0.i(j11) < 0) {
                                            j11 = 9 + j8;
                                            if (Vv0.i(j12) < 0) {
                                                long j13 = j8 + 10;
                                                if (Vv0.i(j11) >= 0) {
                                                    i8 = i14;
                                                    j10 = j13;
                                                }
                                            }
                                        }
                                    }
                                }
                                i8 = i14;
                            }
                            i8 = i14;
                        }
                        j10 = j12;
                    }
                    j10 = j11;
                }
                this.f25540n = j10;
                return i8;
            }
        }
        return (int) B();
    }

    public final long K() {
        long j8 = this.f25542p;
        long j9 = this.f25540n;
        if (j8 - j9 < 8) {
            return (H() & 255) | ((H() & 255) << 8) | ((H() & 255) << 16) | ((H() & 255) << 24) | ((H() & 255) << 32) | ((H() & 255) << 40) | ((H() & 255) << 48) | ((H() & 255) << 56);
        }
        this.f25540n = 8 + j9;
        long i8 = Vv0.i(j9) & 255;
        long i9 = (Vv0.i(1 + j9) & 255) << 8;
        long i10 = (Vv0.i(j9 + 2) & 255) << 16;
        long i11 = (Vv0.i(3 + j9) & 255) << 24;
        long i12 = (Vv0.i(j9 + 4) & 255) << 32;
        return i12 | i8 | i9 | i10 | i11 | ((Vv0.i(j9 + 5) & 255) << 40) | ((Vv0.i(j9 + 6) & 255) << 48) | ((Vv0.i(j9 + 7) & 255) << 56);
    }

    public final long L() {
        long j8;
        long j9;
        long j10 = this.f25540n;
        if (this.f25542p != j10) {
            long j11 = j10 + 1;
            byte i8 = Vv0.i(j10);
            if (i8 >= 0) {
                this.f25540n++;
                return i8;
            }
            if (this.f25542p - this.f25540n >= 10) {
                long j12 = 2 + j10;
                int i9 = (Vv0.i(j11) << 7) ^ i8;
                if (i9 < 0) {
                    j8 = i9 ^ (-128);
                } else {
                    long j13 = 3 + j10;
                    int i10 = (Vv0.i(j12) << 14) ^ i9;
                    if (i10 >= 0) {
                        j8 = i10 ^ 16256;
                    } else {
                        long j14 = 4 + j10;
                        int i11 = i10 ^ (Vv0.i(j13) << 21);
                        if (i11 < 0) {
                            j8 = (-2080896) ^ i11;
                            j12 = j14;
                        } else {
                            j13 = 5 + j10;
                            long i12 = (Vv0.i(j14) << 28) ^ i11;
                            if (i12 >= 0) {
                                j8 = 266354560 ^ i12;
                            } else {
                                long j15 = 6 + j10;
                                long i13 = i12 ^ (Vv0.i(j13) << 35);
                                if (i13 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    long j16 = 7 + j10;
                                    long i14 = i13 ^ (Vv0.i(j15) << 42);
                                    if (i14 >= 0) {
                                        j8 = 4363953127296L ^ i14;
                                    } else {
                                        j15 = 8 + j10;
                                        i13 = i14 ^ (Vv0.i(j16) << 49);
                                        if (i13 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            j16 = 9 + j10;
                                            long i15 = (i13 ^ (Vv0.i(j15) << 56)) ^ 71499008037633920L;
                                            if (i15 < 0) {
                                                long j17 = j10 + 10;
                                                if (Vv0.i(j16) >= 0) {
                                                    j8 = i15;
                                                    j12 = j17;
                                                }
                                            } else {
                                                j8 = i15;
                                            }
                                        }
                                    }
                                    j12 = j16;
                                }
                                j8 = j9 ^ i13;
                                j12 = j15;
                            }
                        }
                    }
                    j12 = j13;
                }
                this.f25540n = j12;
                return j8;
            }
        }
        return B();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final boolean a() {
        return (((long) this.f25539m) + this.f25540n) - this.f25541o == ((long) this.f25535i);
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
        return (int) ((this.f25539m + this.f25540n) - this.f25541o);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final int j(int i8) {
        if (i8 < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i9 = i8 + i();
        int i10 = this.f25537k;
        if (i9 > i10) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f25537k = i9;
        F();
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
            this.f25538l = 0;
            return 0;
        }
        int J7 = J();
        this.f25538l = J7;
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
        if (J7 > 0) {
            long j8 = this.f25542p;
            long j9 = this.f25540n;
            long j10 = J7;
            if (j10 <= j8 - j9) {
                byte[] bArr = new byte[J7];
                Vv0.w(j9, bArr, 0L, j10);
                this.f25540n += j10;
                return new C3215ku0(bArr);
            }
        }
        if (J7 > 0 && J7 <= C()) {
            byte[] bArr2 = new byte[J7];
            E(bArr2, 0, J7);
            return new C3215ku0(bArr2);
        }
        if (J7 == 0) {
            return AbstractC3542nu0.f25048s;
        }
        if (J7 < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final String x() {
        int J7 = J();
        if (J7 > 0) {
            long j8 = this.f25542p;
            long j9 = this.f25540n;
            long j10 = J7;
            if (j10 <= j8 - j9) {
                byte[] bArr = new byte[J7];
                Vv0.w(j9, bArr, 0L, j10);
                String str = new String(bArr, AbstractC2131av0.f20782a);
                this.f25540n += j10;
                return str;
            }
        }
        if (J7 > 0 && J7 <= C()) {
            byte[] bArr2 = new byte[J7];
            E(bArr2, 0, J7);
            return new String(bArr2, AbstractC2131av0.f20782a);
        }
        if (J7 == 0) {
            return "";
        }
        if (J7 < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final String y() {
        int J7 = J();
        if (J7 > 0) {
            long j8 = this.f25542p;
            long j9 = this.f25540n;
            long j10 = J7;
            if (j10 <= j8 - j9) {
                String f8 = AbstractC2133aw0.f(this.f25534h, (int) (j9 - this.f25541o), J7);
                this.f25540n += j10;
                return f8;
            }
        }
        if (J7 >= 0 && J7 <= C()) {
            byte[] bArr = new byte[J7];
            E(bArr, 0, J7);
            return AbstractC2133aw0.g(bArr, 0, J7);
        }
        if (J7 == 0) {
            return "";
        }
        if (J7 <= 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4086su0
    public final void z(int i8) {
        if (this.f25538l != i8) {
            throw new zzgyg("Protocol message end-group tag did not match expected tag.");
        }
    }
}
