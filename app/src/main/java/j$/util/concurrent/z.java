package j$.util.concurrent;

import j$.util.AbstractC5897d;
import j$.util.Y;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class z implements Y {

    /* renamed from: a, reason: collision with root package name */
    long f37354a;

    /* renamed from: b, reason: collision with root package name */
    final long f37355b;

    /* renamed from: c, reason: collision with root package name */
    final int f37356c;

    /* renamed from: d, reason: collision with root package name */
    final int f37357d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5897d.b(this, consumer);
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
        return AbstractC5897d.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    z(long j8, long j9, int i8, int i9) {
        this.f37354a = j8;
        this.f37355b = j9;
        this.f37356c = i8;
        this.f37357d = i9;
    }

    @Override // j$.util.e0, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z trySplit() {
        long j8 = this.f37354a;
        long j9 = (this.f37355b + j8) >>> 1;
        if (j9 <= j8) {
            return null;
        }
        this.f37354a = j9;
        return new z(j8, j9, this.f37356c, this.f37357d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37355b - this.f37354a;
    }

    @Override // j$.util.e0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j8 = this.f37354a;
        if (j8 >= this.f37355b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().d(this.f37356c, this.f37357d));
        this.f37354a = j8 + 1;
        return true;
    }

    @Override // j$.util.e0
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j8 = this.f37354a;
        long j9 = this.f37355b;
        if (j8 < j9) {
            this.f37354a = j9;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                intConsumer.accept(current.d(this.f37356c, this.f37357d));
                j8++;
            } while (j8 < j9);
        }
    }
}
