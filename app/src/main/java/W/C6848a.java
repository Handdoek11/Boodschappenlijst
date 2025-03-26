package w;

import J6.r;
import java.util.Map;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6848a implements Map.Entry, K6.a {

    /* renamed from: o, reason: collision with root package name */
    private final Object f44161o;

    /* renamed from: s, reason: collision with root package name */
    private final Object f44162s;

    public C6848a(Object obj, Object obj2) {
        this.f44161o = obj;
        this.f44162s = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && r.a(entry.getKey(), getKey()) && r.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f44161o;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f44162s;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
