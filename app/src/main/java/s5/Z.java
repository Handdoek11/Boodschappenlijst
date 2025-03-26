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
public final class Z extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: w, reason: collision with root package name */
    private static final Z f43042w;

    /* renamed from: x, reason: collision with root package name */
    public static com.google.protobuf.n f43043x = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43044s;

    /* renamed from: t, reason: collision with root package name */
    private List f43045t;

    /* renamed from: u, reason: collision with root package name */
    private int f43046u;

    /* renamed from: v, reason: collision with root package name */
    private int f43047v;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public Z d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new Z(eVar, fVar);
        }
    }

    static {
        Z z7 = new Z(true);
        f43042w = z7;
        z7.o();
    }

    public static Z l() {
        return f43042w;
    }

    private void o() {
        this.f43045t = Collections.emptyList();
    }

    public static b p() {
        return b.q();
    }

    public static b q(Z z7) {
        return p().u(z7);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43047v;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f43045t.size(); i10++) {
            i9 += CodedOutputStream.l(1, (com.google.protobuf.l) this.f43045t.get(i10));
        }
        int size = i9 + this.f43044s.size();
        this.f43047v = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43046u;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        for (int i9 = 0; i9 < n(); i9++) {
            if (!m(i9).c()) {
                this.f43046u = 0;
                return false;
            }
        }
        this.f43046u = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        for (int i8 = 0; i8 < this.f43045t.size(); i8++) {
            codedOutputStream.O(1, (com.google.protobuf.l) this.f43045t.get(i8));
        }
        codedOutputStream.S(this.f43044s);
    }

    public P m(int i8) {
        return (P) this.f43045t.get(i8);
    }

    public int n() {
        return this.f43045t.size();
    }

    public b r() {
        return q(this);
    }

    private Z(g.a aVar) {
        super(aVar);
        this.f43046u = -1;
        this.f43047v = -1;
        this.f43044s = aVar.i();
    }

    private Z(boolean z7) {
        this.f43046u = -1;
        this.f43047v = -1;
        this.f43044s = com.google.protobuf.d.f33078o;
    }

    private Z(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43046u = -1;
        this.f43047v = -1;
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
                                this.f43045t = new ArrayList();
                                z8 = true;
                            }
                            this.f43045t.add((P) eVar.n(P.f42951D, fVar));
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
                    this.f43045t = DesugarCollections.unmodifiableList(this.f43045t);
                }
                try {
                    w7.v();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f43044s = t7.h();
                    throw th2;
                }
                this.f43044s = t7.h();
                g();
                throw th;
            }
        }
        if (z8) {
            this.f43045t = DesugarCollections.unmodifiableList(this.f43045t);
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43044s = t7.h();
            throw th3;
        }
        this.f43044s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43048s;

        /* renamed from: t, reason: collision with root package name */
        private List f43049t = Collections.emptyList();

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        private void r() {
            if ((this.f43048s & 1) != 1) {
                this.f43049t = new ArrayList(this.f43049t);
                this.f43048s |= 1;
            }
        }

        public Z m() {
            Z z7 = new Z(this);
            if ((this.f43048s & 1) == 1) {
                this.f43049t = DesugarCollections.unmodifiableList(this.f43049t);
                this.f43048s &= -2;
            }
            z7.f43045t = this.f43049t;
            return z7;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().u(m());
        }

        public b u(Z z7) {
            if (z7 == Z.l()) {
                return this;
            }
            if (!z7.f43045t.isEmpty()) {
                if (this.f43049t.isEmpty()) {
                    this.f43049t = z7.f43045t;
                    this.f43048s &= -2;
                } else {
                    r();
                    this.f43049t.addAll(z7.f43045t);
                }
            }
            k(i().c(z7.f43044s));
            return this;
        }

        private void s() {
        }
    }
}
