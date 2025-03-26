package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class t0 extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: A, reason: collision with root package name */
    public static com.google.protobuf.n f43566A = new a();

    /* renamed from: z, reason: collision with root package name */
    private static final t0 f43567z;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43568s;

    /* renamed from: t, reason: collision with root package name */
    private int f43569t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43570u;

    /* renamed from: v, reason: collision with root package name */
    private com.google.protobuf.d f43571v;

    /* renamed from: w, reason: collision with root package name */
    private Object f43572w;

    /* renamed from: x, reason: collision with root package name */
    private int f43573x;

    /* renamed from: y, reason: collision with root package name */
    private int f43574y;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public t0 d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new t0(eVar, fVar);
        }
    }

    static {
        t0 t0Var = new t0(true);
        f43567z = t0Var;
        t0Var.w();
    }

    public static t0 p() {
        return f43567z;
    }

    private void w() {
        this.f43570u = "";
        this.f43571v = com.google.protobuf.d.f33078o;
        this.f43572w = "";
    }

    public static b x() {
        return b.r();
    }

    public static b y(t0 t0Var) {
        return x().u(t0Var);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43574y;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f43569t & 1) == 1 ? CodedOutputStream.d(1, r()) : 0;
        if ((this.f43569t & 2) == 2) {
            d8 += CodedOutputStream.d(2, this.f43571v);
        }
        if ((this.f43569t & 4) == 4) {
            d8 += CodedOutputStream.d(3, s());
        }
        int size = d8 + this.f43568s.size();
        this.f43574y = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43573x;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43573x = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43569t & 1) == 1) {
            codedOutputStream.E(1, r());
        }
        if ((this.f43569t & 2) == 2) {
            codedOutputStream.E(2, this.f43571v);
        }
        if ((this.f43569t & 4) == 4) {
            codedOutputStream.E(3, s());
        }
        codedOutputStream.S(this.f43568s);
    }

    public com.google.protobuf.d q() {
        return this.f43571v;
    }

    public com.google.protobuf.d r() {
        Object obj = this.f43570u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43570u = n8;
        return n8;
    }

    public com.google.protobuf.d s() {
        Object obj = this.f43572w;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43572w = n8;
        return n8;
    }

    public boolean t() {
        return (this.f43569t & 2) == 2;
    }

    public boolean u() {
        return (this.f43569t & 1) == 1;
    }

    public boolean v() {
        return (this.f43569t & 4) == 4;
    }

    public b z() {
        return y(this);
    }

    private t0(g.a aVar) {
        super(aVar);
        this.f43573x = -1;
        this.f43574y = -1;
        this.f43568s = aVar.i();
    }

    private t0(boolean z7) {
        this.f43573x = -1;
        this.f43574y = -1;
        this.f43568s = com.google.protobuf.d.f33078o;
    }

    private t0(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43573x = -1;
        this.f43574y = -1;
        w();
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
                            this.f43569t = 1 | this.f43569t;
                            this.f43570u = j8;
                        } else if (x7 == 18) {
                            this.f43569t |= 2;
                            this.f43571v = eVar.j();
                        } else if (x7 != 26) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            com.google.protobuf.d j9 = eVar.j();
                            this.f43569t |= 4;
                            this.f43572w = j9;
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
                    this.f43568s = t7.h();
                    throw th2;
                }
                this.f43568s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43568s = t7.h();
            throw th3;
        }
        this.f43568s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43575s;

        /* renamed from: t, reason: collision with root package name */
        private Object f43576t = "";

        /* renamed from: u, reason: collision with root package name */
        private com.google.protobuf.d f43577u = com.google.protobuf.d.f33078o;

        /* renamed from: v, reason: collision with root package name */
        private Object f43578v = "";

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        public t0 m() {
            t0 p8 = p();
            if (p8.c()) {
                return p8;
            }
            throw a.AbstractC0243a.h(p8);
        }

        public t0 p() {
            t0 t0Var = new t0(this);
            int i8 = this.f43575s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            t0Var.f43570u = this.f43576t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            t0Var.f43571v = this.f43577u;
            if ((i8 & 4) == 4) {
                i9 |= 4;
            }
            t0Var.f43572w = this.f43578v;
            t0Var.f43569t = i9;
            return t0Var;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().u(p());
        }

        public b u(t0 t0Var) {
            if (t0Var == t0.p()) {
                return this;
            }
            if (t0Var.u()) {
                this.f43575s |= 1;
                this.f43576t = t0Var.f43570u;
            }
            if (t0Var.t()) {
                v(t0Var.q());
            }
            if (t0Var.v()) {
                this.f43575s |= 4;
                this.f43578v = t0Var.f43572w;
            }
            k(i().c(t0Var.f43568s));
            return this;
        }

        public b v(com.google.protobuf.d dVar) {
            dVar.getClass();
            this.f43575s |= 2;
            this.f43577u = dVar;
            return this;
        }

        public b w(String str) {
            str.getClass();
            this.f43575s |= 1;
            this.f43576t = str;
            return this;
        }

        public b x(String str) {
            str.getClass();
            this.f43575s |= 4;
            this.f43578v = str;
            return this;
        }

        private void s() {
        }
    }
}
