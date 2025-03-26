package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* renamed from: s5.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6755v extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: A, reason: collision with root package name */
    public static com.google.protobuf.n f43621A = new a();

    /* renamed from: z, reason: collision with root package name */
    private static final C6755v f43622z;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43623s;

    /* renamed from: t, reason: collision with root package name */
    private int f43624t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43625u;

    /* renamed from: v, reason: collision with root package name */
    private Object f43626v;

    /* renamed from: w, reason: collision with root package name */
    private long f43627w;

    /* renamed from: x, reason: collision with root package name */
    private int f43628x;

    /* renamed from: y, reason: collision with root package name */
    private int f43629y;

    /* renamed from: s5.v$a */
    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6755v d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C6755v(eVar, fVar);
        }
    }

    static {
        C6755v c6755v = new C6755v(true);
        f43622z = c6755v;
        c6755v.y();
    }

    public static b A(C6755v c6755v) {
        return z().s(c6755v);
    }

    public static C6755v B(byte[] bArr) {
        return (C6755v) f43621A.a(bArr);
    }

    public static C6755v r() {
        return f43622z;
    }

    private void y() {
        this.f43625u = "";
        this.f43626v = "";
        this.f43627w = 0L;
    }

    public static b z() {
        return b.q();
    }

    public b C() {
        return A(this);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43629y;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f43624t & 1) == 1 ? CodedOutputStream.d(1, u()) : 0;
        if ((this.f43624t & 2) == 2) {
            d8 += CodedOutputStream.d(2, q());
        }
        if ((this.f43624t & 4) == 4) {
            d8 += CodedOutputStream.j(3, this.f43627w);
        }
        int size = d8 + this.f43623s.size();
        this.f43629y = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43628x;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43628x = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43624t & 1) == 1) {
            codedOutputStream.E(1, u());
        }
        if ((this.f43624t & 2) == 2) {
            codedOutputStream.E(2, q());
        }
        if ((this.f43624t & 4) == 4) {
            codedOutputStream.M(3, this.f43627w);
        }
        codedOutputStream.S(this.f43623s);
    }

    public String p() {
        Object obj = this.f43626v;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f43626v = J7;
        }
        return J7;
    }

    public com.google.protobuf.d q() {
        Object obj = this.f43626v;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43626v = n8;
        return n8;
    }

    public long s() {
        return this.f43627w;
    }

    public String t() {
        Object obj = this.f43625u;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f43625u = J7;
        }
        return J7;
    }

    public com.google.protobuf.d u() {
        Object obj = this.f43625u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43625u = n8;
        return n8;
    }

    public boolean v() {
        return (this.f43624t & 2) == 2;
    }

    public boolean w() {
        return (this.f43624t & 4) == 4;
    }

    public boolean x() {
        return (this.f43624t & 1) == 1;
    }

    private C6755v(g.a aVar) {
        super(aVar);
        this.f43628x = -1;
        this.f43629y = -1;
        this.f43623s = aVar.i();
    }

    private C6755v(boolean z7) {
        this.f43628x = -1;
        this.f43629y = -1;
        this.f43623s = com.google.protobuf.d.f33078o;
    }

    private C6755v(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43628x = -1;
        this.f43629y = -1;
        y();
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
                            this.f43624t = 1 | this.f43624t;
                            this.f43625u = j8;
                        } else if (x7 == 18) {
                            com.google.protobuf.d j9 = eVar.j();
                            this.f43624t |= 2;
                            this.f43626v = j9;
                        } else if (x7 != 24) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            this.f43624t |= 4;
                            this.f43627w = eVar.m();
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
                    this.f43623s = t7.h();
                    throw th2;
                }
                this.f43623s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43623s = t7.h();
            throw th3;
        }
        this.f43623s = t7.h();
        g();
    }

    /* renamed from: s5.v$b */
    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43630s;

        /* renamed from: t, reason: collision with root package name */
        private Object f43631t = "";

        /* renamed from: u, reason: collision with root package name */
        private Object f43632u = "";

        /* renamed from: v, reason: collision with root package name */
        private long f43633v;

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public C6755v m() {
            C6755v c6755v = new C6755v(this);
            int i8 = this.f43630s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            c6755v.f43625u = this.f43631t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            c6755v.f43626v = this.f43632u;
            if ((i8 & 4) == 4) {
                i9 |= 4;
            }
            c6755v.f43627w = this.f43633v;
            c6755v.f43624t = i9;
            return c6755v;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(C6755v c6755v) {
            if (c6755v == C6755v.r()) {
                return this;
            }
            if (c6755v.x()) {
                this.f43630s |= 1;
                this.f43631t = c6755v.f43625u;
            }
            if (c6755v.v()) {
                this.f43630s |= 2;
                this.f43632u = c6755v.f43626v;
            }
            if (c6755v.w()) {
                u(c6755v.s());
            }
            k(i().c(c6755v.f43623s));
            return this;
        }

        public b u(long j8) {
            this.f43630s |= 4;
            this.f43633v = j8;
            return this;
        }

        private void r() {
        }
    }
}
