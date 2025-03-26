package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class k0 extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: x, reason: collision with root package name */
    private static final k0 f43320x;

    /* renamed from: y, reason: collision with root package name */
    public static com.google.protobuf.n f43321y = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43322s;

    /* renamed from: t, reason: collision with root package name */
    private int f43323t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43324u;

    /* renamed from: v, reason: collision with root package name */
    private int f43325v;

    /* renamed from: w, reason: collision with root package name */
    private int f43326w;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public k0 d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new k0(eVar, fVar);
        }
    }

    static {
        k0 k0Var = new k0(true);
        f43320x = k0Var;
        k0Var.q();
    }

    public static k0 m() {
        return f43320x;
    }

    private void q() {
        this.f43324u = "";
    }

    public static b r() {
        return b.q();
    }

    public static b s(k0 k0Var) {
        return r().s(k0Var);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43326w;
        if (i8 != -1) {
            return i8;
        }
        int d8 = ((this.f43323t & 1) == 1 ? CodedOutputStream.d(1, o()) : 0) + this.f43322s.size();
        this.f43326w = d8;
        return d8;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43325v;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43325v = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43323t & 1) == 1) {
            codedOutputStream.E(1, o());
        }
        codedOutputStream.S(this.f43322s);
    }

    public String n() {
        Object obj = this.f43324u;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f43324u = J7;
        }
        return J7;
    }

    public com.google.protobuf.d o() {
        Object obj = this.f43324u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43324u = n8;
        return n8;
    }

    public boolean p() {
        return (this.f43323t & 1) == 1;
    }

    public b t() {
        return s(this);
    }

    private k0(g.a aVar) {
        super(aVar);
        this.f43325v = -1;
        this.f43326w = -1;
        this.f43322s = aVar.i();
    }

    private k0(boolean z7) {
        this.f43325v = -1;
        this.f43326w = -1;
        this.f43322s = com.google.protobuf.d.f33078o;
    }

    private k0(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43325v = -1;
        this.f43326w = -1;
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
                            this.f43323t = 1 | this.f43323t;
                            this.f43324u = j8;
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
                    this.f43322s = t7.h();
                    throw th2;
                }
                this.f43322s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43322s = t7.h();
            throw th3;
        }
        this.f43322s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43327s;

        /* renamed from: t, reason: collision with root package name */
        private Object f43328t = "";

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public k0 m() {
            k0 k0Var = new k0(this);
            int i8 = (this.f43327s & 1) != 1 ? 0 : 1;
            k0Var.f43324u = this.f43328t;
            k0Var.f43323t = i8;
            return k0Var;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(k0 k0Var) {
            if (k0Var == k0.m()) {
                return this;
            }
            if (k0Var.p()) {
                this.f43327s |= 1;
                this.f43328t = k0Var.f43324u;
            }
            k(i().c(k0Var.f43322s));
            return this;
        }

        private void r() {
        }
    }
}
