package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class r extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: y, reason: collision with root package name */
    private static final r f43482y;

    /* renamed from: z, reason: collision with root package name */
    public static com.google.protobuf.n f43483z = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43484s;

    /* renamed from: t, reason: collision with root package name */
    private int f43485t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43486u;

    /* renamed from: v, reason: collision with root package name */
    private Object f43487v;

    /* renamed from: w, reason: collision with root package name */
    private int f43488w;

    /* renamed from: x, reason: collision with root package name */
    private int f43489x;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public r d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new r(eVar, fVar);
        }
    }

    static {
        r rVar = new r(true);
        f43482y = rVar;
        rVar.u();
    }

    public static r o() {
        return f43482y;
    }

    private void u() {
        this.f43486u = "";
        this.f43487v = "";
    }

    public static b v() {
        return b.r();
    }

    public static b w(r rVar) {
        return v().u(rVar);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43489x;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f43485t & 1) == 1 ? CodedOutputStream.d(1, q()) : 0;
        if ((this.f43485t & 2) == 2) {
            d8 += CodedOutputStream.d(2, r());
        }
        int size = d8 + this.f43484s.size();
        this.f43489x = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43488w;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43488w = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43485t & 1) == 1) {
            codedOutputStream.E(1, q());
        }
        if ((this.f43485t & 2) == 2) {
            codedOutputStream.E(2, r());
        }
        codedOutputStream.S(this.f43484s);
    }

    public String p() {
        Object obj = this.f43486u;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f43486u = J7;
        }
        return J7;
    }

    public com.google.protobuf.d q() {
        Object obj = this.f43486u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43486u = n8;
        return n8;
    }

    public com.google.protobuf.d r() {
        Object obj = this.f43487v;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43487v = n8;
        return n8;
    }

    public boolean s() {
        return (this.f43485t & 1) == 1;
    }

    public boolean t() {
        return (this.f43485t & 2) == 2;
    }

    public b x() {
        return w(this);
    }

    private r(g.a aVar) {
        super(aVar);
        this.f43488w = -1;
        this.f43489x = -1;
        this.f43484s = aVar.i();
    }

    private r(boolean z7) {
        this.f43488w = -1;
        this.f43489x = -1;
        this.f43484s = com.google.protobuf.d.f33078o;
    }

    private r(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43488w = -1;
        this.f43489x = -1;
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
                            this.f43485t = 1 | this.f43485t;
                            this.f43486u = j8;
                        } else if (x7 != 18) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            com.google.protobuf.d j9 = eVar.j();
                            this.f43485t |= 2;
                            this.f43487v = j9;
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
                    this.f43484s = t7.h();
                    throw th2;
                }
                this.f43484s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43484s = t7.h();
            throw th3;
        }
        this.f43484s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43490s;

        /* renamed from: t, reason: collision with root package name */
        private Object f43491t = "";

        /* renamed from: u, reason: collision with root package name */
        private Object f43492u = "";

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        public r m() {
            r p8 = p();
            if (p8.c()) {
                return p8;
            }
            throw a.AbstractC0243a.h(p8);
        }

        public r p() {
            r rVar = new r(this);
            int i8 = this.f43490s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            rVar.f43486u = this.f43491t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            rVar.f43487v = this.f43492u;
            rVar.f43485t = i9;
            return rVar;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().u(p());
        }

        public b u(r rVar) {
            if (rVar == r.o()) {
                return this;
            }
            if (rVar.s()) {
                this.f43490s |= 1;
                this.f43491t = rVar.f43486u;
            }
            if (rVar.t()) {
                this.f43490s |= 2;
                this.f43492u = rVar.f43487v;
            }
            k(i().c(rVar.f43484s));
            return this;
        }

        public b v(String str) {
            str.getClass();
            this.f43490s |= 1;
            this.f43491t = str;
            return this;
        }

        public b w(String str) {
            str.getClass();
            this.f43490s |= 2;
            this.f43492u = str;
            return this;
        }

        private void s() {
        }
    }
}
