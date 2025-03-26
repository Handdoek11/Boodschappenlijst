package k7;

import J6.AbstractC0650j;
import java.util.Iterator;

/* renamed from: k7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6115a implements g7.b {
    public /* synthetic */ AbstractC6115a(AbstractC0650j abstractC0650j) {
        this();
    }

    public static /* synthetic */ void i(AbstractC6115a abstractC6115a, j7.c cVar, int i8, Object obj, boolean z7, int i9, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i9 & 8) != 0) {
            z7 = true;
        }
        abstractC6115a.h(cVar, i8, obj, z7);
    }

    private final int j(j7.c cVar, Object obj) {
        int D7 = cVar.D(getDescriptor());
        c(obj, D7);
        return D7;
    }

    protected abstract Object a();

    protected abstract int b(Object obj);

    protected abstract void c(Object obj, int i8);

    protected abstract Iterator d(Object obj);

    @Override // g7.a
    public Object deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        return f(eVar, null);
    }

    protected abstract int e(Object obj);

    public final Object f(j7.e eVar, Object obj) {
        Object a8;
        J6.r.e(eVar, "decoder");
        if (obj == null || (a8 = k(obj)) == null) {
            a8 = a();
        }
        int b8 = b(a8);
        j7.c d8 = eVar.d(getDescriptor());
        if (!d8.x()) {
            while (true) {
                int e8 = d8.e(getDescriptor());
                if (e8 == -1) {
                    break;
                }
                i(this, d8, b8 + e8, a8, false, 8, null);
            }
        } else {
            g(d8, a8, b8, j(d8, a8));
        }
        d8.c(getDescriptor());
        return l(a8);
    }

    protected abstract void g(j7.c cVar, Object obj, int i8, int i9);

    protected abstract void h(j7.c cVar, int i8, Object obj, boolean z7);

    protected abstract Object k(Object obj);

    protected abstract Object l(Object obj);

    private AbstractC6115a() {
    }
}
