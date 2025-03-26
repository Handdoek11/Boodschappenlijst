package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
final class N3 extends AbstractC5940f2 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Predicate f37527m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N3(AbstractC5945g2 abstractC5945g2, int i8, Predicate predicate) {
        super(abstractC5945g2, i8, 0);
        this.f37527m = predicate;
    }

    @Override // j$.util.stream.AbstractC5917b
    final Spliterator O(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        return EnumC5931d3.ORDERED.n(abstractC5917b.J()) ? N(abstractC5917b, spliterator, new C5933e0(2)).spliterator() : new j4(abstractC5917b.W(spliterator), this.f37527m, 1);
    }

    @Override // j$.util.stream.AbstractC5917b
    final K0 N(AbstractC5917b abstractC5917b, Spliterator spliterator, IntFunction intFunction) {
        return (K0) new f4(this, abstractC5917b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC5917b
    final InterfaceC5985o2 Q(int i8, InterfaceC5985o2 interfaceC5985o2) {
        return new C5977n(this, interfaceC5985o2);
    }
}
