package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.x3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6030x3 extends AbstractC6035y3 implements Spliterator {
    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC5897d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC5897d.e(this, i8);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    C6030x3(Spliterator spliterator, long j8, long j9) {
        super(spliterator, j8, j9, 0L, Math.min(spliterator.estimateSize(), j9));
    }

    @Override // j$.util.stream.AbstractC6035y3
    protected final Spliterator a(Spliterator spliterator, long j8, long j9, long j10, long j11) {
        return new C6030x3(spliterator, j8, j9, j10, j11);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        long j8;
        Objects.requireNonNull(consumer);
        long j9 = this.f37843e;
        long j10 = this.f37839a;
        if (j10 >= j9) {
            return false;
        }
        while (true) {
            j8 = this.f37842d;
            if (j10 <= j8) {
                break;
            }
            this.f37841c.tryAdvance(new C5933e0(7));
            this.f37842d++;
        }
        if (j8 >= this.f37843e) {
            return false;
        }
        this.f37842d = j8 + 1;
        return this.f37841c.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j8 = this.f37843e;
        long j9 = this.f37839a;
        if (j9 >= j8) {
            return;
        }
        long j10 = this.f37842d;
        if (j10 >= j8) {
            return;
        }
        if (j10 >= j9 && this.f37841c.estimateSize() + j10 <= this.f37840b) {
            this.f37841c.forEachRemaining(consumer);
            this.f37842d = this.f37843e;
            return;
        }
        while (j9 > this.f37842d) {
            this.f37841c.tryAdvance(new C5933e0(8));
            this.f37842d++;
        }
        while (this.f37842d < this.f37843e) {
            this.f37841c.tryAdvance(consumer);
            this.f37842d++;
        }
    }
}
