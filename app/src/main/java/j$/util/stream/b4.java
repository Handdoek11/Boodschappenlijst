package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
final class b4 extends B implements c4 {
    @Override // j$.util.stream.AbstractC5917b
    final Spliterator O(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        return EnumC5931d3.ORDERED.n(abstractC5917b.J()) ? N(abstractC5917b, spliterator, new C5933e0(14)).spliterator() : new g4((j$.util.V) abstractC5917b.W(spliterator), 0);
    }

    @Override // j$.util.stream.AbstractC5917b
    final K0 N(AbstractC5917b abstractC5917b, Spliterator spliterator, IntFunction intFunction) {
        return (K0) new e4(this, abstractC5917b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC5917b
    final InterfaceC5985o2 Q(int i8, InterfaceC5985o2 interfaceC5985o2) {
        return new a4(this, interfaceC5985o2, false);
    }

    @Override // j$.util.stream.c4
    public final d4 j(C0 c02, boolean z7) {
        return new a4(this, c02, z7);
    }
}
