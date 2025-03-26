package y6;

import java.util.Collections;
import java.util.Map;
import x6.C6933o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class L extends AbstractC6972K {
    public static int b(int i8) {
        if (i8 < 0) {
            return i8;
        }
        if (i8 < 3) {
            return i8 + 1;
        }
        if (i8 < 1073741824) {
            return (int) ((i8 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final Map c(C6933o c6933o) {
        J6.r.e(c6933o, "pair");
        Map singletonMap = Collections.singletonMap(c6933o.c(), c6933o.d());
        J6.r.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final Map d(Map map) {
        J6.r.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        J6.r.d(singletonMap, "with(...)");
        return singletonMap;
    }
}
