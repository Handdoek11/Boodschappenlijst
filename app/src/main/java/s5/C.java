package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;
import s5.B;

/* loaded from: classes2.dex */
public final class C extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: y, reason: collision with root package name */
    private static final C f42764y;

    /* renamed from: z, reason: collision with root package name */
    public static com.google.protobuf.n f42765z = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f42766s;

    /* renamed from: t, reason: collision with root package name */
    private int f42767t;

    /* renamed from: u, reason: collision with root package name */
    private B f42768u;

    /* renamed from: v, reason: collision with root package name */
    private long f42769v;

    /* renamed from: w, reason: collision with root package name */
    private int f42770w;

    /* renamed from: x, reason: collision with root package name */
    private int f42771x;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C(eVar, fVar);
        }
    }

    static {
        C c8 = new C(true);
        f42764y = c8;
        c8.r();
    }

    public static C m() {
        return f42764y;
    }

    private void r() {
        this.f42768u = B.m();
        this.f42769v = 0L;
    }

    public static b s() {
        return b.q();
    }

    public static b t(C c8) {
        return s().u(c8);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f42771x;
        if (i8 != -1) {
            return i8;
        }
        int l8 = (this.f42767t & 1) == 1 ? CodedOutputStream.l(1, this.f42768u) : 0;
        if ((this.f42767t & 2) == 2) {
            l8 += CodedOutputStream.j(2, this.f42769v);
        }
        int size = l8 + this.f42766s.size();
        this.f42771x = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f42770w;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f42770w = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f42767t & 1) == 1) {
            codedOutputStream.O(1, this.f42768u);
        }
        if ((this.f42767t & 2) == 2) {
            codedOutputStream.M(2, this.f42769v);
        }
        codedOutputStream.S(this.f42766s);
    }

    public B n() {
        return this.f42768u;
    }

    public long o() {
        return this.f42769v;
    }

    public boolean p() {
        return (this.f42767t & 1) == 1;
    }

    public boolean q() {
        return (this.f42767t & 2) == 2;
    }

    public b u() {
        return t(this);
    }

    private C(g.a aVar) {
        super(aVar);
        this.f42770w = -1;
        this.f42771x = -1;
        this.f42766s = aVar.i();
    }

    private C(boolean z7) {
        this.f42770w = -1;
        this.f42771x = -1;
        this.f42766s = com.google.protobuf.d.f33078o;
    }

    private C(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f42770w = -1;
        this.f42771x = -1;
        r();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 != 0) {
                        if (x7 == 10) {
                            B.b u7 = (this.f42767t & 1) == 1 ? this.f42768u.u() : null;
                            B b8 = (B) eVar.n(B.f42754z, fVar);
                            this.f42768u = b8;
                            if (u7 != null) {
                                u7.s(b8);
                                this.f42768u = u7.m();
                            }
                            this.f42767t |= 1;
                        } else if (x7 != 16) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            this.f42767t |= 2;
                            this.f42769v = eVar.m();
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
                    this.f42766s = t7.h();
                    throw th2;
                }
                this.f42766s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f42766s = t7.h();
            throw th3;
        }
        this.f42766s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f42772s;

        /* renamed from: t, reason: collision with root package name */
        private B f42773t = B.m();

        /* renamed from: u, reason: collision with root package name */
        private long f42774u;

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public C m() {
            C c8 = new C(this);
            int i8 = this.f42772s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            c8.f42768u = this.f42773t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            c8.f42769v = this.f42774u;
            c8.f42767t = i9;
            return c8;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().u(m());
        }

        public b s(B b8) {
            if ((this.f42772s & 1) != 1 || this.f42773t == B.m()) {
                this.f42773t = b8;
            } else {
                this.f42773t = B.t(this.f42773t).s(b8).m();
            }
            this.f42772s |= 1;
            return this;
        }

        public b u(C c8) {
            if (c8 == C.m()) {
                return this;
            }
            if (c8.p()) {
                s(c8.n());
            }
            if (c8.q()) {
                v(c8.o());
            }
            k(i().c(c8.f42766s));
            return this;
        }

        public b v(long j8) {
            this.f42772s |= 2;
            this.f42774u = j8;
            return this;
        }

        private void r() {
        }
    }
}
