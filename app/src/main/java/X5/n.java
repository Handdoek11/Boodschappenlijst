package X5;

import J6.AbstractC0650j;
import io.ktor.utils.io.core.internal.MalformedUTF8InputException;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public abstract class n implements Closeable {

    /* renamed from: y, reason: collision with root package name */
    public static final a f5958y = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private final Z5.g f5959o;

    /* renamed from: s, reason: collision with root package name */
    private Y5.a f5960s;

    /* renamed from: t, reason: collision with root package name */
    private ByteBuffer f5961t;

    /* renamed from: u, reason: collision with root package name */
    private int f5962u;

    /* renamed from: v, reason: collision with root package name */
    private int f5963v;

    /* renamed from: w, reason: collision with root package name */
    private long f5964w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f5965x;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public n(Y5.a aVar, long j8, Z5.g gVar) {
        J6.r.e(aVar, "head");
        J6.r.e(gVar, "pool");
        this.f5959o = gVar;
        this.f5960s = aVar;
        this.f5961t = aVar.h();
        this.f5962u = aVar.i();
        this.f5963v = aVar.k();
        this.f5964w = j8 - (r3 - this.f5962u);
    }

    private final Y5.a A(Y5.a aVar, Y5.a aVar2) {
        while (aVar != aVar2) {
            Y5.a z7 = aVar.z();
            aVar.E(this.f5959o);
            if (z7 == null) {
                F0(aVar2);
                E0(0L);
                aVar = aVar2;
            } else {
                if (z7.k() > z7.i()) {
                    F0(z7);
                    E0(this.f5964w - (z7.k() - z7.i()));
                    return z7;
                }
                aVar = z7;
            }
        }
        return u();
    }

    private final int A0(Appendable appendable, int i8, int i9) {
        ByteBuffer h8;
        int i10;
        int k8;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        Y5.a c8;
        int i16;
        int i17 = 1;
        Y5.a b8 = Y5.d.b(this, 1);
        if (b8 == null) {
            i16 = 0;
        } else {
            int i18 = 1;
            int i19 = 0;
            while (true) {
                try {
                    int k9 = b8.k() - b8.i();
                    if (k9 >= i18) {
                        try {
                            h8 = b8.h();
                            i10 = b8.i();
                            k8 = b8.k();
                            i12 = 0;
                            i13 = 0;
                            i14 = 0;
                        } catch (Throwable th) {
                            th = th;
                        }
                        for (i11 = i10; i11 < k8; i11++) {
                            byte b9 = h8.get(i11);
                            int i20 = b9 & 255;
                            i15 = -1;
                            if ((b9 & 128) == 0) {
                                if (i12 != 0) {
                                    Y5.c.i(i12);
                                    throw new KotlinNothingValueException();
                                }
                                char c9 = (char) i20;
                                if (i19 == i9) {
                                    z10 = false;
                                } else {
                                    appendable.append(c9);
                                    i19++;
                                    z10 = true;
                                }
                                if (!z10) {
                                    try {
                                        b8.c(i11 - i10);
                                        i17 = 1;
                                        break;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        i17 = 1;
                                    }
                                }
                                i17 = 1;
                                th = th2;
                                i17 = 1;
                                b8.k();
                                b8.i();
                                throw th;
                            }
                            if (i12 == 0) {
                                int i21 = 128;
                                i13 = i20;
                                for (int i22 = 1; i22 < 7 && (i13 & i21) != 0; i22++) {
                                    i13 &= ~i21;
                                    i21 >>= 1;
                                    i12++;
                                }
                                int i23 = i12 - 1;
                                if (i12 > k8 - i11) {
                                    b8.c(i11 - i10);
                                    i15 = i12;
                                    i17 = 1;
                                    break;
                                }
                                i14 = i12;
                                i12 = i23;
                                i17 = 1;
                            } else {
                                i13 = (i13 << 6) | (b9 & Byte.MAX_VALUE);
                                i12--;
                                if (i12 == 0) {
                                    if (!Y5.c.f(i13)) {
                                        if (!Y5.c.g(i13)) {
                                            i17 = 1;
                                            Y5.c.j(i13);
                                            throw new KotlinNothingValueException();
                                        }
                                        char e8 = (char) Y5.c.e(i13);
                                        if (i19 == i9) {
                                            z7 = false;
                                        } else {
                                            appendable.append(e8);
                                            i19++;
                                            z7 = true;
                                        }
                                        if (z7) {
                                            char h9 = (char) Y5.c.h(i13);
                                            if (i19 == i9) {
                                                z8 = false;
                                            } else {
                                                appendable.append(h9);
                                                i19++;
                                                z8 = true;
                                            }
                                            if (!z8) {
                                            }
                                        }
                                        i17 = 1;
                                        b8.c(((i11 - i10) - i14) + 1);
                                        break;
                                    }
                                    char c10 = (char) i13;
                                    if (i19 == i9) {
                                        z9 = false;
                                    } else {
                                        appendable.append(c10);
                                        i19++;
                                        z9 = true;
                                    }
                                    if (!z9) {
                                        b8.c(((i11 - i10) - i14) + 1);
                                        i17 = 1;
                                        break;
                                    }
                                    i17 = 1;
                                    i13 = 0;
                                } else {
                                    i17 = 1;
                                }
                            }
                        }
                        b8.c(k8 - i10);
                        i15 = 0;
                        i18 = i15 == 0 ? i17 : i15 > 0 ? i15 : 0;
                        k9 = b8.k() - b8.i();
                    }
                    if (k9 == 0) {
                        try {
                            c8 = Y5.d.c(this, b8);
                        } catch (Throwable th3) {
                            th = th3;
                            i17 = 0;
                            if (i17 != 0) {
                                Y5.d.a(this, b8);
                            }
                            throw th;
                        }
                    } else if (k9 < i18 || b8.f() - b8.g() < 8) {
                        Y5.d.a(this, b8);
                        c8 = Y5.d.b(this, i18);
                    } else {
                        c8 = b8;
                    }
                    if (c8 == null) {
                        i17 = 0;
                        break;
                    }
                    b8 = c8;
                    if (i18 <= 0) {
                        break;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            if (i17 != 0) {
                Y5.d.a(this, b8);
            }
            i16 = i19;
        }
        if (i16 >= i8) {
            return i16;
        }
        l0(i8, i16);
        throw new KotlinNothingValueException();
    }

    private final void F0(Y5.a aVar) {
        this.f5960s = aVar;
        this.f5961t = aVar.h();
        this.f5962u = aVar.i();
        this.f5963v = aVar.k();
    }

    private final void G(Y5.a aVar) {
        if (this.f5965x && aVar.B() == null) {
            this.f5962u = aVar.i();
            this.f5963v = aVar.k();
            E0(0L);
            return;
        }
        int k8 = aVar.k() - aVar.i();
        int min = Math.min(k8, 8 - (aVar.f() - aVar.g()));
        if (k8 > min) {
            I(aVar, k8, min);
        } else {
            Y5.a aVar2 = (Y5.a) this.f5959o.C();
            aVar2.p(8);
            aVar2.G(aVar.z());
            b.a(aVar2, aVar, k8);
            F0(aVar2);
        }
        aVar.E(this.f5959o);
    }

    private final void I(Y5.a aVar, int i8, int i9) {
        Y5.a aVar2 = (Y5.a) this.f5959o.C();
        Y5.a aVar3 = (Y5.a) this.f5959o.C();
        aVar2.p(8);
        aVar3.p(8);
        aVar2.G(aVar3);
        aVar3.G(aVar.z());
        b.a(aVar2, aVar, i8 - i9);
        b.a(aVar3, aVar, i9);
        F0(aVar2);
        E0(h.e(aVar3));
    }

    private final void d(Y5.a aVar) {
        if (aVar.k() - aVar.i() == 0) {
            C0(aVar);
        }
    }

    private final void e(Y5.a aVar) {
        Y5.a c8 = h.c(this.f5960s);
        if (c8 != Y5.a.f6125j.a()) {
            c8.G(aVar);
            E0(this.f5964w + h.e(aVar));
            return;
        }
        F0(aVar);
        if (this.f5964w != 0) {
            throw new IllegalStateException("It should be no tail remaining bytes if current tail is EmptyBuffer");
        }
        Y5.a B7 = aVar.B();
        E0(B7 != null ? h.e(B7) : 0L);
    }

    private final Void f(int i8) {
        throw new EOFException("at least " + i8 + " characters required but no bytes available");
    }

    private final Void h0(int i8, int i9) {
        throw new IllegalArgumentException("min should be less or equal to max but min = " + i8 + ", max = " + i9);
    }

    private final Void j0(int i8) {
        throw new IllegalStateException("minSize of " + i8 + " is too big (should be less than 8)");
    }

    private final int k(int i8, int i9) {
        while (i8 != 0) {
            Y5.a m02 = m0(1);
            if (m02 == null) {
                return i9;
            }
            int min = Math.min(m02.k() - m02.i(), i8);
            m02.c(min);
            this.f5962u += min;
            d(m02);
            i8 -= min;
            i9 += min;
        }
        return i9;
    }

    private final long l(long j8, long j9) {
        while (j8 != 0) {
            Y5.a m02 = m0(1);
            if (m02 == null) {
                return j9;
            }
            int min = (int) Math.min(m02.k() - m02.i(), j8);
            m02.c(min);
            this.f5962u += min;
            d(m02);
            long j10 = min;
            j8 -= j10;
            j9 += j10;
        }
        return j9;
    }

    private final Void l0(int i8, int i9) {
        throw new MalformedUTF8InputException("Premature end of stream: expected at least " + i8 + " chars but had only " + i9);
    }

    private final Y5.a q0(int i8, Y5.a aVar) {
        while (true) {
            int N7 = N() - X();
            if (N7 >= i8) {
                return aVar;
            }
            Y5.a B7 = aVar.B();
            if (B7 == null && (B7 = u()) == null) {
                return null;
            }
            if (N7 == 0) {
                if (aVar != Y5.a.f6125j.a()) {
                    C0(aVar);
                }
                aVar = B7;
            } else {
                int a8 = b.a(aVar, B7, i8 - N7);
                this.f5963v = aVar.k();
                E0(this.f5964w - a8);
                if (B7.k() > B7.i()) {
                    B7.q(a8);
                } else {
                    aVar.G(null);
                    aVar.G(B7.z());
                    B7.E(this.f5959o);
                }
                if (aVar.k() - aVar.i() >= i8) {
                    return aVar;
                }
                if (i8 > 8) {
                    j0(i8);
                    throw new KotlinNothingValueException();
                }
            }
        }
    }

    private final Y5.a u() {
        if (this.f5965x) {
            return null;
        }
        Y5.a D7 = D();
        if (D7 == null) {
            this.f5965x = true;
            return null;
        }
        e(D7);
        return D7;
    }

    private final int u0(Appendable appendable, int i8, int i9) {
        int i10;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10 = false;
        if (i9 == 0 && i8 == 0) {
            return 0;
        }
        if (K()) {
            if (i8 == 0) {
                return 0;
            }
            f(i8);
            throw new KotlinNothingValueException();
        }
        if (i9 < i8) {
            h0(i8, i9);
            throw new KotlinNothingValueException();
        }
        Y5.a b8 = Y5.d.b(this, 1);
        if (b8 == null) {
            i10 = 0;
        } else {
            i10 = 0;
            boolean z11 = false;
            while (true) {
                try {
                    ByteBuffer h8 = b8.h();
                    int i11 = b8.i();
                    int k8 = b8.k();
                    for (int i12 = i11; i12 < k8; i12++) {
                        byte b9 = h8.get(i12);
                        int i13 = b9 & 255;
                        if ((b9 & 128) != 128) {
                            char c8 = (char) i13;
                            if (i10 == i9) {
                                z9 = false;
                            } else {
                                appendable.append(c8);
                                i10++;
                                z9 = true;
                            }
                            if (z9) {
                            }
                        }
                        b8.c(i12 - i11);
                        z7 = false;
                        break;
                    }
                    b8.c(k8 - i11);
                    z7 = true;
                    if (z7) {
                        z8 = true;
                    } else if (i10 == i9) {
                        z8 = false;
                    } else {
                        z8 = false;
                        z11 = true;
                    }
                    if (!z8) {
                        Y5.d.a(this, b8);
                        break;
                    }
                    try {
                        b8 = Y5.d.c(this, b8);
                        if (b8 == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (z10) {
                            Y5.d.a(this, b8);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z10 = true;
                }
            }
            z10 = z11;
        }
        if (z10) {
            return i10 + A0(appendable, i8 - i10, i9 - i10);
        }
        if (i10 >= i8) {
            return i10;
        }
        l0(i8, i10);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ String z0(n nVar, int i8, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readText");
        }
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = Integer.MAX_VALUE;
        }
        return nVar.x0(i8, i9);
    }

    public final Y5.a B(Y5.a aVar) {
        J6.r.e(aVar, "current");
        return z(aVar);
    }

    public final void B0() {
        Y5.a M7 = M();
        Y5.a a8 = Y5.a.f6125j.a();
        if (M7 != a8) {
            F0(a8);
            E0(0L);
            h.d(M7, this.f5959o);
        }
    }

    public final Y5.a C0(Y5.a aVar) {
        J6.r.e(aVar, "head");
        Y5.a z7 = aVar.z();
        if (z7 == null) {
            z7 = Y5.a.f6125j.a();
        }
        F0(z7);
        E0(this.f5964w - (z7.k() - z7.i()));
        aVar.E(this.f5959o);
        return z7;
    }

    protected abstract Y5.a D();

    public final void D0(int i8) {
        this.f5962u = i8;
    }

    public final void E(Y5.a aVar) {
        J6.r.e(aVar, "current");
        Y5.a B7 = aVar.B();
        if (B7 == null) {
            G(aVar);
            return;
        }
        int k8 = aVar.k() - aVar.i();
        int min = Math.min(k8, 8 - (aVar.f() - aVar.g()));
        if (B7.j() < min) {
            G(aVar);
            return;
        }
        d.f(B7, min);
        if (k8 > min) {
            aVar.m();
            this.f5963v = aVar.k();
            E0(this.f5964w + min);
        } else {
            F0(B7);
            E0(this.f5964w - ((B7.k() - B7.i()) - min));
            aVar.z();
            aVar.E(this.f5959o);
        }
    }

    public final void E0(long j8) {
        if (j8 >= 0) {
            this.f5964w = j8;
            return;
        }
        throw new IllegalArgumentException(("tailRemaining shouldn't be negative: " + j8).toString());
    }

    public final boolean K() {
        return N() - X() == 0 && this.f5964w == 0 && (this.f5965x || u() == null);
    }

    public final Y5.a M() {
        Y5.a aVar = this.f5960s;
        aVar.d(this.f5962u);
        return aVar;
    }

    public final int N() {
        return this.f5963v;
    }

    public final ByteBuffer T() {
        return this.f5961t;
    }

    public final int X() {
        return this.f5962u;
    }

    public final Z5.g b0() {
        return this.f5959o;
    }

    public final long c0() {
        return (N() - X()) + this.f5964w;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        B0();
        if (!this.f5965x) {
            this.f5965x = true;
        }
        h();
    }

    protected final void e0() {
        if (this.f5965x) {
            return;
        }
        this.f5965x = true;
    }

    public final boolean g() {
        return (this.f5962u == this.f5963v && this.f5964w == 0) ? false : true;
    }

    protected abstract void h();

    public final int i(int i8) {
        if (i8 >= 0) {
            return k(i8, 0);
        }
        throw new IllegalArgumentException(("Negative discard is not allowed: " + i8).toString());
    }

    public final long j(long j8) {
        if (j8 <= 0) {
            return 0L;
        }
        return l(j8, 0L);
    }

    public final void m(int i8) {
        if (i(i8) == i8) {
            return;
        }
        throw new EOFException("Unable to discard " + i8 + " bytes due to end of packet");
    }

    public final Y5.a m0(int i8) {
        Y5.a M7 = M();
        return this.f5963v - this.f5962u >= i8 ? M7 : q0(i8, M7);
    }

    public final Y5.a p0(int i8) {
        return q0(i8, M());
    }

    public final String x0(int i8, int i9) {
        if (i8 == 0 && (i9 == 0 || K())) {
            return "";
        }
        long c02 = c0();
        if (c02 > 0 && i9 >= c02) {
            return r.g(this, (int) c02, null, 2, null);
        }
        StringBuilder sb = new StringBuilder(P6.m.e(P6.m.c(i8, 16), i9));
        u0(sb, i8, i9);
        String sb2 = sb.toString();
        J6.r.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final Y5.a z(Y5.a aVar) {
        J6.r.e(aVar, "current");
        return A(aVar, Y5.a.f6125j.a());
    }
}
