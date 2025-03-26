package j$.util;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class U implements Spliterator.OfDouble {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f37269a;

    private /* synthetic */ U(V v7) {
        this.f37269a = v7;
    }

    public static /* synthetic */ Spliterator.OfDouble a(V v7) {
        if (v7 == null) {
            return null;
        }
        return v7 instanceof T ? ((T) v7).f37268a : new U(v7);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f37269a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        V v7 = this.f37269a;
        if (obj instanceof U) {
            obj = ((U) obj).f37269a;
        }
        return v7.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f37269a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f37269a.forEachRemaining((Object) doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f37269a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfDouble
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f37269a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f37269a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f37269a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return this.f37269a.hasCharacteristics(i8);
    }

    public final /* synthetic */ int hashCode() {
        return this.f37269a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f37269a.tryAdvance((Object) doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f37269a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfDouble
    /* renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(DoubleConsumer doubleConsumer) {
        return this.f37269a.tryAdvance(doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfDouble trySplit() {
        return a(this.f37269a.trySplit());
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return d0.a(this.f37269a.trySplit());
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f37269a.trySplit());
    }
}
