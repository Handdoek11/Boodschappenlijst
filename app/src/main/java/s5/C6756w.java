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
import s5.L;

/* renamed from: s5.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6756w extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: w, reason: collision with root package name */
    private static final C6756w f43634w;

    /* renamed from: x, reason: collision with root package name */
    public static com.google.protobuf.n f43635x = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43636s;

    /* renamed from: t, reason: collision with root package name */
    private List f43637t;

    /* renamed from: u, reason: collision with root package name */
    private int f43638u;

    /* renamed from: v, reason: collision with root package name */
    private int f43639v;

    /* renamed from: s5.w$a */
    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6756w d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C6756w(eVar, fVar);
        }
    }

    static {
        C6756w c6756w = new C6756w(true);
        f43634w = c6756w;
        c6756w.o();
    }

    public static C6756w l() {
        return f43634w;
    }

    private void o() {
        this.f43637t = Collections.emptyList();
    }

    public static b p() {
        return b.s();
    }

    public static b q(C6756w c6756w) {
        return p().w(c6756w);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43639v;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f43637t.size(); i10++) {
            i9 += CodedOutputStream.l(1, (com.google.protobuf.l) this.f43637t.get(i10));
        }
        int size = i9 + this.f43636s.size();
        this.f43639v = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43638u;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        for (int i9 = 0; i9 < n(); i9++) {
            if (!m(i9).c()) {
                this.f43638u = 0;
                return false;
            }
        }
        this.f43638u = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        for (int i8 = 0; i8 < this.f43637t.size(); i8++) {
            codedOutputStream.O(1, (com.google.protobuf.l) this.f43637t.get(i8));
        }
        codedOutputStream.S(this.f43636s);
    }

    public L m(int i8) {
        return (L) this.f43637t.get(i8);
    }

    public int n() {
        return this.f43637t.size();
    }

    public b r() {
        return q(this);
    }

    private C6756w(g.a aVar) {
        super(aVar);
        this.f43638u = -1;
        this.f43639v = -1;
        this.f43636s = aVar.i();
    }

    private C6756w(boolean z7) {
        this.f43638u = -1;
        this.f43639v = -1;
        this.f43636s = com.google.protobuf.d.f33078o;
    }

    private C6756w(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43638u = -1;
        this.f43639v = -1;
        o();
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
                                this.f43637t = new ArrayList();
                                z8 = true;
                            }
                            this.f43637t.add((L) eVar.n(L.f42864F, fVar));
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
                    this.f43637t = DesugarCollections.unmodifiableList(this.f43637t);
                }
                try {
                    w7.v();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f43636s = t7.h();
                    throw th2;
                }
                this.f43636s = t7.h();
                g();
                throw th;
            }
        }
        if (z8) {
            this.f43637t = DesugarCollections.unmodifiableList(this.f43637t);
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43636s = t7.h();
            throw th3;
        }
        this.f43636s = t7.h();
        g();
    }

    /* renamed from: s5.w$b */
    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43640s;

        /* renamed from: t, reason: collision with root package name */
        private List f43641t = Collections.emptyList();

        private b() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b s() {
            return new b();
        }

        private void u() {
            if ((this.f43640s & 1) != 1) {
                this.f43641t = new ArrayList(this.f43641t);
                this.f43640s |= 1;
            }
        }

        public b m(L.b bVar) {
            u();
            this.f43641t.add(bVar.m());
            return this;
        }

        public C6756w p() {
            C6756w q8 = q();
            if (q8.c()) {
                return q8;
            }
            throw a.AbstractC0243a.h(q8);
        }

        public C6756w q() {
            C6756w c6756w = new C6756w(this);
            if ((this.f43640s & 1) == 1) {
                this.f43641t = DesugarCollections.unmodifiableList(this.f43641t);
                this.f43640s &= -2;
            }
            c6756w.f43637t = this.f43641t;
            return c6756w;
        }

        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return s().w(q());
        }

        public b w(C6756w c6756w) {
            if (c6756w == C6756w.l()) {
                return this;
            }
            if (!c6756w.f43637t.isEmpty()) {
                if (this.f43641t.isEmpty()) {
                    this.f43641t = c6756w.f43637t;
                    this.f43640s &= -2;
                } else {
                    u();
                    this.f43641t.addAll(c6756w.f43637t);
                }
            }
            k(i().c(c6756w.f43636s));
            return this;
        }

        private void v() {
        }
    }
}
