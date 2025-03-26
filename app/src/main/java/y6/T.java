package y6;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class T extends S {
    public static Set f(Set set, Iterable iterable) {
        int size;
        J6.r.e(set, "<this>");
        J6.r.e(iterable, "elements");
        Integer m8 = r.m(iterable);
        if (m8 != null) {
            size = set.size() + m8.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC6971J.b(size));
        linkedHashSet.addAll(set);
        AbstractC6987o.o(linkedHashSet, iterable);
        return linkedHashSet;
    }
}
