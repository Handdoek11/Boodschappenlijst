package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.w3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC6025w3 extends AbstractC6035y3 implements j$.util.e0 {
    protected abstract Object b();

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

    AbstractC6025w3(j$.util.e0 e0Var, long j8, long j9) {
        super(e0Var, j8, j9, 0L, Math.min(e0Var.estimateSize(), j9));
    }

    @Override // j$.util.e0
    public final boolean tryAdvance(Object obj) {
        long j8;
        Objects.requireNonNull(obj);
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
            ((j$.util.e0) this.f37841c).tryAdvance(b());
            this.f37842d++;
        }
        if (j8 >= this.f37843e) {
            return false;
        }
        this.f37842d = j8 + 1;
        return ((j$.util.e0) this.f37841c).tryAdvance(obj);
    }

    @Override // j$.util.e0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        long j8 = this.f37843e;
        long j9 = this.f37839a;
        if (j9 >= j8) {
            return;
        }
        long j10 = this.f37842d;
        if (j10 >= j8) {
            return;
        }
        if (j10 >= j9 && ((j$.util.e0) this.f37841c).estimateSize() + j10 <= this.f37840b) {
            ((j$.util.e0) this.f37841c).forEachRemaining(obj);
            this.f37842d = this.f37843e;
            return;
        }
        while (j9 > this.f37842d) {
            ((j$.util.e0) this.f37841c).tryAdvance(b());
            this.f37842d++;
        }
        while (this.f37842d < this.f37843e) {
            ((j$.util.e0) this.f37841c).tryAdvance(obj);
            this.f37842d++;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
