package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class W implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfInt f37270a;

    private /* synthetic */ W(Spliterator.OfInt ofInt) {
        this.f37270a = ofInt;
    }

    public static /* synthetic */ Y a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof X ? ((X) ofInt).f37271a : new W(ofInt);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f37270a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofInt = this.f37270a;
        if (obj instanceof W) {
            obj = ((W) obj).f37270a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f37270a.estimateSize();
    }

    @Override // j$.util.e0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f37270a.forEachRemaining((Spliterator.OfInt) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f37270a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.Y
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f37270a.forEachRemaining(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f37270a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f37270a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return this.f37270a.hasCharacteristics(i8);
    }

    public final /* synthetic */ int hashCode() {
        return this.f37270a.hashCode();
    }

    @Override // j$.util.e0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f37270a.tryAdvance((Spliterator.OfInt) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f37270a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.Y
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f37270a.tryAdvance(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return f0.a(this.f37270a.trySplit());
    }

    @Override // j$.util.Y, j$.util.e0, j$.util.Spliterator
    public final /* synthetic */ Y trySplit() {
        return a(this.f37270a.trySplit());
    }

    @Override // j$.util.e0, j$.util.Spliterator
    public final /* synthetic */ e0 trySplit() {
        return c0.a(this.f37270a.trySplit());
    }
}
