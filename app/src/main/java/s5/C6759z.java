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
import s5.C6758y;

/* renamed from: s5.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6759z extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: A, reason: collision with root package name */
    public static com.google.protobuf.n f43713A = new a();

    /* renamed from: z, reason: collision with root package name */
    private static final C6759z f43714z;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43715s;

    /* renamed from: t, reason: collision with root package name */
    private int f43716t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43717u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f43718v;

    /* renamed from: w, reason: collision with root package name */
    private List f43719w;

    /* renamed from: x, reason: collision with root package name */
    private int f43720x;

    /* renamed from: y, reason: collision with root package name */
    private int f43721y;

    /* renamed from: s5.z$a */
    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6759z d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C6759z(eVar, fVar);
        }
    }

    static {
        C6759z c6759z = new C6759z(true);
        f43714z = c6759z;
        c6759z.x();
    }

    public static C6759z p() {
        return f43714z;
    }

    private void x() {
        this.f43717u = "";
        this.f43718v = false;
        this.f43719w = Collections.emptyList();
    }

    public static b y() {
        return b.s();
    }

    public static b z(C6759z c6759z) {
        return y().w(c6759z);
    }

    public b A() {
        return z(this);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43721y;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f43716t & 1) == 1 ? CodedOutputStream.d(1, t()) : 0;
        if ((this.f43716t & 2) == 2) {
            d8 += CodedOutputStream.b(2, this.f43718v);
        }
        for (int i9 = 0; i9 < this.f43719w.size(); i9++) {
            d8 += CodedOutputStream.l(3, (com.google.protobuf.l) this.f43719w.get(i9));
        }
        int size = d8 + this.f43715s.size();
        this.f43721y = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43720x;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        if (!v()) {
            this.f43720x = 0;
            return false;
        }
        for (int i9 = 0; i9 < r(); i9++) {
            if (!q(i9).c()) {
                this.f43720x = 0;
                return false;
            }
        }
        this.f43720x = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43716t & 1) == 1) {
            codedOutputStream.E(1, t());
        }
        if ((this.f43716t & 2) == 2) {
            codedOutputStream.C(2, this.f43718v);
        }
        for (int i8 = 0; i8 < this.f43719w.size(); i8++) {
            codedOutputStream.O(3, (com.google.protobuf.l) this.f43719w.get(i8));
        }
        codedOutputStream.S(this.f43715s);
    }

    public C6758y q(int i8) {
        return (C6758y) this.f43719w.get(i8);
    }

    public int r() {
        return this.f43719w.size();
    }

    public String s() {
        Object obj = this.f43717u;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f43717u = J7;
        }
        return J7;
    }

    public com.google.protobuf.d t() {
        Object obj = this.f43717u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43717u = n8;
        return n8;
    }

    public boolean u() {
        return this.f43718v;
    }

    public boolean v() {
        return (this.f43716t & 1) == 1;
    }

    public boolean w() {
        return (this.f43716t & 2) == 2;
    }

    private C6759z(g.a aVar) {
        super(aVar);
        this.f43720x = -1;
        this.f43721y = -1;
        this.f43715s = aVar.i();
    }

    private C6759z(boolean z7) {
        this.f43720x = -1;
        this.f43721y = -1;
        this.f43715s = com.google.protobuf.d.f33078o;
    }

    private C6759z(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43720x = -1;
        this.f43721y = -1;
        x();
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
                            com.google.protobuf.d j8 = eVar.j();
                            this.f43716t = 1 | this.f43716t;
                            this.f43717u = j8;
                        } else if (x7 == 16) {
                            this.f43716t |= 2;
                            this.f43718v = eVar.i();
                        } else if (x7 != 26) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            if ((c8 & 4) != 4) {
                                this.f43719w = new ArrayList();
                                c8 = 4;
                            }
                            this.f43719w.add((C6758y) eVar.n(C6758y.f43651P, fVar));
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
                    this.f43719w = DesugarCollections.unmodifiableList(this.f43719w);
                }
                try {
                    w7.v();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f43715s = t7.h();
                    throw th2;
                }
                this.f43715s = t7.h();
                g();
                throw th;
            }
        }
        if ((c8 & 4) == 4) {
            this.f43719w = DesugarCollections.unmodifiableList(this.f43719w);
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43715s = t7.h();
            throw th3;
        }
        this.f43715s = t7.h();
        g();
    }

    /* renamed from: s5.z$b */
    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43722s;

        /* renamed from: u, reason: collision with root package name */
        private boolean f43724u;

        /* renamed from: t, reason: collision with root package name */
        private Object f43723t = "";

        /* renamed from: v, reason: collision with root package name */
        private List f43725v = Collections.emptyList();

        private b() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b s() {
            return new b();
        }

        private void u() {
            if ((this.f43722s & 4) != 4) {
                this.f43725v = new ArrayList(this.f43725v);
                this.f43722s |= 4;
            }
        }

        public b m(C6758y.b bVar) {
            u();
            this.f43725v.add(bVar.m());
            return this;
        }

        public C6759z p() {
            C6759z q8 = q();
            if (q8.c()) {
                return q8;
            }
            throw a.AbstractC0243a.h(q8);
        }

        public C6759z q() {
            C6759z c6759z = new C6759z(this);
            int i8 = this.f43722s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            c6759z.f43717u = this.f43723t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            c6759z.f43718v = this.f43724u;
            if ((this.f43722s & 4) == 4) {
                this.f43725v = DesugarCollections.unmodifiableList(this.f43725v);
                this.f43722s &= -5;
            }
            c6759z.f43719w = this.f43725v;
            c6759z.f43716t = i9;
            return c6759z;
        }

        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return s().w(q());
        }

        public b w(C6759z c6759z) {
            if (c6759z == C6759z.p()) {
                return this;
            }
            if (c6759z.v()) {
                this.f43722s |= 1;
                this.f43723t = c6759z.f43717u;
            }
            if (c6759z.w()) {
                y(c6759z.u());
            }
            if (!c6759z.f43719w.isEmpty()) {
                if (this.f43725v.isEmpty()) {
                    this.f43725v = c6759z.f43719w;
                    this.f43722s &= -5;
                } else {
                    u();
                    this.f43725v.addAll(c6759z.f43719w);
                }
            }
            k(i().c(c6759z.f43715s));
            return this;
        }

        public b x(String str) {
            str.getClass();
            this.f43722s |= 1;
            this.f43723t = str;
            return this;
        }

        public b y(boolean z7) {
            this.f43722s |= 2;
            this.f43724u = z7;
            return this;
        }

        private void v() {
        }
    }
}
