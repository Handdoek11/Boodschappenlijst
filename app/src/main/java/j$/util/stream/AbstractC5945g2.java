package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Collector;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.g2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5945g2 extends AbstractC5917b implements Stream {
    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new J2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new C5987p(this, EnumC5931d3.f37651m | EnumC5931d3.f37658t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(1, comparator));
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) C(K.f37494d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) C(K.f37493c);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new J2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return C(new E1(EnumC5936e3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return C(new E1(EnumC5936e3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C(new Q(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C(new Q(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(0, comparator));
    }

    @Override // j$.util.stream.AbstractC5917b
    final EnumC5936e3 H() {
        return EnumC5936e3.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) C(new C1(EnumC5936e3.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.AbstractC5917b
    final K0 E(AbstractC5917b abstractC5917b, Spliterator spliterator, boolean z7, IntFunction intFunction) {
        return AbstractC6032y0.E(abstractC5917b, spliterator, z7, intFunction);
    }

    @Override // j$.util.stream.AbstractC5917b
    final Spliterator T(AbstractC5917b abstractC5917b, Supplier supplier, boolean z7) {
        return new H3(abstractC5917b, supplier, z7);
    }

    @Override // j$.util.stream.AbstractC5917b
    final boolean G(Spliterator spliterator, InterfaceC5985o2 interfaceC5985o2) {
        boolean n8;
        do {
            n8 = interfaceC5985o2.n();
            if (n8) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC5985o2));
        return n8;
    }

    @Override // j$.util.stream.AbstractC5917b
    final C0 M(long j8, IntFunction intFunction) {
        return AbstractC6032y0.D(j8, intFunction);
    }

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final Iterator iterator() {
        return Spliterators.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new C6011u(this, EnumC5931d3.f37658t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new C6011u(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new X(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return C(new E1(EnumC5936e3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC5983o0 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new C5953i0(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final F mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new C6036z(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n, toDoubleFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) C(new G1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream e(C5912a c5912a) {
        Objects.requireNonNull(c5912a);
        return new C6011u(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n | EnumC5931d3.f37658t, c5912a, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream s(C5912a c5912a) {
        Objects.requireNonNull(c5912a);
        return new X(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n | EnumC5931d3.f37658t, c5912a, 3);
    }

    @Override // j$.util.stream.Stream
    public final F y(C5912a c5912a) {
        Objects.requireNonNull(c5912a);
        return new C6036z(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n | EnumC5931d3.f37658t, c5912a, 3);
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC5983o0 n(C5912a c5912a) {
        Objects.requireNonNull(c5912a);
        return new C5953i0(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n | EnumC5931d3.f37658t, c5912a, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C6011u(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j8) {
        if (j8 < 0) {
            throw new IllegalArgumentException(Long.toString(j8));
        }
        return AbstractC6032y0.d0(this, 0L, j8);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? this : AbstractC6032y0.d0(this, j8, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i8 = l4.f37737a;
        Objects.requireNonNull(predicate);
        return new N3(this, l4.f37737a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i8 = l4.f37737a;
        Objects.requireNonNull(predicate);
        return new P3(this, l4.f37738b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC6032y0.N(D(intFunction), intFunction).o(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new C5933e0(3));
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) C(AbstractC6032y0.c0(EnumC6017v0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) C(AbstractC6032y0.c0(EnumC6017v0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) C(AbstractC6032y0.c0(EnumC6017v0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Object C7;
        if (!isParallel() || !collector.characteristics().contains(Collector.Characteristics.CONCURRENT) || (K() && !collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            C7 = C(new L1(EnumC5936e3.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector));
        } else {
            C7 = collector.supplier().get();
            forEach(new C5967l(4, collector.accumulator(), C7));
        }
        return collector.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? C7 : collector.finisher().apply(C7);
    }
}
