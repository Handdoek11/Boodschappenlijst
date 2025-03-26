package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class M extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: y, reason: collision with root package name */
    private static final M f42895y;

    /* renamed from: z, reason: collision with root package name */
    public static com.google.protobuf.n f42896z = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f42897s;

    /* renamed from: t, reason: collision with root package name */
    private int f42898t;

    /* renamed from: u, reason: collision with root package name */
    private Object f42899u;

    /* renamed from: v, reason: collision with root package name */
    private Object f42900v;

    /* renamed from: w, reason: collision with root package name */
    private int f42901w;

    /* renamed from: x, reason: collision with root package name */
    private int f42902x;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public M d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new M(eVar, fVar);
        }
    }

    static {
        M m8 = new M(true);
        f42895y = m8;
        m8.v();
    }

    public static M o() {
        return f42895y;
    }

    private void v() {
        this.f42899u = "";
        this.f42900v = "";
    }

    public static b w() {
        return b.r();
    }

    public static b x(M m8) {
        return w().u(m8);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f42902x;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f42898t & 1) == 1 ? CodedOutputStream.d(1, q()) : 0;
        if ((this.f42898t & 2) == 2) {
            d8 += CodedOutputStream.d(2, s());
        }
        int size = d8 + this.f42897s.size();
        this.f42902x = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f42901w;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        if (t()) {
            this.f42901w = 1;
            return true;
        }
        this.f42901w = 0;
        return false;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f42898t & 1) == 1) {
            codedOutputStream.E(1, q());
        }
        if ((this.f42898t & 2) == 2) {
            codedOutputStream.E(2, s());
        }
        codedOutputStream.S(this.f42897s);
    }

    public String p() {
        Object obj = this.f42899u;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f42899u = J7;
        }
        return J7;
    }

    public com.google.protobuf.d q() {
        Object obj = this.f42899u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42899u = n8;
        return n8;
    }

    public String r() {
        Object obj = this.f42900v;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f42900v = J7;
        }
        return J7;
    }

    public com.google.protobuf.d s() {
        Object obj = this.f42900v;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42900v = n8;
        return n8;
    }

    public boolean t() {
        return (this.f42898t & 1) == 1;
    }

    public boolean u() {
        return (this.f42898t & 2) == 2;
    }

    public b y() {
        return x(this);
    }

    private M(g.a aVar) {
        super(aVar);
        this.f42901w = -1;
        this.f42902x = -1;
        this.f42897s = aVar.i();
    }

    private M(boolean z7) {
        this.f42901w = -1;
        this.f42902x = -1;
        this.f42897s = com.google.protobuf.d.f33078o;
    }

    private M(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f42901w = -1;
        this.f42902x = -1;
        v();
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
                            this.f42898t = 1 | this.f42898t;
                            this.f42899u = j8;
                        } else if (x7 != 18) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            com.google.protobuf.d j9 = eVar.j();
                            this.f42898t |= 2;
                            this.f42900v = j9;
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
                    this.f42897s = t7.h();
                    throw th2;
                }
                this.f42897s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f42897s = t7.h();
            throw th3;
        }
        this.f42897s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f42903s;

        /* renamed from: t, reason: collision with root package name */
        private Object f42904t = "";

        /* renamed from: u, reason: collision with root package name */
        private Object f42905u = "";

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        public M m() {
            M p8 = p();
            if (p8.c()) {
                return p8;
            }
            throw a.AbstractC0243a.h(p8);
        }

        public M p() {
            M m8 = new M(this);
            int i8 = this.f42903s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            m8.f42899u = this.f42904t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            m8.f42900v = this.f42905u;
            m8.f42898t = i9;
            return m8;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().u(p());
        }

        public b u(M m8) {
            if (m8 == M.o()) {
                return this;
            }
            if (m8.t()) {
                this.f42903s |= 1;
                this.f42904t = m8.f42899u;
            }
            if (m8.u()) {
                this.f42903s |= 2;
                this.f42905u = m8.f42900v;
            }
            k(i().c(m8.f42897s));
            return this;
        }

        public b v(String str) {
            str.getClass();
            this.f42903s |= 1;
            this.f42904t = str;
            return this;
        }

        public b w(String str) {
            str.getClass();
            this.f42903s |= 2;
            this.f42905u = str;
            return this;
        }

        private void s() {
        }
    }
}
