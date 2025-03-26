package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class V extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: x, reason: collision with root package name */
    private static final V f43010x;

    /* renamed from: y, reason: collision with root package name */
    public static com.google.protobuf.n f43011y = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43012s;

    /* renamed from: t, reason: collision with root package name */
    private int f43013t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43014u;

    /* renamed from: v, reason: collision with root package name */
    private int f43015v;

    /* renamed from: w, reason: collision with root package name */
    private int f43016w;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public V d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new V(eVar, fVar);
        }
    }

    static {
        V v7 = new V(true);
        f43010x = v7;
        v7.q();
    }

    public static V m() {
        return f43010x;
    }

    private void q() {
        this.f43014u = "";
    }

    public static b r() {
        return b.q();
    }

    public static b s(V v7) {
        return r().s(v7);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43016w;
        if (i8 != -1) {
            return i8;
        }
        int d8 = ((this.f43013t & 1) == 1 ? CodedOutputStream.d(1, o()) : 0) + this.f43012s.size();
        this.f43016w = d8;
        return d8;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43015v;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        if (p()) {
            this.f43015v = 1;
            return true;
        }
        this.f43015v = 0;
        return false;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43013t & 1) == 1) {
            codedOutputStream.E(1, o());
        }
        codedOutputStream.S(this.f43012s);
    }

    public String n() {
        Object obj = this.f43014u;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.protobuf.d dVar = (com.google.protobuf.d) obj;
        String J7 = dVar.J();
        if (dVar.s()) {
            this.f43014u = J7;
        }
        return J7;
    }

    public com.google.protobuf.d o() {
        Object obj = this.f43014u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43014u = n8;
        return n8;
    }

    public boolean p() {
        return (this.f43013t & 1) == 1;
    }

    public b t() {
        return s(this);
    }

    private V(g.a aVar) {
        super(aVar);
        this.f43015v = -1;
        this.f43016w = -1;
        this.f43012s = aVar.i();
    }

    private V(boolean z7) {
        this.f43015v = -1;
        this.f43016w = -1;
        this.f43012s = com.google.protobuf.d.f33078o;
    }

    private V(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43015v = -1;
        this.f43016w = -1;
        q();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 != 0) {
                        if (x7 != 10) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            com.google.protobuf.d j8 = eVar.j();
                            this.f43013t = 1 | this.f43013t;
                            this.f43014u = j8;
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
                    this.f43012s = t7.h();
                    throw th2;
                }
                this.f43012s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43012s = t7.h();
            throw th3;
        }
        this.f43012s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: s, reason: collision with root package name */
        private int f43017s;

        /* renamed from: t, reason: collision with root package name */
        private Object f43018t = "";

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public V m() {
            V v7 = new V(this);
            int i8 = (this.f43017s & 1) != 1 ? 0 : 1;
            v7.f43014u = this.f43018t;
            v7.f43013t = i8;
            return v7;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(V v7) {
            if (v7 == V.m()) {
                return this;
            }
            if (v7.p()) {
                this.f43017s |= 1;
                this.f43018t = v7.f43014u;
            }
            k(i().c(v7.f43012s));
            return this;
        }

        private void r() {
        }
    }
}
