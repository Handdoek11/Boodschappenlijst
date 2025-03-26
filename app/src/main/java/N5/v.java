package N5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public abstract class v {
    public static final s c(s sVar, s sVar2) {
        J6.r.e(sVar, "<this>");
        J6.r.e(sVar2, "builder");
        for (Map.Entry entry : sVar2.b()) {
            sVar.f((String) entry.getKey(), (List) entry.getValue());
        }
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(Set set, Set set2) {
        return J6.r.a(set, set2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(Set set, int i8) {
        return (i8 * 31) + set.hashCode();
    }

    public static final List f(r rVar) {
        J6.r.e(rVar, "<this>");
        Set<Map.Entry> b8 = rVar.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : b8) {
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(AbstractC6987o.l(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(x6.u.a(entry.getKey(), (String) it.next()));
            }
            AbstractC6987o.o(arrayList, arrayList2);
        }
        return arrayList;
    }
}
