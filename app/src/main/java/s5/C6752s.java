package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* renamed from: s5.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6752s extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: y, reason: collision with root package name */
    private static final C6752s f43498y;

    /* renamed from: z, reason: collision with root package name */
    public static com.google.protobuf.n f43499z = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43500s;

    /* renamed from: t, reason: collision with root package name */
    private int f43501t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f43502u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f43503v;

    /* renamed from: w, reason: collision with root package name */
    private int f43504w;

    /* renamed from: x, reason: collision with root package name */
    private int f43505x;

    /* renamed from: s5.s$a */
    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6752s d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C6752s(eVar, fVar);
        }
    }

    static {
        C6752s c6752s = new C6752s(true);
        f43498y = c6752s;
        c6752s.r();
    }

    public static C6752s n() {
        return f43498y;
    }

    private void r() {
        this.f43502u = false;
        this.f43503v = false;
    }

    public static b s() {
        return b.q();
    }

    public static b t(C6752s c6752s) {
        return s().s(c6752s);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43505x;
        if (i8 != -1) {
            return i8;
        }
        int b8 = (this.f43501t & 1) == 1 ? CodedOutputStream.b(1, this.f43502u) : 0;
        if ((this.f43501t & 2) == 2) {
            b8 += CodedOutputStream.b(2, this.f43503v);
        }
        int size = b8 + this.f43500s.size();
        this.f43505x = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43504w;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43504w = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43501t & 1) == 1) {
            codedOutputStream.C(1, this.f43502u);
        }
        if ((this.f43501t & 2) == 2) {
            codedOutputStream.C(2, this.f43503v);
        }
        codedOutputStream.S(this.f43500s);
    }

    public boolean m() {
        return this.f43502u;
    }

    public boolean o() {
        return this.f43503v;
    }

    public boolean p() {
        return (this.f43501t & 1) == 1;
    }

    public boolean q() {
        return (this.f43501t & 2) == 2;
    }

    public b u() {
        return t(this);
    }

    private C6752s(g.a aVar) {
        super(aVar);
        this.f43504w = -1;
        this.f43505x = -1;
        this.f43500s = aVar.i();
    }

    private C6752s(boolean z7) {
        this.f43504w = -1;
        this.f43505x = -1;
        this.f43500s = com.google.protobuf.d.f33078o;
    }

    private C6752s(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43504w = -1;
        this.f43505x = -1;
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
                            this.f43501t |= 1;
                            this.f43502u = eVar.i();
                        } else if (x7 != 16) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            this.f43501t |= 2;
                            this.f43503v = eVar.i();
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
                    this.f43500s = t7.h();
                    throw th2;
                }
                this.f43500s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43500s = t7.h();
            throw th3;
        }
        this.f43500s = t7.h();
        g();
    }

    /* renamed from: s5.s$b */
    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43506s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f43507t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f43508u;

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public C6752s m() {
            C6752s c6752s = new C6752s(this);
            int i8 = this.f43506s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            c6752s.f43502u = this.f43507t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            c6752s.f43503v = this.f43508u;
            c6752s.f43501t = i9;
            return c6752s;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(C6752s c6752s) {
            if (c6752s == C6752s.n()) {
                return this;
            }
            if (c6752s.p()) {
                u(c6752s.m());
            }
            if (c6752s.q()) {
                v(c6752s.o());
            }
            k(i().c(c6752s.f43500s));
            return this;
        }

        public b u(boolean z7) {
            this.f43506s |= 1;
            this.f43507t = z7;
            return this;
        }

        public b v(boolean z7) {
            this.f43506s |= 2;
            this.f43508u = z7;
            return this;
        }

        private void r() {
        }
    }
}
