package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* renamed from: s5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6741g extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: A, reason: collision with root package name */
    public static com.google.protobuf.n f43148A = new a();

    /* renamed from: z, reason: collision with root package name */
    private static final C6741g f43149z;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43150s;

    /* renamed from: t, reason: collision with root package name */
    private int f43151t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f43152u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f43153v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f43154w;

    /* renamed from: x, reason: collision with root package name */
    private int f43155x;

    /* renamed from: y, reason: collision with root package name */
    private int f43156y;

    /* renamed from: s5.g$a */
    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6741g d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C6741g(eVar, fVar);
        }
    }

    static {
        C6741g c6741g = new C6741g(true);
        f43149z = c6741g;
        c6741g.u();
    }

    public static C6741g o() {
        return f43149z;
    }

    private void u() {
        this.f43152u = false;
        this.f43153v = false;
        this.f43154w = false;
    }

    public static b v() {
        return b.q();
    }

    public static b w(C6741g c6741g) {
        return v().s(c6741g);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43156y;
        if (i8 != -1) {
            return i8;
        }
        int b8 = (this.f43151t & 1) == 1 ? CodedOutputStream.b(1, this.f43152u) : 0;
        if ((this.f43151t & 2) == 2) {
            b8 += CodedOutputStream.b(2, this.f43153v);
        }
        if ((this.f43151t & 4) == 4) {
            b8 += CodedOutputStream.b(3, this.f43154w);
        }
        int size = b8 + this.f43150s.size();
        this.f43156y = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43155x;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43155x = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43151t & 1) == 1) {
            codedOutputStream.C(1, this.f43152u);
        }
        if ((this.f43151t & 2) == 2) {
            codedOutputStream.C(2, this.f43153v);
        }
        if ((this.f43151t & 4) == 4) {
            codedOutputStream.C(3, this.f43154w);
        }
        codedOutputStream.S(this.f43150s);
    }

    public boolean n() {
        return this.f43152u;
    }

    public boolean p() {
        return this.f43153v;
    }

    public boolean q() {
        return this.f43154w;
    }

    public boolean r() {
        return (this.f43151t & 1) == 1;
    }

    public boolean s() {
        return (this.f43151t & 2) == 2;
    }

    public boolean t() {
        return (this.f43151t & 4) == 4;
    }

    public b x() {
        return w(this);
    }

    private C6741g(g.a aVar) {
        super(aVar);
        this.f43155x = -1;
        this.f43156y = -1;
        this.f43150s = aVar.i();
    }

    private C6741g(boolean z7) {
        this.f43155x = -1;
        this.f43156y = -1;
        this.f43150s = com.google.protobuf.d.f33078o;
    }

    private C6741g(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43155x = -1;
        this.f43156y = -1;
        u();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 != 0) {
                        if (x7 == 8) {
                            this.f43151t |= 1;
                            this.f43152u = eVar.i();
                        } else if (x7 == 16) {
                            this.f43151t |= 2;
                            this.f43153v = eVar.i();
                        } else if (x7 != 24) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            this.f43151t |= 4;
                            this.f43154w = eVar.i();
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
                    this.f43150s = t7.h();
                    throw th2;
                }
                this.f43150s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43150s = t7.h();
            throw th3;
        }
        this.f43150s = t7.h();
        g();
    }

    /* renamed from: s5.g$b */
    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43157s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f43158t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f43159u;

        /* renamed from: v, reason: collision with root package name */
        private boolean f43160v;

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public C6741g m() {
            C6741g c6741g = new C6741g(this);
            int i8 = this.f43157s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            c6741g.f43152u = this.f43158t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            c6741g.f43153v = this.f43159u;
            if ((i8 & 4) == 4) {
                i9 |= 4;
            }
            c6741g.f43154w = this.f43160v;
            c6741g.f43151t = i9;
            return c6741g;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(C6741g c6741g) {
            if (c6741g == C6741g.o()) {
                return this;
            }
            if (c6741g.r()) {
                u(c6741g.n());
            }
            if (c6741g.s()) {
                v(c6741g.p());
            }
            if (c6741g.t()) {
                w(c6741g.q());
            }
            k(i().c(c6741g.f43150s));
            return this;
        }

        public b u(boolean z7) {
            this.f43157s |= 1;
            this.f43158t = z7;
            return this;
        }

        public b v(boolean z7) {
            this.f43157s |= 2;
            this.f43159u = z7;
            return this;
        }

        public b w(boolean z7) {
            this.f43157s |= 4;
            this.f43160v = z7;
            return this;
        }

        private void r() {
        }
    }
}
