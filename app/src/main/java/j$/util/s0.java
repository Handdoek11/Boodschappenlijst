package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class s0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f37420a;

    /* renamed from: b, reason: collision with root package name */
    private int f37421b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37422c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37423d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.c(this, consumer);
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
        return AbstractC5897d.h(this, consumer);
    }

    public s0(long[] jArr, int i8, int i9, int i10) {
        this.f37420a = jArr;
        this.f37421b = i8;
        this.f37422c = i9;
        this.f37423d = i10 | 16448;
    }

    @Override // j$.util.e0, j$.util.Spliterator
    public final b0 trySplit() {
        int i8 = this.f37421b;
        int i9 = (this.f37422c + i8) >>> 1;
        if (i8 >= i9) {
            return null;
        }
        this.f37421b = i9;
        return new s0(this.f37420a, i8, i9, this.f37423d);
    }

    @Override // j$.util.e0
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i8;
        longConsumer.getClass();
        long[] jArr = this.f37420a;
        int length = jArr.length;
        int i9 = this.f37422c;
        if (length < i9 || (i8 = this.f37421b) < 0) {
            return;
        }
        this.f37421b = i9;
        if (i8 < i9) {
            do {
                longConsumer.accept(jArr[i8]);
                i8++;
            } while (i8 < i9);
        }
    }

    @Override // j$.util.e0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i8 = this.f37421b;
        if (i8 < 0 || i8 >= this.f37422c) {
            return false;
        }
        this.f37421b = i8 + 1;
        longConsumer.accept(this.f37420a[i8]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37422c - this.f37421b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f37423d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC5897d.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
