package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.rH0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3915rH0 {

    /* renamed from: a, reason: collision with root package name */
    private final UQ f26146a = new UQ(32);

    /* renamed from: b, reason: collision with root package name */
    private C3807qH0 f26147b;

    /* renamed from: c, reason: collision with root package name */
    private C3807qH0 f26148c;

    /* renamed from: d, reason: collision with root package name */
    private C3807qH0 f26149d;

    /* renamed from: e, reason: collision with root package name */
    private long f26150e;

    /* renamed from: f, reason: collision with root package name */
    private final RI0 f26151f;

    public C3915rH0(RI0 ri0) {
        this.f26151f = ri0;
        C3807qH0 c3807qH0 = new C3807qH0(0L, 65536);
        this.f26147b = c3807qH0;
        this.f26148c = c3807qH0;
        this.f26149d = c3807qH0;
    }

    private final int i(int i8) {
        C3807qH0 c3807qH0 = this.f26149d;
        if (c3807qH0.f25889c == null) {
            KI0 b8 = this.f26151f.b();
            C3807qH0 c3807qH02 = new C3807qH0(this.f26149d.f25888b, 65536);
            c3807qH0.f25889c = b8;
            c3807qH0.f25890d = c3807qH02;
        }
        return Math.min(i8, (int) (this.f26149d.f25888b - this.f26150e));
    }

    private static C3807qH0 j(C3807qH0 c3807qH0, long j8) {
        while (j8 >= c3807qH0.f25888b) {
            c3807qH0 = c3807qH0.f25890d;
        }
        return c3807qH0;
    }

    private static C3807qH0 k(C3807qH0 c3807qH0, long j8, ByteBuffer byteBuffer, int i8) {
        C3807qH0 j9 = j(c3807qH0, j8);
        while (i8 > 0) {
            int min = Math.min(i8, (int) (j9.f25888b - j8));
            byteBuffer.put(j9.f25889c.f16571a, j9.b(j8), min);
            i8 -= min;
            j8 += min;
            if (j8 == j9.f25888b) {
                j9 = j9.f25890d;
            }
        }
        return j9;
    }

    private static C3807qH0 l(C3807qH0 c3807qH0, long j8, byte[] bArr, int i8) {
        C3807qH0 j9 = j(c3807qH0, j8);
        int i9 = i8;
        while (i9 > 0) {
            int min = Math.min(i9, (int) (j9.f25888b - j8));
            System.arraycopy(j9.f25889c.f16571a, j9.b(j8), bArr, i8 - i9, min);
            i9 -= min;
            j8 += min;
            if (j8 == j9.f25888b) {
                j9 = j9.f25890d;
            }
        }
        return j9;
    }

    private static C3807qH0 m(C3807qH0 c3807qH0, C4530wy0 c4530wy0, C4133tH0 c4133tH0, UQ uq) {
        C3807qH0 c3807qH02;
        int i8;
        if (c4530wy0.l()) {
            long j8 = c4133tH0.f26865b;
            uq.i(1);
            C3807qH0 l8 = l(c3807qH0, j8, uq.n(), 1);
            long j9 = j8 + 1;
            byte b8 = uq.n()[0];
            int i9 = b8 & 128;
            int i10 = b8 & Byte.MAX_VALUE;
            Lx0 lx0 = c4530wy0.f27694c;
            byte[] bArr = lx0.f17172a;
            if (bArr == null) {
                lx0.f17172a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z7 = i9 != 0;
            c3807qH02 = l(l8, j9, lx0.f17172a, i10);
            long j10 = j9 + i10;
            if (z7) {
                uq.i(2);
                c3807qH02 = l(c3807qH02, j10, uq.n(), 2);
                j10 += 2;
                i8 = uq.G();
            } else {
                i8 = 1;
            }
            int[] iArr = lx0.f17175d;
            if (iArr == null || iArr.length < i8) {
                iArr = new int[i8];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = lx0.f17176e;
            if (iArr3 == null || iArr3.length < i8) {
                iArr3 = new int[i8];
            }
            int[] iArr4 = iArr3;
            if (z7) {
                int i11 = i8 * 6;
                uq.i(i11);
                c3807qH02 = l(c3807qH02, j10, uq.n(), i11);
                j10 += i11;
                uq.l(0);
                for (int i12 = 0; i12 < i8; i12++) {
                    iArr2[i12] = uq.G();
                    iArr4[i12] = uq.F();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = c4133tH0.f26864a - ((int) (j10 - c4133tH0.f26865b));
            }
            X0 x02 = c4133tH0.f26866c;
            int i13 = AbstractC2301cW.f21206a;
            lx0.c(i8, iArr2, iArr4, x02.f19932b, lx0.f17172a, x02.f19931a, x02.f19933c, x02.f19934d);
            long j11 = c4133tH0.f26865b;
            int i14 = (int) (j10 - j11);
            c4133tH0.f26865b = j11 + i14;
            c4133tH0.f26864a -= i14;
        } else {
            c3807qH02 = c3807qH0;
        }
        if (!c4530wy0.e()) {
            c4530wy0.j(c4133tH0.f26864a);
            return k(c3807qH02, c4133tH0.f26865b, c4530wy0.f27695d, c4133tH0.f26864a);
        }
        uq.i(4);
        C3807qH0 l9 = l(c3807qH02, c4133tH0.f26865b, uq.n(), 4);
        int F7 = uq.F();
        c4133tH0.f26865b += 4;
        c4133tH0.f26864a -= 4;
        c4530wy0.j(F7);
        C3807qH0 k8 = k(l9, c4133tH0.f26865b, c4530wy0.f27695d, F7);
        c4133tH0.f26865b += F7;
        int i15 = c4133tH0.f26864a - F7;
        c4133tH0.f26864a = i15;
        ByteBuffer byteBuffer = c4530wy0.f27698g;
        if (byteBuffer == null || byteBuffer.capacity() < i15) {
            c4530wy0.f27698g = ByteBuffer.allocate(i15);
        } else {
            c4530wy0.f27698g.clear();
        }
        return k(k8, c4133tH0.f26865b, c4530wy0.f27698g, c4133tH0.f26864a);
    }

    private final void n(int i8) {
        long j8 = this.f26150e + i8;
        this.f26150e = j8;
        C3807qH0 c3807qH0 = this.f26149d;
        if (j8 == c3807qH0.f25888b) {
            this.f26149d = c3807qH0.f25890d;
        }
    }

    public final int a(InterfaceC3684pA0 interfaceC3684pA0, int i8, boolean z7) {
        int i9 = i(i8);
        C3807qH0 c3807qH0 = this.f26149d;
        int C7 = interfaceC3684pA0.C(c3807qH0.f25889c.f16571a, c3807qH0.b(this.f26150e), i9);
        if (C7 != -1) {
            n(C7);
            return C7;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    public final long b() {
        return this.f26150e;
    }

    public final void c(long j8) {
        C3807qH0 c3807qH0;
        if (j8 != -1) {
            while (true) {
                c3807qH0 = this.f26147b;
                if (j8 < c3807qH0.f25888b) {
                    break;
                }
                this.f26151f.c(c3807qH0.f25889c);
                this.f26147b = this.f26147b.c();
            }
            if (this.f26148c.f25887a < c3807qH0.f25887a) {
                this.f26148c = c3807qH0;
            }
        }
    }

    public final void d(C4530wy0 c4530wy0, C4133tH0 c4133tH0) {
        m(this.f26148c, c4530wy0, c4133tH0, this.f26146a);
    }

    public final void e(C4530wy0 c4530wy0, C4133tH0 c4133tH0) {
        this.f26148c = m(this.f26148c, c4530wy0, c4133tH0, this.f26146a);
    }

    public final void f() {
        C3807qH0 c3807qH0 = this.f26147b;
        if (c3807qH0.f25889c != null) {
            this.f26151f.d(c3807qH0);
            c3807qH0.c();
        }
        this.f26147b.e(0L, 65536);
        C3807qH0 c3807qH02 = this.f26147b;
        this.f26148c = c3807qH02;
        this.f26149d = c3807qH02;
        this.f26150e = 0L;
        this.f26151f.g();
    }

    public final void g() {
        this.f26148c = this.f26147b;
    }

    public final void h(UQ uq, int i8) {
        while (i8 > 0) {
            int i9 = i(i8);
            C3807qH0 c3807qH0 = this.f26149d;
            uq.h(c3807qH0.f25889c.f16571a, c3807qH0.b(this.f26150e), i9);
            i8 -= i9;
            n(i9);
        }
    }
}
