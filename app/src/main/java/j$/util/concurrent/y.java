package j$.util.concurrent;

import j$.util.AbstractC5897d;
import j$.util.V;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
final class y implements V {

    /* renamed from: a, reason: collision with root package name */
    long f37350a;

    /* renamed from: b, reason: collision with root package name */
    final long f37351b;

    /* renamed from: c, reason: collision with root package name */
    final double f37352c;

    /* renamed from: d, reason: collision with root package name */
    final double f37353d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

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

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    y(long j8, long j9, double d8, double d9) {
        this.f37350a = j8;
        this.f37351b = j9;
        this.f37352c = d8;
        this.f37353d = d9;
    }

    @Override // j$.util.e0, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y trySplit() {
        long j8 = this.f37350a;
        long j9 = (this.f37351b + j8) >>> 1;
        if (j9 <= j8) {
            return null;
        }
        this.f37350a = j9;
        return new y(j8, j9, this.f37352c, this.f37353d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37351b - this.f37350a;
    }

    @Override // j$.util.e0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j8 = this.f37350a;
        if (j8 >= this.f37351b) {
            return false;
        }
        doubleConsumer.accept(ThreadLocalRandom.current().c(this.f37352c, this.f37353d));
        this.f37350a = j8 + 1;
        return true;
    }

    @Override // j$.util.e0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j8 = this.f37350a;
        long j9 = this.f37351b;
        if (j8 < j9) {
            this.f37350a = j9;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(current.c(this.f37352c, this.f37353d));
                j8++;
            } while (j8 < j9);
        }
    }
}
