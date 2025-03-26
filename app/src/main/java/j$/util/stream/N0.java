package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
class N0 implements K0 {

    /* renamed from: a, reason: collision with root package name */
    final Object[] f37520a;

    /* renamed from: b, reason: collision with root package name */
    int f37521b;

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j9, IntFunction intFunction) {
        return AbstractC6032y0.w(this, j8, j9, intFunction);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final K0 b(int i8) {
        throw new IndexOutOfBoundsException();
    }

    N0(long j8, IntFunction intFunction) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f37520a = (Object[]) intFunction.apply((int) j8);
        this.f37521b = 0;
    }

    N0(Object[] objArr) {
        this.f37520a = objArr;
        this.f37521b = objArr.length;
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.m(this.f37520a, 0, this.f37521b);
    }

    @Override // j$.util.stream.K0
    public final void i(Object[] objArr, int i8) {
        System.arraycopy(this.f37520a, 0, objArr, i8, this.f37521b);
    }

    @Override // j$.util.stream.K0
    public final Object[] o(IntFunction intFunction) {
        Object[] objArr = this.f37520a;
        if (objArr.length == this.f37521b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f37521b;
    }

    @Override // j$.util.stream.K0
    public final void forEach(Consumer consumer) {
        for (int i8 = 0; i8 < this.f37521b; i8++) {
            consumer.p(this.f37520a[i8]);
        }
    }

    public String toString() {
        Object[] objArr = this.f37520a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f37521b), Arrays.toString(objArr));
    }
}
