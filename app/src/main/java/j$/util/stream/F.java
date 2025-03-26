package j$.util.stream;

import j$.util.C6045x;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public interface F extends InterfaceC5947h {
    F a();

    j$.util.B average();

    F b();

    Stream boxed();

    F c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    F d();

    F distinct();

    F e(C5912a c5912a);

    j$.util.B findAny();

    j$.util.B findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    boolean h();

    InterfaceC5983o0 i();

    j$.util.H iterator();

    F limit(long j8);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.B max();

    j$.util.B min();

    boolean o();

    F parallel();

    F peek(DoubleConsumer doubleConsumer);

    double reduce(double d8, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.B reduce(DoubleBinaryOperator doubleBinaryOperator);

    F sequential();

    F skip(long j8);

    F sorted();

    @Override // j$.util.stream.InterfaceC5947h
    j$.util.V spliterator();

    double sum();

    C6045x summaryStatistics();

    IntStream t();

    double[] toArray();

    boolean x();
}
