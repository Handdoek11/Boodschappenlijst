package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class L extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: E, reason: collision with root package name */
    private static final L f42863E;

    /* renamed from: F, reason: collision with root package name */
    public static com.google.protobuf.n f42864F = new a();

    /* renamed from: A, reason: collision with root package name */
    private Object f42865A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f42866B;

    /* renamed from: C, reason: collision with root package name */
    private int f42867C;

    /* renamed from: D, reason: collision with root package name */
    private int f42868D;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f42869s;

    /* renamed from: t, reason: collision with root package name */
    private int f42870t;

    /* renamed from: u, reason: collision with root package name */
    private c f42871u;

    /* renamed from: v, reason: collision with root package name */
    private Object f42872v;

    /* renamed from: w, reason: collision with root package name */
    private long f42873w;

    /* renamed from: x, reason: collision with root package name */
    private Q f42874x;

    /* renamed from: y, reason: collision with root package name */
    private Object f42875y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f42876z;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public L d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new L(eVar, fVar);
        }
    }

    public enum c {
        UNKNOWN(0, 100),
        CREATE_LIST(1, 0),
        DELETE_LIST(2, 1),
        RENAME_LIST(3, 2),
        SET_LIST_NOTES(4, 3),
        SET_INCLUDE_IN_BADGE_COUNT(5, 4);


        /* renamed from: y, reason: collision with root package name */
        private static h.a f42892y = new a();

        /* renamed from: o, reason: collision with root package name */
        private final int f42894o;

        class a implements h.a {
            a() {
            }
        }

        c(int i8, int i9) {
            this.f42894o = i9;
        }

        public static c c(int i8) {
            if (i8 == 0) {
                return CREATE_LIST;
            }
            if (i8 == 1) {
                return DELETE_LIST;
            }
            if (i8 == 2) {
                return RENAME_LIST;
            }
            if (i8 == 3) {
                return SET_LIST_NOTES;
            }
            if (i8 == 4) {
                return SET_INCLUDE_IN_BADGE_COUNT;
            }
            if (i8 != 100) {
                return null;
            }
            return UNKNOWN;
        }

        public final int e() {
            return this.f42894o;
        }
    }

    static {
        L l8 = new L(true);
        f42863E = l8;
        l8.M();
    }

    private void M() {
        this.f42871u = c.UNKNOWN;
        this.f42872v = "";
        this.f42873w = 0L;
        this.f42874x = Q.UNKNOWN;
        this.f42875y = "";
        this.f42876z = false;
        this.f42865A = "";
        this.f42866B = false;
    }

    public static b N() {
        return b.r();
    }

    public static L v() {
        return f42863E;
    }

    public com.google.protobuf.d A() {
        Object obj = this.f42865A;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42865A = n8;
        return n8;
    }

    public Q B() {
        return this.f42874x;
    }

    public boolean C() {
        return this.f42876z;
    }

    public long D() {
        return this.f42873w;
    }

    public boolean E() {
        return (this.f42870t & 128) == 128;
    }

    public boolean F() {
        return (this.f42870t & 1) == 1;
    }

    public boolean G() {
        return (this.f42870t & 2) == 2;
    }

    public boolean H() {
        return (this.f42870t & 16) == 16;
    }

    public boolean I() {
        return (this.f42870t & 64) == 64;
    }

    public boolean J() {
        return (this.f42870t & 8) == 8;
    }

    public boolean K() {
        return (this.f42870t & 32) == 32;
    }

    public boolean L() {
        return (this.f42870t & 4) == 4;
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f42868D;
        if (i8 != -1) {
            return i8;
        }
        int f8 = (this.f42870t & 1) == 1 ? CodedOutputStream.f(1, this.f42871u.e()) : 0;
        if ((this.f42870t & 2) == 2) {
            f8 += CodedOutputStream.d(2, y());
        }
        if ((this.f42870t & 4) == 4) {
            f8 += CodedOutputStream.j(3, this.f42873w);
        }
        if ((this.f42870t & 8) == 8) {
            f8 += CodedOutputStream.f(4, this.f42874x.e());
        }
        if ((this.f42870t & 16) == 16) {
            f8 += CodedOutputStream.d(5, z());
        }
        if ((this.f42870t & 32) == 32) {
            f8 += CodedOutputStream.b(6, this.f42876z);
        }
        if ((this.f42870t & 64) == 64) {
            f8 += CodedOutputStream.d(7, A());
        }
        if ((this.f42870t & 128) == 128) {
            f8 += CodedOutputStream.b(8, this.f42866B);
        }
        int size = f8 + this.f42869s.size();
        this.f42868D = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f42867C;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        if (!F()) {
            this.f42867C = 0;
            return false;
        }
        if (G()) {
            this.f42867C = 1;
            return true;
        }
        this.f42867C = 0;
        return false;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f42870t & 1) == 1) {
            codedOutputStream.G(1, this.f42871u.e());
        }
        if ((this.f42870t & 2) == 2) {
            codedOutputStream.E(2, y());
        }
        if ((this.f42870t & 4) == 4) {
            codedOutputStream.M(3, this.f42873w);
        }
        if ((this.f42870t & 8) == 8) {
            codedOutputStream.G(4, this.f42874x.e());
        }
        if ((this.f42870t & 16) == 16) {
            codedOutputStream.E(5, z());
        }
        if ((this.f42870t & 32) == 32) {
            codedOutputStream.C(6, this.f42876z);
        }
        if ((this.f42870t & 64) == 64) {
            codedOutputStream.E(7, A());
        }
        if ((this.f42870t & 128) == 128) {
            codedOutputStream.C(8, this.f42866B);
        }
        codedOutputStream.S(this.f42869s);
    }

    public boolean w() {
        return this.f42866B;
    }

    public c x() {
        return this.f42871u;
    }

    public com.google.protobuf.d y() {
        Object obj = this.f42872v;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42872v = n8;
        return n8;
    }

    public com.google.protobuf.d z() {
        Object obj = this.f42875y;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42875y = n8;
        return n8;
    }

    private L(g.a aVar) {
        super(aVar);
        this.f42867C = -1;
        this.f42868D = -1;
        this.f42869s = aVar.i();
    }

    private L(boolean z7) {
        this.f42867C = -1;
        this.f42868D = -1;
        this.f42869s = com.google.protobuf.d.f33078o;
    }

    private L(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f42867C = -1;
        this.f42868D = -1;
        M();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 != 0) {
                        if (x7 == 8) {
                            int k8 = eVar.k();
                            c c8 = c.c(k8);
                            if (c8 == null) {
                                w7.W(x7);
                                w7.W(k8);
                            } else {
                                this.f42870t |= 1;
                                this.f42871u = c8;
                            }
                        } else if (x7 == 18) {
                            com.google.protobuf.d j8 = eVar.j();
                            this.f42870t |= 2;
                            this.f42872v = j8;
                        } else if (x7 == 24) {
                            this.f42870t |= 4;
                            this.f42873w = eVar.m();
                        } else if (x7 == 32) {
                            int k9 = eVar.k();
                            Q c9 = Q.c(k9);
                            if (c9 == null) {
                                w7.W(x7);
                                w7.W(k9);
                            } else {
                                this.f42870t |= 8;
                                this.f42874x = c9;
                            }
                        } else if (x7 == 42) {
                            com.google.protobuf.d j9 = eVar.j();
                            this.f42870t |= 16;
                            this.f42875y = j9;
                        } else if (x7 == 48) {
                            this.f42870t |= 32;
                            this.f42876z = eVar.i();
                        } else if (x7 == 58) {
                            com.google.protobuf.d j10 = eVar.j();
                            this.f42870t |= 64;
                            this.f42865A = j10;
                        } else if (x7 != 64) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            this.f42870t |= 128;
                            this.f42866B = eVar.i();
                        }
                    }
                    z7 = true;
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
                    this.f42869s = t7.h();
                    throw th2;
                }
                this.f42869s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f42869s = t7.h();
            throw th3;
        }
        this.f42869s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: A, reason: collision with root package name */
        private boolean f42877A;

        /* renamed from: s, reason: collision with root package name */
        private int f42878s;

        /* renamed from: v, reason: collision with root package name */
        private long f42881v;

        /* renamed from: y, reason: collision with root package name */
        private boolean f42884y;

        /* renamed from: t, reason: collision with root package name */
        private c f42879t = c.UNKNOWN;

        /* renamed from: u, reason: collision with root package name */
        private Object f42880u = "";

        /* renamed from: w, reason: collision with root package name */
        private Q f42882w = Q.UNKNOWN;

        /* renamed from: x, reason: collision with root package name */
        private Object f42883x = "";

        /* renamed from: z, reason: collision with root package name */
        private Object f42885z = "";

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        public b A(Q q8) {
            q8.getClass();
            this.f42878s |= 8;
            this.f42882w = q8;
            return this;
        }

        public b B(boolean z7) {
            this.f42878s |= 32;
            this.f42884y = z7;
            return this;
        }

        public b C(long j8) {
            this.f42878s |= 4;
            this.f42881v = j8;
            return this;
        }

        public L m() {
            L p8 = p();
            if (p8.c()) {
                return p8;
            }
            throw a.AbstractC0243a.h(p8);
        }

        public L p() {
            L l8 = new L(this);
            int i8 = this.f42878s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            l8.f42871u = this.f42879t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            l8.f42872v = this.f42880u;
            if ((i8 & 4) == 4) {
                i9 |= 4;
            }
            l8.f42873w = this.f42881v;
            if ((i8 & 8) == 8) {
                i9 |= 8;
            }
            l8.f42874x = this.f42882w;
            if ((i8 & 16) == 16) {
                i9 |= 16;
            }
            l8.f42875y = this.f42883x;
            if ((i8 & 32) == 32) {
                i9 |= 32;
            }
            l8.f42876z = this.f42884y;
            if ((i8 & 64) == 64) {
                i9 |= 64;
            }
            l8.f42865A = this.f42885z;
            if ((i8 & 128) == 128) {
                i9 |= 128;
            }
            l8.f42866B = this.f42877A;
            l8.f42870t = i9;
            return l8;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().u(p());
        }

        public b u(L l8) {
            if (l8 == L.v()) {
                return this;
            }
            if (l8.F()) {
                w(l8.x());
            }
            if (l8.G()) {
                this.f42878s |= 2;
                this.f42880u = l8.f42872v;
            }
            if (l8.L()) {
                C(l8.D());
            }
            if (l8.J()) {
                A(l8.B());
            }
            if (l8.H()) {
                this.f42878s |= 16;
                this.f42883x = l8.f42875y;
            }
            if (l8.K()) {
                B(l8.C());
            }
            if (l8.I()) {
                this.f42878s |= 64;
                this.f42885z = l8.f42865A;
            }
            if (l8.E()) {
                v(l8.w());
            }
            k(i().c(l8.f42869s));
            return this;
        }

        public b v(boolean z7) {
            this.f42878s |= 128;
            this.f42877A = z7;
            return this;
        }

        public b w(c cVar) {
            cVar.getClass();
            this.f42878s |= 1;
            this.f42879t = cVar;
            return this;
        }

        public b x(String str) {
            str.getClass();
            this.f42878s |= 2;
            this.f42880u = str;
            return this;
        }

        public b y(String str) {
            str.getClass();
            this.f42878s |= 16;
            this.f42883x = str;
            return this;
        }

        public b z(String str) {
            str.getClass();
            this.f42878s |= 64;
            this.f42885z = str;
            return this;
        }

        private void s() {
        }
    }
}
