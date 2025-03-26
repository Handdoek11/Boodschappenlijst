package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class J implements L, InterfaceC6047z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfInt f37255a;

    private /* synthetic */ J(PrimitiveIterator.OfInt ofInt) {
        this.f37255a = ofInt;
    }

    public static /* synthetic */ L a(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof K ? ((K) ofInt).f37256a : new J(ofInt);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.f37255a;
        if (obj instanceof J) {
            obj = ((J) obj).f37255a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.Q
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f37255a.forEachRemaining((PrimitiveIterator.OfInt) obj);
    }

    @Override // j$.util.L, java.util.Iterator, j$.util.InterfaceC6047z
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f37255a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.L
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f37255a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f37255a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f37255a.hashCode();
    }

    @Override // j$.util.L, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f37255a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f37255a.next();
    }

    @Override // j$.util.L
    public final /* synthetic */ int nextInt() {
        return this.f37255a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f37255a.remove();
    }
}
