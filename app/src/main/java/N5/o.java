package N5;

import java.util.Map;

/* loaded from: classes2.dex */
final class o implements Map.Entry, K6.a {

    /* renamed from: o, reason: collision with root package name */
    private final Object f4187o;

    /* renamed from: s, reason: collision with root package name */
    private Object f4188s;

    public o(Object obj, Object obj2) {
        this.f4187o = obj;
        this.f4188s = obj2;
    }

    public void a(Object obj) {
        this.f4188s = obj;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return J6.r.a(entry.getKey(), getKey()) && J6.r.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f4187o;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f4188s;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        J6.r.b(key);
        int hashCode = key.hashCode() + 527;
        Object value = getValue();
        J6.r.b(value);
        return hashCode + value.hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        a(obj);
        return getValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
