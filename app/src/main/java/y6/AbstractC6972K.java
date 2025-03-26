package y6;

import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: y6.K, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC6972K {
    public static final Object a(Map map, Object obj) {
        J6.r.e(map, "<this>");
        if (map instanceof InterfaceC6970I) {
            return ((InterfaceC6970I) map).c(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
