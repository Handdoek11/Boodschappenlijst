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

/* loaded from: classes2.dex */
public final class q0 extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: C, reason: collision with root package name */
    private static final q0 f43463C;

    /* renamed from: D, reason: collision with root package name */
    public static com.google.protobuf.n f43464D = new a();

    /* renamed from: A, reason: collision with root package name */
    private int f43465A;

    /* renamed from: B, reason: collision with root package name */
    private int f43466B;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43467s;

    /* renamed from: t, reason: collision with root package name */
    private int f43468t;

    /* renamed from: u, reason: collision with root package name */
    private com.google.protobuf.j f43469u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f43470v;

    /* renamed from: w, reason: collision with root package name */
    private com.google.protobuf.j f43471w;

    /* renamed from: x, reason: collision with root package name */
    private com.google.protobuf.j f43472x;

    /* renamed from: y, reason: collision with root package name */
    private List f43473y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f43474z;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public q0 d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new q0(eVar, fVar);
        }
    }

    static {
        q0 q0Var = new q0(true);
        f43463C = q0Var;
        q0Var.I();
    }

    private void I() {
        com.google.protobuf.j jVar = com.google.protobuf.i.f33103s;
        this.f43469u = jVar;
        this.f43470v = false;
        this.f43471w = jVar;
        this.f43472x = jVar;
        this.f43473y = Collections.emptyList();
        this.f43474z = false;
    }

    public static b J() {
        return b.q();
    }

    public static b K(q0 q0Var) {
        return J().x(q0Var);
    }

    public static q0 v() {
        return f43463C;
    }

    public String A(int i8) {
        return (String) this.f43469u.get(i8);
    }

    public int B() {
        return this.f43469u.size();
    }

    public com.google.protobuf.o C() {
        return this.f43469u;
    }

    public boolean D() {
        return this.f43474z;
    }

    public int E() {
        return this.f43471w.size();
    }

    public com.google.protobuf.o F() {
        return this.f43471w;
    }

    public boolean G() {
        return (this.f43468t & 1) == 1;
    }

    public boolean H() {
        return (this.f43468t & 2) == 2;
    }

    public b L() {
        return K(this);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43466B;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f43469u.size(); i10++) {
            i9 += CodedOutputStream.e(this.f43469u.h0(i10));
        }
        int size = i9 + C().size();
        if ((this.f43468t & 1) == 1) {
            size += CodedOutputStream.b(2, this.f43470v);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f43471w.size(); i12++) {
            i11 += CodedOutputStream.e(this.f43471w.h0(i12));
        }
        int size2 = size + i11 + F().size();
        int i13 = 0;
        for (int i14 = 0; i14 < this.f43472x.size(); i14++) {
            i13 += CodedOutputStream.e(this.f43472x.h0(i14));
        }
        int size3 = size2 + i13 + w().size() + z().size() + z().size();
        if ((this.f43468t & 2) == 2) {
            size3 += CodedOutputStream.b(6, this.f43474z);
        }
        int size4 = size3 + this.f43467s.size();
        this.f43466B = size4;
        return size4;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43465A;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43465A = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        for (int i8 = 0; i8 < this.f43469u.size(); i8++) {
            codedOutputStream.E(1, this.f43469u.h0(i8));
        }
        if ((this.f43468t & 1) == 1) {
            codedOutputStream.C(2, this.f43470v);
        }
        for (int i9 = 0; i9 < this.f43471w.size(); i9++) {
            codedOutputStream.E(3, this.f43471w.h0(i9));
        }
        for (int i10 = 0; i10 < this.f43472x.size(); i10++) {
            codedOutputStream.E(4, this.f43472x.h0(i10));
        }
        for (int i11 = 0; i11 < this.f43473y.size(); i11++) {
            codedOutputStream.C(5, ((Boolean) this.f43473y.get(i11)).booleanValue());
        }
        if ((this.f43468t & 2) == 2) {
            codedOutputStream.C(6, this.f43474z);
        }
        codedOutputStream.S(this.f43467s);
    }

    public boolean u() {
        return this.f43470v;
    }

    public com.google.protobuf.o w() {
        return this.f43472x;
    }

    public boolean x(int i8) {
        return ((Boolean) this.f43473y.get(i8)).booleanValue();
    }

    public int y() {
        return this.f43473y.size();
    }

    public List z() {
        return this.f43473y;
    }

    private q0(g.a aVar) {
        super(aVar);
        this.f43465A = -1;
        this.f43466B = -1;
        this.f43467s = aVar.i();
    }

    private q0(boolean z7) {
        this.f43465A = -1;
        this.f43466B = -1;
        this.f43467s = com.google.protobuf.d.f33078o;
    }

    private q0(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43465A = -1;
        this.f43466B = -1;
        I();
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
                            com.google.protobuf.d j8 = eVar.j();
                            if ((i8 & 1) != 1) {
                                this.f43469u = new com.google.protobuf.i();
                                i8 |= 1;
                            }
                            this.f43469u.E(j8);
                        } else if (x7 == 16) {
                            this.f43468t |= 1;
                            this.f43470v = eVar.i();
                        } else if (x7 == 26) {
                            com.google.protobuf.d j9 = eVar.j();
                            if ((i8 & 4) != 4) {
                                this.f43471w = new com.google.protobuf.i();
                                i8 |= 4;
                            }
                            this.f43471w.E(j9);
                        } else if (x7 == 34) {
                            com.google.protobuf.d j10 = eVar.j();
                            if ((i8 & 8) != 8) {
                                this.f43472x = new com.google.protobuf.i();
                                i8 |= 8;
                            }
                            this.f43472x.E(j10);
                        } else if (x7 == 40) {
                            if ((i8 & 16) != 16) {
                                this.f43473y = new ArrayList();
                                i8 |= 16;
                            }
                            this.f43473y.add(Boolean.valueOf(eVar.i()));
                        } else if (x7 == 42) {
                            int h8 = eVar.h(eVar.s());
                            if ((i8 & 16) != 16 && eVar.c() > 0) {
                                this.f43473y = new ArrayList();
                                i8 |= 16;
                            }
                            while (eVar.c() > 0) {
                                this.f43473y.add(Boolean.valueOf(eVar.i()));
                            }
                            eVar.g(h8);
                        } else if (x7 != 48) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            this.f43468t |= 2;
                            this.f43474z = eVar.i();
                        }
                    }
                    z7 = true;
                } catch (InvalidProtocolBufferException e8) {
                    throw e8.g(this);
                } catch (IOException e9) {
                    throw new InvalidProtocolBufferException(e9.getMessage()).g(this);
                }
            } catch (Throwable th) {
                if ((i8 & 1) == 1) {
                    this.f43469u = this.f43469u.i();
                }
                if ((i8 & 4) == 4) {
                    this.f43471w = this.f43471w.i();
                }
                if ((i8 & 8) == 8) {
                    this.f43472x = this.f43472x.i();
                }
                if ((i8 & 16) == 16) {
                    this.f43473y = DesugarCollections.unmodifiableList(this.f43473y);
                }
                try {
                    w7.v();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f43467s = t7.h();
                    throw th2;
                }
                this.f43467s = t7.h();
                g();
                throw th;
            }
        }
        if ((i8 & 1) == 1) {
            this.f43469u = this.f43469u.i();
        }
        if ((i8 & 4) == 4) {
            this.f43471w = this.f43471w.i();
        }
        if ((i8 & 8) == 8) {
            this.f43472x = this.f43472x.i();
        }
        if ((i8 & 16) == 16) {
            this.f43473y = DesugarCollections.unmodifiableList(this.f43473y);
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43467s = t7.h();
            throw th3;
        }
        this.f43467s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43475s;

        /* renamed from: t, reason: collision with root package name */
        private com.google.protobuf.j f43476t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f43477u;

        /* renamed from: v, reason: collision with root package name */
        private com.google.protobuf.j f43478v;

        /* renamed from: w, reason: collision with root package name */
        private com.google.protobuf.j f43479w;

        /* renamed from: x, reason: collision with root package name */
        private List f43480x;

        /* renamed from: y, reason: collision with root package name */
        private boolean f43481y;

        private b() {
            com.google.protobuf.j jVar = com.google.protobuf.i.f33103s;
            this.f43476t = jVar;
            this.f43478v = jVar;
            this.f43479w = jVar;
            this.f43480x = Collections.emptyList();
            w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        private void r() {
            if ((this.f43475s & 8) != 8) {
                this.f43479w = new com.google.protobuf.i(this.f43479w);
                this.f43475s |= 8;
            }
        }

        private void s() {
            if ((this.f43475s & 16) != 16) {
                this.f43480x = new ArrayList(this.f43480x);
                this.f43475s |= 16;
            }
        }

        private void u() {
            if ((this.f43475s & 1) != 1) {
                this.f43476t = new com.google.protobuf.i(this.f43476t);
                this.f43475s |= 1;
            }
        }

        private void v() {
            if ((this.f43475s & 4) != 4) {
                this.f43478v = new com.google.protobuf.i(this.f43478v);
                this.f43475s |= 4;
            }
        }

        public q0 m() {
            q0 q0Var = new q0(this);
            int i8 = this.f43475s;
            if ((i8 & 1) == 1) {
                this.f43476t = this.f43476t.i();
                this.f43475s &= -2;
            }
            q0Var.f43469u = this.f43476t;
            int i9 = (i8 & 2) != 2 ? 0 : 1;
            q0Var.f43470v = this.f43477u;
            if ((this.f43475s & 4) == 4) {
                this.f43478v = this.f43478v.i();
                this.f43475s &= -5;
            }
            q0Var.f43471w = this.f43478v;
            if ((this.f43475s & 8) == 8) {
                this.f43479w = this.f43479w.i();
                this.f43475s &= -9;
            }
            q0Var.f43472x = this.f43479w;
            if ((this.f43475s & 16) == 16) {
                this.f43480x = DesugarCollections.unmodifiableList(this.f43480x);
                this.f43475s &= -17;
            }
            q0Var.f43473y = this.f43480x;
            if ((i8 & 32) == 32) {
                i9 |= 2;
            }
            q0Var.f43474z = this.f43481y;
            q0Var.f43468t = i9;
            return q0Var;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().x(m());
        }

        public b x(q0 q0Var) {
            if (q0Var == q0.v()) {
                return this;
            }
            if (!q0Var.f43469u.isEmpty()) {
                if (this.f43476t.isEmpty()) {
                    this.f43476t = q0Var.f43469u;
                    this.f43475s &= -2;
                } else {
                    u();
                    this.f43476t.addAll(q0Var.f43469u);
                }
            }
            if (q0Var.G()) {
                y(q0Var.u());
            }
            if (!q0Var.f43471w.isEmpty()) {
                if (this.f43478v.isEmpty()) {
                    this.f43478v = q0Var.f43471w;
                    this.f43475s &= -5;
                } else {
                    v();
                    this.f43478v.addAll(q0Var.f43471w);
                }
            }
            if (!q0Var.f43472x.isEmpty()) {
                if (this.f43479w.isEmpty()) {
                    this.f43479w = q0Var.f43472x;
                    this.f43475s &= -9;
                } else {
                    r();
                    this.f43479w.addAll(q0Var.f43472x);
                }
            }
            if (!q0Var.f43473y.isEmpty()) {
                if (this.f43480x.isEmpty()) {
                    this.f43480x = q0Var.f43473y;
                    this.f43475s &= -17;
                } else {
                    s();
                    this.f43480x.addAll(q0Var.f43473y);
                }
            }
            if (q0Var.H()) {
                z(q0Var.D());
            }
            k(i().c(q0Var.f43467s));
            return this;
        }

        public b y(boolean z7) {
            this.f43475s |= 2;
            this.f43477u = z7;
            return this;
        }

        public b z(boolean z7) {
            this.f43475s |= 32;
            this.f43481y = z7;
            return this;
        }

        private void w() {
        }
    }
}
