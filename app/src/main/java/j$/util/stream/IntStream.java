package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.C6046y;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* loaded from: classes3.dex */
public interface IntStream extends InterfaceC5947h {
    IntStream a();

    F asDoubleStream();

    InterfaceC5983o0 asLongStream();

    j$.util.B average();

    IntStream b();

    Stream boxed();

    IntStream c();

    Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer);

    long count();

    IntStream d();

    IntStream distinct();

    F f();

    j$.util.C findAny();

    j$.util.C findFirst();

    void forEach(IntConsumer intConsumer);

    void forEachOrdered(IntConsumer intConsumer);

    boolean g();

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    j$.util.L iterator();

    InterfaceC5983o0 l();

    IntStream limit(long j8);

    Stream mapToObj(IntFunction intFunction);

    j$.util.C max();

    j$.util.C min();

    IntStream p(Q0 q02);

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    IntStream parallel();

    IntStream peek(IntConsumer intConsumer);

    boolean r();

    int reduce(int i8, IntBinaryOperator intBinaryOperator);

    j$.util.C reduce(IntBinaryOperator intBinaryOperator);

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    IntStream sequential();

    IntStream skip(long j8);

    IntStream sorted();

    @Override // j$.util.stream.InterfaceC5947h
    j$.util.Y spliterator();

    int sum();

    C6046y summaryStatistics();

    int[] toArray();

    boolean u();

    public final /* synthetic */ class Wrapper implements java.util.stream.IntStream {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.IntStream convert(IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof VivifiedWrapper ? ((VivifiedWrapper) intStream).f37484a : intStream.new Wrapper();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            return IntStream.this.u();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            return IntStream.this.r();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream asDoubleStream() {
            return E.j(IntStream.this.asDoubleStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream asLongStream() {
            return C5978n0.j(IntStream.this.asLongStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalDouble average() {
            return AbstractC5897d.n(IntStream.this.average());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream boxed() {
            return Stream.Wrapper.convert(IntStream.this.boxed());
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            IntStream.this.close();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
            return IntStream.this.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ long count() {
            return IntStream.this.count();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream distinct() {
            return convert(IntStream.this.distinct());
        }

        public final /* synthetic */ java.util.stream.IntStream dropWhile(IntPredicate intPredicate) {
            return convert(IntStream.this.c());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            IntStream intStream = IntStream.this;
            if (obj instanceof Wrapper) {
                obj = IntStream.this;
            }
            return intStream.equals(obj);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
            return convert(IntStream.this.b());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findAny() {
            return AbstractC5897d.o(IntStream.this.findAny());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findFirst() {
            return AbstractC5897d.o(IntStream.this.findFirst());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            IntStream.this.forEach(intConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            IntStream.this.forEachOrdered(intConsumer);
        }

        public final /* synthetic */ int hashCode() {
            return IntStream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return IntStream.this.isParallel();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Iterator<Integer> iterator() {
            return IntStream.this.iterator();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: iterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ Iterator<Integer> iterator2() {
            return j$.util.K.a(IntStream.this.iterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream limit(long j8) {
            return convert(IntStream.this.limit(j8));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
            return convert(IntStream.this.d());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
            return E.j(IntStream.this.f());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
            return C5978n0.j(IntStream.this.l());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream mapToObj(IntFunction intFunction) {
            return Stream.Wrapper.convert(IntStream.this.mapToObj(intFunction));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt max() {
            return AbstractC5897d.o(IntStream.this.max());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt min() {
            return AbstractC5897d.o(IntStream.this.min());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            return IntStream.this.g();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return C5942g.j(IntStream.this.onClose(runnable));
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ BaseStream parallel() {
            return C5942g.j(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream parallel() {
            return convert(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream peek(IntConsumer intConsumer) {
            return convert(IntStream.this.peek(intConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int reduce(int i8, IntBinaryOperator intBinaryOperator) {
            return IntStream.this.reduce(i8, intBinaryOperator);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC5897d.o(IntStream.this.reduce(intBinaryOperator));
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ BaseStream sequential() {
            return C5942g.j(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream sequential() {
            return convert(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream skip(long j8) {
            return convert(IntStream.this.skip(j8));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream sorted() {
            return convert(IntStream.this.sorted());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Spliterator<Integer> spliterator() {
            return j$.util.X.a(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: spliterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ Spliterator<Integer> spliterator2() {
            return Spliterator.Wrapper.convert(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return IntStream.this.sum();
        }

        public final /* synthetic */ java.util.stream.IntStream takeWhile(IntPredicate intPredicate) {
            return convert(IntStream.this.a());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return IntStream.this.toArray();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream unordered() {
            return C5942g.j(IntStream.this.unordered());
        }

        @Override // java.util.stream.IntStream
        public final IntSummaryStatistics summaryStatistics() {
            IntStream.this.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
        }

        @Override // java.util.stream.IntStream
        public final java.util.stream.IntStream flatMap(IntFunction intFunction) {
            IntStream intStream = IntStream.this;
            Q0 q02 = new Q0();
            q02.f37551a = intFunction;
            return convert(intStream.p(q02));
        }
    }

    public final /* synthetic */ class VivifiedWrapper implements IntStream {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.util.stream.IntStream f37484a;

        private /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.f37484a = intStream;
        }

        public static /* synthetic */ IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof Wrapper ? IntStream.this : new VivifiedWrapper(intStream);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream a() {
            return convert(this.f37484a.takeWhile(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ F asDoubleStream() {
            return D.j(this.f37484a.asDoubleStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC5983o0 asLongStream() {
            return C5973m0.j(this.f37484a.asLongStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.B average() {
            return AbstractC5897d.j(this.f37484a.average());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream b() {
            return convert(this.f37484a.filter(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream boxed() {
            return Z2.j(this.f37484a.boxed());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream c() {
            return convert(this.f37484a.dropWhile(null));
        }

        @Override // java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            this.f37484a.close();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
            return this.f37484a.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ long count() {
            return this.f37484a.count();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream d() {
            return convert(this.f37484a.map(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream distinct() {
            return convert(this.f37484a.distinct());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.stream.IntStream intStream = this.f37484a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f37484a;
            }
            return intStream.equals(obj);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ F f() {
            return D.j(this.f37484a.mapToDouble(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.C findAny() {
            return AbstractC5897d.k(this.f37484a.findAny());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.C findFirst() {
            return AbstractC5897d.k(this.f37484a.findFirst());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            this.f37484a.forEach(intConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            this.f37484a.forEachOrdered(intConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean g() {
            return this.f37484a.noneMatch(null);
        }

        public final /* synthetic */ int hashCode() {
            return this.f37484a.hashCode();
        }

        @Override // j$.util.stream.InterfaceC5947h
        public final /* synthetic */ boolean isParallel() {
            return this.f37484a.isParallel();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfInt] */
        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC5947h, j$.util.stream.F
        public final /* synthetic */ j$.util.L iterator() {
            return j$.util.J.a(this.f37484a.iterator());
        }

        @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
        public final /* synthetic */ Iterator iterator() {
            return this.f37484a.iterator();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC5983o0 l() {
            return C5973m0.j(this.f37484a.mapToLong(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream limit(long j8) {
            return convert(this.f37484a.limit(j8));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream mapToObj(IntFunction intFunction) {
            return Z2.j(this.f37484a.mapToObj(intFunction));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.C max() {
            return AbstractC5897d.k(this.f37484a.max());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.C min() {
            return AbstractC5897d.k(this.f37484a.min());
        }

        @Override // j$.util.stream.InterfaceC5947h
        public final /* synthetic */ InterfaceC5947h onClose(Runnable runnable) {
            return C5937f.j(this.f37484a.onClose(runnable));
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC5947h, j$.util.stream.F
        public final /* synthetic */ IntStream parallel() {
            return convert(this.f37484a.parallel());
        }

        @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
        public final /* synthetic */ InterfaceC5947h parallel() {
            return C5937f.j(this.f37484a.parallel());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream peek(IntConsumer intConsumer) {
            return convert(this.f37484a.peek(intConsumer));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean r() {
            return this.f37484a.anyMatch(null);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int reduce(int i8, IntBinaryOperator intBinaryOperator) {
            return this.f37484a.reduce(i8, intBinaryOperator);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.C reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC5897d.k(this.f37484a.reduce(intBinaryOperator));
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC5947h, j$.util.stream.F
        public final /* synthetic */ IntStream sequential() {
            return convert(this.f37484a.sequential());
        }

        @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
        public final /* synthetic */ InterfaceC5947h sequential() {
            return C5937f.j(this.f37484a.sequential());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream skip(long j8) {
            return convert(this.f37484a.skip(j8));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream sorted() {
            return convert(this.f37484a.sorted());
        }

        @Override // j$.util.stream.InterfaceC5947h
        public final /* synthetic */ j$.util.Spliterator spliterator() {
            return j$.util.f0.a(this.f37484a.spliterator());
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfInt] */
        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC5947h
        public final /* synthetic */ j$.util.Y spliterator() {
            return j$.util.W.a(this.f37484a.spliterator());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return this.f37484a.sum();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return this.f37484a.toArray();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean u() {
            return this.f37484a.allMatch(null);
        }

        @Override // j$.util.stream.InterfaceC5947h
        public final /* synthetic */ InterfaceC5947h unordered() {
            return C5937f.j(this.f37484a.unordered());
        }

        @Override // j$.util.stream.IntStream
        public final C6046y summaryStatistics() {
            this.f37484a.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }

        @Override // j$.util.stream.IntStream
        public final IntStream p(Q0 q02) {
            java.util.stream.IntStream intStream = this.f37484a;
            Q0 q03 = new Q0();
            q03.f37551a = q02;
            return convert(intStream.flatMap(q03));
        }
    }
}
