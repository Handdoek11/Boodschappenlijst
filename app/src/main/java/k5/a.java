package K5;

import I5.C0628b;
import I6.l;
import J6.r;
import J6.s;
import x6.C6916E;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: K5.a$a, reason: collision with other inner class name */
    public static final class C0062a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: K5.a$a$a, reason: collision with other inner class name */
        public static final class C0063a extends s implements l {

            /* renamed from: o, reason: collision with root package name */
            public static final C0063a f3656o = new C0063a();

            C0063a() {
                super(1);
            }

            public final void b(b bVar) {
                r.e(bVar, "$this$null");
            }

            @Override // I6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((b) obj);
                return C6916E.f44463a;
            }
        }

        public static /* synthetic */ void a(a aVar, C0628b c0628b, b bVar, l lVar, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            }
            if ((i8 & 4) != 0) {
                lVar = C0063a.f3656o;
            }
            aVar.a(c0628b, bVar, lVar);
        }
    }

    void a(C0628b c0628b, b bVar, l lVar);
}
