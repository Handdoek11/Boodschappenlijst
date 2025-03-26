package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class S extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: A, reason: collision with root package name */
    public static com.google.protobuf.n f42977A = new a();

    /* renamed from: z, reason: collision with root package name */
    private static final S f42978z;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f42979s;

    /* renamed from: t, reason: collision with root package name */
    private int f42980t;

    /* renamed from: u, reason: collision with root package name */
    private long f42981u;

    /* renamed from: v, reason: collision with root package name */
    private c f42982v;

    /* renamed from: w, reason: collision with root package name */
    private Object f42983w;

    /* renamed from: x, reason: collision with root package name */
    private int f42984x;

    /* renamed from: y, reason: collision with root package name */
    private int f42985y;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public S d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new S(eVar, fVar);
        }
    }

    public enum c {
        INFO(0, 0),
        WARN(1, 1),
        ERROR(2, 2);


        /* renamed from: v, reason: collision with root package name */
        private static h.a f42993v = new a();

        /* renamed from: o, reason: collision with root package name */
        private final int f42995o;

        class a implements h.a {
            a() {
            }
        }

        c(int i8, int i9) {
            this.f42995o = i9;
        }

        public static c c(int i8) {
            if (i8 == 0) {
                return INFO;
            }
            if (i8 == 1) {
                return WARN;
            }
            if (i8 != 2) {
                return null;
            }
            return ERROR;
        }

        public final int e() {
            return this.f42995o;
        }
    }

    static {
        S s8 = new S(true);
        f42978z = s8;
        s8.v();
    }

    public static S o() {
        return f42978z;
    }

    private void v() {
        this.f42981u = 0L;
        this.f42982v = c.INFO;
        this.f42983w = "";
    }

    public static b w() {
        return b.r();
    }

    public static b x(S s8) {
        return w().u(s8);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f42985y;
        if (i8 != -1) {
            return i8;
        }
        int j8 = (this.f42980t & 1) == 1 ? CodedOutputStream.j(1, this.f42981u) : 0;
        if ((this.f42980t & 2) == 2) {
            j8 += CodedOutputStream.f(2, this.f42982v.e());
        }
        if ((this.f42980t & 4) == 4) {
            j8 += CodedOutputStream.d(3, p());
        }
        int size = j8 + this.f42979s.size();
        this.f42985y = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f42984x;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f42984x = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f42980t & 1) == 1) {
            codedOutputStream.M(1, this.f42981u);
        }
        if ((this.f42980t & 2) == 2) {
            codedOutputStream.G(2, this.f42982v.e());
        }
        if ((this.f42980t & 4) == 4) {
            codedOutputStream.E(3, p());
        }
        codedOutputStream.S(this.f42979s);
    }

    public com.google.protobuf.d p() {
        Object obj = this.f42983w;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42983w = n8;
        return n8;
    }

    public c q() {
        return this.f42982v;
    }

    public long r() {
        return this.f42981u;
    }

    public boolean s() {
        return (this.f42980t & 4) == 4;
    }

    public boolean t() {
        return (this.f42980t & 2) == 2;
    }

    public boolean u() {
        return (this.f42980t & 1) == 1;
    }

    public b y() {
        return x(this);
    }

    private S(g.a aVar) {
        super(aVar);
        this.f42984x = -1;
        this.f42985y = -1;
        this.f42979s = aVar.i();
    }

    private S(boolean z7) {
        this.f42984x = -1;
        this.f42985y = -1;
        this.f42979s = com.google.protobuf.d.f33078o;
    }

    private S(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f42984x = -1;
        this.f42985y = -1;
        v();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 != 0) {
                        if (x7 == 8) {
                            this.f42980t |= 1;
                            this.f42981u = eVar.m();
                        } else if (x7 == 16) {
                            int k8 = eVar.k();
                            c c8 = c.c(k8);
                            if (c8 == null) {
                                w7.W(x7);
                                w7.W(k8);
                            } else {
                                this.f42980t |= 2;
                                this.f42982v = c8;
                            }
                        } else if (x7 != 26) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            com.google.protobuf.d j8 = eVar.j();
                            this.f42980t |= 4;
                            this.f42983w = j8;
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
                    this.f42979s = t7.h();
                    throw th2;
                }
                this.f42979s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f42979s = t7.h();
            throw th3;
        }
        this.f42979s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f42986s;

        /* renamed from: t, reason: collision with root package name */
        private long f42987t;

        /* renamed from: u, reason: collision with root package name */
        private c f42988u = c.INFO;

        /* renamed from: v, reason: collision with root package name */
        private Object f42989v = "";

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        public S m() {
            S p8 = p();
            if (p8.c()) {
                return p8;
            }
            throw a.AbstractC0243a.h(p8);
        }

        public S p() {
            S s8 = new S(this);
            int i8 = this.f42986s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            s8.f42981u = this.f42987t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            s8.f42982v = this.f42988u;
            if ((i8 & 4) == 4) {
                i9 |= 4;
            }
            s8.f42983w = this.f42989v;
            s8.f42980t = i9;
            return s8;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().u(p());
        }

        public b u(S s8) {
            if (s8 == S.o()) {
                return this;
            }
            if (s8.u()) {
                x(s8.r());
            }
            if (s8.t()) {
                w(s8.q());
            }
            if (s8.s()) {
                this.f42986s |= 4;
                this.f42989v = s8.f42983w;
            }
            k(i().c(s8.f42979s));
            return this;
        }

        public b v(String str) {
            str.getClass();
            this.f42986s |= 4;
            this.f42989v = str;
            return this;
        }

        public b w(c cVar) {
            cVar.getClass();
            this.f42986s |= 2;
            this.f42988u = cVar;
            return this;
        }

        public b x(long j8) {
            this.f42986s |= 1;
            this.f42987t = j8;
            return this;
        }

        private void s() {
        }
    }
}
