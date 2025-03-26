package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class N implements P, InterfaceC6047z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfLong f37258a;

    private /* synthetic */ N(PrimitiveIterator.OfLong ofLong) {
        this.f37258a = ofLong;
    }

    public static /* synthetic */ P a(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof O ? ((O) ofLong).f37259a : new N(ofLong);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.f37258a;
        if (obj instanceof N) {
            obj = ((N) obj).f37258a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.Q
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f37258a.forEachRemaining((PrimitiveIterator.OfLong) obj);
    }

    @Override // j$.util.P, java.util.Iterator, j$.util.InterfaceC6047z
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f37258a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.P
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f37258a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f37258a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f37258a.hashCode();
    }

    @Override // j$.util.P, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f37258a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f37258a.next();
    }

    @Override // j$.util.P
    public final /* synthetic */ long nextLong() {
        return this.f37258a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f37258a.remove();
    }
}
