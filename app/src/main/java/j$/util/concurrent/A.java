package j$.util.concurrent;

import j$.util.AbstractC5897d;
import j$.util.b0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class A implements b0 {

    /* renamed from: a, reason: collision with root package name */
    long f37283a;

    /* renamed from: b, reason: collision with root package name */
    final long f37284b;

    /* renamed from: c, reason: collision with root package name */
    final long f37285c;

    /* renamed from: d, reason: collision with root package name */
    final long f37286d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

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

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    A(long j8, long j9, long j10, long j11) {
        this.f37283a = j8;
        this.f37284b = j9;
        this.f37285c = j10;
        this.f37286d = j11;
    }

    @Override // j$.util.e0, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A trySplit() {
        long j8 = this.f37283a;
        long j9 = (this.f37284b + j8) >>> 1;
        if (j9 <= j8) {
            return null;
        }
        this.f37283a = j9;
        return new A(j8, j9, this.f37285c, this.f37286d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37284b - this.f37283a;
    }

    @Override // j$.util.e0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j8 = this.f37283a;
        if (j8 >= this.f37284b) {
            return false;
        }
        longConsumer.accept(ThreadLocalRandom.current().e(this.f37285c, this.f37286d));
        this.f37283a = j8 + 1;
        return true;
    }

    @Override // j$.util.e0
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j8 = this.f37283a;
        long j9 = this.f37284b;
        if (j8 < j9) {
            this.f37283a = j9;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                longConsumer.accept(current.e(this.f37285c, this.f37286d));
                j8++;
            } while (j8 < j9);
        }
    }
}
