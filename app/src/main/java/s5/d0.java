package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class d0 extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: y, reason: collision with root package name */
    private static final d0 f43096y;

    /* renamed from: z, reason: collision with root package name */
    public static com.google.protobuf.n f43097z = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43098s;

    /* renamed from: t, reason: collision with root package name */
    private int f43099t;

    /* renamed from: u, reason: collision with root package name */
    private com.google.protobuf.d f43100u;

    /* renamed from: v, reason: collision with root package name */
    private Object f43101v;

    /* renamed from: w, reason: collision with root package name */
    private int f43102w;

    /* renamed from: x, reason: collision with root package name */
    private int f43103x;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public d0 d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new d0(eVar, fVar);
        }
    }

    static {
        d0 d0Var = new d0(true);
        f43096y = d0Var;
        d0Var.s();
    }

    public static d0 n() {
        return f43096y;
    }

    private void s() {
        this.f43100u = com.google.protobuf.d.f33078o;
        this.f43101v = "";
    }

    public static b t() {
        return b.q();
    }

    public static b u(d0 d0Var) {
        return t().s(d0Var);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43103x;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f43099t & 1) == 1 ? CodedOutputStream.d(1, this.f43100u) : 0;
        if ((this.f43099t & 2) == 2) {
            d8 += CodedOutputStream.d(2, p());
        }
        int size = d8 + this.f43098s.size();
        this.f43103x = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43102w;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43102w = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43099t & 1) == 1) {
            codedOutputStream.E(1, this.f43100u);
        }
        if ((this.f43099t & 2) == 2) {
            codedOutputStream.E(2, p());
        }
        codedOutputStream.S(this.f43098s);
    }

    public com.google.protobuf.d o() {
        return this.f43100u;
    }

    public com.google.protobuf.d p() {
        Object obj = this.f43101v;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43101v = n8;
        return n8;
    }

    public boolean q() {
        return (this.f43099t & 1) == 1;
    }

    public boolean r() {
        return (this.f43099t & 2) == 2;
    }

    public b v() {
        return u(this);
    }

    private d0(g.a aVar) {
        super(aVar);
        this.f43102w = -1;
        this.f43103x = -1;
        this.f43098s = aVar.i();
    }

    private d0(boolean z7) {
        this.f43102w = -1;
        this.f43103x = -1;
        this.f43098s = com.google.protobuf.d.f33078o;
    }

    private d0(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43102w = -1;
        this.f43103x = -1;
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
                            this.f43099t |= 1;
                            this.f43100u = eVar.j();
                        } else if (x7 != 18) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            com.google.protobuf.d j8 = eVar.j();
                            this.f43099t |= 2;
                            this.f43101v = j8;
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
                    this.f43098s = t7.h();
                    throw th2;
                }
                this.f43098s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43098s = t7.h();
            throw th3;
        }
        this.f43098s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43104s;

        /* renamed from: t, reason: collision with root package name */
        private com.google.protobuf.d f43105t = com.google.protobuf.d.f33078o;

        /* renamed from: u, reason: collision with root package name */
        private Object f43106u = "";

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public d0 m() {
            d0 d0Var = new d0(this);
            int i8 = this.f43104s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            d0Var.f43100u = this.f43105t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            d0Var.f43101v = this.f43106u;
            d0Var.f43099t = i9;
            return d0Var;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(d0 d0Var) {
            if (d0Var == d0.n()) {
                return this;
            }
            if (d0Var.q()) {
                u(d0Var.o());
            }
            if (d0Var.r()) {
                this.f43104s |= 2;
                this.f43106u = d0Var.f43101v;
            }
            k(i().c(d0Var.f43098s));
            return this;
        }

        public b u(com.google.protobuf.d dVar) {
            dVar.getClass();
            this.f43104s |= 1;
            this.f43105t = dVar;
            return this;
        }

        private void r() {
        }
    }
}
