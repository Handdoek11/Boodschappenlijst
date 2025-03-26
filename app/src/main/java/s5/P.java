package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;
import s5.M;
import s5.O;

/* loaded from: classes2.dex */
public final class P extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: C, reason: collision with root package name */
    private static final P f42950C;

    /* renamed from: D, reason: collision with root package name */
    public static com.google.protobuf.n f42951D = new a();

    /* renamed from: A, reason: collision with root package name */
    private int f42952A;

    /* renamed from: B, reason: collision with root package name */
    private int f42953B;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f42954s;

    /* renamed from: t, reason: collision with root package name */
    private int f42955t;

    /* renamed from: u, reason: collision with root package name */
    private M f42956u;

    /* renamed from: v, reason: collision with root package name */
    private Q f42957v;

    /* renamed from: w, reason: collision with root package name */
    private O f42958w;

    /* renamed from: x, reason: collision with root package name */
    private Object f42959x;

    /* renamed from: y, reason: collision with root package name */
    private Object f42960y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f42961z;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public P d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new P(eVar, fVar);
        }
    }

    static {
        P p8 = new P(true);
        f42950C = p8;
        p8.H();
    }

    private void H() {
        this.f42956u = M.o();
        this.f42957v = Q.UNKNOWN;
        this.f42958w = O.o();
        this.f42959x = "";
        this.f42960y = "";
        this.f42961z = false;
    }

    public static b I() {
        return b.r();
    }

    public static b J(P p8) {
        return I().u(p8);
    }

    public static P s() {
        return f42950C;
    }

    public O A() {
        return this.f42958w;
    }

    public boolean B() {
        return (this.f42955t & 32) == 32;
    }

    public boolean C() {
        return (this.f42955t & 1) == 1;
    }

    public boolean D() {
        return (this.f42955t & 2) == 2;
    }

    public boolean E() {
        return (this.f42955t & 8) == 8;
    }

    public boolean F() {
        return (this.f42955t & 16) == 16;
    }

    public boolean G() {
        return (this.f42955t & 4) == 4;
    }

    public b K() {
        return J(this);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f42953B;
        if (i8 != -1) {
            return i8;
        }
        int l8 = (this.f42955t & 1) == 1 ? CodedOutputStream.l(1, this.f42956u) : 0;
        if ((this.f42955t & 2) == 2) {
            l8 += CodedOutputStream.f(2, this.f42957v.e());
        }
        if ((this.f42955t & 4) == 4) {
            l8 += CodedOutputStream.l(3, this.f42958w);
        }
        if ((this.f42955t & 8) == 8) {
            l8 += CodedOutputStream.d(4, x());
        }
        if ((this.f42955t & 16) == 16) {
            l8 += CodedOutputStream.d(5, z());
        }
        if ((this.f42955t & 32) == 32) {
            l8 += CodedOutputStream.b(6, this.f42961z);
        }
        int size = l8 + this.f42954s.size();
        this.f42953B = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f42952A;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        if (!C()) {
            this.f42952A = 0;
            return false;
        }
        if (!D()) {
            this.f42952A = 0;
            return false;
        }
        if (!u().c()) {
            this.f42952A = 0;
            return false;
        }
        if (!G() || A().c()) {
            this.f42952A = 1;
            return true;
        }
        this.f42952A = 0;
        return false;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f42955t & 1) == 1) {
            codedOutputStream.O(1, this.f42956u);
        }
        if ((this.f42955t & 2) == 2) {
            codedOutputStream.G(2, this.f42957v.e());
        }
        if ((this.f42955t & 4) == 4) {
            codedOutputStream.O(3, this.f42958w);
        }
        if ((this.f42955t & 8) == 8) {
            codedOutputStream.E(4, x());
        }
        if ((this.f42955t & 16) == 16) {
            codedOutputStream.E(5, z());
        }
        if ((this.f42955t & 32) == 32) {
            codedOutputStream.C(6, this.f42961z);
        }
        codedOutputStream.S(this.f42954s);
    }

    public boolean t() {
        return this.f42961z;
    }

    public M u() {
        return this.f42956u;
    }

    public Q v() {
        return this.f42957v;
    }

    public String w() {
        Object obj = this.f42959x;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f42959x = J7;
        }
        return J7;
    }

    public com.google.protobuf.d x() {
        Object obj = this.f42959x;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42959x = n8;
        return n8;
    }

    public String y() {
        Object obj = this.f42960y;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f42960y = J7;
        }
        return J7;
    }

    public com.google.protobuf.d z() {
        Object obj = this.f42960y;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42960y = n8;
        return n8;
    }

    private P(g.a aVar) {
        super(aVar);
        this.f42952A = -1;
        this.f42953B = -1;
        this.f42954s = aVar.i();
    }

    private P(boolean z7) {
        this.f42952A = -1;
        this.f42953B = -1;
        this.f42954s = com.google.protobuf.d.f33078o;
    }

    private P(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f42952A = -1;
        this.f42953B = -1;
        H();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 != 0) {
                        if (x7 == 10) {
                            M.b y7 = (this.f42955t & 1) == 1 ? this.f42956u.y() : null;
                            M m8 = (M) eVar.n(M.f42896z, fVar);
                            this.f42956u = m8;
                            if (y7 != null) {
                                y7.u(m8);
                                this.f42956u = y7.p();
                            }
                            this.f42955t |= 1;
                        } else if (x7 == 16) {
                            int k8 = eVar.k();
                            Q c8 = Q.c(k8);
                            if (c8 == null) {
                                w7.W(x7);
                                w7.W(k8);
                            } else {
                                this.f42955t |= 2;
                                this.f42957v = c8;
                            }
                        } else if (x7 == 26) {
                            O.b w8 = (this.f42955t & 4) == 4 ? this.f42958w.w() : null;
                            O o8 = (O) eVar.n(O.f42940z, fVar);
                            this.f42958w = o8;
                            if (w8 != null) {
                                w8.s(o8);
                                this.f42958w = w8.m();
                            }
                            this.f42955t |= 4;
                        } else if (x7 == 34) {
                            com.google.protobuf.d j8 = eVar.j();
                            this.f42955t |= 8;
                            this.f42959x = j8;
                        } else if (x7 == 42) {
                            com.google.protobuf.d j9 = eVar.j();
                            this.f42955t |= 16;
                            this.f42960y = j9;
                        } else if (x7 != 48) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            this.f42955t |= 32;
                            this.f42961z = eVar.i();
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
                    this.f42954s = t7.h();
                    throw th2;
                }
                this.f42954s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f42954s = t7.h();
            throw th3;
        }
        this.f42954s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f42962s;

        /* renamed from: t, reason: collision with root package name */
        private M f42963t = M.o();

        /* renamed from: u, reason: collision with root package name */
        private Q f42964u = Q.UNKNOWN;

        /* renamed from: v, reason: collision with root package name */
        private O f42965v = O.o();

        /* renamed from: w, reason: collision with root package name */
        private Object f42966w = "";

        /* renamed from: x, reason: collision with root package name */
        private Object f42967x = "";

        /* renamed from: y, reason: collision with root package name */
        private boolean f42968y;

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        public b A(String str) {
            str.getClass();
            this.f42962s |= 8;
            this.f42966w = str;
            return this;
        }

        public b B(String str) {
            str.getClass();
            this.f42962s |= 16;
            this.f42967x = str;
            return this;
        }

        public P m() {
            P p8 = p();
            if (p8.c()) {
                return p8;
            }
            throw a.AbstractC0243a.h(p8);
        }

        public P p() {
            P p8 = new P(this);
            int i8 = this.f42962s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            p8.f42956u = this.f42963t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            p8.f42957v = this.f42964u;
            if ((i8 & 4) == 4) {
                i9 |= 4;
            }
            p8.f42958w = this.f42965v;
            if ((i8 & 8) == 8) {
                i9 |= 8;
            }
            p8.f42959x = this.f42966w;
            if ((i8 & 16) == 16) {
                i9 |= 16;
            }
            p8.f42960y = this.f42967x;
            if ((i8 & 32) == 32) {
                i9 |= 32;
            }
            p8.f42961z = this.f42968y;
            p8.f42955t = i9;
            return p8;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().u(p());
        }

        public b u(P p8) {
            if (p8 == P.s()) {
                return this;
            }
            if (p8.C()) {
                v(p8.u());
            }
            if (p8.D()) {
                z(p8.v());
            }
            if (p8.G()) {
                w(p8.A());
            }
            if (p8.E()) {
                this.f42962s |= 8;
                this.f42966w = p8.f42959x;
            }
            if (p8.F()) {
                this.f42962s |= 16;
                this.f42967x = p8.f42960y;
            }
            if (p8.B()) {
                x(p8.t());
            }
            k(i().c(p8.f42954s));
            return this;
        }

        public b v(M m8) {
            if ((this.f42962s & 1) != 1 || this.f42963t == M.o()) {
                this.f42963t = m8;
            } else {
                this.f42963t = M.x(this.f42963t).u(m8).p();
            }
            this.f42962s |= 1;
            return this;
        }

        public b w(O o8) {
            if ((this.f42962s & 4) != 4 || this.f42965v == O.o()) {
                this.f42965v = o8;
            } else {
                this.f42965v = O.v(this.f42965v).s(o8).m();
            }
            this.f42962s |= 4;
            return this;
        }

        public b x(boolean z7) {
            this.f42962s |= 32;
            this.f42968y = z7;
            return this;
        }

        public b y(M.b bVar) {
            this.f42963t = bVar.m();
            this.f42962s |= 1;
            return this;
        }

        public b z(Q q8) {
            q8.getClass();
            this.f42962s |= 2;
            this.f42964u = q8;
            return this;
        }

        private void s() {
        }
    }
}
