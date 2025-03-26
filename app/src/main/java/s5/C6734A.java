package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;
import s5.K;

/* renamed from: s5.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6734A extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: x, reason: collision with root package name */
    private static final C6734A f42744x;

    /* renamed from: y, reason: collision with root package name */
    public static com.google.protobuf.n f42745y = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f42746s;

    /* renamed from: t, reason: collision with root package name */
    private int f42747t;

    /* renamed from: u, reason: collision with root package name */
    private K f42748u;

    /* renamed from: v, reason: collision with root package name */
    private int f42749v;

    /* renamed from: w, reason: collision with root package name */
    private int f42750w;

    /* renamed from: s5.A$a */
    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6734A d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C6734A(eVar, fVar);
        }
    }

    static {
        C6734A c6734a = new C6734A(true);
        f42744x = c6734a;
        c6734a.o();
    }

    public static C6734A l() {
        return f42744x;
    }

    private void o() {
        this.f42748u = K.n();
    }

    public static b p() {
        return b.q();
    }

    public static b q(C6734A c6734a) {
        return p().s(c6734a);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f42750w;
        if (i8 != -1) {
            return i8;
        }
        int l8 = ((this.f42747t & 1) == 1 ? CodedOutputStream.l(1, this.f42748u) : 0) + this.f42746s.size();
        this.f42750w = l8;
        return l8;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f42749v;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        if (!n() || m().c()) {
            this.f42749v = 1;
            return true;
        }
        this.f42749v = 0;
        return false;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f42747t & 1) == 1) {
            codedOutputStream.O(1, this.f42748u);
        }
        codedOutputStream.S(this.f42746s);
    }

    public K m() {
        return this.f42748u;
    }

    public boolean n() {
        return (this.f42747t & 1) == 1;
    }

    public b r() {
        return q(this);
    }

    private C6734A(g.a aVar) {
        super(aVar);
        this.f42749v = -1;
        this.f42750w = -1;
        this.f42746s = aVar.i();
    }

    private C6734A(boolean z7) {
        this.f42749v = -1;
        this.f42750w = -1;
        this.f42746s = com.google.protobuf.d.f33078o;
    }

    private C6734A(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f42749v = -1;
        this.f42750w = -1;
        o();
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
                            K.b x8 = (this.f42747t & 1) == 1 ? this.f42748u.x() : null;
                            K k8 = (K) eVar.n(K.f42853z, fVar);
                            this.f42748u = k8;
                            if (x8 != null) {
                                x8.w(k8);
                                this.f42748u = x8.q();
                            }
                            this.f42747t |= 1;
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
                    this.f42746s = t7.h();
                    throw th2;
                }
                this.f42746s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f42746s = t7.h();
            throw th3;
        }
        this.f42746s = t7.h();
        g();
    }

    /* renamed from: s5.A$b */
    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f42751s;

        /* renamed from: t, reason: collision with root package name */
        private K f42752t = K.n();

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public C6734A m() {
            C6734A c6734a = new C6734A(this);
            int i8 = (this.f42751s & 1) != 1 ? 0 : 1;
            c6734a.f42748u = this.f42752t;
            c6734a.f42747t = i8;
            return c6734a;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(C6734A c6734a) {
            if (c6734a == C6734A.l()) {
                return this;
            }
            if (c6734a.n()) {
                u(c6734a.m());
            }
            k(i().c(c6734a.f42746s));
            return this;
        }

        public b u(K k8) {
            if ((this.f42751s & 1) != 1 || this.f42752t == K.n()) {
                this.f42752t = k8;
            } else {
                this.f42752t = K.v(this.f42752t).w(k8).q();
            }
            this.f42751s |= 1;
            return this;
        }

        private void r() {
        }
    }
}
