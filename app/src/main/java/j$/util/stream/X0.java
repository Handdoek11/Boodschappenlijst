package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
class X0 implements E0 {

    /* renamed from: a, reason: collision with root package name */
    final double[] f37601a;

    /* renamed from: b, reason: collision with root package name */
    int f37602b;

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC6032y0.q(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j9, IntFunction intFunction) {
        return AbstractC6032y0.t(this, j8, j9);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC6032y0.m(this, intFunction);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final /* bridge */ /* synthetic */ K0 b(int i8) {
        b(i8);
        throw null;
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final J0 b(int i8) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void i(Object[] objArr, int i8) {
        AbstractC6032y0.n(this, (Double[]) objArr, i8);
    }

    @Override // j$.util.stream.J0
    public final void e(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i8 = 0; i8 < this.f37602b; i8++) {
            doubleConsumer.accept(this.f37601a[i8]);
        }
    }

    @Override // j$.util.stream.J0
    public final void r(int i8, Object obj) {
        int i9 = this.f37602b;
        System.arraycopy(this.f37601a, 0, (double[]) obj, i8, i9);
    }

    X0(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f37601a = new double[(int) j8];
        this.f37602b = 0;
    }

    X0(double[] dArr) {
        this.f37601a = dArr;
        this.f37602b = dArr.length;
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.j(this.f37601a, 0, this.f37602b);
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final j$.util.e0 spliterator() {
        return Spliterators.j(this.f37601a, 0, this.f37602b);
    }

    @Override // j$.util.stream.J0
    public final Object d() {
        double[] dArr = this.f37601a;
        int length = dArr.length;
        int i8 = this.f37602b;
        return length == i8 ? dArr : Arrays.copyOf(dArr, i8);
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f37602b;
    }

    public String toString() {
        double[] dArr = this.f37601a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f37602b), Arrays.toString(dArr));
    }
}
