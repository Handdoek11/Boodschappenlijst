package v5;

import A6.g;
import I6.l;
import J6.r;
import J6.s;
import U6.InterfaceC0745v0;
import x6.C6916E;
import y5.InterfaceC6958a;
import y5.g;

/* loaded from: classes2.dex */
public abstract class e {

    static final class a extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC6958a f44136o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6958a interfaceC6958a) {
            super(1);
            this.f44136o = interfaceC6958a;
        }

        public final void b(Throwable th) {
            this.f44136o.close();
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6916E.f44463a;
        }
    }

    public static final C6841a a(g gVar, l lVar) {
        r.e(gVar, "engineFactory");
        r.e(lVar, "block");
        C6842b c6842b = new C6842b();
        lVar.invoke(c6842b);
        InterfaceC6958a a8 = gVar.a(c6842b.c());
        C6841a c6841a = new C6841a(a8, c6842b, true);
        g.b d8 = c6841a.getCoroutineContext().d(InterfaceC0745v0.f5485d);
        r.b(d8);
        ((InterfaceC0745v0) d8).D(new a(a8));
        return c6841a;
    }
}
