package y6;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import x6.C6933o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class M extends L {
    public static Map e() {
        C6963B c6963b = C6963B.f44634o;
        J6.r.c(c6963b, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c6963b;
    }

    public static Object f(Map map, Object obj) {
        J6.r.e(map, "<this>");
        return AbstractC6972K.a(map, obj);
    }

    public static Map g(C6933o... c6933oArr) {
        J6.r.e(c6933oArr, "pairs");
        return c6933oArr.length > 0 ? n(c6933oArr, new LinkedHashMap(AbstractC6971J.b(c6933oArr.length))) : AbstractC6971J.e();
    }

    public static final Map h(Map map) {
        J6.r.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : L.d(map) : AbstractC6971J.e();
    }

    public static final void i(Map map, Iterable iterable) {
        J6.r.e(map, "<this>");
        J6.r.e(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C6933o c6933o = (C6933o) it.next();
            map.put(c6933o.a(), c6933o.b());
        }
    }

    public static final void j(Map map, C6933o[] c6933oArr) {
        J6.r.e(map, "<this>");
        J6.r.e(c6933oArr, "pairs");
        for (C6933o c6933o : c6933oArr) {
            map.put(c6933o.a(), c6933o.b());
        }
    }

    public static Map k(Iterable iterable) {
        J6.r.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return h(l(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC6971J.e();
        }
        if (size != 1) {
            return l(iterable, new LinkedHashMap(AbstractC6971J.b(collection.size())));
        }
        return L.c((C6933o) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    public static final Map l(Iterable iterable, Map map) {
        J6.r.e(iterable, "<this>");
        J6.r.e(map, "destination");
        i(map, iterable);
        return map;
    }

    public static Map m(Map map) {
        J6.r.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? AbstractC6971J.o(map) : L.d(map) : AbstractC6971J.e();
    }

    public static final Map n(C6933o[] c6933oArr, Map map) {
        J6.r.e(c6933oArr, "<this>");
        J6.r.e(map, "destination");
        j(map, c6933oArr);
        return map;
    }

    public static Map o(Map map) {
        J6.r.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
