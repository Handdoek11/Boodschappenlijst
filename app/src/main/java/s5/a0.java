package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class a0 extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: x, reason: collision with root package name */
    private static final a0 f43050x;

    /* renamed from: y, reason: collision with root package name */
    public static com.google.protobuf.n f43051y = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43052s;

    /* renamed from: t, reason: collision with root package name */
    private int f43053t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43054u;

    /* renamed from: v, reason: collision with root package name */
    private int f43055v;

    /* renamed from: w, reason: collision with root package name */
    private int f43056w;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public a0 d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new a0(eVar, fVar);
        }
    }

    static {
        a0 a0Var = new a0(true);
        f43050x = a0Var;
        a0Var.q();
    }

    public static a0 m() {
        return f43050x;
    }

    private void q() {
        this.f43054u = "";
    }

    public static b r() {
        return b.q();
    }

    public static b s(a0 a0Var) {
        return r().s(a0Var);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43056w;
        if (i8 != -1) {
            return i8;
        }
        int d8 = ((this.f43053t & 1) == 1 ? CodedOutputStream.d(1, o()) : 0) + this.f43052s.size();
        this.f43056w = d8;
        return d8;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43055v;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43055v = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43053t & 1) == 1) {
            codedOutputStream.E(1, o());
        }
        codedOutputStream.S(this.f43052s);
    }

    public String n() {
        Object obj = this.f43054u;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f43054u = J7;
        }
        return J7;
    }

    public com.google.protobuf.d o() {
        Object obj = this.f43054u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43054u = n8;
        return n8;
    }

    public boolean p() {
        return (this.f43053t & 1) == 1;
    }

    public b t() {
        return s(this);
    }

    private a0(g.a aVar) {
        super(aVar);
        this.f43055v = -1;
        this.f43056w = -1;
        this.f43052s = aVar.i();
    }

    private a0(boolean z7) {
        this.f43055v = -1;
        this.f43056w = -1;
        this.f43052s = com.google.protobuf.d.f33078o;
    }

    private a0(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43055v = -1;
        this.f43056w = -1;
        q();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 != 0) {
                        if (x7 != 10) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            com.google.protobuf.d j8 = eVar.j();
                            this.f43053t = 1 | this.f43053t;
                            this.f43054u = j8;
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
                    this.f43052s = t7.h();
                    throw th2;
                }
                this.f43052s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43052s = t7.h();
            throw th3;
        }
        this.f43052s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43057s;

        /* renamed from: t, reason: collision with root package name */
        private Object f43058t = "";

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public a0 m() {
            a0 a0Var = new a0(this);
            int i8 = (this.f43057s & 1) != 1 ? 0 : 1;
            a0Var.f43054u = this.f43058t;
            a0Var.f43053t = i8;
            return a0Var;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(a0 a0Var) {
            if (a0Var == a0.m()) {
                return this;
            }
            if (a0Var.p()) {
                this.f43057s |= 1;
                this.f43058t = a0Var.f43054u;
            }
            k(i().c(a0Var.f43052s));
            return this;
        }

        private void r() {
        }
    }
}
