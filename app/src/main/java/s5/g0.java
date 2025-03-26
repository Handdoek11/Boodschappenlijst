package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.IOException;
import s5.I;

/* loaded from: classes2.dex */
public final class g0 extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: A, reason: collision with root package name */
    public static com.google.protobuf.n f43161A = new a();

    /* renamed from: z, reason: collision with root package name */
    private static final g0 f43162z;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43163s;

    /* renamed from: t, reason: collision with root package name */
    private int f43164t;

    /* renamed from: u, reason: collision with root package name */
    private c f43165u;

    /* renamed from: v, reason: collision with root package name */
    private I f43166v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f43167w;

    /* renamed from: x, reason: collision with root package name */
    private int f43168x;

    /* renamed from: y, reason: collision with root package name */
    private int f43169y;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public g0 d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new g0(eVar, fVar);
        }
    }

    public enum c {
        EMAIL_SENT(0, 0),
        REPARENTED(1, 1),
        CREATED_ACCOUNT(2, 2),
        INVALID_PASSWORD(3, 3),
        INVALID_INVITATION(4, 4),
        INVITATION_EXPIRED(5, 5),
        INVITATION_ALREADY_USED(6, 6);


        /* renamed from: z, reason: collision with root package name */
        private static h.a f43182z = new a();

        /* renamed from: o, reason: collision with root package name */
        private final int f43183o;

        class a implements h.a {
            a() {
            }
        }

        c(int i8, int i9) {
            this.f43183o = i9;
        }

        public static c c(int i8) {
            switch (i8) {
                case 0:
                    return EMAIL_SENT;
                case 1:
                    return REPARENTED;
                case 2:
                    return CREATED_ACCOUNT;
                case 3:
                    return INVALID_PASSWORD;
                case 4:
                    return INVALID_INVITATION;
                case 5:
                    return INVITATION_EXPIRED;
                case 6:
                    return INVITATION_ALREADY_USED;
                default:
                    return null;
            }
        }

        public final int e() {
            return this.f43183o;
        }
    }

    static {
        g0 g0Var = new g0(true);
        f43162z = g0Var;
        g0Var.u();
    }

    public static g0 n() {
        return f43162z;
    }

    private void u() {
        this.f43165u = c.EMAIL_SENT;
        this.f43166v = I.u();
        this.f43167w = false;
    }

    public static b v() {
        return b.q();
    }

    public static b w(g0 g0Var) {
        return v().s(g0Var);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43169y;
        if (i8 != -1) {
            return i8;
        }
        int f8 = (this.f43164t & 1) == 1 ? CodedOutputStream.f(1, this.f43165u.e()) : 0;
        if ((this.f43164t & 2) == 2) {
            f8 += CodedOutputStream.l(2, this.f43166v);
        }
        if ((this.f43164t & 4) == 4) {
            f8 += CodedOutputStream.b(3, this.f43167w);
        }
        int size = f8 + this.f43163s.size();
        this.f43169y = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43168x;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        if (!s() || p().c()) {
            this.f43168x = 1;
            return true;
        }
        this.f43168x = 0;
        return false;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43164t & 1) == 1) {
            codedOutputStream.G(1, this.f43165u.e());
        }
        if ((this.f43164t & 2) == 2) {
            codedOutputStream.O(2, this.f43166v);
        }
        if ((this.f43164t & 4) == 4) {
            codedOutputStream.C(3, this.f43167w);
        }
        codedOutputStream.S(this.f43163s);
    }

    public boolean o() {
        return this.f43167w;
    }

    public I p() {
        return this.f43166v;
    }

    public c q() {
        return this.f43165u;
    }

    public boolean r() {
        return (this.f43164t & 4) == 4;
    }

    public boolean s() {
        return (this.f43164t & 2) == 2;
    }

    public boolean t() {
        return (this.f43164t & 1) == 1;
    }

    public b x() {
        return w(this);
    }

    private g0(g.a aVar) {
        super(aVar);
        this.f43168x = -1;
        this.f43169y = -1;
        this.f43163s = aVar.i();
    }

    private g0(boolean z7) {
        this.f43168x = -1;
        this.f43169y = -1;
        this.f43163s = com.google.protobuf.d.f33078o;
    }

    private g0(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43168x = -1;
        this.f43169y = -1;
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
                            int k8 = eVar.k();
                            c c8 = c.c(k8);
                            if (c8 == null) {
                                w7.W(x7);
                                w7.W(k8);
                            } else {
                                this.f43164t |= 1;
                                this.f43165u = c8;
                            }
                        } else if (x7 == 18) {
                            I.b I7 = (this.f43164t & 2) == 2 ? this.f43166v.I() : null;
                            I i8 = (I) eVar.n(I.f42821D, fVar);
                            this.f43166v = i8;
                            if (I7 != null) {
                                I7.v(i8);
                                this.f43166v = I7.m();
                            }
                            this.f43164t |= 2;
                        } else if (x7 != 24) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            this.f43164t |= 4;
                            this.f43167w = eVar.i();
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
                    this.f43163s = t7.h();
                    throw th2;
                }
                this.f43163s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43163s = t7.h();
            throw th3;
        }
        this.f43163s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43170s;

        /* renamed from: t, reason: collision with root package name */
        private c f43171t = c.EMAIL_SENT;

        /* renamed from: u, reason: collision with root package name */
        private I f43172u = I.u();

        /* renamed from: v, reason: collision with root package name */
        private boolean f43173v;

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public g0 m() {
            g0 g0Var = new g0(this);
            int i8 = this.f43170s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            g0Var.f43165u = this.f43171t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            g0Var.f43166v = this.f43172u;
            if ((i8 & 4) == 4) {
                i9 |= 4;
            }
            g0Var.f43167w = this.f43173v;
            g0Var.f43164t = i9;
            return g0Var;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(g0 g0Var) {
            if (g0Var == g0.n()) {
                return this;
            }
            if (g0Var.t()) {
                w(g0Var.q());
            }
            if (g0Var.s()) {
                u(g0Var.p());
            }
            if (g0Var.r()) {
                v(g0Var.o());
            }
            k(i().c(g0Var.f43163s));
            return this;
        }

        public b u(I i8) {
            if ((this.f43170s & 2) != 2 || this.f43172u == I.u()) {
                this.f43172u = i8;
            } else {
                this.f43172u = I.H(this.f43172u).v(i8).m();
            }
            this.f43170s |= 2;
            return this;
        }

        public b v(boolean z7) {
            this.f43170s |= 4;
            this.f43173v = z7;
            return this;
        }

        public b w(c cVar) {
            cVar.getClass();
            this.f43170s |= 1;
            this.f43171t = cVar;
            return this;
        }

        private void r() {
        }
    }
}
