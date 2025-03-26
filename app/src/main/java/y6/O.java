package y6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x6.C6933o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class O extends N {
    public static List p(Map map) {
        J6.r.e(map, "<this>");
        if (map.size() == 0) {
            return AbstractC6987o.e();
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return AbstractC6987o.e();
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return AbstractC6987o.b(new C6933o(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C6933o(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new C6933o(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
