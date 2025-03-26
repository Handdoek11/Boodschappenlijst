package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5911s implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    final Spliterator f37419a;

    C5911s(Spliterator spliterator) {
        this.f37419a = spliterator;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return this.f37419a.tryAdvance(new C5910q(consumer));
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.f37419a.forEachRemaining(new C5910q(consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.f37419a.trySplit();
        if (trySplit == null) {
            return null;
        }
        return new C5911s(trySplit);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37419a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.f37419a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f37419a.characteristics();
    }

    @Override // j$.util.Spliterator
    public final boolean hasCharacteristics(int i8) {
        return this.f37419a.hasCharacteristics(i8);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f37419a.getComparator();
    }
}
