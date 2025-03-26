package y;

import J6.AbstractC0650j;
import J6.r;
import j$.util.Map;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import t.AbstractC6771i;
import t.InterfaceC6773k;
import t.M;
import w.C6849b;
import w.C6857j;

/* loaded from: classes.dex */
public final class d extends C6849b implements Map, K6.a, InterfaceC6773k, j$.util.Map {

    /* renamed from: x, reason: collision with root package name */
    public static final a f44517x = new a(null);

    /* renamed from: y, reason: collision with root package name */
    private static final d f44518y;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final d a() {
            return d.f44518y;
        }

        private a() {
        }
    }

    static {
        C6857j a8 = C6857j.f44174d.a();
        r.c(a8, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>");
        f44518y = new d(a8, 0);
    }

    public d(C6857j c6857j, int i8) {
        super(c6857j, i8);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // w.C6849b, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC6771i) {
            return o((AbstractC6771i) obj);
        }
        return false;
    }

    @Override // y6.AbstractC6975c, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof M) {
            return p((M) obj);
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // w.C6849b, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof AbstractC6771i) {
            return q((AbstractC6771i) obj);
        }
        return null;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC6771i) ? obj2 : r((AbstractC6771i) obj, (M) obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public /* bridge */ boolean o(AbstractC6771i abstractC6771i) {
        return super.containsKey(abstractC6771i);
    }

    public /* bridge */ boolean p(M m8) {
        return super.containsValue(m8);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    public /* bridge */ M q(AbstractC6771i abstractC6771i) {
        return (M) super.get(abstractC6771i);
    }

    public /* bridge */ M r(AbstractC6771i abstractC6771i, M m8) {
        return (M) Map.CC.$default$getOrDefault(this, abstractC6771i, m8);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
