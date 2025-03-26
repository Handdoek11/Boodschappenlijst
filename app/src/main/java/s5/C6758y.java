package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.IOException;

/* renamed from: s5.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6758y extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: O, reason: collision with root package name */
    private static final C6758y f43650O;

    /* renamed from: P, reason: collision with root package name */
    public static com.google.protobuf.n f43651P = new a();

    /* renamed from: A, reason: collision with root package name */
    private Object f43652A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f43653B;

    /* renamed from: C, reason: collision with root package name */
    private Object f43654C;

    /* renamed from: D, reason: collision with root package name */
    private Object f43655D;

    /* renamed from: E, reason: collision with root package name */
    private Object f43656E;

    /* renamed from: F, reason: collision with root package name */
    private int f43657F;

    /* renamed from: G, reason: collision with root package name */
    private int f43658G;

    /* renamed from: H, reason: collision with root package name */
    private long f43659H;

    /* renamed from: I, reason: collision with root package name */
    private int f43660I;

    /* renamed from: J, reason: collision with root package name */
    private Object f43661J;

    /* renamed from: K, reason: collision with root package name */
    private long f43662K;

    /* renamed from: L, reason: collision with root package name */
    private Object f43663L;

    /* renamed from: M, reason: collision with root package name */
    private int f43664M;

    /* renamed from: N, reason: collision with root package name */
    private int f43665N;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43666s;

    /* renamed from: t, reason: collision with root package name */
    private int f43667t;

    /* renamed from: u, reason: collision with root package name */
    private d f43668u;

    /* renamed from: v, reason: collision with root package name */
    private Object f43669v;

    /* renamed from: w, reason: collision with root package name */
    private long f43670w;

    /* renamed from: x, reason: collision with root package name */
    private Object f43671x;

    /* renamed from: y, reason: collision with root package name */
    private Object f43672y;

    /* renamed from: z, reason: collision with root package name */
    private c f43673z;

    /* renamed from: s5.y$a */
    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6758y d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C6758y(eVar, fVar);
        }
    }

    /* renamed from: s5.y$c */
    public enum c {
        NONE(0, 0),
        MANUAL_REORDER(1, 1);


        /* renamed from: u, reason: collision with root package name */
        private static h.a f43695u = new a();

        /* renamed from: o, reason: collision with root package name */
        private final int f43697o;

        /* renamed from: s5.y$c$a */
        class a implements h.a {
            a() {
            }
        }

        c(int i8, int i9) {
            this.f43697o = i9;
        }

        public static c c(int i8) {
            if (i8 == 0) {
                return NONE;
            }
            if (i8 != 1) {
                return null;
            }
            return MANUAL_REORDER;
        }

        public final int e() {
            return this.f43697o;
        }
    }

    /* renamed from: s5.y$d */
    public enum d {
        UNKNOWN(0, 100),
        INSERT(1, 0),
        DELETE(2, 1),
        RENAME(3, 2),
        REORDER(4, 3),
        CROSS_OFF(5, 4),
        SET_TARGET_LIST(6, 5),
        SET_CATEGORY(7, 6),
        SET_BARCODE(8, 7),
        SET_PHOTO(9, 8),
        SET_STAR(10, 9),
        SET_NOTE(11, 10);


        /* renamed from: E, reason: collision with root package name */
        private static h.a f43702E = new a();

        /* renamed from: o, reason: collision with root package name */
        private final int f43712o;

        /* renamed from: s5.y$d$a */
        class a implements h.a {
            a() {
            }
        }

        d(int i8, int i9) {
            this.f43712o = i9;
        }

        public static d c(int i8) {
            if (i8 == 100) {
                return UNKNOWN;
            }
            switch (i8) {
                case 0:
                    return INSERT;
                case 1:
                    return DELETE;
                case 2:
                    return RENAME;
                case 3:
                    return REORDER;
                case 4:
                    return CROSS_OFF;
                case 5:
                    return SET_TARGET_LIST;
                case 6:
                    return SET_CATEGORY;
                case 7:
                    return SET_BARCODE;
                case 8:
                    return SET_PHOTO;
                case 9:
                    return SET_STAR;
                case 10:
                    return SET_NOTE;
                default:
                    return null;
            }
        }

        public final int e() {
            return this.f43712o;
        }
    }

    static {
        C6758y c6758y = new C6758y(true);
        f43650O = c6758y;
        c6758y.w0();
    }

    public static C6758y Q() {
        return f43650O;
    }

    private void w0() {
        this.f43668u = d.UNKNOWN;
        this.f43669v = "";
        this.f43670w = 0L;
        this.f43671x = "";
        this.f43672y = "";
        this.f43673z = c.NONE;
        this.f43652A = "";
        this.f43653B = false;
        this.f43654C = "";
        this.f43655D = "";
        this.f43656E = "";
        this.f43657F = 0;
        this.f43658G = 0;
        this.f43659H = 0L;
        this.f43660I = 0;
        this.f43661J = "";
        this.f43662K = 0L;
        this.f43663L = "";
    }

    public static b x0() {
        return b.r();
    }

    public int L() {
        return this.f43658G;
    }

    public int M() {
        return this.f43660I;
    }

    public com.google.protobuf.d N() {
        Object obj = this.f43655D;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43655D = n8;
        return n8;
    }

    public com.google.protobuf.d O() {
        Object obj = this.f43654C;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43654C = n8;
        return n8;
    }

    public long P() {
        return this.f43662K;
    }

    public d R() {
        return this.f43668u;
    }

    public com.google.protobuf.d S() {
        Object obj = this.f43669v;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43669v = n8;
        return n8;
    }

    public long T() {
        return this.f43659H;
    }

    public com.google.protobuf.d U() {
        Object obj = this.f43652A;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43652A = n8;
        return n8;
    }

    public com.google.protobuf.d V() {
        Object obj = this.f43663L;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43663L = n8;
        return n8;
    }

    public com.google.protobuf.d W() {
        Object obj = this.f43656E;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43656E = n8;
        return n8;
    }

    public boolean X() {
        return this.f43653B;
    }

    public com.google.protobuf.d Y() {
        Object obj = this.f43672y;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43672y = n8;
        return n8;
    }

    public c Z() {
        return this.f43673z;
    }

    public int a0() {
        return this.f43657F;
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43665N;
        if (i8 != -1) {
            return i8;
        }
        int f8 = (this.f43667t & 1) == 1 ? CodedOutputStream.f(1, this.f43668u.e()) : 0;
        if ((this.f43667t & 2) == 2) {
            f8 += CodedOutputStream.d(2, S());
        }
        if ((this.f43667t & 4) == 4) {
            f8 += CodedOutputStream.j(3, this.f43670w);
        }
        if ((this.f43667t & 8) == 8) {
            f8 += CodedOutputStream.d(4, d0());
        }
        if ((this.f43667t & 16) == 16) {
            f8 += CodedOutputStream.d(5, Y());
        }
        if ((this.f43667t & 32) == 32) {
            f8 += CodedOutputStream.f(6, this.f43673z.e());
        }
        if ((this.f43667t & 64) == 64) {
            f8 += CodedOutputStream.d(7, U());
        }
        if ((this.f43667t & 128) == 128) {
            f8 += CodedOutputStream.b(8, this.f43653B);
        }
        if ((this.f43667t & 256) == 256) {
            f8 += CodedOutputStream.d(9, O());
        }
        if ((this.f43667t & 512) == 512) {
            f8 += CodedOutputStream.d(10, N());
        }
        if ((this.f43667t & 1024) == 1024) {
            f8 += CodedOutputStream.d(11, W());
        }
        if ((this.f43667t & 2048) == 2048) {
            f8 += CodedOutputStream.h(12, this.f43657F);
        }
        if ((this.f43667t & 4096) == 4096) {
            f8 += CodedOutputStream.h(13, this.f43658G);
        }
        if ((this.f43667t & 8192) == 8192) {
            f8 += CodedOutputStream.j(14, this.f43659H);
        }
        if ((this.f43667t & 16384) == 16384) {
            f8 += CodedOutputStream.h(15, this.f43660I);
        }
        if ((this.f43667t & 32768) == 32768) {
            f8 += CodedOutputStream.d(16, b0());
        }
        if ((this.f43667t & 65536) == 65536) {
            f8 += CodedOutputStream.j(17, this.f43662K);
        }
        if ((this.f43667t & 131072) == 131072) {
            f8 += CodedOutputStream.d(18, V());
        }
        int size = f8 + this.f43666s.size();
        this.f43665N = size;
        return size;
    }

    public com.google.protobuf.d b0() {
        Object obj = this.f43661J;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43661J = n8;
        return n8;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43664M;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        if (!j0()) {
            this.f43664M = 0;
            return false;
        }
        if (k0()) {
            this.f43664M = 1;
            return true;
        }
        this.f43664M = 0;
        return false;
    }

    public long c0() {
        return this.f43670w;
    }

    public com.google.protobuf.d d0() {
        Object obj = this.f43671x;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43671x = n8;
        return n8;
    }

    public boolean e0() {
        return (this.f43667t & 4096) == 4096;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43667t & 1) == 1) {
            codedOutputStream.G(1, this.f43668u.e());
        }
        if ((this.f43667t & 2) == 2) {
            codedOutputStream.E(2, S());
        }
        if ((this.f43667t & 4) == 4) {
            codedOutputStream.M(3, this.f43670w);
        }
        if ((this.f43667t & 8) == 8) {
            codedOutputStream.E(4, d0());
        }
        if ((this.f43667t & 16) == 16) {
            codedOutputStream.E(5, Y());
        }
        if ((this.f43667t & 32) == 32) {
            codedOutputStream.G(6, this.f43673z.e());
        }
        if ((this.f43667t & 64) == 64) {
            codedOutputStream.E(7, U());
        }
        if ((this.f43667t & 128) == 128) {
            codedOutputStream.C(8, this.f43653B);
        }
        if ((this.f43667t & 256) == 256) {
            codedOutputStream.E(9, O());
        }
        if ((this.f43667t & 512) == 512) {
            codedOutputStream.E(10, N());
        }
        if ((this.f43667t & 1024) == 1024) {
            codedOutputStream.E(11, W());
        }
        if ((this.f43667t & 2048) == 2048) {
            codedOutputStream.K(12, this.f43657F);
        }
        if ((this.f43667t & 4096) == 4096) {
            codedOutputStream.K(13, this.f43658G);
        }
        if ((this.f43667t & 8192) == 8192) {
            codedOutputStream.M(14, this.f43659H);
        }
        if ((this.f43667t & 16384) == 16384) {
            codedOutputStream.K(15, this.f43660I);
        }
        if ((this.f43667t & 32768) == 32768) {
            codedOutputStream.E(16, b0());
        }
        if ((this.f43667t & 65536) == 65536) {
            codedOutputStream.M(17, this.f43662K);
        }
        if ((this.f43667t & 131072) == 131072) {
            codedOutputStream.E(18, V());
        }
        codedOutputStream.S(this.f43666s);
    }

    public boolean f0() {
        return (this.f43667t & 16384) == 16384;
    }

    public boolean g0() {
        return (this.f43667t & 512) == 512;
    }

    public boolean h0() {
        return (this.f43667t & 256) == 256;
    }

    public boolean i0() {
        return (this.f43667t & 65536) == 65536;
    }

    public boolean j0() {
        return (this.f43667t & 1) == 1;
    }

    public boolean k0() {
        return (this.f43667t & 2) == 2;
    }

    public boolean l0() {
        return (this.f43667t & 8192) == 8192;
    }

    public boolean m0() {
        return (this.f43667t & 64) == 64;
    }

    public boolean n0() {
        return (this.f43667t & 131072) == 131072;
    }

    public boolean o0() {
        return (this.f43667t & 1024) == 1024;
    }

    public boolean p0() {
        return (this.f43667t & 128) == 128;
    }

    public boolean q0() {
        return (this.f43667t & 16) == 16;
    }

    public boolean r0() {
        return (this.f43667t & 32) == 32;
    }

    public boolean s0() {
        return (this.f43667t & 2048) == 2048;
    }

    public boolean t0() {
        return (this.f43667t & 32768) == 32768;
    }

    public boolean u0() {
        return (this.f43667t & 4) == 4;
    }

    public boolean v0() {
        return (this.f43667t & 8) == 8;
    }

    private C6758y(g.a aVar) {
        super(aVar);
        this.f43664M = -1;
        this.f43665N = -1;
        this.f43666s = aVar.i();
    }

    private C6758y(boolean z7) {
        this.f43664M = -1;
        this.f43665N = -1;
        this.f43666s = com.google.protobuf.d.f33078o;
    }

    private C6758y(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43664M = -1;
        this.f43665N = -1;
        w0();
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
                            d c8 = d.c(k8);
                            if (c8 == null) {
                                w7.W(x7);
                                w7.W(k8);
                            } else {
                                this.f43667t |= 1;
                                this.f43668u = c8;
                            }
                        case 18:
                            com.google.protobuf.d j8 = eVar.j();
                            this.f43667t |= 2;
                            this.f43669v = j8;
                        case 24:
                            this.f43667t |= 4;
                            this.f43670w = eVar.m();
                        case 34:
                            com.google.protobuf.d j9 = eVar.j();
                            this.f43667t |= 8;
                            this.f43671x = j9;
                        case 42:
                            com.google.protobuf.d j10 = eVar.j();
                            this.f43667t |= 16;
                            this.f43672y = j10;
                        case 48:
                            int k9 = eVar.k();
                            c c9 = c.c(k9);
                            if (c9 == null) {
                                w7.W(x7);
                                w7.W(k9);
                            } else {
                                this.f43667t |= 32;
                                this.f43673z = c9;
                            }
                        case 58:
                            com.google.protobuf.d j11 = eVar.j();
                            this.f43667t |= 64;
                            this.f43652A = j11;
                        case 64:
                            this.f43667t |= 128;
                            this.f43653B = eVar.i();
                        case 74:
                            com.google.protobuf.d j12 = eVar.j();
                            this.f43667t |= 256;
                            this.f43654C = j12;
                        case 82:
                            com.google.protobuf.d j13 = eVar.j();
                            this.f43667t |= 512;
                            this.f43655D = j13;
                        case 90:
                            com.google.protobuf.d j14 = eVar.j();
                            this.f43667t |= 1024;
                            this.f43656E = j14;
                        case 96:
                            this.f43667t |= 2048;
                            this.f43657F = eVar.l();
                        case 104:
                            this.f43667t |= 4096;
                            this.f43658G = eVar.l();
                        case 112:
                            this.f43667t |= 8192;
                            this.f43659H = eVar.m();
                        case 120:
                            this.f43667t |= 16384;
                            this.f43660I = eVar.l();
                        case 130:
                            com.google.protobuf.d j15 = eVar.j();
                            this.f43667t |= 32768;
                            this.f43661J = j15;
                        case 136:
                            this.f43667t |= 65536;
                            this.f43662K = eVar.m();
                        case 146:
                            com.google.protobuf.d j16 = eVar.j();
                            this.f43667t |= 131072;
                            this.f43663L = j16;
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
                    this.f43666s = t7.h();
                    throw th2;
                }
                this.f43666s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43666s = t7.h();
            throw th3;
        }
        this.f43666s = t7.h();
        g();
    }

    /* renamed from: s5.y$b */
    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: A, reason: collision with root package name */
        private boolean f43674A;

        /* renamed from: E, reason: collision with root package name */
        private int f43678E;

        /* renamed from: F, reason: collision with root package name */
        private int f43679F;

        /* renamed from: G, reason: collision with root package name */
        private long f43680G;

        /* renamed from: H, reason: collision with root package name */
        private int f43681H;

        /* renamed from: J, reason: collision with root package name */
        private long f43683J;

        /* renamed from: s, reason: collision with root package name */
        private int f43685s;

        /* renamed from: v, reason: collision with root package name */
        private long f43688v;

        /* renamed from: t, reason: collision with root package name */
        private d f43686t = d.UNKNOWN;

        /* renamed from: u, reason: collision with root package name */
        private Object f43687u = "";

        /* renamed from: w, reason: collision with root package name */
        private Object f43689w = "";

        /* renamed from: x, reason: collision with root package name */
        private Object f43690x = "";

        /* renamed from: y, reason: collision with root package name */
        private c f43691y = c.NONE;

        /* renamed from: z, reason: collision with root package name */
        private Object f43692z = "";

        /* renamed from: B, reason: collision with root package name */
        private Object f43675B = "";

        /* renamed from: C, reason: collision with root package name */
        private Object f43676C = "";

        /* renamed from: D, reason: collision with root package name */
        private Object f43677D = "";

        /* renamed from: I, reason: collision with root package name */
        private Object f43682I = "";

        /* renamed from: K, reason: collision with root package name */
        private Object f43684K = "";

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        public b A(d dVar) {
            dVar.getClass();
            this.f43685s |= 1;
            this.f43686t = dVar;
            return this;
        }

        public b B(String str) {
            str.getClass();
            this.f43685s |= 2;
            this.f43687u = str;
            return this;
        }

        public b C(long j8) {
            this.f43685s |= 8192;
            this.f43680G = j8;
            return this;
        }

        public b D(String str) {
            str.getClass();
            this.f43685s |= 64;
            this.f43692z = str;
            return this;
        }

        public b E(String str) {
            str.getClass();
            this.f43685s |= 131072;
            this.f43684K = str;
            return this;
        }

        public b F(String str) {
            str.getClass();
            this.f43685s |= 1024;
            this.f43677D = str;
            return this;
        }

        public b G(boolean z7) {
            this.f43685s |= 128;
            this.f43674A = z7;
            return this;
        }

        public b H(String str) {
            str.getClass();
            this.f43685s |= 16;
            this.f43690x = str;
            return this;
        }

        public b I(c cVar) {
            cVar.getClass();
            this.f43685s |= 32;
            this.f43691y = cVar;
            return this;
        }

        public b J(int i8) {
            this.f43685s |= 2048;
            this.f43678E = i8;
            return this;
        }

        public b K(String str) {
            str.getClass();
            this.f43685s |= 32768;
            this.f43682I = str;
            return this;
        }

        public b L(long j8) {
            this.f43685s |= 4;
            this.f43688v = j8;
            return this;
        }

        public b M(String str) {
            str.getClass();
            this.f43685s |= 8;
            this.f43689w = str;
            return this;
        }

        public C6758y m() {
            C6758y p8 = p();
            if (p8.c()) {
                return p8;
            }
            throw a.AbstractC0243a.h(p8);
        }

        public C6758y p() {
            C6758y c6758y = new C6758y(this);
            int i8 = this.f43685s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            c6758y.f43668u = this.f43686t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            c6758y.f43669v = this.f43687u;
            if ((i8 & 4) == 4) {
                i9 |= 4;
            }
            c6758y.f43670w = this.f43688v;
            if ((i8 & 8) == 8) {
                i9 |= 8;
            }
            c6758y.f43671x = this.f43689w;
            if ((i8 & 16) == 16) {
                i9 |= 16;
            }
            c6758y.f43672y = this.f43690x;
            if ((i8 & 32) == 32) {
                i9 |= 32;
            }
            c6758y.f43673z = this.f43691y;
            if ((i8 & 64) == 64) {
                i9 |= 64;
            }
            c6758y.f43652A = this.f43692z;
            if ((i8 & 128) == 128) {
                i9 |= 128;
            }
            c6758y.f43653B = this.f43674A;
            if ((i8 & 256) == 256) {
                i9 |= 256;
            }
            c6758y.f43654C = this.f43675B;
            if ((i8 & 512) == 512) {
                i9 |= 512;
            }
            c6758y.f43655D = this.f43676C;
            if ((i8 & 1024) == 1024) {
                i9 |= 1024;
            }
            c6758y.f43656E = this.f43677D;
            if ((i8 & 2048) == 2048) {
                i9 |= 2048;
            }
            c6758y.f43657F = this.f43678E;
            if ((i8 & 4096) == 4096) {
                i9 |= 4096;
            }
            c6758y.f43658G = this.f43679F;
            if ((i8 & 8192) == 8192) {
                i9 |= 8192;
            }
            c6758y.f43659H = this.f43680G;
            if ((i8 & 16384) == 16384) {
                i9 |= 16384;
            }
            c6758y.f43660I = this.f43681H;
            if ((i8 & 32768) == 32768) {
                i9 |= 32768;
            }
            c6758y.f43661J = this.f43682I;
            if ((i8 & 65536) == 65536) {
                i9 |= 65536;
            }
            c6758y.f43662K = this.f43683J;
            if ((i8 & 131072) == 131072) {
                i9 |= 131072;
            }
            c6758y.f43663L = this.f43684K;
            c6758y.f43667t = i9;
            return c6758y;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().u(p());
        }

        public b u(C6758y c6758y) {
            if (c6758y == C6758y.Q()) {
                return this;
            }
            if (c6758y.j0()) {
                A(c6758y.R());
            }
            if (c6758y.k0()) {
                this.f43685s |= 2;
                this.f43687u = c6758y.f43669v;
            }
            if (c6758y.u0()) {
                L(c6758y.c0());
            }
            if (c6758y.v0()) {
                this.f43685s |= 8;
                this.f43689w = c6758y.f43671x;
            }
            if (c6758y.q0()) {
                this.f43685s |= 16;
                this.f43690x = c6758y.f43672y;
            }
            if (c6758y.r0()) {
                I(c6758y.Z());
            }
            if (c6758y.m0()) {
                this.f43685s |= 64;
                this.f43692z = c6758y.f43652A;
            }
            if (c6758y.p0()) {
                G(c6758y.X());
            }
            if (c6758y.h0()) {
                this.f43685s |= 256;
                this.f43675B = c6758y.f43654C;
            }
            if (c6758y.g0()) {
                this.f43685s |= 512;
                this.f43676C = c6758y.f43655D;
            }
            if (c6758y.o0()) {
                this.f43685s |= 1024;
                this.f43677D = c6758y.f43656E;
            }
            if (c6758y.s0()) {
                J(c6758y.a0());
            }
            if (c6758y.e0()) {
                v(c6758y.L());
            }
            if (c6758y.l0()) {
                C(c6758y.T());
            }
            if (c6758y.f0()) {
                w(c6758y.M());
            }
            if (c6758y.t0()) {
                this.f43685s |= 32768;
                this.f43682I = c6758y.f43661J;
            }
            if (c6758y.i0()) {
                z(c6758y.P());
            }
            if (c6758y.n0()) {
                this.f43685s |= 131072;
                this.f43684K = c6758y.f43663L;
            }
            k(i().c(c6758y.f43666s));
            return this;
        }

        public b v(int i8) {
            this.f43685s |= 4096;
            this.f43679F = i8;
            return this;
        }

        public b w(int i8) {
            this.f43685s |= 16384;
            this.f43681H = i8;
            return this;
        }

        public b x(String str) {
            str.getClass();
            this.f43685s |= 512;
            this.f43676C = str;
            return this;
        }

        public b y(String str) {
            str.getClass();
            this.f43685s |= 256;
            this.f43675B = str;
            return this;
        }

        public b z(long j8) {
            this.f43685s |= 65536;
            this.f43683J = j8;
            return this;
        }

        private void s() {
        }
    }
}
