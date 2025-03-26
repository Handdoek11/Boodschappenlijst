package W;

import J6.AbstractC0650j;
import U6.InterfaceC0745v0;
import U6.J;
import U6.M;
import U6.N;
import U6.Q0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final a f5760c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f5761d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final l f5762e = new l();

    /* renamed from: f, reason: collision with root package name */
    private static final J f5763f = new b(J.f5406c);

    /* renamed from: a, reason: collision with root package name */
    private final e f5764a;

    /* renamed from: b, reason: collision with root package name */
    private M f5765b;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public k(e eVar, A6.g gVar) {
        this.f5764a = eVar;
        this.f5765b = N.a(f5763f.u(Z.b.a()).u(gVar).u(Q0.a((InterfaceC0745v0) gVar.d(InterfaceC0745v0.f5485d))));
    }

    public z a(x xVar, q qVar, I6.l lVar, I6.l lVar2) {
        xVar.c();
        return null;
    }

    public /* synthetic */ k(e eVar, A6.g gVar, int i8, AbstractC0650j abstractC0650j) {
        this((i8 & 1) != 0 ? new e() : eVar, (i8 & 2) != 0 ? A6.h.f250o : gVar);
    }

    public static final class b extends A6.a implements J {
        public b(J.a aVar) {
            super(aVar);
        }

        @Override // U6.J
        public void N(A6.g gVar, Throwable th) {
        }
    }
}
