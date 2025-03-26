package N5;

import N5.b;
import java.util.List;
import java.util.Map;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
abstract class c implements b {
    @Override // N5.b
    public final void a(a aVar) {
        J6.r.e(aVar, "key");
        h().remove(aVar);
    }

    @Override // N5.b
    public final boolean b(a aVar) {
        J6.r.e(aVar, "key");
        return h().containsKey(aVar);
    }

    @Override // N5.b
    public final Object c(a aVar) {
        J6.r.e(aVar, "key");
        return h().get(aVar);
    }

    @Override // N5.b
    public Object d(a aVar) {
        return b.a.a(this, aVar);
    }

    @Override // N5.b
    public final List e() {
        return AbstractC6987o.a0(h().keySet());
    }

    @Override // N5.b
    public final void f(a aVar, Object obj) {
        J6.r.e(aVar, "key");
        J6.r.e(obj, "value");
        h().put(aVar, obj);
    }

    protected abstract Map h();
}
