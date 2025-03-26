package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class u0 extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: v, reason: collision with root package name */
    private static final u0 f43616v;

    /* renamed from: w, reason: collision with root package name */
    public static com.google.protobuf.n f43617w = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43618s;

    /* renamed from: t, reason: collision with root package name */
    private int f43619t;

    /* renamed from: u, reason: collision with root package name */
    private int f43620u;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public u0 d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new u0(eVar, fVar);
        }
    }

    static {
        u0 u0Var = new u0(true);
        f43616v = u0Var;
        u0Var.k();
    }

    public static u0 j() {
        return f43616v;
    }

    public static b l() {
        return b.q();
    }

    public static b m(u0 u0Var) {
        return l().s(u0Var);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43620u;
        if (i8 != -1) {
            return i8;
        }
        int size = this.f43618s.size();
        this.f43620u = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43619t;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43619t = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        codedOutputStream.S(this.f43618s);
    }

    public b n() {
        return m(this);
    }

    private u0(g.a aVar) {
        super(aVar);
        this.f43619t = -1;
        this.f43620u = -1;
        this.f43618s = aVar.i();
    }

    private u0(boolean z7) {
        this.f43619t = -1;
        this.f43620u = -1;
        this.f43618s = com.google.protobuf.d.f33078o;
    }

    private u0(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43619t = -1;
        this.f43620u = -1;
        k();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 == 0 || !h(eVar, w7, fVar, x7)) {
                        z7 = true;
                    }
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
                    this.f43618s = t7.h();
                    throw th2;
                }
                this.f43618s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43618s = t7.h();
            throw th3;
        }
        this.f43618s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {
        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public u0 m() {
            return new u0(this);
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(u0 u0Var) {
            if (u0Var == u0.j()) {
                return this;
            }
            k(i().c(u0Var.f43618s));
            return this;
        }

        private void r() {
        }
    }

    private void k() {
    }
}
