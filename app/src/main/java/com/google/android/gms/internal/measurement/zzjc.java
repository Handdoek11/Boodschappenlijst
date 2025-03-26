package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzjc extends L3 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f29669b = Logger.getLogger(zzjc.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f29670c = B5.w();

    /* renamed from: a, reason: collision with root package name */
    C4892d4 f29671a;

    private static class a extends zzjc {

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f29672d;

        /* renamed from: e, reason: collision with root package name */
        private final int f29673e;

        /* renamed from: f, reason: collision with root package name */
        private int f29674f;

        a(byte[] bArr, int i8, int i9) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i9) | i9) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i9)));
            }
            this.f29672d = bArr;
            this.f29674f = 0;
            this.f29673e = i9;
        }

        private final void A0(byte[] bArr, int i8, int i9) {
            try {
                System.arraycopy(bArr, i8, this.f29672d, this.f29674f, i9);
                this.f29674f += i9;
            } catch (IndexOutOfBoundsException e8) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29674f), Integer.valueOf(this.f29673e), Integer.valueOf(i9)), e8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void H(int i8) {
            if (i8 >= 0) {
                U(i8);
            } else {
                N(i8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void K(int i8, int i9) {
            V(i8, 0);
            H(i9);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void L(int i8, long j8) {
            V(i8, 0);
            N(j8);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void M(int i8, K3 k32) {
            V(1, 3);
            b0(2, i8);
            n(3, k32);
            V(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void N(long j8) {
            if (zzjc.f29670c && b() >= 10) {
                while ((j8 & (-128)) != 0) {
                    byte[] bArr = this.f29672d;
                    int i8 = this.f29674f;
                    this.f29674f = i8 + 1;
                    B5.m(bArr, i8, (byte) (((int) j8) | 128));
                    j8 >>>= 7;
                }
                byte[] bArr2 = this.f29672d;
                int i9 = this.f29674f;
                this.f29674f = 1 + i9;
                B5.m(bArr2, i9, (byte) j8);
                return;
            }
            while ((j8 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f29672d;
                    int i10 = this.f29674f;
                    this.f29674f = i10 + 1;
                    bArr3[i10] = (byte) (((int) j8) | 128);
                    j8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29674f), Integer.valueOf(this.f29673e), 1), e8);
                }
            }
            byte[] bArr4 = this.f29672d;
            int i11 = this.f29674f;
            this.f29674f = i11 + 1;
            bArr4[i11] = (byte) j8;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void U(int i8) {
            while ((i8 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f29672d;
                    int i9 = this.f29674f;
                    this.f29674f = i9 + 1;
                    bArr[i9] = (byte) (i8 | 128);
                    i8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29674f), Integer.valueOf(this.f29673e), 1), e8);
                }
            }
            byte[] bArr2 = this.f29672d;
            int i10 = this.f29674f;
            this.f29674f = i10 + 1;
            bArr2[i10] = (byte) i8;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void V(int i8, int i9) {
            U((i8 << 3) | i9);
        }

        @Override // com.google.android.gms.internal.measurement.L3
        public final void a(byte[] bArr, int i8, int i9) {
            A0(bArr, i8, i9);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final int b() {
            return this.f29673e - this.f29674f;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void b0(int i8, int i9) {
            V(i8, 0);
            U(i9);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void j(byte b8) {
            int i8;
            int i9 = this.f29674f;
            try {
                i8 = i9 + 1;
            } catch (IndexOutOfBoundsException e8) {
                e = e8;
            }
            try {
                this.f29672d[i9] = b8;
                this.f29674f = i8;
            } catch (IndexOutOfBoundsException e9) {
                e = e9;
                i9 = i8;
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(i9), Integer.valueOf(this.f29673e), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void k(int i8) {
            try {
                byte[] bArr = this.f29672d;
                int i9 = this.f29674f;
                int i10 = i9 + 1;
                this.f29674f = i10;
                bArr[i9] = (byte) i8;
                int i11 = i9 + 2;
                this.f29674f = i11;
                bArr[i10] = (byte) (i8 >> 8);
                int i12 = i9 + 3;
                this.f29674f = i12;
                bArr[i11] = (byte) (i8 >> 16);
                this.f29674f = i9 + 4;
                bArr[i12] = (byte) (i8 >>> 24);
            } catch (IndexOutOfBoundsException e8) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29674f), Integer.valueOf(this.f29673e), 1), e8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void l(int i8, int i9) {
            V(i8, 5);
            k(i9);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void m(int i8, long j8) {
            V(i8, 1);
            s(j8);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void n(int i8, K3 k32) {
            V(i8, 2);
            t(k32);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void o(int i8, W4 w42) {
            V(1, 3);
            b0(2, i8);
            V(3, 2);
            u(w42);
            V(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        final void p(int i8, W4 w42, InterfaceC4964l5 interfaceC4964l5) {
            V(i8, 2);
            U(((C3) w42).d(interfaceC4964l5));
            interfaceC4964l5.d(w42, this.f29671a);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void q(int i8, String str) {
            V(i8, 2);
            v(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void r(int i8, boolean z7) {
            V(i8, 0);
            j(z7 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void s(long j8) {
            try {
                byte[] bArr = this.f29672d;
                int i8 = this.f29674f;
                int i9 = i8 + 1;
                this.f29674f = i9;
                bArr[i8] = (byte) j8;
                int i10 = i8 + 2;
                this.f29674f = i10;
                bArr[i9] = (byte) (j8 >> 8);
                int i11 = i8 + 3;
                this.f29674f = i11;
                bArr[i10] = (byte) (j8 >> 16);
                int i12 = i8 + 4;
                this.f29674f = i12;
                bArr[i11] = (byte) (j8 >> 24);
                int i13 = i8 + 5;
                this.f29674f = i13;
                bArr[i12] = (byte) (j8 >> 32);
                int i14 = i8 + 6;
                this.f29674f = i14;
                bArr[i13] = (byte) (j8 >> 40);
                int i15 = i8 + 7;
                this.f29674f = i15;
                bArr[i14] = (byte) (j8 >> 48);
                this.f29674f = i8 + 8;
                bArr[i15] = (byte) (j8 >> 56);
            } catch (IndexOutOfBoundsException e8) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29674f), Integer.valueOf(this.f29673e), 1), e8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void t(K3 k32) {
            U(k32.s());
            k32.q(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void u(W4 w42) {
            U(w42.h());
            w42.b(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void v(String str) {
            int i8 = this.f29674f;
            try {
                int v02 = zzjc.v0(str.length() * 3);
                int v03 = zzjc.v0(str.length());
                if (v03 != v02) {
                    U(F5.a(str));
                    this.f29674f = F5.b(str, this.f29672d, this.f29674f, b());
                    return;
                }
                int i9 = i8 + v03;
                this.f29674f = i9;
                int b8 = F5.b(str, this.f29672d, i9, b());
                this.f29674f = i8;
                U((b8 - i8) - v03);
                this.f29674f = b8;
            } catch (J5 e8) {
                this.f29674f = i8;
                w(str, e8);
            } catch (IndexOutOfBoundsException e9) {
                throw new zzb(e9);
            }
        }
    }

    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        zzb(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    public static int A(K3 k32) {
        int s8 = k32.s();
        return v0(s8) + s8;
    }

    public static int B(W4 w42) {
        return w42.h();
    }

    public static int C(String str) {
        int length;
        try {
            length = F5.a(str);
        } catch (J5 unused) {
            length = str.getBytes(AbstractC5026t4.f29579a).length;
        }
        return v0(length) + length;
    }

    public static zzjc D(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int P(int i8, long j8) {
        return v0(i8 << 3) + 8;
    }

    public static int Q(int i8, K3 k32) {
        int v02 = v0(i8 << 3);
        int s8 = k32.s();
        return v02 + v0(s8) + s8;
    }

    static int R(int i8, W4 w42, InterfaceC4964l5 interfaceC4964l5) {
        return v0(i8 << 3) + g(w42, interfaceC4964l5);
    }

    public static int S(long j8) {
        return 8;
    }

    public static int T(W4 w42) {
        int h8 = w42.h();
        return v0(h8) + h8;
    }

    public static int X(int i8) {
        return n0(i8);
    }

    public static int Y(int i8, long j8) {
        return v0(i8 << 3) + n0(j8);
    }

    public static int Z(int i8, K3 k32) {
        return (v0(8) << 1) + w0(2, i8) + Q(3, k32);
    }

    public static int a0(long j8) {
        return n0(j8);
    }

    public static int c(double d8) {
        return 8;
    }

    public static int c0(int i8) {
        return 4;
    }

    public static int d(float f8) {
        return 4;
    }

    public static int d0(int i8, int i9) {
        return v0(i8 << 3) + n0(i9);
    }

    public static int e(int i8, double d8) {
        return v0(i8 << 3) + 8;
    }

    public static int e0(int i8, long j8) {
        return v0(i8 << 3) + 8;
    }

    public static int f(int i8, float f8) {
        return v0(i8 << 3) + 4;
    }

    public static int f0(long j8) {
        return 8;
    }

    static int g(W4 w42, InterfaceC4964l5 interfaceC4964l5) {
        int d8 = ((C3) w42).d(interfaceC4964l5);
        return v0(d8) + d8;
    }

    public static int g0(int i8) {
        return n0(i8);
    }

    public static int h(boolean z7) {
        return 1;
    }

    public static int h0(int i8, int i9) {
        return v0(i8 << 3) + 4;
    }

    public static int i(byte[] bArr) {
        int length = bArr.length;
        return v0(length) + length;
    }

    public static int i0(int i8, long j8) {
        return v0(i8 << 3) + n0(u0(j8));
    }

    public static int j0(long j8) {
        return n0(u0(j8));
    }

    public static int k0(int i8) {
        return 4;
    }

    public static int l0(int i8, int i9) {
        return v0(i8 << 3) + n0(i9);
    }

    public static int m0(int i8, long j8) {
        return v0(i8 << 3) + n0(j8);
    }

    public static int n0(long j8) {
        return (640 - (Long.numberOfLeadingZeros(j8) * 9)) >>> 6;
    }

    public static int o0(int i8) {
        return v0(z0(i8));
    }

    public static int p0(int i8, int i9) {
        return v0(i8 << 3) + 4;
    }

    public static int s0(int i8) {
        return v0(i8 << 3);
    }

    public static int t0(int i8, int i9) {
        return v0(i8 << 3) + v0(z0(i9));
    }

    private static long u0(long j8) {
        return (j8 >> 63) ^ (j8 << 1);
    }

    public static int v0(int i8) {
        return (352 - (Integer.numberOfLeadingZeros(i8) * 9)) >>> 6;
    }

    public static int w0(int i8, int i9) {
        return v0(i8 << 3) + v0(i9);
    }

    static int x(int i8, W4 w42, InterfaceC4964l5 interfaceC4964l5) {
        return (v0(i8 << 3) << 1) + ((C3) w42).d(interfaceC4964l5);
    }

    public static int y(int i8, String str) {
        return v0(i8 << 3) + C(str);
    }

    public static int z(int i8, boolean z7) {
        return v0(i8 << 3) + 1;
    }

    private static int z0(int i8) {
        return (i8 >> 31) ^ (i8 << 1);
    }

    public final void E() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void F(double d8) {
        s(Double.doubleToRawLongBits(d8));
    }

    public final void G(float f8) {
        k(Float.floatToRawIntBits(f8));
    }

    public abstract void H(int i8);

    public final void I(int i8, double d8) {
        m(i8, Double.doubleToRawLongBits(d8));
    }

    public final void J(int i8, float f8) {
        l(i8, Float.floatToRawIntBits(f8));
    }

    public abstract void K(int i8, int i9);

    public abstract void L(int i8, long j8);

    public abstract void M(int i8, K3 k32);

    public abstract void N(long j8);

    public final void O(boolean z7) {
        j(z7 ? (byte) 1 : (byte) 0);
    }

    public abstract void U(int i8);

    public abstract void V(int i8, int i9);

    public abstract int b();

    public abstract void b0(int i8, int i9);

    public abstract void j(byte b8);

    public abstract void k(int i8);

    public abstract void l(int i8, int i9);

    public abstract void m(int i8, long j8);

    public abstract void n(int i8, K3 k32);

    public abstract void o(int i8, W4 w42);

    abstract void p(int i8, W4 w42, InterfaceC4964l5 interfaceC4964l5);

    public abstract void q(int i8, String str);

    public final void q0(int i8, long j8) {
        L(i8, u0(j8));
    }

    public abstract void r(int i8, boolean z7);

    public final void r0(long j8) {
        N(u0(j8));
    }

    public abstract void s(long j8);

    public abstract void t(K3 k32);

    public abstract void u(W4 w42);

    public abstract void v(String str);

    final void w(String str, J5 j52) {
        f29669b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) j52);
        byte[] bytes = str.getBytes(AbstractC5026t4.f29579a);
        try {
            U(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzb(e8);
        }
    }

    public final void x0(int i8) {
        U(z0(i8));
    }

    public final void y0(int i8, int i9) {
        b0(i8, z0(i9));
    }

    private zzjc() {
    }
}
