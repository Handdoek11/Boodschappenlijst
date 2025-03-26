package j$.util.stream;

import j$.util.Comparator$CC;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
final class J2 extends AbstractC5940f2 {

    /* renamed from: m, reason: collision with root package name */
    private final boolean f37491m;

    /* renamed from: n, reason: collision with root package name */
    private final Comparator f37492n;

    J2(AbstractC5945g2 abstractC5945g2) {
        super(abstractC5945g2, EnumC5931d3.f37655q | EnumC5931d3.f37653o, 0);
        this.f37491m = true;
        this.f37492n = Comparator$CC.a();
    }

    J2(AbstractC5945g2 abstractC5945g2, Comparator comparator) {
        super(abstractC5945g2, EnumC5931d3.f37655q | EnumC5931d3.f37654p, 0);
        this.f37491m = false;
        this.f37492n = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.AbstractC5917b
    public final InterfaceC5985o2 Q(int i8, InterfaceC5985o2 interfaceC5985o2) {
        Objects.requireNonNull(interfaceC5985o2);
        if (EnumC5931d3.SORTED.n(i8) && this.f37491m) {
            return interfaceC5985o2;
        }
        boolean n8 = EnumC5931d3.SIZED.n(i8);
        Comparator comparator = this.f37492n;
        if (n8) {
            return new O2(interfaceC5985o2, comparator);
        }
        return new K2(interfaceC5985o2, comparator);
    }

    @Override // j$.util.stream.AbstractC5917b
    public final K0 N(AbstractC5917b abstractC5917b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC5931d3.SORTED.n(abstractC5917b.J()) && this.f37491m) {
            return abstractC5917b.B(spliterator, false, intFunction);
        }
        Object[] o8 = abstractC5917b.B(spliterator, true, intFunction).o(intFunction);
        Arrays.sort(o8, this.f37492n);
        return new N0(o8);
    }
}
