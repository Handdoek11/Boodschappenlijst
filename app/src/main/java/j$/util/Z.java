package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class Z implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfLong f37272a;

    private /* synthetic */ Z(Spliterator.OfLong ofLong) {
        this.f37272a = ofLong;
    }

    public static /* synthetic */ b0 a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof a0 ? ((a0) ofLong).f37276a : new Z(ofLong);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f37272a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLong = this.f37272a;
        if (obj instanceof Z) {
            obj = ((Z) obj).f37272a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f37272a.estimateSize();
    }

    @Override // j$.util.e0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f37272a.forEachRemaining((Spliterator.OfLong) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f37272a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.b0
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f37272a.forEachRemaining(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f37272a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f37272a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return this.f37272a.hasCharacteristics(i8);
    }

    public final /* synthetic */ int hashCode() {
        return this.f37272a.hashCode();
    }

    @Override // j$.util.e0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f37272a.tryAdvance((Spliterator.OfLong) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f37272a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.b0
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f37272a.tryAdvance(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return f0.a(this.f37272a.trySplit());
    }

    @Override // j$.util.b0, j$.util.e0, j$.util.Spliterator
    public final /* synthetic */ b0 trySplit() {
        return a(this.f37272a.trySplit());
    }

    @Override // j$.util.e0, j$.util.Spliterator
    public final /* synthetic */ e0 trySplit() {
        return c0.a(this.f37272a.trySplit());
    }
}
