package com.google.android.gms.internal.play_billing;

import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes2.dex */
abstract class O0 {
    public static boolean a(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = C5203v0.f30017o;
            }
        } else {
            if (!(iterable instanceof N0)) {
                return false;
            }
            comparator2 = ((N0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
