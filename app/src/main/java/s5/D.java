package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class D extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: v, reason: collision with root package name */
    private static final D f42775v;

    /* renamed from: w, reason: collision with root package name */
    public static com.google.protobuf.n f42776w = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f42777s;

    /* renamed from: t, reason: collision with root package name */
    private int f42778t;

    /* renamed from: u, reason: collision with root package name */
    private int f42779u;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public D d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new D(eVar, fVar);
        }
    }

    static {
        D d8 = new D(true);
        f42775v = d8;
        d8.k();
    }

    public static D j() {
        return f42775v;
    }

    public static b l() {
        return b.q();
    }

    public static b m(D d8) {
        return l().s(d8);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f42779u;
        if (i8 != -1) {
            return i8;
        }
        int size = this.f42777s.size();
        this.f42779u = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f42778t;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f42778t = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        codedOutputStream.S(this.f42777s);
    }

    public b n() {
        return m(this);
    }

    private D(g.a aVar) {
        super(aVar);
        this.f42778t = -1;
        this.f42779u = -1;
        this.f42777s = aVar.i();
    }

    private D(boolean z7) {
        this.f42778t = -1;
        this.f42779u = -1;
        this.f42777s = com.google.protobuf.d.f33078o;
    }

    private D(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f42778t = -1;
        this.f42779u = -1;
        k();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 == 0 || !h(eVar, w7, fVar, x7)) {
                        z7 = true;
                    }
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
                    this.f42777s = t7.h();
                    throw th2;
                }
                this.f42777s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f42777s = t7.h();
            throw th3;
        }
        this.f42777s = t7.h();
        g();
    }

    public static final class b extends g.a implements com.google.protobuf.m {
        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public D m() {
            return new D(this);
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(D d8) {
            if (d8 == D.j()) {
                return this;
            }
            k(i().c(d8.f42777s));
            return this;
        }

        private void r() {
        }
    }

    private void k() {
    }
}
