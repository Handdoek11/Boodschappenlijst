package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import java.io.IOException;
import java.io.InputStream;
import s5.C6734A;
import s5.C6741g;
import s5.C6745k;
import s5.C6749o;
import s5.C6752s;
import s5.C6754u;
import s5.C6757x;
import s5.D;
import s5.I;
import s5.T;
import s5.V;
import s5.Z;
import s5.e0;
import s5.g0;
import s5.k0;
import s5.m0;
import s5.q0;
import s5.u0;

/* loaded from: classes2.dex */
public final class n0 extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: S, reason: collision with root package name */
    private static final n0 f43367S;

    /* renamed from: T, reason: collision with root package name */
    public static com.google.protobuf.n f43368T = new a();

    /* renamed from: A, reason: collision with root package name */
    private C6734A f43369A;

    /* renamed from: B, reason: collision with root package name */
    private I f43370B;

    /* renamed from: C, reason: collision with root package name */
    private C6757x f43371C;

    /* renamed from: D, reason: collision with root package name */
    private C6754u f43372D;

    /* renamed from: E, reason: collision with root package name */
    private C6749o f43373E;

    /* renamed from: F, reason: collision with root package name */
    private u0 f43374F;

    /* renamed from: G, reason: collision with root package name */
    private C6741g f43375G;

    /* renamed from: H, reason: collision with root package name */
    private m0 f43376H;

    /* renamed from: I, reason: collision with root package name */
    private q0 f43377I;

    /* renamed from: J, reason: collision with root package name */
    private T f43378J;

    /* renamed from: K, reason: collision with root package name */
    private C6745k f43379K;

    /* renamed from: L, reason: collision with root package name */
    private V f43380L;

    /* renamed from: M, reason: collision with root package name */
    private C6752s f43381M;

    /* renamed from: N, reason: collision with root package name */
    private k0 f43382N;

    /* renamed from: O, reason: collision with root package name */
    private D f43383O;

    /* renamed from: P, reason: collision with root package name */
    private e0 f43384P;

    /* renamed from: Q, reason: collision with root package name */
    private int f43385Q;

    /* renamed from: R, reason: collision with root package name */
    private int f43386R;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43387s;

    /* renamed from: t, reason: collision with root package name */
    private int f43388t;

    /* renamed from: u, reason: collision with root package name */
    private o0 f43389u;

    /* renamed from: v, reason: collision with root package name */
    private int f43390v;

    /* renamed from: w, reason: collision with root package name */
    private i0 f43391w;

    /* renamed from: x, reason: collision with root package name */
    private int f43392x;

    /* renamed from: y, reason: collision with root package name */
    private Z f43393y;

    /* renamed from: z, reason: collision with root package name */
    private g0 f43394z;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public n0 d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new n0(eVar, fVar);
        }
    }

    static {
        n0 n0Var = new n0(true);
        f43367S = n0Var;
        n0Var.L();
    }

    private void L() {
        this.f43389u = o0.RS_UNKNOWN_ERROR;
        this.f43390v = 0;
        this.f43391w = i0.NONE;
        this.f43392x = 0;
        this.f43393y = Z.l();
        this.f43394z = g0.n();
        this.f43369A = C6734A.l();
        this.f43370B = I.u();
        this.f43371C = C6757x.l();
        this.f43372D = C6754u.J();
        this.f43373E = C6749o.p();
        this.f43374F = u0.j();
        this.f43375G = C6741g.o();
        this.f43376H = m0.j();
        this.f43377I = q0.v();
        this.f43378J = T.j();
        this.f43379K = C6745k.r();
        this.f43380L = V.m();
        this.f43381M = C6752s.n();
        this.f43382N = k0.m();
        this.f43383O = D.j();
        this.f43384P = e0.o();
    }

    public static n0 M(InputStream inputStream) {
        return (n0) f43368T.b(inputStream);
    }

    public boolean A() {
        return (this.f43388t & 262144) == 262144;
    }

    public boolean B() {
        return (this.f43388t & 512) == 512;
    }

    public boolean C() {
        return (this.f43388t & 64) == 64;
    }

    public boolean D() {
        return (this.f43388t & 256) == 256;
    }

    public boolean E() {
        return (this.f43388t & 128) == 128;
    }

    public boolean F() {
        return (this.f43388t & 131072) == 131072;
    }

    public boolean G() {
        return (this.f43388t & 16) == 16;
    }

    public boolean H() {
        return (this.f43388t & 32) == 32;
    }

    public boolean I() {
        return (this.f43388t & 524288) == 524288;
    }

    public boolean J() {
        return (this.f43388t & 16384) == 16384;
    }

    public boolean K() {
        return (this.f43388t & 1) == 1;
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43386R;
        if (i8 != -1) {
            return i8;
        }
        int f8 = (this.f43388t & 1) == 1 ? CodedOutputStream.f(1, this.f43389u.e()) : 0;
        if ((this.f43388t & 2) == 2) {
            f8 += CodedOutputStream.h(2, this.f43390v);
        }
        if ((this.f43388t & 4) == 4) {
            f8 += CodedOutputStream.f(3, this.f43391w.e());
        }
        if ((this.f43388t & 16) == 16) {
            f8 += CodedOutputStream.l(4, this.f43393y);
        }
        if ((this.f43388t & 32) == 32) {
            f8 += CodedOutputStream.l(5, this.f43394z);
        }
        if ((this.f43388t & 64) == 64) {
            f8 += CodedOutputStream.l(6, this.f43369A);
        }
        if ((this.f43388t & 128) == 128) {
            f8 += CodedOutputStream.l(7, this.f43370B);
        }
        if ((this.f43388t & 256) == 256) {
            f8 += CodedOutputStream.l(8, this.f43371C);
        }
        if ((this.f43388t & 512) == 512) {
            f8 += CodedOutputStream.l(9, this.f43372D);
        }
        if ((this.f43388t & 1024) == 1024) {
            f8 += CodedOutputStream.l(10, this.f43373E);
        }
        if ((this.f43388t & 2048) == 2048) {
            f8 += CodedOutputStream.l(11, this.f43374F);
        }
        if ((this.f43388t & 4096) == 4096) {
            f8 += CodedOutputStream.l(12, this.f43375G);
        }
        if ((this.f43388t & 8192) == 8192) {
            f8 += CodedOutputStream.l(13, this.f43376H);
        }
        if ((this.f43388t & 16384) == 16384) {
            f8 += CodedOutputStream.l(14, this.f43377I);
        }
        if ((this.f43388t & 32768) == 32768) {
            f8 += CodedOutputStream.l(15, this.f43378J);
        }
        if ((this.f43388t & 65536) == 65536) {
            f8 += CodedOutputStream.l(16, this.f43379K);
        }
        if ((this.f43388t & 131072) == 131072) {
            f8 += CodedOutputStream.l(17, this.f43380L);
        }
        if ((this.f43388t & 8) == 8) {
            f8 += CodedOutputStream.q(18, this.f43392x);
        }
        if ((this.f43388t & 262144) == 262144) {
            f8 += CodedOutputStream.l(19, this.f43381M);
        }
        if ((this.f43388t & 524288) == 524288) {
            f8 += CodedOutputStream.l(20, this.f43382N);
        }
        if ((this.f43388t & 1048576) == 1048576) {
            f8 += CodedOutputStream.l(21, this.f43383O);
        }
        if ((this.f43388t & 2097152) == 2097152) {
            f8 += CodedOutputStream.l(22, this.f43384P);
        }
        int size = f8 + this.f43387s.size();
        this.f43386R = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43385Q;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        if (!K()) {
            this.f43385Q = 0;
            return false;
        }
        if (G() && !r().c()) {
            this.f43385Q = 0;
            return false;
        }
        if (H() && !s().c()) {
            this.f43385Q = 0;
            return false;
        }
        if (C() && !n().c()) {
            this.f43385Q = 0;
            return false;
        }
        if (E() && !p().c()) {
            this.f43385Q = 0;
            return false;
        }
        if (D() && !o().c()) {
            this.f43385Q = 0;
            return false;
        }
        if (y() && !j().c()) {
            this.f43385Q = 0;
            return false;
        }
        if (!F() || q().c()) {
            this.f43385Q = 1;
            return true;
        }
        this.f43385Q = 0;
        return false;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43388t & 1) == 1) {
            codedOutputStream.G(1, this.f43389u.e());
        }
        if ((this.f43388t & 2) == 2) {
            codedOutputStream.K(2, this.f43390v);
        }
        if ((this.f43388t & 4) == 4) {
            codedOutputStream.G(3, this.f43391w.e());
        }
        if ((this.f43388t & 16) == 16) {
            codedOutputStream.O(4, this.f43393y);
        }
        if ((this.f43388t & 32) == 32) {
            codedOutputStream.O(5, this.f43394z);
        }
        if ((this.f43388t & 64) == 64) {
            codedOutputStream.O(6, this.f43369A);
        }
        if ((this.f43388t & 128) == 128) {
            codedOutputStream.O(7, this.f43370B);
        }
        if ((this.f43388t & 256) == 256) {
            codedOutputStream.O(8, this.f43371C);
        }
        if ((this.f43388t & 512) == 512) {
            codedOutputStream.O(9, this.f43372D);
        }
        if ((this.f43388t & 1024) == 1024) {
            codedOutputStream.O(10, this.f43373E);
        }
        if ((this.f43388t & 2048) == 2048) {
            codedOutputStream.O(11, this.f43374F);
        }
        if ((this.f43388t & 4096) == 4096) {
            codedOutputStream.O(12, this.f43375G);
        }
        if ((this.f43388t & 8192) == 8192) {
            codedOutputStream.O(13, this.f43376H);
        }
        if ((this.f43388t & 16384) == 16384) {
            codedOutputStream.O(14, this.f43377I);
        }
        if ((this.f43388t & 32768) == 32768) {
            codedOutputStream.O(15, this.f43378J);
        }
        if ((this.f43388t & 65536) == 65536) {
            codedOutputStream.O(16, this.f43379K);
        }
        if ((this.f43388t & 131072) == 131072) {
            codedOutputStream.O(17, this.f43380L);
        }
        if ((this.f43388t & 8) == 8) {
            codedOutputStream.Y(18, this.f43392x);
        }
        if ((this.f43388t & 262144) == 262144) {
            codedOutputStream.O(19, this.f43381M);
        }
        if ((this.f43388t & 524288) == 524288) {
            codedOutputStream.O(20, this.f43382N);
        }
        if ((this.f43388t & 1048576) == 1048576) {
            codedOutputStream.O(21, this.f43383O);
        }
        if ((this.f43388t & 2097152) == 2097152) {
            codedOutputStream.O(22, this.f43384P);
        }
        codedOutputStream.S(this.f43387s);
    }

    public C6741g i() {
        return this.f43375G;
    }

    public C6745k j() {
        return this.f43379K;
    }

    public C6749o k() {
        return this.f43373E;
    }

    public C6752s l() {
        return this.f43381M;
    }

    public C6754u m() {
        return this.f43372D;
    }

    public C6734A n() {
        return this.f43369A;
    }

    public C6757x o() {
        return this.f43371C;
    }

    public I p() {
        return this.f43370B;
    }

    public V q() {
        return this.f43380L;
    }

    public Z r() {
        return this.f43393y;
    }

    public g0 s() {
        return this.f43394z;
    }

    public i0 t() {
        return this.f43391w;
    }

    public k0 u() {
        return this.f43382N;
    }

    public q0 v() {
        return this.f43377I;
    }

    public o0 w() {
        return this.f43389u;
    }

    public boolean x() {
        return (this.f43388t & 4096) == 4096;
    }

    public boolean y() {
        return (this.f43388t & 65536) == 65536;
    }

    public boolean z() {
        return (this.f43388t & 1024) == 1024;
    }

    private n0(boolean z7) {
        this.f43385Q = -1;
        this.f43386R = -1;
        this.f43387s = com.google.protobuf.d.f33078o;
    }

    private n0(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43385Q = -1;
        this.f43386R = -1;
        L();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    switch (x7) {
                        case 0:
                            z7 = true;
                        case 8:
                            int k8 = eVar.k();
                            o0 c8 = o0.c(k8);
                            if (c8 == null) {
                                w7.W(x7);
                                w7.W(k8);
                            } else {
                                this.f43388t |= 1;
                                this.f43389u = c8;
                            }
                        case 16:
                            this.f43388t |= 2;
                            this.f43390v = eVar.l();
                        case 24:
                            int k9 = eVar.k();
                            i0 c9 = i0.c(k9);
                            if (c9 == null) {
                                w7.W(x7);
                                w7.W(k9);
                            } else {
                                this.f43388t |= 4;
                                this.f43391w = c9;
                            }
                        case 34:
                            Z.b r8 = (this.f43388t & 16) == 16 ? this.f43393y.r() : null;
                            Z z8 = (Z) eVar.n(Z.f43043x, fVar);
                            this.f43393y = z8;
                            if (r8 != null) {
                                r8.u(z8);
                                this.f43393y = r8.m();
                            }
                            this.f43388t |= 16;
                        case 42:
                            g0.b x8 = (this.f43388t & 32) == 32 ? this.f43394z.x() : null;
                            g0 g0Var = (g0) eVar.n(g0.f43161A, fVar);
                            this.f43394z = g0Var;
                            if (x8 != null) {
                                x8.s(g0Var);
                                this.f43394z = x8.m();
                            }
                            this.f43388t |= 32;
                        case 50:
                            C6734A.b r9 = (this.f43388t & 64) == 64 ? this.f43369A.r() : null;
                            C6734A c6734a = (C6734A) eVar.n(C6734A.f42745y, fVar);
                            this.f43369A = c6734a;
                            if (r9 != null) {
                                r9.s(c6734a);
                                this.f43369A = r9.m();
                            }
                            this.f43388t |= 64;
                        case 58:
                            I.b I7 = (this.f43388t & 128) == 128 ? this.f43370B.I() : null;
                            I i8 = (I) eVar.n(I.f42821D, fVar);
                            this.f43370B = i8;
                            if (I7 != null) {
                                I7.v(i8);
                                this.f43370B = I7.m();
                            }
                            this.f43388t |= 128;
                        case 66:
                            C6757x.b s8 = (this.f43388t & 256) == 256 ? this.f43371C.s() : null;
                            C6757x c6757x = (C6757x) eVar.n(C6757x.f43643x, fVar);
                            this.f43371C = c6757x;
                            if (s8 != null) {
                                s8.u(c6757x);
                                this.f43371C = s8.m();
                            }
                            this.f43388t |= 256;
                        case 74:
                            C6754u.b g02 = (this.f43388t & 512) == 512 ? this.f43372D.g0() : null;
                            C6754u c6754u = (C6754u) eVar.n(C6754u.f43580M, fVar);
                            this.f43372D = c6754u;
                            if (g02 != null) {
                                g02.C(c6754u);
                                this.f43372D = g02.m();
                            }
                            this.f43388t |= 512;
                        case 82:
                            C6749o.b x9 = (this.f43388t & 1024) == 1024 ? this.f43373E.x() : null;
                            C6749o c6749o = (C6749o) eVar.n(C6749o.f43396z, fVar);
                            this.f43373E = c6749o;
                            if (x9 != null) {
                                x9.s(c6749o);
                                this.f43373E = x9.m();
                            }
                            this.f43388t |= 1024;
                        case 90:
                            u0.b n8 = (this.f43388t & 2048) == 2048 ? this.f43374F.n() : null;
                            u0 u0Var = (u0) eVar.n(u0.f43617w, fVar);
                            this.f43374F = u0Var;
                            if (n8 != null) {
                                n8.s(u0Var);
                                this.f43374F = n8.m();
                            }
                            this.f43388t |= 2048;
                        case 98:
                            C6741g.b x10 = (this.f43388t & 4096) == 4096 ? this.f43375G.x() : null;
                            C6741g c6741g = (C6741g) eVar.n(C6741g.f43148A, fVar);
                            this.f43375G = c6741g;
                            if (x10 != null) {
                                x10.s(c6741g);
                                this.f43375G = x10.m();
                            }
                            this.f43388t |= 4096;
                        case 106:
                            m0.b n9 = (this.f43388t & 8192) == 8192 ? this.f43376H.n() : null;
                            m0 m0Var = (m0) eVar.n(m0.f43352w, fVar);
                            this.f43376H = m0Var;
                            if (n9 != null) {
                                n9.s(m0Var);
                                this.f43376H = n9.m();
                            }
                            this.f43388t |= 8192;
                        case 114:
                            q0.b L7 = (this.f43388t & 16384) == 16384 ? this.f43377I.L() : null;
                            q0 q0Var = (q0) eVar.n(q0.f43464D, fVar);
                            this.f43377I = q0Var;
                            if (L7 != null) {
                                L7.x(q0Var);
                                this.f43377I = L7.m();
                            }
                            this.f43388t |= 16384;
                        case 122:
                            T.b n10 = (this.f43388t & 32768) == 32768 ? this.f43378J.n() : null;
                            T t8 = (T) eVar.n(T.f42997w, fVar);
                            this.f43378J = t8;
                            if (n10 != null) {
                                n10.s(t8);
                                this.f43378J = n10.m();
                            }
                            this.f43388t |= 32768;
                        case 130:
                            C6745k.b G7 = (this.f43388t & 65536) == 65536 ? this.f43379K.G() : null;
                            C6745k c6745k = (C6745k) eVar.n(C6745k.f43302D, fVar);
                            this.f43379K = c6745k;
                            if (G7 != null) {
                                G7.s(c6745k);
                                this.f43379K = G7.m();
                            }
                            this.f43388t |= 65536;
                        case 138:
                            V.b t9 = (this.f43388t & 131072) == 131072 ? this.f43380L.t() : null;
                            V v7 = (V) eVar.n(V.f43011y, fVar);
                            this.f43380L = v7;
                            if (t9 != null) {
                                t9.s(v7);
                                this.f43380L = t9.m();
                            }
                            this.f43388t |= 131072;
                        case 149:
                            this.f43388t |= 8;
                            this.f43392x = eVar.w();
                        case 154:
                            C6752s.b u7 = (this.f43388t & 262144) == 262144 ? this.f43381M.u() : null;
                            C6752s c6752s = (C6752s) eVar.n(C6752s.f43499z, fVar);
                            this.f43381M = c6752s;
                            if (u7 != null) {
                                u7.s(c6752s);
                                this.f43381M = u7.m();
                            }
                            this.f43388t |= 262144;
                        case 162:
                            k0.b t10 = (this.f43388t & 524288) == 524288 ? this.f43382N.t() : null;
                            k0 k0Var = (k0) eVar.n(k0.f43321y, fVar);
                            this.f43382N = k0Var;
                            if (t10 != null) {
                                t10.s(k0Var);
                                this.f43382N = t10.m();
                            }
                            this.f43388t |= 524288;
                        case 170:
                            D.b n11 = (this.f43388t & 1048576) == 1048576 ? this.f43383O.n() : null;
                            D d8 = (D) eVar.n(D.f42776w, fVar);
                            this.f43383O = d8;
                            if (n11 != null) {
                                n11.s(d8);
                                this.f43383O = n11.m();
                            }
                            this.f43388t |= 1048576;
                        case 178:
                            e0.b w8 = (this.f43388t & 2097152) == 2097152 ? this.f43384P.w() : null;
                            e0 e0Var = (e0) eVar.n(e0.f43108z, fVar);
                            this.f43384P = e0Var;
                            if (w8 != null) {
                                w8.s(e0Var);
                                this.f43384P = w8.m();
                            }
                            this.f43388t |= 2097152;
                        default:
                            if (!h(eVar, w7, fVar, x7)) {
                                z7 = true;
                            }
                    }
                } catch (InvalidProtocolBufferException e8) {
                    throw e8.g(this);
                } catch (IOException e9) {
                    throw new InvalidProtocolBufferException(e9.getMessage()).g(this);
                }
            } catch (Throwable th) {
                try {
                    w7.v();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f43387s = t7.h();
                    throw th2;
                }
                this.f43387s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43387s = t7.h();
            throw th3;
        }
        this.f43387s = t7.h();
        g();
    }
}
