package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class e0 extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: y, reason: collision with root package name */
    private static final e0 f43107y;

    /* renamed from: z, reason: collision with root package name */
    public static com.google.protobuf.n f43108z = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43109s;

    /* renamed from: t, reason: collision with root package name */
    private int f43110t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43111u;

    /* renamed from: v, reason: collision with root package name */
    private Object f43112v;

    /* renamed from: w, reason: collision with root package name */
    private int f43113w;

    /* renamed from: x, reason: collision with root package name */
    private int f43114x;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public e0 d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new e0(eVar, fVar);
        }
    }

    static {
        e0 e0Var = new e0(true);
        f43107y = e0Var;
        e0Var.t();
    }

    public static e0 o() {
        return f43107y;
    }

    private void t() {
        this.f43111u = "";
        this.f43112v = "";
    }

    public static b u() {
        return b.q();
    }

    public static b v(e0 e0Var) {
        return u().s(e0Var);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43114x;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f43110t & 1) == 1 ? CodedOutputStream.d(1, q()) : 0;
        if ((this.f43110t & 2) == 2) {
            d8 += CodedOutputStream.d(2, p());
        }
        int size = d8 + this.f43109s.size();
        this.f43114x = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43113w;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43113w = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43110t & 1) == 1) {
            codedOutputStream.E(1, q());
        }
        if ((this.f43110t & 2) == 2) {
            codedOutputStream.E(2, p());
        }
        codedOutputStream.S(this.f43109s);
    }

    public com.google.protobuf.d p() {
        Object obj = this.f43112v;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43112v = n8;
        return n8;
    }

    public com.google.protobuf.d q() {
        Object obj = this.f43111u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43111u = n8;
        return n8;
    }

    public boolean r() {
        return (this.f43110t & 2) == 2;
    }

    public boolean s() {
        return (this.f43110t & 1) == 1;
    }

    public b w() {
        return v(this);
    }

    private e0(g.a aVar) {
        super(aVar);
        this.f43113w = -1;
        this.f43114x = -1;
        this.f43109s = aVar.i();
    }

    private e0(boolean z7) {
        this.f43113w = -1;
        this.f43114x = -1;
        this.f43109s = com.google.protobuf.d.f33078o;
    }

    private e0(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43113w = -1;
        this.f43114x = -1;
        t();
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
                            this.f43110t = 1 | this.f43110t;
                            this.f43111u = j8;
                        } else if (x7 != 18) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            com.google.protobuf.d j9 = eVar.j();
                            this.f43110t |= 2;
                            this.f43112v = j9;
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
                    this.f43109s = t7.h();
                    throw th2;
                }
                this.f43109s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43109s = t7.h();
            throw th3;
        }
        this.f43109s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43115s;

        /* renamed from: t, reason: collision with root package name */
        private Object f43116t = "";

        /* renamed from: u, reason: collision with root package name */
        private Object f43117u = "";

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public e0 m() {
            e0 e0Var = new e0(this);
            int i8 = this.f43115s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            e0Var.f43111u = this.f43116t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            e0Var.f43112v = this.f43117u;
            e0Var.f43110t = i9;
            return e0Var;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(e0 e0Var) {
            if (e0Var == e0.o()) {
                return this;
            }
            if (e0Var.s()) {
                this.f43115s |= 1;
                this.f43116t = e0Var.f43111u;
            }
            if (e0Var.r()) {
                this.f43115s |= 2;
                this.f43117u = e0Var.f43112v;
            }
            k(i().c(e0Var.f43109s));
            return this;
        }

        private void r() {
        }
    }
}
