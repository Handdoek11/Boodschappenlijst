package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class O extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: y, reason: collision with root package name */
    private static final O f42939y;

    /* renamed from: z, reason: collision with root package name */
    public static com.google.protobuf.n f42940z = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f42941s;

    /* renamed from: t, reason: collision with root package name */
    private int f42942t;

    /* renamed from: u, reason: collision with root package name */
    private Object f42943u;

    /* renamed from: v, reason: collision with root package name */
    private Object f42944v;

    /* renamed from: w, reason: collision with root package name */
    private int f42945w;

    /* renamed from: x, reason: collision with root package name */
    private int f42946x;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public O d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new O(eVar, fVar);
        }
    }

    static {
        O o8 = new O(true);
        f42939y = o8;
        o8.t();
    }

    public static O o() {
        return f42939y;
    }

    private void t() {
        this.f42943u = "";
        this.f42944v = "";
    }

    public static b u() {
        return b.q();
    }

    public static b v(O o8) {
        return u().s(o8);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f42946x;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f42942t & 1) == 1 ? CodedOutputStream.d(1, q()) : 0;
        if ((this.f42942t & 2) == 2) {
            d8 += CodedOutputStream.d(2, p());
        }
        int size = d8 + this.f42941s.size();
        this.f42946x = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f42945w;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        if (s()) {
            this.f42945w = 1;
            return true;
        }
        this.f42945w = 0;
        return false;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f42942t & 1) == 1) {
            codedOutputStream.E(1, q());
        }
        if ((this.f42942t & 2) == 2) {
            codedOutputStream.E(2, p());
        }
        codedOutputStream.S(this.f42941s);
    }

    public com.google.protobuf.d p() {
        Object obj = this.f42944v;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42944v = n8;
        return n8;
    }

    public com.google.protobuf.d q() {
        Object obj = this.f42943u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f42943u = n8;
        return n8;
    }

    public boolean r() {
        return (this.f42942t & 2) == 2;
    }

    public boolean s() {
        return (this.f42942t & 1) == 1;
    }

    public b w() {
        return v(this);
    }

    private O(g.a aVar) {
        super(aVar);
        this.f42945w = -1;
        this.f42946x = -1;
        this.f42941s = aVar.i();
    }

    private O(boolean z7) {
        this.f42945w = -1;
        this.f42946x = -1;
        this.f42941s = com.google.protobuf.d.f33078o;
    }

    private O(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f42945w = -1;
        this.f42946x = -1;
        t();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 != 0) {
                        if (x7 == 10) {
                            com.google.protobuf.d j8 = eVar.j();
                            this.f42942t = 1 | this.f42942t;
                            this.f42943u = j8;
                        } else if (x7 != 18) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            com.google.protobuf.d j9 = eVar.j();
                            this.f42942t |= 2;
                            this.f42944v = j9;
                        }
                    }
                    z7 = true;
                } catch (InvalidProtocolBufferException e8) {
                    throw e8.g(this);
                } catch (IOException e9) {
                    throw new InvalidProtocolBufferException(e9.getMessage()).g(this);
                }
            } catch (Throwable th) {
                try {
                    w7.v();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f42941s = t7.h();
                    throw th2;
                }
                this.f42941s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f42941s = t7.h();
            throw th3;
        }
        this.f42941s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f42947s;

        /* renamed from: t, reason: collision with root package name */
        private Object f42948t = "";

        /* renamed from: u, reason: collision with root package name */
        private Object f42949u = "";

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public O m() {
            O o8 = new O(this);
            int i8 = this.f42947s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            o8.f42943u = this.f42948t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            o8.f42944v = this.f42949u;
            o8.f42942t = i9;
            return o8;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(O o8) {
            if (o8 == O.o()) {
                return this;
            }
            if (o8.s()) {
                this.f42947s |= 1;
                this.f42948t = o8.f42943u;
            }
            if (o8.r()) {
                this.f42947s |= 2;
                this.f42949u = o8.f42944v;
            }
            k(i().c(o8.f42941s));
            return this;
        }

        private void r() {
        }
    }
}
