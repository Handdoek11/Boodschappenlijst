package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.C6045x;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* loaded from: classes3.dex */
public final /* synthetic */ class D implements F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DoubleStream f37441a;

    private /* synthetic */ D(DoubleStream doubleStream) {
        this.f37441a = doubleStream;
    }

    public static /* synthetic */ F j(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof E ? ((E) doubleStream).f37448a : new D(doubleStream);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F a() {
        return j(this.f37441a.takeWhile(null));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.B average() {
        return AbstractC5897d.j(this.f37441a.average());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F b() {
        return j(this.f37441a.filter(null));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ Stream boxed() {
        return Z2.j(this.f37441a.boxed());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F c() {
        return j(this.f37441a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f37441a.close();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f37441a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ long count() {
        return this.f37441a.count();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F d() {
        return j(this.f37441a.map(null));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F distinct() {
        return j(this.f37441a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.f37441a;
        if (obj instanceof D) {
            obj = ((D) obj).f37441a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.B findAny() {
        return AbstractC5897d.j(this.f37441a.findAny());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.B findFirst() {
        return AbstractC5897d.j(this.f37441a.findFirst());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f37441a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f37441a.forEachOrdered(doubleConsumer);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ boolean h() {
        return this.f37441a.allMatch(null);
    }

    public final /* synthetic */ int hashCode() {
        return this.f37441a.hashCode();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ InterfaceC5983o0 i() {
        return C5973m0.j(this.f37441a.mapToLong(null));
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final /* synthetic */ boolean isParallel() {
        return this.f37441a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.H iterator() {
        return j$.util.F.a(this.f37441a.iterator());
    }

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* synthetic */ Iterator iterator() {
        return this.f37441a.iterator();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F limit(long j8) {
        return j(this.f37441a.limit(j8));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return Z2.j(this.f37441a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.B max() {
        return AbstractC5897d.j(this.f37441a.max());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.B min() {
        return AbstractC5897d.j(this.f37441a.min());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ boolean o() {
        return this.f37441a.anyMatch(null);
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final /* synthetic */ InterfaceC5947h onClose(Runnable runnable) {
        return C5937f.j(this.f37441a.onClose(runnable));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F parallel() {
        return j(this.f37441a.parallel());
    }

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* synthetic */ InterfaceC5947h parallel() {
        return C5937f.j(this.f37441a.parallel());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F peek(DoubleConsumer doubleConsumer) {
        return j(this.f37441a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ double reduce(double d8, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f37441a.reduce(d8, doubleBinaryOperator);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.B reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC5897d.j(this.f37441a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F sequential() {
        return j(this.f37441a.sequential());
    }

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* synthetic */ InterfaceC5947h sequential() {
        return C5937f.j(this.f37441a.sequential());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F skip(long j8) {
        return j(this.f37441a.skip(j8));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F sorted() {
        return j(this.f37441a.sorted());
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.f0.a(this.f37441a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.F, j$.util.stream.InterfaceC5947h
    public final /* synthetic */ j$.util.V spliterator() {
        return j$.util.T.a(this.f37441a.spliterator());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ double sum() {
        return this.f37441a.sum();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ IntStream t() {
        return IntStream.VivifiedWrapper.convert(this.f37441a.mapToInt(null));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ double[] toArray() {
        return this.f37441a.toArray();
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final /* synthetic */ InterfaceC5947h unordered() {
        return C5937f.j(this.f37441a.unordered());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ boolean x() {
        return this.f37441a.noneMatch(null);
    }

    @Override // j$.util.stream.F
    public final C6045x summaryStatistics() {
        this.f37441a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.F
    public final F e(C5912a c5912a) {
        DoubleStream doubleStream = this.f37441a;
        C5912a c5912a2 = new C5912a(7);
        c5912a2.f37615b = c5912a;
        return j(doubleStream.flatMap(c5912a2));
    }
}
