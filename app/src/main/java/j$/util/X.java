package j$.util;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class X implements Spliterator.OfInt {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y f37271a;

    private /* synthetic */ X(Y y7) {
        this.f37271a = y7;
    }

    public static /* synthetic */ Spliterator.OfInt a(Y y7) {
        if (y7 == null) {
            return null;
        }
        return y7 instanceof W ? ((W) y7).f37270a : new X(y7);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f37271a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Y y7 = this.f37271a;
        if (obj instanceof X) {
            obj = ((X) obj).f37271a;
        }
        return y7.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f37271a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f37271a.forEachRemaining((Object) intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f37271a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfInt
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f37271a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f37271a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f37271a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return this.f37271a.hasCharacteristics(i8);
    }

    public final /* synthetic */ int hashCode() {
        return this.f37271a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f37271a.tryAdvance((Object) intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f37271a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfInt
    /* renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(IntConsumer intConsumer) {
        return this.f37271a.tryAdvance(intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfInt trySplit() {
        return a(this.f37271a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return d0.a(this.f37271a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f37271a.trySplit());
    }
}
