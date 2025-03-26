package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* renamed from: j$.util.stream.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC6032y0 implements J3 {

    /* renamed from: a, reason: collision with root package name */
    private static final C5929d1 f37826a = new C5929d1();

    /* renamed from: b, reason: collision with root package name */
    private static final G0 f37827b = new C5919b1();

    /* renamed from: c, reason: collision with root package name */
    private static final I0 f37828c = new C5924c1();

    /* renamed from: d, reason: collision with root package name */
    private static final E0 f37829d = new C5914a1();

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f37830e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    private static final long[] f37831f = new long[0];

    /* renamed from: g, reason: collision with root package name */
    private static final double[] f37832g = new double[0];

    static long B(long j8, long j9) {
        long j10 = j9 >= 0 ? j8 + j9 : Long.MAX_VALUE;
        if (j10 >= 0) {
            return j10;
        }
        return Long.MAX_VALUE;
    }

    @Override // j$.util.stream.J3
    public /* synthetic */ int d() {
        return 0;
    }

    public abstract U1 e0();

    public static C5912a R(Function function) {
        C5912a c5912a = new C5912a(8);
        c5912a.f37615b = function;
        return c5912a;
    }

    static long A(long j8, long j9, long j10) {
        if (j8 >= 0) {
            return Math.max(-1L, Math.min(j8 - j9, j10));
        }
        return -1L;
    }

    public static Stream f0(Spliterator spliterator, boolean z7) {
        Objects.requireNonNull(spliterator);
        return new C5935e2(spliterator, EnumC5931d3.m(spliterator), z7);
    }

    static Spliterator C(EnumC5936e3 enumC5936e3, Spliterator spliterator, long j8, long j9) {
        long j10 = j9 >= 0 ? j8 + j9 : Long.MAX_VALUE;
        long j11 = j10 >= 0 ? j10 : Long.MAX_VALUE;
        int i8 = AbstractC6029x2.f37822a[enumC5936e3.ordinal()];
        if (i8 == 1) {
            return new C6030x3(spliterator, j8, j11);
        }
        if (i8 == 2) {
            return new C6015u3((j$.util.Y) spliterator, j8, j11);
        }
        if (i8 == 3) {
            return new C6020v3((j$.util.b0) spliterator, j8, j11);
        }
        if (i8 != 4) {
            throw new IllegalStateException("Unknown shape " + enumC5936e3);
        }
        return new C6010t3((j$.util.V) spliterator, j8, j11);
    }

    public static C6022w0 c0(EnumC6017v0 enumC6017v0, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(enumC6017v0);
        return new C6022w0(EnumC5936e3.REFERENCE, enumC6017v0, new C5967l(1, enumC6017v0, predicate));
    }

    static AbstractC5934e1 L(EnumC5936e3 enumC5936e3) {
        int i8 = L0.f37501a[enumC5936e3.ordinal()];
        if (i8 == 1) {
            return f37826a;
        }
        if (i8 == 2) {
            return (AbstractC5934e1) f37827b;
        }
        if (i8 == 3) {
            return (AbstractC5934e1) f37828c;
        }
        if (i8 == 4) {
            return (AbstractC5934e1) f37829d;
        }
        throw new IllegalStateException("Unknown shape " + enumC5936e3);
    }

    public static C6022w0 Z(EnumC6017v0 enumC6017v0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC6017v0);
        return new C6022w0(EnumC5936e3.INT_VALUE, enumC6017v0, new C5988p0(enumC6017v0, 1));
    }

    public static Stream d0(AbstractC5945g2 abstractC5945g2, long j8, long j9) {
        if (j8 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j8);
        }
        return new C5995q2(abstractC5945g2, M(j9), j8, j9);
    }

    public static K0 w(K0 k02, long j8, long j9, IntFunction intFunction) {
        if (j8 == 0 && j9 == k02.count()) {
            return k02;
        }
        Spliterator spliterator = k02.spliterator();
        long j10 = j9 - j8;
        C0 D7 = D(j10, intFunction);
        D7.l(j10);
        for (int i8 = 0; i8 < j8 && spliterator.tryAdvance(new C5933e0(1)); i8++) {
        }
        if (j9 == k02.count()) {
            spliterator.forEachRemaining(D7);
        } else {
            for (int i9 = 0; i9 < j10 && spliterator.tryAdvance(D7); i9++) {
            }
        }
        D7.k();
        return D7.a();
    }

    static M0 I(EnumC5936e3 enumC5936e3, K0 k02, K0 k03) {
        int i8 = L0.f37501a[enumC5936e3.ordinal()];
        if (i8 == 1) {
            return new W0(k02, k03);
        }
        if (i8 == 2) {
            return new T0((G0) k02, (G0) k03);
        }
        if (i8 == 3) {
            return new U0((I0) k02, (I0) k03);
        }
        if (i8 != 4) {
            throw new IllegalStateException("Unknown shape " + enumC5936e3);
        }
        return new S0((E0) k02, (E0) k03);
    }

    public static IntStream T(j$.util.Y y7) {
        return new C5913a0(y7, EnumC5931d3.m(y7), false);
    }

    public static C6022w0 b0(EnumC6017v0 enumC6017v0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC6017v0);
        return new C6022w0(EnumC5936e3.LONG_VALUE, enumC6017v0, new C5988p0(enumC6017v0, 0));
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static C6022w0 X(EnumC6017v0 enumC6017v0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC6017v0);
        return new C6022w0(EnumC5936e3.DOUBLE_VALUE, enumC6017v0, new C5988p0(enumC6017v0, 2));
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    static C0 D(long j8, IntFunction intFunction) {
        if (j8 >= 0 && j8 < 2147483639) {
            return new C5939f1(j8, intFunction);
        }
        return new C6028x1();
    }

    public static void a() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void g(InterfaceC5975m2 interfaceC5975m2, Integer num) {
        if (M3.f37518a) {
            M3.a(interfaceC5975m2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC5975m2.accept(num.intValue());
    }

    public static InterfaceC5983o0 V(j$.util.b0 b0Var) {
        return new C5958j0(b0Var, EnumC5931d3.m(b0Var), false);
    }

    public static void i(InterfaceC5980n2 interfaceC5980n2, Long l8) {
        if (M3.f37518a) {
            M3.a(interfaceC5980n2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC5980n2.accept(l8.longValue());
    }

    static A0 S(long j8) {
        if (j8 < 0 || j8 >= 2147483639) {
            return new C5954i1();
        }
        return new C5949h1(j8);
    }

    public static void e(InterfaceC5970l2 interfaceC5970l2, Double d8) {
        if (M3.f37518a) {
            M3.a(interfaceC5970l2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC5970l2.accept(d8.doubleValue());
    }

    public static IntStream Y(AbstractC5923c0 abstractC5923c0, long j8, long j9) {
        if (j8 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j8);
        }
        return new C6004s2(abstractC5923c0, M(j9), j8, j9);
    }

    static B0 U(long j8) {
        if (j8 < 0 || j8 >= 2147483639) {
            return new C5998r1();
        }
        return new C5994q1(j8);
    }

    public static Object[] m(J0 j02, IntFunction intFunction) {
        if (M3.f37518a) {
            M3.a(j02.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (j02.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j02.count());
        j02.i(objArr, 0);
        return objArr;
    }

    public static F K(j$.util.V v7) {
        return new A(v7, EnumC5931d3.m(v7), false);
    }

    static InterfaceC6037z0 J(long j8) {
        if (j8 < 0 || j8 >= 2147483639) {
            return new Z0();
        }
        return new Y0(j8);
    }

    public static K0 E(AbstractC5917b abstractC5917b, Spliterator spliterator, boolean z7, IntFunction intFunction) {
        long F7 = abstractC5917b.F(spliterator);
        if (F7 < 0 || !spliterator.hasCharacteristics(16384)) {
            Q0 q02 = new Q0();
            q02.f37551a = intFunction;
            K0 k02 = (K0) new P0(abstractC5917b, spliterator, q02, new C5962k(16), 3).invoke();
            return z7 ? N(k02, intFunction) : k02;
        }
        if (F7 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) F7);
        new C6018v1(spliterator, abstractC5917b, objArr).invoke();
        return new N0(objArr);
    }

    public static void r(G0 g02, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            g02.e((IntConsumer) consumer);
        } else {
            if (M3.f37518a) {
                M3.a(g02.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.Y) g02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static InterfaceC5983o0 a0(AbstractC5968l0 abstractC5968l0, long j8, long j9) {
        if (j8 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j8);
        }
        return new C6014u2(abstractC5968l0, M(j9), j8, j9);
    }

    public static void o(G0 g02, Integer[] numArr, int i8) {
        if (M3.f37518a) {
            M3.a(g02.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) g02.d();
        for (int i9 = 0; i9 < iArr.length; i9++) {
            numArr[i8 + i9] = Integer.valueOf(iArr[i9]);
        }
    }

    public static G0 u(G0 g02, long j8, long j9) {
        if (j8 == 0 && j9 == g02.count()) {
            return g02;
        }
        long j10 = j9 - j8;
        j$.util.Y y7 = (j$.util.Y) g02.spliterator();
        A0 S7 = S(j10);
        S7.l(j10);
        for (int i8 = 0; i8 < j8 && y7.tryAdvance((IntConsumer) new F0(0)); i8++) {
        }
        if (j9 == g02.count()) {
            y7.forEachRemaining((IntConsumer) S7);
        } else {
            for (int i9 = 0; i9 < j10 && y7.tryAdvance((IntConsumer) S7); i9++) {
            }
        }
        S7.k();
        return S7.a();
    }

    public static G0 G(AbstractC5917b abstractC5917b, Spliterator spliterator, boolean z7) {
        long F7 = abstractC5917b.F(spliterator);
        if (F7 < 0 || !spliterator.hasCharacteristics(16384)) {
            G0 g02 = (G0) new P0(abstractC5917b, spliterator, new C5962k(12), new C5962k(13), 1).invoke();
            return z7 ? P(g02) : g02;
        }
        if (F7 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) F7];
        new C6008t1(spliterator, abstractC5917b, iArr).invoke();
        return new C5944g1(iArr);
    }

    public static I0 H(AbstractC5917b abstractC5917b, Spliterator spliterator, boolean z7) {
        long F7 = abstractC5917b.F(spliterator);
        if (F7 < 0 || !spliterator.hasCharacteristics(16384)) {
            I0 i02 = (I0) new P0(abstractC5917b, spliterator, new C5962k(14), new C5962k(15), 2).invoke();
            return z7 ? Q(i02) : i02;
        }
        if (F7 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) F7];
        new C6013u1(spliterator, abstractC5917b, jArr).invoke();
        return new C5989p1(jArr);
    }

    public static void s(I0 i02, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            i02.e((LongConsumer) consumer);
        } else {
            if (M3.f37518a) {
                M3.a(i02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.b0) i02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void p(I0 i02, Long[] lArr, int i8) {
        if (M3.f37518a) {
            M3.a(i02.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) i02.d();
        for (int i9 = 0; i9 < jArr.length; i9++) {
            lArr[i8 + i9] = Long.valueOf(jArr[i9]);
        }
    }

    public static I0 v(I0 i02, long j8, long j9) {
        if (j8 == 0 && j9 == i02.count()) {
            return i02;
        }
        long j10 = j9 - j8;
        j$.util.b0 b0Var = (j$.util.b0) i02.spliterator();
        B0 U7 = U(j10);
        U7.l(j10);
        for (int i8 = 0; i8 < j8 && b0Var.tryAdvance((LongConsumer) new H0(0)); i8++) {
        }
        if (j9 == i02.count()) {
            b0Var.forEachRemaining((LongConsumer) U7);
        } else {
            for (int i9 = 0; i9 < j10 && b0Var.tryAdvance((LongConsumer) U7); i9++) {
            }
        }
        U7.k();
        return U7.a();
    }

    public static E0 F(AbstractC5917b abstractC5917b, Spliterator spliterator, boolean z7) {
        long F7 = abstractC5917b.F(spliterator);
        if (F7 < 0 || !spliterator.hasCharacteristics(16384)) {
            E0 e02 = (E0) new P0(abstractC5917b, spliterator, new C5962k(10), new C5962k(11), 0).invoke();
            return z7 ? O(e02) : e02;
        }
        if (F7 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) F7];
        new C6003s1(spliterator, abstractC5917b, dArr).invoke();
        return new X0(dArr);
    }

    public static F W(C c8, long j8, long j9) {
        if (j8 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j8);
        }
        return new C6024w2(c8, M(j9), j8, j9);
    }

    public static K0 N(K0 k02, IntFunction intFunction) {
        if (k02.q() <= 0) {
            return k02;
        }
        long count = k02.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        new C6038z1(k02, objArr, 1).invoke();
        return new N0(objArr);
    }

    public static void q(E0 e02, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            e02.e((DoubleConsumer) consumer);
        } else {
            if (M3.f37518a) {
                M3.a(e02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.V) e02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static G0 P(G0 g02) {
        if (g02.q() <= 0) {
            return g02;
        }
        long count = g02.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) count];
        new C6033y1(g02, iArr, 0).invoke();
        return new C5944g1(iArr);
    }

    public static void n(E0 e02, Double[] dArr, int i8) {
        if (M3.f37518a) {
            M3.a(e02.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) e02.d();
        for (int i9 = 0; i9 < dArr2.length; i9++) {
            dArr[i8 + i9] = Double.valueOf(dArr2[i9]);
        }
    }

    public static E0 t(E0 e02, long j8, long j9) {
        if (j8 == 0 && j9 == e02.count()) {
            return e02;
        }
        long j10 = j9 - j8;
        j$.util.V v7 = (j$.util.V) e02.spliterator();
        InterfaceC6037z0 J7 = J(j10);
        J7.l(j10);
        for (int i8 = 0; i8 < j8 && v7.tryAdvance((DoubleConsumer) new D0(0)); i8++) {
        }
        if (j9 == e02.count()) {
            v7.forEachRemaining((DoubleConsumer) J7);
        } else {
            for (int i9 = 0; i9 < j10 && v7.tryAdvance((DoubleConsumer) J7); i9++) {
            }
        }
        J7.k();
        return J7.a();
    }

    public static I0 Q(I0 i02) {
        if (i02.q() <= 0) {
            return i02;
        }
        long count = i02.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) count];
        new C6033y1(i02, jArr, 0).invoke();
        return new C5989p1(jArr);
    }

    private static int M(long j8) {
        return (j8 != -1 ? EnumC5931d3.f37659u : 0) | EnumC5931d3.f37658t;
    }

    public static E0 O(E0 e02) {
        if (e02.q() <= 0) {
            return e02;
        }
        long count = e02.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) count];
        new C6033y1(e02, dArr, 0).invoke();
        return new X0(dArr);
    }

    @Override // j$.util.stream.J3
    public Object b(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        U1 e02 = e0();
        abstractC5917b.U(spliterator, e02);
        return e02.get();
    }

    @Override // j$.util.stream.J3
    public Object c(AbstractC5917b abstractC5917b, Spliterator spliterator) {
        return ((U1) new C5920b2(this, abstractC5917b, spliterator).invoke()).get();
    }
}
