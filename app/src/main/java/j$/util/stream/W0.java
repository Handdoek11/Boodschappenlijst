package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
final class W0 extends M0 {
    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return new C5979n1(this);
    }

    @Override // j$.util.stream.K0
    public final void i(Object[] objArr, int i8) {
        Objects.requireNonNull(objArr);
        K0 k02 = this.f37510a;
        k02.i(objArr, i8);
        this.f37511b.i(objArr, i8 + ((int) k02.count()));
    }

    @Override // j$.util.stream.K0
    public final Object[] o(IntFunction intFunction) {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        i(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.K0
    public final void forEach(Consumer consumer) {
        this.f37510a.forEach(consumer);
        this.f37511b.forEach(consumer);
    }

    @Override // j$.util.stream.K0
    public final K0 h(long j8, long j9, IntFunction intFunction) {
        if (j8 == 0 && j9 == count()) {
            return this;
        }
        long count = this.f37510a.count();
        if (j8 >= count) {
            return this.f37511b.h(j8 - count, j9 - count, intFunction);
        }
        if (j9 > count) {
            return AbstractC6032y0.I(EnumC5936e3.REFERENCE, this.f37510a.h(j8, count, intFunction), this.f37511b.h(0L, j9 - count, intFunction));
        }
        return this.f37510a.h(j8, j9, intFunction);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f37510a, this.f37511b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
