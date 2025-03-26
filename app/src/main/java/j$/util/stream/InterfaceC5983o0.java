package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC5983o0 extends InterfaceC5947h {
    InterfaceC5983o0 a();

    F asDoubleStream();

    j$.util.B average();

    InterfaceC5983o0 b();

    Stream boxed();

    InterfaceC5983o0 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC5983o0 d();

    InterfaceC5983o0 distinct();

    InterfaceC5983o0 e(C5912a c5912a);

    j$.util.D findAny();

    j$.util.D findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    j$.util.P iterator();

    F k();

    InterfaceC5983o0 limit(long j8);

    boolean m();

    Stream mapToObj(LongFunction longFunction);

    j$.util.D max();

    j$.util.D min();

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    InterfaceC5983o0 parallel();

    InterfaceC5983o0 peek(LongConsumer longConsumer);

    boolean q();

    long reduce(long j8, LongBinaryOperator longBinaryOperator);

    j$.util.D reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    InterfaceC5983o0 sequential();

    InterfaceC5983o0 skip(long j8);

    InterfaceC5983o0 sorted();

    @Override // j$.util.stream.InterfaceC5947h
    j$.util.b0 spliterator();

    long sum();

    j$.util.A summaryStatistics();

    long[] toArray();

    boolean v();

    IntStream w();
}
