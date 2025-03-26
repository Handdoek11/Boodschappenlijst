package T0;

import J6.AbstractC0650j;
import J6.r;
import T0.a;

/* loaded from: classes.dex */
public final class d extends a {
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // T0.a
    public Object a(a.b bVar) {
        r.e(bVar, "key");
        return b().get(bVar);
    }

    public final void c(a.b bVar, Object obj) {
        r.e(bVar, "key");
        b().put(bVar, obj);
    }

    public d(a aVar) {
        r.e(aVar, "initialExtras");
        b().putAll(aVar.b());
    }

    public /* synthetic */ d(a aVar, int i8, AbstractC0650j abstractC0650j) {
        this((i8 & 1) != 0 ? a.C0103a.f5162b : aVar);
    }
}
