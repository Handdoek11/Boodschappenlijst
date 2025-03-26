package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfPrimitive f37282a;

    private /* synthetic */ c0(Spliterator.OfPrimitive ofPrimitive) {
        this.f37282a = ofPrimitive;
    }

    public static /* synthetic */ e0 a(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        return ofPrimitive instanceof d0 ? ((d0) ofPrimitive).f37358a : ofPrimitive instanceof Spliterator.OfDouble ? T.a((Spliterator.OfDouble) ofPrimitive) : ofPrimitive instanceof Spliterator.OfInt ? W.a((Spliterator.OfInt) ofPrimitive) : ofPrimitive instanceof Spliterator.OfLong ? Z.a((Spliterator.OfLong) ofPrimitive) : new c0(ofPrimitive);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f37282a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfPrimitive ofPrimitive = this.f37282a;
        if (obj instanceof c0) {
            obj = ((c0) obj).f37282a;
        }
        return ofPrimitive.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f37282a.estimateSize();
    }

    @Override // j$.util.e0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f37282a.forEachRemaining((Spliterator.OfPrimitive) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f37282a.forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f37282a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f37282a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return this.f37282a.hasCharacteristics(i8);
    }

    public final /* synthetic */ int hashCode() {
        return this.f37282a.hashCode();
    }

    @Override // j$.util.e0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f37282a.tryAdvance((Spliterator.OfPrimitive) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f37282a.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return f0.a(this.f37282a.trySplit());
    }

    @Override // j$.util.e0, j$.util.Spliterator
    public final /* synthetic */ e0 trySplit() {
        return a(this.f37282a.trySplit());
    }
}
