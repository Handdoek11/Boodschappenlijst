package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class f0 extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: C, reason: collision with root package name */
    private static final f0 f43129C;

    /* renamed from: D, reason: collision with root package name */
    public static com.google.protobuf.n f43130D = new a();

    /* renamed from: A, reason: collision with root package name */
    private int f43131A;

    /* renamed from: B, reason: collision with root package name */
    private int f43132B;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43133s;

    /* renamed from: t, reason: collision with root package name */
    private int f43134t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43135u;

    /* renamed from: v, reason: collision with root package name */
    private Object f43136v;

    /* renamed from: w, reason: collision with root package name */
    private Object f43137w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f43138x;

    /* renamed from: y, reason: collision with root package name */
    private Object f43139y;

    /* renamed from: z, reason: collision with root package name */
    private EnumC6746l f43140z;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public f0 d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new f0(eVar, fVar);
        }
    }

    static {
        f0 f0Var = new f0(true);
        f43129C = f0Var;
        f0Var.I();
    }

    private void I() {
        this.f43135u = "";
        this.f43136v = "";
        this.f43137w = "";
        this.f43138x = false;
        this.f43139y = "";
        this.f43140z = EnumC6746l.AC_LEAVE;
    }

    public static b J() {
        return b.r();
    }

    public static b K(f0 f0Var) {
        return J().u(f0Var);
    }

    public static f0 w() {
        return f43129C;
    }

    public boolean A() {
        return this.f43138x;
    }

    public com.google.protobuf.d B() {
        Object obj = this.f43137w;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43137w = n8;
        return n8;
    }

    public boolean C() {
        return (this.f43134t & 32) == 32;
    }

    public boolean D() {
        return (this.f43134t & 2) == 2;
    }

    public boolean E() {
        return (this.f43134t & 1) == 1;
    }

    public boolean F() {
        return (this.f43134t & 16) == 16;
    }

    public boolean G() {
        return (this.f43134t & 8) == 8;
    }

    public boolean H() {
        return (this.f43134t & 4) == 4;
    }

    public b L() {
        return K(this);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43132B;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f43134t & 1) == 1 ? CodedOutputStream.d(1, y()) : 0;
        if ((this.f43134t & 2) == 2) {
            d8 += CodedOutputStream.d(2, v());
        }
        if ((this.f43134t & 4) == 4) {
            d8 += CodedOutputStream.d(3, B());
        }
        if ((this.f43134t & 8) == 8) {
            d8 += CodedOutputStream.b(4, this.f43138x);
        }
        if ((this.f43134t & 16) == 16) {
            d8 += CodedOutputStream.d(5, z());
        }
        if ((this.f43134t & 32) == 32) {
            d8 += CodedOutputStream.f(6, this.f43140z.e());
        }
        int size = d8 + this.f43133s.size();
        this.f43132B = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43131A;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        if (E()) {
            this.f43131A = 1;
            return true;
        }
        this.f43131A = 0;
        return false;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43134t & 1) == 1) {
            codedOutputStream.E(1, y());
        }
        if ((this.f43134t & 2) == 2) {
            codedOutputStream.E(2, v());
        }
        if ((this.f43134t & 4) == 4) {
            codedOutputStream.E(3, B());
        }
        if ((this.f43134t & 8) == 8) {
            codedOutputStream.C(4, this.f43138x);
        }
        if ((this.f43134t & 16) == 16) {
            codedOutputStream.E(5, z());
        }
        if ((this.f43134t & 32) == 32) {
            codedOutputStream.G(6, this.f43140z.e());
        }
        codedOutputStream.S(this.f43133s);
    }

    public EnumC6746l u() {
        return this.f43140z;
    }

    public com.google.protobuf.d v() {
        Object obj = this.f43136v;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43136v = n8;
        return n8;
    }

    public String x() {
        Object obj = this.f43135u;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f43135u = J7;
        }
        return J7;
    }

    public com.google.protobuf.d y() {
        Object obj = this.f43135u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43135u = n8;
        return n8;
    }

    public com.google.protobuf.d z() {
        Object obj = this.f43139y;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43139y = n8;
        return n8;
    }

    private f0(g.a aVar) {
        super(aVar);
        this.f43131A = -1;
        this.f43132B = -1;
        this.f43133s = aVar.i();
    }

    private f0(boolean z7) {
        this.f43131A = -1;
        this.f43132B = -1;
        this.f43133s = com.google.protobuf.d.f33078o;
    }

    private f0(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43131A = -1;
        this.f43132B = -1;
        I();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 != 0) {
                        if (x7 == 10) {
                            com.google.protobuf.d j8 = eVar.j();
                            this.f43134t = 1 | this.f43134t;
                            this.f43135u = j8;
                        } else if (x7 == 18) {
                            com.google.protobuf.d j9 = eVar.j();
                            this.f43134t |= 2;
                            this.f43136v = j9;
                        } else if (x7 == 26) {
                            com.google.protobuf.d j10 = eVar.j();
                            this.f43134t |= 4;
                            this.f43137w = j10;
                        } else if (x7 == 32) {
                            this.f43134t |= 8;
                            this.f43138x = eVar.i();
                        } else if (x7 == 42) {
                            com.google.protobuf.d j11 = eVar.j();
                            this.f43134t |= 16;
                            this.f43139y = j11;
                        } else if (x7 != 48) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            int k8 = eVar.k();
                            EnumC6746l c8 = EnumC6746l.c(k8);
                            if (c8 == null) {
                                w7.W(x7);
                                w7.W(k8);
                            } else {
                                this.f43134t |= 32;
                                this.f43140z = c8;
                            }
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
                    this.f43133s = t7.h();
                    throw th2;
                }
                this.f43133s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43133s = t7.h();
            throw th3;
        }
        this.f43133s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43141s;

        /* renamed from: w, reason: collision with root package name */
        private boolean f43145w;

        /* renamed from: t, reason: collision with root package name */
        private Object f43142t = "";

        /* renamed from: u, reason: collision with root package name */
        private Object f43143u = "";

        /* renamed from: v, reason: collision with root package name */
        private Object f43144v = "";

        /* renamed from: x, reason: collision with root package name */
        private Object f43146x = "";

        /* renamed from: y, reason: collision with root package name */
        private EnumC6746l f43147y = EnumC6746l.AC_LEAVE;

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        public b A(String str) {
            str.getClass();
            this.f43141s |= 4;
            this.f43144v = str;
            return this;
        }

        public f0 m() {
            f0 p8 = p();
            if (p8.c()) {
                return p8;
            }
            throw a.AbstractC0243a.h(p8);
        }

        public f0 p() {
            f0 f0Var = new f0(this);
            int i8 = this.f43141s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            f0Var.f43135u = this.f43142t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            f0Var.f43136v = this.f43143u;
            if ((i8 & 4) == 4) {
                i9 |= 4;
            }
            f0Var.f43137w = this.f43144v;
            if ((i8 & 8) == 8) {
                i9 |= 8;
            }
            f0Var.f43138x = this.f43145w;
            if ((i8 & 16) == 16) {
                i9 |= 16;
            }
            f0Var.f43139y = this.f43146x;
            if ((i8 & 32) == 32) {
                i9 |= 32;
            }
            f0Var.f43140z = this.f43147y;
            f0Var.f43134t = i9;
            return f0Var;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().u(p());
        }

        public b u(f0 f0Var) {
            if (f0Var == f0.w()) {
                return this;
            }
            if (f0Var.E()) {
                this.f43141s |= 1;
                this.f43142t = f0Var.f43135u;
            }
            if (f0Var.D()) {
                this.f43141s |= 2;
                this.f43143u = f0Var.f43136v;
            }
            if (f0Var.H()) {
                this.f43141s |= 4;
                this.f43144v = f0Var.f43137w;
            }
            if (f0Var.G()) {
                z(f0Var.A());
            }
            if (f0Var.F()) {
                this.f43141s |= 16;
                this.f43146x = f0Var.f43139y;
            }
            if (f0Var.C()) {
                v(f0Var.u());
            }
            k(i().c(f0Var.f43133s));
            return this;
        }

        public b v(EnumC6746l enumC6746l) {
            enumC6746l.getClass();
            this.f43141s |= 32;
            this.f43147y = enumC6746l;
            return this;
        }

        public b w(String str) {
            str.getClass();
            this.f43141s |= 2;
            this.f43143u = str;
            return this;
        }

        public b x(String str) {
            str.getClass();
            this.f43141s |= 1;
            this.f43142t = str;
            return this;
        }

        public b y(String str) {
            str.getClass();
            this.f43141s |= 16;
            this.f43146x = str;
            return this;
        }

        public b z(boolean z7) {
            this.f43141s |= 8;
            this.f43145w = z7;
            return this;
        }

        private void s() {
        }
    }
}
