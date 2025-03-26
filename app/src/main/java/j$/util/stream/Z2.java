package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
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

/* loaded from: classes3.dex */
public final /* synthetic */ class Z2 implements Stream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.stream.Stream f37613a;

    private /* synthetic */ Z2(java.util.stream.Stream stream) {
        this.f37613a = stream;
    }

    public static /* synthetic */ Stream j(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new Z2(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f37613a.allMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f37613a.anyMatch(predicate);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f37613a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Collector collector) {
        return this.f37613a.collect(C5957j.a(collector));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f37613a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f37613a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return j(this.f37613a.distinct());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return j(this.f37613a.dropWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream e(C5912a c5912a) {
        return j(this.f37613a.flatMap(AbstractC6032y0.R(c5912a)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Stream stream = this.f37613a;
        if (obj instanceof Z2) {
            obj = ((Z2) obj).f37613a;
        }
        return stream.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return j(this.f37613a.filter(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return AbstractC5897d.i(this.f37613a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return AbstractC5897d.i(this.f37613a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f37613a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.f37613a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f37613a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final /* synthetic */ boolean isParallel() {
        return this.f37613a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* synthetic */ Iterator iterator() {
        return this.f37613a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j8) {
        return j(this.f37613a.limit(j8));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return j(this.f37613a.map(function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ F mapToDouble(ToDoubleFunction toDoubleFunction) {
        return D.j(this.f37613a.mapToDouble(toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.f37613a.mapToInt(toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC5983o0 mapToLong(ToLongFunction toLongFunction) {
        return C5973m0.j(this.f37613a.mapToLong(toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return AbstractC5897d.i(this.f37613a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return AbstractC5897d.i(this.f37613a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC5983o0 n(C5912a c5912a) {
        return C5973m0.j(this.f37613a.flatMapToLong(AbstractC6032y0.R(c5912a)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f37613a.noneMatch(predicate);
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final /* synthetic */ InterfaceC5947h onClose(Runnable runnable) {
        return C5937f.j(this.f37613a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* synthetic */ InterfaceC5947h parallel() {
        return C5937f.j(this.f37613a.parallel());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return j(this.f37613a.peek(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return AbstractC5897d.i(this.f37613a.reduce(binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f37613a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f37613a.reduce(obj, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream s(C5912a c5912a) {
        return IntStream.VivifiedWrapper.convert(this.f37613a.flatMapToInt(AbstractC6032y0.R(c5912a)));
    }

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* synthetic */ InterfaceC5947h sequential() {
        return C5937f.j(this.f37613a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j8) {
        return j(this.f37613a.skip(j8));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return j(this.f37613a.sorted());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return j(this.f37613a.sorted(comparator));
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.f0.a(this.f37613a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return j(this.f37613a.takeWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f37613a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f37613a.toArray(intFunction);
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final /* synthetic */ InterfaceC5947h unordered() {
        return C5937f.j(this.f37613a.unordered());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ F y(C5912a c5912a) {
        return D.j(this.f37613a.flatMapToDouble(AbstractC6032y0.R(c5912a)));
    }
}
