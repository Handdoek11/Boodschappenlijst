package com.google.protobuf;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class CodedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f33063a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33064b;

    /* renamed from: c, reason: collision with root package name */
    private int f33065c;

    /* renamed from: d, reason: collision with root package name */
    private int f33066d;

    /* renamed from: e, reason: collision with root package name */
    private final OutputStream f33067e;

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private CodedOutputStream(byte[] bArr, int i8, int i9) {
        this.f33066d = 0;
        this.f33067e = null;
        this.f33063a = bArr;
        this.f33065c = i8;
        this.f33064b = i8 + i9;
    }

    private void A() {
        OutputStream outputStream = this.f33067e;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.f33063a, 0, this.f33065c);
        this.f33065c = 0;
    }

    public static int b(int i8, boolean z7) {
        return s(i8) + c(z7);
    }

    public static int c(boolean z7) {
        return 1;
    }

    public static int d(int i8, d dVar) {
        return s(i8) + e(dVar);
    }

    public static int e(d dVar) {
        return o(dVar.size()) + dVar.size();
    }

    public static int f(int i8, int i9) {
        return s(i8) + g(i9);
    }

    public static int g(int i8) {
        return i(i8);
    }

    public static int h(int i8, int i9) {
        return s(i8) + i(i9);
    }

    public static int i(int i8) {
        if (i8 >= 0) {
            return o(i8);
        }
        return 10;
    }

    public static int j(int i8, long j8) {
        return s(i8) + k(j8);
    }

    public static int k(long j8) {
        return p(j8);
    }

    public static int l(int i8, l lVar) {
        return s(i8) + m(lVar);
    }

    public static int m(l lVar) {
        int b8 = lVar.b();
        return o(b8) + b8;
    }

    static int n(int i8) {
        if (i8 > 4096) {
            return 4096;
        }
        return i8;
    }

    public static int o(int i8) {
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

    public static int p(long j8) {
        if (((-128) & j8) == 0) {
            return 1;
        }
        if (((-16384) & j8) == 0) {
            return 2;
        }
        if (((-2097152) & j8) == 0) {
            return 3;
        }
        if (((-268435456) & j8) == 0) {
            return 4;
        }
        if (((-34359738368L) & j8) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j8) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j8) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j8) == 0) {
            return 8;
        }
        return (j8 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int q(int i8, int i9) {
        return s(i8) + r(i9);
    }

    public static int r(int i8) {
        return 4;
    }

    public static int s(int i8) {
        return o(s.c(i8, 0));
    }

    public static int t(int i8, int i9) {
        return s(i8) + u(i9);
    }

    public static int u(int i8) {
        return o(i8);
    }

    public static CodedOutputStream w(OutputStream outputStream) {
        return x(outputStream, 4096);
    }

    public static CodedOutputStream x(OutputStream outputStream, int i8) {
        return new CodedOutputStream(outputStream, new byte[i8]);
    }

    public static CodedOutputStream y(byte[] bArr) {
        return z(bArr, 0, bArr.length);
    }

    public static CodedOutputStream z(byte[] bArr, int i8, int i9) {
        return new CodedOutputStream(bArr, i8, i9);
    }

    public int B() {
        if (this.f33067e == null) {
            return this.f33064b - this.f33065c;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    public void C(int i8, boolean z7) {
        a0(i8, 0);
        D(z7);
    }

    public void D(boolean z7) {
        R(z7 ? 1 : 0);
    }

    public void E(int i8, d dVar) {
        a0(i8, 2);
        F(dVar);
    }

    public void F(d dVar) {
        W(dVar.size());
        S(dVar);
    }

    public void G(int i8, int i9) {
        a0(i8, 0);
        H(i9);
    }

    public void H(int i8) {
        L(i8);
    }

    public void I(int i8) {
        U(i8);
    }

    public void J(long j8) {
        V(j8);
    }

    public void K(int i8, int i9) {
        a0(i8, 0);
        L(i9);
    }

    public void L(int i8) {
        if (i8 >= 0) {
            W(i8);
        } else {
            X(i8);
        }
    }

    public void M(int i8, long j8) {
        a0(i8, 0);
        N(j8);
    }

    public void N(long j8) {
        X(j8);
    }

    public void O(int i8, l lVar) {
        a0(i8, 2);
        P(lVar);
    }

    public void P(l lVar) {
        W(lVar.b());
        lVar.f(this);
    }

    public void Q(byte b8) {
        if (this.f33065c == this.f33064b) {
            A();
        }
        byte[] bArr = this.f33063a;
        int i8 = this.f33065c;
        this.f33065c = i8 + 1;
        bArr[i8] = b8;
        this.f33066d++;
    }

    public void R(int i8) {
        Q((byte) i8);
    }

    public void S(d dVar) {
        T(dVar, 0, dVar.size());
    }

    public void T(d dVar, int i8, int i9) {
        int i10 = this.f33064b;
        int i11 = this.f33065c;
        if (i10 - i11 >= i9) {
            dVar.o(this.f33063a, i8, i11, i9);
            this.f33065c += i9;
            this.f33066d += i9;
            return;
        }
        int i12 = i10 - i11;
        dVar.o(this.f33063a, i8, i11, i12);
        int i13 = i8 + i12;
        int i14 = i9 - i12;
        this.f33065c = this.f33064b;
        this.f33066d += i12;
        A();
        if (i14 <= this.f33064b) {
            dVar.o(this.f33063a, i13, 0, i14);
            this.f33065c = i14;
        } else {
            dVar.L(this.f33067e, i13, i14);
        }
        this.f33066d += i14;
    }

    public void U(int i8) {
        R(i8 & 255);
        R((i8 >> 8) & 255);
        R((i8 >> 16) & 255);
        R((i8 >> 24) & 255);
    }

    public void V(long j8) {
        R(((int) j8) & 255);
        R(((int) (j8 >> 8)) & 255);
        R(((int) (j8 >> 16)) & 255);
        R(((int) (j8 >> 24)) & 255);
        R(((int) (j8 >> 32)) & 255);
        R(((int) (j8 >> 40)) & 255);
        R(((int) (j8 >> 48)) & 255);
        R(((int) (j8 >> 56)) & 255);
    }

    public void W(int i8) {
        while ((i8 & (-128)) != 0) {
            R((i8 & ModuleDescriptor.MODULE_VERSION) | 128);
            i8 >>>= 7;
        }
        R(i8);
    }

    public void X(long j8) {
        while (((-128) & j8) != 0) {
            R((((int) j8) & ModuleDescriptor.MODULE_VERSION) | 128);
            j8 >>>= 7;
        }
        R((int) j8);
    }

    public void Y(int i8, int i9) {
        a0(i8, 5);
        Z(i9);
    }

    public void Z(int i8) {
        U(i8);
    }

    public void a() {
        if (B() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void a0(int i8, int i9) {
        W(s.c(i8, i9));
    }

    public void b0(int i8, int i9) {
        a0(i8, 0);
        c0(i9);
    }

    public void c0(int i8) {
        W(i8);
    }

    public void d0(long j8) {
        X(j8);
    }

    public void v() {
        if (this.f33067e != null) {
            A();
        }
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f33066d = 0;
        this.f33067e = outputStream;
        this.f33063a = bArr;
        this.f33065c = 0;
        this.f33064b = bArr.length;
    }
}
