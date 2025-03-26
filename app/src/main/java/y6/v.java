package y6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class v extends u {
    public static boolean o(Collection collection, Iterable iterable) {
        J6.r.e(collection, "<this>");
        J6.r.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z7 = true;
            }
        }
        return z7;
    }

    private static final boolean p(Iterable iterable, I6.l lVar, boolean z7) {
        Iterator it = iterable.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue() == z7) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    public static boolean q(Iterable iterable, I6.l lVar) {
        J6.r.e(iterable, "<this>");
        J6.r.e(lVar, "predicate");
        return p(iterable, lVar, true);
    }

    public static Object r(List list) {
        J6.r.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(AbstractC6987o.f(list));
    }
}
