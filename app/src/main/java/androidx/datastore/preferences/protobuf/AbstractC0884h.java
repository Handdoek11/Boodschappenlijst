package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0884h {

    /* renamed from: a, reason: collision with root package name */
    int f9388a;

    /* renamed from: b, reason: collision with root package name */
    int f9389b;

    /* renamed from: c, reason: collision with root package name */
    int f9390c;

    /* renamed from: d, reason: collision with root package name */
    C0885i f9391d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9392e;

    /* renamed from: androidx.datastore.preferences.protobuf.h$b */
    private static final class b extends AbstractC0884h {

        /* renamed from: f, reason: collision with root package name */
        private final byte[] f9393f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f9394g;

        /* renamed from: h, reason: collision with root package name */
        private int f9395h;

        /* renamed from: i, reason: collision with root package name */
        private int f9396i;

        /* renamed from: j, reason: collision with root package name */
        private int f9397j;

        /* renamed from: k, reason: collision with root package name */
        private int f9398k;

        /* renamed from: l, reason: collision with root package name */
        private int f9399l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f9400m;

        /* renamed from: n, reason: collision with root package name */
        private int f9401n;

        private void M() {
            int i8 = this.f9395h + this.f9396i;
            this.f9395h = i8;
            int i9 = i8 - this.f9398k;
            int i10 = this.f9401n;
            if (i9 <= i10) {
                this.f9396i = 0;
                return;
            }
            int i11 = i9 - i10;
            this.f9396i = i11;
            this.f9395h = i8 - i11;
        }

        private void P() {
            if (this.f9395h - this.f9397j >= 10) {
                Q();
            } else {
                R();
            }
        }

        private void Q() {
            for (int i8 = 0; i8 < 10; i8++) {
                byte[] bArr = this.f9393f;
                int i9 = this.f9397j;
                this.f9397j = i9 + 1;
                if (bArr[i9] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void R() {
            for (int i8 = 0; i8 < 10; i8++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public String A() {
            int J7 = J();
            if (J7 > 0) {
                int i8 = this.f9395h;
                int i9 = this.f9397j;
                if (J7 <= i8 - i9) {
                    String e8 = n0.e(this.f9393f, i9, J7);
                    this.f9397j += J7;
                    return e8;
                }
            }
            if (J7 == 0) {
                return "";
            }
            if (J7 <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public int B() {
            if (e()) {
                this.f9399l = 0;
                return 0;
            }
            int J7 = J();
            this.f9399l = J7;
            if (o0.a(J7) != 0) {
                return this.f9399l;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public int C() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public long D() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public boolean E(int i8) {
            int b8 = o0.b(i8);
            if (b8 == 0) {
                P();
                return true;
            }
            if (b8 == 1) {
                O(8);
                return true;
            }
            if (b8 == 2) {
                O(J());
                return true;
            }
            if (b8 == 3) {
                N();
                a(o0.c(o0.a(i8), 4));
                return true;
            }
            if (b8 == 4) {
                return false;
            }
            if (b8 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            O(4);
            return true;
        }

        public byte F() {
            int i8 = this.f9397j;
            if (i8 == this.f9395h) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArr = this.f9393f;
            this.f9397j = i8 + 1;
            return bArr[i8];
        }

        public byte[] G(int i8) {
            if (i8 > 0) {
                int i9 = this.f9395h;
                int i10 = this.f9397j;
                if (i8 <= i9 - i10) {
                    int i11 = i8 + i10;
                    this.f9397j = i11;
                    return Arrays.copyOfRange(this.f9393f, i10, i11);
                }
            }
            if (i8 > 0) {
                throw InvalidProtocolBufferException.k();
            }
            if (i8 == 0) {
                return AbstractC0899x.f9593c;
            }
            throw InvalidProtocolBufferException.f();
        }

        public int H() {
            int i8 = this.f9397j;
            if (this.f9395h - i8 < 4) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArr = this.f9393f;
            this.f9397j = i8 + 4;
            return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
        }

        public long I() {
            int i8 = this.f9397j;
            if (this.f9395h - i8 < 8) {
                throw InvalidProtocolBufferException.k();
            }
            byte[] bArr = this.f9393f;
            this.f9397j = i8 + 8;
            return ((bArr[i8 + 7] & 255) << 56) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
        }

        public int J() {
            int i8;
            int i9 = this.f9397j;
            int i10 = this.f9395h;
            if (i10 != i9) {
                byte[] bArr = this.f9393f;
                int i11 = i9 + 1;
                byte b8 = bArr[i9];
                if (b8 >= 0) {
                    this.f9397j = i11;
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
                    this.f9397j = i12;
                    return i8;
                }
            }
            return (int) L();
        }

        public long K() {
            long j8;
            long j9;
            long j10;
            int i8 = this.f9397j;
            int i9 = this.f9395h;
            if (i9 != i8) {
                byte[] bArr = this.f9393f;
                int i10 = i8 + 1;
                byte b8 = bArr[i8];
                if (b8 >= 0) {
                    this.f9397j = i10;
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
                            i11 = i13;
                        } else {
                            int i15 = i8 + 4;
                            int i16 = i14 ^ (bArr[i13] << 21);
                            if (i16 < 0) {
                                long j11 = (-2080896) ^ i16;
                                i11 = i15;
                                j8 = j11;
                            } else {
                                long j12 = i16;
                                i11 = i8 + 5;
                                long j13 = j12 ^ (bArr[i15] << 28);
                                if (j13 >= 0) {
                                    j10 = 266354560;
                                } else {
                                    int i17 = i8 + 6;
                                    long j14 = j13 ^ (bArr[i11] << 35);
                                    if (j14 < 0) {
                                        j9 = -34093383808L;
                                    } else {
                                        i11 = i8 + 7;
                                        j13 = j14 ^ (bArr[i17] << 42);
                                        if (j13 >= 0) {
                                            j10 = 4363953127296L;
                                        } else {
                                            i17 = i8 + 8;
                                            j14 = j13 ^ (bArr[i11] << 49);
                                            if (j14 < 0) {
                                                j9 = -558586000294016L;
                                            } else {
                                                i11 = i8 + 9;
                                                long j15 = (j14 ^ (bArr[i17] << 56)) ^ 71499008037633920L;
                                                if (j15 < 0) {
                                                    int i18 = i8 + 10;
                                                    if (bArr[i11] >= 0) {
                                                        i11 = i18;
                                                    }
                                                }
                                                j8 = j15;
                                            }
                                        }
                                    }
                                    j8 = j14 ^ j9;
                                    i11 = i17;
                                }
                                j8 = j13 ^ j10;
                            }
                        }
                    }
                    this.f9397j = i11;
                    return j8;
                }
            }
            return L();
        }

        long L() {
            long j8 = 0;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                j8 |= (r3 & Byte.MAX_VALUE) << i8;
                if ((F() & 128) == 0) {
                    return j8;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public void N() {
            int B7;
            do {
                B7 = B();
                if (B7 == 0) {
                    return;
                }
            } while (E(B7));
        }

        public void O(int i8) {
            if (i8 >= 0) {
                int i9 = this.f9395h;
                int i10 = this.f9397j;
                if (i8 <= i9 - i10) {
                    this.f9397j = i10 + i8;
                    return;
                }
            }
            if (i8 >= 0) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public void a(int i8) {
            if (this.f9399l != i8) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public int d() {
            return this.f9397j - this.f9398k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public boolean e() {
            return this.f9397j == this.f9395h;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public void k(int i8) {
            this.f9401n = i8;
            M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public int l(int i8) {
            if (i8 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int d8 = i8 + d();
            int i9 = this.f9401n;
            if (d8 > i9) {
                throw InvalidProtocolBufferException.k();
            }
            this.f9401n = d8;
            M();
            return i9;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public boolean m() {
            return K() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public AbstractC0883g n() {
            int J7 = J();
            if (J7 > 0) {
                int i8 = this.f9395h;
                int i9 = this.f9397j;
                if (J7 <= i8 - i9) {
                    AbstractC0883g H7 = (this.f9394g && this.f9400m) ? AbstractC0883g.H(this.f9393f, i9, J7) : AbstractC0883g.n(this.f9393f, i9, J7);
                    this.f9397j += J7;
                    return H7;
                }
            }
            return J7 == 0 ? AbstractC0883g.f9378s : AbstractC0883g.F(G(J7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public double o() {
            return Double.longBitsToDouble(I());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public int p() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public int q() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public long r() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public float s() {
            return Float.intBitsToFloat(H());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public int t() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public long u() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public int v() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public long w() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public int x() {
            return AbstractC0884h.b(J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public long y() {
            return AbstractC0884h.c(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public String z() {
            int J7 = J();
            if (J7 > 0) {
                int i8 = this.f9395h;
                int i9 = this.f9397j;
                if (J7 <= i8 - i9) {
                    String str = new String(this.f9393f, i9, J7, AbstractC0899x.f9591a);
                    this.f9397j += J7;
                    return str;
                }
            }
            if (J7 == 0) {
                return "";
            }
            if (J7 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.k();
        }

        private b(byte[] bArr, int i8, int i9, boolean z7) {
            super();
            this.f9401n = Integer.MAX_VALUE;
            this.f9393f = bArr;
            this.f9395h = i9 + i8;
            this.f9397j = i8;
            this.f9398k = i8;
            this.f9394g = z7;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$c */
    private static final class c extends AbstractC0884h {

        /* renamed from: f, reason: collision with root package name */
        private final InputStream f9402f;

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f9403g;

        /* renamed from: h, reason: collision with root package name */
        private int f9404h;

        /* renamed from: i, reason: collision with root package name */
        private int f9405i;

        /* renamed from: j, reason: collision with root package name */
        private int f9406j;

        /* renamed from: k, reason: collision with root package name */
        private int f9407k;

        /* renamed from: l, reason: collision with root package name */
        private int f9408l;

        /* renamed from: m, reason: collision with root package name */
        private int f9409m;

        private AbstractC0883g F(int i8) {
            byte[] I7 = I(i8);
            if (I7 != null) {
                return AbstractC0883g.j(I7);
            }
            int i9 = this.f9406j;
            int i10 = this.f9404h;
            int i11 = i10 - i9;
            this.f9408l += i10;
            this.f9406j = 0;
            this.f9404h = 0;
            List<byte[]> J7 = J(i8 - i11);
            byte[] bArr = new byte[i8];
            System.arraycopy(this.f9403g, i9, bArr, 0, i11);
            for (byte[] bArr2 : J7) {
                System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                i11 += bArr2.length;
            }
            return AbstractC0883g.F(bArr);
        }

        private byte[] H(int i8, boolean z7) {
            byte[] I7 = I(i8);
            if (I7 != null) {
                return z7 ? (byte[]) I7.clone() : I7;
            }
            int i9 = this.f9406j;
            int i10 = this.f9404h;
            int i11 = i10 - i9;
            this.f9408l += i10;
            this.f9406j = 0;
            this.f9404h = 0;
            List<byte[]> J7 = J(i8 - i11);
            byte[] bArr = new byte[i8];
            System.arraycopy(this.f9403g, i9, bArr, 0, i11);
            for (byte[] bArr2 : J7) {
                System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                i11 += bArr2.length;
            }
            return bArr;
        }

        private byte[] I(int i8) {
            if (i8 == 0) {
                return AbstractC0899x.f9593c;
            }
            if (i8 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i9 = this.f9408l;
            int i10 = this.f9406j;
            int i11 = i9 + i10 + i8;
            if (i11 - this.f9390c > 0) {
                throw InvalidProtocolBufferException.j();
            }
            int i12 = this.f9409m;
            if (i11 > i12) {
                S((i12 - i9) - i10);
                throw InvalidProtocolBufferException.k();
            }
            int i13 = this.f9404h - i10;
            int i14 = i8 - i13;
            if (i14 >= 4096 && i14 > this.f9402f.available()) {
                return null;
            }
            byte[] bArr = new byte[i8];
            System.arraycopy(this.f9403g, this.f9406j, bArr, 0, i13);
            this.f9408l += this.f9404h;
            this.f9406j = 0;
            this.f9404h = 0;
            while (i13 < i8) {
                int read = this.f9402f.read(bArr, i13, i8 - i13);
                if (read == -1) {
                    throw InvalidProtocolBufferException.k();
                }
                this.f9408l += read;
                i13 += read;
            }
            return bArr;
        }

        private List J(int i8) {
            ArrayList arrayList = new ArrayList();
            while (i8 > 0) {
                int min = Math.min(i8, 4096);
                byte[] bArr = new byte[min];
                int i9 = 0;
                while (i9 < min) {
                    int read = this.f9402f.read(bArr, i9, min - i9);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.k();
                    }
                    this.f9408l += read;
                    i9 += read;
                }
                i8 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void P() {
            int i8 = this.f9404h + this.f9405i;
            this.f9404h = i8;
            int i9 = this.f9408l + i8;
            int i10 = this.f9409m;
            if (i9 <= i10) {
                this.f9405i = 0;
                return;
            }
            int i11 = i9 - i10;
            this.f9405i = i11;
            this.f9404h = i8 - i11;
        }

        private void Q(int i8) {
            if (X(i8)) {
                return;
            }
            if (i8 <= (this.f9390c - this.f9408l) - this.f9406j) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.j();
        }

        private void T(int i8) {
            if (i8 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i9 = this.f9408l;
            int i10 = this.f9406j;
            int i11 = i9 + i10 + i8;
            int i12 = this.f9409m;
            if (i11 > i12) {
                S((i12 - i9) - i10);
                throw InvalidProtocolBufferException.k();
            }
            this.f9408l = i9 + i10;
            int i13 = this.f9404h - i10;
            this.f9404h = 0;
            this.f9406j = 0;
            while (i13 < i8) {
                try {
                    long j8 = i8 - i13;
                    long skip = this.f9402f.skip(j8);
                    if (skip < 0 || skip > j8) {
                        throw new IllegalStateException(this.f9402f.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i13 += (int) skip;
                    }
                } finally {
                    this.f9408l += i13;
                    P();
                }
            }
            if (i13 >= i8) {
                return;
            }
            int i14 = this.f9404h;
            int i15 = i14 - this.f9406j;
            this.f9406j = i14;
            Q(1);
            while (true) {
                int i16 = i8 - i15;
                int i17 = this.f9404h;
                if (i16 <= i17) {
                    this.f9406j = i16;
                    return;
                } else {
                    i15 += i17;
                    this.f9406j = i17;
                    Q(1);
                }
            }
        }

        private void U() {
            if (this.f9404h - this.f9406j >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() {
            for (int i8 = 0; i8 < 10; i8++) {
                byte[] bArr = this.f9403g;
                int i9 = this.f9406j;
                this.f9406j = i9 + 1;
                if (bArr[i9] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void W() {
            for (int i8 = 0; i8 < 10; i8++) {
                if (G() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private boolean X(int i8) {
            int i9 = this.f9406j;
            int i10 = i9 + i8;
            int i11 = this.f9404h;
            if (i10 <= i11) {
                throw new IllegalStateException("refillBuffer() called when " + i8 + " bytes were already available in buffer");
            }
            int i12 = this.f9390c;
            int i13 = this.f9408l;
            if (i8 > (i12 - i13) - i9 || i13 + i9 + i8 > this.f9409m) {
                return false;
            }
            if (i9 > 0) {
                if (i11 > i9) {
                    byte[] bArr = this.f9403g;
                    System.arraycopy(bArr, i9, bArr, 0, i11 - i9);
                }
                this.f9408l += i9;
                this.f9404h -= i9;
                this.f9406j = 0;
            }
            InputStream inputStream = this.f9402f;
            byte[] bArr2 = this.f9403g;
            int i14 = this.f9404h;
            int read = inputStream.read(bArr2, i14, Math.min(bArr2.length - i14, (this.f9390c - this.f9408l) - i14));
            if (read == 0 || read < -1 || read > this.f9403g.length) {
                throw new IllegalStateException(this.f9402f.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f9404h += read;
            P();
            if (this.f9404h >= i8) {
                return true;
            }
            return X(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public String A() {
            byte[] H7;
            int M7 = M();
            int i8 = this.f9406j;
            int i9 = this.f9404h;
            if (M7 <= i9 - i8 && M7 > 0) {
                H7 = this.f9403g;
                this.f9406j = i8 + M7;
            } else {
                if (M7 == 0) {
                    return "";
                }
                i8 = 0;
                if (M7 <= i9) {
                    Q(M7);
                    H7 = this.f9403g;
                    this.f9406j = M7;
                } else {
                    H7 = H(M7, false);
                }
            }
            return n0.e(H7, i8, M7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public int B() {
            if (e()) {
                this.f9407k = 0;
                return 0;
            }
            int M7 = M();
            this.f9407k = M7;
            if (o0.a(M7) != 0) {
                return this.f9407k;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public int C() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public long D() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public boolean E(int i8) {
            int b8 = o0.b(i8);
            if (b8 == 0) {
                U();
                return true;
            }
            if (b8 == 1) {
                S(8);
                return true;
            }
            if (b8 == 2) {
                S(M());
                return true;
            }
            if (b8 == 3) {
                R();
                a(o0.c(o0.a(i8), 4));
                return true;
            }
            if (b8 == 4) {
                return false;
            }
            if (b8 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            S(4);
            return true;
        }

        public byte G() {
            if (this.f9406j == this.f9404h) {
                Q(1);
            }
            byte[] bArr = this.f9403g;
            int i8 = this.f9406j;
            this.f9406j = i8 + 1;
            return bArr[i8];
        }

        public int K() {
            int i8 = this.f9406j;
            if (this.f9404h - i8 < 4) {
                Q(4);
                i8 = this.f9406j;
            }
            byte[] bArr = this.f9403g;
            this.f9406j = i8 + 4;
            return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
        }

        public long L() {
            int i8 = this.f9406j;
            if (this.f9404h - i8 < 8) {
                Q(8);
                i8 = this.f9406j;
            }
            byte[] bArr = this.f9403g;
            this.f9406j = i8 + 8;
            return ((bArr[i8 + 7] & 255) << 56) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
        }

        public int M() {
            int i8;
            int i9 = this.f9406j;
            int i10 = this.f9404h;
            if (i10 != i9) {
                byte[] bArr = this.f9403g;
                int i11 = i9 + 1;
                byte b8 = bArr[i9];
                if (b8 >= 0) {
                    this.f9406j = i11;
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
                    this.f9406j = i12;
                    return i8;
                }
            }
            return (int) O();
        }

        public long N() {
            long j8;
            long j9;
            long j10;
            int i8 = this.f9406j;
            int i9 = this.f9404h;
            if (i9 != i8) {
                byte[] bArr = this.f9403g;
                int i10 = i8 + 1;
                byte b8 = bArr[i8];
                if (b8 >= 0) {
                    this.f9406j = i10;
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
                            i11 = i13;
                        } else {
                            int i15 = i8 + 4;
                            int i16 = i14 ^ (bArr[i13] << 21);
                            if (i16 < 0) {
                                long j11 = (-2080896) ^ i16;
                                i11 = i15;
                                j8 = j11;
                            } else {
                                long j12 = i16;
                                i11 = i8 + 5;
                                long j13 = j12 ^ (bArr[i15] << 28);
                                if (j13 >= 0) {
                                    j10 = 266354560;
                                } else {
                                    int i17 = i8 + 6;
                                    long j14 = j13 ^ (bArr[i11] << 35);
                                    if (j14 < 0) {
                                        j9 = -34093383808L;
                                    } else {
                                        i11 = i8 + 7;
                                        j13 = j14 ^ (bArr[i17] << 42);
                                        if (j13 >= 0) {
                                            j10 = 4363953127296L;
                                        } else {
                                            i17 = i8 + 8;
                                            j14 = j13 ^ (bArr[i11] << 49);
                                            if (j14 < 0) {
                                                j9 = -558586000294016L;
                                            } else {
                                                i11 = i8 + 9;
                                                long j15 = (j14 ^ (bArr[i17] << 56)) ^ 71499008037633920L;
                                                if (j15 < 0) {
                                                    int i18 = i8 + 10;
                                                    if (bArr[i11] >= 0) {
                                                        i11 = i18;
                                                    }
                                                }
                                                j8 = j15;
                                            }
                                        }
                                    }
                                    j8 = j14 ^ j9;
                                    i11 = i17;
                                }
                                j8 = j13 ^ j10;
                            }
                        }
                    }
                    this.f9406j = i11;
                    return j8;
                }
            }
            return O();
        }

        long O() {
            long j8 = 0;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                j8 |= (r3 & Byte.MAX_VALUE) << i8;
                if ((G() & 128) == 0) {
                    return j8;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public void R() {
            int B7;
            do {
                B7 = B();
                if (B7 == 0) {
                    return;
                }
            } while (E(B7));
        }

        public void S(int i8) {
            int i9 = this.f9404h;
            int i10 = this.f9406j;
            if (i8 > i9 - i10 || i8 < 0) {
                T(i8);
            } else {
                this.f9406j = i10 + i8;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public void a(int i8) {
            if (this.f9407k != i8) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public int d() {
            return this.f9408l + this.f9406j;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public boolean e() {
            return this.f9406j == this.f9404h && !X(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public void k(int i8) {
            this.f9409m = i8;
            P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public int l(int i8) {
            if (i8 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i9 = i8 + this.f9408l + this.f9406j;
            int i10 = this.f9409m;
            if (i9 > i10) {
                throw InvalidProtocolBufferException.k();
            }
            this.f9409m = i9;
            P();
            return i10;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public boolean m() {
            return N() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public AbstractC0883g n() {
            int M7 = M();
            int i8 = this.f9404h;
            int i9 = this.f9406j;
            if (M7 > i8 - i9 || M7 <= 0) {
                return M7 == 0 ? AbstractC0883g.f9378s : F(M7);
            }
            AbstractC0883g n8 = AbstractC0883g.n(this.f9403g, i9, M7);
            this.f9406j += M7;
            return n8;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public double o() {
            return Double.longBitsToDouble(L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public int p() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public int q() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public long r() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public float s() {
            return Float.intBitsToFloat(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public int t() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public long u() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public int v() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public long w() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public int x() {
            return AbstractC0884h.b(M());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public long y() {
            return AbstractC0884h.c(N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0884h
        public String z() {
            int M7 = M();
            if (M7 > 0) {
                int i8 = this.f9404h;
                int i9 = this.f9406j;
                if (M7 <= i8 - i9) {
                    String str = new String(this.f9403g, i9, M7, AbstractC0899x.f9591a);
                    this.f9406j += M7;
                    return str;
                }
            }
            if (M7 == 0) {
                return "";
            }
            if (M7 > this.f9404h) {
                return new String(H(M7, false), AbstractC0899x.f9591a);
            }
            Q(M7);
            String str2 = new String(this.f9403g, this.f9406j, M7, AbstractC0899x.f9591a);
            this.f9406j += M7;
            return str2;
        }

        private c(InputStream inputStream, int i8) {
            super();
            this.f9409m = Integer.MAX_VALUE;
            AbstractC0899x.b(inputStream, "input");
            this.f9402f = inputStream;
            this.f9403g = new byte[i8];
            this.f9404h = 0;
            this.f9406j = 0;
            this.f9408l = 0;
        }
    }

    public static int b(int i8) {
        return (-(i8 & 1)) ^ (i8 >>> 1);
    }

    public static long c(long j8) {
        return (-(j8 & 1)) ^ (j8 >>> 1);
    }

    public static AbstractC0884h f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static AbstractC0884h g(InputStream inputStream, int i8) {
        if (i8 > 0) {
            return inputStream == null ? h(AbstractC0899x.f9593c) : new c(inputStream, i8);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC0884h h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static AbstractC0884h i(byte[] bArr, int i8, int i9) {
        return j(bArr, i8, i9, false);
    }

    static AbstractC0884h j(byte[] bArr, int i8, int i9, boolean z7) {
        b bVar = new b(bArr, i8, i9, z7);
        try {
            bVar.l(i9);
            return bVar;
        } catch (InvalidProtocolBufferException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i8);

    public abstract void a(int i8);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i8);

    public abstract int l(int i8);

    public abstract boolean m();

    public abstract AbstractC0883g n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();

    private AbstractC0884h() {
        this.f9389b = 100;
        this.f9390c = Integer.MAX_VALUE;
        this.f9392e = false;
    }
}
