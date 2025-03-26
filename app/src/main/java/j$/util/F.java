package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class F implements H, InterfaceC6047z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfDouble f37252a;

    private /* synthetic */ F(PrimitiveIterator.OfDouble ofDouble) {
        this.f37252a = ofDouble;
    }

    public static /* synthetic */ H a(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof G ? ((G) ofDouble).f37253a : new F(ofDouble);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDouble = this.f37252a;
        if (obj instanceof F) {
            obj = ((F) obj).f37252a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.Q
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f37252a.forEachRemaining((PrimitiveIterator.OfDouble) obj);
    }

    @Override // j$.util.H, java.util.Iterator, j$.util.InterfaceC6047z
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f37252a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.H
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f37252a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f37252a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f37252a.hashCode();
    }

    @Override // j$.util.H, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f37252a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f37252a.next();
    }

    @Override // j$.util.H
    public final /* synthetic */ double nextDouble() {
        return this.f37252a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f37252a.remove();
    }
}
