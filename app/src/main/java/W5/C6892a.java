package w5;

import A6.g;
import J6.AbstractC0650j;
import J6.r;
import U6.M;
import io.ktor.utils.io.f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import v5.C6841a;

/* renamed from: w5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6892a implements M {

    /* renamed from: o, reason: collision with root package name */
    private final C6841a f44359o;
    private volatile /* synthetic */ int received;

    /* renamed from: s, reason: collision with root package name */
    protected E5.b f44360s;

    /* renamed from: t, reason: collision with root package name */
    protected F5.c f44361t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f44362u;

    /* renamed from: v, reason: collision with root package name */
    public static final C0345a f44356v = new C0345a(null);

    /* renamed from: x, reason: collision with root package name */
    private static final N5.a f44358x = new N5.a("CustomResponse");

    /* renamed from: w, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f44357w = AtomicIntegerFieldUpdater.newUpdater(C6892a.class, "received");

    /* renamed from: w5.a$a, reason: collision with other inner class name */
    public static final class C0345a {
        public /* synthetic */ C0345a(AbstractC0650j abstractC0650j) {
            this();
        }

        private C0345a() {
        }
    }

    /* renamed from: w5.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f44363o;

        /* renamed from: s, reason: collision with root package name */
        Object f44364s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f44365t;

        /* renamed from: v, reason: collision with root package name */
        int f44367v;

        b(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f44365t = obj;
            this.f44367v |= Integer.MIN_VALUE;
            return C6892a.this.a(null, this);
        }
    }

    public C6892a(C6841a c6841a) {
        r.e(c6841a, "client");
        this.f44359o = c6841a;
        this.received = 0;
    }

    static /* synthetic */ Object h(C6892a c6892a, A6.d dVar) {
        return c6892a.e().b();
    }

    public final N5.b G() {
        return d().G();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(U5.a r6, A6.d r7) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.C6892a.a(U5.a, A6.d):java.lang.Object");
    }

    protected boolean b() {
        return this.f44362u;
    }

    public final C6841a c() {
        return this.f44359o;
    }

    public final E5.b d() {
        E5.b bVar = this.f44360s;
        if (bVar != null) {
            return bVar;
        }
        r.p("request");
        return null;
    }

    public final F5.c e() {
        F5.c cVar = this.f44361t;
        if (cVar != null) {
            return cVar;
        }
        r.p("response");
        return null;
    }

    protected Object f(A6.d dVar) {
        return h(this, dVar);
    }

    @Override // U6.M
    public g getCoroutineContext() {
        return e().getCoroutineContext();
    }

    protected final void i(E5.b bVar) {
        r.e(bVar, "<set-?>");
        this.f44360s = bVar;
    }

    protected final void j(F5.c cVar) {
        r.e(cVar, "<set-?>");
        this.f44361t = cVar;
    }

    public final void l(F5.c cVar) {
        r.e(cVar, "response");
        j(cVar);
    }

    public String toString() {
        return "HttpClientCall[" + d().k() + ", " + e().e() + ']';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6892a(C6841a c6841a, E5.d dVar, E5.g gVar) {
        this(c6841a);
        r.e(c6841a, "client");
        r.e(dVar, "requestData");
        r.e(gVar, "responseData");
        i(new E5.a(this, dVar));
        j(new F5.a(this, gVar));
        if (gVar.a() instanceof f) {
            return;
        }
        G().f(f44358x, gVar.a());
    }
}
