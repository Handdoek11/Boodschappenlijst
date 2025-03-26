package L5;

import J6.H;
import J6.K;
import J6.r;
import Q6.k;
import g7.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y6.AbstractC6980h;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public abstract class f {
    private static final g7.b a(Collection collection, n7.b bVar) {
        Collection collection2 = collection;
        List y7 = AbstractC6987o.y(collection2);
        ArrayList arrayList = new ArrayList(AbstractC6987o.l(y7, 10));
        Iterator it = y7.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next(), bVar));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((g7.b) obj).getDescriptor().a())) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(AbstractC6987o.l(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((g7.b) it2.next()).getDescriptor().a());
            }
            sb.append(arrayList3);
            throw new IllegalStateException(sb.toString().toString());
        }
        g7.b bVar2 = (g7.b) AbstractC6987o.T(arrayList2);
        if (bVar2 == null) {
            bVar2 = h7.a.C(K.f3551a);
        }
        if (bVar2.getDescriptor().c()) {
            return bVar2;
        }
        r.c(bVar2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            Iterator it3 = collection2.iterator();
            while (it3.hasNext()) {
                if (it3.next() == null) {
                    return h7.a.t(bVar2);
                }
            }
        }
        return bVar2;
    }

    public static final g7.b b(Object obj, n7.b bVar) {
        g7.b b8;
        r.e(bVar, "module");
        if (obj == null) {
            b8 = h7.a.t(h7.a.C(K.f3551a));
        } else if (obj instanceof List) {
            b8 = h7.a.h(a((Collection) obj, bVar));
        } else if (obj instanceof Object[]) {
            Object w7 = AbstractC6980h.w((Object[]) obj);
            if (w7 == null || (b8 = b(w7, bVar)) == null) {
                b8 = h7.a.h(h7.a.C(K.f3551a));
            }
        } else if (obj instanceof Set) {
            b8 = h7.a.m(a((Collection) obj, bVar));
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            b8 = h7.a.k(a(map.keySet(), bVar), a(map.values(), bVar));
        } else {
            g7.b c8 = n7.b.c(bVar, H.b(obj.getClass()), null, 2, null);
            b8 = c8 == null ? j.b(H.b(obj.getClass())) : c8;
        }
        r.c(b8, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return b8;
    }

    private static final g7.b c(g7.b bVar, U5.a aVar) {
        k a8 = aVar.a();
        return (a8 == null || !a8.a()) ? bVar : h7.a.t(bVar);
    }

    public static final g7.b d(U5.a aVar, n7.b bVar) {
        r.e(aVar, "typeInfo");
        r.e(bVar, "module");
        k a8 = aVar.a();
        if (a8 != null) {
            g7.b e8 = a8.b().isEmpty() ? null : j.e(bVar, a8);
            if (e8 != null) {
                return e8;
            }
        }
        g7.b c8 = n7.b.c(bVar, aVar.b(), null, 2, null);
        return c8 != null ? c(c8, aVar) : c(j.b(aVar.b()), aVar);
    }
}
