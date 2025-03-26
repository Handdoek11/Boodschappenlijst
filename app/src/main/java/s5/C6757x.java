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

/* renamed from: s5.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6757x extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: w, reason: collision with root package name */
    private static final C6757x f43642w;

    /* renamed from: x, reason: collision with root package name */
    public static com.google.protobuf.n f43643x = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43644s;

    /* renamed from: t, reason: collision with root package name */
    private List f43645t;

    /* renamed from: u, reason: collision with root package name */
    private int f43646u;

    /* renamed from: v, reason: collision with root package name */
    private int f43647v;

    /* renamed from: s5.x$a */
    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6757x d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C6757x(eVar, fVar);
        }
    }

    static {
        C6757x c6757x = new C6757x(true);
        f43642w = c6757x;
        c6757x.p();
    }

    public static C6757x l() {
        return f43642w;
    }

    private void p() {
        this.f43645t = Collections.emptyList();
    }

    public static b q() {
        return b.q();
    }

    public static b r(C6757x c6757x) {
        return q().u(c6757x);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43647v;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f43645t.size(); i10++) {
            i9 += CodedOutputStream.l(1, (com.google.protobuf.l) this.f43645t.get(i10));
        }
        int size = i9 + this.f43644s.size();
        this.f43647v = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43646u;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        for (int i9 = 0; i9 < n(); i9++) {
            if (!m(i9).c()) {
                this.f43646u = 0;
                return false;
            }
        }
        this.f43646u = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        for (int i8 = 0; i8 < this.f43645t.size(); i8++) {
            codedOutputStream.O(1, (com.google.protobuf.l) this.f43645t.get(i8));
        }
        codedOutputStream.S(this.f43644s);
    }

    public P m(int i8) {
        return (P) this.f43645t.get(i8);
    }

    public int n() {
        return this.f43645t.size();
    }

    public List o() {
        return this.f43645t;
    }

    public b s() {
        return r(this);
    }

    private C6757x(g.a aVar) {
        super(aVar);
        this.f43646u = -1;
        this.f43647v = -1;
        this.f43644s = aVar.i();
    }

    private C6757x(boolean z7) {
        this.f43646u = -1;
        this.f43647v = -1;
        this.f43644s = com.google.protobuf.d.f33078o;
    }

    private C6757x(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43646u = -1;
        this.f43647v = -1;
        p();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        boolean z8 = false;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 != 0) {
                        if (x7 != 10) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            if (!z8) {
                                this.f43645t = new ArrayList();
                                z8 = true;
                            }
                            this.f43645t.add((P) eVar.n(P.f42951D, fVar));
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
                    this.f43645t = DesugarCollections.unmodifiableList(this.f43645t);
                }
                try {
                    w7.v();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f43644s = t7.h();
                    throw th2;
                }
                this.f43644s = t7.h();
                g();
                throw th;
            }
        }
        if (z8) {
            this.f43645t = DesugarCollections.unmodifiableList(this.f43645t);
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43644s = t7.h();
            throw th3;
        }
        this.f43644s = t7.h();
        g();
    }

    /* renamed from: s5.x$b */
    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43648s;

        /* renamed from: t, reason: collision with root package name */
        private List f43649t = Collections.emptyList();

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        private void r() {
            if ((this.f43648s & 1) != 1) {
                this.f43649t = new ArrayList(this.f43649t);
                this.f43648s |= 1;
            }
        }

        public C6757x m() {
            C6757x c6757x = new C6757x(this);
            if ((this.f43648s & 1) == 1) {
                this.f43649t = DesugarCollections.unmodifiableList(this.f43649t);
                this.f43648s &= -2;
            }
            c6757x.f43645t = this.f43649t;
            return c6757x;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().u(m());
        }

        public b u(C6757x c6757x) {
            if (c6757x == C6757x.l()) {
                return this;
            }
            if (!c6757x.f43645t.isEmpty()) {
                if (this.f43649t.isEmpty()) {
                    this.f43649t = c6757x.f43645t;
                    this.f43648s &= -2;
                } else {
                    r();
                    this.f43649t.addAll(c6757x.f43645t);
                }
            }
            k(i().c(c6757x.f43644s));
            return this;
        }

        private void s() {
        }
    }
}
