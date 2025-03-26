package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5987p extends AbstractC5940f2 {
    static O0 X(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        C5962k c5962k = new C5962k(22);
        C5962k c5962k2 = new C5962k(23);
        C5962k c5962k3 = new C5962k(24);
        Objects.requireNonNull(c5962k);
        Objects.requireNonNull(c5962k2);
        Objects.requireNonNull(c5962k3);
        return new O0((Collection) new E1(EnumC5936e3.REFERENCE, c5962k3, c5962k2, c5962k, 3).c(abstractC5917b, spliterator));
    }

    @Override // j$.util.stream.AbstractC5917b
    final K0 N(AbstractC5917b abstractC5917b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC5931d3.DISTINCT.n(abstractC5917b.J())) {
            return abstractC5917b.B(spliterator, false, intFunction);
        }
        if (EnumC5931d3.ORDERED.n(abstractC5917b.J())) {
            return X(abstractC5917b, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C5967l c5967l = new C5967l(3, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(c5967l);
        new Q(c5967l, false).e(abstractC5917b, spliterator);
        Set keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new O0(keySet);
    }

    @Override // j$.util.stream.AbstractC5917b
    final Spliterator O(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        if (EnumC5931d3.DISTINCT.n(abstractC5917b.J())) {
            return abstractC5917b.W(spliterator);
        }
        if (EnumC5931d3.ORDERED.n(abstractC5917b.J())) {
            return X(abstractC5917b, spliterator).spliterator();
        }
        return new C5976m3(abstractC5917b.W(spliterator));
    }

    @Override // j$.util.stream.AbstractC5917b
    final InterfaceC5985o2 Q(int i8, InterfaceC5985o2 interfaceC5985o2) {
        Objects.requireNonNull(interfaceC5985o2);
        if (EnumC5931d3.DISTINCT.n(i8)) {
            return interfaceC5985o2;
        }
        if (EnumC5931d3.SORTED.n(i8)) {
            return new C5977n(interfaceC5985o2);
        }
        return new C5982o(interfaceC5985o2);
    }
}
