package j$.util.stream;

import j$.util.C6045x;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
abstract class C extends AbstractC5917b implements F {
    @Override // j$.util.stream.F
    public final j$.util.B findAny() {
        return (j$.util.B) C(H.f37473d);
    }

    @Override // j$.util.stream.F
    public final j$.util.B findFirst() {
        return (j$.util.B) C(H.f37472c);
    }

    @Override // j$.util.stream.F
    public final F sorted() {
        return new G2(this, EnumC5931d3.f37655q | EnumC5931d3.f37653o, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.V Y(Spliterator spliterator) {
        if (spliterator instanceof j$.util.V) {
            return (j$.util.V) spliterator;
        }
        if (M3.f37518a) {
            M3.a(AbstractC5917b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        C(new N(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        C(new N(doubleConsumer, true));
    }

    @Override // j$.util.stream.AbstractC5917b
    final EnumC5936e3 H() {
        return EnumC5936e3.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC5917b
    final K0 E(AbstractC5917b abstractC5917b, Spliterator spliterator, boolean z7, IntFunction intFunction) {
        return AbstractC6032y0.F(abstractC5917b, spliterator, z7);
    }

    @Override // j$.util.stream.AbstractC5917b
    final Spliterator T(AbstractC5917b abstractC5917b, Supplier supplier, boolean z7) {
        return new C5986o3(abstractC5917b, supplier, z7);
    }

    @Override // j$.util.stream.AbstractC5917b
    final boolean G(Spliterator spliterator, InterfaceC5985o2 interfaceC5985o2) {
        DoubleConsumer c5992q;
        boolean n8;
        j$.util.V Y7 = Y(spliterator);
        if (interfaceC5985o2 instanceof DoubleConsumer) {
            c5992q = (DoubleConsumer) interfaceC5985o2;
        } else {
            if (M3.f37518a) {
                M3.a(AbstractC5917b.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC5985o2);
            c5992q = new C5992q(interfaceC5985o2);
        }
        do {
            n8 = interfaceC5985o2.n();
            if (n8) {
                break;
            }
        } while (Y7.tryAdvance(c5992q));
        return n8;
    }

    @Override // j$.util.stream.AbstractC5917b
    final C0 M(long j8, IntFunction intFunction) {
        return AbstractC6032y0.J(j8);
    }

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final j$.util.H iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.AbstractC5917b, j$.util.stream.InterfaceC5947h
    public final j$.util.V spliterator() {
        return Y(super.spliterator());
    }

    @Override // j$.util.stream.F
    public final Stream boxed() {
        return new C6011u(this, 0, new C5962k(29), 0);
    }

    @Override // j$.util.stream.F
    public final F d() {
        Objects.requireNonNull(null);
        return new C6016v(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n, 0);
    }

    @Override // j$.util.stream.F
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new C6011u(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n, doubleFunction, 0);
    }

    @Override // j$.util.stream.F
    public final IntStream t() {
        Objects.requireNonNull(null);
        return new C6021w(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n, 0);
    }

    @Override // j$.util.stream.F
    public final InterfaceC5983o0 i() {
        Objects.requireNonNull(null);
        return new C6026x(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n, 0);
    }

    @Override // j$.util.stream.F
    public final F e(C5912a c5912a) {
        Objects.requireNonNull(c5912a);
        return new C6036z(this, EnumC5931d3.f37654p | EnumC5931d3.f37652n | EnumC5931d3.f37658t, c5912a, 0);
    }

    @Override // j$.util.stream.F
    public final F b() {
        Objects.requireNonNull(null);
        return new C6016v(this, EnumC5931d3.f37658t, 2);
    }

    @Override // j$.util.stream.F
    public final F peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new C6036z(this, doubleConsumer);
    }

    @Override // j$.util.stream.F
    public final F limit(long j8) {
        if (j8 < 0) {
            throw new IllegalArgumentException(Long.toString(j8));
        }
        return AbstractC6032y0.W(this, 0L, j8);
    }

    @Override // j$.util.stream.F
    public final F skip(long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? this : AbstractC6032y0.W(this, j8, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.F
    public final F a() {
        int i8 = l4.f37737a;
        Objects.requireNonNull(null);
        return new Z3(this, l4.f37737a, 0);
    }

    @Override // j$.util.stream.F
    public final F c() {
        int i8 = l4.f37737a;
        Objects.requireNonNull(null);
        return new b4(this, l4.f37738b, 0);
    }

    @Override // j$.util.stream.F
    public final F distinct() {
        return ((AbstractC5945g2) boxed()).distinct().mapToDouble(new r(0));
    }

    @Override // j$.util.stream.F
    public final double sum() {
        double[] dArr = (double[]) collect(new r(3), new C5962k(5), new C5962k(2));
        Set set = Collectors.f37439a;
        double d8 = dArr[0] + dArr[1];
        double d9 = dArr[dArr.length - 1];
        return (Double.isNaN(d8) && Double.isInfinite(d9)) ? d9 : d8;
    }

    @Override // j$.util.stream.F
    public final j$.util.B min() {
        return reduce(new C5962k(25));
    }

    @Override // j$.util.stream.F
    public final j$.util.B max() {
        return reduce(new r(2));
    }

    @Override // j$.util.stream.F
    public final j$.util.B average() {
        double[] dArr = (double[]) collect(new C5962k(26), new C5962k(3), new C5962k(4));
        if (dArr[2] <= 0.0d) {
            return j$.util.B.a();
        }
        Set set = Collectors.f37439a;
        double d8 = dArr[0] + dArr[1];
        double d9 = dArr[dArr.length - 1];
        if (Double.isNaN(d8) && Double.isInfinite(d9)) {
            d8 = d9;
        }
        return j$.util.B.d(d8 / dArr[2]);
    }

    @Override // j$.util.stream.F
    public final C6045x summaryStatistics() {
        return (C6045x) collect(new C5962k(18), new C5962k(27), new C5962k(28));
    }

    @Override // j$.util.stream.F
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C6001s c6001s = new C6001s(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(c6001s);
        return C(new E1(EnumC5936e3.DOUBLE_VALUE, c6001s, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.F
    public final boolean o() {
        return ((Boolean) C(AbstractC6032y0.X(EnumC6017v0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.F
    public final boolean h() {
        return ((Boolean) C(AbstractC6032y0.X(EnumC6017v0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.F
    public final boolean x() {
        return ((Boolean) C(AbstractC6032y0.X(EnumC6017v0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.F
    public final double[] toArray() {
        return (double[]) AbstractC6032y0.O((E0) D(new r(1))).d();
    }

    @Override // j$.util.stream.F
    public final double reduce(double d8, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) C(new I1(EnumC5936e3.DOUBLE_VALUE, doubleBinaryOperator, d8))).doubleValue();
    }

    @Override // j$.util.stream.F
    public final j$.util.B reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.B) C(new C1(EnumC5936e3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.F
    public final long count() {
        return ((Long) C(new G1(1))).longValue();
    }
}
