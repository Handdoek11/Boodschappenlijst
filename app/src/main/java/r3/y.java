package r3;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class y {
    static int a(Set set) {
        Iterator it = set.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i8 += next != null ? next.hashCode() : 0;
        }
        return i8;
    }
}
