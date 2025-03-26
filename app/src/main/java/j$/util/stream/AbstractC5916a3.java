package j$.util.stream;

import j$.util.C5900g;
import j$.util.stream.Collector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collector;

/* renamed from: j$.util.stream.a3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5916a3 {
    public static Set a(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof Collector.Characteristics) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    Collector.Characteristics characteristics = (Collector.Characteristics) it.next();
                    hashSet.add(characteristics == null ? null : characteristics == Collector.Characteristics.CONCURRENT ? Collector.Characteristics.CONCURRENT : characteristics == Collector.Characteristics.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                } catch (ClassCastException e8) {
                    C5900g.a("java.util.stream.Collector.Characteristics", e8);
                    throw null;
                }
            }
            return hashSet;
        }
        if (!(next instanceof Collector.Characteristics)) {
            C5900g.a("java.util.stream.Collector.Characteristics", next.getClass());
            throw null;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            try {
                Collector.Characteristics characteristics2 = (Collector.Characteristics) it2.next();
                hashSet.add(characteristics2 == null ? null : characteristics2 == Collector.Characteristics.CONCURRENT ? Collector.Characteristics.CONCURRENT : characteristics2 == Collector.Characteristics.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
            } catch (ClassCastException e9) {
                C5900g.a("java.util.stream.Collector.Characteristics", e9);
                throw null;
            }
        }
        return hashSet;
    }
}
