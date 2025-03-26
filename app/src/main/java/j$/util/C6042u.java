package j$.util;

import j$.util.Map;
import java.io.Serializable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: j$.util.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6042u implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = -1034234728574286014L;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map f37852a;

    /* renamed from: b, reason: collision with root package name */
    private transient java.util.Set f37853b;

    /* renamed from: c, reason: collision with root package name */
    private transient java.util.Set f37854c;

    /* renamed from: d, reason: collision with root package name */
    private transient java.util.Collection f37855d;

    C6042u(java.util.Map map) {
        map.getClass();
        this.f37852a = map;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f37852a.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f37852a.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f37852a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f37852a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f37852a.get(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        if (this.f37853b == null) {
            this.f37853b = DesugarCollections.unmodifiableSet(this.f37852a.keySet());
        }
        return this.f37853b;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        if (this.f37854c == null) {
            this.f37854c = new C6041t(this.f37852a.entrySet());
        }
        return this.f37854c;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        if (this.f37855d == null) {
            this.f37855d = DesugarCollections.unmodifiableCollection(this.f37852a.values());
        }
        return this.f37855d;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || this.f37852a.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f37852a.hashCode();
    }

    public final String toString() {
        return this.f37852a.toString();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        return Map.EL.getOrDefault(this.f37852a, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        Map.EL.a(this.f37852a, biConsumer);
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }
}
