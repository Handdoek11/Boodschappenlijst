package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
final class V3 extends AbstractC5963k0 {
    @Override // j$.util.stream.AbstractC5917b
    final Spliterator O(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        return EnumC5931d3.ORDERED.n(abstractC5917b.J()) ? N(abstractC5917b, spliterator, new C5933e0(11)).spliterator() : new i4((j$.util.b0) abstractC5917b.W(spliterator), 1);
    }

    @Override // j$.util.stream.AbstractC5917b
    final K0 N(AbstractC5917b abstractC5917b, Spliterator spliterator, IntFunction intFunction) {
        return (K0) new f4(this, abstractC5917b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC5917b
    final InterfaceC5985o2 Q(int i8, InterfaceC5985o2 interfaceC5985o2) {
        return new U3(this, interfaceC5985o2);
    }
}
