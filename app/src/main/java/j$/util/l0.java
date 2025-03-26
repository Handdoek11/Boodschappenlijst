package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
final class l0 implements V {

    /* renamed from: a, reason: collision with root package name */
    private final double[] f37399a;

    /* renamed from: b, reason: collision with root package name */
    private int f37400b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37401c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37402d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC5897d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC5897d.e(this, i8);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5897d.f(this, consumer);
    }

    public l0(double[] dArr, int i8, int i9, int i10) {
        this.f37399a = dArr;
        this.f37400b = i8;
        this.f37401c = i9;
        this.f37402d = i10 | 16448;
    }

    @Override // j$.util.e0, j$.util.Spliterator
    public final V trySplit() {
        int i8 = this.f37400b;
        int i9 = (this.f37401c + i8) >>> 1;
        if (i8 >= i9) {
            return null;
        }
        this.f37400b = i9;
        return new l0(this.f37399a, i8, i9, this.f37402d);
    }

    @Override // j$.util.e0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i8;
        doubleConsumer.getClass();
        double[] dArr = this.f37399a;
        int length = dArr.length;
        int i9 = this.f37401c;
        if (length < i9 || (i8 = this.f37400b) < 0) {
            return;
        }
        this.f37400b = i9;
        if (i8 < i9) {
            do {
                doubleConsumer.accept(dArr[i8]);
                i8++;
            } while (i8 < i9);
        }
    }

    @Override // j$.util.e0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i8 = this.f37400b;
        if (i8 < 0 || i8 >= this.f37401c) {
            return false;
        }
        this.f37400b = i8 + 1;
        doubleConsumer.accept(this.f37399a[i8]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37401c - this.f37400b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f37402d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC5897d.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
