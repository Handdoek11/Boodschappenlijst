package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class m0 extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: v, reason: collision with root package name */
    private static final m0 f43351v;

    /* renamed from: w, reason: collision with root package name */
    public static com.google.protobuf.n f43352w = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43353s;

    /* renamed from: t, reason: collision with root package name */
    private int f43354t;

    /* renamed from: u, reason: collision with root package name */
    private int f43355u;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public m0 d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new m0(eVar, fVar);
        }
    }

    static {
        m0 m0Var = new m0(true);
        f43351v = m0Var;
        m0Var.k();
    }

    public static m0 j() {
        return f43351v;
    }

    public static b l() {
        return b.q();
    }

    public static b m(m0 m0Var) {
        return l().s(m0Var);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43355u;
        if (i8 != -1) {
            return i8;
        }
        int size = this.f43353s.size();
        this.f43355u = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43354t;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43354t = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        codedOutputStream.S(this.f43353s);
    }

    public b n() {
        return m(this);
    }

    private m0(g.a aVar) {
        super(aVar);
        this.f43354t = -1;
        this.f43355u = -1;
        this.f43353s = aVar.i();
    }

    private m0(boolean z7) {
        this.f43354t = -1;
        this.f43355u = -1;
        this.f43353s = com.google.protobuf.d.f33078o;
    }

    private m0(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43354t = -1;
        this.f43355u = -1;
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
                    this.f43353s = t7.h();
                    throw th2;
                }
                this.f43353s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43353s = t7.h();
            throw th3;
        }
        this.f43353s = t7.h();
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

        public m0 m() {
            return new m0(this);
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(m0 m0Var) {
            if (m0Var == m0.j()) {
                return this;
            }
            k(i().c(m0Var.f43353s));
            return this;
        }

        private void r() {
        }
    }

    private void k() {
    }
}
