package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class U extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: x, reason: collision with root package name */
    private static final U f43001x;

    /* renamed from: y, reason: collision with root package name */
    public static com.google.protobuf.n f43002y = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43003s;

    /* renamed from: t, reason: collision with root package name */
    private int f43004t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43005u;

    /* renamed from: v, reason: collision with root package name */
    private int f43006v;

    /* renamed from: w, reason: collision with root package name */
    private int f43007w;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public U d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new U(eVar, fVar);
        }
    }

    static {
        U u7 = new U(true);
        f43001x = u7;
        u7.p();
    }

    public static U n() {
        return f43001x;
    }

    private void p() {
        this.f43005u = "";
    }

    public static b q() {
        return b.r();
    }

    public static b r(U u7) {
        return q().u(u7);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43007w;
        if (i8 != -1) {
            return i8;
        }
        int d8 = ((this.f43004t & 1) == 1 ? CodedOutputStream.d(1, m()) : 0) + this.f43003s.size();
        this.f43007w = d8;
        return d8;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43006v;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        if (o()) {
            this.f43006v = 1;
            return true;
        }
        this.f43006v = 0;
        return false;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43004t & 1) == 1) {
            codedOutputStream.E(1, m());
        }
        codedOutputStream.S(this.f43003s);
    }

    public com.google.protobuf.d m() {
        Object obj = this.f43005u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43005u = n8;
        return n8;
    }

    public boolean o() {
        return (this.f43004t & 1) == 1;
    }

    public b s() {
        return r(this);
    }

    private U(g.a aVar) {
        super(aVar);
        this.f43006v = -1;
        this.f43007w = -1;
        this.f43003s = aVar.i();
    }

    private U(boolean z7) {
        this.f43006v = -1;
        this.f43007w = -1;
        this.f43003s = com.google.protobuf.d.f33078o;
    }

    private U(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43006v = -1;
        this.f43007w = -1;
        p();
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
                            com.google.protobuf.d j8 = eVar.j();
                            this.f43004t = 1 | this.f43004t;
                            this.f43005u = j8;
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
                    this.f43003s = t7.h();
                    throw th2;
                }
                this.f43003s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43003s = t7.h();
            throw th3;
        }
        this.f43003s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43008s;

        /* renamed from: t, reason: collision with root package name */
        private Object f43009t = "";

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        public U m() {
            U p8 = p();
            if (p8.c()) {
                return p8;
            }
            throw a.AbstractC0243a.h(p8);
        }

        public U p() {
            U u7 = new U(this);
            int i8 = (this.f43008s & 1) != 1 ? 0 : 1;
            u7.f43005u = this.f43009t;
            u7.f43004t = i8;
            return u7;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().u(p());
        }

        public b u(U u7) {
            if (u7 == U.n()) {
                return this;
            }
            if (u7.o()) {
                this.f43008s |= 1;
                this.f43009t = u7.f43005u;
            }
            k(i().c(u7.f43003s));
            return this;
        }

        public b v(String str) {
            str.getClass();
            this.f43008s |= 1;
            this.f43009t = str;
            return this;
        }

        private void s() {
        }
    }
}
