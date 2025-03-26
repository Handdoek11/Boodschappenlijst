package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class O implements PrimitiveIterator.OfLong {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P f37259a;

    private /* synthetic */ O(P p8) {
        this.f37259a = p8;
    }

    public static /* synthetic */ PrimitiveIterator.OfLong a(P p8) {
        if (p8 == null) {
            return null;
        }
        return p8 instanceof N ? ((N) p8).f37258a : new O(p8);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        P p8 = this.f37259a;
        if (obj instanceof O) {
            obj = ((O) obj).f37259a;
        }
        return p8.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f37259a.forEachRemaining((Object) longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f37259a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f37259a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f37259a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f37259a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f37259a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f37259a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return this.f37259a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f37259a.remove();
    }
}
