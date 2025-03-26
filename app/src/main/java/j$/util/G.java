package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class G implements PrimitiveIterator.OfDouble {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f37253a;

    private /* synthetic */ G(H h8) {
        this.f37253a = h8;
    }

    public static /* synthetic */ PrimitiveIterator.OfDouble a(H h8) {
        if (h8 == null) {
            return null;
        }
        return h8 instanceof F ? ((F) h8).f37252a : new G(h8);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        H h8 = this.f37253a;
        if (obj instanceof G) {
            obj = ((G) obj).f37253a;
        }
        return h8.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f37253a.forEachRemaining((Object) doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f37253a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f37253a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f37253a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f37253a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f37253a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f37253a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return this.f37253a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f37253a.remove();
    }
}
