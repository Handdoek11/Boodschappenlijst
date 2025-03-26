package N5;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class g implements Map, K6.d {

    /* renamed from: o, reason: collision with root package name */
    private final Map f4173o = new LinkedHashMap();

    static final class a extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final a f4174o = new a();

        a() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map.Entry invoke(Map.Entry entry) {
            J6.r.e(entry, "$this$$receiver");
            return new o(((h) entry.getKey()).a(), entry.getValue());
        }
    }

    static final class b extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final b f4175o = new b();

        b() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map.Entry invoke(Map.Entry entry) {
            J6.r.e(entry, "$this$$receiver");
            return new o(w.a((String) entry.getKey()), entry.getValue());
        }
    }

    static final class c extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final c f4176o = new c();

        c() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(h hVar) {
            J6.r.e(hVar, "$this$$receiver");
            return hVar.a();
        }
    }

    static final class d extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final d f4177o = new d();

        d() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h invoke(String str) {
            J6.r.e(str, "$this$$receiver");
            return w.a(str);
        }
    }

    public boolean a(String str) {
        J6.r.e(str, "key");
        return this.f4173o.containsKey(new h(str));
    }

    public Object b(String str) {
        J6.r.e(str, "key");
        return this.f4173o.get(w.a(str));
    }

    @Override // java.util.Map
    public void clear() {
        this.f4173o.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return a((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f4173o.containsValue(obj);
    }

    public Set d() {
        return new n(this.f4173o.entrySet(), a.f4174o, b.f4175o);
    }

    public Set e() {
        return new n(this.f4173o.keySet(), c.f4176o, d.f4177o);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return d();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        return J6.r.a(((g) obj).f4173o, this.f4173o);
    }

    public int f() {
        return this.f4173o.size();
    }

    public Collection g() {
        return this.f4173o.values();
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return b((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object put(String str, Object obj) {
        J6.r.e(str, "key");
        J6.r.e(obj, "value");
        return this.f4173o.put(w.a(str), obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f4173o.hashCode();
    }

    public Object i(String str) {
        J6.r.e(str, "key");
        return this.f4173o.remove(w.a(str));
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f4173o.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return e();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        J6.r.e(map, "from");
        for (Map.Entry entry : map.entrySet()) {
            put((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof String) {
            return i((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return g();
    }
}
