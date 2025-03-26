package M5;

import I5.C0628b;
import I6.l;
import J6.r;
import J6.s;
import L5.c;
import l7.d;
import l7.n;
import x6.C6916E;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final l7.a f4022a = n.b(null, C0071a.f4023o, 1, null);

    /* renamed from: M5.a$a, reason: collision with other inner class name */
    static final class C0071a extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        public static final C0071a f4023o = new C0071a();

        C0071a() {
            super(1);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((d) obj);
            return C6916E.f44463a;
        }

        public final void invoke(d dVar) {
            r.e(dVar, "$this$Json");
            dVar.e(true);
            dVar.g(true);
            dVar.c(true);
            dVar.d(true);
            dVar.h(false);
            dVar.j(false);
        }
    }

    public static final void a(K5.a aVar, l7.a aVar2, C0628b c0628b) {
        r.e(aVar, "<this>");
        r.e(aVar2, "json");
        r.e(c0628b, "contentType");
        c.a(aVar, c0628b, aVar2);
    }

    public static /* synthetic */ void b(K5.a aVar, l7.a aVar2, C0628b c0628b, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            aVar2 = f4022a;
        }
        if ((i8 & 2) != 0) {
            c0628b = C0628b.a.f3225a.a();
        }
        a(aVar, aVar2, c0628b);
    }
}
