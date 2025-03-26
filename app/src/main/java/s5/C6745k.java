package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* renamed from: s5.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6745k extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: C, reason: collision with root package name */
    private static final C6745k f43301C;

    /* renamed from: D, reason: collision with root package name */
    public static com.google.protobuf.n f43302D = new a();

    /* renamed from: A, reason: collision with root package name */
    private int f43303A;

    /* renamed from: B, reason: collision with root package name */
    private int f43304B;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43305s;

    /* renamed from: t, reason: collision with root package name */
    private int f43306t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f43307u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f43308v;

    /* renamed from: w, reason: collision with root package name */
    private s0 f43309w;

    /* renamed from: x, reason: collision with root package name */
    private long f43310x;

    /* renamed from: y, reason: collision with root package name */
    private F f43311y;

    /* renamed from: z, reason: collision with root package name */
    private long f43312z;

    /* renamed from: s5.k$a */
    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6745k d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C6745k(eVar, fVar);
        }
    }

    static {
        C6745k c6745k = new C6745k(true);
        f43301C = c6745k;
        c6745k.D();
    }

    private void D() {
        this.f43307u = false;
        this.f43308v = false;
        this.f43309w = s0.SUB_NONE;
        this.f43310x = 0L;
        this.f43311y = F.EA_UNKNOWN;
        this.f43312z = 0L;
    }

    public static b E() {
        return b.q();
    }

    public static b F(C6745k c6745k) {
        return E().s(c6745k);
    }

    public static C6745k r() {
        return f43301C;
    }

    public boolean A() {
        return (this.f43306t & 32) == 32;
    }

    public boolean B() {
        return (this.f43306t & 1) == 1;
    }

    public boolean C() {
        return (this.f43306t & 2) == 2;
    }

    public b G() {
        return F(this);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43304B;
        if (i8 != -1) {
            return i8;
        }
        int b8 = (this.f43306t & 1) == 1 ? CodedOutputStream.b(1, this.f43307u) : 0;
        if ((this.f43306t & 2) == 2) {
            b8 += CodedOutputStream.b(2, this.f43308v);
        }
        if ((this.f43306t & 4) == 4) {
            b8 += CodedOutputStream.f(3, this.f43309w.e());
        }
        if ((this.f43306t & 16) == 16) {
            b8 += CodedOutputStream.f(4, this.f43311y.e());
        }
        if ((this.f43306t & 8) == 8) {
            b8 += CodedOutputStream.j(5, this.f43310x);
        }
        if ((this.f43306t & 32) == 32) {
            b8 += CodedOutputStream.j(6, this.f43312z);
        }
        int size = b8 + this.f43305s.size();
        this.f43304B = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43303A;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        if (!B()) {
            this.f43303A = 0;
            return false;
        }
        if (C()) {
            this.f43303A = 1;
            return true;
        }
        this.f43303A = 0;
        return false;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43306t & 1) == 1) {
            codedOutputStream.C(1, this.f43307u);
        }
        if ((this.f43306t & 2) == 2) {
            codedOutputStream.C(2, this.f43308v);
        }
        if ((this.f43306t & 4) == 4) {
            codedOutputStream.G(3, this.f43309w.e());
        }
        if ((this.f43306t & 16) == 16) {
            codedOutputStream.G(4, this.f43311y.e());
        }
        if ((this.f43306t & 8) == 8) {
            codedOutputStream.M(5, this.f43310x);
        }
        if ((this.f43306t & 32) == 32) {
            codedOutputStream.M(6, this.f43312z);
        }
        codedOutputStream.S(this.f43305s);
    }

    public s0 q() {
        return this.f43309w;
    }

    public F s() {
        return this.f43311y;
    }

    public long t() {
        return this.f43310x;
    }

    public long u() {
        return this.f43312z;
    }

    public boolean v() {
        return this.f43307u;
    }

    public boolean w() {
        return this.f43308v;
    }

    public boolean x() {
        return (this.f43306t & 4) == 4;
    }

    public boolean y() {
        return (this.f43306t & 16) == 16;
    }

    public boolean z() {
        return (this.f43306t & 8) == 8;
    }

    private C6745k(g.a aVar) {
        super(aVar);
        this.f43303A = -1;
        this.f43304B = -1;
        this.f43305s = aVar.i();
    }

    private C6745k(boolean z7) {
        this.f43303A = -1;
        this.f43304B = -1;
        this.f43305s = com.google.protobuf.d.f33078o;
    }

    private C6745k(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43303A = -1;
        this.f43304B = -1;
        D();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 != 0) {
                        if (x7 == 8) {
                            this.f43306t |= 1;
                            this.f43307u = eVar.i();
                        } else if (x7 == 16) {
                            this.f43306t |= 2;
                            this.f43308v = eVar.i();
                        } else if (x7 == 24) {
                            int k8 = eVar.k();
                            s0 c8 = s0.c(k8);
                            if (c8 == null) {
                                w7.W(x7);
                                w7.W(k8);
                            } else {
                                this.f43306t |= 4;
                                this.f43309w = c8;
                            }
                        } else if (x7 == 32) {
                            int k9 = eVar.k();
                            F c9 = F.c(k9);
                            if (c9 == null) {
                                w7.W(x7);
                                w7.W(k9);
                            } else {
                                this.f43306t |= 16;
                                this.f43311y = c9;
                            }
                        } else if (x7 == 40) {
                            this.f43306t |= 8;
                            this.f43310x = eVar.m();
                        } else if (x7 != 48) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            this.f43306t |= 32;
                            this.f43312z = eVar.m();
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
                    this.f43305s = t7.h();
                    throw th2;
                }
                this.f43305s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43305s = t7.h();
            throw th3;
        }
        this.f43305s = t7.h();
        g();
    }

    /* renamed from: s5.k$b */
    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43313s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f43314t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f43315u;

        /* renamed from: w, reason: collision with root package name */
        private long f43317w;

        /* renamed from: y, reason: collision with root package name */
        private long f43319y;

        /* renamed from: v, reason: collision with root package name */
        private s0 f43316v = s0.SUB_NONE;

        /* renamed from: x, reason: collision with root package name */
        private F f43318x = F.EA_UNKNOWN;

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public C6745k m() {
            C6745k c6745k = new C6745k(this);
            int i8 = this.f43313s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            c6745k.f43307u = this.f43314t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            c6745k.f43308v = this.f43315u;
            if ((i8 & 4) == 4) {
                i9 |= 4;
            }
            c6745k.f43309w = this.f43316v;
            if ((i8 & 8) == 8) {
                i9 |= 8;
            }
            c6745k.f43310x = this.f43317w;
            if ((i8 & 16) == 16) {
                i9 |= 16;
            }
            c6745k.f43311y = this.f43318x;
            if ((i8 & 32) == 32) {
                i9 |= 32;
            }
            c6745k.f43312z = this.f43319y;
            c6745k.f43306t = i9;
            return c6745k;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(C6745k c6745k) {
            if (c6745k == C6745k.r()) {
                return this;
            }
            if (c6745k.B()) {
                y(c6745k.v());
            }
            if (c6745k.C()) {
                z(c6745k.w());
            }
            if (c6745k.x()) {
                u(c6745k.q());
            }
            if (c6745k.z()) {
                w(c6745k.t());
            }
            if (c6745k.y()) {
                v(c6745k.s());
            }
            if (c6745k.A()) {
                x(c6745k.u());
            }
            k(i().c(c6745k.f43305s));
            return this;
        }

        public b u(s0 s0Var) {
            s0Var.getClass();
            this.f43313s |= 4;
            this.f43316v = s0Var;
            return this;
        }

        public b v(F f8) {
            f8.getClass();
            this.f43313s |= 16;
            this.f43318x = f8;
            return this;
        }

        public b w(long j8) {
            this.f43313s |= 8;
            this.f43317w = j8;
            return this;
        }

        public b x(long j8) {
            this.f43313s |= 32;
            this.f43319y = j8;
            return this;
        }

        public b y(boolean z7) {
            this.f43313s |= 1;
            this.f43314t = z7;
            return this;
        }

        public b z(boolean z7) {
            this.f43313s |= 2;
            this.f43315u = z7;
            return this;
        }

        private void r() {
        }
    }
}
