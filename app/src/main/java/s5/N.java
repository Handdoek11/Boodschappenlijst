package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class N extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: J, reason: collision with root package name */
    private static final N f42906J;

    /* renamed from: K, reason: collision with root package name */
    public static com.google.protobuf.n f42907K = new a();

    /* renamed from: A, reason: collision with root package name */
    private int f42908A;

    /* renamed from: B, reason: collision with root package name */
    private Object f42909B;

    /* renamed from: C, reason: collision with root package name */
    private long f42910C;

    /* renamed from: D, reason: collision with root package name */
    private Object f42911D;

    /* renamed from: E, reason: collision with root package name */
    private int f42912E;

    /* renamed from: F, reason: collision with root package name */
    private long f42913F;

    /* renamed from: G, reason: collision with root package name */
    private int f42914G;

    /* renamed from: H, reason: collision with root package name */
    private int f42915H;

    /* renamed from: I, reason: collision with root package name */
    private int f42916I;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f42917s;

    /* renamed from: t, reason: collision with root package name */
    private int f42918t;

    /* renamed from: u, reason: collision with root package name */
    private Object f42919u;

    /* renamed from: v, reason: collision with root package name */
    private Object f42920v;

    /* renamed from: w, reason: collision with root package name */
    private Object f42921w;

    /* renamed from: x, reason: collision with root package name */
    private Object f42922x;

    /* renamed from: y, reason: collision with root package name */
    private Object f42923y;

    /* renamed from: z, reason: collision with root package name */
    private Object f42924z;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public N d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new N(eVar, fVar);
        }
    }

    static {
        N n8 = new N(true);
        f42906J = n8;
        n8.o0();
    }

    public static N M() {
        return f42906J;
    }

    private void o0() {
        this.f42919u = "";
        this.f42920v = "";
        this.f42921w = "";
        this.f42922x = "";
        this.f42923y = "";
        this.f42924z = "";
        this.f42908A = 0;
        this.f42909B = "";
        this.f42910C = 0L;
        this.f42911D = "";
        this.f42912E = 0;
        this.f42913F = 0L;
        this.f42914G = 0;
    }

    public static b p0() {
        return b.r();
    }

    public static b q0(N n8) {
        return p0().u(n8);
    }

    public int F() {
        return this.f42912E;
    }

    public int G() {
        return this.f42914G;
    }

    public String H() {
        Object obj = this.f42923y;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f42923y = J7;
        }
        return J7;
    }

    public com.google.protobuf.d I() {
        Object obj = this.f42923y;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42923y = n8;
        return n8;
    }

    public String J() {
        Object obj = this.f42922x;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f42922x = J7;
        }
        return J7;
    }

    public com.google.protobuf.d K() {
        Object obj = this.f42922x;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42922x = n8;
        return n8;
    }

    public long L() {
        return this.f42910C;
    }

    public String N() {
        Object obj = this.f42919u;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f42919u = J7;
        }
        return J7;
    }

    public com.google.protobuf.d O() {
        Object obj = this.f42919u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42919u = n8;
        return n8;
    }

    public long P() {
        return this.f42913F;
    }

    public String Q() {
        Object obj = this.f42909B;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f42909B = J7;
        }
        return J7;
    }

    public com.google.protobuf.d R() {
        Object obj = this.f42909B;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42909B = n8;
        return n8;
    }

    public String S() {
        Object obj = this.f42924z;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f42924z = J7;
        }
        return J7;
    }

    public com.google.protobuf.d T() {
        Object obj = this.f42924z;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42924z = n8;
        return n8;
    }

    public String U() {
        Object obj = this.f42921w;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f42921w = J7;
        }
        return J7;
    }

    public com.google.protobuf.d V() {
        Object obj = this.f42921w;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42921w = n8;
        return n8;
    }

    public int W() {
        return this.f42908A;
    }

    public String X() {
        Object obj = this.f42911D;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f42911D = J7;
        }
        return J7;
    }

    public com.google.protobuf.d Y() {
        Object obj = this.f42911D;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42911D = n8;
        return n8;
    }

    public String Z() {
        Object obj = this.f42920v;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f42920v = J7;
        }
        return J7;
    }

    public com.google.protobuf.d a0() {
        Object obj = this.f42920v;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42920v = n8;
        return n8;
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f42916I;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f42918t & 1) == 1 ? CodedOutputStream.d(1, O()) : 0;
        if ((this.f42918t & 2) == 2) {
            d8 += CodedOutputStream.d(2, a0());
        }
        if ((this.f42918t & 4) == 4) {
            d8 += CodedOutputStream.d(3, V());
        }
        if ((this.f42918t & 1024) == 1024) {
            d8 += CodedOutputStream.h(4, this.f42912E);
        }
        if ((this.f42918t & 2048) == 2048) {
            d8 += CodedOutputStream.j(5, this.f42913F);
        }
        if ((this.f42918t & 4096) == 4096) {
            d8 += CodedOutputStream.h(6, this.f42914G);
        }
        if ((this.f42918t & 256) == 256) {
            d8 += CodedOutputStream.j(7, this.f42910C);
        }
        if ((this.f42918t & 512) == 512) {
            d8 += CodedOutputStream.d(8, Y());
        }
        if ((this.f42918t & 8) == 8) {
            d8 += CodedOutputStream.d(9, K());
        }
        if ((this.f42918t & 16) == 16) {
            d8 += CodedOutputStream.d(10, I());
        }
        if ((this.f42918t & 32) == 32) {
            d8 += CodedOutputStream.d(11, T());
        }
        if ((this.f42918t & 64) == 64) {
            d8 += CodedOutputStream.h(12, this.f42908A);
        }
        if ((this.f42918t & 128) == 128) {
            d8 += CodedOutputStream.d(13, R());
        }
        int size = d8 + this.f42917s.size();
        this.f42916I = size;
        return size;
    }

    public boolean b0() {
        return (this.f42918t & 1024) == 1024;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f42915H;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        if (g0()) {
            this.f42915H = 1;
            return true;
        }
        this.f42915H = 0;
        return false;
    }

    public boolean c0() {
        return (this.f42918t & 4096) == 4096;
    }

    public boolean d0() {
        return (this.f42918t & 16) == 16;
    }

    public boolean e0() {
        return (this.f42918t & 8) == 8;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f42918t & 1) == 1) {
            codedOutputStream.E(1, O());
        }
        if ((this.f42918t & 2) == 2) {
            codedOutputStream.E(2, a0());
        }
        if ((this.f42918t & 4) == 4) {
            codedOutputStream.E(3, V());
        }
        if ((this.f42918t & 1024) == 1024) {
            codedOutputStream.K(4, this.f42912E);
        }
        if ((this.f42918t & 2048) == 2048) {
            codedOutputStream.M(5, this.f42913F);
        }
        if ((this.f42918t & 4096) == 4096) {
            codedOutputStream.K(6, this.f42914G);
        }
        if ((this.f42918t & 256) == 256) {
            codedOutputStream.M(7, this.f42910C);
        }
        if ((this.f42918t & 512) == 512) {
            codedOutputStream.E(8, Y());
        }
        if ((this.f42918t & 8) == 8) {
            codedOutputStream.E(9, K());
        }
        if ((this.f42918t & 16) == 16) {
            codedOutputStream.E(10, I());
        }
        if ((this.f42918t & 32) == 32) {
            codedOutputStream.E(11, T());
        }
        if ((this.f42918t & 64) == 64) {
            codedOutputStream.K(12, this.f42908A);
        }
        if ((this.f42918t & 128) == 128) {
            codedOutputStream.E(13, R());
        }
        codedOutputStream.S(this.f42917s);
    }

    public boolean f0() {
        return (this.f42918t & 256) == 256;
    }

    public boolean g0() {
        return (this.f42918t & 1) == 1;
    }

    public boolean h0() {
        return (this.f42918t & 2048) == 2048;
    }

    public boolean i0() {
        return (this.f42918t & 128) == 128;
    }

    public boolean j0() {
        return (this.f42918t & 32) == 32;
    }

    public boolean k0() {
        return (this.f42918t & 4) == 4;
    }

    public boolean l0() {
        return (this.f42918t & 64) == 64;
    }

    public boolean m0() {
        return (this.f42918t & 512) == 512;
    }

    public boolean n0() {
        return (this.f42918t & 2) == 2;
    }

    private N(g.a aVar) {
        super(aVar);
        this.f42915H = -1;
        this.f42916I = -1;
        this.f42917s = aVar.i();
    }

    private N(boolean z7) {
        this.f42915H = -1;
        this.f42916I = -1;
        this.f42917s = com.google.protobuf.d.f33078o;
    }

    private N(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f42915H = -1;
        this.f42916I = -1;
        o0();
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
                            this.f42918t = 1 | this.f42918t;
                            this.f42919u = j8;
                        case 18:
                            com.google.protobuf.d j9 = eVar.j();
                            this.f42918t |= 2;
                            this.f42920v = j9;
                        case 26:
                            com.google.protobuf.d j10 = eVar.j();
                            this.f42918t |= 4;
                            this.f42921w = j10;
                        case 32:
                            this.f42918t |= 1024;
                            this.f42912E = eVar.l();
                        case 40:
                            this.f42918t |= 2048;
                            this.f42913F = eVar.m();
                        case 48:
                            this.f42918t |= 4096;
                            this.f42914G = eVar.l();
                        case 56:
                            this.f42918t |= 256;
                            this.f42910C = eVar.m();
                        case 66:
                            com.google.protobuf.d j11 = eVar.j();
                            this.f42918t |= 512;
                            this.f42911D = j11;
                        case 74:
                            com.google.protobuf.d j12 = eVar.j();
                            this.f42918t |= 8;
                            this.f42922x = j12;
                        case 82:
                            com.google.protobuf.d j13 = eVar.j();
                            this.f42918t |= 16;
                            this.f42923y = j13;
                        case 90:
                            com.google.protobuf.d j14 = eVar.j();
                            this.f42918t |= 32;
                            this.f42924z = j14;
                        case 96:
                            this.f42918t |= 64;
                            this.f42908A = eVar.l();
                        case 106:
                            com.google.protobuf.d j15 = eVar.j();
                            this.f42918t |= 128;
                            this.f42909B = j15;
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
                    this.f42917s = t7.h();
                    throw th2;
                }
                this.f42917s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f42917s = t7.h();
            throw th3;
        }
        this.f42917s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: B, reason: collision with root package name */
        private long f42926B;

        /* renamed from: D, reason: collision with root package name */
        private int f42928D;

        /* renamed from: E, reason: collision with root package name */
        private long f42929E;

        /* renamed from: F, reason: collision with root package name */
        private int f42930F;

        /* renamed from: s, reason: collision with root package name */
        private int f42931s;

        /* renamed from: z, reason: collision with root package name */
        private int f42938z;

        /* renamed from: t, reason: collision with root package name */
        private Object f42932t = "";

        /* renamed from: u, reason: collision with root package name */
        private Object f42933u = "";

        /* renamed from: v, reason: collision with root package name */
        private Object f42934v = "";

        /* renamed from: w, reason: collision with root package name */
        private Object f42935w = "";

        /* renamed from: x, reason: collision with root package name */
        private Object f42936x = "";

        /* renamed from: y, reason: collision with root package name */
        private Object f42937y = "";

        /* renamed from: A, reason: collision with root package name */
        private Object f42925A = "";

        /* renamed from: C, reason: collision with root package name */
        private Object f42927C = "";

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        public b A(String str) {
            str.getClass();
            this.f42931s |= 1;
            this.f42932t = str;
            return this;
        }

        public b B(long j8) {
            this.f42931s |= 2048;
            this.f42929E = j8;
            return this;
        }

        public b C(String str) {
            str.getClass();
            this.f42931s |= 128;
            this.f42925A = str;
            return this;
        }

        public b D(String str) {
            str.getClass();
            this.f42931s |= 32;
            this.f42937y = str;
            return this;
        }

        public b E(String str) {
            str.getClass();
            this.f42931s |= 4;
            this.f42934v = str;
            return this;
        }

        public b F(int i8) {
            this.f42931s |= 64;
            this.f42938z = i8;
            return this;
        }

        public b G(String str) {
            str.getClass();
            this.f42931s |= 512;
            this.f42927C = str;
            return this;
        }

        public b H(String str) {
            str.getClass();
            this.f42931s |= 2;
            this.f42933u = str;
            return this;
        }

        public N m() {
            N p8 = p();
            if (p8.c()) {
                return p8;
            }
            throw a.AbstractC0243a.h(p8);
        }

        public N p() {
            N n8 = new N(this);
            int i8 = this.f42931s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            n8.f42919u = this.f42932t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            n8.f42920v = this.f42933u;
            if ((i8 & 4) == 4) {
                i9 |= 4;
            }
            n8.f42921w = this.f42934v;
            if ((i8 & 8) == 8) {
                i9 |= 8;
            }
            n8.f42922x = this.f42935w;
            if ((i8 & 16) == 16) {
                i9 |= 16;
            }
            n8.f42923y = this.f42936x;
            if ((i8 & 32) == 32) {
                i9 |= 32;
            }
            n8.f42924z = this.f42937y;
            if ((i8 & 64) == 64) {
                i9 |= 64;
            }
            n8.f42908A = this.f42938z;
            if ((i8 & 128) == 128) {
                i9 |= 128;
            }
            n8.f42909B = this.f42925A;
            if ((i8 & 256) == 256) {
                i9 |= 256;
            }
            n8.f42910C = this.f42926B;
            if ((i8 & 512) == 512) {
                i9 |= 512;
            }
            n8.f42911D = this.f42927C;
            if ((i8 & 1024) == 1024) {
                i9 |= 1024;
            }
            n8.f42912E = this.f42928D;
            if ((i8 & 2048) == 2048) {
                i9 |= 2048;
            }
            n8.f42913F = this.f42929E;
            if ((i8 & 4096) == 4096) {
                i9 |= 4096;
            }
            n8.f42914G = this.f42930F;
            n8.f42918t = i9;
            return n8;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().u(p());
        }

        public b u(N n8) {
            if (n8 == N.M()) {
                return this;
            }
            if (n8.g0()) {
                this.f42931s |= 1;
                this.f42932t = n8.f42919u;
            }
            if (n8.n0()) {
                this.f42931s |= 2;
                this.f42933u = n8.f42920v;
            }
            if (n8.k0()) {
                this.f42931s |= 4;
                this.f42934v = n8.f42921w;
            }
            if (n8.e0()) {
                this.f42931s |= 8;
                this.f42935w = n8.f42922x;
            }
            if (n8.d0()) {
                this.f42931s |= 16;
                this.f42936x = n8.f42923y;
            }
            if (n8.j0()) {
                this.f42931s |= 32;
                this.f42937y = n8.f42924z;
            }
            if (n8.l0()) {
                F(n8.W());
            }
            if (n8.i0()) {
                this.f42931s |= 128;
                this.f42925A = n8.f42909B;
            }
            if (n8.f0()) {
                z(n8.L());
            }
            if (n8.m0()) {
                this.f42931s |= 512;
                this.f42927C = n8.f42911D;
            }
            if (n8.b0()) {
                v(n8.F());
            }
            if (n8.h0()) {
                B(n8.P());
            }
            if (n8.c0()) {
                w(n8.G());
            }
            k(i().c(n8.f42917s));
            return this;
        }

        public b v(int i8) {
            this.f42931s |= 1024;
            this.f42928D = i8;
            return this;
        }

        public b w(int i8) {
            this.f42931s |= 4096;
            this.f42930F = i8;
            return this;
        }

        public b x(String str) {
            str.getClass();
            this.f42931s |= 16;
            this.f42936x = str;
            return this;
        }

        public b y(String str) {
            str.getClass();
            this.f42931s |= 8;
            this.f42935w = str;
            return this;
        }

        public b z(long j8) {
            this.f42931s |= 256;
            this.f42926B = j8;
            return this;
        }

        private void s() {
        }
    }
}
