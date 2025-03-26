package y5;

import A6.g;
import I5.C0628b;
import I5.C0638l;
import I5.InterfaceC0637k;
import I5.o;
import I6.p;
import J6.r;
import J6.s;
import N5.q;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import x6.C6916E;
import y6.AbstractC6987o;
import y6.P;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private static final String f44628a = "Ktor client";

    /* renamed from: b, reason: collision with root package name */
    private static final Set f44629b;

    static final class a extends s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC0637k f44630o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ J5.b f44631s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0637k interfaceC0637k, J5.b bVar) {
            super(1);
            this.f44630o = interfaceC0637k;
            this.f44631s = bVar;
        }

        public final void b(C0638l c0638l) {
            r.e(c0638l, "$this$buildHeaders");
            c0638l.e(this.f44630o);
            c0638l.e(this.f44631s.c());
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C0638l) obj);
            return C6916E.f44463a;
        }
    }

    static final class b extends s implements p {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ p f44632o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p pVar) {
            super(2);
            this.f44632o = pVar;
        }

        public final void b(String str, List list) {
            r.e(str, "key");
            r.e(list, "values");
            o oVar = o.f3324a;
            if (r.a(oVar.g(), str) || r.a(oVar.h(), str)) {
                return;
            }
            if (!l.f44629b.contains(str)) {
                this.f44632o.invoke(str, AbstractC6987o.I(list, ",", null, null, 0, null, null, 62, null));
                return;
            }
            p pVar = this.f44632o;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pVar.invoke(str, (String) it.next());
            }
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((String) obj, (List) obj2);
            return C6916E.f44463a;
        }
    }

    static {
        o oVar = o.f3324a;
        f44629b = P.e(oVar.i(), oVar.j(), oVar.m(), oVar.k(), oVar.l());
    }

    public static final Object b(A6.d dVar) {
        g.b d8 = dVar.getContext().d(i.f44624s);
        r.b(d8);
        return ((i) d8).a();
    }

    public static final void c(InterfaceC0637k interfaceC0637k, J5.b bVar, p pVar) {
        String e8;
        String e9;
        r.e(interfaceC0637k, "requestHeaders");
        r.e(bVar, "content");
        r.e(pVar, "block");
        G5.f.a(new a(interfaceC0637k, bVar)).f(new b(pVar));
        o oVar = o.f3324a;
        if (interfaceC0637k.e(oVar.r()) == null && bVar.c().e(oVar.r()) == null && d()) {
            pVar.invoke(oVar.r(), f44628a);
        }
        C0628b b8 = bVar.b();
        if ((b8 == null || (e8 = b8.toString()) == null) && (e8 = bVar.c().e(oVar.h())) == null) {
            e8 = interfaceC0637k.e(oVar.h());
        }
        Long a8 = bVar.a();
        if ((a8 == null || (e9 = a8.toString()) == null) && (e9 = bVar.c().e(oVar.g())) == null) {
            e9 = interfaceC0637k.e(oVar.g());
        }
        if (e8 != null) {
            pVar.invoke(oVar.h(), e8);
        }
        if (e9 != null) {
            pVar.invoke(oVar.g(), e9);
        }
    }

    private static final boolean d() {
        return !q.f4190a.a();
    }
}
