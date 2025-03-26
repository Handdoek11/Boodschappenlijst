package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class p0 extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: C, reason: collision with root package name */
    private static final p0 f43427C;

    /* renamed from: D, reason: collision with root package name */
    public static com.google.protobuf.n f43428D = new a();

    /* renamed from: A, reason: collision with root package name */
    private int f43429A;

    /* renamed from: B, reason: collision with root package name */
    private int f43430B;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43431s;

    /* renamed from: t, reason: collision with root package name */
    private int f43432t;

    /* renamed from: u, reason: collision with root package name */
    private c f43433u;

    /* renamed from: v, reason: collision with root package name */
    private Object f43434v;

    /* renamed from: w, reason: collision with root package name */
    private com.google.protobuf.j f43435w;

    /* renamed from: x, reason: collision with root package name */
    private EnumC6746l f43436x;

    /* renamed from: y, reason: collision with root package name */
    private Object f43437y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f43438z;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public p0 d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new p0(eVar, fVar);
        }
    }

    public enum c {
        ADD_ITEM_CHECK_LIST_NAME(0, 1),
        ADD_ITEM(1, 2),
        RENAME_ITEM(2, 3);


        /* renamed from: v, reason: collision with root package name */
        private static h.a f43449v = new a();

        /* renamed from: o, reason: collision with root package name */
        private final int f43451o;

        class a implements h.a {
            a() {
            }
        }

        c(int i8, int i9) {
            this.f43451o = i9;
        }

        public static c c(int i8) {
            if (i8 == 1) {
                return ADD_ITEM_CHECK_LIST_NAME;
            }
            if (i8 == 2) {
                return ADD_ITEM;
            }
            if (i8 != 3) {
                return null;
            }
            return RENAME_ITEM;
        }

        public final int e() {
            return this.f43451o;
        }
    }

    static {
        p0 p0Var = new p0(true);
        f43427C = p0Var;
        p0Var.F();
    }

    private void F() {
        this.f43433u = c.ADD_ITEM_CHECK_LIST_NAME;
        this.f43434v = "";
        this.f43435w = com.google.protobuf.i.f33103s;
        this.f43436x = EnumC6746l.AC_LEAVE;
        this.f43437y = "";
        this.f43438z = false;
    }

    public static b G() {
        return b.s();
    }

    public static b H(p0 p0Var) {
        return G().w(p0Var);
    }

    public static p0 u() {
        return f43427C;
    }

    public boolean A() {
        return (this.f43432t & 4) == 4;
    }

    public boolean B() {
        return (this.f43432t & 8) == 8;
    }

    public boolean C() {
        return (this.f43432t & 2) == 2;
    }

    public boolean D() {
        return (this.f43432t & 16) == 16;
    }

    public boolean E() {
        return (this.f43432t & 1) == 1;
    }

    public b I() {
        return H(this);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43430B;
        if (i8 != -1) {
            return i8;
        }
        int f8 = (this.f43432t & 1) == 1 ? CodedOutputStream.f(1, this.f43433u.e()) : 0;
        if ((this.f43432t & 2) == 2) {
            f8 += CodedOutputStream.d(2, w());
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f43435w.size(); i10++) {
            i9 += CodedOutputStream.e(this.f43435w.h0(i10));
        }
        int size = f8 + i9 + z().size();
        if ((this.f43432t & 4) == 4) {
            size += CodedOutputStream.f(4, this.f43436x.e());
        }
        if ((this.f43432t & 8) == 8) {
            size += CodedOutputStream.d(5, v());
        }
        if ((this.f43432t & 16) == 16) {
            size += CodedOutputStream.b(6, this.f43438z);
        }
        int size2 = size + this.f43431s.size();
        this.f43430B = size2;
        return size2;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43429A;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43429A = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43432t & 1) == 1) {
            codedOutputStream.G(1, this.f43433u.e());
        }
        if ((this.f43432t & 2) == 2) {
            codedOutputStream.E(2, w());
        }
        for (int i8 = 0; i8 < this.f43435w.size(); i8++) {
            codedOutputStream.E(3, this.f43435w.h0(i8));
        }
        if ((this.f43432t & 4) == 4) {
            codedOutputStream.G(4, this.f43436x.e());
        }
        if ((this.f43432t & 8) == 8) {
            codedOutputStream.E(5, v());
        }
        if ((this.f43432t & 16) == 16) {
            codedOutputStream.C(6, this.f43438z);
        }
        codedOutputStream.S(this.f43431s);
    }

    public EnumC6746l t() {
        return this.f43436x;
    }

    public com.google.protobuf.d v() {
        Object obj = this.f43437y;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43437y = n8;
        return n8;
    }

    public com.google.protobuf.d w() {
        Object obj = this.f43434v;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43434v = n8;
        return n8;
    }

    public boolean x() {
        return this.f43438z;
    }

    public c y() {
        return this.f43433u;
    }

    public com.google.protobuf.o z() {
        return this.f43435w;
    }

    private p0(g.a aVar) {
        super(aVar);
        this.f43429A = -1;
        this.f43430B = -1;
        this.f43431s = aVar.i();
    }

    private p0(boolean z7) {
        this.f43429A = -1;
        this.f43430B = -1;
        this.f43431s = com.google.protobuf.d.f33078o;
    }

    private p0(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43429A = -1;
        this.f43430B = -1;
        F();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        char c8 = 0;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 != 0) {
                        if (x7 == 8) {
                            int k8 = eVar.k();
                            c c9 = c.c(k8);
                            if (c9 == null) {
                                w7.W(x7);
                                w7.W(k8);
                            } else {
                                this.f43432t |= 1;
                                this.f43433u = c9;
                            }
                        } else if (x7 == 18) {
                            com.google.protobuf.d j8 = eVar.j();
                            this.f43432t |= 2;
                            this.f43434v = j8;
                        } else if (x7 == 26) {
                            com.google.protobuf.d j9 = eVar.j();
                            if ((c8 & 4) != 4) {
                                this.f43435w = new com.google.protobuf.i();
                                c8 = 4;
                            }
                            this.f43435w.E(j9);
                        } else if (x7 == 32) {
                            int k9 = eVar.k();
                            EnumC6746l c10 = EnumC6746l.c(k9);
                            if (c10 == null) {
                                w7.W(x7);
                                w7.W(k9);
                            } else {
                                this.f43432t |= 4;
                                this.f43436x = c10;
                            }
                        } else if (x7 == 42) {
                            com.google.protobuf.d j10 = eVar.j();
                            this.f43432t |= 8;
                            this.f43437y = j10;
                        } else if (x7 != 48) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            this.f43432t |= 16;
                            this.f43438z = eVar.i();
                        }
                    }
                    z7 = true;
                } catch (InvalidProtocolBufferException e8) {
                    throw e8.g(this);
                } catch (IOException e9) {
                    throw new InvalidProtocolBufferException(e9.getMessage()).g(this);
                }
            } catch (Throwable th) {
                if ((c8 & 4) == 4) {
                    this.f43435w = this.f43435w.i();
                }
                try {
                    w7.v();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f43431s = t7.h();
                    throw th2;
                }
                this.f43431s = t7.h();
                g();
                throw th;
            }
        }
        if ((c8 & 4) == 4) {
            this.f43435w = this.f43435w.i();
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43431s = t7.h();
            throw th3;
        }
        this.f43431s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43439s;

        /* renamed from: t, reason: collision with root package name */
        private c f43440t = c.ADD_ITEM_CHECK_LIST_NAME;

        /* renamed from: u, reason: collision with root package name */
        private Object f43441u = "";

        /* renamed from: v, reason: collision with root package name */
        private com.google.protobuf.j f43442v = com.google.protobuf.i.f33103s;

        /* renamed from: w, reason: collision with root package name */
        private EnumC6746l f43443w = EnumC6746l.AC_LEAVE;

        /* renamed from: x, reason: collision with root package name */
        private Object f43444x = "";

        /* renamed from: y, reason: collision with root package name */
        private boolean f43445y;

        private b() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b s() {
            return new b();
        }

        private void u() {
            if ((this.f43439s & 4) != 4) {
                this.f43442v = new com.google.protobuf.i(this.f43442v);
                this.f43439s |= 4;
            }
        }

        public b A(c cVar) {
            cVar.getClass();
            this.f43439s |= 1;
            this.f43440t = cVar;
            return this;
        }

        public b m(String str) {
            str.getClass();
            u();
            this.f43442v.add(str);
            return this;
        }

        public p0 p() {
            p0 q8 = q();
            if (q8.c()) {
                return q8;
            }
            throw a.AbstractC0243a.h(q8);
        }

        public p0 q() {
            p0 p0Var = new p0(this);
            int i8 = this.f43439s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            p0Var.f43433u = this.f43440t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            p0Var.f43434v = this.f43441u;
            if ((this.f43439s & 4) == 4) {
                this.f43442v = this.f43442v.i();
                this.f43439s &= -5;
            }
            p0Var.f43435w = this.f43442v;
            if ((i8 & 8) == 8) {
                i9 |= 4;
            }
            p0Var.f43436x = this.f43443w;
            if ((i8 & 16) == 16) {
                i9 |= 8;
            }
            p0Var.f43437y = this.f43444x;
            if ((i8 & 32) == 32) {
                i9 |= 16;
            }
            p0Var.f43438z = this.f43445y;
            p0Var.f43432t = i9;
            return p0Var;
        }

        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return s().w(q());
        }

        public b w(p0 p0Var) {
            if (p0Var == p0.u()) {
                return this;
            }
            if (p0Var.E()) {
                A(p0Var.y());
            }
            if (p0Var.C()) {
                this.f43439s |= 2;
                this.f43441u = p0Var.f43434v;
            }
            if (!p0Var.f43435w.isEmpty()) {
                if (this.f43442v.isEmpty()) {
                    this.f43442v = p0Var.f43435w;
                    this.f43439s &= -5;
                } else {
                    u();
                    this.f43442v.addAll(p0Var.f43435w);
                }
            }
            if (p0Var.A()) {
                x(p0Var.t());
            }
            if (p0Var.B()) {
                this.f43439s |= 16;
                this.f43444x = p0Var.f43437y;
            }
            if (p0Var.D()) {
                z(p0Var.x());
            }
            k(i().c(p0Var.f43431s));
            return this;
        }

        public b x(EnumC6746l enumC6746l) {
            enumC6746l.getClass();
            this.f43439s |= 8;
            this.f43443w = enumC6746l;
            return this;
        }

        public b y(String str) {
            str.getClass();
            this.f43439s |= 2;
            this.f43441u = str;
            return this;
        }

        public b z(boolean z7) {
            this.f43439s |= 32;
            this.f43445y = z7;
            return this;
        }

        private void v() {
        }
    }
}
