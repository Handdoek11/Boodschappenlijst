package c4;

import java.util.Collection;

/* loaded from: classes2.dex */
public abstract class v {
    private static Collection a(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : x.g(iterable.iterator());
    }

    static Object[] b(Iterable iterable) {
        return a(iterable).toArray();
    }
}
