package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5968l0 extends AbstractC5917b implements InterfaceC5983o0 {
    @Override // j$.util.stream.InterfaceC5983o0
    public final j$.util.D findAny() {
        return (j$.util.D) C(J.f37487d);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final j$.util.D findFirst() {
        return (j$.util.D) C(J.f37486c);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final InterfaceC5983o0 sorted() {
        return new I2(this, EnumC5931d3.f37655q | EnumC5931d3.f37653o, 0);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        C(new P(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        C(new P(longConsumer, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.b0 Y(Spliterator spliterator) {
        if (spliterator instanceof j$.util.b0) {
            return (j$.util.b0) spliterator;
        }
        if (M3.f37518a) {
            M3.a(AbstractC5917b.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // j$.util.stream.AbstractC5917b
    final EnumC5936e3 H() {
        return EnumC5936e3.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC5917b
    final K0 E(AbstractC5917b abstractC5917b, Spliterator spliterator, boolean z7, IntFunction intFunction) {
        return AbstractC6032y0.H(abstractC5917b, spliterator, z7);
    }

    @Override // j$.util.stream.AbstractC5917b
    final Spliterator T(AbstractC5917b abstractC5917b, Supplier supplier, boolean z7) {
        return new C6005s3(abstractC5917b, supplier, z7);
    }

    @Override // j$.util.stream.AbstractC5917b
    final boolean G(Spliterator spliterator, InterfaceC5985o2 interfaceC5985o2) {
        LongConsumer c5928d0;
        boolean n8;
        j$.util.b0 Y7 = Y(spliterator);
        if (interfaceC5985o2 instanceof LongConsumer) {
            c5928d0 = (LongConsumer) interfaceC5985o2;
        } else {
            if (M3.f37518a) {
                M3.a(AbstractC5917b.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC5985o2);
            c5928d0 = new C5928d0(interfaceC5985o2);
        }
        do {
            n8 = interfaceC5985o2.n();
            if (n8) {
                break;
            }
        } while (Y7.tryAdvance(c5928d0));
        return n8;
    }

    @Override // j$.util.stream.AbstractC5917b
    final C0 M(long j8, IntFunction intFunction) {
        return AbstractC6032y0.U(j8);
    }

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final j$.util.P iterator() {
        return Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.AbstractC5917b, j$.util.stream.InterfaceC5947h
    public final j$.util.b0 spliterator() {
        return Y(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final F asDoubleStream() {
        return new C6016v(this, EnumC5931d3.f37652n, 5);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final Stream boxed() {
        return new C6011u(this, 0, new r(25), 2);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final InterfaceC5983o0 d() {
        Objects.requireNonNull(null);
        return new C6026x(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n, 3);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new C6011u(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n, longFunction, 2);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final IntStream w() {
        Objects.requireNonNull(null);
        return new C6021w(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n, 4);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final F k() {
        Objects.requireNonNull(null);
        return new C6016v(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n, 6);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final InterfaceC5983o0 e(C5912a c5912a) {
        Objects.requireNonNull(c5912a);
        return new C5953i0(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n | EnumC5931d3.f37658t, c5912a, 0);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final InterfaceC5983o0 b() {
        Objects.requireNonNull(null);
        return new C6026x(this, EnumC5931d3.f37658t, 5);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final InterfaceC5983o0 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new C5953i0(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final InterfaceC5983o0 limit(long j8) {
        if (j8 < 0) {
            throw new IllegalArgumentException(Long.toString(j8));
        }
        return AbstractC6032y0.a0(this, 0L, j8);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final InterfaceC5983o0 skip(long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? this : AbstractC6032y0.a0(this, j8, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final InterfaceC5983o0 a() {
        int i8 = l4.f37737a;
        Objects.requireNonNull(null);
        return new V3(this, l4.f37737a, 0);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final InterfaceC5983o0 c() {
        int i8 = l4.f37737a;
        Objects.requireNonNull(null);
        return new X3(this, l4.f37738b, 0);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final InterfaceC5983o0 distinct() {
        return ((AbstractC5945g2) boxed()).distinct().mapToLong(new r(22));
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final long sum() {
        return reduce(0L, new C5933e0(0));
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final j$.util.D min() {
        return reduce(new r(21));
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final j$.util.D max() {
        return reduce(new r(29));
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final j$.util.B average() {
        long j8 = ((long[]) collect(new r(26), new r(27), new r(28)))[0];
        return j8 > 0 ? j$.util.B.d(r0[1] / j8) : j$.util.B.a();
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final long reduce(long j8, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) C(new A1(EnumC5936e3.LONG_VALUE, longBinaryOperator, j8))).longValue();
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final j$.util.A summaryStatistics() {
        return (j$.util.A) collect(new C5962k(20), new r(20), new r(23));
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C6001s c6001s = new C6001s(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(c6001s);
        return C(new E1(EnumC5936e3.LONG_VALUE, c6001s, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final boolean v() {
        return ((Boolean) C(AbstractC6032y0.b0(EnumC6017v0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final boolean q() {
        return ((Boolean) C(AbstractC6032y0.b0(EnumC6017v0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final j$.util.D reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.D) C(new C1(EnumC5936e3.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final boolean m() {
        return ((Boolean) C(AbstractC6032y0.b0(EnumC6017v0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final long[] toArray() {
        return (long[]) AbstractC6032y0.Q((I0) D(new r(24))).d();
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final long count() {
        return ((Long) C(new G1(0))).longValue();
    }
}
