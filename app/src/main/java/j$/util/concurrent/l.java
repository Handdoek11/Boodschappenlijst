package j$.util.concurrent;

import java.util.Map;

/* loaded from: classes3.dex */
class l implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    final int f37321a;

    /* renamed from: b, reason: collision with root package name */
    final Object f37322b;

    /* renamed from: c, reason: collision with root package name */
    volatile Object f37323c;

    /* renamed from: d, reason: collision with root package name */
    volatile l f37324d;

    l(int i8, Object obj, Object obj2) {
        this.f37321a = i8;
        this.f37322b = obj;
        this.f37323c = obj2;
    }

    l(int i8, Object obj, Object obj2, l lVar) {
        this(i8, obj, obj2);
        this.f37324d = lVar;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f37322b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f37323c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f37322b.hashCode() ^ this.f37323c.hashCode();
    }

    public final String toString() {
        return u.b(this.f37322b, this.f37323c);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f37322b) || key.equals(obj2)) && (value == (obj3 = this.f37323c) || value.equals(obj3));
    }

    l a(int i8, Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        l lVar = this;
        do {
            if (lVar.f37321a == i8 && ((obj2 = lVar.f37322b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return lVar;
            }
            lVar = lVar.f37324d;
        } while (lVar != null);
        return null;
    }
}
