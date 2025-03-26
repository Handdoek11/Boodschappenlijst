package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class Y extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: v, reason: collision with root package name */
    private static final Y f43037v;

    /* renamed from: w, reason: collision with root package name */
    public static com.google.protobuf.n f43038w = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43039s;

    /* renamed from: t, reason: collision with root package name */
    private int f43040t;

    /* renamed from: u, reason: collision with root package name */
    private int f43041u;

    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public Y d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new Y(eVar, fVar);
        }
    }

    static {
        Y y7 = new Y(true);
        f43037v = y7;
        y7.k();
    }

    public static Y j() {
        return f43037v;
    }

    public static b l() {
        return b.q();
    }

    public static b m(Y y7) {
        return l().s(y7);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43041u;
        if (i8 != -1) {
            return i8;
        }
        int size = this.f43039s.size();
        this.f43041u = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43040t;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43040t = 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        codedOutputStream.S(this.f43039s);
    }

    public b n() {
        return m(this);
    }

    private Y(g.a aVar) {
        super(aVar);
        this.f43040t = -1;
        this.f43041u = -1;
        this.f43039s = aVar.i();
    }

    private Y(boolean z7) {
        this.f43040t = -1;
        this.f43041u = -1;
        this.f43039s = com.google.protobuf.d.f33078o;
    }

    private Y(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43040t = -1;
        this.f43041u = -1;
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
                    this.f43039s = t7.h();
                    throw th2;
                }
                this.f43039s = t7.h();
                g();
                throw th;
            }
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43039s = t7.h();
            throw th3;
        }
        this.f43039s = t7.h();
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

        public Y m() {
            return new Y(this);
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().s(m());
        }

        public b s(Y y7) {
            if (y7 == Y.j()) {
                return this;
            }
            k(i().c(y7.f43039s));
            return this;
        }

        private void r() {
        }
    }

    private void k() {
    }
}
