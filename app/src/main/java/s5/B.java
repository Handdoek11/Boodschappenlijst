package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class B extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: y, reason: collision with root package name */
    private static final B f42753y;

    /* renamed from: z, reason: collision with root package name */
    public static com.google.protobuf.n f42754z = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f42755s;

    /* renamed from: t, reason: collision with root package name */
    private int f42756t;

    /* renamed from: u, reason: collision with root package name */
    private E f42757u;

    /* renamed from: v, reason: collision with root package name */
    private b0 f42758v;

    /* renamed from: w, reason: collision with root package name */
    private int f42759w;

    /* renamed from: x, reason: collision with root package name */
    private int f42760x;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public B d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new B(eVar, fVar);
        }
    }

    static {
        B b8 = new B(true);
        f42753y = b8;
        b8.r();
    }

    public static B m() {
        return f42753y;
    }

    private void r() {
        this.f42757u = E.UNKNOWN_EXPERIMENT;
        this.f42758v = b0.POPULATION_NONE;
    }

    public static b s() {
        return b.q();
    }

    public static b t(B b8) {
        return s().s(b8);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f42760x;
        if (i8 != -1) {
            return i8;
        }
        int f8 = (this.f42756t & 1) == 1 ? CodedOutputStream.f(1, this.f42757u.e()) : 0;
        if ((this.f42756t & 2) == 2) {
            f8 += CodedOutputStream.f(2, this.f42758v.e());
        }
        int size = f8 + this.f42755s.size();
        this.f42760x = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f42759w;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f42759w = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f42756t & 1) == 1) {
            codedOutputStream.G(1, this.f42757u.e());
        }
        if ((this.f42756t & 2) == 2) {
            codedOutputStream.G(2, this.f42758v.e());
        }
        codedOutputStream.S(this.f42755s);
    }

    public E n() {
        return this.f42757u;
    }

    public b0 o() {
        return this.f42758v;
    }

    public boolean p() {
        return (this.f42756t & 1) == 1;
    }

    public boolean q() {
        return (this.f42756t & 2) == 2;
    }

    public b u() {
        return t(this);
    }

    private B(g.a aVar) {
        super(aVar);
        this.f42759w = -1;
        this.f42760x = -1;
        this.f42755s = aVar.i();
    }

    private B(boolean z7) {
        this.f42759w = -1;
        this.f42760x = -1;
        this.f42755s = com.google.protobuf.d.f33078o;
    }

    private B(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f42759w = -1;
        this.f42760x = -1;
        r();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 != 0) {
                        if (x7 == 8) {
                            int k8 = eVar.k();
                            E c8 = E.c(k8);
                            if (c8 == null) {
                                w7.W(x7);
                                w7.W(k8);
                            } else {
                                this.f42756t |= 1;
                                this.f42757u = c8;
                            }
                        } else if (x7 != 16) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            int k9 = eVar.k();
                            b0 c9 = b0.c(k9);
                            if (c9 == null) {
                                w7.W(x7);
                                w7.W(k9);
                            } else {
                                this.f42756t |= 2;
                                this.f42758v = c9;
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
                    this.f42755s = t7.h();
                    throw th2;
                }
                this.f42755s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f42755s = t7.h();
            throw th3;
        }
        this.f42755s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f42761s;

        /* renamed from: t, reason: collision with root package name */
        private E f42762t = E.UNKNOWN_EXPERIMENT;

        /* renamed from: u, reason: collision with root package name */
        private b0 f42763u = b0.POPULATION_NONE;

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public B m() {
            B b8 = new B(this);
            int i8 = this.f42761s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            b8.f42757u = this.f42762t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            b8.f42758v = this.f42763u;
            b8.f42756t = i9;
            return b8;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(B b8) {
            if (b8 == B.m()) {
                return this;
            }
            if (b8.p()) {
                u(b8.n());
            }
            if (b8.q()) {
                v(b8.o());
            }
            k(i().c(b8.f42755s));
            return this;
        }

        public b u(E e8) {
            e8.getClass();
            this.f42761s |= 1;
            this.f42762t = e8;
            return this;
        }

        public b v(b0 b0Var) {
            b0Var.getClass();
            this.f42761s |= 2;
            this.f42763u = b0Var;
            return this;
        }

        private void r() {
        }
    }
}
