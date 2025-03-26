package j$.util;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Spliterator.OfPrimitive {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f37358a;

    private /* synthetic */ d0(e0 e0Var) {
        this.f37358a = e0Var;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(e0 e0Var) {
        if (e0Var == null) {
            return null;
        }
        return e0Var instanceof c0 ? ((c0) e0Var).f37282a : e0Var instanceof V ? U.a((V) e0Var) : e0Var instanceof Y ? X.a((Y) e0Var) : e0Var instanceof b0 ? a0.a((b0) e0Var) : new d0(e0Var);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f37358a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        e0 e0Var = this.f37358a;
        if (obj instanceof d0) {
            obj = ((d0) obj).f37358a;
        }
        return e0Var.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f37358a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f37358a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f37358a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f37358a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f37358a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return this.f37358a.hasCharacteristics(i8);
    }

    public final /* synthetic */ int hashCode() {
        return this.f37358a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f37358a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f37358a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return a(this.f37358a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f37358a.trySplit());
    }
}
