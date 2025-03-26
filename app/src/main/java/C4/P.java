package c4;

import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes2.dex */
abstract class P {
    public static Comparator a(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        return comparator == null ? G.c() : comparator;
    }

    public static boolean b(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        b4.h.i(comparator);
        b4.h.i(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof O)) {
                return false;
            }
            comparator2 = ((O) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
