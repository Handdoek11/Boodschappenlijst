package j$.util.stream;

import j$.util.Collection;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
final class O0 implements K0 {

    /* renamed from: a, reason: collision with root package name */
    private final Collection f37529a;

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j9, IntFunction intFunction) {
        return AbstractC6032y0.w(this, j8, j9, intFunction);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final K0 b(int i8) {
        throw new IndexOutOfBoundsException();
    }

    O0(Collection collection) {
        this.f37529a = collection;
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Collection.EL.stream(this.f37529a).spliterator();
    }

    @Override // j$.util.stream.K0
    public final void i(Object[] objArr, int i8) {
        Iterator it = this.f37529a.iterator();
        while (it.hasNext()) {
            objArr[i8] = it.next();
            i8++;
        }
    }

    @Override // j$.util.stream.K0
    public final Object[] o(IntFunction intFunction) {
        java.util.Collection collection = this.f37529a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f37529a.size();
    }

    @Override // j$.util.stream.K0
    public final void forEach(Consumer consumer) {
        Collection.EL.a(this.f37529a, consumer);
    }

    public final String toString() {
        java.util.Collection collection = this.f37529a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
