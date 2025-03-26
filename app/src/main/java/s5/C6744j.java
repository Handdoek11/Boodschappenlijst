package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* renamed from: s5.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6744j extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: x, reason: collision with root package name */
    private static final C6744j f43281x;

    /* renamed from: y, reason: collision with root package name */
    public static com.google.protobuf.n f43282y = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43283s;

    /* renamed from: t, reason: collision with root package name */
    private int f43284t;

    /* renamed from: u, reason: collision with root package name */
    private com.google.protobuf.d f43285u;

    /* renamed from: v, reason: collision with root package name */
    private int f43286v;

    /* renamed from: w, reason: collision with root package name */
    private int f43287w;

    /* renamed from: s5.j$a */
    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6744j d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C6744j(eVar, fVar);
        }
    }

    static {
        C6744j c6744j = new C6744j(true);
        f43281x = c6744j;
        c6744j.o();
    }

    public static C6744j m() {
        return f43281x;
    }

    private void o() {
        this.f43285u = com.google.protobuf.d.f33078o;
    }

    public static b p() {
        return b.q();
    }

    public static b q(C6744j c6744j) {
        return p().s(c6744j);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43287w;
        if (i8 != -1) {
            return i8;
        }
        int d8 = ((this.f43284t & 1) == 1 ? CodedOutputStream.d(1, this.f43285u) : 0) + this.f43283s.size();
        this.f43287w = d8;
        return d8;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43286v;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        if (n()) {
            this.f43286v = 1;
            return true;
        }
        this.f43286v = 0;
        return false;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43284t & 1) == 1) {
            codedOutputStream.E(1, this.f43285u);
        }
        codedOutputStream.S(this.f43283s);
    }

    public com.google.protobuf.d l() {
        return this.f43285u;
    }

    public boolean n() {
        return (this.f43284t & 1) == 1;
    }

    public b r() {
        return q(this);
    }

    private C6744j(g.a aVar) {
        super(aVar);
        this.f43286v = -1;
        this.f43287w = -1;
        this.f43283s = aVar.i();
    }

    private C6744j(boolean z7) {
        this.f43286v = -1;
        this.f43287w = -1;
        this.f43283s = com.google.protobuf.d.f33078o;
    }

    private C6744j(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43286v = -1;
        this.f43287w = -1;
        o();
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
                            this.f43284t |= 1;
                            this.f43285u = eVar.j();
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
                    this.f43283s = t7.h();
                    throw th2;
                }
                this.f43283s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43283s = t7.h();
            throw th3;
        }
        this.f43283s = t7.h();
        g();
    }

    /* renamed from: s5.j$b */
    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43288s;

        /* renamed from: t, reason: collision with root package name */
        private com.google.protobuf.d f43289t = com.google.protobuf.d.f33078o;

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public C6744j m() {
            C6744j c6744j = new C6744j(this);
            int i8 = (this.f43288s & 1) != 1 ? 0 : 1;
            c6744j.f43285u = this.f43289t;
            c6744j.f43284t = i8;
            return c6744j;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(C6744j c6744j) {
            if (c6744j == C6744j.m()) {
                return this;
            }
            if (c6744j.n()) {
                u(c6744j.l());
            }
            k(i().c(c6744j.f43283s));
            return this;
        }

        public b u(com.google.protobuf.d dVar) {
            dVar.getClass();
            this.f43288s |= 1;
            this.f43289t = dVar;
            return this;
        }

        private void r() {
        }
    }
}
