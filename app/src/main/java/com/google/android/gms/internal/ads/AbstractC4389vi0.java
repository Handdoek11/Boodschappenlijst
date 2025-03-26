package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.vi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4389vi0 {
    static int a(Set set) {
        Iterator it = set.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i8 += next != null ? next.hashCode() : 0;
        }
        return i8;
    }

    public static AbstractC4171ti0 b(Set set, Set set2) {
        AbstractC1762Sf0.c(set, "set1");
        AbstractC1762Sf0.c(set2, "set2");
        return new C3736pi0(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set c(Set set, InterfaceC1797Tf0 interfaceC1797Tf0) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof C3845qi0)) {
                set.getClass();
                return new C3845qi0(set, interfaceC1797Tf0);
            }
            C3845qi0 c3845qi0 = (C3845qi0) set;
            return new C3845qi0((Set) c3845qi0.f18521o, AbstractC1902Wf0.a(c3845qi0.f18522s, interfaceC1797Tf0));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof C3845qi0)) {
            sortedSet.getClass();
            return new C3953ri0(sortedSet, interfaceC1797Tf0);
        }
        C3845qi0 c3845qi02 = (C3845qi0) sortedSet;
        return new C3953ri0((SortedSet) c3845qi02.f18521o, AbstractC1902Wf0.a(c3845qi02.f18522s, interfaceC1797Tf0));
    }

    static boolean d(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean e(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC2214bi0) {
            collection = ((InterfaceC2214bi0) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return f(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z7 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    static boolean f(Set set, Iterator it) {
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= set.remove(it.next());
        }
        return z7;
    }
}
