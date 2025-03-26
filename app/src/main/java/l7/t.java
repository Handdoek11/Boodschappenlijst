package l7;

import J6.AbstractC0650j;
import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import m7.K;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public final class t extends h implements Map, K6.a, j$.util.Map {

    /* renamed from: t, reason: collision with root package name */
    public static final a f38875t = new a(null);

    /* renamed from: s, reason: collision with root package name */
    private final Map f38876s;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    static final class b extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final b f38877o = new b();

        b() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            J6.r.e(entry, "<name for destructuring parameter 0>");
            String str = (String) entry.getKey();
            h hVar = (h) entry.getValue();
            StringBuilder sb = new StringBuilder();
            K.c(sb, str);
            sb.append(':');
            sb.append(hVar);
            String sb2 = sb.toString();
            J6.r.d(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Map map) {
        super(null);
        J6.r.e(map, "content");
        this.f38876s = map;
    }

    public boolean b(String str) {
        J6.r.e(str, "key");
        return this.f38876s.containsKey(str);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return b((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof h) {
            return d((h) obj);
        }
        return false;
    }

    public boolean d(h hVar) {
        J6.r.e(hVar, "value");
        return this.f38876s.containsValue(hVar);
    }

    public h e(String str) {
        J6.r.e(str, "key");
        return (h) this.f38876s.get(str);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return j();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return J6.r.a(this.f38876s, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof String) {
            return e((String) obj);
        }
        return null;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f38876s.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f38876s.isEmpty();
    }

    public Set j() {
        return this.f38876s.entrySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return n();
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Set n() {
        return this.f38876s.keySet();
    }

    public int o() {
        return this.f38876s.size();
    }

    public Collection p() {
        return this.f38876s.values();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public h remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return o();
    }

    public String toString() {
        return AbstractC6987o.I(this.f38876s.entrySet(), ",", "{", "}", 0, null, b.f38877o, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return p();
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
