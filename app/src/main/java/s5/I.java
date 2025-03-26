package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s5.a0;

/* loaded from: classes2.dex */
public final class I extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: C, reason: collision with root package name */
    private static final I f42820C;

    /* renamed from: D, reason: collision with root package name */
    public static com.google.protobuf.n f42821D = new a();

    /* renamed from: A, reason: collision with root package name */
    private int f42822A;

    /* renamed from: B, reason: collision with root package name */
    private int f42823B;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f42824s;

    /* renamed from: t, reason: collision with root package name */
    private int f42825t;

    /* renamed from: u, reason: collision with root package name */
    private a0 f42826u;

    /* renamed from: v, reason: collision with root package name */
    private List f42827v;

    /* renamed from: w, reason: collision with root package name */
    private com.google.protobuf.j f42828w;

    /* renamed from: x, reason: collision with root package name */
    private int f42829x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f42830y;

    /* renamed from: z, reason: collision with root package name */
    private EnumC6746l f42831z;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public I d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new I(eVar, fVar);
        }
    }

    static {
        I i8 = new I(true);
        f42820C = i8;
        i8.F();
    }

    private void F() {
        this.f42826u = a0.m();
        this.f42827v = Collections.emptyList();
        this.f42828w = com.google.protobuf.i.f33103s;
        this.f42829x = 0;
        this.f42830y = false;
        this.f42831z = EnumC6746l.AC_LEAVE;
    }

    public static b G() {
        return b.q();
    }

    public static b H(I i8) {
        return G().v(i8);
    }

    public static I u() {
        return f42820C;
    }

    public boolean A() {
        return this.f42830y;
    }

    public boolean B() {
        return (this.f42825t & 8) == 8;
    }

    public boolean C() {
        return (this.f42825t & 2) == 2;
    }

    public boolean D() {
        return (this.f42825t & 1) == 1;
    }

    public boolean E() {
        return (this.f42825t & 4) == 4;
    }

    public b I() {
        return H(this);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f42823B;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f42827v.size(); i10++) {
            i9 += CodedOutputStream.l(1, (com.google.protobuf.l) this.f42827v.get(i10));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f42828w.size(); i12++) {
            i11 += CodedOutputStream.e(this.f42828w.h0(i12));
        }
        int size = i9 + i11 + t().size();
        if ((this.f42825t & 1) == 1) {
            size += CodedOutputStream.l(3, this.f42826u);
        }
        if ((this.f42825t & 2) == 2) {
            size += CodedOutputStream.t(4, this.f42829x);
        }
        if ((this.f42825t & 4) == 4) {
            size += CodedOutputStream.b(5, this.f42830y);
        }
        if ((this.f42825t & 8) == 8) {
            size += CodedOutputStream.f(6, this.f42831z.e());
        }
        int size2 = size + this.f42824s.size();
        this.f42823B = size2;
        return size2;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f42822A;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        for (int i9 = 0; i9 < x(); i9++) {
            if (!w(i9).c()) {
                this.f42822A = 0;
                return false;
            }
        }
        this.f42822A = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        for (int i8 = 0; i8 < this.f42827v.size(); i8++) {
            codedOutputStream.O(1, (com.google.protobuf.l) this.f42827v.get(i8));
        }
        for (int i9 = 0; i9 < this.f42828w.size(); i9++) {
            codedOutputStream.E(2, this.f42828w.h0(i9));
        }
        if ((this.f42825t & 1) == 1) {
            codedOutputStream.O(3, this.f42826u);
        }
        if ((this.f42825t & 2) == 2) {
            codedOutputStream.b0(4, this.f42829x);
        }
        if ((this.f42825t & 4) == 4) {
            codedOutputStream.C(5, this.f42830y);
        }
        if ((this.f42825t & 8) == 8) {
            codedOutputStream.G(6, this.f42831z.e());
        }
        codedOutputStream.S(this.f42824s);
    }

    public EnumC6746l s() {
        return this.f42831z;
    }

    public com.google.protobuf.o t() {
        return this.f42828w;
    }

    public int v() {
        return this.f42829x;
    }

    public K w(int i8) {
        return (K) this.f42827v.get(i8);
    }

    public int x() {
        return this.f42827v.size();
    }

    public List y() {
        return this.f42827v;
    }

    public a0 z() {
        return this.f42826u;
    }

    private I(g.a aVar) {
        super(aVar);
        this.f42822A = -1;
        this.f42823B = -1;
        this.f42824s = aVar.i();
    }

    private I(boolean z7) {
        this.f42822A = -1;
        this.f42823B = -1;
        this.f42824s = com.google.protobuf.d.f33078o;
    }

    private I(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f42822A = -1;
        this.f42823B = -1;
        F();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        int i8 = 0;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 != 0) {
                        if (x7 == 10) {
                            if ((i8 & 2) != 2) {
                                this.f42827v = new ArrayList();
                                i8 |= 2;
                            }
                            this.f42827v.add((K) eVar.n(K.f42853z, fVar));
                        } else if (x7 == 18) {
                            com.google.protobuf.d j8 = eVar.j();
                            if ((i8 & 4) != 4) {
                                this.f42828w = new com.google.protobuf.i();
                                i8 |= 4;
                            }
                            this.f42828w.E(j8);
                        } else if (x7 == 26) {
                            a0.b t8 = (this.f42825t & 1) == 1 ? this.f42826u.t() : null;
                            a0 a0Var = (a0) eVar.n(a0.f43051y, fVar);
                            this.f42826u = a0Var;
                            if (t8 != null) {
                                t8.s(a0Var);
                                this.f42826u = t8.m();
                            }
                            this.f42825t |= 1;
                        } else if (x7 == 32) {
                            this.f42825t |= 2;
                            this.f42829x = eVar.y();
                        } else if (x7 == 40) {
                            this.f42825t |= 4;
                            this.f42830y = eVar.i();
                        } else if (x7 != 48) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            int k8 = eVar.k();
                            EnumC6746l c8 = EnumC6746l.c(k8);
                            if (c8 == null) {
                                w7.W(x7);
                                w7.W(k8);
                            } else {
                                this.f42825t |= 8;
                                this.f42831z = c8;
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
                if ((i8 & 2) == 2) {
                    this.f42827v = DesugarCollections.unmodifiableList(this.f42827v);
                }
                if ((i8 & 4) == 4) {
                    this.f42828w = this.f42828w.i();
                }
                try {
                    w7.v();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f42824s = t7.h();
                    throw th2;
                }
                this.f42824s = t7.h();
                g();
                throw th;
            }
        }
        if ((i8 & 2) == 2) {
            this.f42827v = DesugarCollections.unmodifiableList(this.f42827v);
        }
        if ((i8 & 4) == 4) {
            this.f42828w = this.f42828w.i();
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f42824s = t7.h();
            throw th3;
        }
        this.f42824s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f42832s;

        /* renamed from: w, reason: collision with root package name */
        private int f42836w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f42837x;

        /* renamed from: t, reason: collision with root package name */
        private a0 f42833t = a0.m();

        /* renamed from: u, reason: collision with root package name */
        private List f42834u = Collections.emptyList();

        /* renamed from: v, reason: collision with root package name */
        private com.google.protobuf.j f42835v = com.google.protobuf.i.f33103s;

        /* renamed from: y, reason: collision with root package name */
        private EnumC6746l f42838y = EnumC6746l.AC_LEAVE;

        private b() {
            u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        private void r() {
            if ((this.f42832s & 4) != 4) {
                this.f42835v = new com.google.protobuf.i(this.f42835v);
                this.f42832s |= 4;
            }
        }

        private void s() {
            if ((this.f42832s & 2) != 2) {
                this.f42834u = new ArrayList(this.f42834u);
                this.f42832s |= 2;
            }
        }

        public I m() {
            I i8 = new I(this);
            int i9 = this.f42832s;
            int i10 = (i9 & 1) != 1 ? 0 : 1;
            i8.f42826u = this.f42833t;
            if ((this.f42832s & 2) == 2) {
                this.f42834u = DesugarCollections.unmodifiableList(this.f42834u);
                this.f42832s &= -3;
            }
            i8.f42827v = this.f42834u;
            if ((this.f42832s & 4) == 4) {
                this.f42835v = this.f42835v.i();
                this.f42832s &= -5;
            }
            i8.f42828w = this.f42835v;
            if ((i9 & 8) == 8) {
                i10 |= 2;
            }
            i8.f42829x = this.f42836w;
            if ((i9 & 16) == 16) {
                i10 |= 4;
            }
            i8.f42830y = this.f42837x;
            if ((i9 & 32) == 32) {
                i10 |= 8;
            }
            i8.f42831z = this.f42838y;
            i8.f42825t = i10;
            return i8;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().v(m());
        }

        public b v(I i8) {
            if (i8 == I.u()) {
                return this;
            }
            if (i8.D()) {
                w(i8.z());
            }
            if (!i8.f42827v.isEmpty()) {
                if (this.f42834u.isEmpty()) {
                    this.f42834u = i8.f42827v;
                    this.f42832s &= -3;
                } else {
                    s();
                    this.f42834u.addAll(i8.f42827v);
                }
            }
            if (!i8.f42828w.isEmpty()) {
                if (this.f42835v.isEmpty()) {
                    this.f42835v = i8.f42828w;
                    this.f42832s &= -5;
                } else {
                    r();
                    this.f42835v.addAll(i8.f42828w);
                }
            }
            if (i8.C()) {
                y(i8.v());
            }
            if (i8.E()) {
                z(i8.A());
            }
            if (i8.B()) {
                x(i8.s());
            }
            k(i().c(i8.f42824s));
            return this;
        }

        public b w(a0 a0Var) {
            if ((this.f42832s & 1) != 1 || this.f42833t == a0.m()) {
                this.f42833t = a0Var;
            } else {
                this.f42833t = a0.s(this.f42833t).s(a0Var).m();
            }
            this.f42832s |= 1;
            return this;
        }

        public b x(EnumC6746l enumC6746l) {
            enumC6746l.getClass();
            this.f42832s |= 32;
            this.f42838y = enumC6746l;
            return this;
        }

        public b y(int i8) {
            this.f42832s |= 8;
            this.f42836w = i8;
            return this;
        }

        public b z(boolean z7) {
            this.f42832s |= 16;
            this.f42837x = z7;
            return this;
        }

        private void u() {
        }
    }
}
