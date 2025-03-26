package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class l0 extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: x, reason: collision with root package name */
    private static final l0 f43335x;

    /* renamed from: y, reason: collision with root package name */
    public static com.google.protobuf.n f43336y = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43337s;

    /* renamed from: t, reason: collision with root package name */
    private int f43338t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43339u;

    /* renamed from: v, reason: collision with root package name */
    private int f43340v;

    /* renamed from: w, reason: collision with root package name */
    private int f43341w;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public l0 d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new l0(eVar, fVar);
        }
    }

    static {
        l0 l0Var = new l0(true);
        f43335x = l0Var;
        l0Var.p();
    }

    public static l0 m() {
        return f43335x;
    }

    private void p() {
        this.f43339u = "";
    }

    public static b q() {
        return b.r();
    }

    public static b r(l0 l0Var) {
        return q().u(l0Var);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43341w;
        if (i8 != -1) {
            return i8;
        }
        int d8 = ((this.f43338t & 1) == 1 ? CodedOutputStream.d(1, n()) : 0) + this.f43337s.size();
        this.f43341w = d8;
        return d8;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43340v;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43340v = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43338t & 1) == 1) {
            codedOutputStream.E(1, n());
        }
        codedOutputStream.S(this.f43337s);
    }

    public com.google.protobuf.d n() {
        Object obj = this.f43339u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43339u = n8;
        return n8;
    }

    public boolean o() {
        return (this.f43338t & 1) == 1;
    }

    public b s() {
        return r(this);
    }

    private l0(g.a aVar) {
        super(aVar);
        this.f43340v = -1;
        this.f43341w = -1;
        this.f43337s = aVar.i();
    }

    private l0(boolean z7) {
        this.f43340v = -1;
        this.f43341w = -1;
        this.f43337s = com.google.protobuf.d.f33078o;
    }

    private l0(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43340v = -1;
        this.f43341w = -1;
        p();
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
                            this.f43338t = 1 | this.f43338t;
                            this.f43339u = j8;
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
                    this.f43337s = t7.h();
                    throw th2;
                }
                this.f43337s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43337s = t7.h();
            throw th3;
        }
        this.f43337s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43342s;

        /* renamed from: t, reason: collision with root package name */
        private Object f43343t = "";

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        public l0 m() {
            l0 p8 = p();
            if (p8.c()) {
                return p8;
            }
            throw a.AbstractC0243a.h(p8);
        }

        public l0 p() {
            l0 l0Var = new l0(this);
            int i8 = (this.f43342s & 1) != 1 ? 0 : 1;
            l0Var.f43339u = this.f43343t;
            l0Var.f43338t = i8;
            return l0Var;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().u(p());
        }

        public b u(l0 l0Var) {
            if (l0Var == l0.m()) {
                return this;
            }
            if (l0Var.o()) {
                this.f43342s |= 1;
                this.f43343t = l0Var.f43339u;
            }
            k(i().c(l0Var.f43337s));
            return this;
        }

        public b v(String str) {
            str.getClass();
            this.f43342s |= 1;
            this.f43343t = str;
            return this;
        }

        private void s() {
        }
    }
}
