package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;
import s5.C6753t;

/* loaded from: classes2.dex */
public final class j0 extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: y, reason: collision with root package name */
    private static final j0 f43290y;

    /* renamed from: z, reason: collision with root package name */
    public static com.google.protobuf.n f43291z = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43292s;

    /* renamed from: t, reason: collision with root package name */
    private int f43293t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43294u;

    /* renamed from: v, reason: collision with root package name */
    private C6753t f43295v;

    /* renamed from: w, reason: collision with root package name */
    private int f43296w;

    /* renamed from: x, reason: collision with root package name */
    private int f43297x;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public j0 d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new j0(eVar, fVar);
        }
    }

    static {
        j0 j0Var = new j0(true);
        f43290y = j0Var;
        j0Var.s();
    }

    public static j0 o() {
        return f43290y;
    }

    private void s() {
        this.f43294u = "";
        this.f43295v = C6753t.R();
    }

    public static b t() {
        return b.r();
    }

    public static b u(j0 j0Var) {
        return t().v(j0Var);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43297x;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f43293t & 1) == 1 ? CodedOutputStream.d(1, p()) : 0;
        if ((this.f43293t & 2) == 2) {
            d8 += CodedOutputStream.l(2, this.f43295v);
        }
        int size = d8 + this.f43292s.size();
        this.f43297x = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43296w;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        if (r()) {
            this.f43296w = 1;
            return true;
        }
        this.f43296w = 0;
        return false;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43293t & 1) == 1) {
            codedOutputStream.E(1, p());
        }
        if ((this.f43293t & 2) == 2) {
            codedOutputStream.O(2, this.f43295v);
        }
        codedOutputStream.S(this.f43292s);
    }

    public C6753t n() {
        return this.f43295v;
    }

    public com.google.protobuf.d p() {
        Object obj = this.f43294u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43294u = n8;
        return n8;
    }

    public boolean q() {
        return (this.f43293t & 2) == 2;
    }

    public boolean r() {
        return (this.f43293t & 1) == 1;
    }

    public b v() {
        return u(this);
    }

    private j0(g.a aVar) {
        super(aVar);
        this.f43296w = -1;
        this.f43297x = -1;
        this.f43292s = aVar.i();
    }

    private j0(boolean z7) {
        this.f43296w = -1;
        this.f43297x = -1;
        this.f43292s = com.google.protobuf.d.f33078o;
    }

    private j0(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43296w = -1;
        this.f43297x = -1;
        s();
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
                            this.f43293t = 1 | this.f43293t;
                            this.f43294u = j8;
                        } else if (x7 != 18) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            C6753t.c z02 = (this.f43293t & 2) == 2 ? this.f43295v.z0() : null;
                            C6753t c6753t = (C6753t) eVar.n(C6753t.f43516P, fVar);
                            this.f43295v = c6753t;
                            if (z02 != null) {
                                z02.w(c6753t);
                                this.f43295v = z02.q();
                            }
                            this.f43293t |= 2;
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
                    this.f43292s = t7.h();
                    throw th2;
                }
                this.f43292s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43292s = t7.h();
            throw th3;
        }
        this.f43292s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43298s;

        /* renamed from: t, reason: collision with root package name */
        private Object f43299t = "";

        /* renamed from: u, reason: collision with root package name */
        private C6753t f43300u = C6753t.R();

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        public j0 m() {
            j0 p8 = p();
            if (p8.c()) {
                return p8;
            }
            throw a.AbstractC0243a.h(p8);
        }

        public j0 p() {
            j0 j0Var = new j0(this);
            int i8 = this.f43298s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            j0Var.f43294u = this.f43299t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            j0Var.f43295v = this.f43300u;
            j0Var.f43293t = i9;
            return j0Var;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().v(p());
        }

        public b u(C6753t c6753t) {
            if ((this.f43298s & 2) != 2 || this.f43300u == C6753t.R()) {
                this.f43300u = c6753t;
            } else {
                this.f43300u = C6753t.y0(this.f43300u).w(c6753t).q();
            }
            this.f43298s |= 2;
            return this;
        }

        public b v(j0 j0Var) {
            if (j0Var == j0.o()) {
                return this;
            }
            if (j0Var.r()) {
                this.f43298s |= 1;
                this.f43299t = j0Var.f43294u;
            }
            if (j0Var.q()) {
                u(j0Var.n());
            }
            k(i().c(j0Var.f43292s));
            return this;
        }

        public b w(C6753t c6753t) {
            c6753t.getClass();
            this.f43300u = c6753t;
            this.f43298s |= 2;
            return this;
        }

        public b x(String str) {
            str.getClass();
            this.f43298s |= 1;
            this.f43299t = str;
            return this;
        }

        private void s() {
        }
    }
}
