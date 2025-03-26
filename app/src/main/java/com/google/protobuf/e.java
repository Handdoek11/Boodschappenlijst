package com.google.protobuf;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.InputStream;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f33085a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33086b;

    /* renamed from: c, reason: collision with root package name */
    private int f33087c;

    /* renamed from: d, reason: collision with root package name */
    private int f33088d;

    /* renamed from: e, reason: collision with root package name */
    private int f33089e;

    /* renamed from: f, reason: collision with root package name */
    private final InputStream f33090f;

    /* renamed from: g, reason: collision with root package name */
    private int f33091g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f33092h;

    /* renamed from: i, reason: collision with root package name */
    private int f33093i;

    /* renamed from: j, reason: collision with root package name */
    private int f33094j;

    /* renamed from: k, reason: collision with root package name */
    private int f33095k;

    /* renamed from: l, reason: collision with root package name */
    private int f33096l;

    /* renamed from: m, reason: collision with root package name */
    private int f33097m;

    private e(byte[] bArr, int i8, int i9) {
        this.f33092h = false;
        this.f33094j = Integer.MAX_VALUE;
        this.f33096l = 64;
        this.f33097m = 67108864;
        this.f33085a = bArr;
        this.f33087c = i9 + i8;
        this.f33089e = i8;
        this.f33093i = -i8;
        this.f33090f = null;
        this.f33086b = false;
    }

    private void A(int i8) {
        if (!F(i8)) {
            throw InvalidProtocolBufferException.i();
        }
    }

    private void E(int i8) {
        if (i8 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i9 = this.f33093i;
        int i10 = this.f33089e;
        int i11 = i9 + i10 + i8;
        int i12 = this.f33094j;
        if (i11 > i12) {
            D((i12 - i9) - i10);
            throw InvalidProtocolBufferException.i();
        }
        int i13 = this.f33087c;
        int i14 = i13 - i10;
        this.f33089e = i13;
        A(1);
        while (true) {
            int i15 = i8 - i14;
            int i16 = this.f33087c;
            if (i15 <= i16) {
                this.f33089e = i15;
                return;
            } else {
                i14 += i16;
                this.f33089e = i16;
                A(1);
            }
        }
    }

    private boolean F(int i8) {
        int i9 = this.f33089e;
        int i10 = i9 + i8;
        int i11 = this.f33087c;
        if (i10 <= i11) {
            throw new IllegalStateException("refillBuffer() called when " + i8 + " bytes were already available in buffer");
        }
        if (this.f33093i + i9 + i8 <= this.f33094j && this.f33090f != null) {
            if (i9 > 0) {
                if (i11 > i9) {
                    byte[] bArr = this.f33085a;
                    System.arraycopy(bArr, i9, bArr, 0, i11 - i9);
                }
                this.f33093i += i9;
                this.f33087c -= i9;
                this.f33089e = 0;
            }
            InputStream inputStream = this.f33090f;
            byte[] bArr2 = this.f33085a;
            int i12 = this.f33087c;
            int read = inputStream.read(bArr2, i12, bArr2.length - i12);
            if (read == 0 || read < -1 || read > this.f33085a.length) {
                throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read > 0) {
                this.f33087c += read;
                if ((this.f33093i + i8) - this.f33097m > 0) {
                    throw InvalidProtocolBufferException.h();
                }
                z();
                if (this.f33087c >= i8) {
                    return true;
                }
                return F(i8);
            }
        }
        return false;
    }

    private void b(int i8) {
        if (this.f33087c - this.f33089e < i8) {
            A(i8);
        }
    }

    public static e e(InputStream inputStream) {
        return new e(inputStream);
    }

    public static e f(byte[] bArr, int i8, int i9) {
        e eVar = new e(bArr, i8, i9);
        try {
            eVar.h(i9);
            return eVar;
        } catch (InvalidProtocolBufferException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    private byte[] p(int i8) {
        if (i8 <= 0) {
            if (i8 == 0) {
                return h.f33101a;
            }
            throw InvalidProtocolBufferException.e();
        }
        int i9 = this.f33093i;
        int i10 = this.f33089e;
        int i11 = i9 + i10 + i8;
        int i12 = this.f33094j;
        if (i11 > i12) {
            D((i12 - i9) - i10);
            throw InvalidProtocolBufferException.i();
        }
        if (i8 < 4096) {
            byte[] bArr = new byte[i8];
            int i13 = this.f33087c - i10;
            System.arraycopy(this.f33085a, i10, bArr, 0, i13);
            this.f33089e = this.f33087c;
            int i14 = i8 - i13;
            b(i14);
            System.arraycopy(this.f33085a, 0, bArr, i13, i14);
            this.f33089e = i14;
            return bArr;
        }
        int i15 = this.f33087c;
        this.f33093i = i9 + i15;
        this.f33089e = 0;
        this.f33087c = 0;
        int i16 = i15 - i10;
        int i17 = i8 - i16;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i17 > 0) {
            int min = Math.min(i17, 4096);
            byte[] bArr2 = new byte[min];
            int i18 = 0;
            while (i18 < min) {
                InputStream inputStream = this.f33090f;
                int read = inputStream == null ? -1 : inputStream.read(bArr2, i18, min - i18);
                if (read == -1) {
                    throw InvalidProtocolBufferException.i();
                }
                this.f33093i += read;
                i18 += read;
            }
            i17 -= min;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i8];
        System.arraycopy(this.f33085a, i10, bArr3, 0, i16);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, i16, bArr4.length);
            i16 += bArr4.length;
        }
        return bArr3;
    }

    public static int t(int i8, InputStream inputStream) {
        if ((i8 & 128) == 0) {
            return i8;
        }
        int i9 = i8 & ModuleDescriptor.MODULE_VERSION;
        int i10 = 7;
        while (i10 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.i();
            }
            i9 |= (read & ModuleDescriptor.MODULE_VERSION) << i10;
            if ((read & 128) == 0) {
                return i9;
            }
            i10 += 7;
        }
        while (i10 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.i();
            }
            if ((read2 & 128) == 0) {
                return i9;
            }
            i10 += 7;
        }
        throw InvalidProtocolBufferException.d();
    }

    private void z() {
        int i8 = this.f33087c + this.f33088d;
        this.f33087c = i8;
        int i9 = this.f33093i + i8;
        int i10 = this.f33094j;
        if (i9 <= i10) {
            this.f33088d = 0;
            return;
        }
        int i11 = i9 - i10;
        this.f33088d = i11;
        this.f33087c = i8 - i11;
    }

    public boolean B(int i8, CodedOutputStream codedOutputStream) {
        int b8 = s.b(i8);
        if (b8 == 0) {
            long m8 = m();
            codedOutputStream.W(i8);
            codedOutputStream.d0(m8);
            return true;
        }
        if (b8 == 1) {
            long r8 = r();
            codedOutputStream.W(i8);
            codedOutputStream.J(r8);
            return true;
        }
        if (b8 == 2) {
            d j8 = j();
            codedOutputStream.W(i8);
            codedOutputStream.F(j8);
            return true;
        }
        if (b8 == 3) {
            codedOutputStream.W(i8);
            C(codedOutputStream);
            int c8 = s.c(s.a(i8), 4);
            a(c8);
            codedOutputStream.W(c8);
            return true;
        }
        if (b8 == 4) {
            return false;
        }
        if (b8 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        int q8 = q();
        codedOutputStream.W(i8);
        codedOutputStream.I(q8);
        return true;
    }

    public void C(CodedOutputStream codedOutputStream) {
        int x7;
        do {
            x7 = x();
            if (x7 == 0) {
                return;
            }
        } while (B(x7, codedOutputStream));
    }

    public void D(int i8) {
        int i9 = this.f33087c;
        int i10 = this.f33089e;
        if (i8 > i9 - i10 || i8 < 0) {
            E(i8);
        } else {
            this.f33089e = i10 + i8;
        }
    }

    public void a(int i8) {
        if (this.f33091g != i8) {
            throw InvalidProtocolBufferException.a();
        }
    }

    public int c() {
        int i8 = this.f33094j;
        if (i8 == Integer.MAX_VALUE) {
            return -1;
        }
        return i8 - (this.f33093i + this.f33089e);
    }

    public boolean d() {
        return this.f33089e == this.f33087c && !F(1);
    }

    public void g(int i8) {
        this.f33094j = i8;
        z();
    }

    public int h(int i8) {
        if (i8 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i9 = i8 + this.f33093i + this.f33089e;
        int i10 = this.f33094j;
        if (i9 > i10) {
            throw InvalidProtocolBufferException.i();
        }
        this.f33094j = i9;
        z();
        return i10;
    }

    public boolean i() {
        return u() != 0;
    }

    public d j() {
        int s8 = s();
        int i8 = this.f33087c;
        int i9 = this.f33089e;
        if (s8 > i8 - i9 || s8 <= 0) {
            return s8 == 0 ? d.f33078o : new k(p(s8));
        }
        d cVar = (this.f33086b && this.f33092h) ? new c(this.f33085a, this.f33089e, s8) : d.j(this.f33085a, i9, s8);
        this.f33089e += s8;
        return cVar;
    }

    public int k() {
        return s();
    }

    public int l() {
        return s();
    }

    public long m() {
        return u();
    }

    public l n(n nVar, f fVar) {
        int s8 = s();
        if (this.f33095k >= this.f33096l) {
            throw InvalidProtocolBufferException.f();
        }
        int h8 = h(s8);
        this.f33095k++;
        l lVar = (l) nVar.d(this, fVar);
        a(0);
        this.f33095k--;
        g(h8);
        return lVar;
    }

    public byte o() {
        if (this.f33089e == this.f33087c) {
            A(1);
        }
        byte[] bArr = this.f33085a;
        int i8 = this.f33089e;
        this.f33089e = i8 + 1;
        return bArr[i8];
    }

    public int q() {
        int i8 = this.f33089e;
        if (this.f33087c - i8 < 4) {
            A(4);
            i8 = this.f33089e;
        }
        byte[] bArr = this.f33085a;
        this.f33089e = i8 + 4;
        return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
    }

    public long r() {
        int i8 = this.f33089e;
        if (this.f33087c - i8 < 8) {
            A(8);
            i8 = this.f33089e;
        }
        byte[] bArr = this.f33085a;
        this.f33089e = i8 + 8;
        return ((bArr[i8 + 7] & 255) << 56) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
    }

    public int s() {
        int i8;
        int i9 = this.f33089e;
        int i10 = this.f33087c;
        if (i10 != i9) {
            byte[] bArr = this.f33085a;
            int i11 = i9 + 1;
            byte b8 = bArr[i9];
            if (b8 >= 0) {
                this.f33089e = i11;
                return b8;
            }
            if (i10 - i11 >= 9) {
                int i12 = i9 + 2;
                int i13 = (bArr[i11] << 7) ^ b8;
                long j8 = i13;
                if (j8 < 0) {
                    i8 = (int) ((-128) ^ j8);
                } else {
                    int i14 = i9 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    long j9 = i15;
                    if (j9 >= 0) {
                        i8 = (int) (16256 ^ j9);
                    } else {
                        int i16 = i9 + 4;
                        long j10 = i15 ^ (bArr[i14] << 21);
                        if (j10 < 0) {
                            i8 = (int) ((-2080896) ^ j10);
                        } else {
                            i14 = i9 + 5;
                            int i17 = (int) ((r1 ^ (r3 << 28)) ^ 266354560);
                            if (bArr[i16] < 0) {
                                i16 = i9 + 6;
                                if (bArr[i14] < 0) {
                                    i14 = i9 + 7;
                                    if (bArr[i16] < 0) {
                                        i16 = i9 + 8;
                                        if (bArr[i14] < 0) {
                                            i14 = i9 + 9;
                                            if (bArr[i16] < 0) {
                                                int i18 = i9 + 10;
                                                if (bArr[i14] >= 0) {
                                                    i12 = i18;
                                                    i8 = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                i8 = i17;
                            }
                            i8 = i17;
                        }
                        i12 = i16;
                    }
                    i12 = i14;
                }
                this.f33089e = i12;
                return i8;
            }
        }
        return (int) v();
    }

    public long u() {
        long j8;
        long j9;
        long j10;
        int i8 = this.f33089e;
        int i9 = this.f33087c;
        if (i9 != i8) {
            byte[] bArr = this.f33085a;
            int i10 = i8 + 1;
            byte b8 = bArr[i8];
            if (b8 >= 0) {
                this.f33089e = i10;
                return b8;
            }
            if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                long j11 = (bArr[i10] << 7) ^ b8;
                if (j11 >= 0) {
                    int i12 = i8 + 3;
                    long j12 = j11 ^ (bArr[i11] << 14);
                    if (j12 >= 0) {
                        j10 = 16256;
                    } else {
                        i11 = i8 + 4;
                        j11 = j12 ^ (bArr[i12] << 21);
                        if (j11 < 0) {
                            j9 = -2080896;
                        } else {
                            i12 = i8 + 5;
                            j12 = j11 ^ (bArr[i11] << 28);
                            if (j12 >= 0) {
                                j10 = 266354560;
                            } else {
                                i11 = i8 + 6;
                                j11 = j12 ^ (bArr[i12] << 35);
                                if (j11 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    i12 = i8 + 7;
                                    j12 = j11 ^ (bArr[i11] << 42);
                                    if (j12 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i11 = i8 + 8;
                                        j11 = j12 ^ (bArr[i12] << 49);
                                        if (j11 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            i12 = i8 + 9;
                                            long j13 = (j11 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                            if (j13 >= 0) {
                                                j8 = j13;
                                                i11 = i12;
                                                this.f33089e = i11;
                                                return j8;
                                            }
                                            i11 = i8 + 10;
                                            if (bArr[i12] >= 0) {
                                                j8 = j13;
                                                this.f33089e = i11;
                                                return j8;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j8 = j12 ^ j10;
                    i11 = i12;
                    this.f33089e = i11;
                    return j8;
                }
                j9 = -128;
                j8 = j11 ^ j9;
                this.f33089e = i11;
                return j8;
            }
        }
        return v();
    }

    long v() {
        long j8 = 0;
        for (int i8 = 0; i8 < 64; i8 += 7) {
            j8 |= (r3 & Byte.MAX_VALUE) << i8;
            if ((o() & 128) == 0) {
                return j8;
            }
        }
        throw InvalidProtocolBufferException.d();
    }

    public int w() {
        return q();
    }

    public int x() {
        if (d()) {
            this.f33091g = 0;
            return 0;
        }
        int s8 = s();
        this.f33091g = s8;
        if (s.a(s8) != 0) {
            return this.f33091g;
        }
        throw InvalidProtocolBufferException.b();
    }

    public int y() {
        return s();
    }

    private e(InputStream inputStream) {
        this.f33092h = false;
        this.f33094j = Integer.MAX_VALUE;
        this.f33096l = 64;
        this.f33097m = 67108864;
        this.f33085a = new byte[4096];
        this.f33087c = 0;
        this.f33089e = 0;
        this.f33093i = 0;
        this.f33090f = inputStream;
        this.f33086b = false;
    }
}
