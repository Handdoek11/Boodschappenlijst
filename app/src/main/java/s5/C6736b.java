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

/* renamed from: s5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6736b extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: A, reason: collision with root package name */
    public static com.google.protobuf.n f43059A = new a();

    /* renamed from: z, reason: collision with root package name */
    private static final C6736b f43060z;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43061s;

    /* renamed from: t, reason: collision with root package name */
    private int f43062t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43063u;

    /* renamed from: v, reason: collision with root package name */
    private List f43064v;

    /* renamed from: w, reason: collision with root package name */
    private int f43065w;

    /* renamed from: x, reason: collision with root package name */
    private byte f43066x;

    /* renamed from: y, reason: collision with root package name */
    private int f43067y;

    /* renamed from: s5.b$a */
    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6736b d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C6736b(eVar, fVar);
        }
    }

    static {
        C6736b c6736b = new C6736b(true);
        f43060z = c6736b;
        c6736b.t();
    }

    public static C6736b p() {
        return f43060z;
    }

    private void t() {
        this.f43063u = "";
        this.f43064v = Collections.emptyList();
    }

    public static C0329b u() {
        return C0329b.r();
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43067y;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f43062t & 1) == 1 ? CodedOutputStream.d(1, r()) : 0;
        int i9 = 0;
        for (int i10 = 0; i10 < this.f43064v.size(); i10++) {
            i9 += CodedOutputStream.i(((Integer) this.f43064v.get(i10)).intValue());
        }
        int i11 = d8 + i9;
        if (!o().isEmpty()) {
            i11 = i11 + 1 + CodedOutputStream.i(i9);
        }
        this.f43065w = i9;
        int size = i11 + this.f43061s.size();
        this.f43067y = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        byte b8 = this.f43066x;
        if (b8 == 1) {
            return true;
        }
        if (b8 == 0) {
            return false;
        }
        if (s()) {
            this.f43066x = (byte) 1;
            return true;
        }
        this.f43066x = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43062t & 1) == 1) {
            codedOutputStream.E(1, r());
        }
        if (o().size() > 0) {
            codedOutputStream.W(18);
            codedOutputStream.W(this.f43065w);
        }
        for (int i8 = 0; i8 < this.f43064v.size(); i8++) {
            codedOutputStream.L(((Integer) this.f43064v.get(i8)).intValue());
        }
        codedOutputStream.S(this.f43061s);
    }

    public List o() {
        return this.f43064v;
    }

    public String q() {
        Object obj = this.f43063u;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f43063u = J7;
        }
        return J7;
    }

    public com.google.protobuf.d r() {
        Object obj = this.f43063u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43063u = n8;
        return n8;
    }

    public boolean s() {
        return (this.f43062t & 1) == 1;
    }

    private C6736b(g.a aVar) {
        super(aVar);
        this.f43065w = -1;
        this.f43066x = (byte) -1;
        this.f43067y = -1;
        this.f43061s = aVar.i();
    }

    private C6736b(boolean z7) {
        this.f43065w = -1;
        this.f43066x = (byte) -1;
        this.f43067y = -1;
        this.f43061s = com.google.protobuf.d.f33078o;
    }

    private C6736b(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43065w = -1;
        this.f43066x = (byte) -1;
        this.f43067y = -1;
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
                            com.google.protobuf.d j8 = eVar.j();
                            this.f43062t = 1 | this.f43062t;
                            this.f43063u = j8;
                        } else if (x7 == 16) {
                            if ((c8 & 2) != 2) {
                                this.f43064v = new ArrayList();
                                c8 = 2;
                            }
                            this.f43064v.add(Integer.valueOf(eVar.l()));
                        } else if (x7 != 18) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            int h8 = eVar.h(eVar.s());
                            if ((c8 & 2) != 2 && eVar.c() > 0) {
                                this.f43064v = new ArrayList();
                                c8 = 2;
                            }
                            while (eVar.c() > 0) {
                                this.f43064v.add(Integer.valueOf(eVar.l()));
                            }
                            eVar.g(h8);
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
                    this.f43064v = DesugarCollections.unmodifiableList(this.f43064v);
                }
                try {
                    w7.v();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f43061s = t7.h();
                    throw th2;
                }
                this.f43061s = t7.h();
                g();
                throw th;
            }
        }
        if ((c8 & 2) == 2) {
            this.f43064v = DesugarCollections.unmodifiableList(this.f43064v);
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43061s = t7.h();
            throw th3;
        }
        this.f43061s = t7.h();
        g();
    }

    /* renamed from: s5.b$b, reason: collision with other inner class name */
    public static final class C0329b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43068s;

        /* renamed from: t, reason: collision with root package name */
        private Object f43069t = "";

        /* renamed from: u, reason: collision with root package name */
        private List f43070u = Collections.emptyList();

        private C0329b() {
            u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C0329b r() {
            return new C0329b();
        }

        private void s() {
            if ((this.f43068s & 2) != 2) {
                this.f43070u = new ArrayList(this.f43070u);
                this.f43068s |= 2;
            }
        }

        public C6736b m() {
            C6736b p8 = p();
            if (p8.c()) {
                return p8;
            }
            throw a.AbstractC0243a.h(p8);
        }

        public C6736b p() {
            C6736b c6736b = new C6736b(this);
            int i8 = (this.f43068s & 1) != 1 ? 0 : 1;
            c6736b.f43063u = this.f43069t;
            if ((this.f43068s & 2) == 2) {
                this.f43070u = DesugarCollections.unmodifiableList(this.f43070u);
                this.f43068s &= -3;
            }
            c6736b.f43064v = this.f43070u;
            c6736b.f43062t = i8;
            return c6736b;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C0329b clone() {
            return r().v(p());
        }

        public C0329b v(C6736b c6736b) {
            if (c6736b == C6736b.p()) {
                return this;
            }
            if (c6736b.s()) {
                this.f43068s |= 1;
                this.f43069t = c6736b.f43063u;
            }
            if (!c6736b.f43064v.isEmpty()) {
                if (this.f43070u.isEmpty()) {
                    this.f43070u = c6736b.f43064v;
                    this.f43068s &= -3;
                } else {
                    s();
                    this.f43070u.addAll(c6736b.f43064v);
                }
            }
            k(i().c(c6736b.f43061s));
            return this;
        }

        public C0329b w(String str) {
            str.getClass();
            this.f43068s |= 1;
            this.f43069t = str;
            return this;
        }

        private void u() {
        }
    }
}
