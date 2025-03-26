package X5;

import J6.AbstractC0650j;
import Y5.a;

/* loaded from: classes2.dex */
public final class k extends n {

    /* renamed from: A, reason: collision with root package name */
    private static final k f5952A;

    /* renamed from: z, reason: collision with root package name */
    public static final a f5953z = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final k a() {
            return k.f5952A;
        }

        private a() {
        }
    }

    static {
        a.e eVar = Y5.a.f6125j;
        f5952A = new k(eVar.a(), 0L, eVar.b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Y5.a aVar, long j8, Z5.g gVar) {
        super(aVar, j8, gVar);
        J6.r.e(aVar, "head");
        J6.r.e(gVar, "pool");
        e0();
    }

    @Override // X5.n
    protected final Y5.a D() {
        return null;
    }

    public final k H0() {
        return new k(h.a(M()), c0(), b0());
    }

    public String toString() {
        return "ByteReadPacket(" + c0() + " bytes remaining)";
    }

    @Override // X5.n
    protected final void h() {
    }
}
