package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* renamed from: s5.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6748n extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: y, reason: collision with root package name */
    private static final C6748n f43356y;

    /* renamed from: z, reason: collision with root package name */
    public static com.google.protobuf.n f43357z = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43358s;

    /* renamed from: t, reason: collision with root package name */
    private int f43359t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43360u;

    /* renamed from: v, reason: collision with root package name */
    private EnumC6750p f43361v;

    /* renamed from: w, reason: collision with root package name */
    private int f43362w;

    /* renamed from: x, reason: collision with root package name */
    private int f43363x;

    /* renamed from: s5.n$a */
    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6748n d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C6748n(eVar, fVar);
        }
    }

    static {
        C6748n c6748n = new C6748n(true);
        f43356y = c6748n;
        c6748n.s();
    }

    public static C6748n p() {
        return f43356y;
    }

    private void s() {
        this.f43360u = "";
        this.f43361v = EnumC6750p.BARCODETYPE_UNKNOWN;
    }

    public static b t() {
        return b.r();
    }

    public static b u(C6748n c6748n) {
        return t().u(c6748n);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43363x;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f43359t & 1) == 1 ? CodedOutputStream.d(1, n()) : 0;
        if ((this.f43359t & 2) == 2) {
            d8 += CodedOutputStream.f(2, this.f43361v.e());
        }
        int size = d8 + this.f43358s.size();
        this.f43363x = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43362w;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43362w = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43359t & 1) == 1) {
            codedOutputStream.E(1, n());
        }
        if ((this.f43359t & 2) == 2) {
            codedOutputStream.G(2, this.f43361v.e());
        }
        codedOutputStream.S(this.f43358s);
    }

    public com.google.protobuf.d n() {
        Object obj = this.f43360u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43360u = n8;
        return n8;
    }

    public EnumC6750p o() {
        return this.f43361v;
    }

    public boolean q() {
        return (this.f43359t & 1) == 1;
    }

    public boolean r() {
        return (this.f43359t & 2) == 2;
    }

    public b v() {
        return u(this);
    }

    private C6748n(g.a aVar) {
        super(aVar);
        this.f43362w = -1;
        this.f43363x = -1;
        this.f43358s = aVar.i();
    }

    private C6748n(boolean z7) {
        this.f43362w = -1;
        this.f43363x = -1;
        this.f43358s = com.google.protobuf.d.f33078o;
    }

    private C6748n(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43362w = -1;
        this.f43363x = -1;
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
                            com.google.protobuf.d j8 = eVar.j();
                            this.f43359t = 1 | this.f43359t;
                            this.f43360u = j8;
                        } else if (x7 != 16) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            int k8 = eVar.k();
                            EnumC6750p c8 = EnumC6750p.c(k8);
                            if (c8 == null) {
                                w7.W(x7);
                                w7.W(k8);
                            } else {
                                this.f43359t |= 2;
                                this.f43361v = c8;
                            }
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
                    this.f43358s = t7.h();
                    throw th2;
                }
                this.f43358s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43358s = t7.h();
            throw th3;
        }
        this.f43358s = t7.h();
        g();
    }

    /* renamed from: s5.n$b */
    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43364s;

        /* renamed from: t, reason: collision with root package name */
        private Object f43365t = "";

        /* renamed from: u, reason: collision with root package name */
        private EnumC6750p f43366u = EnumC6750p.BARCODETYPE_UNKNOWN;

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        public C6748n m() {
            C6748n p8 = p();
            if (p8.c()) {
                return p8;
            }
            throw a.AbstractC0243a.h(p8);
        }

        public C6748n p() {
            C6748n c6748n = new C6748n(this);
            int i8 = this.f43364s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            c6748n.f43360u = this.f43365t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            c6748n.f43361v = this.f43366u;
            c6748n.f43359t = i9;
            return c6748n;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().u(p());
        }

        public b u(C6748n c6748n) {
            if (c6748n == C6748n.p()) {
                return this;
            }
            if (c6748n.q()) {
                this.f43364s |= 1;
                this.f43365t = c6748n.f43360u;
            }
            if (c6748n.r()) {
                w(c6748n.o());
            }
            k(i().c(c6748n.f43358s));
            return this;
        }

        public b v(String str) {
            str.getClass();
            this.f43364s |= 1;
            this.f43365t = str;
            return this;
        }

        public b w(EnumC6750p enumC6750p) {
            enumC6750p.getClass();
            this.f43364s |= 2;
            this.f43366u = enumC6750p;
            return this;
        }

        private void s() {
        }
    }
}
