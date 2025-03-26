package y6;

import J6.AbstractC0650j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: y6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6975c implements Map, K6.a {

    /* renamed from: o, reason: collision with root package name */
    public static final a f44649o = new a(null);

    /* renamed from: y6.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: y6.c$b */
    static final class b extends J6.s implements I6.l {
        b() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            J6.r.e(entry, "it");
            return AbstractC6975c.this.i(entry);
        }
    }

    protected AbstractC6975c() {
    }

    private final String h(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i(Map.Entry entry) {
        return h(entry.getKey()) + '=' + h(entry.getValue());
    }

    public final boolean b(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        J6.r.c(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object obj = get(key);
        if (!J6.r.a(value, obj)) {
            return false;
        }
        if (obj != null) {
            return true;
        }
        J6.r.c(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            if (J6.r.a(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Set d();

    public abstract Set e();

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return d();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            if (!b((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract int f();

    public abstract Collection g();

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return e();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return f();
    }

    public String toString() {
        return AbstractC6987o.I(entrySet(), ", ", "{", "}", 0, null, new b(), 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return g();
    }
}
