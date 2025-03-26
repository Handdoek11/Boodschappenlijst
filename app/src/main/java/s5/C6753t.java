package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import com.google.protobuf.h;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: s5.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6753t extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: O, reason: collision with root package name */
    private static final C6753t f43515O;

    /* renamed from: P, reason: collision with root package name */
    public static com.google.protobuf.n f43516P = new a();

    /* renamed from: A, reason: collision with root package name */
    private b f43517A;

    /* renamed from: B, reason: collision with root package name */
    private Object f43518B;

    /* renamed from: C, reason: collision with root package name */
    private Object f43519C;

    /* renamed from: D, reason: collision with root package name */
    private Object f43520D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f43521E;

    /* renamed from: F, reason: collision with root package name */
    private List f43522F;

    /* renamed from: G, reason: collision with root package name */
    private X f43523G;

    /* renamed from: H, reason: collision with root package name */
    private Object f43524H;

    /* renamed from: I, reason: collision with root package name */
    private EnumC6746l f43525I;

    /* renamed from: J, reason: collision with root package name */
    private EnumC6742h f43526J;

    /* renamed from: K, reason: collision with root package name */
    private Object f43527K;

    /* renamed from: L, reason: collision with root package name */
    private W f43528L;

    /* renamed from: M, reason: collision with root package name */
    private int f43529M;

    /* renamed from: N, reason: collision with root package name */
    private int f43530N;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43531s;

    /* renamed from: t, reason: collision with root package name */
    private int f43532t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43533u;

    /* renamed from: v, reason: collision with root package name */
    private Object f43534v;

    /* renamed from: w, reason: collision with root package name */
    private Object f43535w;

    /* renamed from: x, reason: collision with root package name */
    private Object f43536x;

    /* renamed from: y, reason: collision with root package name */
    private Object f43537y;

    /* renamed from: z, reason: collision with root package name */
    private int f43538z;

    /* renamed from: s5.t$a */
    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6753t d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C6753t(eVar, fVar);
        }
    }

    /* renamed from: s5.t$b */
    public enum b {
        UNKNOWN(0, 0),
        APPLE(1, 1),
        PLAY(2, 2),
        KINDLE(3, 3),
        SAMSUNG(4, 4);


        /* renamed from: x, reason: collision with root package name */
        private static h.a f43544x = new a();

        /* renamed from: o, reason: collision with root package name */
        private final int f43546o;

        /* renamed from: s5.t$b$a */
        class a implements h.a {
            a() {
            }
        }

        b(int i8, int i9) {
            this.f43546o = i9;
        }

        public static b c(int i8) {
            if (i8 == 0) {
                return UNKNOWN;
            }
            if (i8 == 1) {
                return APPLE;
            }
            if (i8 == 2) {
                return PLAY;
            }
            if (i8 == 3) {
                return KINDLE;
            }
            if (i8 != 4) {
                return null;
            }
            return SAMSUNG;
        }

        public final int e() {
            return this.f43546o;
        }
    }

    static {
        C6753t c6753t = new C6753t(true);
        f43515O = c6753t;
        c6753t.w0();
    }

    public static C6753t R() {
        return f43515O;
    }

    private void w0() {
        this.f43533u = "";
        this.f43534v = "";
        this.f43535w = "";
        this.f43536x = "";
        this.f43537y = "";
        this.f43538z = 0;
        this.f43517A = b.UNKNOWN;
        this.f43518B = "";
        this.f43519C = "";
        this.f43520D = "";
        this.f43521E = false;
        this.f43522F = Collections.emptyList();
        this.f43523G = X.NOT_OFFERED;
        this.f43524H = "";
        this.f43525I = EnumC6746l.AC_LEAVE;
        this.f43526J = EnumC6742h.AD_CONSENT_UNKNOWN;
        this.f43527K = "";
        this.f43528L = W.UNKNOWN_SCREEN;
    }

    public static c x0() {
        return c.s();
    }

    public static c y0(C6753t c6753t) {
        return x0().w(c6753t);
    }

    public EnumC6742h N() {
        return this.f43526J;
    }

    public b O() {
        return this.f43517A;
    }

    public EnumC6746l P() {
        return this.f43525I;
    }

    public int Q() {
        return this.f43538z;
    }

    public com.google.protobuf.d S() {
        Object obj = this.f43536x;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43536x = n8;
        return n8;
    }

    public boolean T() {
        return this.f43521E;
    }

    public com.google.protobuf.d U() {
        Object obj = this.f43520D;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43520D = n8;
        return n8;
    }

    public W V() {
        return this.f43528L;
    }

    public com.google.protobuf.d W() {
        Object obj = this.f43533u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43533u = n8;
        return n8;
    }

    public X X() {
        return this.f43523G;
    }

    public com.google.protobuf.d Y() {
        Object obj = this.f43534v;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43534v = n8;
        return n8;
    }

    public com.google.protobuf.d Z() {
        Object obj = this.f43535w;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43535w = n8;
        return n8;
    }

    public com.google.protobuf.d a0() {
        Object obj = this.f43518B;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43518B = n8;
        return n8;
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43530N;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f43532t & 1) == 1 ? CodedOutputStream.d(1, W()) : 0;
        if ((this.f43532t & 2) == 2) {
            d8 += CodedOutputStream.d(2, Y());
        }
        if ((this.f43532t & 4) == 4) {
            d8 += CodedOutputStream.d(3, Z());
        }
        if ((this.f43532t & 8) == 8) {
            d8 += CodedOutputStream.d(4, S());
        }
        if ((this.f43532t & 16) == 16) {
            d8 += CodedOutputStream.d(5, c0());
        }
        if ((this.f43532t & 32) == 32) {
            d8 += CodedOutputStream.h(6, this.f43538z);
        }
        if ((this.f43532t & 64) == 64) {
            d8 += CodedOutputStream.f(7, this.f43517A.e());
        }
        if ((this.f43532t & 128) == 128) {
            d8 += CodedOutputStream.d(8, a0());
        }
        if ((this.f43532t & 256) == 256) {
            d8 += CodedOutputStream.d(9, e0());
        }
        if ((this.f43532t & 512) == 512) {
            d8 += CodedOutputStream.d(10, U());
        }
        if ((this.f43532t & 1024) == 1024) {
            d8 += CodedOutputStream.b(11, this.f43521E);
        }
        for (int i9 = 0; i9 < this.f43522F.size(); i9++) {
            d8 += CodedOutputStream.l(12, (com.google.protobuf.l) this.f43522F.get(i9));
        }
        if ((this.f43532t & 2048) == 2048) {
            d8 += CodedOutputStream.f(13, this.f43523G.e());
        }
        if ((this.f43532t & 4096) == 4096) {
            d8 += CodedOutputStream.d(14, d0());
        }
        if ((this.f43532t & 8192) == 8192) {
            d8 += CodedOutputStream.f(15, this.f43525I.e());
        }
        if ((this.f43532t & 16384) == 16384) {
            d8 += CodedOutputStream.f(16, this.f43526J.e());
        }
        if ((this.f43532t & 32768) == 32768) {
            d8 += CodedOutputStream.d(17, b0());
        }
        if ((this.f43532t & 65536) == 65536) {
            d8 += CodedOutputStream.f(18, this.f43528L.e());
        }
        int size = d8 + this.f43531s.size();
        this.f43530N = size;
        return size;
    }

    public com.google.protobuf.d b0() {
        Object obj = this.f43527K;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43527K = n8;
        return n8;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43529M;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43529M = 1;
        return true;
    }

    public com.google.protobuf.d c0() {
        Object obj = this.f43537y;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43537y = n8;
        return n8;
    }

    public com.google.protobuf.d d0() {
        Object obj = this.f43524H;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43524H = n8;
        return n8;
    }

    public com.google.protobuf.d e0() {
        Object obj = this.f43519C;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43519C = n8;
        return n8;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43532t & 1) == 1) {
            codedOutputStream.E(1, W());
        }
        if ((this.f43532t & 2) == 2) {
            codedOutputStream.E(2, Y());
        }
        if ((this.f43532t & 4) == 4) {
            codedOutputStream.E(3, Z());
        }
        if ((this.f43532t & 8) == 8) {
            codedOutputStream.E(4, S());
        }
        if ((this.f43532t & 16) == 16) {
            codedOutputStream.E(5, c0());
        }
        if ((this.f43532t & 32) == 32) {
            codedOutputStream.K(6, this.f43538z);
        }
        if ((this.f43532t & 64) == 64) {
            codedOutputStream.G(7, this.f43517A.e());
        }
        if ((this.f43532t & 128) == 128) {
            codedOutputStream.E(8, a0());
        }
        if ((this.f43532t & 256) == 256) {
            codedOutputStream.E(9, e0());
        }
        if ((this.f43532t & 512) == 512) {
            codedOutputStream.E(10, U());
        }
        if ((this.f43532t & 1024) == 1024) {
            codedOutputStream.C(11, this.f43521E);
        }
        for (int i8 = 0; i8 < this.f43522F.size(); i8++) {
            codedOutputStream.O(12, (com.google.protobuf.l) this.f43522F.get(i8));
        }
        if ((this.f43532t & 2048) == 2048) {
            codedOutputStream.G(13, this.f43523G.e());
        }
        if ((this.f43532t & 4096) == 4096) {
            codedOutputStream.E(14, d0());
        }
        if ((this.f43532t & 8192) == 8192) {
            codedOutputStream.G(15, this.f43525I.e());
        }
        if ((this.f43532t & 16384) == 16384) {
            codedOutputStream.G(16, this.f43526J.e());
        }
        if ((this.f43532t & 32768) == 32768) {
            codedOutputStream.E(17, b0());
        }
        if ((this.f43532t & 65536) == 65536) {
            codedOutputStream.G(18, this.f43528L.e());
        }
        codedOutputStream.S(this.f43531s);
    }

    public boolean f0() {
        return (this.f43532t & 16384) == 16384;
    }

    public boolean g0() {
        return (this.f43532t & 64) == 64;
    }

    public boolean h0() {
        return (this.f43532t & 8192) == 8192;
    }

    public boolean i0() {
        return (this.f43532t & 32) == 32;
    }

    public boolean j0() {
        return (this.f43532t & 8) == 8;
    }

    public boolean k0() {
        return (this.f43532t & 1024) == 1024;
    }

    public boolean l0() {
        return (this.f43532t & 512) == 512;
    }

    public boolean m0() {
        return (this.f43532t & 65536) == 65536;
    }

    public boolean n0() {
        return (this.f43532t & 1) == 1;
    }

    public boolean o0() {
        return (this.f43532t & 2048) == 2048;
    }

    public boolean p0() {
        return (this.f43532t & 2) == 2;
    }

    public boolean q0() {
        return (this.f43532t & 4) == 4;
    }

    public boolean r0() {
        return (this.f43532t & 128) == 128;
    }

    public boolean s0() {
        return (this.f43532t & 32768) == 32768;
    }

    public boolean t0() {
        return (this.f43532t & 16) == 16;
    }

    public boolean u0() {
        return (this.f43532t & 4096) == 4096;
    }

    public boolean v0() {
        return (this.f43532t & 256) == 256;
    }

    public c z0() {
        return y0(this);
    }

    private C6753t(g.a aVar) {
        super(aVar);
        this.f43529M = -1;
        this.f43530N = -1;
        this.f43531s = aVar.i();
    }

    private C6753t(boolean z7) {
        this.f43529M = -1;
        this.f43530N = -1;
        this.f43531s = com.google.protobuf.d.f33078o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    private C6753t(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43529M = -1;
        this.f43530N = -1;
        w0();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        char c8 = 0;
        while (true) {
            ?? r42 = 2048;
            if (!z7) {
                try {
                    try {
                        try {
                            int x7 = eVar.x();
                            switch (x7) {
                                case 0:
                                    z7 = true;
                                case 10:
                                    com.google.protobuf.d j8 = eVar.j();
                                    this.f43532t = 1 | this.f43532t;
                                    this.f43533u = j8;
                                case 18:
                                    com.google.protobuf.d j9 = eVar.j();
                                    this.f43532t |= 2;
                                    this.f43534v = j9;
                                case 26:
                                    com.google.protobuf.d j10 = eVar.j();
                                    this.f43532t |= 4;
                                    this.f43535w = j10;
                                case 34:
                                    com.google.protobuf.d j11 = eVar.j();
                                    this.f43532t |= 8;
                                    this.f43536x = j11;
                                case 42:
                                    com.google.protobuf.d j12 = eVar.j();
                                    this.f43532t |= 16;
                                    this.f43537y = j12;
                                case 48:
                                    this.f43532t |= 32;
                                    this.f43538z = eVar.l();
                                case 56:
                                    int k8 = eVar.k();
                                    b c9 = b.c(k8);
                                    if (c9 == null) {
                                        w7.W(x7);
                                        w7.W(k8);
                                    } else {
                                        this.f43532t |= 64;
                                        this.f43517A = c9;
                                    }
                                case 66:
                                    com.google.protobuf.d j13 = eVar.j();
                                    this.f43532t |= 128;
                                    this.f43518B = j13;
                                case 74:
                                    com.google.protobuf.d j14 = eVar.j();
                                    this.f43532t |= 256;
                                    this.f43519C = j14;
                                case 82:
                                    com.google.protobuf.d j15 = eVar.j();
                                    this.f43532t |= 512;
                                    this.f43520D = j15;
                                case 88:
                                    this.f43532t |= 1024;
                                    this.f43521E = eVar.i();
                                case 98:
                                    if ((c8 & 2048) != 2048) {
                                        this.f43522F = new ArrayList();
                                        c8 = 2048;
                                    }
                                    this.f43522F.add((J) eVar.n(J.f42839A, fVar));
                                case 104:
                                    int k9 = eVar.k();
                                    X c10 = X.c(k9);
                                    if (c10 == null) {
                                        w7.W(x7);
                                        w7.W(k9);
                                    } else {
                                        this.f43532t |= 2048;
                                        this.f43523G = c10;
                                    }
                                case 114:
                                    com.google.protobuf.d j16 = eVar.j();
                                    this.f43532t |= 4096;
                                    this.f43524H = j16;
                                case 120:
                                    int k10 = eVar.k();
                                    EnumC6746l c11 = EnumC6746l.c(k10);
                                    if (c11 == null) {
                                        w7.W(x7);
                                        w7.W(k10);
                                    } else {
                                        this.f43532t |= 8192;
                                        this.f43525I = c11;
                                    }
                                case 128:
                                    int k11 = eVar.k();
                                    EnumC6742h c12 = EnumC6742h.c(k11);
                                    if (c12 == null) {
                                        w7.W(x7);
                                        w7.W(k11);
                                    } else {
                                        this.f43532t |= 16384;
                                        this.f43526J = c12;
                                    }
                                case 138:
                                    com.google.protobuf.d j17 = eVar.j();
                                    this.f43532t |= 32768;
                                    this.f43527K = j17;
                                case 144:
                                    int k12 = eVar.k();
                                    W c13 = W.c(k12);
                                    if (c13 == null) {
                                        w7.W(x7);
                                        w7.W(k12);
                                    } else {
                                        this.f43532t |= 65536;
                                        this.f43528L = c13;
                                    }
                                default:
                                    r42 = h(eVar, w7, fVar, x7);
                                    if (r42 == 0) {
                                        z7 = true;
                                    }
                            }
                        } catch (IOException e8) {
                            throw new InvalidProtocolBufferException(e8.getMessage()).g(this);
                        }
                    } catch (InvalidProtocolBufferException e9) {
                        throw e9.g(this);
                    }
                } catch (Throwable th) {
                    if ((c8 & 2048) == r42) {
                        this.f43522F = DesugarCollections.unmodifiableList(this.f43522F);
                    }
                    try {
                        w7.v();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f43531s = t7.h();
                        throw th2;
                    }
                    this.f43531s = t7.h();
                    g();
                    throw th;
                }
            } else {
                if ((c8 & 2048) == 2048) {
                    this.f43522F = DesugarCollections.unmodifiableList(this.f43522F);
                }
                try {
                    w7.v();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f43531s = t7.h();
                    throw th3;
                }
                this.f43531s = t7.h();
                g();
                return;
            }
        }
    }

    /* renamed from: s5.t$c */
    public static final class c extends g.a implements com.google.protobuf.m {

        /* renamed from: D, reason: collision with root package name */
        private boolean f43550D;

        /* renamed from: s, reason: collision with root package name */
        private int f43558s;

        /* renamed from: y, reason: collision with root package name */
        private int f43564y;

        /* renamed from: t, reason: collision with root package name */
        private Object f43559t = "";

        /* renamed from: u, reason: collision with root package name */
        private Object f43560u = "";

        /* renamed from: v, reason: collision with root package name */
        private Object f43561v = "";

        /* renamed from: w, reason: collision with root package name */
        private Object f43562w = "";

        /* renamed from: x, reason: collision with root package name */
        private Object f43563x = "";

        /* renamed from: z, reason: collision with root package name */
        private b f43565z = b.UNKNOWN;

        /* renamed from: A, reason: collision with root package name */
        private Object f43547A = "";

        /* renamed from: B, reason: collision with root package name */
        private Object f43548B = "";

        /* renamed from: C, reason: collision with root package name */
        private Object f43549C = "";

        /* renamed from: E, reason: collision with root package name */
        private List f43551E = Collections.emptyList();

        /* renamed from: F, reason: collision with root package name */
        private X f43552F = X.NOT_OFFERED;

        /* renamed from: G, reason: collision with root package name */
        private Object f43553G = "";

        /* renamed from: H, reason: collision with root package name */
        private EnumC6746l f43554H = EnumC6746l.AC_LEAVE;

        /* renamed from: I, reason: collision with root package name */
        private EnumC6742h f43555I = EnumC6742h.AD_CONSENT_UNKNOWN;

        /* renamed from: J, reason: collision with root package name */
        private Object f43556J = "";

        /* renamed from: K, reason: collision with root package name */
        private W f43557K = W.UNKNOWN_SCREEN;

        private c() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c s() {
            return new c();
        }

        private void u() {
            if ((this.f43558s & 2048) != 2048) {
                this.f43551E = new ArrayList(this.f43551E);
                this.f43558s |= 2048;
            }
        }

        public c A(int i8) {
            this.f43558s |= 32;
            this.f43564y = i8;
            return this;
        }

        public c B(String str) {
            str.getClass();
            this.f43558s |= 8;
            this.f43562w = str;
            return this;
        }

        public c C(boolean z7) {
            this.f43558s |= 1024;
            this.f43550D = z7;
            return this;
        }

        public c D(String str) {
            str.getClass();
            this.f43558s |= 512;
            this.f43549C = str;
            return this;
        }

        public c E(W w7) {
            w7.getClass();
            this.f43558s |= 131072;
            this.f43557K = w7;
            return this;
        }

        public c F(String str) {
            str.getClass();
            this.f43558s |= 1;
            this.f43559t = str;
            return this;
        }

        public c G(X x7) {
            x7.getClass();
            this.f43558s |= 4096;
            this.f43552F = x7;
            return this;
        }

        public c H(String str) {
            str.getClass();
            this.f43558s |= 2;
            this.f43560u = str;
            return this;
        }

        public c I(String str) {
            str.getClass();
            this.f43558s |= 4;
            this.f43561v = str;
            return this;
        }

        public c J(String str) {
            str.getClass();
            this.f43558s |= 128;
            this.f43547A = str;
            return this;
        }

        public c K(String str) {
            str.getClass();
            this.f43558s |= 65536;
            this.f43556J = str;
            return this;
        }

        public c L(String str) {
            str.getClass();
            this.f43558s |= 16;
            this.f43563x = str;
            return this;
        }

        public c M(String str) {
            str.getClass();
            this.f43558s |= 8192;
            this.f43553G = str;
            return this;
        }

        public c N(String str) {
            str.getClass();
            this.f43558s |= 256;
            this.f43548B = str;
            return this;
        }

        public c m(J j8) {
            j8.getClass();
            u();
            this.f43551E.add(j8);
            return this;
        }

        public C6753t p() {
            C6753t q8 = q();
            if (q8.c()) {
                return q8;
            }
            throw a.AbstractC0243a.h(q8);
        }

        public C6753t q() {
            C6753t c6753t = new C6753t(this);
            int i8 = this.f43558s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            c6753t.f43533u = this.f43559t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            c6753t.f43534v = this.f43560u;
            if ((i8 & 4) == 4) {
                i9 |= 4;
            }
            c6753t.f43535w = this.f43561v;
            if ((i8 & 8) == 8) {
                i9 |= 8;
            }
            c6753t.f43536x = this.f43562w;
            if ((i8 & 16) == 16) {
                i9 |= 16;
            }
            c6753t.f43537y = this.f43563x;
            if ((i8 & 32) == 32) {
                i9 |= 32;
            }
            c6753t.f43538z = this.f43564y;
            if ((i8 & 64) == 64) {
                i9 |= 64;
            }
            c6753t.f43517A = this.f43565z;
            if ((i8 & 128) == 128) {
                i9 |= 128;
            }
            c6753t.f43518B = this.f43547A;
            if ((i8 & 256) == 256) {
                i9 |= 256;
            }
            c6753t.f43519C = this.f43548B;
            if ((i8 & 512) == 512) {
                i9 |= 512;
            }
            c6753t.f43520D = this.f43549C;
            if ((i8 & 1024) == 1024) {
                i9 |= 1024;
            }
            c6753t.f43521E = this.f43550D;
            if ((this.f43558s & 2048) == 2048) {
                this.f43551E = DesugarCollections.unmodifiableList(this.f43551E);
                this.f43558s &= -2049;
            }
            c6753t.f43522F = this.f43551E;
            if ((i8 & 4096) == 4096) {
                i9 |= 2048;
            }
            c6753t.f43523G = this.f43552F;
            if ((i8 & 8192) == 8192) {
                i9 |= 4096;
            }
            c6753t.f43524H = this.f43553G;
            if ((i8 & 16384) == 16384) {
                i9 |= 8192;
            }
            c6753t.f43525I = this.f43554H;
            if ((i8 & 32768) == 32768) {
                i9 |= 16384;
            }
            c6753t.f43526J = this.f43555I;
            if ((i8 & 65536) == 65536) {
                i9 |= 32768;
            }
            c6753t.f43527K = this.f43556J;
            if ((i8 & 131072) == 131072) {
                i9 |= 65536;
            }
            c6753t.f43528L = this.f43557K;
            c6753t.f43532t = i9;
            return c6753t;
        }

        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public c clone() {
            return s().w(q());
        }

        public c w(C6753t c6753t) {
            if (c6753t == C6753t.R()) {
                return this;
            }
            if (c6753t.n0()) {
                this.f43558s |= 1;
                this.f43559t = c6753t.f43533u;
            }
            if (c6753t.p0()) {
                this.f43558s |= 2;
                this.f43560u = c6753t.f43534v;
            }
            if (c6753t.q0()) {
                this.f43558s |= 4;
                this.f43561v = c6753t.f43535w;
            }
            if (c6753t.j0()) {
                this.f43558s |= 8;
                this.f43562w = c6753t.f43536x;
            }
            if (c6753t.t0()) {
                this.f43558s |= 16;
                this.f43563x = c6753t.f43537y;
            }
            if (c6753t.i0()) {
                A(c6753t.Q());
            }
            if (c6753t.g0()) {
                y(c6753t.O());
            }
            if (c6753t.r0()) {
                this.f43558s |= 128;
                this.f43547A = c6753t.f43518B;
            }
            if (c6753t.v0()) {
                this.f43558s |= 256;
                this.f43548B = c6753t.f43519C;
            }
            if (c6753t.l0()) {
                this.f43558s |= 512;
                this.f43549C = c6753t.f43520D;
            }
            if (c6753t.k0()) {
                C(c6753t.T());
            }
            if (!c6753t.f43522F.isEmpty()) {
                if (this.f43551E.isEmpty()) {
                    this.f43551E = c6753t.f43522F;
                    this.f43558s &= -2049;
                } else {
                    u();
                    this.f43551E.addAll(c6753t.f43522F);
                }
            }
            if (c6753t.o0()) {
                G(c6753t.X());
            }
            if (c6753t.u0()) {
                this.f43558s |= 8192;
                this.f43553G = c6753t.f43524H;
            }
            if (c6753t.h0()) {
                z(c6753t.P());
            }
            if (c6753t.f0()) {
                x(c6753t.N());
            }
            if (c6753t.s0()) {
                this.f43558s |= 65536;
                this.f43556J = c6753t.f43527K;
            }
            if (c6753t.m0()) {
                E(c6753t.V());
            }
            k(i().c(c6753t.f43531s));
            return this;
        }

        public c x(EnumC6742h enumC6742h) {
            enumC6742h.getClass();
            this.f43558s |= 32768;
            this.f43555I = enumC6742h;
            return this;
        }

        public c y(b bVar) {
            bVar.getClass();
            this.f43558s |= 64;
            this.f43565z = bVar;
            return this;
        }

        public c z(EnumC6746l enumC6746l) {
            enumC6746l.getClass();
            this.f43558s |= 16384;
            this.f43554H = enumC6746l;
            return this;
        }

        private void v() {
        }
    }
}
