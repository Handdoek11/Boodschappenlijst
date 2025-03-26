package j$.util.concurrent;

import java.util.Map;

/* loaded from: classes3.dex */
final class k implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    final Object f37318a;

    /* renamed from: b, reason: collision with root package name */
    Object f37319b;

    /* renamed from: c, reason: collision with root package name */
    final ConcurrentHashMap f37320c;

    k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f37318a = obj;
        this.f37319b = obj2;
        this.f37320c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f37318a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f37319b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f37318a.hashCode() ^ this.f37319b.hashCode();
    }

    public final String toString() {
        return u.b(this.f37318a, this.f37319b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f37318a) || key.equals(obj2)) && (value == (obj3 = this.f37319b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f37319b;
        this.f37319b = obj;
        this.f37320c.put(this.f37318a, obj);
        return obj2;
    }
}
