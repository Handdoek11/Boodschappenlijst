package androidx.compose.ui.platform;

import e0.AbstractC5735a;
import java.util.List;
import java.util.Map;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    private static final F.f f8250a = new F.f(0.0f, 0.0f, 10.0f, 10.0f);

    /* renamed from: b, reason: collision with root package name */
    private static boolean f8251b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q.p g(Q.p pVar, I6.l lVar) {
        for (Q.p E7 = pVar.E(); E7 != null; E7 = E7.E()) {
            if (((Boolean) lVar.invoke(E7)).booleanValue()) {
                return E7;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map h(S.j jVar) {
        throw null;
    }

    public static final boolean i() {
        return f8251b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(S.h hVar) {
        List list = (List) S.f.a(hVar.p(), S.k.f5032a.c());
        if (list != null) {
            return (String) AbstractC6987o.D(list);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k(S.h hVar) {
        List list = (List) S.f.a(hVar.p(), S.k.f5032a.s());
        if (list != null) {
            return AbstractC5735a.d(list, "\n", null, null, 0, null, null, 62, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(Q.p pVar, Q.p pVar2) {
        Q.p E7 = pVar2.E();
        if (E7 == null) {
            return false;
        }
        return J6.r.a(E7, pVar) || l(pVar, E7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(S.h hVar) {
        return (hVar.r() || hVar.p().d(S.k.f5032a.h())) ? false : true;
    }
}
