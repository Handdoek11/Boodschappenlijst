package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class K implements PrimitiveIterator.OfInt {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L f37256a;

    private /* synthetic */ K(L l8) {
        this.f37256a = l8;
    }

    public static /* synthetic */ PrimitiveIterator.OfInt a(L l8) {
        if (l8 == null) {
            return null;
        }
        return l8 instanceof J ? ((J) l8).f37255a : new K(l8);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        L l8 = this.f37256a;
        if (obj instanceof K) {
            obj = ((K) obj).f37256a;
        }
        return l8.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f37256a.forEachRemaining((Object) intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f37256a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f37256a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f37256a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f37256a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f37256a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f37256a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return this.f37256a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f37256a.remove();
    }
}
