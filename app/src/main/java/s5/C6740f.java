package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* renamed from: s5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6740f extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: y, reason: collision with root package name */
    private static final C6740f f43118y;

    /* renamed from: z, reason: collision with root package name */
    public static com.google.protobuf.n f43119z = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43120s;

    /* renamed from: t, reason: collision with root package name */
    private int f43121t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43122u;

    /* renamed from: v, reason: collision with root package name */
    private Object f43123v;

    /* renamed from: w, reason: collision with root package name */
    private int f43124w;

    /* renamed from: x, reason: collision with root package name */
    private int f43125x;

    /* renamed from: s5.f$a */
    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6740f d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C6740f(eVar, fVar);
        }
    }

    static {
        C6740f c6740f = new C6740f(true);
        f43118y = c6740f;
        c6740f.u();
    }

    public static C6740f o() {
        return f43118y;
    }

    private void u() {
        this.f43122u = "";
        this.f43123v = "";
    }

    public static b v() {
        return b.r();
    }

    public static b w(C6740f c6740f) {
        return v().u(c6740f);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43125x;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f43121t & 1) == 1 ? CodedOutputStream.d(1, q()) : 0;
        if ((this.f43121t & 2) == 2) {
            d8 += CodedOutputStream.d(2, r());
        }
        int size = d8 + this.f43120s.size();
        this.f43125x = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43124w;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43124w = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43121t & 1) == 1) {
            codedOutputStream.E(1, q());
        }
        if ((this.f43121t & 2) == 2) {
            codedOutputStream.E(2, r());
        }
        codedOutputStream.S(this.f43120s);
    }

    public String p() {
        Object obj = this.f43122u;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f43122u = J7;
        }
        return J7;
    }

    public com.google.protobuf.d q() {
        Object obj = this.f43122u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43122u = n8;
        return n8;
    }

    public com.google.protobuf.d r() {
        Object obj = this.f43123v;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43123v = n8;
        return n8;
    }

    public boolean s() {
        return (this.f43121t & 1) == 1;
    }

    public boolean t() {
        return (this.f43121t & 2) == 2;
    }

    public b x() {
        return w(this);
    }

    private C6740f(g.a aVar) {
        super(aVar);
        this.f43124w = -1;
        this.f43125x = -1;
        this.f43120s = aVar.i();
    }

    private C6740f(boolean z7) {
        this.f43124w = -1;
        this.f43125x = -1;
        this.f43120s = com.google.protobuf.d.f33078o;
    }

    private C6740f(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43124w = -1;
        this.f43125x = -1;
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
                            this.f43121t = 1 | this.f43121t;
                            this.f43122u = j8;
                        } else if (x7 != 18) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            com.google.protobuf.d j9 = eVar.j();
                            this.f43121t |= 2;
                            this.f43123v = j9;
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
                    this.f43120s = t7.h();
                    throw th2;
                }
                this.f43120s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43120s = t7.h();
            throw th3;
        }
        this.f43120s = t7.h();
        g();
    }

    /* renamed from: s5.f$b */
    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43126s;

        /* renamed from: t, reason: collision with root package name */
        private Object f43127t = "";

        /* renamed from: u, reason: collision with root package name */
        private Object f43128u = "";

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        public C6740f m() {
            C6740f p8 = p();
            if (p8.c()) {
                return p8;
            }
            throw a.AbstractC0243a.h(p8);
        }

        public C6740f p() {
            C6740f c6740f = new C6740f(this);
            int i8 = this.f43126s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            c6740f.f43122u = this.f43127t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            c6740f.f43123v = this.f43128u;
            c6740f.f43121t = i9;
            return c6740f;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().u(p());
        }

        public b u(C6740f c6740f) {
            if (c6740f == C6740f.o()) {
                return this;
            }
            if (c6740f.s()) {
                this.f43126s |= 1;
                this.f43127t = c6740f.f43122u;
            }
            if (c6740f.t()) {
                this.f43126s |= 2;
                this.f43128u = c6740f.f43123v;
            }
            k(i().c(c6740f.f43120s));
            return this;
        }

        public b v(String str) {
            str.getClass();
            this.f43126s |= 1;
            this.f43127t = str;
            return this;
        }

        public b w(String str) {
            str.getClass();
            this.f43126s |= 2;
            this.f43128u = str;
            return this;
        }

        private void s() {
        }
    }
}
