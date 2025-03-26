package y5;

import J6.r;
import J6.s;
import x6.C6916E;

/* loaded from: classes2.dex */
public interface g {

    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: y5.g$a$a, reason: collision with other inner class name */
        public static final class C0355a extends s implements I6.l {

            /* renamed from: o, reason: collision with root package name */
            public static final C0355a f44621o = new C0355a();

            C0355a() {
                super(1);
            }

            public final void b(f fVar) {
                r.e(fVar, "$this$null");
            }

            @Override // I6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((f) obj);
                return C6916E.f44463a;
            }
        }

        public static /* synthetic */ InterfaceC6958a a(g gVar, I6.l lVar, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            if ((i8 & 1) != 0) {
                lVar = C0355a.f44621o;
            }
            return gVar.a(lVar);
        }
    }

    InterfaceC6958a a(I6.l lVar);
}
