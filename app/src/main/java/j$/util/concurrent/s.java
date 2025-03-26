package j$.util.concurrent;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
final class s extends b implements Collection {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(Collection.CC.$default$parallelStream(this));
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(Collection.CC.$default$stream(this));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f37311a.containsValue(obj);
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean remove(Object obj) {
        AbstractC5896a abstractC5896a;
        if (obj == null) {
            return false;
        }
        Object it = iterator();
        do {
            abstractC5896a = (AbstractC5896a) it;
            if (!abstractC5896a.hasNext()) {
                return false;
            }
        } while (!obj.equals(((h) it).next()));
        abstractC5896a.remove();
        return true;
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f37311a;
        l[] lVarArr = concurrentHashMap.f37296a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new h(lVarArr, length, length, concurrentHashMap, 1);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        Object it = iterator();
        boolean z7 = false;
        while (true) {
            AbstractC5896a abstractC5896a = (AbstractC5896a) it;
            if (!abstractC5896a.hasNext()) {
                return z7;
            }
            if (collection.contains(((h) it).next())) {
                abstractC5896a.remove();
                z7 = true;
            }
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        ConcurrentHashMap concurrentHashMap = this.f37311a;
        concurrentHashMap.getClass();
        predicate.getClass();
        l[] lVarArr = concurrentHashMap.f37296a;
        boolean z7 = false;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a8 = pVar.a();
                if (a8 == null) {
                    break;
                }
                Object obj = a8.f37322b;
                Object obj2 = a8.f37323c;
                if (predicate.test(obj2) && concurrentHashMap.g(obj, null, obj2) != null) {
                    z7 = true;
                }
            }
        }
        return z7;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
    public final j$.util.Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f37311a;
        long j8 = concurrentHashMap.j();
        l[] lVarArr = concurrentHashMap.f37296a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new j(lVarArr, length, 0, length, j8 < 0 ? 0L : j8, 1);
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        l[] lVarArr = this.f37311a.f37296a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l a8 = pVar.a();
            if (a8 == null) {
                return;
            } else {
                consumer.p(a8.f37323c);
            }
        }
    }
}
