package j$.util.stream;

import j$.util.C6046y;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5923c0 extends AbstractC5917b implements IntStream {
    @Override // j$.util.stream.IntStream
    public final j$.util.C findAny() {
        return (j$.util.C) C(I.f37479d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.C findFirst() {
        return (j$.util.C) C(I.f37478c);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new H2(this, EnumC5931d3.f37655q | EnumC5931d3.f37653o, 0);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        C(new O(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        C(new O(intConsumer, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.Y Y(Spliterator spliterator) {
        if (spliterator instanceof j$.util.Y) {
            return (j$.util.Y) spliterator;
        }
        if (M3.f37518a) {
            M3.a(AbstractC5917b.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // j$.util.stream.AbstractC5917b
    final EnumC5936e3 H() {
        return EnumC5936e3.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC5917b
    final K0 E(AbstractC5917b abstractC5917b, Spliterator spliterator, boolean z7, IntFunction intFunction) {
        return AbstractC6032y0.G(abstractC5917b, spliterator, z7);
    }

    @Override // j$.util.stream.AbstractC5917b
    final Spliterator T(AbstractC5917b abstractC5917b, Supplier supplier, boolean z7) {
        return new C5996q3(abstractC5917b, supplier, z7);
    }

    @Override // j$.util.stream.AbstractC5917b
    final boolean G(Spliterator spliterator, InterfaceC5985o2 interfaceC5985o2) {
        IntConsumer v7;
        boolean n8;
        j$.util.Y Y7 = Y(spliterator);
        if (interfaceC5985o2 instanceof IntConsumer) {
            v7 = (IntConsumer) interfaceC5985o2;
        } else {
            if (M3.f37518a) {
                M3.a(AbstractC5917b.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC5985o2);
            v7 = new V(interfaceC5985o2);
        }
        do {
            n8 = interfaceC5985o2.n();
            if (n8) {
                break;
            }
        } while (Y7.tryAdvance(v7));
        return n8;
    }

    @Override // j$.util.stream.AbstractC5917b
    final C0 M(long j8, IntFunction intFunction) {
        return AbstractC6032y0.S(j8);
    }

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final j$.util.L iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.AbstractC5917b, j$.util.stream.InterfaceC5947h
    public final j$.util.Y spliterator() {
        return Y(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC5983o0 asLongStream() {
        return new C6026x(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final F asDoubleStream() {
        return new C6016v(this, 0, 3);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C6011u(this, 0, new r(11), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream d() {
        Objects.requireNonNull(null);
        return new C6021w(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new C6011u(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC5983o0 l() {
        Objects.requireNonNull(null);
        return new C6026x(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final F f() {
        Objects.requireNonNull(null);
        return new C6016v(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n, 4);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i8, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) C(new P1(EnumC5936e3.INT_VALUE, intBinaryOperator, i8))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream p(Q0 q02) {
        Objects.requireNonNull(q02);
        return new X(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n | EnumC5931d3.f37658t, q02, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.C reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (j$.util.C) C(new C1(EnumC5936e3.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new C6021w(this, EnumC5931d3.f37658t, 3);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new X(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j8) {
        if (j8 < 0) {
            throw new IllegalArgumentException(Long.toString(j8));
        }
        return AbstractC6032y0.Y(this, 0L, j8);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? this : AbstractC6032y0.Y(this, j8, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        int i8 = l4.f37737a;
        Objects.requireNonNull(null);
        return new R3(this, l4.f37737a, 0);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        int i8 = l4.f37737a;
        Objects.requireNonNull(null);
        return new T3(this, l4.f37738b, 0);
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) C(new G1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC5945g2) boxed()).distinct().mapToInt(new r(10));
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new r(15));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.C min() {
        return reduce(new r(12));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.C max() {
        return reduce(new r(16));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.B average() {
        long j8 = ((long[]) collect(new r(17), new r(18), new r(19)))[0];
        return j8 > 0 ? j$.util.B.d(r0[1] / j8) : j$.util.B.a();
    }

    @Override // j$.util.stream.IntStream
    public final C6046y summaryStatistics() {
        return (C6046y) collect(new C5962k(19), new r(13), new r(14));
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C6001s c6001s = new C6001s(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(c6001s);
        return C(new E1(EnumC5936e3.INT_VALUE, c6001s, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final boolean r() {
        return ((Boolean) C(AbstractC6032y0.Z(EnumC6017v0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean u() {
        return ((Boolean) C(AbstractC6032y0.Z(EnumC6017v0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean g() {
        return ((Boolean) C(AbstractC6032y0.Z(EnumC6017v0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC6032y0.P((G0) D(new r(9))).d();
    }
}
