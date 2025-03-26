package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s5.M;

/* loaded from: classes2.dex */
public final class H extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: A, reason: collision with root package name */
    public static com.google.protobuf.n f42807A = new a();

    /* renamed from: z, reason: collision with root package name */
    private static final H f42808z;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f42809s;

    /* renamed from: t, reason: collision with root package name */
    private int f42810t;

    /* renamed from: u, reason: collision with root package name */
    private List f42811u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f42812v;

    /* renamed from: w, reason: collision with root package name */
    private EnumC6746l f42813w;

    /* renamed from: x, reason: collision with root package name */
    private int f42814x;

    /* renamed from: y, reason: collision with root package name */
    private int f42815y;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public H d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new H(eVar, fVar);
        }
    }

    static {
        H h8 = new H(true);
        f42808z = h8;
        h8.v();
    }

    public static H p() {
        return f42808z;
    }

    private void v() {
        this.f42811u = Collections.emptyList();
        this.f42812v = false;
        this.f42813w = EnumC6746l.AC_LEAVE;
    }

    public static b w() {
        return b.s();
    }

    public static b x(H h8) {
        return w().x(h8);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f42815y;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f42811u.size(); i10++) {
            i9 += CodedOutputStream.l(1, (com.google.protobuf.l) this.f42811u.get(i10));
        }
        if ((this.f42810t & 1) == 1) {
            i9 += CodedOutputStream.b(2, this.f42812v);
        }
        if ((this.f42810t & 2) == 2) {
            i9 += CodedOutputStream.f(3, this.f42813w.e());
        }
        int size = i9 + this.f42809s.size();
        this.f42815y = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f42814x;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        for (int i9 = 0; i9 < r(); i9++) {
            if (!q(i9).c()) {
                this.f42814x = 0;
                return false;
            }
        }
        this.f42814x = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        for (int i8 = 0; i8 < this.f42811u.size(); i8++) {
            codedOutputStream.O(1, (com.google.protobuf.l) this.f42811u.get(i8));
        }
        if ((this.f42810t & 1) == 1) {
            codedOutputStream.C(2, this.f42812v);
        }
        if ((this.f42810t & 2) == 2) {
            codedOutputStream.G(3, this.f42813w.e());
        }
        codedOutputStream.S(this.f42809s);
    }

    public EnumC6746l o() {
        return this.f42813w;
    }

    public M q(int i8) {
        return (M) this.f42811u.get(i8);
    }

    public int r() {
        return this.f42811u.size();
    }

    public boolean s() {
        return this.f42812v;
    }

    public boolean t() {
        return (this.f42810t & 2) == 2;
    }

    public boolean u() {
        return (this.f42810t & 1) == 1;
    }

    public b y() {
        return x(this);
    }

    private H(g.a aVar) {
        super(aVar);
        this.f42814x = -1;
        this.f42815y = -1;
        this.f42809s = aVar.i();
    }

    private H(boolean z7) {
        this.f42814x = -1;
        this.f42815y = -1;
        this.f42809s = com.google.protobuf.d.f33078o;
    }

    private H(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f42814x = -1;
        this.f42815y = -1;
        v();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        boolean z8 = false;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 != 0) {
                        if (x7 == 10) {
                            if (!z8) {
                                this.f42811u = new ArrayList();
                                z8 = true;
                            }
                            this.f42811u.add((M) eVar.n(M.f42896z, fVar));
                        } else if (x7 == 16) {
                            this.f42810t |= 1;
                            this.f42812v = eVar.i();
                        } else if (x7 != 24) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            int k8 = eVar.k();
                            EnumC6746l c8 = EnumC6746l.c(k8);
                            if (c8 == null) {
                                w7.W(x7);
                                w7.W(k8);
                            } else {
                                this.f42810t |= 2;
                                this.f42813w = c8;
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
                if (z8) {
                    this.f42811u = DesugarCollections.unmodifiableList(this.f42811u);
                }
                try {
                    w7.v();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f42809s = t7.h();
                    throw th2;
                }
                this.f42809s = t7.h();
                g();
                throw th;
            }
        }
        if (z8) {
            this.f42811u = DesugarCollections.unmodifiableList(this.f42811u);
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f42809s = t7.h();
            throw th3;
        }
        this.f42809s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f42816s;

        /* renamed from: u, reason: collision with root package name */
        private boolean f42818u;

        /* renamed from: t, reason: collision with root package name */
        private List f42817t = Collections.emptyList();

        /* renamed from: v, reason: collision with root package name */
        private EnumC6746l f42819v = EnumC6746l.AC_LEAVE;

        private b() {
            w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b s() {
            return new b();
        }

        private void u() {
            if ((this.f42816s & 1) != 1) {
                this.f42817t = new ArrayList(this.f42817t);
                this.f42816s |= 1;
            }
        }

        public b m(M.b bVar) {
            u();
            this.f42817t.add(bVar.m());
            return this;
        }

        public H p() {
            H q8 = q();
            if (q8.c()) {
                return q8;
            }
            throw a.AbstractC0243a.h(q8);
        }

        public H q() {
            H h8 = new H(this);
            int i8 = this.f42816s;
            if ((i8 & 1) == 1) {
                this.f42817t = DesugarCollections.unmodifiableList(this.f42817t);
                this.f42816s &= -2;
            }
            h8.f42811u = this.f42817t;
            int i9 = (i8 & 2) != 2 ? 0 : 1;
            h8.f42812v = this.f42818u;
            if ((i8 & 4) == 4) {
                i9 |= 2;
            }
            h8.f42813w = this.f42819v;
            h8.f42810t = i9;
            return h8;
        }

        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return s().x(q());
        }

        public int v() {
            return this.f42817t.size();
        }

        public b x(H h8) {
            if (h8 == H.p()) {
                return this;
            }
            if (!h8.f42811u.isEmpty()) {
                if (this.f42817t.isEmpty()) {
                    this.f42817t = h8.f42811u;
                    this.f42816s &= -2;
                } else {
                    u();
                    this.f42817t.addAll(h8.f42811u);
                }
            }
            if (h8.u()) {
                z(h8.s());
            }
            if (h8.t()) {
                y(h8.o());
            }
            k(i().c(h8.f42809s));
            return this;
        }

        public b y(EnumC6746l enumC6746l) {
            enumC6746l.getClass();
            this.f42816s |= 4;
            this.f42819v = enumC6746l;
            return this;
        }

        public b z(boolean z7) {
            this.f42816s |= 2;
            this.f42818u = z7;
            return this;
        }

        private void w() {
        }
    }
}
