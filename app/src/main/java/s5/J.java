package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class J extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: A, reason: collision with root package name */
    public static com.google.protobuf.n f42839A = new a();

    /* renamed from: z, reason: collision with root package name */
    private static final J f42840z;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f42841s;

    /* renamed from: t, reason: collision with root package name */
    private int f42842t;

    /* renamed from: u, reason: collision with root package name */
    private Object f42843u;

    /* renamed from: v, reason: collision with root package name */
    private Object f42844v;

    /* renamed from: w, reason: collision with root package name */
    private c0 f42845w;

    /* renamed from: x, reason: collision with root package name */
    private int f42846x;

    /* renamed from: y, reason: collision with root package name */
    private int f42847y;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public J d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new J(eVar, fVar);
        }
    }

    static {
        J j8 = new J(true);
        f42840z = j8;
        j8.w();
    }

    public static J p() {
        return f42840z;
    }

    private void w() {
        this.f42843u = "";
        this.f42844v = "";
        this.f42845w = c0.PS_UNSPECIFIED;
    }

    public static b x() {
        return b.r();
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f42847y;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f42842t & 1) == 1 ? CodedOutputStream.d(1, q()) : 0;
        if ((this.f42842t & 2) == 2) {
            d8 += CodedOutputStream.d(2, s());
        }
        if ((this.f42842t & 4) == 4) {
            d8 += CodedOutputStream.f(3, this.f42845w.e());
        }
        int size = d8 + this.f42841s.size();
        this.f42847y = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f42846x;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f42846x = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f42842t & 1) == 1) {
            codedOutputStream.E(1, q());
        }
        if ((this.f42842t & 2) == 2) {
            codedOutputStream.E(2, s());
        }
        if ((this.f42842t & 4) == 4) {
            codedOutputStream.G(3, this.f42845w.e());
        }
        codedOutputStream.S(this.f42841s);
    }

    public com.google.protobuf.d q() {
        Object obj = this.f42843u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42843u = n8;
        return n8;
    }

    public c0 r() {
        return this.f42845w;
    }

    public com.google.protobuf.d s() {
        Object obj = this.f42844v;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42844v = n8;
        return n8;
    }

    public boolean t() {
        return (this.f42842t & 1) == 1;
    }

    public boolean u() {
        return (this.f42842t & 4) == 4;
    }

    public boolean v() {
        return (this.f42842t & 2) == 2;
    }

    private J(g.a aVar) {
        super(aVar);
        this.f42846x = -1;
        this.f42847y = -1;
        this.f42841s = aVar.i();
    }

    private J(boolean z7) {
        this.f42846x = -1;
        this.f42847y = -1;
        this.f42841s = com.google.protobuf.d.f33078o;
    }

    private J(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f42846x = -1;
        this.f42847y = -1;
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
                            this.f42842t = 1 | this.f42842t;
                            this.f42843u = j8;
                        } else if (x7 == 18) {
                            com.google.protobuf.d j9 = eVar.j();
                            this.f42842t |= 2;
                            this.f42844v = j9;
                        } else if (x7 != 24) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            int k8 = eVar.k();
                            c0 c8 = c0.c(k8);
                            if (c8 == null) {
                                w7.W(x7);
                                w7.W(k8);
                            } else {
                                this.f42842t |= 4;
                                this.f42845w = c8;
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
                    this.f42841s = t7.h();
                    throw th2;
                }
                this.f42841s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f42841s = t7.h();
            throw th3;
        }
        this.f42841s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f42848s;

        /* renamed from: t, reason: collision with root package name */
        private Object f42849t = "";

        /* renamed from: u, reason: collision with root package name */
        private Object f42850u = "";

        /* renamed from: v, reason: collision with root package name */
        private c0 f42851v = c0.PS_UNSPECIFIED;

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        public J m() {
            J p8 = p();
            if (p8.c()) {
                return p8;
            }
            throw a.AbstractC0243a.h(p8);
        }

        public J p() {
            J j8 = new J(this);
            int i8 = this.f42848s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            j8.f42843u = this.f42849t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            j8.f42844v = this.f42850u;
            if ((i8 & 4) == 4) {
                i9 |= 4;
            }
            j8.f42845w = this.f42851v;
            j8.f42842t = i9;
            return j8;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().u(p());
        }

        public b u(J j8) {
            if (j8 == J.p()) {
                return this;
            }
            if (j8.t()) {
                this.f42848s |= 1;
                this.f42849t = j8.f42843u;
            }
            if (j8.v()) {
                this.f42848s |= 2;
                this.f42850u = j8.f42844v;
            }
            if (j8.u()) {
                w(j8.r());
            }
            k(i().c(j8.f42841s));
            return this;
        }

        public b v(String str) {
            str.getClass();
            this.f42848s |= 1;
            this.f42849t = str;
            return this;
        }

        public b w(c0 c0Var) {
            c0Var.getClass();
            this.f42848s |= 4;
            this.f42851v = c0Var;
            return this;
        }

        public b x(String str) {
            str.getClass();
            this.f42848s |= 2;
            this.f42850u = str;
            return this;
        }

        private void s() {
        }
    }
}
