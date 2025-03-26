package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
final class m0 extends AbstractC5897d implements V {
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

    @Override // j$.util.AbstractC5897d, j$.util.V, j$.util.e0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ V trySplit() {
        return null;
    }

    @Override // j$.util.AbstractC5897d, j$.util.V, j$.util.e0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ e0 trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.V
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return false;
    }

    @Override // j$.util.V
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
    }
}
