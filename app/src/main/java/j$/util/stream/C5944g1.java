package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.g1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C5944g1 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    final int[] f37700a;

    /* renamed from: b, reason: collision with root package name */
    int f37701b;

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC6032y0.r(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j9, IntFunction intFunction) {
        return AbstractC6032y0.u(this, j8, j9);
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
        AbstractC6032y0.o(this, (Integer[]) objArr, i8);
    }

    @Override // j$.util.stream.J0
    public final void e(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i8 = 0; i8 < this.f37701b; i8++) {
            intConsumer.accept(this.f37700a[i8]);
        }
    }

    @Override // j$.util.stream.J0
    public final void r(int i8, Object obj) {
        int i9 = this.f37701b;
        System.arraycopy(this.f37700a, 0, (int[]) obj, i8, i9);
    }

    C5944g1(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f37700a = new int[(int) j8];
        this.f37701b = 0;
    }

    C5944g1(int[] iArr) {
        this.f37700a = iArr;
        this.f37701b = iArr.length;
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.k(this.f37700a, 0, this.f37701b);
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final j$.util.e0 spliterator() {
        return Spliterators.k(this.f37700a, 0, this.f37701b);
    }

    @Override // j$.util.stream.J0
    public final Object d() {
        int[] iArr = this.f37700a;
        int length = iArr.length;
        int i8 = this.f37701b;
        return length == i8 ? iArr : Arrays.copyOf(iArr, i8);
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f37701b;
    }

    public String toString() {
        int[] iArr = this.f37700a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f37701b), Arrays.toString(iArr));
    }
}
