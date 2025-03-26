package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* renamed from: s5.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6749o extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: y, reason: collision with root package name */
    private static final C6749o f43395y;

    /* renamed from: z, reason: collision with root package name */
    public static com.google.protobuf.n f43396z = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43397s;

    /* renamed from: t, reason: collision with root package name */
    private int f43398t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43399u;

    /* renamed from: v, reason: collision with root package name */
    private Object f43400v;

    /* renamed from: w, reason: collision with root package name */
    private int f43401w;

    /* renamed from: x, reason: collision with root package name */
    private int f43402x;

    /* renamed from: s5.o$a */
    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6749o d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C6749o(eVar, fVar);
        }
    }

    static {
        C6749o c6749o = new C6749o(true);
        f43395y = c6749o;
        c6749o.u();
    }

    public static C6749o p() {
        return f43395y;
    }

    private void u() {
        this.f43399u = "";
        this.f43400v = "";
    }

    public static b v() {
        return b.q();
    }

    public static b w(C6749o c6749o) {
        return v().s(c6749o);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43402x;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f43398t & 1) == 1 ? CodedOutputStream.d(1, o()) : 0;
        if ((this.f43398t & 2) == 2) {
            d8 += CodedOutputStream.d(2, r());
        }
        int size = d8 + this.f43397s.size();
        this.f43402x = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43401w;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43401w = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43398t & 1) == 1) {
            codedOutputStream.E(1, o());
        }
        if ((this.f43398t & 2) == 2) {
            codedOutputStream.E(2, r());
        }
        codedOutputStream.S(this.f43397s);
    }

    public com.google.protobuf.d o() {
        Object obj = this.f43399u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43399u = n8;
        return n8;
    }

    public String q() {
        Object obj = this.f43400v;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f43400v = J7;
        }
        return J7;
    }

    public com.google.protobuf.d r() {
        Object obj = this.f43400v;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43400v = n8;
        return n8;
    }

    public boolean s() {
        return (this.f43398t & 1) == 1;
    }

    public boolean t() {
        return (this.f43398t & 2) == 2;
    }

    public b x() {
        return w(this);
    }

    private C6749o(g.a aVar) {
        super(aVar);
        this.f43401w = -1;
        this.f43402x = -1;
        this.f43397s = aVar.i();
    }

    private C6749o(boolean z7) {
        this.f43401w = -1;
        this.f43402x = -1;
        this.f43397s = com.google.protobuf.d.f33078o;
    }

    private C6749o(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43401w = -1;
        this.f43402x = -1;
        u();
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
                            this.f43398t = 1 | this.f43398t;
                            this.f43399u = j8;
                        } else if (x7 != 18) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            com.google.protobuf.d j9 = eVar.j();
                            this.f43398t |= 2;
                            this.f43400v = j9;
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
                    this.f43397s = t7.h();
                    throw th2;
                }
                this.f43397s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43397s = t7.h();
            throw th3;
        }
        this.f43397s = t7.h();
        g();
    }

    /* renamed from: s5.o$b */
    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43403s;

        /* renamed from: t, reason: collision with root package name */
        private Object f43404t = "";

        /* renamed from: u, reason: collision with root package name */
        private Object f43405u = "";

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public C6749o m() {
            C6749o c6749o = new C6749o(this);
            int i8 = this.f43403s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            c6749o.f43399u = this.f43404t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            c6749o.f43400v = this.f43405u;
            c6749o.f43398t = i9;
            return c6749o;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(C6749o c6749o) {
            if (c6749o == C6749o.p()) {
                return this;
            }
            if (c6749o.s()) {
                this.f43403s |= 1;
                this.f43404t = c6749o.f43399u;
            }
            if (c6749o.t()) {
                this.f43403s |= 2;
                this.f43405u = c6749o.f43400v;
            }
            k(i().c(c6749o.f43397s));
            return this;
        }

        private void r() {
        }
    }
}
