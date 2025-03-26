package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.n0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class CodedOutputStream extends AbstractC0882f {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f9286c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f9287d = m0.C();

    /* renamed from: a, reason: collision with root package name */
    C0886j f9288a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9289b;

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private static abstract class b extends CodedOutputStream {

        /* renamed from: e, reason: collision with root package name */
        final byte[] f9290e;

        /* renamed from: f, reason: collision with root package name */
        final int f9291f;

        /* renamed from: g, reason: collision with root package name */
        int f9292g;

        /* renamed from: h, reason: collision with root package name */
        int f9293h;

        b(int i8) {
            super();
            if (i8 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i8, 20)];
            this.f9290e = bArr;
            this.f9291f = bArr.length;
        }

        final void S0(byte b8) {
            byte[] bArr = this.f9290e;
            int i8 = this.f9292g;
            this.f9292g = i8 + 1;
            bArr[i8] = b8;
            this.f9293h++;
        }

        final void T0(int i8) {
            byte[] bArr = this.f9290e;
            int i9 = this.f9292g;
            int i10 = i9 + 1;
            this.f9292g = i10;
            bArr[i9] = (byte) (i8 & 255);
            int i11 = i9 + 2;
            this.f9292g = i11;
            bArr[i10] = (byte) ((i8 >> 8) & 255);
            int i12 = i9 + 3;
            this.f9292g = i12;
            bArr[i11] = (byte) ((i8 >> 16) & 255);
            this.f9292g = i9 + 4;
            bArr[i12] = (byte) ((i8 >> 24) & 255);
            this.f9293h += 4;
        }

        final void U0(long j8) {
            byte[] bArr = this.f9290e;
            int i8 = this.f9292g;
            int i9 = i8 + 1;
            this.f9292g = i9;
            bArr[i8] = (byte) (j8 & 255);
            int i10 = i8 + 2;
            this.f9292g = i10;
            bArr[i9] = (byte) ((j8 >> 8) & 255);
            int i11 = i8 + 3;
            this.f9292g = i11;
            bArr[i10] = (byte) ((j8 >> 16) & 255);
            int i12 = i8 + 4;
            this.f9292g = i12;
            bArr[i11] = (byte) (255 & (j8 >> 24));
            int i13 = i8 + 5;
            this.f9292g = i13;
            bArr[i12] = (byte) (((int) (j8 >> 32)) & 255);
            int i14 = i8 + 6;
            this.f9292g = i14;
            bArr[i13] = (byte) (((int) (j8 >> 40)) & 255);
            int i15 = i8 + 7;
            this.f9292g = i15;
            bArr[i14] = (byte) (((int) (j8 >> 48)) & 255);
            this.f9292g = i8 + 8;
            bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
            this.f9293h += 8;
        }

        final void V0(int i8) {
            if (i8 >= 0) {
                X0(i8);
            } else {
                Y0(i8);
            }
        }

        final void W0(int i8, int i9) {
            X0(o0.c(i8, i9));
        }

        final void X0(int i8) {
            if (!CodedOutputStream.f9287d) {
                while ((i8 & (-128)) != 0) {
                    byte[] bArr = this.f9290e;
                    int i9 = this.f9292g;
                    this.f9292g = i9 + 1;
                    bArr[i9] = (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128);
                    this.f9293h++;
                    i8 >>>= 7;
                }
                byte[] bArr2 = this.f9290e;
                int i10 = this.f9292g;
                this.f9292g = i10 + 1;
                bArr2[i10] = (byte) i8;
                this.f9293h++;
                return;
            }
            long j8 = this.f9292g;
            while ((i8 & (-128)) != 0) {
                byte[] bArr3 = this.f9290e;
                int i11 = this.f9292g;
                this.f9292g = i11 + 1;
                m0.H(bArr3, i11, (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128));
                i8 >>>= 7;
            }
            byte[] bArr4 = this.f9290e;
            int i12 = this.f9292g;
            this.f9292g = i12 + 1;
            m0.H(bArr4, i12, (byte) i8);
            this.f9293h += (int) (this.f9292g - j8);
        }

        final void Y0(long j8) {
            if (!CodedOutputStream.f9287d) {
                while ((j8 & (-128)) != 0) {
                    byte[] bArr = this.f9290e;
                    int i8 = this.f9292g;
                    this.f9292g = i8 + 1;
                    bArr[i8] = (byte) ((((int) j8) & ModuleDescriptor.MODULE_VERSION) | 128);
                    this.f9293h++;
                    j8 >>>= 7;
                }
                byte[] bArr2 = this.f9290e;
                int i9 = this.f9292g;
                this.f9292g = i9 + 1;
                bArr2[i9] = (byte) j8;
                this.f9293h++;
                return;
            }
            long j9 = this.f9292g;
            while ((j8 & (-128)) != 0) {
                byte[] bArr3 = this.f9290e;
                int i10 = this.f9292g;
                this.f9292g = i10 + 1;
                m0.H(bArr3, i10, (byte) ((((int) j8) & ModuleDescriptor.MODULE_VERSION) | 128));
                j8 >>>= 7;
            }
            byte[] bArr4 = this.f9290e;
            int i11 = this.f9292g;
            this.f9292g = i11 + 1;
            m0.H(bArr4, i11, (byte) j8);
            this.f9293h += (int) (this.f9292g - j9);
        }
    }

    private static final class c extends b {

        /* renamed from: i, reason: collision with root package name */
        private final OutputStream f9294i;

        c(OutputStream outputStream, int i8) {
            super(i8);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f9294i = outputStream;
        }

        private void Z0() {
            this.f9294i.write(this.f9290e, 0, this.f9292g);
            this.f9292g = 0;
        }

        private void a1(int i8) {
            if (this.f9291f - this.f9292g < i8) {
                Z0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void A0(M m8) {
            P0(m8.b());
            m8.h(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void B0(int i8, M m8) {
            N0(1, 3);
            O0(2, i8);
            c1(3, m8);
            N0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void C0(int i8, AbstractC0883g abstractC0883g) {
            N0(1, 3);
            O0(2, i8);
            f0(3, abstractC0883g);
            N0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void L0(int i8, String str) {
            N0(i8, 2);
            M0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void M0(String str) {
            int g8;
            try {
                int length = str.length() * 3;
                int R7 = CodedOutputStream.R(length);
                int i8 = R7 + length;
                int i9 = this.f9291f;
                if (i8 > i9) {
                    byte[] bArr = new byte[length];
                    int f8 = n0.f(str, bArr, 0, length);
                    P0(f8);
                    a(bArr, 0, f8);
                    return;
                }
                if (i8 > i9 - this.f9292g) {
                    Z0();
                }
                int R8 = CodedOutputStream.R(str.length());
                int i10 = this.f9292g;
                try {
                    if (R8 == R7) {
                        int i11 = i10 + R8;
                        this.f9292g = i11;
                        int f9 = n0.f(str, this.f9290e, i11, this.f9291f - i11);
                        this.f9292g = i10;
                        g8 = (f9 - i10) - R8;
                        X0(g8);
                        this.f9292g = f9;
                    } else {
                        g8 = n0.g(str);
                        X0(g8);
                        this.f9292g = n0.f(str, this.f9290e, this.f9292g, g8);
                    }
                    this.f9293h += g8;
                } catch (n0.d e8) {
                    this.f9293h -= this.f9292g - i10;
                    this.f9292g = i10;
                    throw e8;
                } catch (ArrayIndexOutOfBoundsException e9) {
                    throw new OutOfSpaceException(e9);
                }
            } catch (n0.d e10) {
                X(str, e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void N0(int i8, int i9) {
            P0(o0.c(i8, i9));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void O0(int i8, int i9) {
            a1(20);
            W0(i8, 0);
            X0(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void P0(int i8) {
            a1(5);
            X0(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Q0(int i8, long j8) {
            a1(20);
            W0(i8, 0);
            Y0(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void R0(long j8) {
            a1(10);
            Y0(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void W() {
            if (this.f9292g > 0) {
                Z0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.AbstractC0882f
        public void a(byte[] bArr, int i8, int i9) {
            b1(bArr, i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void a0(byte b8) {
            if (this.f9292g == this.f9291f) {
                Z0();
            }
            S0(b8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void b0(int i8, boolean z7) {
            a1(11);
            W0(i8, 0);
            S0(z7 ? (byte) 1 : (byte) 0);
        }

        public void b1(byte[] bArr, int i8, int i9) {
            int i10 = this.f9291f;
            int i11 = this.f9292g;
            if (i10 - i11 >= i9) {
                System.arraycopy(bArr, i8, this.f9290e, i11, i9);
                this.f9292g += i9;
                this.f9293h += i9;
                return;
            }
            int i12 = i10 - i11;
            System.arraycopy(bArr, i8, this.f9290e, i11, i12);
            int i13 = i8 + i12;
            int i14 = i9 - i12;
            this.f9292g = this.f9291f;
            this.f9293h += i12;
            Z0();
            if (i14 <= this.f9291f) {
                System.arraycopy(bArr, i13, this.f9290e, 0, i14);
                this.f9292g = i14;
            } else {
                this.f9294i.write(bArr, i13, i14);
            }
            this.f9293h += i14;
        }

        public void c1(int i8, M m8) {
            N0(i8, 2);
            A0(m8);
        }

        void d1(M m8, c0 c0Var) {
            P0(((AbstractC0877a) m8).e(c0Var));
            c0Var.e(m8, this.f9288a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void e0(byte[] bArr, int i8, int i9) {
            P0(i9);
            b1(bArr, i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void f0(int i8, AbstractC0883g abstractC0883g) {
            N0(i8, 2);
            g0(abstractC0883g);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void g0(AbstractC0883g abstractC0883g) {
            P0(abstractC0883g.size());
            abstractC0883g.I(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void l0(int i8, int i9) {
            a1(14);
            W0(i8, 5);
            T0(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void m0(int i8) {
            a1(4);
            T0(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void n0(int i8, long j8) {
            a1(18);
            W0(i8, 1);
            U0(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void o0(long j8) {
            a1(8);
            U0(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void v0(int i8, int i9) {
            a1(20);
            W0(i8, 0);
            V0(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void w0(int i8) {
            if (i8 >= 0) {
                P0(i8);
            } else {
                R0(i8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void z0(int i8, M m8, c0 c0Var) {
            N0(i8, 2);
            d1(m8, c0Var);
        }
    }

    public static int A(M m8) {
        return y(m8.b());
    }

    static int B(M m8, c0 c0Var) {
        return y(((AbstractC0877a) m8).e(c0Var));
    }

    static int C(int i8) {
        if (i8 > 4096) {
            return 4096;
        }
        return i8;
    }

    public static int D(int i8, AbstractC0883g abstractC0883g) {
        return (P(1) * 2) + Q(2, i8) + f(3, abstractC0883g);
    }

    public static int E(int i8) {
        return R(i8);
    }

    public static int F(int i8, int i9) {
        return P(i8) + G(i9);
    }

    public static int G(int i8) {
        return 4;
    }

    public static int H(int i8, long j8) {
        return P(i8) + I(j8);
    }

    public static int I(long j8) {
        return 8;
    }

    public static int J(int i8, int i9) {
        return P(i8) + K(i9);
    }

    public static int K(int i8) {
        return R(U(i8));
    }

    public static int L(int i8, long j8) {
        return P(i8) + M(j8);
    }

    public static int M(long j8) {
        return T(V(j8));
    }

    public static int N(int i8, String str) {
        return P(i8) + O(str);
    }

    public static int O(String str) {
        int length;
        try {
            length = n0.g(str);
        } catch (n0.d unused) {
            length = str.getBytes(AbstractC0899x.f9591a).length;
        }
        return y(length);
    }

    public static int P(int i8) {
        return R(o0.c(i8, 0));
    }

    public static int Q(int i8, int i9) {
        return P(i8) + R(i9);
    }

    public static int R(int i8) {
        if ((i8 & (-128)) == 0) {
            return 1;
        }
        if ((i8 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i8) == 0) {
            return 3;
        }
        return (i8 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int S(int i8, long j8) {
        return P(i8) + T(j8);
    }

    public static int T(long j8) {
        int i8;
        if (((-128) & j8) == 0) {
            return 1;
        }
        if (j8 < 0) {
            return 10;
        }
        if (((-34359738368L) & j8) != 0) {
            j8 >>>= 28;
            i8 = 6;
        } else {
            i8 = 2;
        }
        if (((-2097152) & j8) != 0) {
            i8 += 2;
            j8 >>>= 14;
        }
        return (j8 & (-16384)) != 0 ? i8 + 1 : i8;
    }

    public static int U(int i8) {
        return (i8 >> 31) ^ (i8 << 1);
    }

    public static long V(long j8) {
        return (j8 >> 63) ^ (j8 << 1);
    }

    public static CodedOutputStream Z(OutputStream outputStream, int i8) {
        return new c(outputStream, i8);
    }

    public static int c(int i8, boolean z7) {
        return P(i8) + d(z7);
    }

    public static int d(boolean z7) {
        return 1;
    }

    public static int e(byte[] bArr) {
        return y(bArr.length);
    }

    public static int f(int i8, AbstractC0883g abstractC0883g) {
        return P(i8) + g(abstractC0883g);
    }

    public static int g(AbstractC0883g abstractC0883g) {
        return y(abstractC0883g.size());
    }

    public static int h(int i8, double d8) {
        return P(i8) + i(d8);
    }

    public static int i(double d8) {
        return 8;
    }

    public static int j(int i8, int i9) {
        return P(i8) + k(i9);
    }

    public static int k(int i8) {
        return v(i8);
    }

    public static int l(int i8, int i9) {
        return P(i8) + m(i9);
    }

    public static int m(int i8) {
        return 4;
    }

    public static int n(int i8, long j8) {
        return P(i8) + o(j8);
    }

    public static int o(long j8) {
        return 8;
    }

    public static int p(int i8, float f8) {
        return P(i8) + q(f8);
    }

    public static int q(float f8) {
        return 4;
    }

    static int r(int i8, M m8, c0 c0Var) {
        return (P(i8) * 2) + t(m8, c0Var);
    }

    public static int s(M m8) {
        return m8.b();
    }

    static int t(M m8, c0 c0Var) {
        return ((AbstractC0877a) m8).e(c0Var);
    }

    public static int u(int i8, int i9) {
        return P(i8) + v(i9);
    }

    public static int v(int i8) {
        if (i8 >= 0) {
            return R(i8);
        }
        return 10;
    }

    public static int w(int i8, long j8) {
        return P(i8) + x(j8);
    }

    public static int x(long j8) {
        return T(j8);
    }

    static int y(int i8) {
        return R(i8) + i8;
    }

    static int z(int i8, M m8, c0 c0Var) {
        return P(i8) + B(m8, c0Var);
    }

    public abstract void A0(M m8);

    public abstract void B0(int i8, M m8);

    public abstract void C0(int i8, AbstractC0883g abstractC0883g);

    public final void D0(int i8, int i9) {
        l0(i8, i9);
    }

    public final void E0(int i8) {
        m0(i8);
    }

    public final void F0(int i8, long j8) {
        n0(i8, j8);
    }

    public final void G0(long j8) {
        o0(j8);
    }

    public final void H0(int i8, int i9) {
        O0(i8, U(i9));
    }

    public final void I0(int i8) {
        P0(U(i8));
    }

    public final void J0(int i8, long j8) {
        Q0(i8, V(j8));
    }

    public final void K0(long j8) {
        R0(V(j8));
    }

    public abstract void L0(int i8, String str);

    public abstract void M0(String str);

    public abstract void N0(int i8, int i9);

    public abstract void O0(int i8, int i9);

    public abstract void P0(int i8);

    public abstract void Q0(int i8, long j8);

    public abstract void R0(long j8);

    public abstract void W();

    final void X(String str, n0.d dVar) {
        f9286c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC0899x.f9591a);
        try {
            P0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e8) {
            throw e8;
        } catch (IndexOutOfBoundsException e9) {
            throw new OutOfSpaceException(e9);
        }
    }

    boolean Y() {
        return this.f9289b;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0882f
    public abstract void a(byte[] bArr, int i8, int i9);

    public abstract void a0(byte b8);

    public abstract void b0(int i8, boolean z7);

    public final void c0(boolean z7) {
        a0(z7 ? (byte) 1 : (byte) 0);
    }

    public final void d0(byte[] bArr) {
        e0(bArr, 0, bArr.length);
    }

    abstract void e0(byte[] bArr, int i8, int i9);

    public abstract void f0(int i8, AbstractC0883g abstractC0883g);

    public abstract void g0(AbstractC0883g abstractC0883g);

    public final void h0(int i8, double d8) {
        n0(i8, Double.doubleToRawLongBits(d8));
    }

    public final void i0(double d8) {
        o0(Double.doubleToRawLongBits(d8));
    }

    public final void j0(int i8, int i9) {
        v0(i8, i9);
    }

    public final void k0(int i8) {
        w0(i8);
    }

    public abstract void l0(int i8, int i9);

    public abstract void m0(int i8);

    public abstract void n0(int i8, long j8);

    public abstract void o0(long j8);

    public final void p0(int i8, float f8) {
        l0(i8, Float.floatToRawIntBits(f8));
    }

    public final void q0(float f8) {
        m0(Float.floatToRawIntBits(f8));
    }

    public final void r0(int i8, M m8) {
        N0(i8, 3);
        t0(m8);
        N0(i8, 4);
    }

    final void s0(int i8, M m8, c0 c0Var) {
        N0(i8, 3);
        u0(m8, c0Var);
        N0(i8, 4);
    }

    public final void t0(M m8) {
        m8.h(this);
    }

    final void u0(M m8, c0 c0Var) {
        c0Var.e(m8, this.f9288a);
    }

    public abstract void v0(int i8, int i9);

    public abstract void w0(int i8);

    public final void x0(int i8, long j8) {
        Q0(i8, j8);
    }

    public final void y0(long j8) {
        R0(j8);
    }

    abstract void z0(int i8, M m8, c0 c0Var);

    private CodedOutputStream() {
    }
}
