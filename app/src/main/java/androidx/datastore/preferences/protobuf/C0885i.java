package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.o0;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0885i implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0884h f9411a;

    /* renamed from: b, reason: collision with root package name */
    private int f9412b;

    /* renamed from: c, reason: collision with root package name */
    private int f9413c;

    /* renamed from: d, reason: collision with root package name */
    private int f9414d = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.i$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9415a;

        static {
            int[] iArr = new int[o0.b.values().length];
            f9415a = iArr;
            try {
                iArr[o0.b.f9468A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9415a[o0.b.f9472E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9415a[o0.b.f9480t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9415a[o0.b.f9474G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9415a[o0.b.f9486z.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9415a[o0.b.f9485y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9415a[o0.b.f9481u.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9415a[o0.b.f9484x.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9415a[o0.b.f9482v.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9415a[o0.b.f9471D.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9415a[o0.b.f9475H.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9415a[o0.b.f9476I.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9415a[o0.b.f9477J.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9415a[o0.b.f9478K.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9415a[o0.b.f9469B.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9415a[o0.b.f9473F.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9415a[o0.b.f9483w.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C0885i(AbstractC0884h abstractC0884h) {
        AbstractC0884h abstractC0884h2 = (AbstractC0884h) AbstractC0899x.b(abstractC0884h, "input");
        this.f9411a = abstractC0884h2;
        abstractC0884h2.f9391d = this;
    }

    public static C0885i O(AbstractC0884h abstractC0884h) {
        C0885i c0885i = abstractC0884h.f9391d;
        return c0885i != null ? c0885i : new C0885i(abstractC0884h);
    }

    private Object P(o0.b bVar, Class cls, C0890n c0890n) {
        switch (a.f9415a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(j());
            case 2:
                return B();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(s());
            case 5:
                return Integer.valueOf(i());
            case 6:
                return Long.valueOf(e());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(D());
            case 9:
                return Long.valueOf(K());
            case 10:
                return S(cls, c0890n);
            case 11:
                return Integer.valueOf(G());
            case 12:
                return Long.valueOf(k());
            case 13:
                return Integer.valueOf(u());
            case 14:
                return Long.valueOf(v());
            case 15:
                return L();
            case 16:
                return Integer.valueOf(m());
            case 17:
                return Long.valueOf(d());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private Object Q(c0 c0Var, C0890n c0890n) {
        int i8 = this.f9413c;
        this.f9413c = o0.c(o0.a(this.f9412b), 4);
        try {
            Object h8 = c0Var.h();
            c0Var.b(h8, this, c0890n);
            c0Var.c(h8);
            if (this.f9412b == this.f9413c) {
                return h8;
            }
            throw InvalidProtocolBufferException.g();
        } finally {
            this.f9413c = i8;
        }
    }

    private Object R(c0 c0Var, C0890n c0890n) {
        int C7 = this.f9411a.C();
        AbstractC0884h abstractC0884h = this.f9411a;
        if (abstractC0884h.f9388a >= abstractC0884h.f9389b) {
            throw InvalidProtocolBufferException.h();
        }
        int l8 = abstractC0884h.l(C7);
        Object h8 = c0Var.h();
        this.f9411a.f9388a++;
        c0Var.b(h8, this, c0890n);
        c0Var.c(h8);
        this.f9411a.a(0);
        r5.f9388a--;
        this.f9411a.k(l8);
        return h8;
    }

    private void U(int i8) {
        if (this.f9411a.d() != i8) {
            throw InvalidProtocolBufferException.k();
        }
    }

    private void V(int i8) {
        if (o0.b(this.f9412b) != i8) {
            throw InvalidProtocolBufferException.d();
        }
    }

    private void W(int i8) {
        if ((i8 & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    private void X(int i8) {
        if ((i8 & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void A(List list) {
        T(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public AbstractC0883g B() {
        V(2);
        return this.f9411a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void C(List list) {
        int B7;
        if (list instanceof AbstractC0895t) {
            androidx.appcompat.app.E.a(list);
            int b8 = o0.b(this.f9412b);
            if (b8 != 2) {
                if (b8 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                this.f9411a.s();
                throw null;
            }
            W(this.f9411a.C());
            this.f9411a.d();
            this.f9411a.s();
            throw null;
        }
        int b9 = o0.b(this.f9412b);
        if (b9 == 2) {
            int C7 = this.f9411a.C();
            W(C7);
            int d8 = this.f9411a.d() + C7;
            do {
                list.add(Float.valueOf(this.f9411a.s()));
            } while (this.f9411a.d() < d8);
            return;
        }
        if (b9 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Float.valueOf(this.f9411a.s()));
            if (this.f9411a.e()) {
                return;
            } else {
                B7 = this.f9411a.B();
            }
        } while (B7 == this.f9412b);
        this.f9414d = B7;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int D() {
        V(0);
        return this.f9411a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void E(List list, c0 c0Var, C0890n c0890n) {
        int B7;
        if (o0.b(this.f9412b) != 3) {
            throw InvalidProtocolBufferException.d();
        }
        int i8 = this.f9412b;
        do {
            list.add(Q(c0Var, c0890n));
            if (this.f9411a.e() || this.f9414d != 0) {
                return;
            } else {
                B7 = this.f9411a.B();
            }
        } while (B7 == i8);
        this.f9414d = B7;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public boolean F() {
        int i8;
        if (this.f9411a.e() || (i8 = this.f9412b) == this.f9413c) {
            return false;
        }
        return this.f9411a.E(i8);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int G() {
        V(5);
        return this.f9411a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void H(List list) {
        int B7;
        if (o0.b(this.f9412b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(B());
            if (this.f9411a.e()) {
                return;
            } else {
                B7 = this.f9411a.B();
            }
        } while (B7 == this.f9412b);
        this.f9414d = B7;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void I(List list) {
        int B7;
        if (list instanceof AbstractC0887k) {
            androidx.appcompat.app.E.a(list);
            int b8 = o0.b(this.f9412b);
            if (b8 == 1) {
                this.f9411a.o();
                throw null;
            }
            if (b8 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            X(this.f9411a.C());
            this.f9411a.d();
            this.f9411a.o();
            throw null;
        }
        int b9 = o0.b(this.f9412b);
        if (b9 == 1) {
            do {
                list.add(Double.valueOf(this.f9411a.o()));
                if (this.f9411a.e()) {
                    return;
                } else {
                    B7 = this.f9411a.B();
                }
            } while (B7 == this.f9412b);
            this.f9414d = B7;
            return;
        }
        if (b9 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int C7 = this.f9411a.C();
        X(C7);
        int d8 = this.f9411a.d() + C7;
        do {
            list.add(Double.valueOf(this.f9411a.o()));
        } while (this.f9411a.d() < d8);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void J(List list, c0 c0Var, C0890n c0890n) {
        int B7;
        if (o0.b(this.f9412b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int i8 = this.f9412b;
        do {
            list.add(R(c0Var, c0890n));
            if (this.f9411a.e() || this.f9414d != 0) {
                return;
            } else {
                B7 = this.f9411a.B();
            }
        } while (B7 == i8);
        this.f9414d = B7;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public long K() {
        V(0);
        return this.f9411a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public String L() {
        V(2);
        return this.f9411a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void M(List list) {
        int B7;
        if (list instanceof D) {
            androidx.appcompat.app.E.a(list);
            int b8 = o0.b(this.f9412b);
            if (b8 == 1) {
                this.f9411a.r();
                throw null;
            }
            if (b8 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            X(this.f9411a.C());
            this.f9411a.d();
            this.f9411a.r();
            throw null;
        }
        int b9 = o0.b(this.f9412b);
        if (b9 == 1) {
            do {
                list.add(Long.valueOf(this.f9411a.r()));
                if (this.f9411a.e()) {
                    return;
                } else {
                    B7 = this.f9411a.B();
                }
            } while (B7 == this.f9412b);
            this.f9414d = B7;
            return;
        }
        if (b9 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int C7 = this.f9411a.C();
        X(C7);
        int d8 = this.f9411a.d() + C7;
        do {
            list.add(Long.valueOf(this.f9411a.r()));
        } while (this.f9411a.d() < d8);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public Object N(c0 c0Var, C0890n c0890n) {
        V(3);
        return Q(c0Var, c0890n);
    }

    public Object S(Class cls, C0890n c0890n) {
        V(2);
        return R(Y.a().c(cls), c0890n);
    }

    public void T(List list, boolean z7) {
        int B7;
        int B8;
        if (o0.b(this.f9412b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        if (!(list instanceof B) || z7) {
            do {
                list.add(z7 ? L() : x());
                if (this.f9411a.e()) {
                    return;
                } else {
                    B7 = this.f9411a.B();
                }
            } while (B7 == this.f9412b);
            this.f9414d = B7;
            return;
        }
        B b8 = (B) list;
        do {
            b8.M(B());
            if (this.f9411a.e()) {
                return;
            } else {
                B8 = this.f9411a.B();
            }
        } while (B8 == this.f9412b);
        this.f9414d = B8;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int a() {
        return this.f9412b;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public Object b(c0 c0Var, C0890n c0890n) {
        V(2);
        return R(c0Var, c0890n);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void c(List list) {
        int B7;
        if (list instanceof AbstractC0898w) {
            androidx.appcompat.app.E.a(list);
            int b8 = o0.b(this.f9412b);
            if (b8 == 0) {
                this.f9411a.x();
                throw null;
            }
            if (b8 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            this.f9411a.C();
            this.f9411a.d();
            this.f9411a.x();
            throw null;
        }
        int b9 = o0.b(this.f9412b);
        if (b9 == 0) {
            do {
                list.add(Integer.valueOf(this.f9411a.x()));
                if (this.f9411a.e()) {
                    return;
                } else {
                    B7 = this.f9411a.B();
                }
            } while (B7 == this.f9412b);
            this.f9414d = B7;
            return;
        }
        if (b9 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d8 = this.f9411a.d() + this.f9411a.C();
        do {
            list.add(Integer.valueOf(this.f9411a.x()));
        } while (this.f9411a.d() < d8);
        U(d8);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public long d() {
        V(0);
        return this.f9411a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public long e() {
        V(1);
        return this.f9411a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void f(List list) {
        int B7;
        if (list instanceof AbstractC0898w) {
            androidx.appcompat.app.E.a(list);
            int b8 = o0.b(this.f9412b);
            if (b8 != 2) {
                if (b8 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                this.f9411a.v();
                throw null;
            }
            W(this.f9411a.C());
            this.f9411a.d();
            this.f9411a.v();
            throw null;
        }
        int b9 = o0.b(this.f9412b);
        if (b9 == 2) {
            int C7 = this.f9411a.C();
            W(C7);
            int d8 = this.f9411a.d() + C7;
            do {
                list.add(Integer.valueOf(this.f9411a.v()));
            } while (this.f9411a.d() < d8);
            return;
        }
        if (b9 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Integer.valueOf(this.f9411a.v()));
            if (this.f9411a.e()) {
                return;
            } else {
                B7 = this.f9411a.B();
            }
        } while (B7 == this.f9412b);
        this.f9414d = B7;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void g(List list) {
        int B7;
        if (list instanceof D) {
            androidx.appcompat.app.E.a(list);
            int b8 = o0.b(this.f9412b);
            if (b8 == 0) {
                this.f9411a.y();
                throw null;
            }
            if (b8 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            this.f9411a.C();
            this.f9411a.d();
            this.f9411a.y();
            throw null;
        }
        int b9 = o0.b(this.f9412b);
        if (b9 == 0) {
            do {
                list.add(Long.valueOf(this.f9411a.y()));
                if (this.f9411a.e()) {
                    return;
                } else {
                    B7 = this.f9411a.B();
                }
            } while (B7 == this.f9412b);
            this.f9414d = B7;
            return;
        }
        if (b9 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d8 = this.f9411a.d() + this.f9411a.C();
        do {
            list.add(Long.valueOf(this.f9411a.y()));
        } while (this.f9411a.d() < d8);
        U(d8);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void h(List list) {
        int B7;
        if (list instanceof AbstractC0898w) {
            androidx.appcompat.app.E.a(list);
            int b8 = o0.b(this.f9412b);
            if (b8 == 0) {
                this.f9411a.C();
                throw null;
            }
            if (b8 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            this.f9411a.C();
            this.f9411a.d();
            this.f9411a.C();
            throw null;
        }
        int b9 = o0.b(this.f9412b);
        if (b9 == 0) {
            do {
                list.add(Integer.valueOf(this.f9411a.C()));
                if (this.f9411a.e()) {
                    return;
                } else {
                    B7 = this.f9411a.B();
                }
            } while (B7 == this.f9412b);
            this.f9414d = B7;
            return;
        }
        if (b9 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d8 = this.f9411a.d() + this.f9411a.C();
        do {
            list.add(Integer.valueOf(this.f9411a.C()));
        } while (this.f9411a.d() < d8);
        U(d8);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int i() {
        V(5);
        return this.f9411a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public boolean j() {
        V(0);
        return this.f9411a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public long k() {
        V(1);
        return this.f9411a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void l(List list) {
        int B7;
        if (list instanceof D) {
            androidx.appcompat.app.E.a(list);
            int b8 = o0.b(this.f9412b);
            if (b8 == 0) {
                this.f9411a.D();
                throw null;
            }
            if (b8 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            this.f9411a.C();
            this.f9411a.d();
            this.f9411a.D();
            throw null;
        }
        int b9 = o0.b(this.f9412b);
        if (b9 == 0) {
            do {
                list.add(Long.valueOf(this.f9411a.D()));
                if (this.f9411a.e()) {
                    return;
                } else {
                    B7 = this.f9411a.B();
                }
            } while (B7 == this.f9412b);
            this.f9414d = B7;
            return;
        }
        if (b9 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d8 = this.f9411a.d() + this.f9411a.C();
        do {
            list.add(Long.valueOf(this.f9411a.D()));
        } while (this.f9411a.d() < d8);
        U(d8);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int m() {
        V(0);
        return this.f9411a.C();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void n(List list) {
        int B7;
        if (list instanceof D) {
            androidx.appcompat.app.E.a(list);
            int b8 = o0.b(this.f9412b);
            if (b8 == 0) {
                this.f9411a.u();
                throw null;
            }
            if (b8 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            this.f9411a.C();
            this.f9411a.d();
            this.f9411a.u();
            throw null;
        }
        int b9 = o0.b(this.f9412b);
        if (b9 == 0) {
            do {
                list.add(Long.valueOf(this.f9411a.u()));
                if (this.f9411a.e()) {
                    return;
                } else {
                    B7 = this.f9411a.B();
                }
            } while (B7 == this.f9412b);
            this.f9414d = B7;
            return;
        }
        if (b9 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d8 = this.f9411a.d() + this.f9411a.C();
        do {
            list.add(Long.valueOf(this.f9411a.u()));
        } while (this.f9411a.d() < d8);
        U(d8);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void o(List list) {
        int B7;
        if (list instanceof D) {
            androidx.appcompat.app.E.a(list);
            int b8 = o0.b(this.f9412b);
            if (b8 == 1) {
                this.f9411a.w();
                throw null;
            }
            if (b8 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            X(this.f9411a.C());
            this.f9411a.d();
            this.f9411a.w();
            throw null;
        }
        int b9 = o0.b(this.f9412b);
        if (b9 == 1) {
            do {
                list.add(Long.valueOf(this.f9411a.w()));
                if (this.f9411a.e()) {
                    return;
                } else {
                    B7 = this.f9411a.B();
                }
            } while (B7 == this.f9412b);
            this.f9414d = B7;
            return;
        }
        if (b9 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int C7 = this.f9411a.C();
        X(C7);
        int d8 = this.f9411a.d() + C7;
        do {
            list.add(Long.valueOf(this.f9411a.w()));
        } while (this.f9411a.d() < d8);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void p(List list) {
        int B7;
        if (list instanceof AbstractC0898w) {
            androidx.appcompat.app.E.a(list);
            int b8 = o0.b(this.f9412b);
            if (b8 == 0) {
                this.f9411a.t();
                throw null;
            }
            if (b8 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            this.f9411a.C();
            this.f9411a.d();
            this.f9411a.t();
            throw null;
        }
        int b9 = o0.b(this.f9412b);
        if (b9 == 0) {
            do {
                list.add(Integer.valueOf(this.f9411a.t()));
                if (this.f9411a.e()) {
                    return;
                } else {
                    B7 = this.f9411a.B();
                }
            } while (B7 == this.f9412b);
            this.f9414d = B7;
            return;
        }
        if (b9 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d8 = this.f9411a.d() + this.f9411a.C();
        do {
            list.add(Integer.valueOf(this.f9411a.t()));
        } while (this.f9411a.d() < d8);
        U(d8);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void q(List list) {
        int B7;
        if (list instanceof AbstractC0898w) {
            androidx.appcompat.app.E.a(list);
            int b8 = o0.b(this.f9412b);
            if (b8 == 0) {
                this.f9411a.p();
                throw null;
            }
            if (b8 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            this.f9411a.C();
            this.f9411a.d();
            this.f9411a.p();
            throw null;
        }
        int b9 = o0.b(this.f9412b);
        if (b9 == 0) {
            do {
                list.add(Integer.valueOf(this.f9411a.p()));
                if (this.f9411a.e()) {
                    return;
                } else {
                    B7 = this.f9411a.B();
                }
            } while (B7 == this.f9412b);
            this.f9414d = B7;
            return;
        }
        if (b9 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d8 = this.f9411a.d() + this.f9411a.C();
        do {
            list.add(Integer.valueOf(this.f9411a.p()));
        } while (this.f9411a.d() < d8);
        U(d8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f9411a.k(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r(java.util.Map r8, androidx.datastore.preferences.protobuf.F.a r9, androidx.datastore.preferences.protobuf.C0890n r10) {
        /*
            r7 = this;
            r0 = 2
            r7.V(r0)
            androidx.datastore.preferences.protobuf.h r1 = r7.f9411a
            int r1 = r1.C()
            androidx.datastore.preferences.protobuf.h r2 = r7.f9411a
            int r1 = r2.l(r1)
            java.lang.Object r2 = r9.f9302b
            java.lang.Object r3 = r9.f9304d
        L14:
            int r4 = r7.y()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.h r5 = r7.f9411a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.F()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.o0$b r4 = r9.f9303c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r5 = r9.f9304d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r3 = r7.P(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.o0$b r4 = r9.f9301a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5 = 0
            java.lang.Object r2 = r7.P(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L51:
            boolean r4 = r7.F()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.h r8 = r7.f9411a
            r8.k(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.h r9 = r7.f9411a
            r9.k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0885i.r(java.util.Map, androidx.datastore.preferences.protobuf.F$a, androidx.datastore.preferences.protobuf.n):void");
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public double readDouble() {
        V(1);
        return this.f9411a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public float readFloat() {
        V(5);
        return this.f9411a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int s() {
        V(0);
        return this.f9411a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void t(List list) {
        int B7;
        if (list instanceof AbstractC0898w) {
            androidx.appcompat.app.E.a(list);
            int b8 = o0.b(this.f9412b);
            if (b8 != 2) {
                if (b8 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                this.f9411a.q();
                throw null;
            }
            W(this.f9411a.C());
            this.f9411a.d();
            this.f9411a.q();
            throw null;
        }
        int b9 = o0.b(this.f9412b);
        if (b9 == 2) {
            int C7 = this.f9411a.C();
            W(C7);
            int d8 = this.f9411a.d() + C7;
            do {
                list.add(Integer.valueOf(this.f9411a.q()));
            } while (this.f9411a.d() < d8);
            return;
        }
        if (b9 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Integer.valueOf(this.f9411a.q()));
            if (this.f9411a.e()) {
                return;
            } else {
                B7 = this.f9411a.B();
            }
        } while (B7 == this.f9412b);
        this.f9414d = B7;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int u() {
        V(0);
        return this.f9411a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public long v() {
        V(0);
        return this.f9411a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void w(List list) {
        int B7;
        if (list instanceof AbstractC0881e) {
            androidx.appcompat.app.E.a(list);
            int b8 = o0.b(this.f9412b);
            if (b8 == 0) {
                this.f9411a.m();
                throw null;
            }
            if (b8 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            this.f9411a.C();
            this.f9411a.d();
            this.f9411a.m();
            throw null;
        }
        int b9 = o0.b(this.f9412b);
        if (b9 == 0) {
            do {
                list.add(Boolean.valueOf(this.f9411a.m()));
                if (this.f9411a.e()) {
                    return;
                } else {
                    B7 = this.f9411a.B();
                }
            } while (B7 == this.f9412b);
            this.f9414d = B7;
            return;
        }
        if (b9 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d8 = this.f9411a.d() + this.f9411a.C();
        do {
            list.add(Boolean.valueOf(this.f9411a.m()));
        } while (this.f9411a.d() < d8);
        U(d8);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public String x() {
        V(2);
        return this.f9411a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int y() {
        int i8 = this.f9414d;
        if (i8 != 0) {
            this.f9412b = i8;
            this.f9414d = 0;
        } else {
            this.f9412b = this.f9411a.B();
        }
        int i9 = this.f9412b;
        if (i9 == 0 || i9 == this.f9413c) {
            return Integer.MAX_VALUE;
        }
        return o0.a(i9);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void z(List list) {
        T(list, false);
    }
}
