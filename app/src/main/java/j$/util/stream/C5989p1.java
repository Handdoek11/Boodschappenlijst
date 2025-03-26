package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.p1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C5989p1 implements I0 {

    /* renamed from: a, reason: collision with root package name */
    final long[] f37764a;

    /* renamed from: b, reason: collision with root package name */
    int f37765b;

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC6032y0.s(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j9, IntFunction intFunction) {
        return AbstractC6032y0.v(this, j8, j9);
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
        AbstractC6032y0.p(this, (Long[]) objArr, i8);
    }

    @Override // j$.util.stream.J0
    public final void e(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i8 = 0; i8 < this.f37765b; i8++) {
            longConsumer.accept(this.f37764a[i8]);
        }
    }

    @Override // j$.util.stream.J0
    public final void r(int i8, Object obj) {
        int i9 = this.f37765b;
        System.arraycopy(this.f37764a, 0, (long[]) obj, i8, i9);
    }

    C5989p1(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f37764a = new long[(int) j8];
        this.f37765b = 0;
    }

    C5989p1(long[] jArr) {
        this.f37764a = jArr;
        this.f37765b = jArr.length;
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.l(this.f37764a, 0, this.f37765b);
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final j$.util.e0 spliterator() {
        return Spliterators.l(this.f37764a, 0, this.f37765b);
    }

    @Override // j$.util.stream.J0
    public final Object d() {
        long[] jArr = this.f37764a;
        int length = jArr.length;
        int i8 = this.f37765b;
        return length == i8 ? jArr : Arrays.copyOf(jArr, i8);
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f37765b;
    }

    public String toString() {
        long[] jArr = this.f37764a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f37765b), Arrays.toString(jArr));
    }
}
