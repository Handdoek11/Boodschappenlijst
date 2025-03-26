package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
final class I2 extends AbstractC5963k0 {
    @Override // j$.util.stream.AbstractC5917b
    public final InterfaceC5985o2 Q(int i8, InterfaceC5985o2 interfaceC5985o2) {
        Objects.requireNonNull(interfaceC5985o2);
        return EnumC5931d3.SORTED.n(i8) ? interfaceC5985o2 : EnumC5931d3.SIZED.n(i8) ? new N2(interfaceC5985o2) : new F2(interfaceC5985o2);
    }

    @Override // j$.util.stream.AbstractC5917b
    public final K0 N(AbstractC5917b abstractC5917b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC5931d3.SORTED.n(abstractC5917b.J())) {
            return abstractC5917b.B(spliterator, false, intFunction);
        }
        long[] jArr = (long[]) ((I0) abstractC5917b.B(spliterator, true, intFunction)).d();
        Arrays.sort(jArr);
        return new C5989p1(jArr);
    }
}
