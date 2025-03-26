package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;
import java.io.InputStream;
import s5.C;
import s5.C6740f;
import s5.C6744j;
import s5.C6748n;
import s5.C6753t;
import s5.C6756w;
import s5.C6759z;
import s5.H;
import s5.S;
import s5.U;
import s5.Y;
import s5.d0;
import s5.f0;
import s5.j0;
import s5.l0;
import s5.p0;
import s5.r;
import s5.t0;

/* loaded from: classes2.dex */
public final class h0 extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: U, reason: collision with root package name */
    private static final h0 f43190U;

    /* renamed from: V, reason: collision with root package name */
    public static com.google.protobuf.n f43191V = new a();

    /* renamed from: A, reason: collision with root package name */
    private Y f43192A;

    /* renamed from: B, reason: collision with root package name */
    private f0 f43193B;

    /* renamed from: C, reason: collision with root package name */
    private C6759z f43194C;

    /* renamed from: D, reason: collision with root package name */
    private H f43195D;

    /* renamed from: E, reason: collision with root package name */
    private C6756w f43196E;

    /* renamed from: F, reason: collision with root package name */
    private C6753t f43197F;

    /* renamed from: G, reason: collision with root package name */
    private C6748n f43198G;

    /* renamed from: H, reason: collision with root package name */
    private t0 f43199H;

    /* renamed from: I, reason: collision with root package name */
    private C6740f f43200I;

    /* renamed from: J, reason: collision with root package name */
    private l0 f43201J;

    /* renamed from: K, reason: collision with root package name */
    private p0 f43202K;

    /* renamed from: L, reason: collision with root package name */
    private S f43203L;

    /* renamed from: M, reason: collision with root package name */
    private C6744j f43204M;

    /* renamed from: N, reason: collision with root package name */
    private U f43205N;

    /* renamed from: O, reason: collision with root package name */
    private r f43206O;

    /* renamed from: P, reason: collision with root package name */
    private j0 f43207P;

    /* renamed from: Q, reason: collision with root package name */
    private C f43208Q;

    /* renamed from: R, reason: collision with root package name */
    private d0 f43209R;

    /* renamed from: S, reason: collision with root package name */
    private int f43210S;

    /* renamed from: T, reason: collision with root package name */
    private int f43211T;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43212s;

    /* renamed from: t, reason: collision with root package name */
    private int f43213t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43214u;

    /* renamed from: v, reason: collision with root package name */
    private int f43215v;

    /* renamed from: w, reason: collision with root package name */
    private i0 f43216w;

    /* renamed from: x, reason: collision with root package name */
    private int f43217x;

    /* renamed from: y, reason: collision with root package name */
    private Object f43218y;

    /* renamed from: z, reason: collision with root package name */
    private int f43219z;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public h0 d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new h0(eVar, fVar);
        }
    }

    static {
        h0 h0Var = new h0(true);
        f43190U = h0Var;
        h0Var.I0();
    }

    private void I0() {
        this.f43214u = "";
        this.f43215v = 0;
        this.f43216w = i0.UNKNOWN_REQUEST;
        this.f43217x = 0;
        this.f43218y = "";
        this.f43219z = 0;
        this.f43192A = Y.j();
        this.f43193B = f0.w();
        this.f43194C = C6759z.p();
        this.f43195D = H.p();
        this.f43196E = C6756w.l();
        this.f43197F = C6753t.R();
        this.f43198G = C6748n.p();
        this.f43199H = t0.p();
        this.f43200I = C6740f.o();
        this.f43201J = l0.m();
        this.f43202K = p0.u();
        this.f43203L = S.o();
        this.f43204M = C6744j.m();
        this.f43205N = U.n();
        this.f43206O = r.o();
        this.f43207P = j0.o();
        this.f43208Q = C.m();
        this.f43209R = d0.n();
    }

    public static b J0() {
        return b.r();
    }

    public static b K0(h0 h0Var) {
        return J0().C(h0Var);
    }

    public static h0 L0(InputStream inputStream) {
        return (h0) f43191V.c(inputStream);
    }

    public static h0 Q() {
        return f43190U;
    }

    public boolean A0() {
        return (this.f43213t & 128) == 128;
    }

    public boolean B0() {
        return (this.f43213t & 32) == 32;
    }

    public boolean C0() {
        return (this.f43213t & 8) == 8;
    }

    public boolean D0() {
        return (this.f43213t & 4) == 4;
    }

    public boolean E0() {
        return (this.f43213t & 2097152) == 2097152;
    }

    public boolean F0() {
        return (this.f43213t & 32768) == 32768;
    }

    public boolean G0() {
        return (this.f43213t & 65536) == 65536;
    }

    public boolean H0() {
        return (this.f43213t & 8192) == 8192;
    }

    public C6740f K() {
        return this.f43200I;
    }

    public C6744j L() {
        return this.f43204M;
    }

    public C6748n M() {
        return this.f43198G;
    }

    public String N() {
        Object obj = this.f43214u;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f43214u = J7;
        }
        return J7;
    }

    public com.google.protobuf.d O() {
        Object obj = this.f43214u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43214u = n8;
        return n8;
    }

    public int P() {
        return this.f43215v;
    }

    public r R() {
        return this.f43206O;
    }

    public C6753t S() {
        return this.f43197F;
    }

    public C6759z T() {
        return this.f43194C;
    }

    public C6756w U() {
        return this.f43196E;
    }

    public C V() {
        return this.f43208Q;
    }

    public H W() {
        return this.f43195D;
    }

    public S X() {
        return this.f43203L;
    }

    public U Y() {
        return this.f43205N;
    }

    public Y Z() {
        return this.f43192A;
    }

    public com.google.protobuf.d a0() {
        Object obj = this.f43218y;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43218y = n8;
        return n8;
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43211T;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f43213t & 1) == 1 ? CodedOutputStream.d(1, O()) : 0;
        if ((this.f43213t & 4) == 4) {
            d8 += CodedOutputStream.f(2, this.f43216w.e());
        }
        if ((this.f43213t & 8) == 8) {
            d8 += CodedOutputStream.h(3, this.f43217x);
        }
        if ((this.f43213t & 64) == 64) {
            d8 += CodedOutputStream.l(4, this.f43192A);
        }
        if ((this.f43213t & 128) == 128) {
            d8 += CodedOutputStream.l(5, this.f43193B);
        }
        if ((this.f43213t & 256) == 256) {
            d8 += CodedOutputStream.l(6, this.f43194C);
        }
        if ((this.f43213t & 512) == 512) {
            d8 += CodedOutputStream.l(7, this.f43195D);
        }
        if ((this.f43213t & 1024) == 1024) {
            d8 += CodedOutputStream.l(8, this.f43196E);
        }
        if ((this.f43213t & 2) == 2) {
            d8 += CodedOutputStream.h(9, this.f43215v);
        }
        if ((this.f43213t & 2048) == 2048) {
            d8 += CodedOutputStream.l(10, this.f43197F);
        }
        if ((this.f43213t & 4096) == 4096) {
            d8 += CodedOutputStream.l(11, this.f43198G);
        }
        if ((this.f43213t & 8192) == 8192) {
            d8 += CodedOutputStream.l(12, this.f43199H);
        }
        if ((this.f43213t & 16) == 16) {
            d8 += CodedOutputStream.d(13, a0());
        }
        if ((this.f43213t & 16384) == 16384) {
            d8 += CodedOutputStream.l(14, this.f43200I);
        }
        if ((this.f43213t & 32768) == 32768) {
            d8 += CodedOutputStream.l(15, this.f43201J);
        }
        if ((this.f43213t & 65536) == 65536) {
            d8 += CodedOutputStream.l(16, this.f43202K);
        }
        if ((this.f43213t & 131072) == 131072) {
            d8 += CodedOutputStream.l(17, this.f43203L);
        }
        if ((this.f43213t & 262144) == 262144) {
            d8 += CodedOutputStream.l(18, this.f43204M);
        }
        if ((this.f43213t & 524288) == 524288) {
            d8 += CodedOutputStream.l(19, this.f43205N);
        }
        if ((this.f43213t & 32) == 32) {
            d8 += CodedOutputStream.q(20, this.f43219z);
        }
        if ((this.f43213t & 1048576) == 1048576) {
            d8 += CodedOutputStream.l(21, this.f43206O);
        }
        if ((this.f43213t & 2097152) == 2097152) {
            d8 += CodedOutputStream.l(22, this.f43207P);
        }
        if ((this.f43213t & 4194304) == 4194304) {
            d8 += CodedOutputStream.l(23, this.f43208Q);
        }
        if ((this.f43213t & 8388608) == 8388608) {
            d8 += CodedOutputStream.l(24, this.f43209R);
        }
        int size = d8 + this.f43212s.size();
        this.f43211T = size;
        return size;
    }

    public d0 b0() {
        return this.f43209R;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43210S;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        if (!n0()) {
            this.f43210S = 0;
            return false;
        }
        if (A0() && !c0().c()) {
            this.f43210S = 0;
            return false;
        }
        if (r0() && !T().c()) {
            this.f43210S = 0;
            return false;
        }
        if (u0() && !W().c()) {
            this.f43210S = 0;
            return false;
        }
        if (s0() && !U().c()) {
            this.f43210S = 0;
            return false;
        }
        if (l0() && !L().c()) {
            this.f43210S = 0;
            return false;
        }
        if (w0() && !Y().c()) {
            this.f43210S = 0;
            return false;
        }
        if (!E0() || g0().c()) {
            this.f43210S = 1;
            return true;
        }
        this.f43210S = 0;
        return false;
    }

    public f0 c0() {
        return this.f43193B;
    }

    public int d0() {
        return this.f43219z;
    }

    public int e0() {
        return this.f43217x;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43213t & 1) == 1) {
            codedOutputStream.E(1, O());
        }
        if ((this.f43213t & 4) == 4) {
            codedOutputStream.G(2, this.f43216w.e());
        }
        if ((this.f43213t & 8) == 8) {
            codedOutputStream.K(3, this.f43217x);
        }
        if ((this.f43213t & 64) == 64) {
            codedOutputStream.O(4, this.f43192A);
        }
        if ((this.f43213t & 128) == 128) {
            codedOutputStream.O(5, this.f43193B);
        }
        if ((this.f43213t & 256) == 256) {
            codedOutputStream.O(6, this.f43194C);
        }
        if ((this.f43213t & 512) == 512) {
            codedOutputStream.O(7, this.f43195D);
        }
        if ((this.f43213t & 1024) == 1024) {
            codedOutputStream.O(8, this.f43196E);
        }
        if ((this.f43213t & 2) == 2) {
            codedOutputStream.K(9, this.f43215v);
        }
        if ((this.f43213t & 2048) == 2048) {
            codedOutputStream.O(10, this.f43197F);
        }
        if ((this.f43213t & 4096) == 4096) {
            codedOutputStream.O(11, this.f43198G);
        }
        if ((this.f43213t & 8192) == 8192) {
            codedOutputStream.O(12, this.f43199H);
        }
        if ((this.f43213t & 16) == 16) {
            codedOutputStream.E(13, a0());
        }
        if ((this.f43213t & 16384) == 16384) {
            codedOutputStream.O(14, this.f43200I);
        }
        if ((this.f43213t & 32768) == 32768) {
            codedOutputStream.O(15, this.f43201J);
        }
        if ((this.f43213t & 65536) == 65536) {
            codedOutputStream.O(16, this.f43202K);
        }
        if ((this.f43213t & 131072) == 131072) {
            codedOutputStream.O(17, this.f43203L);
        }
        if ((this.f43213t & 262144) == 262144) {
            codedOutputStream.O(18, this.f43204M);
        }
        if ((this.f43213t & 524288) == 524288) {
            codedOutputStream.O(19, this.f43205N);
        }
        if ((this.f43213t & 32) == 32) {
            codedOutputStream.Y(20, this.f43219z);
        }
        if ((this.f43213t & 1048576) == 1048576) {
            codedOutputStream.O(21, this.f43206O);
        }
        if ((this.f43213t & 2097152) == 2097152) {
            codedOutputStream.O(22, this.f43207P);
        }
        if ((this.f43213t & 4194304) == 4194304) {
            codedOutputStream.O(23, this.f43208Q);
        }
        if ((this.f43213t & 8388608) == 8388608) {
            codedOutputStream.O(24, this.f43209R);
        }
        codedOutputStream.S(this.f43212s);
    }

    public i0 f0() {
        return this.f43216w;
    }

    public j0 g0() {
        return this.f43207P;
    }

    public l0 h0() {
        return this.f43201J;
    }

    public p0 i0() {
        return this.f43202K;
    }

    public t0 j0() {
        return this.f43199H;
    }

    public boolean k0() {
        return (this.f43213t & 16384) == 16384;
    }

    public boolean l0() {
        return (this.f43213t & 262144) == 262144;
    }

    public boolean m0() {
        return (this.f43213t & 4096) == 4096;
    }

    public boolean n0() {
        return (this.f43213t & 1) == 1;
    }

    public boolean o0() {
        return (this.f43213t & 2) == 2;
    }

    public boolean p0() {
        return (this.f43213t & 1048576) == 1048576;
    }

    public boolean q0() {
        return (this.f43213t & 2048) == 2048;
    }

    public boolean r0() {
        return (this.f43213t & 256) == 256;
    }

    public boolean s0() {
        return (this.f43213t & 1024) == 1024;
    }

    public boolean t0() {
        return (this.f43213t & 4194304) == 4194304;
    }

    public boolean u0() {
        return (this.f43213t & 512) == 512;
    }

    public boolean v0() {
        return (this.f43213t & 131072) == 131072;
    }

    public boolean w0() {
        return (this.f43213t & 524288) == 524288;
    }

    public boolean x0() {
        return (this.f43213t & 64) == 64;
    }

    public boolean y0() {
        return (this.f43213t & 16) == 16;
    }

    public boolean z0() {
        return (this.f43213t & 8388608) == 8388608;
    }

    private h0(g.a aVar) {
        super(aVar);
        this.f43210S = -1;
        this.f43211T = -1;
        this.f43212s = aVar.i();
    }

    private h0(boolean z7) {
        this.f43210S = -1;
        this.f43211T = -1;
        this.f43212s = com.google.protobuf.d.f33078o;
    }

    private h0(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43210S = -1;
        this.f43211T = -1;
        I0();
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
                        case 10:
                            com.google.protobuf.d j8 = eVar.j();
                            this.f43213t = 1 | this.f43213t;
                            this.f43214u = j8;
                        case 16:
                            int k8 = eVar.k();
                            i0 c8 = i0.c(k8);
                            if (c8 == null) {
                                w7.W(x7);
                                w7.W(k8);
                            } else {
                                this.f43213t |= 4;
                                this.f43216w = c8;
                            }
                        case 24:
                            this.f43213t |= 8;
                            this.f43217x = eVar.l();
                        case 34:
                            Y.b n8 = (this.f43213t & 64) == 64 ? this.f43192A.n() : null;
                            Y y7 = (Y) eVar.n(Y.f43038w, fVar);
                            this.f43192A = y7;
                            if (n8 != null) {
                                n8.s(y7);
                                this.f43192A = n8.m();
                            }
                            this.f43213t |= 64;
                        case 42:
                            f0.b L7 = (this.f43213t & 128) == 128 ? this.f43193B.L() : null;
                            f0 f0Var = (f0) eVar.n(f0.f43130D, fVar);
                            this.f43193B = f0Var;
                            if (L7 != null) {
                                L7.u(f0Var);
                                this.f43193B = L7.p();
                            }
                            this.f43213t |= 128;
                        case 50:
                            C6759z.b A7 = (this.f43213t & 256) == 256 ? this.f43194C.A() : null;
                            C6759z c6759z = (C6759z) eVar.n(C6759z.f43713A, fVar);
                            this.f43194C = c6759z;
                            if (A7 != null) {
                                A7.w(c6759z);
                                this.f43194C = A7.q();
                            }
                            this.f43213t |= 256;
                        case 58:
                            H.b y8 = (this.f43213t & 512) == 512 ? this.f43195D.y() : null;
                            H h8 = (H) eVar.n(H.f42807A, fVar);
                            this.f43195D = h8;
                            if (y8 != null) {
                                y8.x(h8);
                                this.f43195D = y8.q();
                            }
                            this.f43213t |= 512;
                        case 66:
                            C6756w.b r8 = (this.f43213t & 1024) == 1024 ? this.f43196E.r() : null;
                            C6756w c6756w = (C6756w) eVar.n(C6756w.f43635x, fVar);
                            this.f43196E = c6756w;
                            if (r8 != null) {
                                r8.w(c6756w);
                                this.f43196E = r8.q();
                            }
                            this.f43213t |= 1024;
                        case 72:
                            this.f43213t |= 2;
                            this.f43215v = eVar.l();
                        case 82:
                            C6753t.c z02 = (this.f43213t & 2048) == 2048 ? this.f43197F.z0() : null;
                            C6753t c6753t = (C6753t) eVar.n(C6753t.f43516P, fVar);
                            this.f43197F = c6753t;
                            if (z02 != null) {
                                z02.w(c6753t);
                                this.f43197F = z02.q();
                            }
                            this.f43213t |= 2048;
                        case 90:
                            C6748n.b v7 = (this.f43213t & 4096) == 4096 ? this.f43198G.v() : null;
                            C6748n c6748n = (C6748n) eVar.n(C6748n.f43357z, fVar);
                            this.f43198G = c6748n;
                            if (v7 != null) {
                                v7.u(c6748n);
                                this.f43198G = v7.p();
                            }
                            this.f43213t |= 4096;
                        case 98:
                            t0.b z8 = (this.f43213t & 8192) == 8192 ? this.f43199H.z() : null;
                            t0 t0Var = (t0) eVar.n(t0.f43566A, fVar);
                            this.f43199H = t0Var;
                            if (z8 != null) {
                                z8.u(t0Var);
                                this.f43199H = z8.p();
                            }
                            this.f43213t |= 8192;
                        case 106:
                            com.google.protobuf.d j9 = eVar.j();
                            this.f43213t |= 16;
                            this.f43218y = j9;
                        case 114:
                            C6740f.b x8 = (this.f43213t & 16384) == 16384 ? this.f43200I.x() : null;
                            C6740f c6740f = (C6740f) eVar.n(C6740f.f43119z, fVar);
                            this.f43200I = c6740f;
                            if (x8 != null) {
                                x8.u(c6740f);
                                this.f43200I = x8.p();
                            }
                            this.f43213t |= 16384;
                        case 122:
                            l0.b s8 = (this.f43213t & 32768) == 32768 ? this.f43201J.s() : null;
                            l0 l0Var = (l0) eVar.n(l0.f43336y, fVar);
                            this.f43201J = l0Var;
                            if (s8 != null) {
                                s8.u(l0Var);
                                this.f43201J = s8.p();
                            }
                            this.f43213t |= 32768;
                        case 130:
                            p0.b I7 = (this.f43213t & 65536) == 65536 ? this.f43202K.I() : null;
                            p0 p0Var = (p0) eVar.n(p0.f43428D, fVar);
                            this.f43202K = p0Var;
                            if (I7 != null) {
                                I7.w(p0Var);
                                this.f43202K = I7.q();
                            }
                            this.f43213t |= 65536;
                        case 138:
                            S.b y9 = (this.f43213t & 131072) == 131072 ? this.f43203L.y() : null;
                            S s9 = (S) eVar.n(S.f42977A, fVar);
                            this.f43203L = s9;
                            if (y9 != null) {
                                y9.u(s9);
                                this.f43203L = y9.p();
                            }
                            this.f43213t |= 131072;
                        case 146:
                            C6744j.b r9 = (this.f43213t & 262144) == 262144 ? this.f43204M.r() : null;
                            C6744j c6744j = (C6744j) eVar.n(C6744j.f43282y, fVar);
                            this.f43204M = c6744j;
                            if (r9 != null) {
                                r9.s(c6744j);
                                this.f43204M = r9.m();
                            }
                            this.f43213t |= 262144;
                        case 154:
                            U.b s10 = (this.f43213t & 524288) == 524288 ? this.f43205N.s() : null;
                            U u7 = (U) eVar.n(U.f43002y, fVar);
                            this.f43205N = u7;
                            if (s10 != null) {
                                s10.u(u7);
                                this.f43205N = s10.p();
                            }
                            this.f43213t |= 524288;
                        case 165:
                            this.f43213t |= 32;
                            this.f43219z = eVar.w();
                        case 170:
                            r.b x9 = (this.f43213t & 1048576) == 1048576 ? this.f43206O.x() : null;
                            r rVar = (r) eVar.n(r.f43483z, fVar);
                            this.f43206O = rVar;
                            if (x9 != null) {
                                x9.u(rVar);
                                this.f43206O = x9.p();
                            }
                            this.f43213t |= 1048576;
                        case 178:
                            j0.b v8 = (this.f43213t & 2097152) == 2097152 ? this.f43207P.v() : null;
                            j0 j0Var = (j0) eVar.n(j0.f43291z, fVar);
                            this.f43207P = j0Var;
                            if (v8 != null) {
                                v8.v(j0Var);
                                this.f43207P = v8.p();
                            }
                            this.f43213t |= 2097152;
                        case 186:
                            C.b u8 = (this.f43213t & 4194304) == 4194304 ? this.f43208Q.u() : null;
                            C c9 = (C) eVar.n(C.f42765z, fVar);
                            this.f43208Q = c9;
                            if (u8 != null) {
                                u8.u(c9);
                                this.f43208Q = u8.m();
                            }
                            this.f43213t |= 4194304;
                        case 194:
                            d0.b v9 = (this.f43213t & 8388608) == 8388608 ? this.f43209R.v() : null;
                            d0 d0Var = (d0) eVar.n(d0.f43097z, fVar);
                            this.f43209R = d0Var;
                            if (v9 != null) {
                                v9.s(d0Var);
                                this.f43209R = v9.m();
                            }
                            this.f43213t |= 8388608;
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
                    this.f43212s = t7.h();
                    throw th2;
                }
                this.f43212s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43212s = t7.h();
            throw th3;
        }
        this.f43212s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43237s;

        /* renamed from: u, reason: collision with root package name */
        private int f43239u;

        /* renamed from: w, reason: collision with root package name */
        private int f43241w;

        /* renamed from: y, reason: collision with root package name */
        private int f43243y;

        /* renamed from: t, reason: collision with root package name */
        private Object f43238t = "";

        /* renamed from: v, reason: collision with root package name */
        private i0 f43240v = i0.UNKNOWN_REQUEST;

        /* renamed from: x, reason: collision with root package name */
        private Object f43242x = "";

        /* renamed from: z, reason: collision with root package name */
        private Y f43244z = Y.j();

        /* renamed from: A, reason: collision with root package name */
        private f0 f43220A = f0.w();

        /* renamed from: B, reason: collision with root package name */
        private C6759z f43221B = C6759z.p();

        /* renamed from: C, reason: collision with root package name */
        private H f43222C = H.p();

        /* renamed from: D, reason: collision with root package name */
        private C6756w f43223D = C6756w.l();

        /* renamed from: E, reason: collision with root package name */
        private C6753t f43224E = C6753t.R();

        /* renamed from: F, reason: collision with root package name */
        private C6748n f43225F = C6748n.p();

        /* renamed from: G, reason: collision with root package name */
        private t0 f43226G = t0.p();

        /* renamed from: H, reason: collision with root package name */
        private C6740f f43227H = C6740f.o();

        /* renamed from: I, reason: collision with root package name */
        private l0 f43228I = l0.m();

        /* renamed from: J, reason: collision with root package name */
        private p0 f43229J = p0.u();

        /* renamed from: K, reason: collision with root package name */
        private S f43230K = S.o();

        /* renamed from: L, reason: collision with root package name */
        private C6744j f43231L = C6744j.m();

        /* renamed from: M, reason: collision with root package name */
        private U f43232M = U.n();

        /* renamed from: N, reason: collision with root package name */
        private r f43233N = r.o();

        /* renamed from: O, reason: collision with root package name */
        private j0 f43234O = j0.o();

        /* renamed from: P, reason: collision with root package name */
        private C f43235P = C.m();

        /* renamed from: Q, reason: collision with root package name */
        private d0 f43236Q = d0.n();

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        public b A(C6756w c6756w) {
            if ((this.f43237s & 1024) != 1024 || this.f43223D == C6756w.l()) {
                this.f43223D = c6756w;
            } else {
                this.f43223D = C6756w.q(this.f43223D).w(c6756w).q();
            }
            this.f43237s |= 1024;
            return this;
        }

        public b B(C c8) {
            if ((this.f43237s & 4194304) != 4194304 || this.f43235P == C.m()) {
                this.f43235P = c8;
            } else {
                this.f43235P = C.t(this.f43235P).u(c8).m();
            }
            this.f43237s |= 4194304;
            return this;
        }

        public b C(h0 h0Var) {
            if (h0Var == h0.Q()) {
                return this;
            }
            if (h0Var.n0()) {
                this.f43237s |= 1;
                this.f43238t = h0Var.f43214u;
            }
            if (h0Var.o0()) {
                Q(h0Var.P());
            }
            if (h0Var.D0()) {
                c0(h0Var.f0());
            }
            if (h0Var.C0()) {
                b0(h0Var.e0());
            }
            if (h0Var.y0()) {
                this.f43237s |= 16;
                this.f43242x = h0Var.f43218y;
            }
            if (h0Var.B0()) {
                a0(h0Var.d0());
            }
            if (h0Var.x0()) {
                G(h0Var.Z());
            }
            if (h0Var.A0()) {
                I(h0Var.c0());
            }
            if (h0Var.r0()) {
                z(h0Var.T());
            }
            if (h0Var.u0()) {
                D(h0Var.W());
            }
            if (h0Var.s0()) {
                A(h0Var.U());
            }
            if (h0Var.q0()) {
                y(h0Var.S());
            }
            if (h0Var.m0()) {
                w(h0Var.M());
            }
            if (h0Var.H0()) {
                M(h0Var.j0());
            }
            if (h0Var.k0()) {
                u(h0Var.K());
            }
            if (h0Var.F0()) {
                K(h0Var.h0());
            }
            if (h0Var.G0()) {
                L(h0Var.i0());
            }
            if (h0Var.v0()) {
                E(h0Var.X());
            }
            if (h0Var.l0()) {
                v(h0Var.L());
            }
            if (h0Var.w0()) {
                F(h0Var.Y());
            }
            if (h0Var.p0()) {
                x(h0Var.R());
            }
            if (h0Var.E0()) {
                J(h0Var.g0());
            }
            if (h0Var.t0()) {
                B(h0Var.V());
            }
            if (h0Var.z0()) {
                H(h0Var.b0());
            }
            k(i().c(h0Var.f43212s));
            return this;
        }

        public b D(H h8) {
            if ((this.f43237s & 512) != 512 || this.f43222C == H.p()) {
                this.f43222C = h8;
            } else {
                this.f43222C = H.x(this.f43222C).x(h8).q();
            }
            this.f43237s |= 512;
            return this;
        }

        public b E(S s8) {
            if ((this.f43237s & 131072) != 131072 || this.f43230K == S.o()) {
                this.f43230K = s8;
            } else {
                this.f43230K = S.x(this.f43230K).u(s8).p();
            }
            this.f43237s |= 131072;
            return this;
        }

        public b F(U u7) {
            if ((this.f43237s & 524288) != 524288 || this.f43232M == U.n()) {
                this.f43232M = u7;
            } else {
                this.f43232M = U.r(this.f43232M).u(u7).p();
            }
            this.f43237s |= 524288;
            return this;
        }

        public b G(Y y7) {
            if ((this.f43237s & 64) != 64 || this.f43244z == Y.j()) {
                this.f43244z = y7;
            } else {
                this.f43244z = Y.m(this.f43244z).s(y7).m();
            }
            this.f43237s |= 64;
            return this;
        }

        public b H(d0 d0Var) {
            if ((this.f43237s & 8388608) != 8388608 || this.f43236Q == d0.n()) {
                this.f43236Q = d0Var;
            } else {
                this.f43236Q = d0.u(this.f43236Q).s(d0Var).m();
            }
            this.f43237s |= 8388608;
            return this;
        }

        public b I(f0 f0Var) {
            if ((this.f43237s & 128) != 128 || this.f43220A == f0.w()) {
                this.f43220A = f0Var;
            } else {
                this.f43220A = f0.K(this.f43220A).u(f0Var).p();
            }
            this.f43237s |= 128;
            return this;
        }

        public b J(j0 j0Var) {
            if ((this.f43237s & 2097152) != 2097152 || this.f43234O == j0.o()) {
                this.f43234O = j0Var;
            } else {
                this.f43234O = j0.u(this.f43234O).v(j0Var).p();
            }
            this.f43237s |= 2097152;
            return this;
        }

        public b K(l0 l0Var) {
            if ((this.f43237s & 32768) != 32768 || this.f43228I == l0.m()) {
                this.f43228I = l0Var;
            } else {
                this.f43228I = l0.r(this.f43228I).u(l0Var).p();
            }
            this.f43237s |= 32768;
            return this;
        }

        public b L(p0 p0Var) {
            if ((this.f43237s & 65536) != 65536 || this.f43229J == p0.u()) {
                this.f43229J = p0Var;
            } else {
                this.f43229J = p0.H(this.f43229J).w(p0Var).q();
            }
            this.f43237s |= 65536;
            return this;
        }

        public b M(t0 t0Var) {
            if ((this.f43237s & 8192) != 8192 || this.f43226G == t0.p()) {
                this.f43226G = t0Var;
            } else {
                this.f43226G = t0.y(this.f43226G).u(t0Var).p();
            }
            this.f43237s |= 8192;
            return this;
        }

        public b N(C6740f.b bVar) {
            this.f43227H = bVar.m();
            this.f43237s |= 16384;
            return this;
        }

        public b O(C6748n c6748n) {
            c6748n.getClass();
            this.f43225F = c6748n;
            this.f43237s |= 4096;
            return this;
        }

        public b P(String str) {
            str.getClass();
            this.f43237s |= 1;
            this.f43238t = str;
            return this;
        }

        public b Q(int i8) {
            this.f43237s |= 2;
            this.f43239u = i8;
            return this;
        }

        public b R(r.b bVar) {
            this.f43233N = bVar.m();
            this.f43237s |= 1048576;
            return this;
        }

        public b S(C6753t c6753t) {
            c6753t.getClass();
            this.f43224E = c6753t;
            this.f43237s |= 2048;
            return this;
        }

        public b T(C6759z.b bVar) {
            this.f43221B = bVar.p();
            this.f43237s |= 256;
            return this;
        }

        public b U(C6756w.b bVar) {
            this.f43223D = bVar.p();
            this.f43237s |= 1024;
            return this;
        }

        public b V(H.b bVar) {
            this.f43222C = bVar.p();
            this.f43237s |= 512;
            return this;
        }

        public b W(S.b bVar) {
            this.f43230K = bVar.m();
            this.f43237s |= 131072;
            return this;
        }

        public b X(U.b bVar) {
            this.f43232M = bVar.m();
            this.f43237s |= 524288;
            return this;
        }

        public b Y(f0.b bVar) {
            this.f43220A = bVar.m();
            this.f43237s |= 128;
            return this;
        }

        public b Z(f0 f0Var) {
            f0Var.getClass();
            this.f43220A = f0Var;
            this.f43237s |= 128;
            return this;
        }

        public b a0(int i8) {
            this.f43237s |= 32;
            this.f43243y = i8;
            return this;
        }

        public b b0(int i8) {
            this.f43237s |= 8;
            this.f43241w = i8;
            return this;
        }

        public b c0(i0 i0Var) {
            i0Var.getClass();
            this.f43237s |= 4;
            this.f43240v = i0Var;
            return this;
        }

        public b d0(j0.b bVar) {
            this.f43234O = bVar.m();
            this.f43237s |= 2097152;
            return this;
        }

        public b e0(l0.b bVar) {
            this.f43228I = bVar.m();
            this.f43237s |= 32768;
            return this;
        }

        public b f0(p0.b bVar) {
            this.f43229J = bVar.p();
            this.f43237s |= 65536;
            return this;
        }

        public b g0(p0 p0Var) {
            p0Var.getClass();
            this.f43229J = p0Var;
            this.f43237s |= 65536;
            return this;
        }

        public b h0(t0.b bVar) {
            this.f43226G = bVar.m();
            this.f43237s |= 8192;
            return this;
        }

        public h0 m() {
            h0 p8 = p();
            if (p8.c()) {
                return p8;
            }
            throw a.AbstractC0243a.h(p8);
        }

        public h0 p() {
            h0 h0Var = new h0(this);
            int i8 = this.f43237s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            h0Var.f43214u = this.f43238t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            h0Var.f43215v = this.f43239u;
            if ((i8 & 4) == 4) {
                i9 |= 4;
            }
            h0Var.f43216w = this.f43240v;
            if ((i8 & 8) == 8) {
                i9 |= 8;
            }
            h0Var.f43217x = this.f43241w;
            if ((i8 & 16) == 16) {
                i9 |= 16;
            }
            h0Var.f43218y = this.f43242x;
            if ((i8 & 32) == 32) {
                i9 |= 32;
            }
            h0Var.f43219z = this.f43243y;
            if ((i8 & 64) == 64) {
                i9 |= 64;
            }
            h0Var.f43192A = this.f43244z;
            if ((i8 & 128) == 128) {
                i9 |= 128;
            }
            h0Var.f43193B = this.f43220A;
            if ((i8 & 256) == 256) {
                i9 |= 256;
            }
            h0Var.f43194C = this.f43221B;
            if ((i8 & 512) == 512) {
                i9 |= 512;
            }
            h0Var.f43195D = this.f43222C;
            if ((i8 & 1024) == 1024) {
                i9 |= 1024;
            }
            h0Var.f43196E = this.f43223D;
            if ((i8 & 2048) == 2048) {
                i9 |= 2048;
            }
            h0Var.f43197F = this.f43224E;
            if ((i8 & 4096) == 4096) {
                i9 |= 4096;
            }
            h0Var.f43198G = this.f43225F;
            if ((i8 & 8192) == 8192) {
                i9 |= 8192;
            }
            h0Var.f43199H = this.f43226G;
            if ((i8 & 16384) == 16384) {
                i9 |= 16384;
            }
            h0Var.f43200I = this.f43227H;
            if ((i8 & 32768) == 32768) {
                i9 |= 32768;
            }
            h0Var.f43201J = this.f43228I;
            if ((i8 & 65536) == 65536) {
                i9 |= 65536;
            }
            h0Var.f43202K = this.f43229J;
            if ((i8 & 131072) == 131072) {
                i9 |= 131072;
            }
            h0Var.f43203L = this.f43230K;
            if ((i8 & 262144) == 262144) {
                i9 |= 262144;
            }
            h0Var.f43204M = this.f43231L;
            if ((i8 & 524288) == 524288) {
                i9 |= 524288;
            }
            h0Var.f43205N = this.f43232M;
            if ((i8 & 1048576) == 1048576) {
                i9 |= 1048576;
            }
            h0Var.f43206O = this.f43233N;
            if ((i8 & 2097152) == 2097152) {
                i9 |= 2097152;
            }
            h0Var.f43207P = this.f43234O;
            if ((4194304 & i8) == 4194304) {
                i9 |= 4194304;
            }
            h0Var.f43208Q = this.f43235P;
            if ((i8 & 8388608) == 8388608) {
                i9 |= 8388608;
            }
            h0Var.f43209R = this.f43236Q;
            h0Var.f43213t = i9;
            return h0Var;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().C(p());
        }

        public b u(C6740f c6740f) {
            if ((this.f43237s & 16384) != 16384 || this.f43227H == C6740f.o()) {
                this.f43227H = c6740f;
            } else {
                this.f43227H = C6740f.w(this.f43227H).u(c6740f).p();
            }
            this.f43237s |= 16384;
            return this;
        }

        public b v(C6744j c6744j) {
            if ((this.f43237s & 262144) != 262144 || this.f43231L == C6744j.m()) {
                this.f43231L = c6744j;
            } else {
                this.f43231L = C6744j.q(this.f43231L).s(c6744j).m();
            }
            this.f43237s |= 262144;
            return this;
        }

        public b w(C6748n c6748n) {
            if ((this.f43237s & 4096) != 4096 || this.f43225F == C6748n.p()) {
                this.f43225F = c6748n;
            } else {
                this.f43225F = C6748n.u(this.f43225F).u(c6748n).p();
            }
            this.f43237s |= 4096;
            return this;
        }

        public b x(r rVar) {
            if ((this.f43237s & 1048576) != 1048576 || this.f43233N == r.o()) {
                this.f43233N = rVar;
            } else {
                this.f43233N = r.w(this.f43233N).u(rVar).p();
            }
            this.f43237s |= 1048576;
            return this;
        }

        public b y(C6753t c6753t) {
            if ((this.f43237s & 2048) != 2048 || this.f43224E == C6753t.R()) {
                this.f43224E = c6753t;
            } else {
                this.f43224E = C6753t.y0(this.f43224E).w(c6753t).q();
            }
            this.f43237s |= 2048;
            return this;
        }

        public b z(C6759z c6759z) {
            if ((this.f43237s & 256) != 256 || this.f43221B == C6759z.p()) {
                this.f43221B = c6759z;
            } else {
                this.f43221B = C6759z.z(this.f43221B).w(c6759z).q();
            }
            this.f43237s |= 256;
            return this;
        }

        private void s() {
        }
    }
}
