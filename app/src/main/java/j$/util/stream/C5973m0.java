package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5973m0 implements InterfaceC5983o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LongStream f37744a;

    private /* synthetic */ C5973m0(LongStream longStream) {
        this.f37744a = longStream;
    }

    public static /* synthetic */ InterfaceC5983o0 j(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C5978n0 ? ((C5978n0) longStream).f37752a : new C5973m0(longStream);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ InterfaceC5983o0 a() {
        return j(this.f37744a.takeWhile(null));
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ F asDoubleStream() {
        return D.j(this.f37744a.asDoubleStream());
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ j$.util.B average() {
        return AbstractC5897d.j(this.f37744a.average());
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ InterfaceC5983o0 b() {
        return j(this.f37744a.filter(null));
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ Stream boxed() {
        return Z2.j(this.f37744a.boxed());
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ InterfaceC5983o0 c() {
        return j(this.f37744a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f37744a.close();
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f37744a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ long count() {
        return this.f37744a.count();
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ InterfaceC5983o0 d() {
        return j(this.f37744a.map(null));
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ InterfaceC5983o0 distinct() {
        return j(this.f37744a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.f37744a;
        if (obj instanceof C5973m0) {
            obj = ((C5973m0) obj).f37744a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ j$.util.D findAny() {
        return AbstractC5897d.l(this.f37744a.findAny());
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ j$.util.D findFirst() {
        return AbstractC5897d.l(this.f37744a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f37744a.forEach(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f37744a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f37744a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final /* synthetic */ boolean isParallel() {
        return this.f37744a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.InterfaceC5983o0, j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* synthetic */ j$.util.P iterator() {
        return j$.util.N.a(this.f37744a.iterator());
    }

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* synthetic */ Iterator iterator() {
        return this.f37744a.iterator();
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ F k() {
        return D.j(this.f37744a.mapToDouble(null));
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ InterfaceC5983o0 limit(long j8) {
        return j(this.f37744a.limit(j8));
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ boolean m() {
        return this.f37744a.noneMatch(null);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return Z2.j(this.f37744a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ j$.util.D max() {
        return AbstractC5897d.l(this.f37744a.max());
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ j$.util.D min() {
        return AbstractC5897d.l(this.f37744a.min());
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final /* synthetic */ InterfaceC5947h onClose(Runnable runnable) {
        return C5937f.j(this.f37744a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* synthetic */ InterfaceC5947h parallel() {
        return C5937f.j(this.f37744a.parallel());
    }

    @Override // j$.util.stream.InterfaceC5983o0, j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* synthetic */ InterfaceC5983o0 parallel() {
        return j(this.f37744a.parallel());
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ InterfaceC5983o0 peek(LongConsumer longConsumer) {
        return j(this.f37744a.peek(longConsumer));
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ boolean q() {
        return this.f37744a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ long reduce(long j8, LongBinaryOperator longBinaryOperator) {
        return this.f37744a.reduce(j8, longBinaryOperator);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ j$.util.D reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC5897d.l(this.f37744a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* synthetic */ InterfaceC5947h sequential() {
        return C5937f.j(this.f37744a.sequential());
    }

    @Override // j$.util.stream.InterfaceC5983o0, j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* synthetic */ InterfaceC5983o0 sequential() {
        return j(this.f37744a.sequential());
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ InterfaceC5983o0 skip(long j8) {
        return j(this.f37744a.skip(j8));
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ InterfaceC5983o0 sorted() {
        return j(this.f37744a.sorted());
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.f0.a(this.f37744a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.InterfaceC5983o0, j$.util.stream.InterfaceC5947h
    public final /* synthetic */ j$.util.b0 spliterator() {
        return j$.util.Z.a(this.f37744a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ long sum() {
        return this.f37744a.sum();
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ long[] toArray() {
        return this.f37744a.toArray();
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final /* synthetic */ InterfaceC5947h unordered() {
        return C5937f.j(this.f37744a.unordered());
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ boolean v() {
        return this.f37744a.anyMatch(null);
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final /* synthetic */ IntStream w() {
        return IntStream.VivifiedWrapper.convert(this.f37744a.mapToInt(null));
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final j$.util.A summaryStatistics() {
        this.f37744a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC5983o0
    public final InterfaceC5983o0 e(C5912a c5912a) {
        LongStream longStream = this.f37744a;
        C5912a c5912a2 = new C5912a(9);
        c5912a2.f37615b = c5912a;
        return j(longStream.flatMap(c5912a2));
    }
}
