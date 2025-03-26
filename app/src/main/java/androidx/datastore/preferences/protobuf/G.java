package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class G extends LinkedHashMap {

    /* renamed from: s, reason: collision with root package name */
    private static final G f9305s;

    /* renamed from: o, reason: collision with root package name */
    private boolean f9306o;

    static {
        G g8 = new G();
        f9305s = g8;
        g8.q();
    }

    private G() {
        this.f9306o = true;
    }

    static int b(Map map) {
        int i8 = 0;
        for (Map.Entry entry : map.entrySet()) {
            i8 += f(entry.getValue()) ^ f(entry.getKey());
        }
        return i8;
    }

    private static int f(Object obj) {
        return obj instanceof byte[] ? AbstractC0899x.d((byte[]) obj) : obj.hashCode();
    }

    private static void h(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC0899x.a(obj);
            AbstractC0899x.a(map.get(obj));
        }
    }

    public static G i() {
        return f9305s;
    }

    private void k() {
        if (!p()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean l(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static boolean m(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !l(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        k();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return b(this);
    }

    public boolean p() {
        return this.f9306o;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        k();
        AbstractC0899x.a(obj);
        AbstractC0899x.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        k();
        h(map);
        super.putAll(map);
    }

    public void q() {
        this.f9306o = false;
    }

    public void r(G g8) {
        k();
        if (g8.isEmpty()) {
            return;
        }
        putAll(g8);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        k();
        return super.remove(obj);
    }

    public G s() {
        return isEmpty() ? new G() : new G(this);
    }

    private G(Map map) {
        super(map);
        this.f9306o = true;
    }
}
