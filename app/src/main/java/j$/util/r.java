package j$.util;

import java.util.Map;

/* loaded from: classes3.dex */
final class r implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    private Map.Entry f37413a;

    r(Map.Entry entry) {
        this.f37413a = (Map.Entry) Objects.requireNonNull(entry);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f37413a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f37413a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f37413a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = this.f37413a;
        Object key = entry2.getKey();
        Object key2 = entry.getKey();
        if (key == null) {
            equals = key2 == null;
        } else {
            equals = key.equals(key2);
        }
        if (equals) {
            Object value = entry2.getValue();
            Object value2 = entry.getValue();
            if (value == null) {
                equals2 = value2 == null;
            } else {
                equals2 = value.equals(value2);
            }
            if (equals2) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f37413a.toString();
    }
}
