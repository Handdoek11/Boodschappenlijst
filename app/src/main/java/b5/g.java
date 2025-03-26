package B5;

import E5.b;
import I5.InterfaceC0637k;
import I5.K;
import v5.C6842b;
import w5.C6892a;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final q7.a f570a = S5.a.a("io.ktor.client.plugins.HttpCallValidator");

    /* renamed from: b, reason: collision with root package name */
    private static final N5.a f571b = new N5.a("ExpectSuccessAttributeKey");

    public static final class a implements E5.b {

        /* renamed from: o, reason: collision with root package name */
        private final I5.t f572o;

        /* renamed from: s, reason: collision with root package name */
        private final K f573s;

        /* renamed from: t, reason: collision with root package name */
        private final N5.b f574t;

        /* renamed from: u, reason: collision with root package name */
        private final InterfaceC0637k f575u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ E5.c f576v;

        a(E5.c cVar) {
            this.f576v = cVar;
            this.f572o = cVar.h();
            this.f573s = cVar.i().b();
            this.f574t = cVar.c();
            this.f575u = cVar.a().o();
        }

        @Override // E5.b
        public I5.t E() {
            return this.f572o;
        }

        @Override // E5.b
        public N5.b G() {
            return this.f574t;
        }

        @Override // E5.b
        public C6892a M() {
            throw new IllegalStateException("Call is not initialized");
        }

        @Override // I5.q
        public InterfaceC0637k a() {
            return this.f575u;
        }

        @Override // E5.b, U6.M
        public A6.g getCoroutineContext() {
            return b.a.a(this);
        }

        @Override // E5.b
        public K k() {
            return this.f573s;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a a(E5.c cVar) {
        return new a(cVar);
    }

    public static final void b(C6842b c6842b, I6.l lVar) {
        J6.r.e(c6842b, "<this>");
        J6.r.e(lVar, "block");
        c6842b.g(f.f538d, lVar);
    }

    public static final N5.a e() {
        return f571b;
    }
}
