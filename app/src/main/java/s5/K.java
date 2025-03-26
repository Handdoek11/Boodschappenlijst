package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.d;
import com.google.protobuf.g;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s5.P;

/* loaded from: classes2.dex */
public final class K extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: y, reason: collision with root package name */
    private static final K f42852y;

    /* renamed from: z, reason: collision with root package name */
    public static com.google.protobuf.n f42853z = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f42854s;

    /* renamed from: t, reason: collision with root package name */
    private int f42855t;

    /* renamed from: u, reason: collision with root package name */
    private P f42856u;

    /* renamed from: v, reason: collision with root package name */
    private List f42857v;

    /* renamed from: w, reason: collision with root package name */
    private int f42858w;

    /* renamed from: x, reason: collision with root package name */
    private int f42859x;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public K d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new K(eVar, fVar);
        }
    }

    static {
        K k8 = new K(true);
        f42852y = k8;
        k8.t();
    }

    public static K n() {
        return f42852y;
    }

    private void t() {
        this.f42856u = P.s();
        this.f42857v = Collections.emptyList();
    }

    public static b u() {
        return b.s();
    }

    public static b v(K k8) {
        return u().w(k8);
    }

    public static K w(InputStream inputStream) {
        return (K) f42853z.c(inputStream);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f42859x;
        if (i8 != -1) {
            return i8;
        }
        int l8 = (this.f42855t & 1) == 1 ? CodedOutputStream.l(1, this.f42856u) : 0;
        for (int i9 = 0; i9 < this.f42857v.size(); i9++) {
            l8 += CodedOutputStream.l(2, (com.google.protobuf.l) this.f42857v.get(i9));
        }
        int size = l8 + this.f42854s.size();
        this.f42859x = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f42858w;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        if (!s()) {
            this.f42858w = 0;
            return false;
        }
        if (!r().c()) {
            this.f42858w = 0;
            return false;
        }
        for (int i9 = 0; i9 < p(); i9++) {
            if (!o(i9).c()) {
                this.f42858w = 0;
                return false;
            }
        }
        this.f42858w = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f42855t & 1) == 1) {
            codedOutputStream.O(1, this.f42856u);
        }
        for (int i8 = 0; i8 < this.f42857v.size(); i8++) {
            codedOutputStream.O(2, (com.google.protobuf.l) this.f42857v.get(i8));
        }
        codedOutputStream.S(this.f42854s);
    }

    public N o(int i8) {
        return (N) this.f42857v.get(i8);
    }

    public int p() {
        return this.f42857v.size();
    }

    public List q() {
        return this.f42857v;
    }

    public P r() {
        return this.f42856u;
    }

    public boolean s() {
        return (this.f42855t & 1) == 1;
    }

    public b x() {
        return v(this);
    }

    private K(g.a aVar) {
        super(aVar);
        this.f42858w = -1;
        this.f42859x = -1;
        this.f42854s = aVar.i();
    }

    private K(boolean z7) {
        this.f42858w = -1;
        this.f42859x = -1;
        this.f42854s = com.google.protobuf.d.f33078o;
    }

    private K(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f42858w = -1;
        this.f42859x = -1;
        t();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        char c8 = 0;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 != 0) {
                        if (x7 == 10) {
                            P.b K7 = (this.f42855t & 1) == 1 ? this.f42856u.K() : null;
                            P p8 = (P) eVar.n(P.f42951D, fVar);
                            this.f42856u = p8;
                            if (K7 != null) {
                                K7.u(p8);
                                this.f42856u = K7.p();
                            }
                            this.f42855t |= 1;
                        } else if (x7 != 18) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            if ((c8 & 2) != 2) {
                                this.f42857v = new ArrayList();
                                c8 = 2;
                            }
                            this.f42857v.add((N) eVar.n(N.f42907K, fVar));
                        }
                    }
                    z7 = true;
                } catch (InvalidProtocolBufferException e8) {
                    throw e8.g(this);
                } catch (IOException e9) {
                    throw new InvalidProtocolBufferException(e9.getMessage()).g(this);
                }
            } catch (Throwable th) {
                if ((c8 & 2) == 2) {
                    this.f42857v = DesugarCollections.unmodifiableList(this.f42857v);
                }
                try {
                    w7.v();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f42854s = t7.h();
                    throw th2;
                }
                this.f42854s = t7.h();
                g();
                throw th;
            }
        }
        if ((c8 & 2) == 2) {
            this.f42857v = DesugarCollections.unmodifiableList(this.f42857v);
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f42854s = t7.h();
            throw th3;
        }
        this.f42854s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f42860s;

        /* renamed from: t, reason: collision with root package name */
        private P f42861t = P.s();

        /* renamed from: u, reason: collision with root package name */
        private List f42862u = Collections.emptyList();

        private b() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b s() {
            return new b();
        }

        private void u() {
            if ((this.f42860s & 2) != 2) {
                this.f42862u = new ArrayList(this.f42862u);
                this.f42860s |= 2;
            }
        }

        public b m(N n8) {
            n8.getClass();
            u();
            this.f42862u.add(n8);
            return this;
        }

        public K p() {
            K q8 = q();
            if (q8.c()) {
                return q8;
            }
            throw a.AbstractC0243a.h(q8);
        }

        public K q() {
            K k8 = new K(this);
            int i8 = (this.f42860s & 1) != 1 ? 0 : 1;
            k8.f42856u = this.f42861t;
            if ((this.f42860s & 2) == 2) {
                this.f42862u = DesugarCollections.unmodifiableList(this.f42862u);
                this.f42860s &= -3;
            }
            k8.f42857v = this.f42862u;
            k8.f42855t = i8;
            return k8;
        }

        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return s().w(q());
        }

        public b w(K k8) {
            if (k8 == K.n()) {
                return this;
            }
            if (k8.s()) {
                x(k8.r());
            }
            if (!k8.f42857v.isEmpty()) {
                if (this.f42862u.isEmpty()) {
                    this.f42862u = k8.f42857v;
                    this.f42860s &= -3;
                } else {
                    u();
                    this.f42862u.addAll(k8.f42857v);
                }
            }
            k(i().c(k8.f42854s));
            return this;
        }

        public b x(P p8) {
            if ((this.f42860s & 1) != 1 || this.f42861t == P.s()) {
                this.f42861t = p8;
            } else {
                this.f42861t = P.J(this.f42861t).u(p8).p();
            }
            this.f42860s |= 1;
            return this;
        }

        public b y(P p8) {
            p8.getClass();
            this.f42861t = p8;
            this.f42860s |= 1;
            return this;
        }

        private void v() {
        }
    }
}
