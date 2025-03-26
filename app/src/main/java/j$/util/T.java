package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class T implements V {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfDouble f37268a;

    private /* synthetic */ T(Spliterator.OfDouble ofDouble) {
        this.f37268a = ofDouble;
    }

    public static /* synthetic */ V a(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof U ? ((U) ofDouble).f37269a : new T(ofDouble);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f37268a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfDouble ofDouble = this.f37268a;
        if (obj instanceof T) {
            obj = ((T) obj).f37268a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f37268a.estimateSize();
    }

    @Override // j$.util.e0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f37268a.forEachRemaining((Spliterator.OfDouble) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f37268a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.V
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f37268a.forEachRemaining(doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f37268a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f37268a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return this.f37268a.hasCharacteristics(i8);
    }

    public final /* synthetic */ int hashCode() {
        return this.f37268a.hashCode();
    }

    @Override // j$.util.e0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f37268a.tryAdvance((Spliterator.OfDouble) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f37268a.tryAdvance((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.V
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f37268a.tryAdvance(doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return f0.a(this.f37268a.trySplit());
    }

    @Override // j$.util.V, j$.util.e0, j$.util.Spliterator
    public final /* synthetic */ V trySplit() {
        return a(this.f37268a.trySplit());
    }

    @Override // j$.util.e0, j$.util.Spliterator
    public final /* synthetic */ e0 trySplit() {
        return c0.a(this.f37268a.trySplit());
    }
}
